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

package org.oep.cmon.dao.kios.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DanhSachCoQuan service. Represents a row in the &quot;DNICT_DanhSachCoQuan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.kios.model.impl.DanhSachCoQuanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.kios.model.impl.DanhSachCoQuanImpl}.
 * </p>
 *
 * @author VIENPN
 * @see DanhSachCoQuan
 * @see org.oep.cmon.dao.kios.model.impl.DanhSachCoQuanImpl
 * @see org.oep.cmon.dao.kios.model.impl.DanhSachCoQuanModelImpl
 * @generated
 */
public interface DanhSachCoQuanModel extends BaseModel<DanhSachCoQuan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a danh sach co quan model instance should use the {@link DanhSachCoQuan} interface instead.
	 */

	/**
	 * Returns the primary key of this danh sach co quan.
	 *
	 * @return the primary key of this danh sach co quan
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this danh sach co quan.
	 *
	 * @param primaryKey the primary key of this danh sach co quan
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this danh sach co quan.
	 *
	 * @return the ID of this danh sach co quan
	 */
	public long getId();

	/**
	 * Sets the ID of this danh sach co quan.
	 *
	 * @param id the ID of this danh sach co quan
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this danh sach co quan.
	 *
	 * @return the ten of this danh sach co quan
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this danh sach co quan.
	 *
	 * @param ten the ten of this danh sach co quan
	 */
	public void setTen(String ten);

	/**
	 * Returns the cha ID of this danh sach co quan.
	 *
	 * @return the cha ID of this danh sach co quan
	 */
	public Long getChaId();

	/**
	 * Sets the cha ID of this danh sach co quan.
	 *
	 * @param chaId the cha ID of this danh sach co quan
	 */
	public void setChaId(Long chaId);

	/**
	 * Returns the ten cap co quan quanly of this danh sach co quan.
	 *
	 * @return the ten cap co quan quanly of this danh sach co quan
	 */
	@AutoEscape
	public String getTenCapCoQuanQuanly();

	/**
	 * Sets the ten cap co quan quanly of this danh sach co quan.
	 *
	 * @param tenCapCoQuanQuanly the ten cap co quan quanly of this danh sach co quan
	 */
	public void setTenCapCoQuanQuanly(String tenCapCoQuanQuanly);

	/**
	 * Returns the cap co quan quan ly ID of this danh sach co quan.
	 *
	 * @return the cap co quan quan ly ID of this danh sach co quan
	 */
	public Long getCapCoQuanQuanLyId();

	/**
	 * Sets the cap co quan quan ly ID of this danh sach co quan.
	 *
	 * @param capCoQuanQuanLyId the cap co quan quan ly ID of this danh sach co quan
	 */
	public void setCapCoQuanQuanLyId(Long capCoQuanQuanLyId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(DanhSachCoQuan danhSachCoQuan);

	public int hashCode();

	public CacheModel<DanhSachCoQuan> toCacheModel();

	public DanhSachCoQuan toEscapedModel();

	public String toString();

	public String toXmlString();
}