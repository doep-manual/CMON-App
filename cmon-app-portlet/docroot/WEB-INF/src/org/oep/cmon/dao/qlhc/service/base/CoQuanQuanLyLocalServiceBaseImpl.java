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

package org.oep.cmon.dao.qlhc.service.base;

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

import org.oep.cmon.dao.qlhc.model.CoQuanQuanLy;
import org.oep.cmon.dao.qlhc.service.CapCoQuanQuanLyLocalService;
import org.oep.cmon.dao.qlhc.service.CapDonViHanhChinhLocalService;
import org.oep.cmon.dao.qlhc.service.ChucVu2VaiTroLocalService;
import org.oep.cmon.dao.qlhc.service.CoQuanHanhChinhSuNghiepLocalService;
import org.oep.cmon.dao.qlhc.service.CoQuanQuanLyLocalService;
import org.oep.cmon.dao.qlhc.service.DonViHanhChinhLocalService;
import org.oep.cmon.dao.qlhc.service.QuocGiaLocalService;
import org.oep.cmon.dao.qlhc.service.persistence.CapCoQuanQuanLyPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.CapDonViHanhChinhPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.ChucVu2VaiTroPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.CoQuanHanhChinhSuNghiepFinder;
import org.oep.cmon.dao.qlhc.service.persistence.CoQuanHanhChinhSuNghiepPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.CoQuanQuanLyFinder;
import org.oep.cmon.dao.qlhc.service.persistence.CoQuanQuanLyPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.DonViHanhChinhFinder;
import org.oep.cmon.dao.qlhc.service.persistence.DonViHanhChinhPersistence;
import org.oep.cmon.dao.qlhc.service.persistence.QuocGiaFinder;
import org.oep.cmon.dao.qlhc.service.persistence.QuocGiaPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the co quan quan ly local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.cmon.dao.qlhc.service.impl.CoQuanQuanLyLocalServiceImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see org.oep.cmon.dao.qlhc.service.impl.CoQuanQuanLyLocalServiceImpl
 * @see org.oep.cmon.dao.qlhc.service.CoQuanQuanLyLocalServiceUtil
 * @generated
 */
public abstract class CoQuanQuanLyLocalServiceBaseImpl
	implements CoQuanQuanLyLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.cmon.dao.qlhc.service.CoQuanQuanLyLocalServiceUtil} to access the co quan quan ly local service.
	 */

	/**
	 * Adds the co quan quan ly to the database. Also notifies the appropriate model listeners.
	 *
	 * @param coQuanQuanLy the co quan quan ly
	 * @return the co quan quan ly that was added
	 * @throws SystemException if a system exception occurred
	 */
	public CoQuanQuanLy addCoQuanQuanLy(CoQuanQuanLy coQuanQuanLy)
		throws SystemException {
		coQuanQuanLy.setNew(true);

		coQuanQuanLy = coQuanQuanLyPersistence.update(coQuanQuanLy, false);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(coQuanQuanLy);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return coQuanQuanLy;
	}

	/**
	 * Creates a new co quan quan ly with the primary key. Does not add the co quan quan ly to the database.
	 *
	 * @param id the primary key for the new co quan quan ly
	 * @return the new co quan quan ly
	 */
	public CoQuanQuanLy createCoQuanQuanLy(long id) {
		return coQuanQuanLyPersistence.create(id);
	}

	/**
	 * Deletes the co quan quan ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the co quan quan ly
	 * @throws PortalException if a co quan quan ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteCoQuanQuanLy(long id)
		throws PortalException, SystemException {
		CoQuanQuanLy coQuanQuanLy = coQuanQuanLyPersistence.remove(id);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(coQuanQuanLy);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}
	}

	/**
	 * Deletes the co quan quan ly from the database. Also notifies the appropriate model listeners.
	 *
	 * @param coQuanQuanLy the co quan quan ly
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteCoQuanQuanLy(CoQuanQuanLy coQuanQuanLy)
		throws SystemException {
		coQuanQuanLyPersistence.remove(coQuanQuanLy);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.delete(coQuanQuanLy);
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
		return coQuanQuanLyPersistence.findWithDynamicQuery(dynamicQuery);
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
		return coQuanQuanLyPersistence.findWithDynamicQuery(dynamicQuery,
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
		return coQuanQuanLyPersistence.findWithDynamicQuery(dynamicQuery,
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
		return coQuanQuanLyPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public CoQuanQuanLy fetchCoQuanQuanLy(long id) throws SystemException {
		return coQuanQuanLyPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the co quan quan ly with the primary key.
	 *
	 * @param id the primary key of the co quan quan ly
	 * @return the co quan quan ly
	 * @throws PortalException if a co quan quan ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CoQuanQuanLy getCoQuanQuanLy(long id)
		throws PortalException, SystemException {
		return coQuanQuanLyPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return coQuanQuanLyPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the co quan quan lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of co quan quan lies
	 * @param end the upper bound of the range of co quan quan lies (not inclusive)
	 * @return the range of co quan quan lies
	 * @throws SystemException if a system exception occurred
	 */
	public List<CoQuanQuanLy> getCoQuanQuanLies(int start, int end)
		throws SystemException {
		return coQuanQuanLyPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of co quan quan lies.
	 *
	 * @return the number of co quan quan lies
	 * @throws SystemException if a system exception occurred
	 */
	public int getCoQuanQuanLiesCount() throws SystemException {
		return coQuanQuanLyPersistence.countAll();
	}

	/**
	 * Updates the co quan quan ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param coQuanQuanLy the co quan quan ly
	 * @return the co quan quan ly that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public CoQuanQuanLy updateCoQuanQuanLy(CoQuanQuanLy coQuanQuanLy)
		throws SystemException {
		return updateCoQuanQuanLy(coQuanQuanLy, true);
	}

	/**
	 * Updates the co quan quan ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param coQuanQuanLy the co quan quan ly
	 * @param merge whether to merge the co quan quan ly with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the co quan quan ly that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public CoQuanQuanLy updateCoQuanQuanLy(CoQuanQuanLy coQuanQuanLy,
		boolean merge) throws SystemException {
		coQuanQuanLy.setNew(false);

		coQuanQuanLy = coQuanQuanLyPersistence.update(coQuanQuanLy, merge);

		Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

		if (indexer != null) {
			try {
				indexer.reindex(coQuanQuanLy);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(se, se);
				}
			}
		}

		return coQuanQuanLy;
	}

	/**
	 * Returns the cap co quan quan ly local service.
	 *
	 * @return the cap co quan quan ly local service
	 */
	public CapCoQuanQuanLyLocalService getCapCoQuanQuanLyLocalService() {
		return capCoQuanQuanLyLocalService;
	}

	/**
	 * Sets the cap co quan quan ly local service.
	 *
	 * @param capCoQuanQuanLyLocalService the cap co quan quan ly local service
	 */
	public void setCapCoQuanQuanLyLocalService(
		CapCoQuanQuanLyLocalService capCoQuanQuanLyLocalService) {
		this.capCoQuanQuanLyLocalService = capCoQuanQuanLyLocalService;
	}

	/**
	 * Returns the cap co quan quan ly persistence.
	 *
	 * @return the cap co quan quan ly persistence
	 */
	public CapCoQuanQuanLyPersistence getCapCoQuanQuanLyPersistence() {
		return capCoQuanQuanLyPersistence;
	}

	/**
	 * Sets the cap co quan quan ly persistence.
	 *
	 * @param capCoQuanQuanLyPersistence the cap co quan quan ly persistence
	 */
	public void setCapCoQuanQuanLyPersistence(
		CapCoQuanQuanLyPersistence capCoQuanQuanLyPersistence) {
		this.capCoQuanQuanLyPersistence = capCoQuanQuanLyPersistence;
	}

	/**
	 * Returns the cap don vi hanh chinh local service.
	 *
	 * @return the cap don vi hanh chinh local service
	 */
	public CapDonViHanhChinhLocalService getCapDonViHanhChinhLocalService() {
		return capDonViHanhChinhLocalService;
	}

	/**
	 * Sets the cap don vi hanh chinh local service.
	 *
	 * @param capDonViHanhChinhLocalService the cap don vi hanh chinh local service
	 */
	public void setCapDonViHanhChinhLocalService(
		CapDonViHanhChinhLocalService capDonViHanhChinhLocalService) {
		this.capDonViHanhChinhLocalService = capDonViHanhChinhLocalService;
	}

	/**
	 * Returns the cap don vi hanh chinh persistence.
	 *
	 * @return the cap don vi hanh chinh persistence
	 */
	public CapDonViHanhChinhPersistence getCapDonViHanhChinhPersistence() {
		return capDonViHanhChinhPersistence;
	}

	/**
	 * Sets the cap don vi hanh chinh persistence.
	 *
	 * @param capDonViHanhChinhPersistence the cap don vi hanh chinh persistence
	 */
	public void setCapDonViHanhChinhPersistence(
		CapDonViHanhChinhPersistence capDonViHanhChinhPersistence) {
		this.capDonViHanhChinhPersistence = capDonViHanhChinhPersistence;
	}

	/**
	 * Returns the chuc vu2 vai tro local service.
	 *
	 * @return the chuc vu2 vai tro local service
	 */
	public ChucVu2VaiTroLocalService getChucVu2VaiTroLocalService() {
		return chucVu2VaiTroLocalService;
	}

	/**
	 * Sets the chuc vu2 vai tro local service.
	 *
	 * @param chucVu2VaiTroLocalService the chuc vu2 vai tro local service
	 */
	public void setChucVu2VaiTroLocalService(
		ChucVu2VaiTroLocalService chucVu2VaiTroLocalService) {
		this.chucVu2VaiTroLocalService = chucVu2VaiTroLocalService;
	}

	/**
	 * Returns the chuc vu2 vai tro persistence.
	 *
	 * @return the chuc vu2 vai tro persistence
	 */
	public ChucVu2VaiTroPersistence getChucVu2VaiTroPersistence() {
		return chucVu2VaiTroPersistence;
	}

	/**
	 * Sets the chuc vu2 vai tro persistence.
	 *
	 * @param chucVu2VaiTroPersistence the chuc vu2 vai tro persistence
	 */
	public void setChucVu2VaiTroPersistence(
		ChucVu2VaiTroPersistence chucVu2VaiTroPersistence) {
		this.chucVu2VaiTroPersistence = chucVu2VaiTroPersistence;
	}

	/**
	 * Returns the co quan hanh chinh su nghiep local service.
	 *
	 * @return the co quan hanh chinh su nghiep local service
	 */
	public CoQuanHanhChinhSuNghiepLocalService getCoQuanHanhChinhSuNghiepLocalService() {
		return coQuanHanhChinhSuNghiepLocalService;
	}

	/**
	 * Sets the co quan hanh chinh su nghiep local service.
	 *
	 * @param coQuanHanhChinhSuNghiepLocalService the co quan hanh chinh su nghiep local service
	 */
	public void setCoQuanHanhChinhSuNghiepLocalService(
		CoQuanHanhChinhSuNghiepLocalService coQuanHanhChinhSuNghiepLocalService) {
		this.coQuanHanhChinhSuNghiepLocalService = coQuanHanhChinhSuNghiepLocalService;
	}

	/**
	 * Returns the co quan hanh chinh su nghiep persistence.
	 *
	 * @return the co quan hanh chinh su nghiep persistence
	 */
	public CoQuanHanhChinhSuNghiepPersistence getCoQuanHanhChinhSuNghiepPersistence() {
		return coQuanHanhChinhSuNghiepPersistence;
	}

	/**
	 * Sets the co quan hanh chinh su nghiep persistence.
	 *
	 * @param coQuanHanhChinhSuNghiepPersistence the co quan hanh chinh su nghiep persistence
	 */
	public void setCoQuanHanhChinhSuNghiepPersistence(
		CoQuanHanhChinhSuNghiepPersistence coQuanHanhChinhSuNghiepPersistence) {
		this.coQuanHanhChinhSuNghiepPersistence = coQuanHanhChinhSuNghiepPersistence;
	}

	/**
	 * Returns the co quan hanh chinh su nghiep finder.
	 *
	 * @return the co quan hanh chinh su nghiep finder
	 */
	public CoQuanHanhChinhSuNghiepFinder getCoQuanHanhChinhSuNghiepFinder() {
		return coQuanHanhChinhSuNghiepFinder;
	}

	/**
	 * Sets the co quan hanh chinh su nghiep finder.
	 *
	 * @param coQuanHanhChinhSuNghiepFinder the co quan hanh chinh su nghiep finder
	 */
	public void setCoQuanHanhChinhSuNghiepFinder(
		CoQuanHanhChinhSuNghiepFinder coQuanHanhChinhSuNghiepFinder) {
		this.coQuanHanhChinhSuNghiepFinder = coQuanHanhChinhSuNghiepFinder;
	}

	/**
	 * Returns the co quan quan ly local service.
	 *
	 * @return the co quan quan ly local service
	 */
	public CoQuanQuanLyLocalService getCoQuanQuanLyLocalService() {
		return coQuanQuanLyLocalService;
	}

	/**
	 * Sets the co quan quan ly local service.
	 *
	 * @param coQuanQuanLyLocalService the co quan quan ly local service
	 */
	public void setCoQuanQuanLyLocalService(
		CoQuanQuanLyLocalService coQuanQuanLyLocalService) {
		this.coQuanQuanLyLocalService = coQuanQuanLyLocalService;
	}

	/**
	 * Returns the co quan quan ly persistence.
	 *
	 * @return the co quan quan ly persistence
	 */
	public CoQuanQuanLyPersistence getCoQuanQuanLyPersistence() {
		return coQuanQuanLyPersistence;
	}

	/**
	 * Sets the co quan quan ly persistence.
	 *
	 * @param coQuanQuanLyPersistence the co quan quan ly persistence
	 */
	public void setCoQuanQuanLyPersistence(
		CoQuanQuanLyPersistence coQuanQuanLyPersistence) {
		this.coQuanQuanLyPersistence = coQuanQuanLyPersistence;
	}

	/**
	 * Returns the co quan quan ly finder.
	 *
	 * @return the co quan quan ly finder
	 */
	public CoQuanQuanLyFinder getCoQuanQuanLyFinder() {
		return coQuanQuanLyFinder;
	}

	/**
	 * Sets the co quan quan ly finder.
	 *
	 * @param coQuanQuanLyFinder the co quan quan ly finder
	 */
	public void setCoQuanQuanLyFinder(CoQuanQuanLyFinder coQuanQuanLyFinder) {
		this.coQuanQuanLyFinder = coQuanQuanLyFinder;
	}

	/**
	 * Returns the don vi hanh chinh local service.
	 *
	 * @return the don vi hanh chinh local service
	 */
	public DonViHanhChinhLocalService getDonViHanhChinhLocalService() {
		return donViHanhChinhLocalService;
	}

	/**
	 * Sets the don vi hanh chinh local service.
	 *
	 * @param donViHanhChinhLocalService the don vi hanh chinh local service
	 */
	public void setDonViHanhChinhLocalService(
		DonViHanhChinhLocalService donViHanhChinhLocalService) {
		this.donViHanhChinhLocalService = donViHanhChinhLocalService;
	}

	/**
	 * Returns the don vi hanh chinh persistence.
	 *
	 * @return the don vi hanh chinh persistence
	 */
	public DonViHanhChinhPersistence getDonViHanhChinhPersistence() {
		return donViHanhChinhPersistence;
	}

	/**
	 * Sets the don vi hanh chinh persistence.
	 *
	 * @param donViHanhChinhPersistence the don vi hanh chinh persistence
	 */
	public void setDonViHanhChinhPersistence(
		DonViHanhChinhPersistence donViHanhChinhPersistence) {
		this.donViHanhChinhPersistence = donViHanhChinhPersistence;
	}

	/**
	 * Returns the don vi hanh chinh finder.
	 *
	 * @return the don vi hanh chinh finder
	 */
	public DonViHanhChinhFinder getDonViHanhChinhFinder() {
		return donViHanhChinhFinder;
	}

	/**
	 * Sets the don vi hanh chinh finder.
	 *
	 * @param donViHanhChinhFinder the don vi hanh chinh finder
	 */
	public void setDonViHanhChinhFinder(
		DonViHanhChinhFinder donViHanhChinhFinder) {
		this.donViHanhChinhFinder = donViHanhChinhFinder;
	}

	/**
	 * Returns the quoc gia local service.
	 *
	 * @return the quoc gia local service
	 */
	public QuocGiaLocalService getQuocGiaLocalService() {
		return quocGiaLocalService;
	}

	/**
	 * Sets the quoc gia local service.
	 *
	 * @param quocGiaLocalService the quoc gia local service
	 */
	public void setQuocGiaLocalService(QuocGiaLocalService quocGiaLocalService) {
		this.quocGiaLocalService = quocGiaLocalService;
	}

	/**
	 * Returns the quoc gia persistence.
	 *
	 * @return the quoc gia persistence
	 */
	public QuocGiaPersistence getQuocGiaPersistence() {
		return quocGiaPersistence;
	}

	/**
	 * Sets the quoc gia persistence.
	 *
	 * @param quocGiaPersistence the quoc gia persistence
	 */
	public void setQuocGiaPersistence(QuocGiaPersistence quocGiaPersistence) {
		this.quocGiaPersistence = quocGiaPersistence;
	}

	/**
	 * Returns the quoc gia finder.
	 *
	 * @return the quoc gia finder
	 */
	public QuocGiaFinder getQuocGiaFinder() {
		return quocGiaFinder;
	}

	/**
	 * Sets the quoc gia finder.
	 *
	 * @param quocGiaFinder the quoc gia finder
	 */
	public void setQuocGiaFinder(QuocGiaFinder quocGiaFinder) {
		this.quocGiaFinder = quocGiaFinder;
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
		PersistedModelLocalServiceRegistryUtil.register("org.oep.cmon.dao.qlhc.model.CoQuanQuanLy",
			coQuanQuanLyLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.cmon.dao.qlhc.model.CoQuanQuanLy");
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
		return CoQuanQuanLy.class;
	}

	protected String getModelClassName() {
		return CoQuanQuanLy.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = coQuanQuanLyPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = CapCoQuanQuanLyLocalService.class)
	protected CapCoQuanQuanLyLocalService capCoQuanQuanLyLocalService;
	@BeanReference(type = CapCoQuanQuanLyPersistence.class)
	protected CapCoQuanQuanLyPersistence capCoQuanQuanLyPersistence;
	@BeanReference(type = CapDonViHanhChinhLocalService.class)
	protected CapDonViHanhChinhLocalService capDonViHanhChinhLocalService;
	@BeanReference(type = CapDonViHanhChinhPersistence.class)
	protected CapDonViHanhChinhPersistence capDonViHanhChinhPersistence;
	@BeanReference(type = ChucVu2VaiTroLocalService.class)
	protected ChucVu2VaiTroLocalService chucVu2VaiTroLocalService;
	@BeanReference(type = ChucVu2VaiTroPersistence.class)
	protected ChucVu2VaiTroPersistence chucVu2VaiTroPersistence;
	@BeanReference(type = CoQuanHanhChinhSuNghiepLocalService.class)
	protected CoQuanHanhChinhSuNghiepLocalService coQuanHanhChinhSuNghiepLocalService;
	@BeanReference(type = CoQuanHanhChinhSuNghiepPersistence.class)
	protected CoQuanHanhChinhSuNghiepPersistence coQuanHanhChinhSuNghiepPersistence;
	@BeanReference(type = CoQuanHanhChinhSuNghiepFinder.class)
	protected CoQuanHanhChinhSuNghiepFinder coQuanHanhChinhSuNghiepFinder;
	@BeanReference(type = CoQuanQuanLyLocalService.class)
	protected CoQuanQuanLyLocalService coQuanQuanLyLocalService;
	@BeanReference(type = CoQuanQuanLyPersistence.class)
	protected CoQuanQuanLyPersistence coQuanQuanLyPersistence;
	@BeanReference(type = CoQuanQuanLyFinder.class)
	protected CoQuanQuanLyFinder coQuanQuanLyFinder;
	@BeanReference(type = DonViHanhChinhLocalService.class)
	protected DonViHanhChinhLocalService donViHanhChinhLocalService;
	@BeanReference(type = DonViHanhChinhPersistence.class)
	protected DonViHanhChinhPersistence donViHanhChinhPersistence;
	@BeanReference(type = DonViHanhChinhFinder.class)
	protected DonViHanhChinhFinder donViHanhChinhFinder;
	@BeanReference(type = QuocGiaLocalService.class)
	protected QuocGiaLocalService quocGiaLocalService;
	@BeanReference(type = QuocGiaPersistence.class)
	protected QuocGiaPersistence quocGiaPersistence;
	@BeanReference(type = QuocGiaFinder.class)
	protected QuocGiaFinder quocGiaFinder;
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
	private static Log _log = LogFactoryUtil.getLog(CoQuanQuanLyLocalServiceBaseImpl.class);
	private String _beanIdentifier;
}