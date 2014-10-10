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

package org.oep.cmon.dao.nsd.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TaiNguyenLocalService}.
 * </p>
 *
 * @author    Liemnn
 * @see       TaiNguyenLocalService
 * @generated
 */
public class TaiNguyenLocalServiceWrapper implements TaiNguyenLocalService,
	ServiceWrapper<TaiNguyenLocalService> {
	public TaiNguyenLocalServiceWrapper(
		TaiNguyenLocalService taiNguyenLocalService) {
		_taiNguyenLocalService = taiNguyenLocalService;
	}

	/**
	* Adds the tai nguyen to the database. Also notifies the appropriate model listeners.
	*
	* @param taiNguyen the tai nguyen
	* @return the tai nguyen that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen addTaiNguyen(
		org.oep.cmon.dao.nsd.model.TaiNguyen taiNguyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.addTaiNguyen(taiNguyen);
	}

	/**
	* Creates a new tai nguyen with the primary key. Does not add the tai nguyen to the database.
	*
	* @param id the primary key for the new tai nguyen
	* @return the new tai nguyen
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen createTaiNguyen(long id) {
		return _taiNguyenLocalService.createTaiNguyen(id);
	}

	/**
	* Deletes the tai nguyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tai nguyen
	* @throws PortalException if a tai nguyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTaiNguyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_taiNguyenLocalService.deleteTaiNguyen(id);
	}

	/**
	* Deletes the tai nguyen from the database. Also notifies the appropriate model listeners.
	*
	* @param taiNguyen the tai nguyen
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTaiNguyen(org.oep.cmon.dao.nsd.model.TaiNguyen taiNguyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		_taiNguyenLocalService.deleteTaiNguyen(taiNguyen);
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
		return _taiNguyenLocalService.dynamicQuery(dynamicQuery);
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
		return _taiNguyenLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _taiNguyenLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _taiNguyenLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.nsd.model.TaiNguyen fetchTaiNguyen(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.fetchTaiNguyen(id);
	}

	/**
	* Returns the tai nguyen with the primary key.
	*
	* @param id the primary key of the tai nguyen
	* @return the tai nguyen
	* @throws PortalException if a tai nguyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen getTaiNguyen(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.getTaiNguyen(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tai nguyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tai nguyens
	* @param end the upper bound of the range of tai nguyens (not inclusive)
	* @return the range of tai nguyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.nsd.model.TaiNguyen> getTaiNguyens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.getTaiNguyens(start, end);
	}

	/**
	* Returns the number of tai nguyens.
	*
	* @return the number of tai nguyens
	* @throws SystemException if a system exception occurred
	*/
	public int getTaiNguyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.getTaiNguyensCount();
	}

	/**
	* Updates the tai nguyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taiNguyen the tai nguyen
	* @return the tai nguyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen updateTaiNguyen(
		org.oep.cmon.dao.nsd.model.TaiNguyen taiNguyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.updateTaiNguyen(taiNguyen);
	}

	/**
	* Updates the tai nguyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taiNguyen the tai nguyen
	* @param merge whether to merge the tai nguyen with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tai nguyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen updateTaiNguyen(
		org.oep.cmon.dao.nsd.model.TaiNguyen taiNguyen, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taiNguyenLocalService.updateTaiNguyen(taiNguyen, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _taiNguyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taiNguyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* This is fucntion findByTen
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String ten, int loai, String giaTri,
	Long ungDungId, Long heThongId, int daXoa
	* @return TaiNguyen
	*/
	public org.oep.cmon.dao.nsd.model.TaiNguyen findByTen(
		java.lang.String ten, int loai, java.lang.String giaTri,
		java.lang.Long ungDungId, java.lang.Long heThongId, int daXoa)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.nsd.NoSuchTaiNguyenException {
		return _taiNguyenLocalService.findByTen(ten, loai, giaTri, ungDungId,
			heThongId, daXoa);
	}

	/**
	* This is fucntion searchByVaiTroId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param Long vaiTroId, int daXoa, int start,int end
	* @return List<TaiNguyen>
	*/
	public java.util.List<org.oep.cmon.dao.nsd.model.TaiNguyen> searchByVaiTroId(
		java.lang.Long vaiTroId, int daXoa, int start, int end) {
		return _taiNguyenLocalService.searchByVaiTroId(vaiTroId, daXoa, start,
			end);
	}

	/**
	* This is fucntion countByVaiTroId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param Long vaiTroId, int daXoa
	* @return long
	*/
	public long countByVaiTroId(java.lang.Long vaiTroId, int daXoa) {
		return _taiNguyenLocalService.countByVaiTroId(vaiTroId, daXoa);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TaiNguyenLocalService getWrappedTaiNguyenLocalService() {
		return _taiNguyenLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTaiNguyenLocalService(
		TaiNguyenLocalService taiNguyenLocalService) {
		_taiNguyenLocalService = taiNguyenLocalService;
	}

	public TaiNguyenLocalService getWrappedService() {
		return _taiNguyenLocalService;
	}

	public void setWrappedService(TaiNguyenLocalService taiNguyenLocalService) {
		_taiNguyenLocalService = taiNguyenLocalService;
	}

	private TaiNguyenLocalService _taiNguyenLocalService;
}