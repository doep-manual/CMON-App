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

package org.oep.cmon.dao.chungthuc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link HoSoChungThucLocalService}.
 * </p>
 *
 * @author    vietho
 * @see       HoSoChungThucLocalService
 * @generated
 */
public class HoSoChungThucLocalServiceWrapper
	implements HoSoChungThucLocalService,
		ServiceWrapper<HoSoChungThucLocalService> {
	public HoSoChungThucLocalServiceWrapper(
		HoSoChungThucLocalService hoSoChungThucLocalService) {
		_hoSoChungThucLocalService = hoSoChungThucLocalService;
	}

	/**
	* Adds the ho so chung thuc to the database. Also notifies the appropriate model listeners.
	*
	* @param hoSoChungThuc the ho so chung thuc
	* @return the ho so chung thuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc addHoSoChungThuc(
		org.oep.cmon.dao.chungthuc.model.HoSoChungThuc hoSoChungThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.addHoSoChungThuc(hoSoChungThuc);
	}

	/**
	* Creates a new ho so chung thuc with the primary key. Does not add the ho so chung thuc to the database.
	*
	* @param hoSoChungThucId the primary key for the new ho so chung thuc
	* @return the new ho so chung thuc
	*/
	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc createHoSoChungThuc(
		long hoSoChungThucId) {
		return _hoSoChungThucLocalService.createHoSoChungThuc(hoSoChungThucId);
	}

	/**
	* Deletes the ho so chung thuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hoSoChungThucId the primary key of the ho so chung thuc
	* @throws PortalException if a ho so chung thuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHoSoChungThuc(long hoSoChungThucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_hoSoChungThucLocalService.deleteHoSoChungThuc(hoSoChungThucId);
	}

	/**
	* Deletes the ho so chung thuc from the database. Also notifies the appropriate model listeners.
	*
	* @param hoSoChungThuc the ho so chung thuc
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHoSoChungThuc(
		org.oep.cmon.dao.chungthuc.model.HoSoChungThuc hoSoChungThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		_hoSoChungThucLocalService.deleteHoSoChungThuc(hoSoChungThuc);
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
		return _hoSoChungThucLocalService.dynamicQuery(dynamicQuery);
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
		return _hoSoChungThucLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _hoSoChungThucLocalService.dynamicQuery(dynamicQuery, start,
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
		return _hoSoChungThucLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc fetchHoSoChungThuc(
		long hoSoChungThucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.fetchHoSoChungThuc(hoSoChungThucId);
	}

	/**
	* Returns the ho so chung thuc with the primary key.
	*
	* @param hoSoChungThucId the primary key of the ho so chung thuc
	* @return the ho so chung thuc
	* @throws PortalException if a ho so chung thuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc getHoSoChungThuc(
		long hoSoChungThucId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHoSoChungThuc(hoSoChungThucId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ho so chung thucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ho so chung thucs
	* @param end the upper bound of the range of ho so chung thucs (not inclusive)
	* @return the range of ho so chung thucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.chungthuc.model.HoSoChungThuc> getHoSoChungThucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHoSoChungThucs(start, end);
	}

	/**
	* Returns the number of ho so chung thucs.
	*
	* @return the number of ho so chung thucs
	* @throws SystemException if a system exception occurred
	*/
	public int getHoSoChungThucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHoSoChungThucsCount();
	}

	/**
	* Updates the ho so chung thuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoSoChungThuc the ho so chung thuc
	* @return the ho so chung thuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc updateHoSoChungThuc(
		org.oep.cmon.dao.chungthuc.model.HoSoChungThuc hoSoChungThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.updateHoSoChungThuc(hoSoChungThuc);
	}

	/**
	* Updates the ho so chung thuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoSoChungThuc the ho so chung thuc
	* @param merge whether to merge the ho so chung thuc with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the ho so chung thuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.chungthuc.model.HoSoChungThuc updateHoSoChungThuc(
		org.oep.cmon.dao.chungthuc.model.HoSoChungThuc hoSoChungThuc,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.updateHoSoChungThuc(hoSoChungThuc,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _hoSoChungThucLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hoSoChungThucLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* This is fucntion get HoSoChungThuc by tthcId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long tthcId
	* @return List<HoSoChungThuc>
	*/
	public java.util.List<org.oep.cmon.dao.chungthuc.model.HoSoChungThuc> getHSChungThucByTTHC(
		long tthcId) throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHSChungThucByTTHC(tthcId);
	}

	/**
	* This is fucntion get HoSoChungThuc by tthcId and paging
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long tthcId, int start, int end
	* @return List<HoSoChungThuc>
	*/
	public java.util.List<org.oep.cmon.dao.chungthuc.model.HoSoChungThuc> getHSChungThucByTTHC(
		long tthcId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHSChungThucByTTHC(tthcId, start,
			end);
	}

	/**
	* This is fucntion count HoSoChungThuc  by tthcId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long tthcId, int start, int end
	* @return List<HoSoChungThuc>
	*/
	public long countHSChungThucByTTHC(long tthcId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.countHSChungThucByTTHC(tthcId, start,
			end);
	}

	/**
	* This is fucntion get HoSoChungThuc by tthcId ,canBoTiepNhanId, coQuanId,soChungThuc
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long tthcId, long canBoTiepNhanId, long coQuanId, String soChungThuc, int start, int end
	* @return List<HoSoChungThuc>
	*/
	public java.util.List<org.oep.cmon.dao.chungthuc.model.HoSoChungThuc> getHoSoChungThucByTTHCAndSCT(
		long tthcId, long canBoTiepNhanId, long coQuanId,
		java.lang.String soChungThuc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.getHoSoChungThucByTTHCAndSCT(tthcId,
			canBoTiepNhanId, coQuanId, soChungThuc, start, end);
	}

	/**
	* This is fucntion count HoSoChungThuc by tthcId,canBoTiepNhanId, coQuanId, soChungThuc
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long tthcId, long canBoTiepNhanId, long coQuanId, String soChungThuc, int start, int end
	* @return int
	*/
	public int countHoSoChungThucByTTHCAndSCT(long tthcId,
		long canBoTiepNhanId, long coQuanId, java.lang.String soChungThuc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.countHoSoChungThucByTTHCAndSCT(tthcId,
			canBoTiepNhanId, coQuanId, soChungThuc, start, end);
	}

	/**
	* This is fucntion find HoSoChungThuc by thuTucHanhChinhId,soDanhMucId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : long thuTucHanhChinhId, long soDanhMucId
	* @return List<HoSoChungThuc>
	*/
	public java.util.List<org.oep.cmon.dao.chungthuc.model.HoSoChungThuc> findByTheoTTHCIDAndSoDanhMucId(
		long thuTucHanhChinhId, long soDanhMucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoChungThucLocalService.findByTheoTTHCIDAndSoDanhMucId(thuTucHanhChinhId,
			soDanhMucId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public HoSoChungThucLocalService getWrappedHoSoChungThucLocalService() {
		return _hoSoChungThucLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedHoSoChungThucLocalService(
		HoSoChungThucLocalService hoSoChungThucLocalService) {
		_hoSoChungThucLocalService = hoSoChungThucLocalService;
	}

	public HoSoChungThucLocalService getWrappedService() {
		return _hoSoChungThucLocalService;
	}

	public void setWrappedService(
		HoSoChungThucLocalService hoSoChungThucLocalService) {
		_hoSoChungThucLocalService = hoSoChungThucLocalService;
	}

	private HoSoChungThucLocalService _hoSoChungThucLocalService;
}