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
 * The base model interface for the CoQuanHanhChinhSuNghiep service. Represents a row in the &quot;CMON_COQUANHANHCHINHSUNGHIEP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.qlhc.model.impl.CoQuanHanhChinhSuNghiepModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.qlhc.model.impl.CoQuanHanhChinhSuNghiepImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see CoQuanHanhChinhSuNghiep
 * @see org.oep.cmon.dao.qlhc.model.impl.CoQuanHanhChinhSuNghiepImpl
 * @see org.oep.cmon.dao.qlhc.model.impl.CoQuanHanhChinhSuNghiepModelImpl
 * @generated
 */
public interface CoQuanHanhChinhSuNghiepModel extends BaseModel<CoQuanHanhChinhSuNghiep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a co quan hanh chinh su nghiep model instance should use the {@link CoQuanHanhChinhSuNghiep} interface instead.
	 */

	/**
	 * Returns the primary key of this co quan hanh chinh su nghiep.
	 *
	 * @return the primary key of this co quan hanh chinh su nghiep
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this co quan hanh chinh su nghiep.
	 *
	 * @param primaryKey the primary key of this co quan hanh chinh su nghiep
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the ID of this co quan hanh chinh su nghiep
	 */
	public long getId();

	/**
	 * Sets the ID of this co quan hanh chinh su nghiep.
	 *
	 * @param id the ID of this co quan hanh chinh su nghiep
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this co quan hanh chinh su nghiep.
	 *
	 * @return the ma of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this co quan hanh chinh su nghiep.
	 *
	 * @param ma the ma of this co quan hanh chinh su nghiep
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this co quan hanh chinh su nghiep.
	 *
	 * @return the ten of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this co quan hanh chinh su nghiep.
	 *
	 * @param ten the ten of this co quan hanh chinh su nghiep
	 */
	public void setTen(String ten);

	/**
	 * Returns the so d t duong day nong of this co quan hanh chinh su nghiep.
	 *
	 * @return the so d t duong day nong of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getSoDTDuongDayNong();

	/**
	 * Sets the so d t duong day nong of this co quan hanh chinh su nghiep.
	 *
	 * @param soDTDuongDayNong the so d t duong day nong of this co quan hanh chinh su nghiep
	 */
	public void setSoDTDuongDayNong(String soDTDuongDayNong);

	/**
	 * Returns the noi bo of this co quan hanh chinh su nghiep.
	 *
	 * @return the noi bo of this co quan hanh chinh su nghiep
	 */
	public long getNoiBo();

	/**
	 * Sets the noi bo of this co quan hanh chinh su nghiep.
	 *
	 * @param noiBo the noi bo of this co quan hanh chinh su nghiep
	 */
	public void setNoiBo(long noiBo);

	/**
	 * Returns the chuc nang of this co quan hanh chinh su nghiep.
	 *
	 * @return the chuc nang of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getChucNang();

	/**
	 * Sets the chuc nang of this co quan hanh chinh su nghiep.
	 *
	 * @param chucNang the chuc nang of this co quan hanh chinh su nghiep
	 */
	public void setChucNang(String chucNang);

	/**
	 * Returns the tong so c b n v of this co quan hanh chinh su nghiep.
	 *
	 * @return the tong so c b n v of this co quan hanh chinh su nghiep
	 */
	public long getTongSoCBNV();

	/**
	 * Sets the tong so c b n v of this co quan hanh chinh su nghiep.
	 *
	 * @param tongSoCBNV the tong so c b n v of this co quan hanh chinh su nghiep
	 */
	public void setTongSoCBNV(long tongSoCBNV);

	/**
	 * Returns the so d t of this co quan hanh chinh su nghiep.
	 *
	 * @return the so d t of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getSoDT();

	/**
	 * Sets the so d t of this co quan hanh chinh su nghiep.
	 *
	 * @param soDT the so d t of this co quan hanh chinh su nghiep
	 */
	public void setSoDT(String soDT);

	/**
	 * Returns the fax of this co quan hanh chinh su nghiep.
	 *
	 * @return the fax of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this co quan hanh chinh su nghiep.
	 *
	 * @param fax the fax of this co quan hanh chinh su nghiep
	 */
	public void setFax(String fax);

	/**
	 * Returns the email of this co quan hanh chinh su nghiep.
	 *
	 * @return the email of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this co quan hanh chinh su nghiep.
	 *
	 * @param email the email of this co quan hanh chinh su nghiep
	 */
	public void setEmail(String email);

	/**
	 * Returns the tong so giuong benh of this co quan hanh chinh su nghiep.
	 *
	 * @return the tong so giuong benh of this co quan hanh chinh su nghiep
	 */
	public long getTongSoGiuongBenh();

	/**
	 * Sets the tong so giuong benh of this co quan hanh chinh su nghiep.
	 *
	 * @param tongSoGiuongBenh the tong so giuong benh of this co quan hanh chinh su nghiep
	 */
	public void setTongSoGiuongBenh(long tongSoGiuongBenh);

	/**
	 * Returns the vi do of this co quan hanh chinh su nghiep.
	 *
	 * @return the vi do of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getViDo();

	/**
	 * Sets the vi do of this co quan hanh chinh su nghiep.
	 *
	 * @param viDo the vi do of this co quan hanh chinh su nghiep
	 */
	public void setViDo(String viDo);

	/**
	 * Returns the kinh do of this co quan hanh chinh su nghiep.
	 *
	 * @return the kinh do of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getKinhDo();

	/**
	 * Sets the kinh do of this co quan hanh chinh su nghiep.
	 *
	 * @param kinhDo the kinh do of this co quan hanh chinh su nghiep
	 */
	public void setKinhDo(String kinhDo);

	/**
	 * Returns the dia chi co quan h c s n xa ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the dia chi co quan h c s n xa ID of this co quan hanh chinh su nghiep
	 */
	public long getDiaChiCoQuanHCSNXaId();

	/**
	 * Sets the dia chi co quan h c s n xa ID of this co quan hanh chinh su nghiep.
	 *
	 * @param diaChiCoQuanHCSNXaId the dia chi co quan h c s n xa ID of this co quan hanh chinh su nghiep
	 */
	public void setDiaChiCoQuanHCSNXaId(long diaChiCoQuanHCSNXaId);

	/**
	 * Returns the tuyen ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the tuyen ID of this co quan hanh chinh su nghiep
	 */
	public long getTuyenId();

	/**
	 * Sets the tuyen ID of this co quan hanh chinh su nghiep.
	 *
	 * @param tuyenId the tuyen ID of this co quan hanh chinh su nghiep
	 */
	public void setTuyenId(long tuyenId);

	/**
	 * Returns the dia chi co quan h c s n tinh ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the dia chi co quan h c s n tinh ID of this co quan hanh chinh su nghiep
	 */
	public long getDiaChiCoQuanHCSNTinhId();

	/**
	 * Sets the dia chi co quan h c s n tinh ID of this co quan hanh chinh su nghiep.
	 *
	 * @param diaChiCoQuanHCSNTinhId the dia chi co quan h c s n tinh ID of this co quan hanh chinh su nghiep
	 */
	public void setDiaChiCoQuanHCSNTinhId(long diaChiCoQuanHCSNTinhId);

	/**
	 * Returns the nguoi dai dien ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the nguoi dai dien ID of this co quan hanh chinh su nghiep
	 */
	public long getNguoiDaiDienId();

	/**
	 * Sets the nguoi dai dien ID of this co quan hanh chinh su nghiep.
	 *
	 * @param nguoiDaiDienId the nguoi dai dien ID of this co quan hanh chinh su nghiep
	 */
	public void setNguoiDaiDienId(long nguoiDaiDienId);

	/**
	 * Returns the dia chi co quan h c s n huyen ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the dia chi co quan h c s n huyen ID of this co quan hanh chinh su nghiep
	 */
	public long getDiaChiCoQuanHCSNHuyenId();

	/**
	 * Sets the dia chi co quan h c s n huyen ID of this co quan hanh chinh su nghiep.
	 *
	 * @param diaChiCoQuanHCSNHuyenId the dia chi co quan h c s n huyen ID of this co quan hanh chinh su nghiep
	 */
	public void setDiaChiCoQuanHCSNHuyenId(long diaChiCoQuanHCSNHuyenId);

	/**
	 * Returns the hang ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the hang ID of this co quan hanh chinh su nghiep
	 */
	public long getHangId();

	/**
	 * Sets the hang ID of this co quan hanh chinh su nghiep.
	 *
	 * @param hangId the hang ID of this co quan hanh chinh su nghiep
	 */
	public void setHangId(long hangId);

	/**
	 * Returns the co quan quan ly ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the co quan quan ly ID of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getCoQuanQuanLyId();

	/**
	 * Sets the co quan quan ly ID of this co quan hanh chinh su nghiep.
	 *
	 * @param coQuanQuanLyId the co quan quan ly ID of this co quan hanh chinh su nghiep
	 */
	public void setCoQuanQuanLyId(String coQuanQuanLyId);

	/**
	 * Returns the loai ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the loai ID of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getLoaiId();

	/**
	 * Sets the loai ID of this co quan hanh chinh su nghiep.
	 *
	 * @param loaiId the loai ID of this co quan hanh chinh su nghiep
	 */
	public void setLoaiId(String loaiId);

	/**
	 * Returns the so qd thanh lap of this co quan hanh chinh su nghiep.
	 *
	 * @return the so qd thanh lap of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getSoQdThanhLap();

	/**
	 * Sets the so qd thanh lap of this co quan hanh chinh su nghiep.
	 *
	 * @param soQdThanhLap the so qd thanh lap of this co quan hanh chinh su nghiep
	 */
	public void setSoQdThanhLap(String soQdThanhLap);

	/**
	 * Returns the mo ta dia chi of this co quan hanh chinh su nghiep.
	 *
	 * @return the mo ta dia chi of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getMoTaDiaChi();

	/**
	 * Sets the mo ta dia chi of this co quan hanh chinh su nghiep.
	 *
	 * @param moTaDiaChi the mo ta dia chi of this co quan hanh chinh su nghiep
	 */
	public void setMoTaDiaChi(String moTaDiaChi);

	/**
	 * Returns the ten nguoi dai dien of this co quan hanh chinh su nghiep.
	 *
	 * @return the ten nguoi dai dien of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getTenNguoiDaiDien();

	/**
	 * Sets the ten nguoi dai dien of this co quan hanh chinh su nghiep.
	 *
	 * @param tenNguoiDaiDien the ten nguoi dai dien of this co quan hanh chinh su nghiep
	 */
	public void setTenNguoiDaiDien(String tenNguoiDaiDien);

	/**
	 * Returns the ngay tao of this co quan hanh chinh su nghiep.
	 *
	 * @return the ngay tao of this co quan hanh chinh su nghiep
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this co quan hanh chinh su nghiep.
	 *
	 * @param ngayTao the ngay tao of this co quan hanh chinh su nghiep
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the da xoa of this co quan hanh chinh su nghiep.
	 *
	 * @return the da xoa of this co quan hanh chinh su nghiep
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this co quan hanh chinh su nghiep.
	 *
	 * @param daXoa the da xoa of this co quan hanh chinh su nghiep
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the ngay sua of this co quan hanh chinh su nghiep.
	 *
	 * @return the ngay sua of this co quan hanh chinh su nghiep
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this co quan hanh chinh su nghiep.
	 *
	 * @param ngaySua the ngay sua of this co quan hanh chinh su nghiep
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the cha ID of this co quan hanh chinh su nghiep.
	 *
	 * @return the cha ID of this co quan hanh chinh su nghiep
	 */
	public Long getChaId();

	/**
	 * Sets the cha ID of this co quan hanh chinh su nghiep.
	 *
	 * @param chaId the cha ID of this co quan hanh chinh su nghiep
	 */
	public void setChaId(Long chaId);

	/**
	 * Returns the nguoi tao of this co quan hanh chinh su nghiep.
	 *
	 * @return the nguoi tao of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this co quan hanh chinh su nghiep.
	 *
	 * @param nguoiTao the nguoi tao of this co quan hanh chinh su nghiep
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this co quan hanh chinh su nghiep.
	 *
	 * @return the nguoi sua of this co quan hanh chinh su nghiep
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this co quan hanh chinh su nghiep.
	 *
	 * @param nguoiSua the nguoi sua of this co quan hanh chinh su nghiep
	 */
	public void setNguoiSua(String nguoiSua);

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

	public int compareTo(CoQuanHanhChinhSuNghiep coQuanHanhChinhSuNghiep);

	public int hashCode();

	public CacheModel<CoQuanHanhChinhSuNghiep> toCacheModel();

	public CoQuanHanhChinhSuNghiep toEscapedModel();

	public String toString();

	public String toXmlString();
}