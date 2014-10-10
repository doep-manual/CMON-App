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

package org.oep.cmon.dao.touchscreen.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the tra cuu ho so t t h c cong local service. This utility wraps {@link org.oep.cmon.dao.touchscreen.service.impl.TraCuuHoSoTTHCCongLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author VIENPN
 * @see TraCuuHoSoTTHCCongLocalService
 * @see org.oep.cmon.dao.touchscreen.service.base.TraCuuHoSoTTHCCongLocalServiceBaseImpl
 * @see org.oep.cmon.dao.touchscreen.service.impl.TraCuuHoSoTTHCCongLocalServiceImpl
 * @generated
 */
public class TraCuuHoSoTTHCCongLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.touchscreen.service.impl.TraCuuHoSoTTHCCongLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tra cuu ho so t t h c cong to the database. Also notifies the appropriate model listeners.
	*
	* @param traCuuHoSoTTHCCong the tra cuu ho so t t h c cong
	* @return the tra cuu ho so t t h c cong that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong addTraCuuHoSoTTHCCong(
		org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong traCuuHoSoTTHCCong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTraCuuHoSoTTHCCong(traCuuHoSoTTHCCong);
	}

	/**
	* Creates a new tra cuu ho so t t h c cong with the primary key. Does not add the tra cuu ho so t t h c cong to the database.
	*
	* @param id the primary key for the new tra cuu ho so t t h c cong
	* @return the new tra cuu ho so t t h c cong
	*/
	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong createTraCuuHoSoTTHCCong(
		long id) {
		return getService().createTraCuuHoSoTTHCCong(id);
	}

	/**
	* Deletes the tra cuu ho so t t h c cong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tra cuu ho so t t h c cong
	* @throws PortalException if a tra cuu ho so t t h c cong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTraCuuHoSoTTHCCong(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTraCuuHoSoTTHCCong(id);
	}

	/**
	* Deletes the tra cuu ho so t t h c cong from the database. Also notifies the appropriate model listeners.
	*
	* @param traCuuHoSoTTHCCong the tra cuu ho so t t h c cong
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTraCuuHoSoTTHCCong(
		org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong traCuuHoSoTTHCCong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTraCuuHoSoTTHCCong(traCuuHoSoTTHCCong);
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

	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong fetchTraCuuHoSoTTHCCong(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTraCuuHoSoTTHCCong(id);
	}

	/**
	* Returns the tra cuu ho so t t h c cong with the primary key.
	*
	* @param id the primary key of the tra cuu ho so t t h c cong
	* @return the tra cuu ho so t t h c cong
	* @throws PortalException if a tra cuu ho so t t h c cong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong getTraCuuHoSoTTHCCong(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraCuuHoSoTTHCCong(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tra cuu ho so t t h c congs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tra cuu ho so t t h c congs
	* @param end the upper bound of the range of tra cuu ho so t t h c congs (not inclusive)
	* @return the range of tra cuu ho so t t h c congs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong> getTraCuuHoSoTTHCCongs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraCuuHoSoTTHCCongs(start, end);
	}

	/**
	* Returns the number of tra cuu ho so t t h c congs.
	*
	* @return the number of tra cuu ho so t t h c congs
	* @throws SystemException if a system exception occurred
	*/
	public static int getTraCuuHoSoTTHCCongsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTraCuuHoSoTTHCCongsCount();
	}

	/**
	* Updates the tra cuu ho so t t h c cong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param traCuuHoSoTTHCCong the tra cuu ho so t t h c cong
	* @return the tra cuu ho so t t h c cong that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong updateTraCuuHoSoTTHCCong(
		org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong traCuuHoSoTTHCCong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTraCuuHoSoTTHCCong(traCuuHoSoTTHCCong);
	}

	/**
	* Updates the tra cuu ho so t t h c cong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param traCuuHoSoTTHCCong the tra cuu ho so t t h c cong
	* @param merge whether to merge the tra cuu ho so t t h c cong with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tra cuu ho so t t h c cong that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong updateTraCuuHoSoTTHCCong(
		org.oep.cmon.dao.touchscreen.model.TraCuuHoSoTTHCCong traCuuHoSoTTHCCong,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTraCuuHoSoTTHCCong(traCuuHoSoTTHCCong, merge);
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

	public static TraCuuHoSoTTHCCongLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TraCuuHoSoTTHCCongLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TraCuuHoSoTTHCCongLocalService.class.getName(),
					portletClassLoader);

			_service = new TraCuuHoSoTTHCCongLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TraCuuHoSoTTHCCongLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TraCuuHoSoTTHCCongLocalService.class);
		}

		return _service;
	}

	public void setService(TraCuuHoSoTTHCCongLocalService service) {
		MethodCache.remove(TraCuuHoSoTTHCCongLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TraCuuHoSoTTHCCongLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TraCuuHoSoTTHCCongLocalService.class);
	}

	private static TraCuuHoSoTTHCCongLocalService _service;
}