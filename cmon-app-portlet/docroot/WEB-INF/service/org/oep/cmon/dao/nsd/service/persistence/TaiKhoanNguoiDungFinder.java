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

package org.oep.cmon.dao.nsd.service.persistence;

/**
 * @author Liemnn
 */
public interface TaiKhoanNguoiDungFinder {
	public java.util.List<org.oep.cmon.dao.nsd.model.TaiKhoanNguoiDung> findTaiKhoanNguoiDung(
		java.lang.String keyWord, java.lang.String option);

	public java.util.List<org.oep.cmon.dao.nsd.model.TaiKhoanNguoiDung> findTaiKhoanNguoiDungPopup(
		java.lang.String keyWord, java.lang.String option);
}