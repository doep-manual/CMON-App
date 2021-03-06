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
 * The base model interface for the ThongTinThanhToan service. Represents a row in the &quot;CMON_THONGTINTHANHTOAN&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.ttthanhtoan.model.impl.ThongTinThanhToanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.ttthanhtoan.model.impl.ThongTinThanhToanImpl}.
 * </p>
 *
 * @author Thanhdd
 * @see ThongTinThanhToan
 * @see org.oep.cmon.dao.ttthanhtoan.model.impl.ThongTinThanhToanImpl
 * @see org.oep.cmon.dao.ttthanhtoan.model.impl.ThongTinThanhToanModelImpl
 * @generated
 */
public interface ThongTinThanhToanModel extends BaseModel<ThongTinThanhToan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a thong tin thanh toan model instance should use the {@link ThongTinThanhToan} interface instead.
	 */

	/**
	 * Returns the primary key of this thong tin thanh toan.
	 *
	 * @return the primary key of this thong tin thanh toan
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this thong tin thanh toan.
	 *
	 * @param primaryKey the primary key of this thong tin thanh toan
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this thong tin thanh toan.
	 *
	 * @return the ID of this thong tin thanh toan
	 */
	public long getId();

	/**
	 * Sets the ID of this thong tin thanh toan.
	 *
	 * @param id the ID of this thong tin thanh toan
	 */
	public void setId(long id);

	/**
	 * Returns the ho so t t h c cong ID of this thong tin thanh toan.
	 *
	 * @return the ho so t t h c cong ID of this thong tin thanh toan
	 */
	public long getHoSoTTHCCongId();

	/**
	 * Sets the ho so t t h c cong ID of this thong tin thanh toan.
	 *
	 * @param hoSoTTHCCongId the ho so t t h c cong ID of this thong tin thanh toan
	 */
	public void setHoSoTTHCCongId(long hoSoTTHCCongId);

	/**
	 * Returns the tai khoan nguoi dung nop ID of this thong tin thanh toan.
	 *
	 * @return the tai khoan nguoi dung nop ID of this thong tin thanh toan
	 */
	public Long getTaiKhoanNguoiDungNopId();

	/**
	 * Sets the tai khoan nguoi dung nop ID of this thong tin thanh toan.
	 *
	 * @param taiKhoanNguoiDungNopId the tai khoan nguoi dung nop ID of this thong tin thanh toan
	 */
	public void setTaiKhoanNguoiDungNopId(Long taiKhoanNguoiDungNopId);

	/**
	 * Returns the tai khoan nguoi dung nhan ID of this thong tin thanh toan.
	 *
	 * @return the tai khoan nguoi dung nhan ID of this thong tin thanh toan
	 */
	public Long getTaiKhoanNguoiDungNhanId();

	/**
	 * Sets the tai khoan nguoi dung nhan ID of this thong tin thanh toan.
	 *
	 * @param taiKhoanNguoiDungNhanId the tai khoan nguoi dung nhan ID of this thong tin thanh toan
	 */
	public void setTaiKhoanNguoiDungNhanId(Long taiKhoanNguoiDungNhanId);

	/**
	 * Returns the loai thanh toan of this thong tin thanh toan.
	 *
	 * @return the loai thanh toan of this thong tin thanh toan
	 */
	public long getLoaiThanhToan();

	/**
	 * Sets the loai thanh toan of this thong tin thanh toan.
	 *
	 * @param loaiThanhToan the loai thanh toan of this thong tin thanh toan
	 */
	public void setLoaiThanhToan(long loaiThanhToan);

	/**
	 * Returns the ten nguoi nop tien of this thong tin thanh toan.
	 *
	 * @return the ten nguoi nop tien of this thong tin thanh toan
	 */
	@AutoEscape
	public String getTenNguoiNopTien();

	/**
	 * Sets the ten nguoi nop tien of this thong tin thanh toan.
	 *
	 * @param tenNguoiNopTien the ten nguoi nop tien of this thong tin thanh toan
	 */
	public void setTenNguoiNopTien(String tenNguoiNopTien);

	/**
	 * Returns the ten can bo nhan tien of this thong tin thanh toan.
	 *
	 * @return the ten can bo nhan tien of this thong tin thanh toan
	 */
	@AutoEscape
	public String getTenCanBoNhanTien();

	/**
	 * Sets the ten can bo nhan tien of this thong tin thanh toan.
	 *
	 * @param tenCanBoNhanTien the ten can bo nhan tien of this thong tin thanh toan
	 */
	public void setTenCanBoNhanTien(String tenCanBoNhanTien);

	/**
	 * Returns the xac nhan of this thong tin thanh toan.
	 *
	 * @return the xac nhan of this thong tin thanh toan
	 */
	public long getXacNhan();

	/**
	 * Sets the xac nhan of this thong tin thanh toan.
	 *
	 * @param xacNhan the xac nhan of this thong tin thanh toan
	 */
	public void setXacNhan(long xacNhan);

	/**
	 * Returns the loai phi of this thong tin thanh toan.
	 *
	 * @return the loai phi of this thong tin thanh toan
	 */
	public long getLoaiPhi();

	/**
	 * Sets the loai phi of this thong tin thanh toan.
	 *
	 * @param loaiPhi the loai phi of this thong tin thanh toan
	 */
	public void setLoaiPhi(long loaiPhi);

	/**
	 * Returns the so tien of this thong tin thanh toan.
	 *
	 * @return the so tien of this thong tin thanh toan
	 */
	public long getSoTien();

	/**
	 * Sets the so tien of this thong tin thanh toan.
	 *
	 * @param soTien the so tien of this thong tin thanh toan
	 */
	public void setSoTien(long soTien);

	/**
	 * Returns the ngay thu tien of this thong tin thanh toan.
	 *
	 * @return the ngay thu tien of this thong tin thanh toan
	 */
	public Date getNgayThuTien();

	/**
	 * Sets the ngay thu tien of this thong tin thanh toan.
	 *
	 * @param ngayThuTien the ngay thu tien of this thong tin thanh toan
	 */
	public void setNgayThuTien(Date ngayThuTien);

	/**
	 * Returns the ngay xac nhan of this thong tin thanh toan.
	 *
	 * @return the ngay xac nhan of this thong tin thanh toan
	 */
	public Date getNgayXacNhan();

	/**
	 * Sets the ngay xac nhan of this thong tin thanh toan.
	 *
	 * @param ngayXacNhan the ngay xac nhan of this thong tin thanh toan
	 */
	public void setNgayXacNhan(Date ngayXacNhan);

	/**
	 * Returns the ngay chuyen tien of this thong tin thanh toan.
	 *
	 * @return the ngay chuyen tien of this thong tin thanh toan
	 */
	public Date getNgayChuyenTien();

	/**
	 * Sets the ngay chuyen tien of this thong tin thanh toan.
	 *
	 * @param ngayChuyenTien the ngay chuyen tien of this thong tin thanh toan
	 */
	public void setNgayChuyenTien(Date ngayChuyenTien);

	/**
	 * Returns the y kien of this thong tin thanh toan.
	 *
	 * @return the y kien of this thong tin thanh toan
	 */
	@AutoEscape
	public String getYKien();

	/**
	 * Sets the y kien of this thong tin thanh toan.
	 *
	 * @param yKien the y kien of this thong tin thanh toan
	 */
	public void setYKien(String yKien);

	/**
	 * Returns the noi luu tru ID of this thong tin thanh toan.
	 *
	 * @return the noi luu tru ID of this thong tin thanh toan
	 */
	public long getNoiLuuTruId();

	/**
	 * Sets the noi luu tru ID of this thong tin thanh toan.
	 *
	 * @param noiLuuTruId the noi luu tru ID of this thong tin thanh toan
	 */
	public void setNoiLuuTruId(long noiLuuTruId);

	/**
	 * Returns the nguoi tao of this thong tin thanh toan.
	 *
	 * @return the nguoi tao of this thong tin thanh toan
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this thong tin thanh toan.
	 *
	 * @param nguoiTao the nguoi tao of this thong tin thanh toan
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this thong tin thanh toan.
	 *
	 * @return the nguoi sua of this thong tin thanh toan
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this thong tin thanh toan.
	 *
	 * @param nguoiSua the nguoi sua of this thong tin thanh toan
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the ngay tao of this thong tin thanh toan.
	 *
	 * @return the ngay tao of this thong tin thanh toan
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this thong tin thanh toan.
	 *
	 * @param ngayTao the ngay tao of this thong tin thanh toan
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the ngay sua of this thong tin thanh toan.
	 *
	 * @return the ngay sua of this thong tin thanh toan
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this thong tin thanh toan.
	 *
	 * @param ngaySua the ngay sua of this thong tin thanh toan
	 */
	public void setNgaySua(Date ngaySua);

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

	public int compareTo(ThongTinThanhToan thongTinThanhToan);

	public int hashCode();

	public CacheModel<ThongTinThanhToan> toCacheModel();

	public ThongTinThanhToan toEscapedModel();

	public String toString();

	public String toXmlString();
}