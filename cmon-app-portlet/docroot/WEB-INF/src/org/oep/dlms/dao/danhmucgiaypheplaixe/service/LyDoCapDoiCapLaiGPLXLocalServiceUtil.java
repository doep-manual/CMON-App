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

package org.oep.dlms.dao.danhmucgiaypheplaixe.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the ly do cap doi cap lai g p l x local service. This utility wraps {@link org.oep.dlms.dao.danhmucgiaypheplaixe.service.impl.LyDoCapDoiCapLaiGPLXLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author AnhNT
 * @see LyDoCapDoiCapLaiGPLXLocalService
 * @see org.oep.dlms.dao.danhmucgiaypheplaixe.service.base.LyDoCapDoiCapLaiGPLXLocalServiceBaseImpl
 * @see org.oep.dlms.dao.danhmucgiaypheplaixe.service.impl.LyDoCapDoiCapLaiGPLXLocalServiceImpl
 * @generated
 */
public class LyDoCapDoiCapLaiGPLXLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.dlms.dao.danhmucgiaypheplaixe.service.impl.LyDoCapDoiCapLaiGPLXLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ly do cap doi cap lai g p l x to the database. Also notifies the appropriate model listeners.
	*
	* @param lyDoCapDoiCapLaiGPLX the ly do cap doi cap lai g p l x
	* @return the ly do cap doi cap lai g p l x that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX addLyDoCapDoiCapLaiGPLX(
		org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX lyDoCapDoiCapLaiGPLX)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLyDoCapDoiCapLaiGPLX(lyDoCapDoiCapLaiGPLX);
	}

	/**
	* Creates a new ly do cap doi cap lai g p l x with the primary key. Does not add the ly do cap doi cap lai g p l x to the database.
	*
	* @param id the primary key for the new ly do cap doi cap lai g p l x
	* @return the new ly do cap doi cap lai g p l x
	*/
	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX createLyDoCapDoiCapLaiGPLX(
		long id) {
		return getService().createLyDoCapDoiCapLaiGPLX(id);
	}

	/**
	* Deletes the ly do cap doi cap lai g p l x with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ly do cap doi cap lai g p l x
	* @throws PortalException if a ly do cap doi cap lai g p l x with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLyDoCapDoiCapLaiGPLX(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLyDoCapDoiCapLaiGPLX(id);
	}

	/**
	* Deletes the ly do cap doi cap lai g p l x from the database. Also notifies the appropriate model listeners.
	*
	* @param lyDoCapDoiCapLaiGPLX the ly do cap doi cap lai g p l x
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteLyDoCapDoiCapLaiGPLX(
		org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX lyDoCapDoiCapLaiGPLX)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLyDoCapDoiCapLaiGPLX(lyDoCapDoiCapLaiGPLX);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX fetchLyDoCapDoiCapLaiGPLX(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLyDoCapDoiCapLaiGPLX(id);
	}

	/**
	* Returns the ly do cap doi cap lai g p l x with the primary key.
	*
	* @param id the primary key of the ly do cap doi cap lai g p l x
	* @return the ly do cap doi cap lai g p l x
	* @throws PortalException if a ly do cap doi cap lai g p l x with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX getLyDoCapDoiCapLaiGPLX(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLyDoCapDoiCapLaiGPLX(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the ly do cap doi cap lai g p l xs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ly do cap doi cap lai g p l xs
	* @param end the upper bound of the range of ly do cap doi cap lai g p l xs (not inclusive)
	* @return the range of ly do cap doi cap lai g p l xs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX> getLyDoCapDoiCapLaiGPLXs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLyDoCapDoiCapLaiGPLXs(start, end);
	}

	/**
	* Returns the number of ly do cap doi cap lai g p l xs.
	*
	* @return the number of ly do cap doi cap lai g p l xs
	* @throws SystemException if a system exception occurred
	*/
	public static int getLyDoCapDoiCapLaiGPLXsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLyDoCapDoiCapLaiGPLXsCount();
	}

	/**
	* Updates the ly do cap doi cap lai g p l x in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lyDoCapDoiCapLaiGPLX the ly do cap doi cap lai g p l x
	* @return the ly do cap doi cap lai g p l x that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX updateLyDoCapDoiCapLaiGPLX(
		org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX lyDoCapDoiCapLaiGPLX)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLyDoCapDoiCapLaiGPLX(lyDoCapDoiCapLaiGPLX);
	}

	/**
	* Updates the ly do cap doi cap lai g p l x in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lyDoCapDoiCapLaiGPLX the ly do cap doi cap lai g p l x
	* @param merge whether to merge the ly do cap doi cap lai g p l x with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the ly do cap doi cap lai g p l x that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX updateLyDoCapDoiCapLaiGPLX(
		org.oep.dlms.dao.danhmucgiaypheplaixe.model.LyDoCapDoiCapLaiGPLX lyDoCapDoiCapLaiGPLX,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateLyDoCapDoiCapLaiGPLX(lyDoCapDoiCapLaiGPLX, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static void clearService() {
		_service = null;
	}

	public static LyDoCapDoiCapLaiGPLXLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LyDoCapDoiCapLaiGPLXLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					LyDoCapDoiCapLaiGPLXLocalService.class.getName(),
					portletClassLoader);

			_service = new LyDoCapDoiCapLaiGPLXLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(LyDoCapDoiCapLaiGPLXLocalServiceUtil.class,
				"_service");
			MethodCache.remove(LyDoCapDoiCapLaiGPLXLocalService.class);
		}

		return _service;
	}

	public void setService(LyDoCapDoiCapLaiGPLXLocalService service) {
		MethodCache.remove(LyDoCapDoiCapLaiGPLXLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(LyDoCapDoiCapLaiGPLXLocalServiceUtil.class,
			"_service");
		MethodCache.remove(LyDoCapDoiCapLaiGPLXLocalService.class);
	}

	private static LyDoCapDoiCapLaiGPLXLocalService _service;
}