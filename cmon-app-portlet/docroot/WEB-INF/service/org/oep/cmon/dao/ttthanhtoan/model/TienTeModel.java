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

package org.oep.cmon.dao.ttthanhtoan.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TienTe service. Represents a row in the &quot;CMON_NGOAITE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.ttthanhtoan.model.impl.TienTeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.ttthanhtoan.model.impl.TienTeImpl}.
 * </p>
 *
 * @author Thanhdd
 * @see TienTe
 * @see org.oep.cmon.dao.ttthanhtoan.model.impl.TienTeImpl
 * @see org.oep.cmon.dao.ttthanhtoan.model.impl.TienTeModelImpl
 * @generated
 */
public interface TienTeModel extends BaseModel<TienTe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tien te model instance should use the {@link TienTe} interface instead.
	 */

	/**
	 * Returns the primary key of this tien te.
	 *
	 * @return the primary key of this tien te
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tien te.
	 *
	 * @param primaryKey the primary key of this tien te
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tien te.
	 *
	 * @return the ID of this tien te
	 */
	public long getId();

	/**
	 * Sets the ID of this tien te.
	 *
	 * @param id the ID of this tien te
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this tien te.
	 *
	 * @return the ma of this tien te
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this tien te.
	 *
	 * @param ma the ma of this tien te
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this tien te.
	 *
	 * @return the ten of this tien te
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this tien te.
	 *
	 * @param ten the ten of this tien te
	 */
	public void setTen(String ten);

	/**
	 * Returns the ty gia of this tien te.
	 *
	 * @return the ty gia of this tien te
	 */
	public long getTyGia();

	/**
	 * Sets the ty gia of this tien te.
	 *
	 * @param tyGia the ty gia of this tien te
	 */
	public void setTyGia(long tyGia);

	/**
	 * Returns the ngay tao of this tien te.
	 *
	 * @return the ngay tao of this tien te
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this tien te.
	 *
	 * @param ngayTao the ngay tao of this tien te
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this tien te.
	 *
	 * @return the nguoi tao of this tien te
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this tien te.
	 *
	 * @param nguoiTao the nguoi tao of this tien te
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the ngay sua of this tien te.
	 *
	 * @return the ngay sua of this tien te
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this tien te.
	 *
	 * @param ngaySua the ngay sua of this tien te
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the nguoi sua of this tien te.
	 *
	 * @return the nguoi sua of this tien te
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this tien te.
	 *
	 * @param nguoiSua the nguoi sua of this tien te
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the trang thai of this tien te.
	 *
	 * @return the trang thai of this tien te
	 */
	public int getTrangThai();

	/**
	 * Sets the trang thai of this tien te.
	 *
	 * @param trangThai the trang thai of this tien te
	 */
	public void setTrangThai(int trangThai);

	/**
	 * Returns the phien ban of this tien te.
	 *
	 * @return the phien ban of this tien te
	 */
	public int getPhienBan();

	/**
	 * Sets the phien ban of this tien te.
	 *
	 * @param phienBan the phien ban of this tien te
	 */
	public void setPhienBan(int phienBan);

	/**
	 * Returns the da xoa of this tien te.
	 *
	 * @return the da xoa of this tien te
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this tien te.
	 *
	 * @param daXoa the da xoa of this tien te
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

	public int compareTo(TienTe tienTe);

	public int hashCode();

	public CacheModel<TienTe> toCacheModel();

	public TienTe toEscapedModel();

	public String toString();

	public String toXmlString();
}