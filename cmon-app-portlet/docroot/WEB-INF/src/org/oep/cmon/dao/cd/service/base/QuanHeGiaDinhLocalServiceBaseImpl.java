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

package org.oep.cmon.dao.cd.service.base;

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

import org.oep.cmon.dao.cd.model.QuanHeGiaDinh;
import org.oep.cmon.dao.cd.service.ChuyenMonLocalService;
import org.oep.cmon.dao.cd.service.CongDanLocalService;
import org.oep.cmon.dao.cd.service.DanTocLocalService;
import org.oep.cmon.dao.cd.service.GioiTinhLocalService;
import org.oep.cmon.dao.cd.service.HeThongLocalService;
import org.oep.cmon.dao.cd.service.HoChieuCMNDLocalService;
import org.oep.cmon.dao.cd.service.NgheNghiepLocalService;
import org.oep.cmon.dao.cd.service.QuanHeGiaDinhLocalService;
import org.oep.cmon.dao.cd.service.TinhTrangHonNhanLocalService;
import org.oep.cmon.dao.cd.service.TonGiaoLocalService;
import org.oep.cmon.dao.cd.service.TrinhDoChuyenMonLocalService;
import org.oep.cmon.dao.cd.service.TrinhDoHocVanLocalService;
import org.oep.cmon.dao.cd.service.persistence.ChuyenMonFinder;
import org.oep.cmon.dao.cd.service.persistence.ChuyenMonPersistence;
import org.oep.cmon.dao.cd.service.persistence.CongDanFinder;
import org.oep.cmon.dao.cd.service.persistence.CongDanPersistence;
import org.oep.cmon.dao.cd.service.persistence.DanTocPersistence;
import org.oep.cmon.dao.cd.service.persistence.GioiTinhPersistence;
import org.oep.cmon.dao.cd.service.persistence.HeThongPersistence;
import org.oep.cmon.dao.cd.service.persistence.HoChieuCMNDPersistence;
import org.oep.cmon.dao.cd.service.persistence.NgheNghiepPersistence;
import org.oep.cmon.dao.cd.service.persistence.QuanHeGiaDinhPersistence;
import org.oep.cmon.dao.cd.service.persistence.TinhTrangHonNhanPersistence;
import org.oep.cmon.dao.cd.service.persistence.TonGiaoPersistence;
import org.oep.cmon.dao.cd.service.persistence.TrinhDoChuyenMonPersistence;
import org.oep.cmon.dao.cd.service.persistence.TrinhDoHocVanPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the quan he gia dinh local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.cd.service.impl.QuanHeGiaDinhLocalServiceImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see org.oep.cmon.dao.cd.service.impl.QuanHeGiaDinhLocalServiceImpl
 * @see org.oep.cmon.dao.cd.service.QuanHeGiaDinhLocalServiceUtil
 * @generated
 */
public abstract class QuanHeGiaDinhLocalServiceBaseImpl
	implements QuanHeGiaDinhLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.cd.service.QuanHeGiaDinhLocalServiceUtil} to access the quan he gia dinh local service.
	 */

	/**
	 * Adds the quan he gia dinh to the database. Also notifies the appropriate model listeners.
	 *
	 * @param quanHeGiaDinh the quan he gia dinh
	 * @return the quan he gia dinh that was added
	 * @throws SystemException if a system exception occurred
	 */
	public QuanHeGiaDinh addQuanHeGiaDinh(QuanHeGiaDinh quanHeGiaDinh)
		throws SystemException {
		quanHeGiaDinh.setNew(true);

		quanHeGiaDinh = quanHeGiaDinhPersistence.update(quanHeGiaDinh, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(quanHeGiaDinh);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return quanHeGiaDinh;
	}

	/**
	 * Creates a new quan he gia dinh with the primary key. Does not add the quan he gia dinh to the database.
	 *
	 * @param id the primary key for the new quan he gia dinh
	 * @return the new quan he gia dinh
	 */
	public QuanHeGiaDinh createQuanHeGiaDinh(long id) {
		return quanHeGiaDinhPersistence.create(id);
	}

	/**
	 * Deletes the quan he gia dinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the quan he gia dinh
	 * @throws PortalException if a quan he gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteQuanHeGiaDinh(long id)
		throws PortalException, SystemException {
		QuanHeGiaDinh quanHeGiaDinh = quanHeGiaDinhPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(quanHeGiaDinh);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the quan he gia dinh from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quanHeGiaDinh the quan he gia dinh
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteQuanHeGiaDinh(QuanHeGiaDinh quanHeGiaDinh)
		throws SystemException {
		quanHeGiaDinhPersistence.remove(quanHeGiaDinh);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(quanHeGiaDinh);
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
		return quanHeGiaDinhPersistence.findWithDynamicQuery(dynamicQuery);
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
		return quanHeGiaDinhPersistence.findWithDynamicQuery(dynamicQuery,
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
		return quanHeGiaDinhPersistence.findWithDynamicQuery(dynamicQuery,
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
		return quanHeGiaDinhPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public QuanHeGiaDinh fetchQuanHeGiaDinh(long id) throws SystemException {
		return quanHeGiaDinhPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the quan he gia dinh with the primary key.
	 *
	 * @param id the primary key of the quan he gia dinh
	 * @return the quan he gia dinh
	 * @throws PortalException if a quan he gia dinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public QuanHeGiaDinh getQuanHeGiaDinh(long id)
		throws PortalException, SystemException {
		return quanHeGiaDinhPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return quanHeGiaDinhPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the quan he gia dinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of quan he gia dinhs
	 * @param end the upper bound of the range of quan he gia dinhs (not inclusive)
	 * @return the range of quan he gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	public List<QuanHeGiaDinh> getQuanHeGiaDinhs(int start, int end)
		throws SystemException {
		return quanHeGiaDinhPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of quan he gia dinhs.
	 *
	 * @return the number of quan he gia dinhs
	 * @throws SystemException if a system exception occurred
	 */
	public int getQuanHeGiaDinhsCount() throws SystemException {
		return quanHeGiaDinhPersistence.countAll();
	}

	/**
	 * Updates the quan he gia dinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param quanHeGiaDinh the quan he gia dinh
	 * @return the quan he gia dinh that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public QuanHeGiaDinh updateQuanHeGiaDinh(QuanHeGiaDinh quanHeGiaDinh)
		throws SystemException {
		return updateQuanHeGiaDinh(quanHeGiaDinh, true);
	}

	/**
	 * Updates the quan he gia dinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param quanHeGiaDinh the quan he gia dinh
	 * @param merge whether to merge the quan he gia dinh with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the quan he gia dinh that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public QuanHeGiaDinh updateQuanHeGiaDinh(QuanHeGiaDinh quanHeGiaDinh,
		boolean merge) throws SystemException {
		quanHeGiaDinh.setNew(false);

		quanHeGiaDinh = quanHeGiaDinhPersistence.update(quanHeGiaDinh, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(quanHeGiaDinh);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return quanHeGiaDinh;
	}

	/**
	 * Returns the chuyen mon local service.
	 *
	 * @return the chuyen mon local service
	 */
	public ChuyenMonLocalService getChuyenMonLocalService() {
		return chuyenMonLocalService;
	}

	/**
	 * Sets the chuyen mon local service.
	 *
	 * @param chuyenMonLocalService the chuyen mon local service
	 */
	public void setChuyenMonLocalService(
		ChuyenMonLocalService chuyenMonLocalService) {
		this.chuyenMonLocalService = chuyenMonLocalService;
	}

	/**
	 * Returns the chuyen mon persistence.
	 *
	 * @return the chuyen mon persistence
	 */
	public ChuyenMonPersistence getChuyenMonPersistence() {
		return chuyenMonPersistence;
	}

	/**
	 * Sets the chuyen mon persistence.
	 *
	 * @param chuyenMonPersistence the chuyen mon persistence
	 */
	public void setChuyenMonPersistence(
		ChuyenMonPersistence chuyenMonPersistence) {
		this.chuyenMonPersistence = chuyenMonPersistence;
	}

	/**
	 * Returns the chuyen mon finder.
	 *
	 * @return the chuyen mon finder
	 */
	public ChuyenMonFinder getChuyenMonFinder() {
		return chuyenMonFinder;
	}

	/**
	 * Sets the chuyen mon finder.
	 *
	 * @param chuyenMonFinder the chuyen mon finder
	 */
	public void setChuyenMonFinder(ChuyenMonFinder chuyenMonFinder) {
		this.chuyenMonFinder = chuyenMonFinder;
	}

	/**
	 * Returns the cong dan local service.
	 *
	 * @return the cong dan local service
	 */
	public CongDanLocalService getCongDanLocalService() {
		return congDanLocalService;
	}

	/**
	 * Sets the cong dan local service.
	 *
	 * @param congDanLocalService the cong dan local service
	 */
	public void setCongDanLocalService(CongDanLocalService congDanLocalService) {
		this.congDanLocalService = congDanLocalService;
	}

	/**
	 * Returns the cong dan persistence.
	 *
	 * @return the cong dan persistence
	 */
	public CongDanPersistence getCongDanPersistence() {
		return congDanPersistence;
	}

	/**
	 * Sets the cong dan persistence.
	 *
	 * @param congDanPersistence the cong dan persistence
	 */
	public void setCongDanPersistence(CongDanPersistence congDanPersistence) {
		this.congDanPersistence = congDanPersistence;
	}

	/**
	 * Returns the cong dan finder.
	 *
	 * @return the cong dan finder
	 */
	public CongDanFinder getCongDanFinder() {
		return congDanFinder;
	}

	/**
	 * Sets the cong dan finder.
	 *
	 * @param congDanFinder the cong dan finder
	 */
	public void setCongDanFinder(CongDanFinder congDanFinder) {
		this.congDanFinder = congDanFinder;
	}

	/**
	 * Returns the dan toc local service.
	 *
	 * @return the dan toc local service
	 */
	public DanTocLocalService getDanTocLocalService() {
		return danTocLocalService;
	}

	/**
	 * Sets the dan toc local service.
	 *
	 * @param danTocLocalService the dan toc local service
	 */
	public void setDanTocLocalService(DanTocLocalService danTocLocalService) {
		this.danTocLocalService = danTocLocalService;
	}

	/**
	 * Returns the dan toc persistence.
	 *
	 * @return the dan toc persistence
	 */
	public DanTocPersistence getDanTocPersistence() {
		return danTocPersistence;
	}

	/**
	 * Sets the dan toc persistence.
	 *
	 * @param danTocPersistence the dan toc persistence
	 */
	public void setDanTocPersistence(DanTocPersistence danTocPersistence) {
		this.danTocPersistence = danTocPersistence;
	}

	/**
	 * Returns the gioi tinh local service.
	 *
	 * @return the gioi tinh local service
	 */
	public GioiTinhLocalService getGioiTinhLocalService() {
		return gioiTinhLocalService;
	}

	/**
	 * Sets the gioi tinh local service.
	 *
	 * @param gioiTinhLocalService the gioi tinh local service
	 */
	public void setGioiTinhLocalService(
		GioiTinhLocalService gioiTinhLocalService) {
		this.gioiTinhLocalService = gioiTinhLocalService;
	}

	/**
	 * Returns the gioi tinh persistence.
	 *
	 * @return the gioi tinh persistence
	 */
	public GioiTinhPersistence getGioiTinhPersistence() {
		return gioiTinhPersistence;
	}

	/**
	 * Sets the gioi tinh persistence.
	 *
	 * @param gioiTinhPersistence the gioi tinh persistence
	 */
	public void setGioiTinhPersistence(GioiTinhPersistence gioiTinhPersistence) {
		this.gioiTinhPersistence = gioiTinhPersistence;
	}

	/**
	 * Returns the he thong local service.
	 *
	 * @return the he thong local service
	 */
	public HeThongLocalService getHeThongLocalService() {
		return heThongLocalService;
	}

	/**
	 * Sets the he thong local service.
	 *
	 * @param heThongLocalService the he thong local service
	 */
	public void setHeThongLocalService(HeThongLocalService heThongLocalService) {
		this.heThongLocalService = heThongLocalService;
	}

	/**
	 * Returns the he thong persistence.
	 *
	 * @return the he thong persistence
	 */
	public HeThongPersistence getHeThongPersistence() {
		return heThongPersistence;
	}

	/**
	 * Sets the he thong persistence.
	 *
	 * @param heThongPersistence the he thong persistence
	 */
	public void setHeThongPersistence(HeThongPersistence heThongPersistence) {
		this.heThongPersistence = heThongPersistence;
	}

	/**
	 * Returns the ho chieu c m n d local service.
	 *
	 * @return the ho chieu c m n d local service
	 */
	public HoChieuCMNDLocalService getHoChieuCMNDLocalService() {
		return hoChieuCMNDLocalService;
	}

	/**
	 * Sets the ho chieu c m n d local service.
	 *
	 * @param hoChieuCMNDLocalService the ho chieu c m n d local service
	 */
	public void setHoChieuCMNDLocalService(
		HoChieuCMNDLocalService hoChieuCMNDLocalService) {
		this.hoChieuCMNDLocalService = hoChieuCMNDLocalService;
	}

	/**
	 * Returns the ho chieu c m n d persistence.
	 *
	 * @return the ho chieu c m n d persistence
	 */
	public HoChieuCMNDPersistence getHoChieuCMNDPersistence() {
		return hoChieuCMNDPersistence;
	}

	/**
	 * Sets the ho chieu c m n d persistence.
	 *
	 * @param hoChieuCMNDPersistence the ho chieu c m n d persistence
	 */
	public void setHoChieuCMNDPersistence(
		HoChieuCMNDPersistence hoChieuCMNDPersistence) {
		this.hoChieuCMNDPersistence = hoChieuCMNDPersistence;
	}

	/**
	 * Returns the nghe nghiep local service.
	 *
	 * @return the nghe nghiep local service
	 */
	public NgheNghiepLocalService getNgheNghiepLocalService() {
		return ngheNghiepLocalService;
	}

	/**
	 * Sets the nghe nghiep local service.
	 *
	 * @param ngheNghiepLocalService the nghe nghiep local service
	 */
	public void setNgheNghiepLocalService(
		NgheNghiepLocalService ngheNghiepLocalService) {
		this.ngheNghiepLocalService = ngheNghiepLocalService;
	}

	/**
	 * Returns the nghe nghiep persistence.
	 *
	 * @return the nghe nghiep persistence
	 */
	public NgheNghiepPersistence getNgheNghiepPersistence() {
		return ngheNghiepPersistence;
	}

	/**
	 * Sets the nghe nghiep persistence.
	 *
	 * @param ngheNghiepPersistence the nghe nghiep persistence
	 */
	public void setNgheNghiepPersistence(
		NgheNghiepPersistence ngheNghiepPersistence) {
		this.ngheNghiepPersistence = ngheNghiepPersistence;
	}

	/**
	 * Returns the quan he gia dinh local service.
	 *
	 * @return the quan he gia dinh local service
	 */
	public QuanHeGiaDinhLocalService getQuanHeGiaDinhLocalService() {
		return quanHeGiaDinhLocalService;
	}

	/**
	 * Sets the quan he gia dinh local service.
	 *
	 * @param quanHeGiaDinhLocalService the quan he gia dinh local service
	 */
	public void setQuanHeGiaDinhLocalService(
		QuanHeGiaDinhLocalService quanHeGiaDinhLocalService) {
		this.quanHeGiaDinhLocalService = quanHeGiaDinhLocalService;
	}

	/**
	 * Returns the quan he gia dinh persistence.
	 *
	 * @return the quan he gia dinh persistence
	 */
	public QuanHeGiaDinhPersistence getQuanHeGiaDinhPersistence() {
		return quanHeGiaDinhPersistence;
	}

	/**
	 * Sets the quan he gia dinh persistence.
	 *
	 * @param quanHeGiaDinhPersistence the quan he gia dinh persistence
	 */
	public void setQuanHeGiaDinhPersistence(
		QuanHeGiaDinhPersistence quanHeGiaDinhPersistence) {
		this.quanHeGiaDinhPersistence = quanHeGiaDinhPersistence;
	}

	/**
	 * Returns the tinh trang hon nhan local service.
	 *
	 * @return the tinh trang hon nhan local service
	 */
	public TinhTrangHonNhanLocalService getTinhTrangHonNhanLocalService() {
		return tinhTrangHonNhanLocalService;
	}

	/**
	 * Sets the tinh trang hon nhan local service.
	 *
	 * @param tinhTrangHonNhanLocalService the tinh trang hon nhan local service
	 */
	public void setTinhTrangHonNhanLocalService(
		TinhTrangHonNhanLocalService tinhTrangHonNhanLocalService) {
		this.tinhTrangHonNhanLocalService = tinhTrangHonNhanLocalService;
	}

	/**
	 * Returns the tinh trang hon nhan persistence.
	 *
	 * @return the tinh trang hon nhan persistence
	 */
	public TinhTrangHonNhanPersistence getTinhTrangHonNhanPersistence() {
		return tinhTrangHonNhanPersistence;
	}

	/**
	 * Sets the tinh trang hon nhan persistence.
	 *
	 * @param tinhTrangHonNhanPersistence the tinh trang hon nhan persistence
	 */
	public void setTinhTrangHonNhanPersistence(
		TinhTrangHonNhanPersistence tinhTrangHonNhanPersistence) {
		this.tinhTrangHonNhanPersistence = tinhTrangHonNhanPersistence;
	}

	/**
	 * Returns the ton giao local service.
	 *
	 * @return the ton giao local service
	 */
	public TonGiaoLocalService getTonGiaoLocalService() {
		return tonGiaoLocalService;
	}

	/**
	 * Sets the ton giao local service.
	 *
	 * @param tonGiaoLocalService the ton giao local service
	 */
	public void setTonGiaoLocalService(TonGiaoLocalService tonGiaoLocalService) {
		this.tonGiaoLocalService = tonGiaoLocalService;
	}

	/**
	 * Returns the ton giao persistence.
	 *
	 * @return the ton giao persistence
	 */
	public TonGiaoPersistence getTonGiaoPersistence() {
		return tonGiaoPersistence;
	}

	/**
	 * Sets the ton giao persistence.
	 *
	 * @param tonGiaoPersistence the ton giao persistence
	 */
	public void setTonGiaoPersistence(TonGiaoPersistence tonGiaoPersistence) {
		this.tonGiaoPersistence = tonGiaoPersistence;
	}

	/**
	 * Returns the trinh do chuyen mon local service.
	 *
	 * @return the trinh do chuyen mon local service
	 */
	public TrinhDoChuyenMonLocalService getTrinhDoChuyenMonLocalService() {
		return trinhDoChuyenMonLocalService;
	}

	/**
	 * Sets the trinh do chuyen mon local service.
	 *
	 * @param trinhDoChuyenMonLocalService the trinh do chuyen mon local service
	 */
	public void setTrinhDoChuyenMonLocalService(
		TrinhDoChuyenMonLocalService trinhDoChuyenMonLocalService) {
		this.trinhDoChuyenMonLocalService = trinhDoChuyenMonLocalService;
	}

	/**
	 * Returns the trinh do chuyen mon persistence.
	 *
	 * @return the trinh do chuyen mon persistence
	 */
	public TrinhDoChuyenMonPersistence getTrinhDoChuyenMonPersistence() {
		return trinhDoChuyenMonPersistence;
	}

	/**
	 * Sets the trinh do chuyen mon persistence.
	 *
	 * @param trinhDoChuyenMonPersistence the trinh do chuyen mon persistence
	 */
	public void setTrinhDoChuyenMonPersistence(
		TrinhDoChuyenMonPersistence trinhDoChuyenMonPersistence) {
		this.trinhDoChuyenMonPersistence = trinhDoChuyenMonPersistence;
	}

	/**
	 * Returns the trinh do hoc van local service.
	 *
	 * @return the trinh do hoc van local service
	 */
	public TrinhDoHocVanLocalService getTrinhDoHocVanLocalService() {
		return trinhDoHocVanLocalService;
	}

	/**
	 * Sets the trinh do hoc van local service.
	 *
	 * @param trinhDoHocVanLocalService the trinh do hoc van local service
	 */
	public void setTrinhDoHocVanLocalService(
		TrinhDoHocVanLocalService trinhDoHocVanLocalService) {
		this.trinhDoHocVanLocalService = trinhDoHocVanLocalService;
	}

	/**
	 * Returns the trinh do hoc van persistence.
	 *
	 * @return the trinh do hoc van persistence
	 */
	public TrinhDoHocVanPersistence getTrinhDoHocVanPersistence() {
		return trinhDoHocVanPersistence;
	}

	/**
	 * Sets the trinh do hoc van persistence.
	 *
	 * @param trinhDoHocVanPersistence the trinh do hoc van persistence
	 */
	public void setTrinhDoHocVanPersistence(
		TrinhDoHocVanPersistence trinhDoHocVanPersistence) {
		this.trinhDoHocVanPersistence = trinhDoHocVanPersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.cd.model.QuanHeGiaDinh",
			quanHeGiaDinhLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.cd.model.QuanHeGiaDinh");
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
		return QuanHeGiaDinh.class;
	}

	protected String getModelClassName() {
		return QuanHeGiaDinh.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = quanHeGiaDinhPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ChuyenMonLocalService.class)
	protected ChuyenMonLocalService chuyenMonLocalService;
	@BeanReference(type = ChuyenMonPersistence.class)
	protected ChuyenMonPersistence chuyenMonPersistence;
	@BeanReference(type = ChuyenMonFinder.class)
	protected ChuyenMonFinder chuyenMonFinder;
	@BeanReference(type = CongDanLocalService.class)
	protected CongDanLocalService congDanLocalService;
	@BeanReference(type = CongDanPersistence.class)
	protected CongDanPersistence congDanPersistence;
	@BeanReference(type = CongDanFinder.class)
	protected CongDanFinder congDanFinder;
	@BeanReference(type = DanTocLocalService.class)
	protected DanTocLocalService danTocLocalService;
	@BeanReference(type = DanTocPersistence.class)
	protected DanTocPersistence danTocPersistence;
	@BeanReference(type = GioiTinhLocalService.class)
	protected GioiTinhLocalService gioiTinhLocalService;
	@BeanReference(type = GioiTinhPersistence.class)
	protected GioiTinhPersistence gioiTinhPersistence;
	@BeanReference(type = HeThongLocalService.class)
	protected HeThongLocalService heThongLocalService;
	@BeanReference(type = HeThongPersistence.class)
	protected HeThongPersistence heThongPersistence;
	@BeanReference(type = HoChieuCMNDLocalService.class)
	protected HoChieuCMNDLocalService hoChieuCMNDLocalService;
	@BeanReference(type = HoChieuCMNDPersistence.class)
	protected HoChieuCMNDPersistence hoChieuCMNDPersistence;
	@BeanReference(type = NgheNghiepLocalService.class)
	protected NgheNghiepLocalService ngheNghiepLocalService;
	@BeanReference(type = NgheNghiepPersistence.class)
	protected NgheNghiepPersistence ngheNghiepPersistence;
	@BeanReference(type = QuanHeGiaDinhLocalService.class)
	protected QuanHeGiaDinhLocalService quanHeGiaDinhLocalService;
	@BeanReference(type = QuanHeGiaDinhPersistence.class)
	protected QuanHeGiaDinhPersistence quanHeGiaDinhPersistence;
	@BeanReference(type = TinhTrangHonNhanLocalService.class)
	protected TinhTrangHonNhanLocalService tinhTrangHonNhanLocalService;
	@BeanReference(type = TinhTrangHonNhanPersistence.class)
	protected TinhTrangHonNhanPersistence tinhTrangHonNhanPersistence;
	@BeanReference(type = TonGiaoLocalService.class)
	protected TonGiaoLocalService tonGiaoLocalService;
	@BeanReference(type = TonGiaoPersistence.class)
	protected TonGiaoPersistence tonGiaoPersistence;
	@BeanReference(type = TrinhDoChuyenMonLocalService.class)
	protected TrinhDoChuyenMonLocalService trinhDoChuyenMonLocalService;
	@BeanReference(type = TrinhDoChuyenMonPersistence.class)
	protected TrinhDoChuyenMonPersistence trinhDoChuyenMonPersistence;
	@BeanReference(type = TrinhDoHocVanLocalService.class)
	protected TrinhDoHocVanLocalService trinhDoHocVanLocalService;
	@BeanReference(type = TrinhDoHocVanPersistence.class)
	protected TrinhDoHocVanPersistence trinhDoHocVanPersistence;
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
	private static Log _log = LogFactoryUtil.getLog(QuanHeGiaDinhLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}