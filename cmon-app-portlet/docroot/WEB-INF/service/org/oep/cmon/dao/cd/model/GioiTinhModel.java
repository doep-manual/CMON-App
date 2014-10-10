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

package org.oep.cmon.dao.cd.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the GioiTinh service. Represents a row in the &quot;CMON_GIOITINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.cd.model.impl.GioiTinhModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.cd.model.impl.GioiTinhImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see GioiTinh
 * @see org.oep.cmon.dao.cd.model.impl.GioiTinhImpl
 * @see org.oep.cmon.dao.cd.model.impl.GioiTinhModelImpl
 * @generated
 */
public interface GioiTinhModel extends BaseModel<GioiTinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a gioi tinh model instance should use the {@link GioiTinh} interface instead.
	 */

	/**
	 * Returns the primary key of this gioi tinh.
	 *
	 * @return the primary key of this gioi tinh
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this gioi tinh.
	 *
	 * @param primaryKey the primary key of this gioi tinh
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this gioi tinh.
	 *
	 * @return the ID of this gioi tinh
	 */
	public long getId();

	/**
	 * Sets the ID of this gioi tinh.
	 *
	 * @param id the ID of this gioi tinh
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this gioi tinh.
	 *
	 * @return the ten of this gioi tinh
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this gioi tinh.
	 *
	 * @param ten the ten of this gioi tinh
	 */
	public void setTen(String ten);

	/**
	 * Returns the ma of this gioi tinh.
	 *
	 * @return the ma of this gioi tinh
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this gioi tinh.
	 *
	 * @param ma the ma of this gioi tinh
	 */
	public void setMa(String ma);

	/**
	 * Returns the ngay tao of this gioi tinh.
	 *
	 * @return the ngay tao of this gioi tinh
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this gioi tinh.
	 *
	 * @param ngayTao the ngay tao of this gioi tinh
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this gioi tinh.
	 *
	 * @return the nguoi tao of this gioi tinh
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this gioi tinh.
	 *
	 * @param nguoiTao the nguoi tao of this gioi tinh
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the ngay sua of this gioi tinh.
	 *
	 * @return the ngay sua of this gioi tinh
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this gioi tinh.
	 *
	 * @param ngaySua the ngay sua of this gioi tinh
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the nguoi sua of this gioi tinh.
	 *
	 * @return the nguoi sua of this gioi tinh
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this gioi tinh.
	 *
	 * @param nguoiSua the nguoi sua of this gioi tinh
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the da xoa of this gioi tinh.
	 *
	 * @return the da xoa of this gioi tinh
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this gioi tinh.
	 *
	 * @param daXoa the da xoa of this gioi tinh
	 */
	public void setDaXoa(int daXoa);

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

	public int compareTo(GioiTinh gioiTinh);

	public int hashCode();

	public CacheModel<GioiTinh> toCacheModel();

	public GioiTinh toEscapedModel();

	public String toString();

	public String toXmlString();
}