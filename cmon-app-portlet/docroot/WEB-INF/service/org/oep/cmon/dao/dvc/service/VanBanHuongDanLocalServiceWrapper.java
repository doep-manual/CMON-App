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

package org.oep.cmon.dao.dvc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link VanBanHuongDanLocalService}.
 * </p>
 *
 * @author    liemnn
 * @see       VanBanHuongDanLocalService
 * @generated
 */
public class VanBanHuongDanLocalServiceWrapper
	implements VanBanHuongDanLocalService,
		ServiceWrapper<VanBanHuongDanLocalService> {
	public VanBanHuongDanLocalServiceWrapper(
		VanBanHuongDanLocalService vanBanHuongDanLocalService) {
		_vanBanHuongDanLocalService = vanBanHuongDanLocalService;
	}

	/**
	* Adds the van ban huong dan to the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanHuongDan the van ban huong dan
	* @return the van ban huong dan that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.VanBanHuongDan addVanBanHuongDan(
		org.oep.cmon.dao.dvc.model.VanBanHuongDan vanBanHuongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.addVanBanHuongDan(vanBanHuongDan);
	}

	/**
	* Creates a new van ban huong dan with the primary key. Does not add the van ban huong dan to the database.
	*
	* @param id the primary key for the new van ban huong dan
	* @return the new van ban huong dan
	*/
	public org.oep.cmon.dao.dvc.model.VanBanHuongDan createVanBanHuongDan(
		long id) {
		return _vanBanHuongDanLocalService.createVanBanHuongDan(id);
	}

	/**
	* Deletes the van ban huong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the van ban huong dan
	* @throws PortalException if a van ban huong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVanBanHuongDan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vanBanHuongDanLocalService.deleteVanBanHuongDan(id);
	}

	/**
	* Deletes the van ban huong dan from the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanHuongDan the van ban huong dan
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVanBanHuongDan(
		org.oep.cmon.dao.dvc.model.VanBanHuongDan vanBanHuongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanBanHuongDanLocalService.deleteVanBanHuongDan(vanBanHuongDan);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.dvc.model.VanBanHuongDan fetchVanBanHuongDan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.fetchVanBanHuongDan(id);
	}

	/**
	* Returns the van ban huong dan with the primary key.
	*
	* @param id the primary key of the van ban huong dan
	* @return the van ban huong dan
	* @throws PortalException if a van ban huong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.VanBanHuongDan getVanBanHuongDan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.getVanBanHuongDan(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the van ban huong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of van ban huong dans
	* @param end the upper bound of the range of van ban huong dans (not inclusive)
	* @return the range of van ban huong dans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.VanBanHuongDan> getVanBanHuongDans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.getVanBanHuongDans(start, end);
	}

	/**
	* Returns the number of van ban huong dans.
	*
	* @return the number of van ban huong dans
	* @throws SystemException if a system exception occurred
	*/
	public int getVanBanHuongDansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.getVanBanHuongDansCount();
	}

	/**
	* Updates the van ban huong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vanBanHuongDan the van ban huong dan
	* @return the van ban huong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.VanBanHuongDan updateVanBanHuongDan(
		org.oep.cmon.dao.dvc.model.VanBanHuongDan vanBanHuongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.updateVanBanHuongDan(vanBanHuongDan);
	}

	/**
	* Updates the van ban huong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vanBanHuongDan the van ban huong dan
	* @param merge whether to merge the van ban huong dan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the van ban huong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.VanBanHuongDan updateVanBanHuongDan(
		org.oep.cmon.dao.dvc.model.VanBanHuongDan vanBanHuongDan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanHuongDanLocalService.updateVanBanHuongDan(vanBanHuongDan,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _vanBanHuongDanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vanBanHuongDanLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* This is fucntion find VanBanHuongDan by thuTucHanhChinhId, loaiTaiLieu
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long thuTucHanhChinhId, long loaiTaiLieu
	* @return List<VanBanHuongDan>
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.VanBanHuongDan> findByThuTucHanhChinhIdAndLoaiTaiLieu(
		long thuTucHanhChinhId, long loaiTaiLieu) {
		return _vanBanHuongDanLocalService.findByThuTucHanhChinhIdAndLoaiTaiLieu(thuTucHanhChinhId,
			loaiTaiLieu);
	}

	/**
	* This is fucntion find VanBanHuongDan by thuTucHanhChinhId, loaiTaiLieu,status
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long thuTucHanhChinhId, long loaiTaiLieu, int status
	* @return List<VanBanHuongDan>
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.VanBanHuongDan> findByThuTucHanhChinhIdAndLoaiTaiLieuAndDaXoa(
		long thuTucHanhChinhId, long loaiTaiLieu, int status) {
		return _vanBanHuongDanLocalService.findByThuTucHanhChinhIdAndLoaiTaiLieuAndDaXoa(thuTucHanhChinhId,
			loaiTaiLieu, status);
	}

	/**
	* This is fucntion find VanBanHuongDan by thuTucHanhChinhId, loaiTaiLieu,status
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long thuTucHanhChinhId, long loaiTaiLieu, int status
	* @return List<VanBanHuongDan>
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.VanBanHuongDan> findByThuTucHanhChinhIdAndLoaiTaiLieuDaXoa(
		long thuTucHanhChinhId, long loaiTaiLieu, int status) {
		return _vanBanHuongDanLocalService.findByThuTucHanhChinhIdAndLoaiTaiLieuDaXoa(thuTucHanhChinhId,
			loaiTaiLieu, status);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public VanBanHuongDanLocalService getWrappedVanBanHuongDanLocalService() {
		return _vanBanHuongDanLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedVanBanHuongDanLocalService(
		VanBanHuongDanLocalService vanBanHuongDanLocalService) {
		_vanBanHuongDanLocalService = vanBanHuongDanLocalService;
	}

	public VanBanHuongDanLocalService getWrappedService() {
		return _vanBanHuongDanLocalService;
	}

	public void setWrappedService(
		VanBanHuongDanLocalService vanBanHuongDanLocalService) {
		_vanBanHuongDanLocalService = vanBanHuongDanLocalService;
	}

	private VanBanHuongDanLocalService _vanBanHuongDanLocalService;
}