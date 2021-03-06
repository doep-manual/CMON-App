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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the trinh do hoc van local service. This utility wraps {@link org.oep.cmon.dao.cd.service.impl.TrinhDoHocVanLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LIEMNN
 * @see TrinhDoHocVanLocalService
 * @see org.oep.cmon.dao.cd.service.base.TrinhDoHocVanLocalServiceBaseImpl
 * @see org.oep.cmon.dao.cd.service.impl.TrinhDoHocVanLocalServiceImpl
 * @generated
 */
public class TrinhDoHocVanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.cd.service.impl.TrinhDoHocVanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the trinh do hoc van to the database. Also notifies the appropriate model listeners.
	*
	* @param trinhDoHocVan the trinh do hoc van
	* @return the trinh do hoc van that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan addTrinhDoHocVan(
		org.oep.cmon.dao.cd.model.TrinhDoHocVan trinhDoHocVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTrinhDoHocVan(trinhDoHocVan);
	}

	/**
	* Creates a new trinh do hoc van with the primary key. Does not add the trinh do hoc van to the database.
	*
	* @param id the primary key for the new trinh do hoc van
	* @return the new trinh do hoc van
	*/
	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan createTrinhDoHocVan(
		long id) {
		return getService().createTrinhDoHocVan(id);
	}

	/**
	* Deletes the trinh do hoc van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trinh do hoc van
	* @throws PortalException if a trinh do hoc van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTrinhDoHocVan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTrinhDoHocVan(id);
	}

	/**
	* Deletes the trinh do hoc van from the database. Also notifies the appropriate model listeners.
	*
	* @param trinhDoHocVan the trinh do hoc van
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTrinhDoHocVan(
		org.oep.cmon.dao.cd.model.TrinhDoHocVan trinhDoHocVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTrinhDoHocVan(trinhDoHocVan);
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

	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan fetchTrinhDoHocVan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTrinhDoHocVan(id);
	}

	/**
	* Returns the trinh do hoc van with the primary key.
	*
	* @param id the primary key of the trinh do hoc van
	* @return the trinh do hoc van
	* @throws PortalException if a trinh do hoc van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan getTrinhDoHocVan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTrinhDoHocVan(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the trinh do hoc vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trinh do hoc vans
	* @param end the upper bound of the range of trinh do hoc vans (not inclusive)
	* @return the range of trinh do hoc vans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.cd.model.TrinhDoHocVan> getTrinhDoHocVans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTrinhDoHocVans(start, end);
	}

	/**
	* Returns the number of trinh do hoc vans.
	*
	* @return the number of trinh do hoc vans
	* @throws SystemException if a system exception occurred
	*/
	public static int getTrinhDoHocVansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTrinhDoHocVansCount();
	}

	/**
	* Updates the trinh do hoc van in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trinhDoHocVan the trinh do hoc van
	* @return the trinh do hoc van that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan updateTrinhDoHocVan(
		org.oep.cmon.dao.cd.model.TrinhDoHocVan trinhDoHocVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTrinhDoHocVan(trinhDoHocVan);
	}

	/**
	* Updates the trinh do hoc van in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trinhDoHocVan the trinh do hoc van
	* @param merge whether to merge the trinh do hoc van with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the trinh do hoc van that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.cd.model.TrinhDoHocVan updateTrinhDoHocVan(
		org.oep.cmon.dao.cd.model.TrinhDoHocVan trinhDoHocVan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTrinhDoHocVan(trinhDoHocVan, merge);
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

	/**
	* This is fucntion find all TrinhDoHocVan
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param
	* @return List<TrinhDoHocVan>
	*/
	public static java.util.List<org.oep.cmon.dao.cd.model.TrinhDoHocVan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	/**
	* This is fucntion find TrinhDoHocVan by trangthai
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param int daxoa
	* @return List<TrinhDoHocVan>
	*/
	public static java.util.List<org.oep.cmon.dao.cd.model.TrinhDoHocVan> findByStatus(
		int daxoa) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(daxoa);
	}

	public static void clearService() {
		_service = null;
	}

	public static TrinhDoHocVanLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TrinhDoHocVanLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TrinhDoHocVanLocalService.class.getName(),
					portletClassLoader);

			_service = new TrinhDoHocVanLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TrinhDoHocVanLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TrinhDoHocVanLocalService.class);
		}

		return _service;
	}

	public void setService(TrinhDoHocVanLocalService service) {
		MethodCache.remove(TrinhDoHocVanLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TrinhDoHocVanLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TrinhDoHocVanLocalService.class);
	}

	private static TrinhDoHocVanLocalService _service;
}