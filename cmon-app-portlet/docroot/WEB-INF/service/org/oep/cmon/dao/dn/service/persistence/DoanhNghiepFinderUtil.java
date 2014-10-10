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

package org.oep.cmon.dao.dn.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Liemnn
 */
public class DoanhNghiepFinderUtil {
	public static java.util.List<org.oep.cmon.dao.dn.model.DoanhNghiep> getDoanhNghiep2NguoiDaiDienId(
		long nguoiDaiDienId) {
		return getFinder().getDoanhNghiep2NguoiDaiDienId(nguoiDaiDienId);
	}

	public static DoanhNghiepFinder getFinder() {
		if (_finder == null) {
			_finder = (DoanhNghiepFinder)PortletBeanLocatorUtil.locate(org.oep.cmon.dao.dn.service.ClpSerializer.getServletContextName(),
					DoanhNghiepFinder.class.getName());

			ReferenceRegistry.registerReference(DoanhNghiepFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DoanhNghiepFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DoanhNghiepFinderUtil.class,
			"_finder");
	}

	private static DoanhNghiepFinder _finder;
}