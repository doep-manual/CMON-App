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

package org.oep.cmon.dao.csms.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the anh chan dung yeu cau dang ky cong dan local service. This utility wraps {@link org.oep.cmon.dao.csms.service.impl.AnhChanDungYeuCauDangKyCongDanLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NAM
 * @see AnhChanDungYeuCauDangKyCongDanLocalService
 * @see org.oep.cmon.dao.csms.service.base.AnhChanDungYeuCauDangKyCongDanLocalServiceBaseImpl
 * @see org.oep.cmon.dao.csms.service.impl.AnhChanDungYeuCauDangKyCongDanLocalServiceImpl
 * @generated
 */
public class AnhChanDungYeuCauDangKyCongDanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.csms.service.impl.AnhChanDungYeuCauDangKyCongDanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the anh chan dung yeu cau dang ky cong dan to the database. Also notifies the appropriate model listeners.
	*
	* @param anhChanDungYeuCauDangKyCongDan the anh chan dung yeu cau dang ky cong dan
	* @return the anh chan dung yeu cau dang ky cong dan that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan addAnhChanDungYeuCauDangKyCongDan(
		org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnhChanDungYeuCauDangKyCongDan(anhChanDungYeuCauDangKyCongDan);
	}

	/**
	* Creates a new anh chan dung yeu cau dang ky cong dan with the primary key. Does not add the anh chan dung yeu cau dang ky cong dan to the database.
	*
	* @param id the primary key for the new anh chan dung yeu cau dang ky cong dan
	* @return the new anh chan dung yeu cau dang ky cong dan
	*/
	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan createAnhChanDungYeuCauDangKyCongDan(
		long id) {
		return getService().createAnhChanDungYeuCauDangKyCongDan(id);
	}

	/**
	* Deletes the anh chan dung yeu cau dang ky cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the anh chan dung yeu cau dang ky cong dan
	* @throws PortalException if a anh chan dung yeu cau dang ky cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAnhChanDungYeuCauDangKyCongDan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAnhChanDungYeuCauDangKyCongDan(id);
	}

	/**
	* Deletes the anh chan dung yeu cau dang ky cong dan from the database. Also notifies the appropriate model listeners.
	*
	* @param anhChanDungYeuCauDangKyCongDan the anh chan dung yeu cau dang ky cong dan
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAnhChanDungYeuCauDangKyCongDan(
		org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteAnhChanDungYeuCauDangKyCongDan(anhChanDungYeuCauDangKyCongDan);
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

	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan fetchAnhChanDungYeuCauDangKyCongDan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAnhChanDungYeuCauDangKyCongDan(id);
	}

	/**
	* Returns the anh chan dung yeu cau dang ky cong dan with the primary key.
	*
	* @param id the primary key of the anh chan dung yeu cau dang ky cong dan
	* @return the anh chan dung yeu cau dang ky cong dan
	* @throws PortalException if a anh chan dung yeu cau dang ky cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan getAnhChanDungYeuCauDangKyCongDan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnhChanDungYeuCauDangKyCongDan(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the anh chan dung yeu cau dang ky cong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of anh chan dung yeu cau dang ky cong dans
	* @param end the upper bound of the range of anh chan dung yeu cau dang ky cong dans (not inclusive)
	* @return the range of anh chan dung yeu cau dang ky cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan> getAnhChanDungYeuCauDangKyCongDans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnhChanDungYeuCauDangKyCongDans(start, end);
	}

	/**
	* Returns the number of anh chan dung yeu cau dang ky cong dans.
	*
	* @return the number of anh chan dung yeu cau dang ky cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static int getAnhChanDungYeuCauDangKyCongDansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnhChanDungYeuCauDangKyCongDansCount();
	}

	/**
	* Updates the anh chan dung yeu cau dang ky cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param anhChanDungYeuCauDangKyCongDan the anh chan dung yeu cau dang ky cong dan
	* @return the anh chan dung yeu cau dang ky cong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan updateAnhChanDungYeuCauDangKyCongDan(
		org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAnhChanDungYeuCauDangKyCongDan(anhChanDungYeuCauDangKyCongDan);
	}

	/**
	* Updates the anh chan dung yeu cau dang ky cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param anhChanDungYeuCauDangKyCongDan the anh chan dung yeu cau dang ky cong dan
	* @param merge whether to merge the anh chan dung yeu cau dang ky cong dan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the anh chan dung yeu cau dang ky cong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan updateAnhChanDungYeuCauDangKyCongDan(
		org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAnhChanDungYeuCauDangKyCongDan(anhChanDungYeuCauDangKyCongDan,
			merge);
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

	public static AnhChanDungYeuCauDangKyCongDanLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AnhChanDungYeuCauDangKyCongDanLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					AnhChanDungYeuCauDangKyCongDanLocalService.class.getName(),
					portletClassLoader);

			_service = new AnhChanDungYeuCauDangKyCongDanLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(AnhChanDungYeuCauDangKyCongDanLocalServiceUtil.class,
				"_service");
			MethodCache.remove(AnhChanDungYeuCauDangKyCongDanLocalService.class);
		}

		return _service;
	}

	public void setService(AnhChanDungYeuCauDangKyCongDanLocalService service) {
		MethodCache.remove(AnhChanDungYeuCauDangKyCongDanLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(AnhChanDungYeuCauDangKyCongDanLocalServiceUtil.class,
			"_service");
		MethodCache.remove(AnhChanDungYeuCauDangKyCongDanLocalService.class);
	}

	private static AnhChanDungYeuCauDangKyCongDanLocalService _service;
}