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

package org.oep.dlms.dao.capgiaypheplaixe.service.base;

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

import org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe;
import org.oep.dlms.dao.capgiaypheplaixe.service.CapGiayPhepLaiXeLocalService;
import org.oep.dlms.dao.capgiaypheplaixe.service.persistence.CapGiayPhepLaiXePersistence;

/**
 * The base implementation of the cap giay phep lai xe local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.dlms.dao.capgiaypheplaixe.service.impl.CapGiayPhepLaiXeLocalServiceImpl}.
 * </p>
 *
 * @author AnhNT
 * @see org.oep.dlms.dao.capgiaypheplaixe.service.impl.CapGiayPhepLaiXeLocalServiceImpl
 * @see org.oep.dlms.dao.capgiaypheplaixe.service.CapGiayPhepLaiXeLocalServiceUtil
 * @generated
 */
public abstract class CapGiayPhepLaiXeLocalServiceBaseImpl
	implements CapGiayPhepLaiXeLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.dlms.dao.capgiaypheplaixe.service.CapGiayPhepLaiXeLocalServiceUtil} to access the cap giay phep lai xe local service.
	 */

	/**
	 * Adds the cap giay phep lai xe to the database. Also notifies the appropriate model listeners.
	 *
	 * @param capGiayPhepLaiXe the cap giay phep lai xe
	 * @return the cap giay phep lai xe that was added
	 * @throws SystemException if a system exception occurred
	 */
	public CapGiayPhepLaiXe addCapGiayPhepLaiXe(
		CapGiayPhepLaiXe capGiayPhepLaiXe) throws SystemException {
		capGiayPhepLaiXe.setNew(true);

		capGiayPhepLaiXe = capGiayPhepLaiXePersistence.update(capGiayPhepLaiXe,
				false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(capGiayPhepLaiXe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return capGiayPhepLaiXe;
	}

	/**
	 * Creates a new cap giay phep lai xe with the primary key. Does not add the cap giay phep lai xe to the database.
	 *
	 * @param id the primary key for the new cap giay phep lai xe
	 * @return the new cap giay phep lai xe
	 */
	public CapGiayPhepLaiXe createCapGiayPhepLaiXe(long id) {
		return capGiayPhepLaiXePersistence.create(id);
	}

	/**
	 * Deletes the cap giay phep lai xe with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cap giay phep lai xe
	 * @throws PortalException if a cap giay phep lai xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteCapGiayPhepLaiXe(long id)
		throws PortalException, SystemException {
		CapGiayPhepLaiXe capGiayPhepLaiXe = capGiayPhepLaiXePersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(capGiayPhepLaiXe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the cap giay phep lai xe from the database. Also notifies the appropriate model listeners.
	 *
	 * @param capGiayPhepLaiXe the cap giay phep lai xe
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteCapGiayPhepLaiXe(CapGiayPhepLaiXe capGiayPhepLaiXe)
		throws SystemException {
		capGiayPhepLaiXePersistence.remove(capGiayPhepLaiXe);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(capGiayPhepLaiXe);
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
		return capGiayPhepLaiXePersistence.findWithDynamicQuery(dynamicQuery);
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
		return capGiayPhepLaiXePersistence.findWithDynamicQuery(dynamicQuery,
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
		return capGiayPhepLaiXePersistence.findWithDynamicQuery(dynamicQuery,
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
		return capGiayPhepLaiXePersistence.countWithDynamicQuery(dynamicQuery);
	}

	public CapGiayPhepLaiXe fetchCapGiayPhepLaiXe(long id)
		throws SystemException {
		return capGiayPhepLaiXePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the cap giay phep lai xe with the primary key.
	 *
	 * @param id the primary key of the cap giay phep lai xe
	 * @return the cap giay phep lai xe
	 * @throws PortalException if a cap giay phep lai xe with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CapGiayPhepLaiXe getCapGiayPhepLaiXe(long id)
		throws PortalException, SystemException {
		return capGiayPhepLaiXePersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return capGiayPhepLaiXePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the cap giay phep lai xes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of cap giay phep lai xes
	 * @param end the upper bound of the range of cap giay phep lai xes (not inclusive)
	 * @return the range of cap giay phep lai xes
	 * @throws SystemException if a system exception occurred
	 */
	public List<CapGiayPhepLaiXe> getCapGiayPhepLaiXes(int start, int end)
		throws SystemException {
		return capGiayPhepLaiXePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cap giay phep lai xes.
	 *
	 * @return the number of cap giay phep lai xes
	 * @throws SystemException if a system exception occurred
	 */
	public int getCapGiayPhepLaiXesCount() throws SystemException {
		return capGiayPhepLaiXePersistence.countAll();
	}

	/**
	 * Updates the cap giay phep lai xe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param capGiayPhepLaiXe the cap giay phep lai xe
	 * @return the cap giay phep lai xe that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public CapGiayPhepLaiXe updateCapGiayPhepLaiXe(
		CapGiayPhepLaiXe capGiayPhepLaiXe) throws SystemException {
		return updateCapGiayPhepLaiXe(capGiayPhepLaiXe, true);
	}

	/**
	 * Updates the cap giay phep lai xe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param capGiayPhepLaiXe the cap giay phep lai xe
	 * @param merge whether to merge the cap giay phep lai xe with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the cap giay phep lai xe that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public CapGiayPhepLaiXe updateCapGiayPhepLaiXe(
		CapGiayPhepLaiXe capGiayPhepLaiXe, boolean merge)
		throws SystemException {
		capGiayPhepLaiXe.setNew(false);

		capGiayPhepLaiXe = capGiayPhepLaiXePersistence.update(capGiayPhepLaiXe,
				merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(capGiayPhepLaiXe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return capGiayPhepLaiXe;
	}

	/**
	 * Returns the cap giay phep lai xe local service.
	 *
	 * @return the cap giay phep lai xe local service
	 */
	public CapGiayPhepLaiXeLocalService getCapGiayPhepLaiXeLocalService() {
		return capGiayPhepLaiXeLocalService;
	}

	/**
	 * Sets the cap giay phep lai xe local service.
	 *
	 * @param capGiayPhepLaiXeLocalService the cap giay phep lai xe local service
	 */
	public void setCapGiayPhepLaiXeLocalService(
		CapGiayPhepLaiXeLocalService capGiayPhepLaiXeLocalService) {
		this.capGiayPhepLaiXeLocalService = capGiayPhepLaiXeLocalService;
	}

	/**
	 * Returns the cap giay phep lai xe persistence.
	 *
	 * @return the cap giay phep lai xe persistence
	 */
	public CapGiayPhepLaiXePersistence getCapGiayPhepLaiXePersistence() {
		return capGiayPhepLaiXePersistence;
	}

	/**
	 * Sets the cap giay phep lai xe persistence.
	 *
	 * @param capGiayPhepLaiXePersistence the cap giay phep lai xe persistence
	 */
	public void setCapGiayPhepLaiXePersistence(
		CapGiayPhepLaiXePersistence capGiayPhepLaiXePersistence) {
		this.capGiayPhepLaiXePersistence = capGiayPhepLaiXePersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe",
			capGiayPhepLaiXeLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe");
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
		return CapGiayPhepLaiXe.class;
	}

	protected String getModelClassName() {
		return CapGiayPhepLaiXe.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = capGiayPhepLaiXePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = CapGiayPhepLaiXeLocalService.class)
	protected CapGiayPhepLaiXeLocalService capGiayPhepLaiXeLocalService;
	@BeanReference(type = CapGiayPhepLaiXePersistence.class)
	protected CapGiayPhepLaiXePersistence capGiayPhepLaiXePersistence;
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
	private static Log _log = LogFactoryUtil.getLog(CapGiayPhepLaiXeLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}