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

package org.oep.cmon.dao.touchscreen.service.base;

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

import org.oep.cmon.dao.touchscreen.model.TouchScreen;
import org.oep.cmon.dao.touchscreen.service.TouchScreenLocalService;
import org.oep.cmon.dao.touchscreen.service.TraCuuHoSoTTHCCongLocalService;
import org.oep.cmon.dao.touchscreen.service.TraCuuThuTucHanhChinhLocalService;
import org.oep.cmon.dao.touchscreen.service.persistence.TouchScreenFinder;
import org.oep.cmon.dao.touchscreen.service.persistence.TouchScreenPersistence;
import org.oep.cmon.dao.touchscreen.service.persistence.TraCuuHoSoTTHCCongPersistence;
import org.oep.cmon.dao.touchscreen.service.persistence.TraCuuThuTucHanhChinhPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the touch screen local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.touchscreen.service.impl.TouchScreenLocalServiceImpl}.
 * </p>
 *
 * @author VIENPN
 * @see org.oep.cmon.dao.touchscreen.service.impl.TouchScreenLocalServiceImpl
 * @see org.oep.cmon.dao.touchscreen.service.TouchScreenLocalServiceUtil
 * @generated
 */
public abstract class TouchScreenLocalServiceBaseImpl
	implements TouchScreenLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.touchscreen.service.TouchScreenLocalServiceUtil} to access the touch screen local service.
	 */

	/**
	 * Adds the touch screen to the database. Also notifies the appropriate model listeners.
	 *
	 * @param touchScreen the touch screen
	 * @return the touch screen that was added
	 * @throws SystemException if a system exception occurred
	 */
	public TouchScreen addTouchScreen(TouchScreen touchScreen)
		throws SystemException {
		touchScreen.setNew(true);

		touchScreen = touchScreenPersistence.update(touchScreen, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(touchScreen);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return touchScreen;
	}

	/**
	 * Creates a new touch screen with the primary key. Does not add the touch screen to the database.
	 *
	 * @param ID the primary key for the new touch screen
	 * @return the new touch screen
	 */
	public TouchScreen createTouchScreen(long ID) {
		return touchScreenPersistence.create(ID);
	}

	/**
	 * Deletes the touch screen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the touch screen
	 * @throws PortalException if a touch screen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTouchScreen(long ID)
		throws PortalException, SystemException {
		TouchScreen touchScreen = touchScreenPersistence.remove(ID);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(touchScreen);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the touch screen from the database. Also notifies the appropriate model listeners.
	 *
	 * @param touchScreen the touch screen
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTouchScreen(TouchScreen touchScreen)
		throws SystemException {
		touchScreenPersistence.remove(touchScreen);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(touchScreen);
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
		return touchScreenPersistence.findWithDynamicQuery(dynamicQuery);
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
		return touchScreenPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return touchScreenPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return touchScreenPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public TouchScreen fetchTouchScreen(long ID) throws SystemException {
		return touchScreenPersistence.fetchByPrimaryKey(ID);
	}

	/**
	 * Returns the touch screen with the primary key.
	 *
	 * @param ID the primary key of the touch screen
	 * @return the touch screen
	 * @throws PortalException if a touch screen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TouchScreen getTouchScreen(long ID)
		throws PortalException, SystemException {
		return touchScreenPersistence.findByPrimaryKey(ID);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return touchScreenPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the touch screens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of touch screens
	 * @param end the upper bound of the range of touch screens (not inclusive)
	 * @return the range of touch screens
	 * @throws SystemException if a system exception occurred
	 */
	public List<TouchScreen> getTouchScreens(int start, int end)
		throws SystemException {
		return touchScreenPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of touch screens.
	 *
	 * @return the number of touch screens
	 * @throws SystemException if a system exception occurred
	 */
	public int getTouchScreensCount() throws SystemException {
		return touchScreenPersistence.countAll();
	}

	/**
	 * Updates the touch screen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param touchScreen the touch screen
	 * @return the touch screen that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TouchScreen updateTouchScreen(TouchScreen touchScreen)
		throws SystemException {
		return updateTouchScreen(touchScreen, true);
	}

	/**
	 * Updates the touch screen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param touchScreen the touch screen
	 * @param merge whether to merge the touch screen with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the touch screen that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TouchScreen updateTouchScreen(TouchScreen touchScreen, boolean merge)
		throws SystemException {
		touchScreen.setNew(false);

		touchScreen = touchScreenPersistence.update(touchScreen, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(touchScreen);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return touchScreen;
	}

	/**
	 * Returns the touch screen local service.
	 *
	 * @return the touch screen local service
	 */
	public TouchScreenLocalService getTouchScreenLocalService() {
		return touchScreenLocalService;
	}

	/**
	 * Sets the touch screen local service.
	 *
	 * @param touchScreenLocalService the touch screen local service
	 */
	public void setTouchScreenLocalService(
		TouchScreenLocalService touchScreenLocalService) {
		this.touchScreenLocalService = touchScreenLocalService;
	}

	/**
	 * Returns the touch screen persistence.
	 *
	 * @return the touch screen persistence
	 */
	public TouchScreenPersistence getTouchScreenPersistence() {
		return touchScreenPersistence;
	}

	/**
	 * Sets the touch screen persistence.
	 *
	 * @param touchScreenPersistence the touch screen persistence
	 */
	public void setTouchScreenPersistence(
		TouchScreenPersistence touchScreenPersistence) {
		this.touchScreenPersistence = touchScreenPersistence;
	}

	/**
	 * Returns the touch screen finder.
	 *
	 * @return the touch screen finder
	 */
	public TouchScreenFinder getTouchScreenFinder() {
		return touchScreenFinder;
	}

	/**
	 * Sets the touch screen finder.
	 *
	 * @param touchScreenFinder the touch screen finder
	 */
	public void setTouchScreenFinder(TouchScreenFinder touchScreenFinder) {
		this.touchScreenFinder = touchScreenFinder;
	}

	/**
	 * Returns the tra cuu ho so t t h c cong local service.
	 *
	 * @return the tra cuu ho so t t h c cong local service
	 */
	public TraCuuHoSoTTHCCongLocalService getTraCuuHoSoTTHCCongLocalService() {
		return traCuuHoSoTTHCCongLocalService;
	}

	/**
	 * Sets the tra cuu ho so t t h c cong local service.
	 *
	 * @param traCuuHoSoTTHCCongLocalService the tra cuu ho so t t h c cong local service
	 */
	public void setTraCuuHoSoTTHCCongLocalService(
		TraCuuHoSoTTHCCongLocalService traCuuHoSoTTHCCongLocalService) {
		this.traCuuHoSoTTHCCongLocalService = traCuuHoSoTTHCCongLocalService;
	}

	/**
	 * Returns the tra cuu ho so t t h c cong persistence.
	 *
	 * @return the tra cuu ho so t t h c cong persistence
	 */
	public TraCuuHoSoTTHCCongPersistence getTraCuuHoSoTTHCCongPersistence() {
		return traCuuHoSoTTHCCongPersistence;
	}

	/**
	 * Sets the tra cuu ho so t t h c cong persistence.
	 *
	 * @param traCuuHoSoTTHCCongPersistence the tra cuu ho so t t h c cong persistence
	 */
	public void setTraCuuHoSoTTHCCongPersistence(
		TraCuuHoSoTTHCCongPersistence traCuuHoSoTTHCCongPersistence) {
		this.traCuuHoSoTTHCCongPersistence = traCuuHoSoTTHCCongPersistence;
	}

	/**
	 * Returns the tra cuu thu tuc hanh chinh local service.
	 *
	 * @return the tra cuu thu tuc hanh chinh local service
	 */
	public TraCuuThuTucHanhChinhLocalService getTraCuuThuTucHanhChinhLocalService() {
		return traCuuThuTucHanhChinhLocalService;
	}

	/**
	 * Sets the tra cuu thu tuc hanh chinh local service.
	 *
	 * @param traCuuThuTucHanhChinhLocalService the tra cuu thu tuc hanh chinh local service
	 */
	public void setTraCuuThuTucHanhChinhLocalService(
		TraCuuThuTucHanhChinhLocalService traCuuThuTucHanhChinhLocalService) {
		this.traCuuThuTucHanhChinhLocalService = traCuuThuTucHanhChinhLocalService;
	}

	/**
	 * Returns the tra cuu thu tuc hanh chinh persistence.
	 *
	 * @return the tra cuu thu tuc hanh chinh persistence
	 */
	public TraCuuThuTucHanhChinhPersistence getTraCuuThuTucHanhChinhPersistence() {
		return traCuuThuTucHanhChinhPersistence;
	}

	/**
	 * Sets the tra cuu thu tuc hanh chinh persistence.
	 *
	 * @param traCuuThuTucHanhChinhPersistence the tra cuu thu tuc hanh chinh persistence
	 */
	public void setTraCuuThuTucHanhChinhPersistence(
		TraCuuThuTucHanhChinhPersistence traCuuThuTucHanhChinhPersistence) {
		this.traCuuThuTucHanhChinhPersistence = traCuuThuTucHanhChinhPersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.touchscreen.model.TouchScreen",
			touchScreenLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.touchscreen.model.TouchScreen");
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
		return TouchScreen.class;
	}

	protected String getModelClassName() {
		return TouchScreen.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = touchScreenPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = TouchScreenLocalService.class)
	protected TouchScreenLocalService touchScreenLocalService;
	@BeanReference(type = TouchScreenPersistence.class)
	protected TouchScreenPersistence touchScreenPersistence;
	@BeanReference(type = TouchScreenFinder.class)
	protected TouchScreenFinder touchScreenFinder;
	@BeanReference(type = TraCuuHoSoTTHCCongLocalService.class)
	protected TraCuuHoSoTTHCCongLocalService traCuuHoSoTTHCCongLocalService;
	@BeanReference(type = TraCuuHoSoTTHCCongPersistence.class)
	protected TraCuuHoSoTTHCCongPersistence traCuuHoSoTTHCCongPersistence;
	@BeanReference(type = TraCuuThuTucHanhChinhLocalService.class)
	protected TraCuuThuTucHanhChinhLocalService traCuuThuTucHanhChinhLocalService;
	@BeanReference(type = TraCuuThuTucHanhChinhPersistence.class)
	protected TraCuuThuTucHanhChinhPersistence traCuuThuTucHanhChinhPersistence;
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
	private static Log _log = LogFactoryUtil.getLog(TouchScreenLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}