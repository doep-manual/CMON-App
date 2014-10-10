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

package org.oep.cmon.dao.nsd.service.base;

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

import org.oep.cmon.dao.nsd.model.TaiKhoanNguoiDung;
import org.oep.cmon.dao.nsd.service.NguoiDung2VaiTroLocalService;
import org.oep.cmon.dao.nsd.service.NhomNguoiDungLocalService;
import org.oep.cmon.dao.nsd.service.TaiKhoanNguoiDungLocalService;
import org.oep.cmon.dao.nsd.service.TaiNguyen2VaiTroLocalService;
import org.oep.cmon.dao.nsd.service.TaiNguyenLocalService;
import org.oep.cmon.dao.nsd.service.VaiTroLocalService;
import org.oep.cmon.dao.nsd.service.persistence.NguoiDung2VaiTroPersistence;
import org.oep.cmon.dao.nsd.service.persistence.NhomNguoiDungPersistence;
import org.oep.cmon.dao.nsd.service.persistence.TaiKhoanNguoiDungFinder;
import org.oep.cmon.dao.nsd.service.persistence.TaiKhoanNguoiDungPersistence;
import org.oep.cmon.dao.nsd.service.persistence.TaiNguyen2VaiTroPersistence;
import org.oep.cmon.dao.nsd.service.persistence.TaiNguyenFinder;
import org.oep.cmon.dao.nsd.service.persistence.TaiNguyenPersistence;
import org.oep.cmon.dao.nsd.service.persistence.VaiTroPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the tai khoan nguoi dung local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.nsd.service.impl.TaiKhoanNguoiDungLocalServiceImpl}.
 * </p>
 *
 * @author Liemnn
 * @see org.oep.cmon.dao.nsd.service.impl.TaiKhoanNguoiDungLocalServiceImpl
 * @see org.oep.cmon.dao.nsd.service.TaiKhoanNguoiDungLocalServiceUtil
 * @generated
 */
public abstract class TaiKhoanNguoiDungLocalServiceBaseImpl
	implements TaiKhoanNguoiDungLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.nsd.service.TaiKhoanNguoiDungLocalServiceUtil} to access the tai khoan nguoi dung local service.
	 */

	/**
	 * Adds the tai khoan nguoi dung to the database. Also notifies the appropriate model listeners.
	 *
	 * @param taiKhoanNguoiDung the tai khoan nguoi dung
	 * @return the tai khoan nguoi dung that was added
	 * @throws SystemException if a system exception occurred
	 */
	public TaiKhoanNguoiDung addTaiKhoanNguoiDung(
		TaiKhoanNguoiDung taiKhoanNguoiDung) throws SystemException {
		taiKhoanNguoiDung.setNew(true);

		taiKhoanNguoiDung = taiKhoanNguoiDungPersistence.update(taiKhoanNguoiDung,
				false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(taiKhoanNguoiDung);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return taiKhoanNguoiDung;
	}

	/**
	 * Creates a new tai khoan nguoi dung with the primary key. Does not add the tai khoan nguoi dung to the database.
	 *
	 * @param id the primary key for the new tai khoan nguoi dung
	 * @return the new tai khoan nguoi dung
	 */
	public TaiKhoanNguoiDung createTaiKhoanNguoiDung(long id) {
		return taiKhoanNguoiDungPersistence.create(id);
	}

	/**
	 * Deletes the tai khoan nguoi dung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tai khoan nguoi dung
	 * @throws PortalException if a tai khoan nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTaiKhoanNguoiDung(long id)
		throws PortalException, SystemException {
		TaiKhoanNguoiDung taiKhoanNguoiDung = taiKhoanNguoiDungPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(taiKhoanNguoiDung);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the tai khoan nguoi dung from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taiKhoanNguoiDung the tai khoan nguoi dung
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteTaiKhoanNguoiDung(TaiKhoanNguoiDung taiKhoanNguoiDung)
		throws SystemException {
		taiKhoanNguoiDungPersistence.remove(taiKhoanNguoiDung);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(taiKhoanNguoiDung);
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
		return taiKhoanNguoiDungPersistence.findWithDynamicQuery(dynamicQuery);
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
		return taiKhoanNguoiDungPersistence.findWithDynamicQuery(dynamicQuery,
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
		return taiKhoanNguoiDungPersistence.findWithDynamicQuery(dynamicQuery,
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
		return taiKhoanNguoiDungPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public TaiKhoanNguoiDung fetchTaiKhoanNguoiDung(long id)
		throws SystemException {
		return taiKhoanNguoiDungPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the tai khoan nguoi dung with the primary key.
	 *
	 * @param id the primary key of the tai khoan nguoi dung
	 * @return the tai khoan nguoi dung
	 * @throws PortalException if a tai khoan nguoi dung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TaiKhoanNguoiDung getTaiKhoanNguoiDung(long id)
		throws PortalException, SystemException {
		return taiKhoanNguoiDungPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return taiKhoanNguoiDungPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the tai khoan nguoi dungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tai khoan nguoi dungs
	 * @param end the upper bound of the range of tai khoan nguoi dungs (not inclusive)
	 * @return the range of tai khoan nguoi dungs
	 * @throws SystemException if a system exception occurred
	 */
	public List<TaiKhoanNguoiDung> getTaiKhoanNguoiDungs(int start, int end)
		throws SystemException {
		return taiKhoanNguoiDungPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tai khoan nguoi dungs.
	 *
	 * @return the number of tai khoan nguoi dungs
	 * @throws SystemException if a system exception occurred
	 */
	public int getTaiKhoanNguoiDungsCount() throws SystemException {
		return taiKhoanNguoiDungPersistence.countAll();
	}

	/**
	 * Updates the tai khoan nguoi dung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param taiKhoanNguoiDung the tai khoan nguoi dung
	 * @return the tai khoan nguoi dung that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TaiKhoanNguoiDung updateTaiKhoanNguoiDung(
		TaiKhoanNguoiDung taiKhoanNguoiDung) throws SystemException {
		return updateTaiKhoanNguoiDung(taiKhoanNguoiDung, true);
	}

	/**
	 * Updates the tai khoan nguoi dung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param taiKhoanNguoiDung the tai khoan nguoi dung
	 * @param merge whether to merge the tai khoan nguoi dung with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the tai khoan nguoi dung that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public TaiKhoanNguoiDung updateTaiKhoanNguoiDung(
		TaiKhoanNguoiDung taiKhoanNguoiDung, boolean merge)
		throws SystemException {
		taiKhoanNguoiDung.setNew(false);

		taiKhoanNguoiDung = taiKhoanNguoiDungPersistence.update(taiKhoanNguoiDung,
				merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(taiKhoanNguoiDung);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return taiKhoanNguoiDung;
	}

	/**
	 * Returns the nguoi dung2 vai tro local service.
	 *
	 * @return the nguoi dung2 vai tro local service
	 */
	public NguoiDung2VaiTroLocalService getNguoiDung2VaiTroLocalService() {
		return nguoiDung2VaiTroLocalService;
	}

	/**
	 * Sets the nguoi dung2 vai tro local service.
	 *
	 * @param nguoiDung2VaiTroLocalService the nguoi dung2 vai tro local service
	 */
	public void setNguoiDung2VaiTroLocalService(
		NguoiDung2VaiTroLocalService nguoiDung2VaiTroLocalService) {
		this.nguoiDung2VaiTroLocalService = nguoiDung2VaiTroLocalService;
	}

	/**
	 * Returns the nguoi dung2 vai tro persistence.
	 *
	 * @return the nguoi dung2 vai tro persistence
	 */
	public NguoiDung2VaiTroPersistence getNguoiDung2VaiTroPersistence() {
		return nguoiDung2VaiTroPersistence;
	}

	/**
	 * Sets the nguoi dung2 vai tro persistence.
	 *
	 * @param nguoiDung2VaiTroPersistence the nguoi dung2 vai tro persistence
	 */
	public void setNguoiDung2VaiTroPersistence(
		NguoiDung2VaiTroPersistence nguoiDung2VaiTroPersistence) {
		this.nguoiDung2VaiTroPersistence = nguoiDung2VaiTroPersistence;
	}

	/**
	 * Returns the nhom nguoi dung local service.
	 *
	 * @return the nhom nguoi dung local service
	 */
	public NhomNguoiDungLocalService getNhomNguoiDungLocalService() {
		return nhomNguoiDungLocalService;
	}

	/**
	 * Sets the nhom nguoi dung local service.
	 *
	 * @param nhomNguoiDungLocalService the nhom nguoi dung local service
	 */
	public void setNhomNguoiDungLocalService(
		NhomNguoiDungLocalService nhomNguoiDungLocalService) {
		this.nhomNguoiDungLocalService = nhomNguoiDungLocalService;
	}

	/**
	 * Returns the nhom nguoi dung persistence.
	 *
	 * @return the nhom nguoi dung persistence
	 */
	public NhomNguoiDungPersistence getNhomNguoiDungPersistence() {
		return nhomNguoiDungPersistence;
	}

	/**
	 * Sets the nhom nguoi dung persistence.
	 *
	 * @param nhomNguoiDungPersistence the nhom nguoi dung persistence
	 */
	public void setNhomNguoiDungPersistence(
		NhomNguoiDungPersistence nhomNguoiDungPersistence) {
		this.nhomNguoiDungPersistence = nhomNguoiDungPersistence;
	}

	/**
	 * Returns the tai khoan nguoi dung local service.
	 *
	 * @return the tai khoan nguoi dung local service
	 */
	public TaiKhoanNguoiDungLocalService getTaiKhoanNguoiDungLocalService() {
		return taiKhoanNguoiDungLocalService;
	}

	/**
	 * Sets the tai khoan nguoi dung local service.
	 *
	 * @param taiKhoanNguoiDungLocalService the tai khoan nguoi dung local service
	 */
	public void setTaiKhoanNguoiDungLocalService(
		TaiKhoanNguoiDungLocalService taiKhoanNguoiDungLocalService) {
		this.taiKhoanNguoiDungLocalService = taiKhoanNguoiDungLocalService;
	}

	/**
	 * Returns the tai khoan nguoi dung persistence.
	 *
	 * @return the tai khoan nguoi dung persistence
	 */
	public TaiKhoanNguoiDungPersistence getTaiKhoanNguoiDungPersistence() {
		return taiKhoanNguoiDungPersistence;
	}

	/**
	 * Sets the tai khoan nguoi dung persistence.
	 *
	 * @param taiKhoanNguoiDungPersistence the tai khoan nguoi dung persistence
	 */
	public void setTaiKhoanNguoiDungPersistence(
		TaiKhoanNguoiDungPersistence taiKhoanNguoiDungPersistence) {
		this.taiKhoanNguoiDungPersistence = taiKhoanNguoiDungPersistence;
	}

	/**
	 * Returns the tai khoan nguoi dung finder.
	 *
	 * @return the tai khoan nguoi dung finder
	 */
	public TaiKhoanNguoiDungFinder getTaiKhoanNguoiDungFinder() {
		return taiKhoanNguoiDungFinder;
	}

	/**
	 * Sets the tai khoan nguoi dung finder.
	 *
	 * @param taiKhoanNguoiDungFinder the tai khoan nguoi dung finder
	 */
	public void setTaiKhoanNguoiDungFinder(
		TaiKhoanNguoiDungFinder taiKhoanNguoiDungFinder) {
		this.taiKhoanNguoiDungFinder = taiKhoanNguoiDungFinder;
	}

	/**
	 * Returns the tai nguyen local service.
	 *
	 * @return the tai nguyen local service
	 */
	public TaiNguyenLocalService getTaiNguyenLocalService() {
		return taiNguyenLocalService;
	}

	/**
	 * Sets the tai nguyen local service.
	 *
	 * @param taiNguyenLocalService the tai nguyen local service
	 */
	public void setTaiNguyenLocalService(
		TaiNguyenLocalService taiNguyenLocalService) {
		this.taiNguyenLocalService = taiNguyenLocalService;
	}

	/**
	 * Returns the tai nguyen persistence.
	 *
	 * @return the tai nguyen persistence
	 */
	public TaiNguyenPersistence getTaiNguyenPersistence() {
		return taiNguyenPersistence;
	}

	/**
	 * Sets the tai nguyen persistence.
	 *
	 * @param taiNguyenPersistence the tai nguyen persistence
	 */
	public void setTaiNguyenPersistence(
		TaiNguyenPersistence taiNguyenPersistence) {
		this.taiNguyenPersistence = taiNguyenPersistence;
	}

	/**
	 * Returns the tai nguyen finder.
	 *
	 * @return the tai nguyen finder
	 */
	public TaiNguyenFinder getTaiNguyenFinder() {
		return taiNguyenFinder;
	}

	/**
	 * Sets the tai nguyen finder.
	 *
	 * @param taiNguyenFinder the tai nguyen finder
	 */
	public void setTaiNguyenFinder(TaiNguyenFinder taiNguyenFinder) {
		this.taiNguyenFinder = taiNguyenFinder;
	}

	/**
	 * Returns the tai nguyen2 vai tro local service.
	 *
	 * @return the tai nguyen2 vai tro local service
	 */
	public TaiNguyen2VaiTroLocalService getTaiNguyen2VaiTroLocalService() {
		return taiNguyen2VaiTroLocalService;
	}

	/**
	 * Sets the tai nguyen2 vai tro local service.
	 *
	 * @param taiNguyen2VaiTroLocalService the tai nguyen2 vai tro local service
	 */
	public void setTaiNguyen2VaiTroLocalService(
		TaiNguyen2VaiTroLocalService taiNguyen2VaiTroLocalService) {
		this.taiNguyen2VaiTroLocalService = taiNguyen2VaiTroLocalService;
	}

	/**
	 * Returns the tai nguyen2 vai tro persistence.
	 *
	 * @return the tai nguyen2 vai tro persistence
	 */
	public TaiNguyen2VaiTroPersistence getTaiNguyen2VaiTroPersistence() {
		return taiNguyen2VaiTroPersistence;
	}

	/**
	 * Sets the tai nguyen2 vai tro persistence.
	 *
	 * @param taiNguyen2VaiTroPersistence the tai nguyen2 vai tro persistence
	 */
	public void setTaiNguyen2VaiTroPersistence(
		TaiNguyen2VaiTroPersistence taiNguyen2VaiTroPersistence) {
		this.taiNguyen2VaiTroPersistence = taiNguyen2VaiTroPersistence;
	}

	/**
	 * Returns the vai tro local service.
	 *
	 * @return the vai tro local service
	 */
	public VaiTroLocalService getVaiTroLocalService() {
		return vaiTroLocalService;
	}

	/**
	 * Sets the vai tro local service.
	 *
	 * @param vaiTroLocalService the vai tro local service
	 */
	public void setVaiTroLocalService(VaiTroLocalService vaiTroLocalService) {
		this.vaiTroLocalService = vaiTroLocalService;
	}

	/**
	 * Returns the vai tro persistence.
	 *
	 * @return the vai tro persistence
	 */
	public VaiTroPersistence getVaiTroPersistence() {
		return vaiTroPersistence;
	}

	/**
	 * Sets the vai tro persistence.
	 *
	 * @param vaiTroPersistence the vai tro persistence
	 */
	public void setVaiTroPersistence(VaiTroPersistence vaiTroPersistence) {
		this.vaiTroPersistence = vaiTroPersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.nsd.model.TaiKhoanNguoiDung",
			taiKhoanNguoiDungLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.nsd.model.TaiKhoanNguoiDung");
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
		return TaiKhoanNguoiDung.class;
	}

	protected String getModelClassName() {
		return TaiKhoanNguoiDung.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = taiKhoanNguoiDungPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = NguoiDung2VaiTroLocalService.class)
	protected NguoiDung2VaiTroLocalService nguoiDung2VaiTroLocalService;
	@BeanReference(type = NguoiDung2VaiTroPersistence.class)
	protected NguoiDung2VaiTroPersistence nguoiDung2VaiTroPersistence;
	@BeanReference(type = NhomNguoiDungLocalService.class)
	protected NhomNguoiDungLocalService nhomNguoiDungLocalService;
	@BeanReference(type = NhomNguoiDungPersistence.class)
	protected NhomNguoiDungPersistence nhomNguoiDungPersistence;
	@BeanReference(type = TaiKhoanNguoiDungLocalService.class)
	protected TaiKhoanNguoiDungLocalService taiKhoanNguoiDungLocalService;
	@BeanReference(type = TaiKhoanNguoiDungPersistence.class)
	protected TaiKhoanNguoiDungPersistence taiKhoanNguoiDungPersistence;
	@BeanReference(type = TaiKhoanNguoiDungFinder.class)
	protected TaiKhoanNguoiDungFinder taiKhoanNguoiDungFinder;
	@BeanReference(type = TaiNguyenLocalService.class)
	protected TaiNguyenLocalService taiNguyenLocalService;
	@BeanReference(type = TaiNguyenPersistence.class)
	protected TaiNguyenPersistence taiNguyenPersistence;
	@BeanReference(type = TaiNguyenFinder.class)
	protected TaiNguyenFinder taiNguyenFinder;
	@BeanReference(type = TaiNguyen2VaiTroLocalService.class)
	protected TaiNguyen2VaiTroLocalService taiNguyen2VaiTroLocalService;
	@BeanReference(type = TaiNguyen2VaiTroPersistence.class)
	protected TaiNguyen2VaiTroPersistence taiNguyen2VaiTroPersistence;
	@BeanReference(type = VaiTroLocalService.class)
	protected VaiTroLocalService vaiTroLocalService;
	@BeanReference(type = VaiTroPersistence.class)
	protected VaiTroPersistence vaiTroPersistence;
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
	private static Log _log = LogFactoryUtil.getLog(TaiKhoanNguoiDungLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}