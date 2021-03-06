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

package org.oep.cmon.dao.dn.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LoaiDoanhNghiep service. Represents a row in the &quot;CMON_LOAIDOANHNGHIEP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.dn.model.impl.LoaiDoanhNghiepModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.dn.model.impl.LoaiDoanhNghiepImpl}.
 * </p>
 *
 * @author Liemnn
 * @see LoaiDoanhNghiep
 * @see org.oep.cmon.dao.dn.model.impl.LoaiDoanhNghiepImpl
 * @see org.oep.cmon.dao.dn.model.impl.LoaiDoanhNghiepModelImpl
 * @generated
 */
public interface LoaiDoanhNghiepModel extends BaseModel<LoaiDoanhNghiep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a loai doanh nghiep model instance should use the {@link LoaiDoanhNghiep} interface instead.
	 */

	/**
	 * Returns the primary key of this loai doanh nghiep.
	 *
	 * @return the primary key of this loai doanh nghiep
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this loai doanh nghiep.
	 *
	 * @param primaryKey the primary key of this loai doanh nghiep
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this loai doanh nghiep.
	 *
	 * @return the ID of this loai doanh nghiep
	 */
	public long getId();

	/**
	 * Sets the ID of this loai doanh nghiep.
	 *
	 * @param id the ID of this loai doanh nghiep
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this loai doanh nghiep.
	 *
	 * @return the ma of this loai doanh nghiep
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this loai doanh nghiep.
	 *
	 * @param ma the ma of this loai doanh nghiep
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this loai doanh nghiep.
	 *
	 * @return the ten of this loai doanh nghiep
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this loai doanh nghiep.
	 *
	 * @param ten the ten of this loai doanh nghiep
	 */
	public void setTen(String ten);

	/**
	 * Returns the mo ta of this loai doanh nghiep.
	 *
	 * @return the mo ta of this loai doanh nghiep
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this loai doanh nghiep.
	 *
	 * @param moTa the mo ta of this loai doanh nghiep
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the ngay tao of this loai doanh nghiep.
	 *
	 * @return the ngay tao of this loai doanh nghiep
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this loai doanh nghiep.
	 *
	 * @param ngayTao the ngay tao of this loai doanh nghiep
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the ngay sua of this loai doanh nghiep.
	 *
	 * @return the ngay sua of this loai doanh nghiep
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this loai doanh nghiep.
	 *
	 * @param ngaySua the ngay sua of this loai doanh nghiep
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the nguoi tao of this loai doanh nghiep.
	 *
	 * @return the nguoi tao of this loai doanh nghiep
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this loai doanh nghiep.
	 *
	 * @param nguoiTao the nguoi tao of this loai doanh nghiep
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this loai doanh nghiep.
	 *
	 * @return the nguoi sua of this loai doanh nghiep
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this loai doanh nghiep.
	 *
	 * @param nguoiSua the nguoi sua of this loai doanh nghiep
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the phien ban of this loai doanh nghiep.
	 *
	 * @return the phien ban of this loai doanh nghiep
	 */
	public int getPhienBan();

	/**
	 * Sets the phien ban of this loai doanh nghiep.
	 *
	 * @param phienBan the phien ban of this loai doanh nghiep
	 */
	public void setPhienBan(int phienBan);

	/**
	 * Returns the da xoa of this loai doanh nghiep.
	 *
	 * @return the da xoa of this loai doanh nghiep
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this loai doanh nghiep.
	 *
	 * @param daXoa the da xoa of this loai doanh nghiep
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

	public int compareTo(LoaiDoanhNghiep loaiDoanhNghiep);

	public int hashCode();

	public CacheModel<LoaiDoanhNghiep> toCacheModel();

	public LoaiDoanhNghiep toEscapedModel();

	public String toString();

	public String toXmlString();
}