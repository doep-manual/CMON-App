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

package org.oep.cmon.dao.dn.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the doanh nghiep2 nganh nghe local service. This utility wraps {@link org.oep.cmon.dao.dn.service.impl.DoanhNghiep2NganhNgheLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Liemnn
 * @see DoanhNghiep2NganhNgheLocalService
 * @see org.oep.cmon.dao.dn.service.base.DoanhNghiep2NganhNgheLocalServiceBaseImpl
 * @see org.oep.cmon.dao.dn.service.impl.DoanhNghiep2NganhNgheLocalServiceImpl
 * @generated
 */
public class DoanhNghiep2NganhNgheLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.dn.service.impl.DoanhNghiep2NganhNgheLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doanh nghiep2 nganh nghe to the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep2NganhNghe the doanh nghiep2 nganh nghe
	* @return the doanh nghiep2 nganh nghe that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe addDoanhNghiep2NganhNghe(
		org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe doanhNghiep2NganhNghe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDoanhNghiep2NganhNghe(doanhNghiep2NganhNghe);
	}

	/**
	* Creates a new doanh nghiep2 nganh nghe with the primary key. Does not add the doanh nghiep2 nganh nghe to the database.
	*
	* @param id the primary key for the new doanh nghiep2 nganh nghe
	* @return the new doanh nghiep2 nganh nghe
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe createDoanhNghiep2NganhNghe(
		long id) {
		return getService().createDoanhNghiep2NganhNghe(id);
	}

	/**
	* Deletes the doanh nghiep2 nganh nghe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the doanh nghiep2 nganh nghe
	* @throws PortalException if a doanh nghiep2 nganh nghe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDoanhNghiep2NganhNghe(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDoanhNghiep2NganhNghe(id);
	}

	/**
	* Deletes the doanh nghiep2 nganh nghe from the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep2NganhNghe the doanh nghiep2 nganh nghe
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDoanhNghiep2NganhNghe(
		org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe doanhNghiep2NganhNghe)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDoanhNghiep2NganhNghe(doanhNghiep2NganhNghe);
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

	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe fetchDoanhNghiep2NganhNghe(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDoanhNghiep2NganhNghe(id);
	}

	/**
	* Returns the doanh nghiep2 nganh nghe with the primary key.
	*
	* @param id the primary key of the doanh nghiep2 nganh nghe
	* @return the doanh nghiep2 nganh nghe
	* @throws PortalException if a doanh nghiep2 nganh nghe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe getDoanhNghiep2NganhNghe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghiep2NganhNghe(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doanh nghiep2 nganh nghes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghiep2 nganh nghes
	* @param end the upper bound of the range of doanh nghiep2 nganh nghes (not inclusive)
	* @return the range of doanh nghiep2 nganh nghes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe> getDoanhNghiep2NganhNghes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghiep2NganhNghes(start, end);
	}

	/**
	* Returns the number of doanh nghiep2 nganh nghes.
	*
	* @return the number of doanh nghiep2 nganh nghes
	* @throws SystemException if a system exception occurred
	*/
	public static int getDoanhNghiep2NganhNghesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghiep2NganhNghesCount();
	}

	/**
	* Updates the doanh nghiep2 nganh nghe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep2NganhNghe the doanh nghiep2 nganh nghe
	* @return the doanh nghiep2 nganh nghe that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe updateDoanhNghiep2NganhNghe(
		org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe doanhNghiep2NganhNghe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoanhNghiep2NganhNghe(doanhNghiep2NganhNghe);
	}

	/**
	* Updates the doanh nghiep2 nganh nghe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep2NganhNghe the doanh nghiep2 nganh nghe
	* @param merge whether to merge the doanh nghiep2 nganh nghe with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the doanh nghiep2 nganh nghe that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe updateDoanhNghiep2NganhNghe(
		org.oep.cmon.dao.dn.model.DoanhNghiep2NganhNghe doanhNghiep2NganhNghe,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDoanhNghiep2NganhNghe(doanhNghiep2NganhNghe, merge);
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

	public static DoanhNghiep2NganhNgheLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DoanhNghiep2NganhNgheLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DoanhNghiep2NganhNgheLocalService.class.getName(),
					portletClassLoader);

			_service = new DoanhNghiep2NganhNgheLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DoanhNghiep2NganhNgheLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DoanhNghiep2NganhNgheLocalService.class);
		}

		return _service;
	}

	public void setService(DoanhNghiep2NganhNgheLocalService service) {
		MethodCache.remove(DoanhNghiep2NganhNgheLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DoanhNghiep2NganhNgheLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DoanhNghiep2NganhNgheLocalService.class);
	}

	private static DoanhNghiep2NganhNgheLocalService _service;
}