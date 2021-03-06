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

package org.oep.cmon.dao.dn.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link YeuCauDangKyDoanhNghiepLocalService}.
 * </p>
 *
 * @author    Liemnn
 * @see       YeuCauDangKyDoanhNghiepLocalService
 * @generated
 */
public class YeuCauDangKyDoanhNghiepLocalServiceWrapper
	implements YeuCauDangKyDoanhNghiepLocalService,
		ServiceWrapper<YeuCauDangKyDoanhNghiepLocalService> {
	public YeuCauDangKyDoanhNghiepLocalServiceWrapper(
		YeuCauDangKyDoanhNghiepLocalService yeuCauDangKyDoanhNghiepLocalService) {
		_yeuCauDangKyDoanhNghiepLocalService = yeuCauDangKyDoanhNghiepLocalService;
	}

	/**
	* Adds the yeu cau dang ky doanh nghiep to the database. Also notifies the appropriate model listeners.
	*
	* @param yeuCauDangKyDoanhNghiep the yeu cau dang ky doanh nghiep
	* @return the yeu cau dang ky doanh nghiep that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep addYeuCauDangKyDoanhNghiep(
		org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep yeuCauDangKyDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.addYeuCauDangKyDoanhNghiep(yeuCauDangKyDoanhNghiep);
	}

	/**
	* Creates a new yeu cau dang ky doanh nghiep with the primary key. Does not add the yeu cau dang ky doanh nghiep to the database.
	*
	* @param id the primary key for the new yeu cau dang ky doanh nghiep
	* @return the new yeu cau dang ky doanh nghiep
	*/
	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep createYeuCauDangKyDoanhNghiep(
		long id) {
		return _yeuCauDangKyDoanhNghiepLocalService.createYeuCauDangKyDoanhNghiep(id);
	}

	/**
	* Deletes the yeu cau dang ky doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the yeu cau dang ky doanh nghiep
	* @throws PortalException if a yeu cau dang ky doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteYeuCauDangKyDoanhNghiep(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_yeuCauDangKyDoanhNghiepLocalService.deleteYeuCauDangKyDoanhNghiep(id);
	}

	/**
	* Deletes the yeu cau dang ky doanh nghiep from the database. Also notifies the appropriate model listeners.
	*
	* @param yeuCauDangKyDoanhNghiep the yeu cau dang ky doanh nghiep
	* @throws SystemException if a system exception occurred
	*/
	public void deleteYeuCauDangKyDoanhNghiep(
		org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep yeuCauDangKyDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		_yeuCauDangKyDoanhNghiepLocalService.deleteYeuCauDangKyDoanhNghiep(yeuCauDangKyDoanhNghiep);
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
		return _yeuCauDangKyDoanhNghiepLocalService.dynamicQuery(dynamicQuery);
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
		return _yeuCauDangKyDoanhNghiepLocalService.dynamicQuery(dynamicQuery,
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _yeuCauDangKyDoanhNghiepLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep fetchYeuCauDangKyDoanhNghiep(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.fetchYeuCauDangKyDoanhNghiep(id);
	}

	/**
	* Returns the yeu cau dang ky doanh nghiep with the primary key.
	*
	* @param id the primary key of the yeu cau dang ky doanh nghiep
	* @return the yeu cau dang ky doanh nghiep
	* @throws PortalException if a yeu cau dang ky doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep getYeuCauDangKyDoanhNghiep(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.getYeuCauDangKyDoanhNghiep(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the yeu cau dang ky doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of yeu cau dang ky doanh nghieps
	* @param end the upper bound of the range of yeu cau dang ky doanh nghieps (not inclusive)
	* @return the range of yeu cau dang ky doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep> getYeuCauDangKyDoanhNghieps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.getYeuCauDangKyDoanhNghieps(start,
			end);
	}

	/**
	* Returns the number of yeu cau dang ky doanh nghieps.
	*
	* @return the number of yeu cau dang ky doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public int getYeuCauDangKyDoanhNghiepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.getYeuCauDangKyDoanhNghiepsCount();
	}

	/**
	* Updates the yeu cau dang ky doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param yeuCauDangKyDoanhNghiep the yeu cau dang ky doanh nghiep
	* @return the yeu cau dang ky doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep updateYeuCauDangKyDoanhNghiep(
		org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep yeuCauDangKyDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.updateYeuCauDangKyDoanhNghiep(yeuCauDangKyDoanhNghiep);
	}

	/**
	* Updates the yeu cau dang ky doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param yeuCauDangKyDoanhNghiep the yeu cau dang ky doanh nghiep
	* @param merge whether to merge the yeu cau dang ky doanh nghiep with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the yeu cau dang ky doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep updateYeuCauDangKyDoanhNghiep(
		org.oep.cmon.dao.dn.model.YeuCauDangKyDoanhNghiep yeuCauDangKyDoanhNghiep,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yeuCauDangKyDoanhNghiepLocalService.updateYeuCauDangKyDoanhNghiep(yeuCauDangKyDoanhNghiep,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _yeuCauDangKyDoanhNghiepLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_yeuCauDangKyDoanhNghiepLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public YeuCauDangKyDoanhNghiepLocalService getWrappedYeuCauDangKyDoanhNghiepLocalService() {
		return _yeuCauDangKyDoanhNghiepLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedYeuCauDangKyDoanhNghiepLocalService(
		YeuCauDangKyDoanhNghiepLocalService yeuCauDangKyDoanhNghiepLocalService) {
		_yeuCauDangKyDoanhNghiepLocalService = yeuCauDangKyDoanhNghiepLocalService;
	}

	public YeuCauDangKyDoanhNghiepLocalService getWrappedService() {
		return _yeuCauDangKyDoanhNghiepLocalService;
	}

	public void setWrappedService(
		YeuCauDangKyDoanhNghiepLocalService yeuCauDangKyDoanhNghiepLocalService) {
		_yeuCauDangKyDoanhNghiepLocalService = yeuCauDangKyDoanhNghiepLocalService;
	}

	private YeuCauDangKyDoanhNghiepLocalService _yeuCauDangKyDoanhNghiepLocalService;
}