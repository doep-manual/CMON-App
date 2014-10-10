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

package org.oep.cmon.dao.chungthuc.service.base;

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

import org.oep.cmon.dao.chungthuc.model.SoDanhMuc;
import org.oep.cmon.dao.chungthuc.service.HoSoChungThucLocalService;
import org.oep.cmon.dao.chungthuc.service.SoDanhMucLocalService;
import org.oep.cmon.dao.chungthuc.service.ThanhPhanHoSoChungThucLocalService;
import org.oep.cmon.dao.chungthuc.service.persistence.HoSoChungThucFinder;
import org.oep.cmon.dao.chungthuc.service.persistence.HoSoChungThucPersistence;
import org.oep.cmon.dao.chungthuc.service.persistence.SoDanhMucPersistence;
import org.oep.cmon.dao.chungthuc.service.persistence.ThanhPhanHoSoChungThucPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the so danh muc local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.chungthuc.service.impl.SoDanhMucLocalServiceImpl}.
 * </p>
 *
 * @author vietho
 * @see org.oep.cmon.dao.chungthuc.service.impl.SoDanhMucLocalServiceImpl
 * @see org.oep.cmon.dao.chungthuc.service.SoDanhMucLocalServiceUtil
 * @generated
 */
public abstract class SoDanhMucLocalServiceBaseImpl
	implements SoDanhMucLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.chungthuc.service.SoDanhMucLocalServiceUtil} to access the so danh muc local service.
	 */

	/**
	 * Adds the so danh muc to the database. Also notifies the appropriate model listeners.
	 *
	 * @param soDanhMuc the so danh muc
	 * @return the so danh muc that was added
	 * @throws SystemException if a system exception occurred
	 */
	public SoDanhMuc addSoDanhMuc(SoDanhMuc soDanhMuc)
		throws SystemException {
		soDanhMuc.setNew(true);

		soDanhMuc = soDanhMucPersistence.update(soDanhMuc, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(soDanhMuc);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return soDanhMuc;
	}

	/**
	 * Creates a new so danh muc with the primary key. Does not add the so danh muc to the database.
	 *
	 * @param id the primary key for the new so danh muc
	 * @return the new so danh muc
	 */
	public SoDanhMuc createSoDanhMuc(long id) {
		return soDanhMucPersistence.create(id);
	}

	/**
	 * Deletes the so danh muc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the so danh muc
	 * @throws PortalException if a so danh muc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSoDanhMuc(long id)
		throws PortalException, SystemException {
		SoDanhMuc soDanhMuc = soDanhMucPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(soDanhMuc);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the so danh muc from the database. Also notifies the appropriate model listeners.
	 *
	 * @param soDanhMuc the so danh muc
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSoDanhMuc(SoDanhMuc soDanhMuc) throws SystemException {
		soDanhMucPersistence.remove(soDanhMuc);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(soDanhMuc);
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
		return soDanhMucPersistence.findWithDynamicQuery(dynamicQuery);
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
		return soDanhMucPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return soDanhMucPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return soDanhMucPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public SoDanhMuc fetchSoDanhMuc(long id) throws SystemException {
		return soDanhMucPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the so danh muc with the primary key.
	 *
	 * @param id the primary key of the so danh muc
	 * @return the so danh muc
	 * @throws PortalException if a so danh muc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SoDanhMuc getSoDanhMuc(long id)
		throws PortalException, SystemException {
		return soDanhMucPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return soDanhMucPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the so danh mucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of so danh mucs
	 * @param end the upper bound of the range of so danh mucs (not inclusive)
	 * @return the range of so danh mucs
	 * @throws SystemException if a system exception occurred
	 */
	public List<SoDanhMuc> getSoDanhMucs(int start, int end)
		throws SystemException {
		return soDanhMucPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of so danh mucs.
	 *
	 * @return the number of so danh mucs
	 * @throws SystemException if a system exception occurred
	 */
	public int getSoDanhMucsCount() throws SystemException {
		return soDanhMucPersistence.countAll();
	}

	/**
	 * Updates the so danh muc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param soDanhMuc the so danh muc
	 * @return the so danh muc that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public SoDanhMuc updateSoDanhMuc(SoDanhMuc soDanhMuc)
		throws SystemException {
		return updateSoDanhMuc(soDanhMuc, true);
	}

	/**
	 * Updates the so danh muc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param soDanhMuc the so danh muc
	 * @param merge whether to merge the so danh muc with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the so danh muc that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public SoDanhMuc updateSoDanhMuc(SoDanhMuc soDanhMuc, boolean merge)
		throws SystemException {
		soDanhMuc.setNew(false);

		soDanhMuc = soDanhMucPersistence.update(soDanhMuc, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(soDanhMuc);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return soDanhMuc;
	}

	/**
	 * Returns the ho so chung thuc local service.
	 *
	 * @return the ho so chung thuc local service
	 */
	public HoSoChungThucLocalService getHoSoChungThucLocalService() {
		return hoSoChungThucLocalService;
	}

	/**
	 * Sets the ho so chung thuc local service.
	 *
	 * @param hoSoChungThucLocalService the ho so chung thuc local service
	 */
	public void setHoSoChungThucLocalService(
		HoSoChungThucLocalService hoSoChungThucLocalService) {
		this.hoSoChungThucLocalService = hoSoChungThucLocalService;
	}

	/**
	 * Returns the ho so chung thuc persistence.
	 *
	 * @return the ho so chung thuc persistence
	 */
	public HoSoChungThucPersistence getHoSoChungThucPersistence() {
		return hoSoChungThucPersistence;
	}

	/**
	 * Sets the ho so chung thuc persistence.
	 *
	 * @param hoSoChungThucPersistence the ho so chung thuc persistence
	 */
	public void setHoSoChungThucPersistence(
		HoSoChungThucPersistence hoSoChungThucPersistence) {
		this.hoSoChungThucPersistence = hoSoChungThucPersistence;
	}

	/**
	 * Returns the ho so chung thuc finder.
	 *
	 * @return the ho so chung thuc finder
	 */
	public HoSoChungThucFinder getHoSoChungThucFinder() {
		return hoSoChungThucFinder;
	}

	/**
	 * Sets the ho so chung thuc finder.
	 *
	 * @param hoSoChungThucFinder the ho so chung thuc finder
	 */
	public void setHoSoChungThucFinder(HoSoChungThucFinder hoSoChungThucFinder) {
		this.hoSoChungThucFinder = hoSoChungThucFinder;
	}

	/**
	 * Returns the so danh muc local service.
	 *
	 * @return the so danh muc local service
	 */
	public SoDanhMucLocalService getSoDanhMucLocalService() {
		return soDanhMucLocalService;
	}

	/**
	 * Sets the so danh muc local service.
	 *
	 * @param soDanhMucLocalService the so danh muc local service
	 */
	public void setSoDanhMucLocalService(
		SoDanhMucLocalService soDanhMucLocalService) {
		this.soDanhMucLocalService = soDanhMucLocalService;
	}

	/**
	 * Returns the so danh muc persistence.
	 *
	 * @return the so danh muc persistence
	 */
	public SoDanhMucPersistence getSoDanhMucPersistence() {
		return soDanhMucPersistence;
	}

	/**
	 * Sets the so danh muc persistence.
	 *
	 * @param soDanhMucPersistence the so danh muc persistence
	 */
	public void setSoDanhMucPersistence(
		SoDanhMucPersistence soDanhMucPersistence) {
		this.soDanhMucPersistence = soDanhMucPersistence;
	}

	/**
	 * Returns the thanh phan ho so chung thuc local service.
	 *
	 * @return the thanh phan ho so chung thuc local service
	 */
	public ThanhPhanHoSoChungThucLocalService getThanhPhanHoSoChungThucLocalService() {
		return thanhPhanHoSoChungThucLocalService;
	}

	/**
	 * Sets the thanh phan ho so chung thuc local service.
	 *
	 * @param thanhPhanHoSoChungThucLocalService the thanh phan ho so chung thuc local service
	 */
	public void setThanhPhanHoSoChungThucLocalService(
		ThanhPhanHoSoChungThucLocalService thanhPhanHoSoChungThucLocalService) {
		this.thanhPhanHoSoChungThucLocalService = thanhPhanHoSoChungThucLocalService;
	}

	/**
	 * Returns the thanh phan ho so chung thuc persistence.
	 *
	 * @return the thanh phan ho so chung thuc persistence
	 */
	public ThanhPhanHoSoChungThucPersistence getThanhPhanHoSoChungThucPersistence() {
		return thanhPhanHoSoChungThucPersistence;
	}

	/**
	 * Sets the thanh phan ho so chung thuc persistence.
	 *
	 * @param thanhPhanHoSoChungThucPersistence the thanh phan ho so chung thuc persistence
	 */
	public void setThanhPhanHoSoChungThucPersistence(
		ThanhPhanHoSoChungThucPersistence thanhPhanHoSoChungThucPersistence) {
		this.thanhPhanHoSoChungThucPersistence = thanhPhanHoSoChungThucPersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.chungthuc.model.SoDanhMuc",
			soDanhMucLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.chungthuc.model.SoDanhMuc");
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
		return SoDanhMuc.class;
	}

	protected String getModelClassName() {
		return SoDanhMuc.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = soDanhMucPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = HoSoChungThucLocalService.class)
	protected HoSoChungThucLocalService hoSoChungThucLocalService;
	@BeanReference(type = HoSoChungThucPersistence.class)
	protected HoSoChungThucPersistence hoSoChungThucPersistence;
	@BeanReference(type = HoSoChungThucFinder.class)
	protected HoSoChungThucFinder hoSoChungThucFinder;
	@BeanReference(type = SoDanhMucLocalService.class)
	protected SoDanhMucLocalService soDanhMucLocalService;
	@BeanReference(type = SoDanhMucPersistence.class)
	protected SoDanhMucPersistence soDanhMucPersistence;
	@BeanReference(type = ThanhPhanHoSoChungThucLocalService.class)
	protected ThanhPhanHoSoChungThucLocalService thanhPhanHoSoChungThucLocalService;
	@BeanReference(type = ThanhPhanHoSoChungThucPersistence.class)
	protected ThanhPhanHoSoChungThucPersistence thanhPhanHoSoChungThucPersistence;
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
	private static Log _log = LogFactoryUtil.getLog(SoDanhMucLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}