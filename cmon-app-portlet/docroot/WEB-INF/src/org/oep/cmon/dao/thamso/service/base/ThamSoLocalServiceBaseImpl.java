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

package org.oep.cmon.dao.thamso.service.base;

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

import org.oep.cmon.dao.thamso.model.ThamSo;
import org.oep.cmon.dao.thamso.service.AnhXaLocalService;
import org.oep.cmon.dao.thamso.service.ThamSoLocalService;
import org.oep.cmon.dao.thamso.service.persistence.AnhXaFinder;
import org.oep.cmon.dao.thamso.service.persistence.AnhXaPersistence;
import org.oep.cmon.dao.thamso.service.persistence.ThamSoFinder;
import org.oep.cmon.dao.thamso.service.persistence.ThamSoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the tham so local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.thamso.service.impl.ThamSoLocalServiceImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see org.oep.cmon.dao.thamso.service.impl.ThamSoLocalServiceImpl
 * @see org.oep.cmon.dao.thamso.service.ThamSoLocalServiceUtil
 * @generated
 */
public abstract class ThamSoLocalServiceBaseImpl implements ThamSoLocalService,
	IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.thamso.service.ThamSoLocalServiceUtil} to access the tham so local service.
	 */

	/**
	 * Adds the tham so to the database. Also notifies the appropriate model listeners.
	 *
	 * @param thamSo the tham so
	 * @return the tham so that was added
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSo addThamSo(ThamSo thamSo) throws SystemException {
		thamSo.setNew(true);

		thamSo = thamSoPersistence.update(thamSo, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(thamSo);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return thamSo;
	}

	/**
	 * Creates a new tham so with the primary key. Does not add the tham so to the database.
	 *
	 * @param Id the primary key for the new tham so
	 * @return the new tham so
	 */
	public ThamSo createThamSo(long Id) {
		return thamSoPersistence.create(Id);
	}

	/**
	 * Deletes the tham so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tham so
	 * @throws PortalException if a tham so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteThamSo(long Id) throws PortalException, SystemException {
		ThamSo thamSo = thamSoPersistence.remove(Id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(thamSo);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the tham so from the database. Also notifies the appropriate model listeners.
	 *
	 * @param thamSo the tham so
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteThamSo(ThamSo thamSo) throws SystemException {
		thamSoPersistence.remove(thamSo);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(thamSo);
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
		return thamSoPersistence.findWithDynamicQuery(dynamicQuery);
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
		return thamSoPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
		return thamSoPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return thamSoPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public ThamSo fetchThamSo(long Id) throws SystemException {
		return thamSoPersistence.fetchByPrimaryKey(Id);
	}

	/**
	 * Returns the tham so with the primary key.
	 *
	 * @param Id the primary key of the tham so
	 * @return the tham so
	 * @throws PortalException if a tham so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSo getThamSo(long Id) throws PortalException, SystemException {
		return thamSoPersistence.findByPrimaryKey(Id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return thamSoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the tham sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tham sos
	 * @param end the upper bound of the range of tham sos (not inclusive)
	 * @return the range of tham sos
	 * @throws SystemException if a system exception occurred
	 */
	public List<ThamSo> getThamSos(int start, int end)
		throws SystemException {
		return thamSoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tham sos.
	 *
	 * @return the number of tham sos
	 * @throws SystemException if a system exception occurred
	 */
	public int getThamSosCount() throws SystemException {
		return thamSoPersistence.countAll();
	}

	/**
	 * Updates the tham so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param thamSo the tham so
	 * @return the tham so that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSo updateThamSo(ThamSo thamSo) throws SystemException {
		return updateThamSo(thamSo, true);
	}

	/**
	 * Updates the tham so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param thamSo the tham so
	 * @param merge whether to merge the tham so with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the tham so that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public ThamSo updateThamSo(ThamSo thamSo, boolean merge)
		throws SystemException {
		thamSo.setNew(false);

		thamSo = thamSoPersistence.update(thamSo, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(thamSo);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return thamSo;
	}

	/**
	 * Returns the anh xa local service.
	 *
	 * @return the anh xa local service
	 */
	public AnhXaLocalService getAnhXaLocalService() {
		return anhXaLocalService;
	}

	/**
	 * Sets the anh xa local service.
	 *
	 * @param anhXaLocalService the anh xa local service
	 */
	public void setAnhXaLocalService(AnhXaLocalService anhXaLocalService) {
		this.anhXaLocalService = anhXaLocalService;
	}

	/**
	 * Returns the anh xa persistence.
	 *
	 * @return the anh xa persistence
	 */
	public AnhXaPersistence getAnhXaPersistence() {
		return anhXaPersistence;
	}

	/**
	 * Sets the anh xa persistence.
	 *
	 * @param anhXaPersistence the anh xa persistence
	 */
	public void setAnhXaPersistence(AnhXaPersistence anhXaPersistence) {
		this.anhXaPersistence = anhXaPersistence;
	}

	/**
	 * Returns the anh xa finder.
	 *
	 * @return the anh xa finder
	 */
	public AnhXaFinder getAnhXaFinder() {
		return anhXaFinder;
	}

	/**
	 * Sets the anh xa finder.
	 *
	 * @param anhXaFinder the anh xa finder
	 */
	public void setAnhXaFinder(AnhXaFinder anhXaFinder) {
		this.anhXaFinder = anhXaFinder;
	}

	/**
	 * Returns the tham so local service.
	 *
	 * @return the tham so local service
	 */
	public ThamSoLocalService getThamSoLocalService() {
		return thamSoLocalService;
	}

	/**
	 * Sets the tham so local service.
	 *
	 * @param thamSoLocalService the tham so local service
	 */
	public void setThamSoLocalService(ThamSoLocalService thamSoLocalService) {
		this.thamSoLocalService = thamSoLocalService;
	}

	/**
	 * Returns the tham so persistence.
	 *
	 * @return the tham so persistence
	 */
	public ThamSoPersistence getThamSoPersistence() {
		return thamSoPersistence;
	}

	/**
	 * Sets the tham so persistence.
	 *
	 * @param thamSoPersistence the tham so persistence
	 */
	public void setThamSoPersistence(ThamSoPersistence thamSoPersistence) {
		this.thamSoPersistence = thamSoPersistence;
	}

	/**
	 * Returns the tham so finder.
	 *
	 * @return the tham so finder
	 */
	public ThamSoFinder getThamSoFinder() {
		return thamSoFinder;
	}

	/**
	 * Sets the tham so finder.
	 *
	 * @param thamSoFinder the tham so finder
	 */
	public void setThamSoFinder(ThamSoFinder thamSoFinder) {
		this.thamSoFinder = thamSoFinder;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.thamso.model.ThamSo",
			thamSoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.thamso.model.ThamSo");
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
		return ThamSo.class;
	}

	protected String getModelClassName() {
		return ThamSo.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = thamSoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AnhXaLocalService.class)
	protected AnhXaLocalService anhXaLocalService;
	@BeanReference(type = AnhXaPersistence.class)
	protected AnhXaPersistence anhXaPersistence;
	@BeanReference(type = AnhXaFinder.class)
	protected AnhXaFinder anhXaFinder;
	@BeanReference(type = ThamSoLocalService.class)
	protected ThamSoLocalService thamSoLocalService;
	@BeanReference(type = ThamSoPersistence.class)
	protected ThamSoPersistence thamSoPersistence;
	@BeanReference(type = ThamSoFinder.class)
	protected ThamSoFinder thamSoFinder;
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
	private static Log _log = LogFactoryUtil.getLog(ThamSoLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}