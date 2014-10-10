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

package org.oep.cmon.dao.report.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the lephi_chitiet local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author VIENPN
 * @see Lephi_chitietLocalServiceUtil
 * @see org.oep.cmon.dao.report.service.base.Lephi_chitietLocalServiceBaseImpl
 * @see org.oep.cmon.dao.report.service.impl.Lephi_chitietLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface Lephi_chitietLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Lephi_chitietLocalServiceUtil} to access the lephi_chitiet local service. Add custom service methods to {@link org.oep.cmon.dao.report.service.impl.Lephi_chitietLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the lephi_chitiet to the database. Also notifies the appropriate model listeners.
	*
	* @param lephi_chitiet the lephi_chitiet
	* @return the lephi_chitiet that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.Lephi_chitiet addLephi_chitiet(
		org.oep.cmon.dao.report.model.Lephi_chitiet lephi_chitiet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new lephi_chitiet with the primary key. Does not add the lephi_chitiet to the database.
	*
	* @param ID the primary key for the new lephi_chitiet
	* @return the new lephi_chitiet
	*/
	public org.oep.cmon.dao.report.model.Lephi_chitiet createLephi_chitiet(
		long ID);

	/**
	* Deletes the lephi_chitiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the lephi_chitiet
	* @throws PortalException if a lephi_chitiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLephi_chitiet(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the lephi_chitiet from the database. Also notifies the appropriate model listeners.
	*
	* @param lephi_chitiet the lephi_chitiet
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLephi_chitiet(
		org.oep.cmon.dao.report.model.Lephi_chitiet lephi_chitiet)
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
	public org.oep.cmon.dao.report.model.Lephi_chitiet fetchLephi_chitiet(
		long ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lephi_chitiet with the primary key.
	*
	* @param ID the primary key of the lephi_chitiet
	* @return the lephi_chitiet
	* @throws PortalException if a lephi_chitiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.cmon.dao.report.model.Lephi_chitiet getLephi_chitiet(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lephi_chitiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of lephi_chitiets
	* @param end the upper bound of the range of lephi_chitiets (not inclusive)
	* @return the range of lephi_chitiets
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.cmon.dao.report.model.Lephi_chitiet> getLephi_chitiets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lephi_chitiets.
	*
	* @return the number of lephi_chitiets
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLephi_chitietsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the lephi_chitiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lephi_chitiet the lephi_chitiet
	* @return the lephi_chitiet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.Lephi_chitiet updateLephi_chitiet(
		org.oep.cmon.dao.report.model.Lephi_chitiet lephi_chitiet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the lephi_chitiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lephi_chitiet the lephi_chitiet
	* @param merge whether to merge the lephi_chitiet with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the lephi_chitiet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.Lephi_chitiet updateLephi_chitiet(
		org.oep.cmon.dao.report.model.Lephi_chitiet lephi_chitiet, boolean merge)
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
	* This is fucntion lephichitiet
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String id_loaihoso,String ngaynhan_tungay, String ngaynhan_denngay
	* @return List<Lephi_chitiet>
	*/
	public java.util.List<org.oep.cmon.dao.report.model.Lephi_chitiet> lephichitiet(
		java.lang.String id_loaihoso, java.lang.String ngaynhan_tungay,
		java.lang.String ngaynhan_denngay) throws java.lang.Exception;
}