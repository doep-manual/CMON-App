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

package org.oep.dlms.dao.capgiaypheplaixe.service.persistence;

import org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe;

import com.liferay.portal.service.persistence.BasePersistence;


/**
 * The persistence interface for the cap giay phep lai xe service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AnhNT
 * @see CapGiayPhepLaiXePersistenceImpl
 * @see CapGiayPhepLaiXeUtil
 * @generated
 */
public interface CapGiayPhepLaiXePersistence extends BasePersistence<CapGiayPhepLaiXe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CapGiayPhepLaiXeUtil} to access the cap giay phep lai xe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cap giay phep lai xe in the entity cache if it is enabled.
	*
	* @param capGiayPhepLaiXe the cap giay phep lai xe
	*/
	public void cacheResult(
		org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe capGiayPhepLaiXe);

	/**
	* Caches the cap giay phep lai xes in the entity cache if it is enabled.
	*
	* @param capGiayPhepLaiXes the cap giay phep lai xes
	*/
	public void cacheResult(
		java.util.List<org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe> capGiayPhepLaiXes);

	/**
	* Creates a new cap giay phep lai xe with the primary key. Does not add the cap giay phep lai xe to the database.
	*
	* @param id the primary key for the new cap giay phep lai xe
	* @return the new cap giay phep lai xe
	*/
	public org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe create(
		long id);

	/**
	* Removes the cap giay phep lai xe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cap giay phep lai xe
	* @return the cap giay phep lai xe that was removed
	* @throws org.oep.dlms.dao.capgiaypheplaixe.NoSuchCapGiayPhepLaiXeException if a cap giay phep lai xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dlms.dao.capgiaypheplaixe.NoSuchCapGiayPhepLaiXeException;

	public org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe updateImpl(
		org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe capGiayPhepLaiXe,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cap giay phep lai xe with the primary key or throws a {@link org.oep.dlms.dao.capgiaypheplaixe.NoSuchCapGiayPhepLaiXeException} if it could not be found.
	*
	* @param id the primary key of the cap giay phep lai xe
	* @return the cap giay phep lai xe
	* @throws org.oep.dlms.dao.capgiaypheplaixe.NoSuchCapGiayPhepLaiXeException if a cap giay phep lai xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dlms.dao.capgiaypheplaixe.NoSuchCapGiayPhepLaiXeException;

	/**
	* Returns the cap giay phep lai xe with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cap giay phep lai xe
	* @return the cap giay phep lai xe, or <code>null</code> if a cap giay phep lai xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cap giay phep lai xes.
	*
	* @return the cap giay phep lai xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cap giay phep lai xes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of cap giay phep lai xes
	* @param end the upper bound of the range of cap giay phep lai xes (not inclusive)
	* @return the range of cap giay phep lai xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cap giay phep lai xes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of cap giay phep lai xes
	* @param end the upper bound of the range of cap giay phep lai xes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cap giay phep lai xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.dlms.dao.capgiaypheplaixe.model.CapGiayPhepLaiXe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cap giay phep lai xes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cap giay phep lai xes.
	*
	* @return the number of cap giay phep lai xes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}