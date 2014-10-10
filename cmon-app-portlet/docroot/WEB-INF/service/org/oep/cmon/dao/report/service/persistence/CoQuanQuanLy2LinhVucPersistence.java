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

package org.oep.cmon.dao.report.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc;

/**
 * The persistence interface for the co quan quan ly2 linh vuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author VIENPN
 * @see CoQuanQuanLy2LinhVucPersistenceImpl
 * @see CoQuanQuanLy2LinhVucUtil
 * @generated
 */
public interface CoQuanQuanLy2LinhVucPersistence extends BasePersistence<CoQuanQuanLy2LinhVuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CoQuanQuanLy2LinhVucUtil} to access the co quan quan ly2 linh vuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the co quan quan ly2 linh vuc in the entity cache if it is enabled.
	*
	* @param coQuanQuanLy2LinhVuc the co quan quan ly2 linh vuc
	*/
	public void cacheResult(
		org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc coQuanQuanLy2LinhVuc);

	/**
	* Caches the co quan quan ly2 linh vucs in the entity cache if it is enabled.
	*
	* @param coQuanQuanLy2LinhVucs the co quan quan ly2 linh vucs
	*/
	public void cacheResult(
		java.util.List<org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc> coQuanQuanLy2LinhVucs);

	/**
	* Creates a new co quan quan ly2 linh vuc with the primary key. Does not add the co quan quan ly2 linh vuc to the database.
	*
	* @param NHOMTHUTUCHANHCHINHID the primary key for the new co quan quan ly2 linh vuc
	* @return the new co quan quan ly2 linh vuc
	*/
	public org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc create(
		long NHOMTHUTUCHANHCHINHID);

	/**
	* Removes the co quan quan ly2 linh vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param NHOMTHUTUCHANHCHINHID the primary key of the co quan quan ly2 linh vuc
	* @return the co quan quan ly2 linh vuc that was removed
	* @throws org.oep.cmon.dao.report.NoSuchCoQuanQuanLy2LinhVucException if a co quan quan ly2 linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc remove(
		long NHOMTHUTUCHANHCHINHID)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.report.NoSuchCoQuanQuanLy2LinhVucException;

	public org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc updateImpl(
		org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc coQuanQuanLy2LinhVuc,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the co quan quan ly2 linh vuc with the primary key or throws a {@link org.oep.cmon.dao.report.NoSuchCoQuanQuanLy2LinhVucException} if it could not be found.
	*
	* @param NHOMTHUTUCHANHCHINHID the primary key of the co quan quan ly2 linh vuc
	* @return the co quan quan ly2 linh vuc
	* @throws org.oep.cmon.dao.report.NoSuchCoQuanQuanLy2LinhVucException if a co quan quan ly2 linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc findByPrimaryKey(
		long NHOMTHUTUCHANHCHINHID)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.report.NoSuchCoQuanQuanLy2LinhVucException;

	/**
	* Returns the co quan quan ly2 linh vuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param NHOMTHUTUCHANHCHINHID the primary key of the co quan quan ly2 linh vuc
	* @return the co quan quan ly2 linh vuc, or <code>null</code> if a co quan quan ly2 linh vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc fetchByPrimaryKey(
		long NHOMTHUTUCHANHCHINHID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the co quan quan ly2 linh vucs.
	*
	* @return the co quan quan ly2 linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the co quan quan ly2 linh vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of co quan quan ly2 linh vucs
	* @param end the upper bound of the range of co quan quan ly2 linh vucs (not inclusive)
	* @return the range of co quan quan ly2 linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the co quan quan ly2 linh vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of co quan quan ly2 linh vucs
	* @param end the upper bound of the range of co quan quan ly2 linh vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of co quan quan ly2 linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.cmon.dao.report.model.CoQuanQuanLy2LinhVuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the co quan quan ly2 linh vucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of co quan quan ly2 linh vucs.
	*
	* @return the number of co quan quan ly2 linh vucs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}