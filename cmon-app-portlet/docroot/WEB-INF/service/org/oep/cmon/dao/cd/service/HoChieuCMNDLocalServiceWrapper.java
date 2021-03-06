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

package org.oep.cmon.dao.cd.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link HoChieuCMNDLocalService}.
 * </p>
 *
 * @author    LIEMNN
 * @see       HoChieuCMNDLocalService
 * @generated
 */
public class HoChieuCMNDLocalServiceWrapper implements HoChieuCMNDLocalService,
	ServiceWrapper<HoChieuCMNDLocalService> {
	public HoChieuCMNDLocalServiceWrapper(
		HoChieuCMNDLocalService hoChieuCMNDLocalService) {
		_hoChieuCMNDLocalService = hoChieuCMNDLocalService;
	}

	/**
	* Adds the ho chieu c m n d to the database. Also notifies the appropriate model listeners.
	*
	* @param hoChieuCMND the ho chieu c m n d
	* @return the ho chieu c m n d that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.cd.model.HoChieuCMND addHoChieuCMND(
		org.oep.cmon.dao.cd.model.HoChieuCMND hoChieuCMND)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.addHoChieuCMND(hoChieuCMND);
	}

	/**
	* Creates a new ho chieu c m n d with the primary key. Does not add the ho chieu c m n d to the database.
	*
	* @param id the primary key for the new ho chieu c m n d
	* @return the new ho chieu c m n d
	*/
	public org.oep.cmon.dao.cd.model.HoChieuCMND createHoChieuCMND(long id) {
		return _hoChieuCMNDLocalService.createHoChieuCMND(id);
	}

	/**
	* Deletes the ho chieu c m n d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ho chieu c m n d
	* @throws PortalException if a ho chieu c m n d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHoChieuCMND(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_hoChieuCMNDLocalService.deleteHoChieuCMND(id);
	}

	/**
	* Deletes the ho chieu c m n d from the database. Also notifies the appropriate model listeners.
	*
	* @param hoChieuCMND the ho chieu c m n d
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHoChieuCMND(
		org.oep.cmon.dao.cd.model.HoChieuCMND hoChieuCMND)
		throws com.liferay.portal.kernel.exception.SystemException {
		_hoChieuCMNDLocalService.deleteHoChieuCMND(hoChieuCMND);
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
		return _hoChieuCMNDLocalService.dynamicQuery(dynamicQuery);
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
		return _hoChieuCMNDLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _hoChieuCMNDLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _hoChieuCMNDLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.cd.model.HoChieuCMND fetchHoChieuCMND(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.fetchHoChieuCMND(id);
	}

	/**
	* Returns the ho chieu c m n d with the primary key.
	*
	* @param id the primary key of the ho chieu c m n d
	* @return the ho chieu c m n d
	* @throws PortalException if a ho chieu c m n d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.cd.model.HoChieuCMND getHoChieuCMND(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.getHoChieuCMND(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ho chieu c m n ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ho chieu c m n ds
	* @param end the upper bound of the range of ho chieu c m n ds (not inclusive)
	* @return the range of ho chieu c m n ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.cd.model.HoChieuCMND> getHoChieuCMNDs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.getHoChieuCMNDs(start, end);
	}

	/**
	* Returns the number of ho chieu c m n ds.
	*
	* @return the number of ho chieu c m n ds
	* @throws SystemException if a system exception occurred
	*/
	public int getHoChieuCMNDsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.getHoChieuCMNDsCount();
	}

	/**
	* Updates the ho chieu c m n d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoChieuCMND the ho chieu c m n d
	* @return the ho chieu c m n d that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.cd.model.HoChieuCMND updateHoChieuCMND(
		org.oep.cmon.dao.cd.model.HoChieuCMND hoChieuCMND)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.updateHoChieuCMND(hoChieuCMND);
	}

	/**
	* Updates the ho chieu c m n d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoChieuCMND the ho chieu c m n d
	* @param merge whether to merge the ho chieu c m n d with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the ho chieu c m n d that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.cd.model.HoChieuCMND updateHoChieuCMND(
		org.oep.cmon.dao.cd.model.HoChieuCMND hoChieuCMND, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoChieuCMNDLocalService.updateHoChieuCMND(hoChieuCMND, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _hoChieuCMNDLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hoChieuCMNDLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public HoChieuCMNDLocalService getWrappedHoChieuCMNDLocalService() {
		return _hoChieuCMNDLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedHoChieuCMNDLocalService(
		HoChieuCMNDLocalService hoChieuCMNDLocalService) {
		_hoChieuCMNDLocalService = hoChieuCMNDLocalService;
	}

	public HoChieuCMNDLocalService getWrappedService() {
		return _hoChieuCMNDLocalService;
	}

	public void setWrappedService(
		HoChieuCMNDLocalService hoChieuCMNDLocalService) {
		_hoChieuCMNDLocalService = hoChieuCMNDLocalService;
	}

	private HoChieuCMNDLocalService _hoChieuCMNDLocalService;
}