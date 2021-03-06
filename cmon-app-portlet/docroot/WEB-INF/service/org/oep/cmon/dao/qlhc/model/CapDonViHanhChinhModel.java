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

package org.oep.cmon.dao.qlhc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CapDonViHanhChinh service. Represents a row in the &quot;CMON_CAPDONVIHANHCHINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.qlhc.model.impl.CapDonViHanhChinhModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.qlhc.model.impl.CapDonViHanhChinhImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see CapDonViHanhChinh
 * @see org.oep.cmon.dao.qlhc.model.impl.CapDonViHanhChinhImpl
 * @see org.oep.cmon.dao.qlhc.model.impl.CapDonViHanhChinhModelImpl
 * @generated
 */
public interface CapDonViHanhChinhModel extends BaseModel<CapDonViHanhChinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cap don vi hanh chinh model instance should use the {@link CapDonViHanhChinh} interface instead.
	 */

	/**
	 * Returns the primary key of this cap don vi hanh chinh.
	 *
	 * @return the primary key of this cap don vi hanh chinh
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cap don vi hanh chinh.
	 *
	 * @param primaryKey the primary key of this cap don vi hanh chinh
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this cap don vi hanh chinh.
	 *
	 * @return the ID of this cap don vi hanh chinh
	 */
	public long getId();

	/**
	 * Sets the ID of this cap don vi hanh chinh.
	 *
	 * @param id the ID of this cap don vi hanh chinh
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this cap don vi hanh chinh.
	 *
	 * @return the ma of this cap don vi hanh chinh
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this cap don vi hanh chinh.
	 *
	 * @param ma the ma of this cap don vi hanh chinh
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this cap don vi hanh chinh.
	 *
	 * @return the ten of this cap don vi hanh chinh
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this cap don vi hanh chinh.
	 *
	 * @param ten the ten of this cap don vi hanh chinh
	 */
	public void setTen(String ten);

	/**
	 * Returns the cap of this cap don vi hanh chinh.
	 *
	 * @return the cap of this cap don vi hanh chinh
	 */
	public long getCap();

	/**
	 * Sets the cap of this cap don vi hanh chinh.
	 *
	 * @param cap the cap of this cap don vi hanh chinh
	 */
	public void setCap(long cap);

	/**
	 * Returns the phien ban of this cap don vi hanh chinh.
	 *
	 * @return the phien ban of this cap don vi hanh chinh
	 */
	public long getPhienBan();

	/**
	 * Sets the phien ban of this cap don vi hanh chinh.
	 *
	 * @param phienBan the phien ban of this cap don vi hanh chinh
	 */
	public void setPhienBan(long phienBan);

	/**
	 * Returns the ngay tao of this cap don vi hanh chinh.
	 *
	 * @return the ngay tao of this cap don vi hanh chinh
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this cap don vi hanh chinh.
	 *
	 * @param ngayTao the ngay tao of this cap don vi hanh chinh
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the ngay sua of this cap don vi hanh chinh.
	 *
	 * @return the ngay sua of this cap don vi hanh chinh
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this cap don vi hanh chinh.
	 *
	 * @param ngaySua the ngay sua of this cap don vi hanh chinh
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the da xoa of this cap don vi hanh chinh.
	 *
	 * @return the da xoa of this cap don vi hanh chinh
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this cap don vi hanh chinh.
	 *
	 * @param daXoa the da xoa of this cap don vi hanh chinh
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the nguoi tao of this cap don vi hanh chinh.
	 *
	 * @return the nguoi tao of this cap don vi hanh chinh
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this cap don vi hanh chinh.
	 *
	 * @param nguoiTao the nguoi tao of this cap don vi hanh chinh
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this cap don vi hanh chinh.
	 *
	 * @return the nguoi sua of this cap don vi hanh chinh
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this cap don vi hanh chinh.
	 *
	 * @param nguoiSua the nguoi sua of this cap don vi hanh chinh
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the mota of this cap don vi hanh chinh.
	 *
	 * @return the mota of this cap don vi hanh chinh
	 */
	@AutoEscape
	public String getMota();

	/**
	 * Sets the mota of this cap don vi hanh chinh.
	 *
	 * @param mota the mota of this cap don vi hanh chinh
	 */
	public void setMota(String mota);

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

	public int compareTo(CapDonViHanhChinh capDonViHanhChinh);

	public int hashCode();

	public CacheModel<CapDonViHanhChinh> toCacheModel();

	public CapDonViHanhChinh toEscapedModel();

	public String toString();

	public String toXmlString();
}