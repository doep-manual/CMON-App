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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the baocaochitiet local service. This utility wraps {@link org.oep.cmon.dao.report.service.impl.BaocaochitietLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author VIENPN
 * @see BaocaochitietLocalService
 * @see org.oep.cmon.dao.report.service.base.BaocaochitietLocalServiceBaseImpl
 * @see org.oep.cmon.dao.report.service.impl.BaocaochitietLocalServiceImpl
 * @generated
 */
public class BaocaochitietLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.report.service.impl.BaocaochitietLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the baocaochitiet to the database. Also notifies the appropriate model listeners.
	*
	* @param baocaochitiet the baocaochitiet
	* @return the baocaochitiet that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.report.model.Baocaochitiet addBaocaochitiet(
		org.oep.cmon.dao.report.model.Baocaochitiet baocaochitiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBaocaochitiet(baocaochitiet);
	}

	/**
	* Creates a new baocaochitiet with the primary key. Does not add the baocaochitiet to the database.
	*
	* @param MASOHOSO the primary key for the new baocaochitiet
	* @return the new baocaochitiet
	*/
	public static org.oep.cmon.dao.report.model.Baocaochitiet createBaocaochitiet(
		java.lang.String MASOHOSO) {
		return getService().createBaocaochitiet(MASOHOSO);
	}

	/**
	* Deletes the baocaochitiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MASOHOSO the primary key of the baocaochitiet
	* @throws PortalException if a baocaochitiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBaocaochitiet(java.lang.String MASOHOSO)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBaocaochitiet(MASOHOSO);
	}

	/**
	* Deletes the baocaochitiet from the database. Also notifies the appropriate model listeners.
	*
	* @param baocaochitiet the baocaochitiet
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBaocaochitiet(
		org.oep.cmon.dao.report.model.Baocaochitiet baocaochitiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBaocaochitiet(baocaochitiet);
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

	public static org.oep.cmon.dao.report.model.Baocaochitiet fetchBaocaochitiet(
		java.lang.String MASOHOSO)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBaocaochitiet(MASOHOSO);
	}

	/**
	* Returns the baocaochitiet with the primary key.
	*
	* @param MASOHOSO the primary key of the baocaochitiet
	* @return the baocaochitiet
	* @throws PortalException if a baocaochitiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.report.model.Baocaochitiet getBaocaochitiet(
		java.lang.String MASOHOSO)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaocaochitiet(MASOHOSO);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the baocaochitiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of baocaochitiets
	* @param end the upper bound of the range of baocaochitiets (not inclusive)
	* @return the range of baocaochitiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.report.model.Baocaochitiet> getBaocaochitiets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaocaochitiets(start, end);
	}

	/**
	* Returns the number of baocaochitiets.
	*
	* @return the number of baocaochitiets
	* @throws SystemException if a system exception occurred
	*/
	public static int getBaocaochitietsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBaocaochitietsCount();
	}

	/**
	* Updates the baocaochitiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param baocaochitiet the baocaochitiet
	* @return the baocaochitiet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.report.model.Baocaochitiet updateBaocaochitiet(
		org.oep.cmon.dao.report.model.Baocaochitiet baocaochitiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBaocaochitiet(baocaochitiet);
	}

	/**
	* Updates the baocaochitiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param baocaochitiet the baocaochitiet
	* @param merge whether to merge the baocaochitiet with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the baocaochitiet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.report.model.Baocaochitiet updateBaocaochitiet(
		org.oep.cmon.dao.report.model.Baocaochitiet baocaochitiet, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBaocaochitiet(baocaochitiet, merge);
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
	* This is fucntion hienthiDanhsachBaocao
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String[] listloaihoso, String ngaynhan_tungay, String ngaynhan_denngay, String trangthai, String tinhtrang, String loaidangky, int start, int end
	* @return List<Baocaochitiet>
	*/
	public static java.util.List<org.oep.cmon.dao.report.model.Baocaochitiet> hienthiDanhsachBaocao(
		java.lang.String[] listloaihoso, java.lang.String ngaynhan_tungay,
		java.lang.String ngaynhan_denngay, java.lang.String trangthai,
		java.lang.String tinhtrang, java.lang.String loaidangky, int start,
		int end) {
		return getService()
				   .hienthiDanhsachBaocao(listloaihoso, ngaynhan_tungay,
			ngaynhan_denngay, trangthai, tinhtrang, loaidangky, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static BaocaochitietLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BaocaochitietLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					BaocaochitietLocalService.class.getName(),
					portletClassLoader);

			_service = new BaocaochitietLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(BaocaochitietLocalServiceUtil.class,
				"_service");
			MethodCache.remove(BaocaochitietLocalService.class);
		}

		return _service;
	}

	public void setService(BaocaochitietLocalService service) {
		MethodCache.remove(BaocaochitietLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(BaocaochitietLocalServiceUtil.class,
			"_service");
		MethodCache.remove(BaocaochitietLocalService.class);
	}

	private static BaocaochitietLocalService _service;
}