/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.dlms.dao.danhmucgiaypheplaixe.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;


import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.oep.dlms.dao.danhmucgiaypheplaixe.model.DonViGtvt;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.DonViGtvtLocalService;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.HangGiayPhepLaiXeLocalService;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.LyDoCapDoiCapLaiGPLXLocalService;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.persistence.DonViGtvtPersistence;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.persistence.HangGiayPhepLaiXePersistence;
import org.oep.dlms.dao.danhmucgiaypheplaixe.service.persistence.LyDoCapDoiCapLaiGPLXPersistence;

/**
 * The base implementation of the don vi gtvt local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.dlms.dao.danhmucgiaypheplaixe.service.impl.DonViGtvtLocalServiceImpl}.
 * </p>
 *
 * @author AnhNT
 * @see org.oep.dlms.dao.danhmucgiaypheplaixe.service.impl.DonViGtvtLocalServiceImpl
 * @see org.oep.dlms.dao.danhmucgiaypheplaixe.service.DonViGtvtLocalServiceUtil
 * @generated
 */
public abstract class DonViGtvtLocalServiceBaseImpl
	implements DonViGtvtLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.dlms.dao.danhmucgiaypheplaixe.service.DonViGtvtLocalServiceUtil} to access the don vi gtvt local service.
	 */

	/**
	 * Adds the don vi gtvt to the database. Also notifies the appropriate model listeners.
	 *
	 * @param donViGtvt the don vi gtvt
	 * @return the don vi gtvt that was added
	 * @throws SystemException if a system exception occurred
	 */
	public DonViGtvt addDonViGtvt(DonViGtvt donViGtvt)
		throws SystemException {
		donViGtvt.setNew(true);

		donViGtvt = donViGtvtPersistence.update(donViGtvt, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(donViGtvt);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return donViGtvt;
	}

	/**
	 * Creates a new don vi gtvt with the primary key. Does not add the don vi gtvt to the database.
	 *
	 * @param id the primary key for the new don vi gtvt
	 * @return the new don vi gtvt
	 */
	public DonViGtvt createDonViGtvt(long id) {
		return donViGtvtPersistence.create(id);
	}

	/**
	 * Deletes the don vi gtvt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the don vi gtvt
	 * @throws PortalException if a don vi gtvt with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDonViGtvt(long id)
		throws PortalException, SystemException {
		DonViGtvt donViGtvt = donViGtvtPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(donViGtvt);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the don vi gtvt from the database. Also notifies the appropriate model listeners.
	 *
	 * @param donViGtvt the don vi gtvt
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDonViGtvt(DonViGtvt donViGtvt) throws SystemException {
		donViGtvtPersistence.remove(donViGtvt);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(donViGtvt);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return donViGtvtPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return donViGtvtPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return donViGtvtPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return donViGtvtPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public DonViGtvt fetchDonViGtvt(long id) throws SystemException {
		return donViGtvtPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the don vi gtvt with the primary key.
	 *
	 * @param id the primary key of the don vi gtvt
	 * @return the don vi gtvt
	 * @throws PortalException if a don vi gtvt with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DonViGtvt getDonViGtvt(long id)
		throws PortalException, SystemException {
		return donViGtvtPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return donViGtvtPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the don vi gtvts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of don vi gtvts
	 * @param end the upper bound of the range of don vi gtvts (not inclusive)
	 * @return the range of don vi gtvts
	 * @throws SystemException if a system exception occurred
	 */
	public List<DonViGtvt> getDonViGtvts(int start, int end)
		throws SystemException {
		return donViGtvtPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of don vi gtvts.
	 *
	 * @return the number of don vi gtvts
	 * @throws SystemException if a system exception occurred
	 */
	public int getDonViGtvtsCount() throws SystemException {
		return donViGtvtPersistence.countAll();
	}

	/**
	 * Updates the don vi gtvt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param donViGtvt the don vi gtvt
	 * @return the don vi gtvt that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DonViGtvt updateDonViGtvt(DonViGtvt donViGtvt)
		throws SystemException {
		return updateDonViGtvt(donViGtvt, true);
	}

	/**
	 * Updates the don vi gtvt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param donViGtvt the don vi gtvt
	 * @param merge whether to merge the don vi gtvt with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the don vi gtvt that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DonViGtvt updateDonViGtvt(DonViGtvt donViGtvt, boolean merge)
		throws SystemException {
		donViGtvt.setNew(false);

		donViGtvt = donViGtvtPersistence.update(donViGtvt, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(donViGtvt);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return donViGtvt;
	}

	/**
	 * Returns the don vi gtvt local service.
	 *
	 * @return the don vi gtvt local service
	 */
	public DonViGtvtLocalService getDonViGtvtLocalService() {
		return donViGtvtLocalService;
	}

	/**
	 * Sets the don vi gtvt local service.
	 *
	 * @param donViGtvtLocalService the don vi gtvt local service
	 */
	public void setDonViGtvtLocalService(
		DonViGtvtLocalService donViGtvtLocalService) {
		this.donViGtvtLocalService = donViGtvtLocalService;
	}

	/**
	 * Returns the don vi gtvt persistence.
	 *
	 * @return the don vi gtvt persistence
	 */
	public DonViGtvtPersistence getDonViGtvtPersistence() {
		return donViGtvtPersistence;
	}

	/**
	 * Sets the don vi gtvt persistence.
	 *
	 * @param donViGtvtPersistence the don vi gtvt persistence
	 */
	public void setDonViGtvtPersistence(
		DonViGtvtPersistence donViGtvtPersistence) {
		this.donViGtvtPersistence = donViGtvtPersistence;
	}

	/**
	 * Returns the hang giay phep lai xe local service.
	 *
	 * @return the hang giay phep lai xe local service
	 */
	public HangGiayPhepLaiXeLocalService getHangGiayPhepLaiXeLocalService() {
		return hangGiayPhepLaiXeLocalService;
	}

	/**
	 * Sets the hang giay phep lai xe local service.
	 *
	 * @param hangGiayPhepLaiXeLocalService the hang giay phep lai xe local service
	 */
	public void setHangGiayPhepLaiXeLocalService(
		HangGiayPhepLaiXeLocalService hangGiayPhepLaiXeLocalService) {
		this.hangGiayPhepLaiXeLocalService = hangGiayPhepLaiXeLocalService;
	}

	/**
	 * Returns the hang giay phep lai xe persistence.
	 *
	 * @return the hang giay phep lai xe persistence
	 */
	public HangGiayPhepLaiXePersistence getHangGiayPhepLaiXePersistence() {
		return hangGiayPhepLaiXePersistence;
	}

	/**
	 * Sets the hang giay phep lai xe persistence.
	 *
	 * @param hangGiayPhepLaiXePersistence the hang giay phep lai xe persistence
	 */
	public void setHangGiayPhepLaiXePersistence(
		HangGiayPhepLaiXePersistence hangGiayPhepLaiXePersistence) {
		this.hangGiayPhepLaiXePersistence = hangGiayPhepLaiXePersistence;
	}

	/**
	 * Returns the ly do cap doi cap lai g p l x local service.
	 *
	 * @return the ly do cap doi cap lai g p l x local service
	 */
	public LyDoCapDoiCapLaiGPLXLocalService getLyDoCapDoiCapLaiGPLXLocalService() {
		return lyDoCapDoiCapLaiGPLXLocalService;
	}

	/**
	 * Sets the ly do cap doi cap lai g p l x local service.
	 *
	 * @param lyDoCapDoiCapLaiGPLXLocalService the ly do cap doi cap lai g p l x local service
	 */
	public void setLyDoCapDoiCapLaiGPLXLocalService(
		LyDoCapDoiCapLaiGPLXLocalService lyDoCapDoiCapLaiGPLXLocalService) {
		this.lyDoCapDoiCapLaiGPLXLocalService = lyDoCapDoiCapLaiGPLXLocalService;
	}

	/**
	 * Returns the ly do cap doi cap lai g p l x persistence.
	 *
	 * @return the ly do cap doi cap lai g p l x persistence
	 */
	public LyDoCapDoiCapLaiGPLXPersistence getLyDoCapDoiCapLaiGPLXPersistence() {
		return lyDoCapDoiCapLaiGPLXPersistence;
	}

	/**
	 * Sets the ly do cap doi cap lai g p l x persistence.
	 *
	 * @param lyDoCapDoiCapLaiGPLXPersistence the ly do cap doi cap lai g p l x persistence
	 */
	public void setLyDoCapDoiCapLaiGPLXPersistence(
		LyDoCapDoiCapLaiGPLXPersistence lyDoCapDoiCapLaiGPLXPersistence) {
		this.lyDoCapDoiCapLaiGPLXPersistence = lyDoCapDoiCapLaiGPLXPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.dlms.dao.danhmucgiaypheplaixe.model.DonViGtvt",
			donViGtvtLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.dlms.dao.danhmucgiaypheplaixe.model.DonViGtvt");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	protected Class<?> getModelClass() {
		return DonViGtvt.class;
	}

	protected String getModelClassName() {
		return DonViGtvt.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = donViGtvtPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = DonViGtvtLocalService.class)
	protected DonViGtvtLocalService donViGtvtLocalService;
	@BeanReference(type = DonViGtvtPersistence.class)
	protected DonViGtvtPersistence donViGtvtPersistence;
	@BeanReference(type = HangGiayPhepLaiXeLocalService.class)
	protected HangGiayPhepLaiXeLocalService hangGiayPhepLaiXeLocalService;
	@BeanReference(type = HangGiayPhepLaiXePersistence.class)
	protected HangGiayPhepLaiXePersistence hangGiayPhepLaiXePersistence;
	@BeanReference(type = LyDoCapDoiCapLaiGPLXLocalService.class)
	protected LyDoCapDoiCapLaiGPLXLocalService lyDoCapDoiCapLaiGPLXLocalService;
	@BeanReference(type = LyDoCapDoiCapLaiGPLXPersistence.class)
	protected LyDoCapDoiCapLaiGPLXPersistence lyDoCapDoiCapLaiGPLXPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static Log _log = LogFactoryUtil.getLog(DonViGtvtLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}