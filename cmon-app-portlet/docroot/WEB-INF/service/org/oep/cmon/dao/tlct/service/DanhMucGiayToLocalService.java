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

package org.oep.cmon.dao.tlct.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the danh muc giay to local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Liemnn
 * @see DanhMucGiayToLocalServiceUtil
 * @see org.oep.cmon.dao.tlct.service.base.DanhMucGiayToLocalServiceBaseImpl
 * @see org.oep.cmon.dao.tlct.service.impl.DanhMucGiayToLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DanhMucGiayToLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DanhMucGiayToLocalServiceUtil} to access the danh muc giay to local service. Add custom service methods to {@link org.oep.cmon.dao.tlct.service.impl.DanhMucGiayToLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the danh muc giay to to the database. Also notifies the appropriate model listeners.
	*
	* @param danhMucGiayTo the danh muc giay to
	* @return the danh muc giay to that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo addDanhMucGiayTo(
		org.oep.cmon.dao.tlct.model.DanhMucGiayTo danhMucGiayTo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new danh muc giay to with the primary key. Does not add the danh muc giay to to the database.
	*
	* @param id the primary key for the new danh muc giay to
	* @return the new danh muc giay to
	*/
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo createDanhMucGiayTo(
		long id);

	/**
	* Deletes the danh muc giay to with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the danh muc giay to
	* @throws PortalException if a danh muc giay to with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDanhMucGiayTo(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the danh muc giay to from the database. Also notifies the appropriate model listeners.
	*
	* @param danhMucGiayTo the danh muc giay to
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDanhMucGiayTo(
		org.oep.cmon.dao.tlct.model.DanhMucGiayTo danhMucGiayTo)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo fetchDanhMucGiayTo(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the danh muc giay to with the primary key.
	*
	* @param id the primary key of the danh muc giay to
	* @return the danh muc giay to
	* @throws PortalException if a danh muc giay to with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo getDanhMucGiayTo(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the danh muc giay tos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of danh muc giay tos
	* @param end the upper bound of the range of danh muc giay tos (not inclusive)
	* @return the range of danh muc giay tos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> getDanhMucGiayTos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of danh muc giay tos.
	*
	* @return the number of danh muc giay tos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDanhMucGiayTosCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the danh muc giay to in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhMucGiayTo the danh muc giay to
	* @return the danh muc giay to that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo updateDanhMucGiayTo(
		org.oep.cmon.dao.tlct.model.DanhMucGiayTo danhMucGiayTo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the danh muc giay to in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhMucGiayTo the danh muc giay to
	* @param merge whether to merge the danh muc giay to with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the danh muc giay to that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo updateDanhMucGiayTo(
		org.oep.cmon.dao.tlct.model.DanhMucGiayTo danhMucGiayTo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	/**
	* This is fucntion getGiayToBoiMa
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String ma
	* @return DanhMucGiayTo
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo getGiayToBoiMa(
		java.lang.String ma);

	/**
	* This is fucntion searchDanhMucGiayTo
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String group, Long doiTuongId,int start, int end
	* @return List<DanhMucGiayTo>
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> searchDanhMucGiayTo(
		java.lang.String group, java.lang.Long doiTuongId, int start, int end);

	/**
	* This is fucntion countDanhMucGiayTo
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String group, Long doiTuongId
	* @return long
	*/
	public long countDanhMucGiayTo(java.lang.String group,
		java.lang.Long doiTuongId);

	/**
	* This is fucntion searchByTTHCIdOrGDId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String group,String doituong, Long tthcid, Long dgId, Integer daXoa, int start,int end
	* @return List<DanhMucGiayTo>
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> searchByTTHCIdOrGDId(
		java.lang.String group, java.lang.String doituong,
		java.lang.Long tthcid, java.lang.Long dgId, java.lang.Integer daXoa,
		int start, int end);

	/**
	* This is fucntion countByTTHCIdOrGDId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String group,String doituong, Long tthcid, Long dgId, Integer daXoa
	* @return long
	*/
	public long countByTTHCIdOrGDId(java.lang.String group,
		java.lang.String doituong, java.lang.Long tthcid, java.lang.Long dgId,
		java.lang.Integer daXoa);

	/**
	* This is fucntion findGiayToKetQua
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long thutuchanhchinhId
	* @return List<DanhMucGiayTo>
	*/
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> findGiayToKetQua(
		long thutuchanhchinhId);

	/**
	* This is fucntion finlistGiayToBCNopDon
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long hosothutuchccId
	* @return List<DanhMucGiayTo>
	*/
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> finlistGiayToBCNopDon(
		long hosothutuchccId);

	/**
	* This is fucntion findTheoMa
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String ma
	* @return DanhMucGiayTo
	*/
	public org.oep.cmon.dao.tlct.model.DanhMucGiayTo findTheoMa(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException;

	/**
	* This is fucntion getDanhMucGiayToList
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param int daXoa
	* @return List<DanhMucGiayTo>
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> getDanhMucGiayToList(
		int daXoa);

	/**
	* This is fucntion listByCongDan
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param Long doiTuongId
	* @return List<DanhMucGiayTo>
	*/
	public java.util.List<org.oep.cmon.dao.tlct.model.DanhMucGiayTo> listByCongDan(
		java.lang.Long doiTuongId)
		throws com.liferay.portal.kernel.exception.SystemException;
}