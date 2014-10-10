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

package org.oep.cmon.dao.job.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the danh sach job local service. This utility wraps {@link org.oep.cmon.dao.job.service.impl.DanhSachJobLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author BinhNT
 * @see DanhSachJobLocalService
 * @see org.oep.cmon.dao.job.service.base.DanhSachJobLocalServiceBaseImpl
 * @see org.oep.cmon.dao.job.service.impl.DanhSachJobLocalServiceImpl
 * @generated
 */
public class DanhSachJobLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.cmon.dao.job.service.impl.DanhSachJobLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the danh sach job to the database. Also notifies the appropriate model listeners.
	*
	* @param danhSachJob the danh sach job
	* @return the danh sach job that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob addDanhSachJob(
		org.oep.cmon.dao.job.model.DanhSachJob danhSachJob)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDanhSachJob(danhSachJob);
	}

	/**
	* Creates a new danh sach job with the primary key. Does not add the danh sach job to the database.
	*
	* @param ID the primary key for the new danh sach job
	* @return the new danh sach job
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob createDanhSachJob(
		long ID) {
		return getService().createDanhSachJob(ID);
	}

	/**
	* Deletes the danh sach job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the danh sach job
	* @throws PortalException if a danh sach job with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDanhSachJob(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDanhSachJob(ID);
	}

	/**
	* Deletes the danh sach job from the database. Also notifies the appropriate model listeners.
	*
	* @param danhSachJob the danh sach job
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDanhSachJob(
		org.oep.cmon.dao.job.model.DanhSachJob danhSachJob)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDanhSachJob(danhSachJob);
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

	public static org.oep.cmon.dao.job.model.DanhSachJob fetchDanhSachJob(
		long ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDanhSachJob(ID);
	}

	/**
	* Returns the danh sach job with the primary key.
	*
	* @param ID the primary key of the danh sach job
	* @return the danh sach job
	* @throws PortalException if a danh sach job with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob getDanhSachJob(long ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDanhSachJob(ID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the danh sach jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of danh sach jobs
	* @param end the upper bound of the range of danh sach jobs (not inclusive)
	* @return the range of danh sach jobs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.cmon.dao.job.model.DanhSachJob> getDanhSachJobs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDanhSachJobs(start, end);
	}

	/**
	* Returns the number of danh sach jobs.
	*
	* @return the number of danh sach jobs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDanhSachJobsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDanhSachJobsCount();
	}

	/**
	* Updates the danh sach job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhSachJob the danh sach job
	* @return the danh sach job that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob updateDanhSachJob(
		org.oep.cmon.dao.job.model.DanhSachJob danhSachJob)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDanhSachJob(danhSachJob);
	}

	/**
	* Updates the danh sach job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param danhSachJob the danh sach job
	* @param merge whether to merge the danh sach job with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the danh sach job that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob updateDanhSachJob(
		org.oep.cmon.dao.job.model.DanhSachJob danhSachJob, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDanhSachJob(danhSachJob, merge);
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
	* This is fucntion findByJobClass
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param String jobClassName
	* @return DanhSachJob
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob findByJobClass(
		java.lang.String jobClassName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.job.NoSuchDanhSachJobException {
		return getService().findByJobClass(jobClassName);
	}

	/**
	* This is fucntion findByJobId
	* Version: 1.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  3-March-2013  Nam Dinh    Create new
	*
	* @param int jobId
	* @return DanhSachJob
	*/
	public static org.oep.cmon.dao.job.model.DanhSachJob findByJobId(int jobId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.cmon.dao.job.NoSuchDanhSachJobException {
		return getService().findByJobId(jobId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DanhSachJobLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DanhSachJobLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DanhSachJobLocalService.class.getName(), portletClassLoader);

			_service = new DanhSachJobLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DanhSachJobLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DanhSachJobLocalService.class);
		}

		return _service;
	}

	public void setService(DanhSachJobLocalService service) {
		MethodCache.remove(DanhSachJobLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DanhSachJobLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DanhSachJobLocalService.class);
	}

	private static DanhSachJobLocalService _service;
}