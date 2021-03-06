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

package org.oep.cmon.dao.tlct.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TaiLieuChungThuc service. Represents a row in the &quot;CMON_NOILUUTRUTAILIEU&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.tlct.model.impl.TaiLieuChungThucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.tlct.model.impl.TaiLieuChungThucImpl}.
 * </p>
 *
 * @author Liemnn
 * @see TaiLieuChungThuc
 * @see org.oep.cmon.dao.tlct.model.impl.TaiLieuChungThucImpl
 * @see org.oep.cmon.dao.tlct.model.impl.TaiLieuChungThucModelImpl
 * @generated
 */
public interface TaiLieuChungThucModel extends BaseModel<TaiLieuChungThuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tai lieu chung thuc model instance should use the {@link TaiLieuChungThuc} interface instead.
	 */

	/**
	 * Returns the primary key of this tai lieu chung thuc.
	 *
	 * @return the primary key of this tai lieu chung thuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tai lieu chung thuc.
	 *
	 * @param primaryKey the primary key of this tai lieu chung thuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tai lieu chung thuc.
	 *
	 * @return the ID of this tai lieu chung thuc
	 */
	public long getId();

	/**
	 * Sets the ID of this tai lieu chung thuc.
	 *
	 * @param id the ID of this tai lieu chung thuc
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this tai lieu chung thuc.
	 *
	 * @return the ten of this tai lieu chung thuc
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this tai lieu chung thuc.
	 *
	 * @param ten the ten of this tai lieu chung thuc
	 */
	public void setTen(String ten);

	/**
	 * Returns the ghi chu of this tai lieu chung thuc.
	 *
	 * @return the ghi chu of this tai lieu chung thuc
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this tai lieu chung thuc.
	 *
	 * @param ghiChu the ghi chu of this tai lieu chung thuc
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the noi luu tru ID of this tai lieu chung thuc.
	 *
	 * @return the noi luu tru ID of this tai lieu chung thuc
	 */
	public long getNoiLuuTruId();

	/**
	 * Sets the noi luu tru ID of this tai lieu chung thuc.
	 *
	 * @param noiLuuTruId the noi luu tru ID of this tai lieu chung thuc
	 */
	public void setNoiLuuTruId(long noiLuuTruId);

	/**
	 * Returns the ngay upload of this tai lieu chung thuc.
	 *
	 * @return the ngay upload of this tai lieu chung thuc
	 */
	public Date getNgayUpload();

	/**
	 * Sets the ngay upload of this tai lieu chung thuc.
	 *
	 * @param ngayUpload the ngay upload of this tai lieu chung thuc
	 */
	public void setNgayUpload(Date ngayUpload);

	/**
	 * Returns the phien ban of this tai lieu chung thuc.
	 *
	 * @return the phien ban of this tai lieu chung thuc
	 */
	public int getPhienBan();

	/**
	 * Sets the phien ban of this tai lieu chung thuc.
	 *
	 * @param phienBan the phien ban of this tai lieu chung thuc
	 */
	public void setPhienBan(int phienBan);

	/**
	 * Returns the ngay duyet of this tai lieu chung thuc.
	 *
	 * @return the ngay duyet of this tai lieu chung thuc
	 */
	public Date getNgayDuyet();

	/**
	 * Sets the ngay duyet of this tai lieu chung thuc.
	 *
	 * @param ngayDuyet the ngay duyet of this tai lieu chung thuc
	 */
	public void setNgayDuyet(Date ngayDuyet);

	/**
	 * Returns the hieu luc tu ngay of this tai lieu chung thuc.
	 *
	 * @return the hieu luc tu ngay of this tai lieu chung thuc
	 */
	public Date getHieuLucTuNgay();

	/**
	 * Sets the hieu luc tu ngay of this tai lieu chung thuc.
	 *
	 * @param hieuLucTuNgay the hieu luc tu ngay of this tai lieu chung thuc
	 */
	public void setHieuLucTuNgay(Date hieuLucTuNgay);

	/**
	 * Returns the hieu luc den ngay of this tai lieu chung thuc.
	 *
	 * @return the hieu luc den ngay of this tai lieu chung thuc
	 */
	public Date getHieuLucDenNgay();

	/**
	 * Sets the hieu luc den ngay of this tai lieu chung thuc.
	 *
	 * @param hieuLucDenNgay the hieu luc den ngay of this tai lieu chung thuc
	 */
	public void setHieuLucDenNgay(Date hieuLucDenNgay);

	/**
	 * Returns the ngay sua of this tai lieu chung thuc.
	 *
	 * @return the ngay sua of this tai lieu chung thuc
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this tai lieu chung thuc.
	 *
	 * @param ngaySua the ngay sua of this tai lieu chung thuc
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the nguoi sua of this tai lieu chung thuc.
	 *
	 * @return the nguoi sua of this tai lieu chung thuc
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this tai lieu chung thuc.
	 *
	 * @param nguoiSua the nguoi sua of this tai lieu chung thuc
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the danh muc giay to ID of this tai lieu chung thuc.
	 *
	 * @return the danh muc giay to ID of this tai lieu chung thuc
	 */
	public Long getDanhMucGiayToId();

	/**
	 * Sets the danh muc giay to ID of this tai lieu chung thuc.
	 *
	 * @param danhMucGiayToId the danh muc giay to ID of this tai lieu chung thuc
	 */
	public void setDanhMucGiayToId(Long danhMucGiayToId);

	/**
	 * Returns the trang thai of this tai lieu chung thuc.
	 *
	 * @return the trang thai of this tai lieu chung thuc
	 */
	public int getTrangThai();

	/**
	 * Sets the trang thai of this tai lieu chung thuc.
	 *
	 * @param trangThai the trang thai of this tai lieu chung thuc
	 */
	public void setTrangThai(int trangThai);

	/**
	 * Returns the chu sohuu ID of this tai lieu chung thuc.
	 *
	 * @return the chu sohuu ID of this tai lieu chung thuc
	 */
	public Long getChuSohuuId();

	/**
	 * Sets the chu sohuu ID of this tai lieu chung thuc.
	 *
	 * @param chuSohuuId the chu sohuu ID of this tai lieu chung thuc
	 */
	public void setChuSohuuId(Long chuSohuuId);

	/**
	 * Returns the nguoi upload ID of this tai lieu chung thuc.
	 *
	 * @return the nguoi upload ID of this tai lieu chung thuc
	 */
	public Long getNguoiUploadId();

	/**
	 * Sets the nguoi upload ID of this tai lieu chung thuc.
	 *
	 * @param nguoiUploadId the nguoi upload ID of this tai lieu chung thuc
	 */
	public void setNguoiUploadId(Long nguoiUploadId);

	/**
	 * Returns the nguoiduyet ID of this tai lieu chung thuc.
	 *
	 * @return the nguoiduyet ID of this tai lieu chung thuc
	 */
	public Long getNguoiduyetId();

	/**
	 * Sets the nguoiduyet ID of this tai lieu chung thuc.
	 *
	 * @param nguoiduyetId the nguoiduyet ID of this tai lieu chung thuc
	 */
	public void setNguoiduyetId(Long nguoiduyetId);

	/**
	 * Returns the ho so t t h c c ID of this tai lieu chung thuc.
	 *
	 * @return the ho so t t h c c ID of this tai lieu chung thuc
	 */
	public Long getHoSoTTHCCId();

	/**
	 * Sets the ho so t t h c c ID of this tai lieu chung thuc.
	 *
	 * @param hoSoTTHCCId the ho so t t h c c ID of this tai lieu chung thuc
	 */
	public void setHoSoTTHCCId(Long hoSoTTHCCId);

	/**
	 * Returns the ma ung dung of this tai lieu chung thuc.
	 *
	 * @return the ma ung dung of this tai lieu chung thuc
	 */
	@AutoEscape
	public String getMaUngDung();

	/**
	 * Sets the ma ung dung of this tai lieu chung thuc.
	 *
	 * @param maUngDung the ma ung dung of this tai lieu chung thuc
	 */
	public void setMaUngDung(String maUngDung);

	/**
	 * Returns the loai of this tai lieu chung thuc.
	 *
	 * @return the loai of this tai lieu chung thuc
	 */
	public int getLoai();

	/**
	 * Sets the loai of this tai lieu chung thuc.
	 *
	 * @param loai the loai of this tai lieu chung thuc
	 */
	public void setLoai(int loai);

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

	public int compareTo(TaiLieuChungThuc taiLieuChungThuc);

	public int hashCode();

	public CacheModel<TaiLieuChungThuc> toCacheModel();

	public TaiLieuChungThuc toEscapedModel();

	public String toString();

	public String toXmlString();
}