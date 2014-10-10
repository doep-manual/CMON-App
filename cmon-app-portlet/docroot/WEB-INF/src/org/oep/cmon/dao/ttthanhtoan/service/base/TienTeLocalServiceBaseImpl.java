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

package org.oep.cmon.dao.ttthanhtoan.service.base;

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

import org.oep.cmon.dao.ttthanhtoan.model.TienTe;
import org.oep.cmon.dao.ttthanhtoan.service.ThongTinThanhToanLocalService;
import org.oep.cmon.dao.ttthanhtoan.service.TienTeLocalService;
import org.oep.cmon.dao.ttthanhtoan.service.persistence.ThongTinThanhToanFinder;
import org.oep.cmon.dao.ttthanhtoan.service.persistence.ThongTinThanhToanPersistence;
import org.oep.cmon.dao.ttthanhtoan.service.persistence.TienTePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the tien te local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.ttthanhtoan.service.impl.TienTeLocalServiceImpl}.
 * </p>
 *
 * @author Thanhdd
 * @see org.oep.cmon.dao.ttthanhtoan.service.impl.TienTeLocalServiceImpl
 * @see org.oep.cmon.dao.ttthanhtoan.service.TienTeLocalServiceUtil
 * @generated
 */
public abstract class TienTeLocalServiceBaseImpl implements TienTeLocalService,
	IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.ttthanhtoan.service.TienTeLocalServiceUtil} to access the tien te local service.
	 */

	/**
	 * Adds the tien te to the database. Also notifies the appropriate model listeners.
	 *
	 * @param tienTe the tien te
	 * @return the tien te that was added
	 * @throws SystemException if a system exception occurred
	 */
	public TienTe addTienTe(TienTe tienTe) throws SystemException {
		tienTe.setNew(true);

		tienTe = tienTePersistence.update(tienTe, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(tienTe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return tienTe;
	}

	/**
	 * Creates a new tien te with the primary key. Does not add the tien te to the database.
	 *
	 * @param id the primary key for the new tien te
	 * @return the new tien te
	 */
	public TienTe createTienTe(long id) {
		return tienTePersistence.create(id);
	}

	/**
	 * Deletes the tien te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tien te
	 * @throws PortalException if a tien te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTienTe(long id) throws PortalException, SystemException {
		TienTe tienTe = tienTePersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(tienTe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the tien te from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tienTe the tien te
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTienTe(TienTe tienTe) throws SystemException {
		tienTePersistence.remove(tienTe);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(tienTe);
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
		return tienTePersistence.findWithDynamicQuery(dynamicQuery);
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
		return tienTePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
		return tienTePersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
		return tienTePersistence.countWithDynamicQuery(dynamicQuery);
	}

	public TienTe fetchTienTe(long id) throws SystemException {
		return tienTePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the tien te with the primary key.
	 *
	 * @param id the primary key of the tien te
	 * @return the tien te
	 * @throws PortalException if a tien te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TienTe getTienTe(long id) throws PortalException, SystemException {
		return tienTePersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return tienTePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the tien tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tien tes
	 * @param end the upper bound of the range of tien tes (not inclusive)
	 * @return the range of tien tes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TienTe> getTienTes(int start, int end)
		throws SystemException {
		return tienTePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tien tes.
	 *
	 * @return the number of tien tes
	 * @throws SystemException if a system exception occurred
	 */
	public int getTienTesCount() throws SystemException {
		return tienTePersistence.countAll();
	}

	/**
	 * Updates the tien te in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tienTe the tien te
	 * @return the tien te that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TienTe updateTienTe(TienTe tienTe) throws SystemException {
		return updateTienTe(tienTe, true);
	}

	/**
	 * Updates the tien te in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tienTe the tien te
	 * @param merge whether to merge the tien te with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the tien te that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TienTe updateTienTe(TienTe tienTe, boolean merge)
		throws SystemException {
		tienTe.setNew(false);

		tienTe = tienTePersistence.update(tienTe, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(tienTe);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return tienTe;
	}

	/**
	 * Returns the thong tin thanh toan local service.
	 *
	 * @return the thong tin thanh toan local service
	 */
	public ThongTinThanhToanLocalService getThongTinThanhToanLocalService() {
		return thongTinThanhToanLocalService;
	}

	/**
	 * Sets the thong tin thanh toan local service.
	 *
	 * @param thongTinThanhToanLocalService the thong tin thanh toan local service
	 */
	public void setThongTinThanhToanLocalService(
		ThongTinThanhToanLocalService thongTinThanhToanLocalService) {
		this.thongTinThanhToanLocalService = thongTinThanhToanLocalService;
	}

	/**
	 * Returns the thong tin thanh toan persistence.
	 *
	 * @return the thong tin thanh toan persistence
	 */
	public ThongTinThanhToanPersistence getThongTinThanhToanPersistence() {
		return thongTinThanhToanPersistence;
	}

	/**
	 * Sets the thong tin thanh toan persistence.
	 *
	 * @param thongTinThanhToanPersistence the thong tin thanh toan persistence
	 */
	public void setThongTinThanhToanPersistence(
		ThongTinThanhToanPersistence thongTinThanhToanPersistence) {
		this.thongTinThanhToanPersistence = thongTinThanhToanPersistence;
	}

	/**
	 * Returns the thong tin thanh toan finder.
	 *
	 * @return the thong tin thanh toan finder
	 */
	public ThongTinThanhToanFinder getThongTinThanhToanFinder() {
		return thongTinThanhToanFinder;
	}

	/**
	 * Sets the thong tin thanh toan finder.
	 *
	 * @param thongTinThanhToanFinder the thong tin thanh toan finder
	 */
	public void setThongTinThanhToanFinder(
		ThongTinThanhToanFinder thongTinThanhToanFinder) {
		this.thongTinThanhToanFinder = thongTinThanhToanFinder;
	}

	/**
	 * Returns the tien te local service.
	 *
	 * @return the tien te local service
	 */
	public TienTeLocalService getTienTeLocalService() {
		return tienTeLocalService;
	}

	/**
	 * Sets the tien te local service.
	 *
	 * @param tienTeLocalService the tien te local service
	 */
	public void setTienTeLocalService(TienTeLocalService tienTeLocalService) {
		this.tienTeLocalService = tienTeLocalService;
	}

	/**
	 * Returns the tien te persistence.
	 *
	 * @return the tien te persistence
	 */
	public TienTePersistence getTienTePersistence() {
		return tienTePersistence;
	}

	/**
	 * Sets the tien te persistence.
	 *
	 * @param tienTePersistence the tien te persistence
	 */
	public void setTienTePersistence(TienTePersistence tienTePersistence) {
		this.tienTePersistence = tienTePersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.ttthanhtoan.model.TienTe",
			tienTeLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.ttthanhtoan.model.TienTe");
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
		return TienTe.class;
	}

	protected String getModelClassName() {
		return TienTe.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tienTePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ThongTinThanhToanLocalService.class)
	protected ThongTinThanhToanLocalService thongTinThanhToanLocalService;
	@BeanReference(type = ThongTinThanhToanPersistence.class)
	protected ThongTinThanhToanPersistence thongTinThanhToanPersistence;
	@BeanReference(type = ThongTinThanhToanFinder.class)
	protected ThongTinThanhToanFinder thongTinThanhToanFinder;
	@BeanReference(type = TienTeLocalService.class)
	protected TienTeLocalService tienTeLocalService;
	@BeanReference(type = TienTePersistence.class)
	protected TienTePersistence tienTePersistence;
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
	private static Log _log = LogFactoryUtil.getLog(TienTeLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}