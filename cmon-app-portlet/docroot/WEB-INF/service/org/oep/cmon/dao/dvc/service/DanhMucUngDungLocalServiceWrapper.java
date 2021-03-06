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
 * This class is a wrapper for {@link DanhMucUngDungLocalService}.
 * </p>
 *
 * @author    liemnn
 * @see       DanhMucUngDungLocalService
 * @generated
 */
public class DanhMucUngDungLocalServiceWrapper
	implements DanhMucUngDungLocalService,
		ServiceWrapper<DanhMucUngDungLocalService> {
	public DanhMucUngDungLocalServiceWrapper(
		DanhMucUngDungLocalService danhMucUngDungLocalService) {
		_danhMucUngDungLocalService = danhMucUngDungLocalService;
	}

	/**
	* Adds the danh muc ung dung to the database. Also notifies the appropriate model listeners.
	*
	* @param danhMucUngDung the danh muc ung dung
	* @return the danh muc ung dung that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung addDanhMucUngDung(
		org.oep.cmon.dao.dvc.model.DanhMucUngDung danhMucUngDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.addDanhMucUngDung(danhMucUngDung);
	}

	/**
	* Creates a new danh muc ung dung with the primary key. Does not add the danh muc ung dung to the database.
	*
	* @param id the primary key for the new danh muc ung dung
	* @return the new danh muc ung dung
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung createDanhMucUngDung(
		long id) {
		return _danhMucUngDungLocalService.createDanhMucUngDung(id);
	}

	/**
	* Deletes the danh muc ung dung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh muc ung dung
	* @throws PortalException if a danh muc ung dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDanhMucUngDung(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_danhMucUngDungLocalService.deleteDanhMucUngDung(id);
	}

	/**
	* Deletes the danh muc ung dung from the database. Also notifies the appropriate model listeners.
	*
	* @param danhMucUngDung the danh muc ung dung
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDanhMucUngDung(
		org.oep.cmon.dao.dvc.model.DanhMucUngDung danhMucUngDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		_danhMucUngDungLocalService.deleteDanhMucUngDung(danhMucUngDung);
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
		return _danhMucUngDungLocalService.dynamicQuery(dynamicQuery);
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
		return _danhMucUngDungLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _danhMucUngDungLocalService.dynamicQuery(dynamicQuery, start,
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
		return _danhMucUngDungLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.dvc.model.DanhMucUngDung fetchDanhMucUngDung(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.fetchDanhMucUngDung(id);
	}

	/**
	* Returns the danh muc ung dung with the primary key.
	*
	* @param id the primary key of the danh muc ung dung
	* @return the danh muc ung dung
	* @throws PortalException if a danh muc ung dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung getDanhMucUngDung(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.getDanhMucUngDung(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh muc ung dungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of danh muc ung dungs
	* @param end the upper bound of the range of danh muc ung dungs (not inclusive)
	* @return the range of danh muc ung dungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.DanhMucUngDung> getDanhMucUngDungs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.getDanhMucUngDungs(start, end);
	}

	/**
	* Returns the number of danh muc ung dungs.
	*
	* @return the number of danh muc ung dungs
	* @throws SystemException if a system exception occurred
	*/
	public int getDanhMucUngDungsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.getDanhMucUngDungsCount();
	}

	/**
	* Updates the danh muc ung dung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhMucUngDung the danh muc ung dung
	* @return the danh muc ung dung that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung updateDanhMucUngDung(
		org.oep.cmon.dao.dvc.model.DanhMucUngDung danhMucUngDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.updateDanhMucUngDung(danhMucUngDung);
	}

	/**
	* Updates the danh muc ung dung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhMucUngDung the danh muc ung dung
	* @param merge whether to merge the danh muc ung dung with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the danh muc ung dung that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung updateDanhMucUngDung(
		org.oep.cmon.dao.dvc.model.DanhMucUngDung danhMucUngDung, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.updateDanhMucUngDung(danhMucUngDung,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _danhMucUngDungLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_danhMucUngDungLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* This is fucntion get DanhMucUngDung by status
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param int status
	* @return List<DanhMucUngDung>
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.DanhMucUngDung> getDSUngDung(
		int status) {
		return _danhMucUngDungLocalService.getDSUngDung(status);
	}

	/**
	* This is fucntion get DanhMucUngDung by Ma
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of ma
	* @return DanhMucUngDung
	*/
	public org.oep.cmon.dao.dvc.model.DanhMucUngDung getUngDungTheoMa(
		java.lang.String ma) {
		return _danhMucUngDungLocalService.getUngDungTheoMa(ma);
	}

	/**
	* This is fucntion find DanhMucUngDung by ten
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of ten
	* @return List<DanhMucUngDung>
	*/
	public java.util.List<org.oep.cmon.dao.dvc.model.DanhMucUngDung> findTen(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.findTen(ten);
	}

	/**
	* This is fucntion getId DanhMucUngDung by maDMUngdung
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of maDMUngdung
	* @return int
	*/
	public int getIdDanhmucUngdung(java.lang.String maDMUngdung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _danhMucUngDungLocalService.getIdDanhmucUngdung(maDMUngdung);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DanhMucUngDungLocalService getWrappedDanhMucUngDungLocalService() {
		return _danhMucUngDungLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDanhMucUngDungLocalService(
		DanhMucUngDungLocalService danhMucUngDungLocalService) {
		_danhMucUngDungLocalService = danhMucUngDungLocalService;
	}

	public DanhMucUngDungLocalService getWrappedService() {
		return _danhMucUngDungLocalService;
	}

	public void setWrappedService(
		DanhMucUngDungLocalService danhMucUngDungLocalService) {
		_danhMucUngDungLocalService = danhMucUngDungLocalService;
	}

	private DanhMucUngDungLocalService _danhMucUngDungLocalService;
}