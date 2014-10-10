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

package org.oep.cmon.dao.hosolienthong.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HoSoLienThong service. Represents a row in the &quot;CMON_HOSOLIENTHONG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.hosolienthong.model.impl.HoSoLienThongModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.hosolienthong.model.impl.HoSoLienThongImpl}.
 * </p>
 *
 * @author hoangtrung.nguyen
 * @see HoSoLienThong
 * @see org.oep.cmon.dao.hosolienthong.model.impl.HoSoLienThongImpl
 * @see org.oep.cmon.dao.hosolienthong.model.impl.HoSoLienThongModelImpl
 * @generated
 */
public interface HoSoLienThongModel extends BaseModel<HoSoLienThong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ho so lien thong model instance should use the {@link HoSoLienThong} interface instead.
	 */

	/**
	 * Returns the primary key of this ho so lien thong.
	 *
	 * @return the primary key of this ho so lien thong
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ho so lien thong.
	 *
	 * @param primaryKey the primary key of this ho so lien thong
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this ho so lien thong.
	 *
	 * @return the ID of this ho so lien thong
	 */
	public long getId();

	/**
	 * Sets the ID of this ho so lien thong.
	 *
	 * @param id the ID of this ho so lien thong
	 */
	public void setId(long id);

	/**
	 * Returns the ho so ID of this ho so lien thong.
	 *
	 * @return the ho so ID of this ho so lien thong
	 */
	public long getHoSoId();

	/**
	 * Sets the ho so ID of this ho so lien thong.
	 *
	 * @param hoSoId the ho so ID of this ho so lien thong
	 */
	public void setHoSoId(long hoSoId);

	/**
	 * Returns the co quan gui ID of this ho so lien thong.
	 *
	 * @return the co quan gui ID of this ho so lien thong
	 */
	public long getCoQuanGuiId();

	/**
	 * Sets the co quan gui ID of this ho so lien thong.
	 *
	 * @param coQuanGuiId the co quan gui ID of this ho so lien thong
	 */
	public void setCoQuanGuiId(long coQuanGuiId);

	/**
	 * Returns the co quan nhan ID of this ho so lien thong.
	 *
	 * @return the co quan nhan ID of this ho so lien thong
	 */
	public long getCoQuanNhanId();

	/**
	 * Sets the co quan nhan ID of this ho so lien thong.
	 *
	 * @param coQuanNhanId the co quan nhan ID of this ho so lien thong
	 */
	public void setCoQuanNhanId(long coQuanNhanId);

	/**
	 * Returns the thu tuc gui ID of this ho so lien thong.
	 *
	 * @return the thu tuc gui ID of this ho so lien thong
	 */
	public long getThuTucGuiId();

	/**
	 * Sets the thu tuc gui ID of this ho so lien thong.
	 *
	 * @param thuTucGuiId the thu tuc gui ID of this ho so lien thong
	 */
	public void setThuTucGuiId(long thuTucGuiId);

	/**
	 * Returns the thu tuc nhan ID of this ho so lien thong.
	 *
	 * @return the thu tuc nhan ID of this ho so lien thong
	 */
	public long getThuTucNhanId();

	/**
	 * Sets the thu tuc nhan ID of this ho so lien thong.
	 *
	 * @param thuTucNhanId the thu tuc nhan ID of this ho so lien thong
	 */
	public void setThuTucNhanId(long thuTucNhanId);

	/**
	 * Returns the ma so bien nhan luc gui of this ho so lien thong.
	 *
	 * @return the ma so bien nhan luc gui of this ho so lien thong
	 */
	@AutoEscape
	public String getMaSoBienNhanLucGui();

	/**
	 * Sets the ma so bien nhan luc gui of this ho so lien thong.
	 *
	 * @param maSoBienNhanLucGui the ma so bien nhan luc gui of this ho so lien thong
	 */
	public void setMaSoBienNhanLucGui(String maSoBienNhanLucGui);

	/**
	 * Returns the ma so bien nhan luc nhan of this ho so lien thong.
	 *
	 * @return the ma so bien nhan luc nhan of this ho so lien thong
	 */
	@AutoEscape
	public String getMaSoBienNhanLucNhan();

	/**
	 * Sets the ma so bien nhan luc nhan of this ho so lien thong.
	 *
	 * @param maSoBienNhanLucNhan the ma so bien nhan luc nhan of this ho so lien thong
	 */
	public void setMaSoBienNhanLucNhan(String maSoBienNhanLucNhan);

	/**
	 * Returns the can bo gui ID of this ho so lien thong.
	 *
	 * @return the can bo gui ID of this ho so lien thong
	 */
	public long getCanBoGuiId();

	/**
	 * Sets the can bo gui ID of this ho so lien thong.
	 *
	 * @param canBoGuiId the can bo gui ID of this ho so lien thong
	 */
	public void setCanBoGuiId(long canBoGuiId);

	/**
	 * Returns the can bo nhan ID of this ho so lien thong.
	 *
	 * @return the can bo nhan ID of this ho so lien thong
	 */
	public Long getCanBoNhanId();

	/**
	 * Sets the can bo nhan ID of this ho so lien thong.
	 *
	 * @param canBoNhanId the can bo nhan ID of this ho so lien thong
	 */
	public void setCanBoNhanId(Long canBoNhanId);

	/**
	 * Returns the ngay gui of this ho so lien thong.
	 *
	 * @return the ngay gui of this ho so lien thong
	 */
	public Date getNgayGui();

	/**
	 * Sets the ngay gui of this ho so lien thong.
	 *
	 * @param ngayGui the ngay gui of this ho so lien thong
	 */
	public void setNgayGui(Date ngayGui);

	/**
	 * Returns the ngay nhan of this ho so lien thong.
	 *
	 * @return the ngay nhan of this ho so lien thong
	 */
	public Date getNgayNhan();

	/**
	 * Sets the ngay nhan of this ho so lien thong.
	 *
	 * @param ngayNhan the ngay nhan of this ho so lien thong
	 */
	public void setNgayNhan(Date ngayNhan);

	/**
	 * Returns the ho ten can bo gui of this ho so lien thong.
	 *
	 * @return the ho ten can bo gui of this ho so lien thong
	 */
	@AutoEscape
	public String getHoTenCanBoGui();

	/**
	 * Sets the ho ten can bo gui of this ho so lien thong.
	 *
	 * @param hoTenCanBoGui the ho ten can bo gui of this ho so lien thong
	 */
	public void setHoTenCanBoGui(String hoTenCanBoGui);

	/**
	 * Returns the ho ten can bo nhan of this ho so lien thong.
	 *
	 * @return the ho ten can bo nhan of this ho so lien thong
	 */
	@AutoEscape
	public String getHoTenCanBoNhan();

	/**
	 * Sets the ho ten can bo nhan of this ho so lien thong.
	 *
	 * @param hoTenCanBoNhan the ho ten can bo nhan of this ho so lien thong
	 */
	public void setHoTenCanBoNhan(String hoTenCanBoNhan);

	/**
	 * Returns the can bo nop ho so giay ID of this ho so lien thong.
	 *
	 * @return the can bo nop ho so giay ID of this ho so lien thong
	 */
	public Long getCanBoNopHoSoGiayId();

	/**
	 * Sets the can bo nop ho so giay ID of this ho so lien thong.
	 *
	 * @param canBoNopHoSoGiayId the can bo nop ho so giay ID of this ho so lien thong
	 */
	public void setCanBoNopHoSoGiayId(Long canBoNopHoSoGiayId);

	/**
	 * Returns the ho ten can bo nop ho so giay of this ho so lien thong.
	 *
	 * @return the ho ten can bo nop ho so giay of this ho so lien thong
	 */
	@AutoEscape
	public String getHoTenCanBoNopHoSoGiay();

	/**
	 * Sets the ho ten can bo nop ho so giay of this ho so lien thong.
	 *
	 * @param hoTenCanBoNopHoSoGiay the ho ten can bo nop ho so giay of this ho so lien thong
	 */
	public void setHoTenCanBoNopHoSoGiay(String hoTenCanBoNopHoSoGiay);

	/**
	 * Returns the trang thai lien thong of this ho so lien thong.
	 *
	 * @return the trang thai lien thong of this ho so lien thong
	 */
	public int getTrangThaiLienThong();

	/**
	 * Sets the trang thai lien thong of this ho so lien thong.
	 *
	 * @param trangThaiLienThong the trang thai lien thong of this ho so lien thong
	 */
	public void setTrangThaiLienThong(int trangThaiLienThong);

	/**
	 * Returns the ghi chu gui lien thong of this ho so lien thong.
	 *
	 * @return the ghi chu gui lien thong of this ho so lien thong
	 */
	@AutoEscape
	public String getGhiChuGuiLienThong();

	/**
	 * Sets the ghi chu gui lien thong of this ho so lien thong.
	 *
	 * @param ghiChuGuiLienThong the ghi chu gui lien thong of this ho so lien thong
	 */
	public void setGhiChuGuiLienThong(String ghiChuGuiLienThong);

	/**
	 * Returns the ho ten cong dan nop of this ho so lien thong.
	 *
	 * @return the ho ten cong dan nop of this ho so lien thong
	 */
	@AutoEscape
	public String getHoTenCongDanNop();

	/**
	 * Sets the ho ten cong dan nop of this ho so lien thong.
	 *
	 * @param hoTenCongDanNop the ho ten cong dan nop of this ho so lien thong
	 */
	public void setHoTenCongDanNop(String hoTenCongDanNop);

	/**
	 * Returns the dia chi day du cong dan nop of this ho so lien thong.
	 *
	 * @return the dia chi day du cong dan nop of this ho so lien thong
	 */
	@AutoEscape
	public String getDiaChiDayDuCongDanNop();

	/**
	 * Sets the dia chi day du cong dan nop of this ho so lien thong.
	 *
	 * @param diaChiDayDuCongDanNop the dia chi day du cong dan nop of this ho so lien thong
	 */
	public void setDiaChiDayDuCongDanNop(String diaChiDayDuCongDanNop);

	/**
	 * Returns the ngay tu choi of this ho so lien thong.
	 *
	 * @return the ngay tu choi of this ho so lien thong
	 */
	public Date getNgayTuChoi();

	/**
	 * Sets the ngay tu choi of this ho so lien thong.
	 *
	 * @param ngayTuChoi the ngay tu choi of this ho so lien thong
	 */
	public void setNgayTuChoi(Date ngayTuChoi);

	/**
	 * Returns the ngay noi nhan tra ket qua of this ho so lien thong.
	 *
	 * @return the ngay noi nhan tra ket qua of this ho so lien thong
	 */
	public Date getNgayNoiNhanTraKetQua();

	/**
	 * Sets the ngay noi nhan tra ket qua of this ho so lien thong.
	 *
	 * @param ngayNoiNhanTraKetQua the ngay noi nhan tra ket qua of this ho so lien thong
	 */
	public void setNgayNoiNhanTraKetQua(Date ngayNoiNhanTraKetQua);

	/**
	 * Returns the ngay noi gui nhan ket qua of this ho so lien thong.
	 *
	 * @return the ngay noi gui nhan ket qua of this ho so lien thong
	 */
	public Date getNgayNoiGuiNhanKetQua();

	/**
	 * Sets the ngay noi gui nhan ket qua of this ho so lien thong.
	 *
	 * @param ngayNoiGuiNhanKetQua the ngay noi gui nhan ket qua of this ho so lien thong
	 */
	public void setNgayNoiGuiNhanKetQua(Date ngayNoiGuiNhanKetQua);

	/**
	 * Returns the can bo tiep nhan noi gui ID of this ho so lien thong.
	 *
	 * @return the can bo tiep nhan noi gui ID of this ho so lien thong
	 */
	public long getCanBoTiepNhanNoiGuiId();

	/**
	 * Sets the can bo tiep nhan noi gui ID of this ho so lien thong.
	 *
	 * @param canBoTiepNhanNoiGuiId the can bo tiep nhan noi gui ID of this ho so lien thong
	 */
	public void setCanBoTiepNhanNoiGuiId(long canBoTiepNhanNoiGuiId);

	/**
	 * Returns the ho ten can bo tiep nhan noi gui of this ho so lien thong.
	 *
	 * @return the ho ten can bo tiep nhan noi gui of this ho so lien thong
	 */
	@AutoEscape
	public String getHoTenCanBoTiepNhanNoiGui();

	/**
	 * Sets the ho ten can bo tiep nhan noi gui of this ho so lien thong.
	 *
	 * @param hoTenCanBoTiepNhanNoiGui the ho ten can bo tiep nhan noi gui of this ho so lien thong
	 */
	public void setHoTenCanBoTiepNhanNoiGui(String hoTenCanBoTiepNhanNoiGui);

	/**
	 * Returns the ten co quan gui of this ho so lien thong.
	 *
	 * @return the ten co quan gui of this ho so lien thong
	 */
	@AutoEscape
	public String getTenCoQuanGui();

	/**
	 * Sets the ten co quan gui of this ho so lien thong.
	 *
	 * @param tenCoQuanGui the ten co quan gui of this ho so lien thong
	 */
	public void setTenCoQuanGui(String tenCoQuanGui);

	/**
	 * Returns the ten thu tuc gui of this ho so lien thong.
	 *
	 * @return the ten thu tuc gui of this ho so lien thong
	 */
	@AutoEscape
	public String getTenThuTucGui();

	/**
	 * Sets the ten thu tuc gui of this ho so lien thong.
	 *
	 * @param tenThuTucGui the ten thu tuc gui of this ho so lien thong
	 */
	public void setTenThuTucGui(String tenThuTucGui);

	/**
	 * Returns the ten co quan nhan of this ho so lien thong.
	 *
	 * @return the ten co quan nhan of this ho so lien thong
	 */
	@AutoEscape
	public String getTenCoQuanNhan();

	/**
	 * Sets the ten co quan nhan of this ho so lien thong.
	 *
	 * @param tenCoQuanNhan the ten co quan nhan of this ho so lien thong
	 */
	public void setTenCoQuanNhan(String tenCoQuanNhan);

	/**
	 * Returns the ten thu tuc nhan of this ho so lien thong.
	 *
	 * @return the ten thu tuc nhan of this ho so lien thong
	 */
	@AutoEscape
	public String getTenThuTucNhan();

	/**
	 * Sets the ten thu tuc nhan of this ho so lien thong.
	 *
	 * @param tenThuTucNhan the ten thu tuc nhan of this ho so lien thong
	 */
	public void setTenThuTucNhan(String tenThuTucNhan);

	/**
	 * Returns the thu tu lien thong of this ho so lien thong.
	 *
	 * @return the thu tu lien thong of this ho so lien thong
	 */
	public int getThuTuLienThong();

	/**
	 * Sets the thu tu lien thong of this ho so lien thong.
	 *
	 * @param thuTuLienThong the thu tu lien thong of this ho so lien thong
	 */
	public void setThuTuLienThong(int thuTuLienThong);

	/**
	 * Returns the ngay noi nhan hen tra of this ho so lien thong.
	 *
	 * @return the ngay noi nhan hen tra of this ho so lien thong
	 */
	public Date getNgayNoiNhanHenTra();

	/**
	 * Sets the ngay noi nhan hen tra of this ho so lien thong.
	 *
	 * @param ngayNoiNhanHenTra the ngay noi nhan hen tra of this ho so lien thong
	 */
	public void setNgayNoiNhanHenTra(Date ngayNoiNhanHenTra);

	/**
	 * Returns the so ngay noi nhan xu ly du kien of this ho so lien thong.
	 *
	 * @return the so ngay noi nhan xu ly du kien of this ho so lien thong
	 */
	public int getSoNgayNoiNhanXuLyDuKien();

	/**
	 * Sets the so ngay noi nhan xu ly du kien of this ho so lien thong.
	 *
	 * @param soNgayNoiNhanXuLyDuKien the so ngay noi nhan xu ly du kien of this ho so lien thong
	 */
	public void setSoNgayNoiNhanXuLyDuKien(int soNgayNoiNhanXuLyDuKien);

	/**
	 * Returns the nguoi tao of this ho so lien thong.
	 *
	 * @return the nguoi tao of this ho so lien thong
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this ho so lien thong.
	 *
	 * @param nguoiTao the nguoi tao of this ho so lien thong
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the ngay tao of this ho so lien thong.
	 *
	 * @return the ngay tao of this ho so lien thong
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this ho so lien thong.
	 *
	 * @param ngayTao the ngay tao of this ho so lien thong
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi sua of this ho so lien thong.
	 *
	 * @return the nguoi sua of this ho so lien thong
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this ho so lien thong.
	 *
	 * @param nguoiSua the nguoi sua of this ho so lien thong
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the ngay sua of this ho so lien thong.
	 *
	 * @return the ngay sua of this ho so lien thong
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this ho so lien thong.
	 *
	 * @param ngaySua the ngay sua of this ho so lien thong
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the da xoa of this ho so lien thong.
	 *
	 * @return the da xoa of this ho so lien thong
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this ho so lien thong.
	 *
	 * @param daXoa the da xoa of this ho so lien thong
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

	public int compareTo(HoSoLienThong hoSoLienThong);

	public int hashCode();

	public CacheModel<HoSoLienThong> toCacheModel();

	public HoSoLienThong toEscapedModel();

	public String toString();

	public String toXmlString();
}