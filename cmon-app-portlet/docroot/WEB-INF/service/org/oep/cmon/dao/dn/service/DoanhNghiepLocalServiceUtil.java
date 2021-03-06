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
 * The utility for the doanh nghiep local service. This utility wraps {@link org.oep.cmon.dao.dn.service.impl.DoanhNghiepLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Liemnn
 * @see DoanhNghiepLocalService
 * @see org.oep.cmon.dao.dn.service.base.DoanhNghiepLocalServiceBaseImpl
 * @see org.oep.cmon.dao.dn.service.impl.DoanhNghiepLocalServiceImpl
 * @generated
 */
public class DoanhNghiepLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.dn.service.impl.DoanhNghiepLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doanh nghiep to the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @return the doanh nghiep that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep addDoanhNghiep(
		org.oep.cmon.dao.dn.model.DoanhNghiep doanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDoanhNghiep(doanhNghiep);
	}

	/**
	* Creates a new doanh nghiep with the primary key. Does not add the doanh nghiep to the database.
	*
	* @param id the primary key for the new doanh nghiep
	* @return the new doanh nghiep
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep createDoanhNghiep(
		long id) {
		return getService().createDoanhNghiep(id);
	}

	/**
	* Deletes the doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the doanh nghiep
	* @throws PortalException if a doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDoanhNghiep(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDoanhNghiep(id);
	}

	/**
	* Deletes the doanh nghiep from the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDoanhNghiep(
		org.oep.cmon.dao.dn.model.DoanhNghiep doanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDoanhNghiep(doanhNghiep);
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

	public static org.oep.cmon.dao.dn.model.DoanhNghiep fetchDoanhNghiep(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDoanhNghiep(id);
	}

	/**
	* Returns the doanh nghiep with the primary key.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep
	* @throws PortalException if a doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep getDoanhNghiep(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghiep(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @return the range of doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.dn.model.DoanhNghiep> getDoanhNghieps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghieps(start, end);
	}

	/**
	* Returns the number of doanh nghieps.
	*
	* @return the number of doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int getDoanhNghiepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoanhNghiepsCount();
	}

	/**
	* Updates the doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @return the doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep updateDoanhNghiep(
		org.oep.cmon.dao.dn.model.DoanhNghiep doanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoanhNghiep(doanhNghiep);
	}

	/**
	* Updates the doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @param merge whether to merge the doanh nghiep with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep updateDoanhNghiep(
		org.oep.cmon.dao.dn.model.DoanhNghiep doanhNghiep, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoanhNghiep(doanhNghiep, merge);
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
	* This is fucntion find DoanhNghiep by Ma
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of ma
	* @return DoanhNghiep
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep findByMaDoanhNghiep(
		java.lang.String ma) {
		return getService().findByMaDoanhNghiep(ma);
	}

	/**
	* This is fucntion find DoanhNghiep by MaSoThue
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of MaSoThue
	* @return DoanhNghiep
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep findByMaSoThue(
		java.lang.String ma) {
		return getService().findByMaSoThue(ma);
	}

	/**
	* This is fucntion find MaSoThue by ten
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of Ten
	* @return MaSoThue
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep findByTen(
		java.lang.String ten) {
		return getService().findByTen(ten);
	}

	/**
	* This is fucntion find DoanhNghiep by soGCNDKKD
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String : Value of soGCNDKKD
	* @return DoanhNghiep
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep findBySoGCNDKKD(
		java.lang.String soGCNDKKD) {
		return getService().findBySoGCNDKKD(soGCNDKKD);
	}

	/**
	* This is fucntion find DoanhNghiep by nguoiDaiDienId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long nguoiDaiDienId
	* @return List<DoanhNghiep>
	*/
	public static java.util.List<org.oep.cmon.dao.dn.model.DoanhNghiep> getDoanhNghiep2NguoiDaiDienId(
		long nguoiDaiDienId) {
		return getService().getDoanhNghiep2NguoiDaiDienId(nguoiDaiDienId);
	}

	/**
	* This is fucntion find DoanhNghiep by loaiDoiTuongId  ,NguoiDaiDien
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long nguoiDaiDienId, long loaiDoiTuongId
	* @return List<DoanhNghiep>
	*/
	public static java.util.List<org.oep.cmon.dao.dn.model.DoanhNghiep> findByGetNguoiDaiDienDoiTuong(
		long nguoiDaiDienId, long loaiDoiTuongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGetNguoiDaiDienDoiTuong(nguoiDaiDienId, loaiDoiTuongId);
	}

	/**
	* This is fucntion find DoanhNghiep by nguoiDaiDienId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param long nguoiDaiDienId
	* @return DoanhNghiep
	*/
	public static org.oep.cmon.dao.dn.model.DoanhNghiep findByNguoiDaiDienId(
		long nguoiDaiDienId) {
		return getService().findByNguoiDaiDienId(nguoiDaiDienId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DoanhNghiepLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DoanhNghiepLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DoanhNghiepLocalService.class.getName(), portletClassLoader);

			_service = new DoanhNghiepLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DoanhNghiepLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DoanhNghiepLocalService.class);
		}

		return _service;
	}

	public void setService(DoanhNghiepLocalService service) {
		MethodCache.remove(DoanhNghiepLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DoanhNghiepLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DoanhNghiepLocalService.class);
	}

	private static DoanhNghiepLocalService _service;
}