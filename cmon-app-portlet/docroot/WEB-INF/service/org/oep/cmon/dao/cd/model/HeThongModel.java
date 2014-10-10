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
 * The base model interface for the HeThong service. Represents a row in the &quot;CMON_HETHONG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.cd.model.impl.HeThongModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.cd.model.impl.HeThongImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see HeThong
 * @see org.oep.cmon.dao.cd.model.impl.HeThongImpl
 * @see org.oep.cmon.dao.cd.model.impl.HeThongModelImpl
 * @generated
 */
public interface HeThongModel extends BaseModel<HeThong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a he thong model instance should use the {@link HeThong} interface instead.
	 */

	/**
	 * Returns the primary key of this he thong.
	 *
	 * @return the primary key of this he thong
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this he thong.
	 *
	 * @param primaryKey the primary key of this he thong
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this he thong.
	 *
	 * @return the ID of this he thong
	 */
	public long getId();

	/**
	 * Sets the ID of this he thong.
	 *
	 * @param id the ID of this he thong
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this he thong.
	 *
	 * @return the ma of this he thong
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this he thong.
	 *
	 * @param ma the ma of this he thong
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this he thong.
	 *
	 * @return the ten of this he thong
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this he thong.
	 *
	 * @param ten the ten of this he thong
	 */
	public void setTen(String ten);

	/**
	 * Returns the mo ta of this he thong.
	 *
	 * @return the mo ta of this he thong
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this he thong.
	 *
	 * @param moTa the mo ta of this he thong
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the ngay tao of this he thong.
	 *
	 * @return the ngay tao of this he thong
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this he thong.
	 *
	 * @param ngayTao the ngay tao of this he thong
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the da xoa of this he thong.
	 *
	 * @return the da xoa of this he thong
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this he thong.
	 *
	 * @param daXoa the da xoa of this he thong
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the nguoi tao of this he thong.
	 *
	 * @return the nguoi tao of this he thong
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this he thong.
	 *
	 * @param nguoiTao the nguoi tao of this he thong
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this he thong.
	 *
	 * @return the nguoi sua of this he thong
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this he thong.
	 *
	 * @param nguoiSua the nguoi sua of this he thong
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the ngay sua of this he thong.
	 *
	 * @return the ngay sua of this he thong
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this he thong.
	 *
	 * @param ngaySua the ngay sua of this he thong
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the trang thai of this he thong.
	 *
	 * @return the trang thai of this he thong
	 */
	public int getTrangThai();

	/**
	 * Sets the trang thai of this he thong.
	 *
	 * @param trangThai the trang thai of this he thong
	 */
	public void setTrangThai(int trangThai);

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

	public int compareTo(HeThong heThong);

	public int hashCode();

	public CacheModel<HeThong> toCacheModel();

	public HeThong toEscapedModel();

	public String toString();

	public String toXmlString();
}