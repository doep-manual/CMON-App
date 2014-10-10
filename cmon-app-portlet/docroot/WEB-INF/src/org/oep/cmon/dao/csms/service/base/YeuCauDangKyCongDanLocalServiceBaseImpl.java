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

package org.oep.cmon.dao.csms.service.base;

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

import org.oep.cmon.dao.csms.model.YeuCauDangKyCongDan;
import org.oep.cmon.dao.csms.service.AnhChanDungYeuCauDangKyCongDanLocalService;
import org.oep.cmon.dao.csms.service.YeuCauDangKyCongDanLocalService;
import org.oep.cmon.dao.csms.service.persistence.AnhChanDungYeuCauDangKyCongDanPersistence;
import org.oep.cmon.dao.csms.service.persistence.YeuCauDangKyCongDanFinder;
import org.oep.cmon.dao.csms.service.persistence.YeuCauDangKyCongDanPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the yeu cau dang ky cong dan local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.csms.service.impl.YeuCauDangKyCongDanLocalServiceImpl}.
 * </p>
 *
 * @author NAM
 * @see org.oep.cmon.dao.csms.service.impl.YeuCauDangKyCongDanLocalServiceImpl
 * @see org.oep.cmon.dao.csms.service.YeuCauDangKyCongDanLocalServiceUtil
 * @generated
 */
public abstract class YeuCauDangKyCongDanLocalServiceBaseImpl
	implements YeuCauDangKyCongDanLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.csms.service.YeuCauDangKyCongDanLocalServiceUtil} to access the yeu cau dang ky cong dan local service.
	 */

	/**
	 * Adds the yeu cau dang ky cong dan to the database. Also notifies the appropriate model listeners.
	 *
	 * @param yeuCauDangKyCongDan the yeu cau dang ky cong dan
	 * @return the yeu cau dang ky cong dan that was added
	 * @throws SystemException if a system exception occurred
	 */
	public YeuCauDangKyCongDan addYeuCauDangKyCongDan(
		YeuCauDangKyCongDan yeuCauDangKyCongDan) throws SystemException {
		yeuCauDangKyCongDan.setNew(true);

		yeuCauDangKyCongDan = yeuCauDangKyCongDanPersistence.update(yeuCauDangKyCongDan,
				false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(yeuCauDangKyCongDan);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return yeuCauDangKyCongDan;
	}

	/**
	 * Creates a new yeu cau dang ky cong dan with the primary key. Does not add the yeu cau dang ky cong dan to the database.
	 *
	 * @param id the primary key for the new yeu cau dang ky cong dan
	 * @return the new yeu cau dang ky cong dan
	 */
	public YeuCauDangKyCongDan createYeuCauDangKyCongDan(long id) {
		return yeuCauDangKyCongDanPersistence.create(id);
	}

	/**
	 * Deletes the yeu cau dang ky cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the yeu cau dang ky cong dan
	 * @throws PortalException if a yeu cau dang ky cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteYeuCauDangKyCongDan(long id)
		throws PortalException, SystemException {
		YeuCauDangKyCongDan yeuCauDangKyCongDan = yeuCauDangKyCongDanPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(yeuCauDangKyCongDan);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the yeu cau dang ky cong dan from the database. Also notifies the appropriate model listeners.
	 *
	 * @param yeuCauDangKyCongDan the yeu cau dang ky cong dan
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteYeuCauDangKyCongDan(
		YeuCauDangKyCongDan yeuCauDangKyCongDan) throws SystemException {
		yeuCauDangKyCongDanPersistence.remove(yeuCauDangKyCongDan);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(yeuCauDangKyCongDan);
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
		return yeuCauDangKyCongDanPersistence.findWithDynamicQuery(dynamicQuery);
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
		return yeuCauDangKyCongDanPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
		return yeuCauDangKyCongDanPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return yeuCauDangKyCongDanPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public YeuCauDangKyCongDan fetchYeuCauDangKyCongDan(long id)
		throws SystemException {
		return yeuCauDangKyCongDanPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the yeu cau dang ky cong dan with the primary key.
	 *
	 * @param id the primary key of the yeu cau dang ky cong dan
	 * @return the yeu cau dang ky cong dan
	 * @throws PortalException if a yeu cau dang ky cong dan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public YeuCauDangKyCongDan getYeuCauDangKyCongDan(long id)
		throws PortalException, SystemException {
		return yeuCauDangKyCongDanPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return yeuCauDangKyCongDanPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the yeu cau dang ky cong dans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of yeu cau dang ky cong dans
	 * @param end the upper bound of the range of yeu cau dang ky cong dans (not inclusive)
	 * @return the range of yeu cau dang ky cong dans
	 * @throws SystemException if a system exception occurred
	 */
	public List<YeuCauDangKyCongDan> getYeuCauDangKyCongDans(int start, int end)
		throws SystemException {
		return yeuCauDangKyCongDanPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of yeu cau dang ky cong dans.
	 *
	 * @return the number of yeu cau dang ky cong dans
	 * @throws SystemException if a system exception occurred
	 */
	public int getYeuCauDangKyCongDansCount() throws SystemException {
		return yeuCauDangKyCongDanPersistence.countAll();
	}

	/**
	 * Updates the yeu cau dang ky cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param yeuCauDangKyCongDan the yeu cau dang ky cong dan
	 * @return the yeu cau dang ky cong dan that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public YeuCauDangKyCongDan updateYeuCauDangKyCongDan(
		YeuCauDangKyCongDan yeuCauDangKyCongDan) throws SystemException {
		return updateYeuCauDangKyCongDan(yeuCauDangKyCongDan, true);
	}

	/**
	 * Updates the yeu cau dang ky cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param yeuCauDangKyCongDan the yeu cau dang ky cong dan
	 * @param merge whether to merge the yeu cau dang ky cong dan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the yeu cau dang ky cong dan that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public YeuCauDangKyCongDan updateYeuCauDangKyCongDan(
		YeuCauDangKyCongDan yeuCauDangKyCongDan, boolean merge)
		throws SystemException {
		yeuCauDangKyCongDan.setNew(false);

		yeuCauDangKyCongDan = yeuCauDangKyCongDanPersistence.update(yeuCauDangKyCongDan,
				merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(yeuCauDangKyCongDan);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return yeuCauDangKyCongDan;
	}

	/**
	 * Returns the anh chan dung yeu cau dang ky cong dan local service.
	 *
	 * @return the anh chan dung yeu cau dang ky cong dan local service
	 */
	public AnhChanDungYeuCauDangKyCongDanLocalService getAnhChanDungYeuCauDangKyCongDanLocalService() {
		return anhChanDungYeuCauDangKyCongDanLocalService;
	}

	/**
	 * Sets the anh chan dung yeu cau dang ky cong dan local service.
	 *
	 * @param anhChanDungYeuCauDangKyCongDanLocalService the anh chan dung yeu cau dang ky cong dan local service
	 */
	public void setAnhChanDungYeuCauDangKyCongDanLocalService(
		AnhChanDungYeuCauDangKyCongDanLocalService anhChanDungYeuCauDangKyCongDanLocalService) {
		this.anhChanDungYeuCauDangKyCongDanLocalService = anhChanDungYeuCauDangKyCongDanLocalService;
	}

	/**
	 * Returns the anh chan dung yeu cau dang ky cong dan persistence.
	 *
	 * @return the anh chan dung yeu cau dang ky cong dan persistence
	 */
	public AnhChanDungYeuCauDangKyCongDanPersistence getAnhChanDungYeuCauDangKyCongDanPersistence() {
		return anhChanDungYeuCauDangKyCongDanPersistence;
	}

	/**
	 * Sets the anh chan dung yeu cau dang ky cong dan persistence.
	 *
	 * @param anhChanDungYeuCauDangKyCongDanPersistence the anh chan dung yeu cau dang ky cong dan persistence
	 */
	public void setAnhChanDungYeuCauDangKyCongDanPersistence(
		AnhChanDungYeuCauDangKyCongDanPersistence anhChanDungYeuCauDangKyCongDanPersistence) {
		this.anhChanDungYeuCauDangKyCongDanPersistence = anhChanDungYeuCauDangKyCongDanPersistence;
	}

	/**
	 * Returns the yeu cau dang ky cong dan local service.
	 *
	 * @return the yeu cau dang ky cong dan local service
	 */
	public YeuCauDangKyCongDanLocalService getYeuCauDangKyCongDanLocalService() {
		return yeuCauDangKyCongDanLocalService;
	}

	/**
	 * Sets the yeu cau dang ky cong dan local service.
	 *
	 * @param yeuCauDangKyCongDanLocalService the yeu cau dang ky cong dan local service
	 */
	public void setYeuCauDangKyCongDanLocalService(
		YeuCauDangKyCongDanLocalService yeuCauDangKyCongDanLocalService) {
		this.yeuCauDangKyCongDanLocalService = yeuCauDangKyCongDanLocalService;
	}

	/**
	 * Returns the yeu cau dang ky cong dan persistence.
	 *
	 * @return the yeu cau dang ky cong dan persistence
	 */
	public YeuCauDangKyCongDanPersistence getYeuCauDangKyCongDanPersistence() {
		return yeuCauDangKyCongDanPersistence;
	}

	/**
	 * Sets the yeu cau dang ky cong dan persistence.
	 *
	 * @param yeuCauDangKyCongDanPersistence the yeu cau dang ky cong dan persistence
	 */
	public void setYeuCauDangKyCongDanPersistence(
		YeuCauDangKyCongDanPersistence yeuCauDangKyCongDanPersistence) {
		this.yeuCauDangKyCongDanPersistence = yeuCauDangKyCongDanPersistence;
	}

	/**
	 * Returns the yeu cau dang ky cong dan finder.
	 *
	 * @return the yeu cau dang ky cong dan finder
	 */
	public YeuCauDangKyCongDanFinder getYeuCauDangKyCongDanFinder() {
		return yeuCauDangKyCongDanFinder;
	}

	/**
	 * Sets the yeu cau dang ky cong dan finder.
	 *
	 * @param yeuCauDangKyCongDanFinder the yeu cau dang ky cong dan finder
	 */
	public void setYeuCauDangKyCongDanFinder(
		YeuCauDangKyCongDanFinder yeuCauDangKyCongDanFinder) {
		this.yeuCauDangKyCongDanFinder = yeuCauDangKyCongDanFinder;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.csms.model.YeuCauDangKyCongDan",
			yeuCauDangKyCongDanLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.csms.model.YeuCauDangKyCongDan");
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
		return YeuCauDangKyCongDan.class;
	}

	protected String getModelClassName() {
		return YeuCauDangKyCongDan.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = yeuCauDangKyCongDanPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AnhChanDungYeuCauDangKyCongDanLocalService.class)
	protected AnhChanDungYeuCauDangKyCongDanLocalService anhChanDungYeuCauDangKyCongDanLocalService;
	@BeanReference(type = AnhChanDungYeuCauDangKyCongDanPersistence.class)
	protected AnhChanDungYeuCauDangKyCongDanPersistence anhChanDungYeuCauDangKyCongDanPersistence;
	@BeanReference(type = YeuCauDangKyCongDanLocalService.class)
	protected YeuCauDangKyCongDanLocalService yeuCauDangKyCongDanLocalService;
	@BeanReference(type = YeuCauDangKyCongDanPersistence.class)
	protected YeuCauDangKyCongDanPersistence yeuCauDangKyCongDanPersistence;
	@BeanReference(type = YeuCauDangKyCongDanFinder.class)
	protected YeuCauDangKyCongDanFinder yeuCauDangKyCongDanFinder;
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
	private static Log _log = LogFactoryUtil.getLog(YeuCauDangKyCongDanLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}