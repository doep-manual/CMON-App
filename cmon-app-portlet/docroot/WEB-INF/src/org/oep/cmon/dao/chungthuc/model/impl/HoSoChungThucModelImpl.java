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

package org.oep.cmon.dao.chungthuc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.cmon.dao.chungthuc.model.HoSoChungThuc;
import org.oep.cmon.dao.chungthuc.model.HoSoChungThucModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HoSoChungThuc service. Represents a row in the &quot;CMON_HOSOCHUNGTHUC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.chungthuc.model.HoSoChungThucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HoSoChungThucImpl}.
 * </p>
 *
 * @author vietho
 * @see HoSoChungThucImpl
 * @see org.oep.cmon.dao.chungthuc.model.HoSoChungThuc
 * @see org.oep.cmon.dao.chungthuc.model.HoSoChungThucModel
 * @generated
 */
public class HoSoChungThucModelImpl extends BaseModelImpl<HoSoChungThuc>
	implements HoSoChungThucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ho so chung thuc model instance should use the {@link org.oep.cmon.dao.chungthuc.model.HoSoChungThuc} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_HOSOCHUNGTHUC";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "TENCHUNGTHUC", Types.VARCHAR },
			{ "SOCHUNGTHUC", Types.VARCHAR },
			{ "NGAYNOPHOSO", Types.TIMESTAMP },
			{ "NGAYTRAKETQUA", Types.TIMESTAMP },
			{ "HOTENNGUOINOPHOSO", Types.VARCHAR },
			{ "DIACHITHUONGTRUNGUOINOP", Types.VARCHAR },
			{ "SODIENTHOAICODINHNGUOINOP", Types.VARCHAR },
			{ "TRANGTHAIHOSO", Types.INTEGER },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "THUTUCHANHCHINHID", Types.BIGINT },
			{ "CANBOTIEPNHANID", Types.BIGINT },
			{ "SODIENTHOAIDIDONGNGUOINOP", Types.VARCHAR },
			{ "GHICHU", Types.VARCHAR },
			{ "MUCDICHCHUNGTHUC", Types.VARCHAR },
			{ "MASOBIENNHAN", Types.VARCHAR },
			{ "CHUSOHUU", Types.VARCHAR },
			{ "SOBOHOSO", Types.INTEGER },
			{ "SOTO", Types.INTEGER },
			{ "TRUONGHOP", Types.VARCHAR },
			{ "LEPHI", Types.INTEGER },
			{ "PHIHOSO", Types.INTEGER },
			{ "EMAILNGUOINOP", Types.VARCHAR },
			{ "NGAYSINHNGUOINOP", Types.TIMESTAMP },
			{ "CMNDNGUOINOP", Types.VARCHAR },
			{ "GIOITINHNGUOINOP", Types.INTEGER },
			{ "TENCANBOKY", Types.VARCHAR },
			{ "CHUCVUCANBOKYID", Types.BIGINT },
			{ "SODANHMUCID", Types.BIGINT },
			{ "THUONGTRUTINHID", Types.BIGINT },
			{ "THUONGTRUHUYENID", Types.BIGINT },
			{ "THUONGTRUXAID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_HOSOCHUNGTHUC (ID LONG not null primary key,TENCHUNGTHUC VARCHAR(75) null,SOCHUNGTHUC VARCHAR(75) null,NGAYNOPHOSO DATE null,NGAYTRAKETQUA DATE null,HOTENNGUOINOPHOSO VARCHAR(75) null,DIACHITHUONGTRUNGUOINOP VARCHAR(75) null,SODIENTHOAICODINHNGUOINOP VARCHAR(75) null,TRANGTHAIHOSO INTEGER,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGAYTAO DATE null,NGUOISUA VARCHAR(75) null,NGAYSUA DATE null,THUTUCHANHCHINHID LONG null,CANBOTIEPNHANID LONG null,SODIENTHOAIDIDONGNGUOINOP VARCHAR(75) null,GHICHU VARCHAR(75) null,MUCDICHCHUNGTHUC VARCHAR(75) null,MASOBIENNHAN VARCHAR(75) null,CHUSOHUU VARCHAR(75) null,SOBOHOSO INTEGER,SOTO INTEGER,TRUONGHOP VARCHAR(75) null,LEPHI INTEGER,PHIHOSO INTEGER,EMAILNGUOINOP VARCHAR(75) null,NGAYSINHNGUOINOP DATE null,CMNDNGUOINOP VARCHAR(75) null,GIOITINHNGUOINOP INTEGER,TENCANBOKY VARCHAR(75) null,CHUCVUCANBOKYID LONG null,SODANHMUCID LONG null,THUONGTRUTINHID LONG null,THUONGTRUHUYENID LONG null,THUONGTRUXAID LONG null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_HOSOCHUNGTHUC";
	public static final String ORDER_BY_JPQL = " ORDER BY hoSoChungThuc.ngayTao DESC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_HOSOCHUNGTHUC.NGAYTAO DESC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.chungthuc.model.HoSoChungThuc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.chungthuc.model.HoSoChungThuc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.chungthuc.model.HoSoChungThuc"),
			true);
	public static long HOTENNGUOINOPHOSO_COLUMN_BITMASK = 1L;
	public static long MASOBIENNHAN_COLUMN_BITMASK = 2L;
	public static long SOCHUNGTHUC_COLUMN_BITMASK = 4L;
	public static long SODANHMUCID_COLUMN_BITMASK = 8L;
	public static long SODIENTHOAICODINHNGUOINOP_COLUMN_BITMASK = 16L;
	public static long SODIENTHOAIDIDONGNGUOINOP_COLUMN_BITMASK = 32L;
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.chungthuc.model.HoSoChungThuc"));

	public HoSoChungThucModelImpl() {
	}

	public long getPrimaryKey() {
		return _hoSoChungThucId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHoSoChungThucId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hoSoChungThucId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return HoSoChungThuc.class;
	}

	public String getModelClassName() {
		return HoSoChungThuc.class.getName();
	}

	public long getHoSoChungThucId() {
		return _hoSoChungThucId;
	}

	public void setHoSoChungThucId(long hoSoChungThucId) {
		_hoSoChungThucId = hoSoChungThucId;
	}

	public String getTenChungThuc() {
		return _tenChungThuc;
	}

	public void setTenChungThuc(String tenChungThuc) {
		_tenChungThuc = tenChungThuc;
	}

	public String getSoChungThuc() {
		return _soChungThuc;
	}

	public void setSoChungThuc(String soChungThuc) {
		_columnBitmask |= SOCHUNGTHUC_COLUMN_BITMASK;

		if (_originalSoChungThuc == null) {
			_originalSoChungThuc = _soChungThuc;
		}

		_soChungThuc = soChungThuc;
	}

	public String getOriginalSoChungThuc() {
		return _originalSoChungThuc;
	}

	public Date getNgayNopHoSo() {
		return _ngayNopHoSo;
	}

	public void setNgayNopHoSo(Date ngayNopHoSo) {
		_ngayNopHoSo = ngayNopHoSo;
	}

	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;
	}

	public String getHoTenNguoiNopHoSo() {
		return _hoTenNguoiNopHoSo;
	}

	public void setHoTenNguoiNopHoSo(String hoTenNguoiNopHoSo) {
		_columnBitmask |= HOTENNGUOINOPHOSO_COLUMN_BITMASK;

		if (_originalHoTenNguoiNopHoSo == null) {
			_originalHoTenNguoiNopHoSo = _hoTenNguoiNopHoSo;
		}

		_hoTenNguoiNopHoSo = hoTenNguoiNopHoSo;
	}

	public String getOriginalHoTenNguoiNopHoSo() {
		return _originalHoTenNguoiNopHoSo;
	}

	public String getDiaChiThuongTruNguoiNop() {
		return _diaChiThuongTruNguoiNop;
	}

	public void setDiaChiThuongTruNguoiNop(String diaChiThuongTruNguoiNop) {
		_diaChiThuongTruNguoiNop = diaChiThuongTruNguoiNop;
	}

	public String getSoDienThoaiCoDinhNguoiNop() {
		return _soDienThoaiCoDinhNguoiNop;
	}

	public void setSoDienThoaiCoDinhNguoiNop(String soDienThoaiCoDinhNguoiNop) {
		_columnBitmask |= SODIENTHOAICODINHNGUOINOP_COLUMN_BITMASK;

		if (_originalSoDienThoaiCoDinhNguoiNop == null) {
			_originalSoDienThoaiCoDinhNguoiNop = _soDienThoaiCoDinhNguoiNop;
		}

		_soDienThoaiCoDinhNguoiNop = soDienThoaiCoDinhNguoiNop;
	}

	public String getOriginalSoDienThoaiCoDinhNguoiNop() {
		return _originalSoDienThoaiCoDinhNguoiNop;
	}

	public int getTrangThaiHoSo() {
		return _trangThaiHoSo;
	}

	public void setTrangThaiHoSo(int trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;
	}

	public int getDaXoa() {
		return _daXoa;
	}

	public void setDaXoa(int daXoa) {
		_daXoa = daXoa;
	}

	public String getNguoiTao() {
		return _nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_columnBitmask = -1L;

		_ngayTao = ngayTao;
	}

	public String getNguoiSua() {
		return _nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		_nguoiSua = nguoiSua;
	}

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public Long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(Long thuTucHanhChinhId) {
		_columnBitmask |= THUTUCHANHCHINHID_COLUMN_BITMASK;

		if (!_setOriginalThuTucHanhChinhId) {
			_setOriginalThuTucHanhChinhId = true;

			_originalThuTucHanhChinhId = _thuTucHanhChinhId;
		}

		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public Long getOriginalThuTucHanhChinhId() {
		return _originalThuTucHanhChinhId;
	}

	public Long getCanBoTiepNhanId() {
		return _canBoTiepNhanId;
	}

	public void setCanBoTiepNhanId(Long canBoTiepNhanId) {
		_canBoTiepNhanId = canBoTiepNhanId;
	}

	public String getSoDienThoaiDiDongNguoiNop() {
		return _soDienThoaiDiDongNguoiNop;
	}

	public void setSoDienThoaiDiDongNguoiNop(String soDienThoaiDiDongNguoiNop) {
		_columnBitmask |= SODIENTHOAIDIDONGNGUOINOP_COLUMN_BITMASK;

		if (_originalSoDienThoaiDiDongNguoiNop == null) {
			_originalSoDienThoaiDiDongNguoiNop = _soDienThoaiDiDongNguoiNop;
		}

		_soDienThoaiDiDongNguoiNop = soDienThoaiDiDongNguoiNop;
	}

	public String getOriginalSoDienThoaiDiDongNguoiNop() {
		return _originalSoDienThoaiDiDongNguoiNop;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public String getMucDichChungThuc() {
		return _mucDichChungThuc;
	}

	public void setMucDichChungThuc(String mucDichChungThuc) {
		_mucDichChungThuc = mucDichChungThuc;
	}

	public String getMaSoBienNhan() {
		return _maSoBienNhan;
	}

	public void setMaSoBienNhan(String maSoBienNhan) {
		_columnBitmask |= MASOBIENNHAN_COLUMN_BITMASK;

		if (_originalMaSoBienNhan == null) {
			_originalMaSoBienNhan = _maSoBienNhan;
		}

		_maSoBienNhan = maSoBienNhan;
	}

	public String getOriginalMaSoBienNhan() {
		return _originalMaSoBienNhan;
	}

	public String getChuSoHuu() {
		return _chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		_chuSoHuu = chuSoHuu;
	}

	public int getSoBoHoSo() {
		return _soBoHoSo;
	}

	public void setSoBoHoSo(int soBoHoSo) {
		_soBoHoSo = soBoHoSo;
	}

	public int getSoTo() {
		return _soTo;
	}

	public void setSoTo(int soTo) {
		_soTo = soTo;
	}

	public String getTruongHop() {
		return _truongHop;
	}

	public void setTruongHop(String truongHop) {
		_truongHop = truongHop;
	}

	public int getLePhi() {
		return _lePhi;
	}

	public void setLePhi(int lePhi) {
		_lePhi = lePhi;
	}

	public int getPhiHoSo() {
		return _phiHoSo;
	}

	public void setPhiHoSo(int phiHoSo) {
		_phiHoSo = phiHoSo;
	}

	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;
	}

	public Date getNgaySinhNguoiNop() {
		return _ngaySinhNguoiNop;
	}

	public void setNgaySinhNguoiNop(Date ngaySinhNguoiNop) {
		_ngaySinhNguoiNop = ngaySinhNguoiNop;
	}

	public String getSoCMNDNguoiNop() {
		if (_soCMNDNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _soCMNDNguoiNop;
		}
	}

	public void setSoCMNDNguoiNop(String soCMNDNguoiNop) {
		_soCMNDNguoiNop = soCMNDNguoiNop;
	}

	public int getGioiTinhNguoiNop() {
		return _gioiTinhNguoiNop;
	}

	public void setGioiTinhNguoiNop(int gioiTinhNguoiNop) {
		_gioiTinhNguoiNop = gioiTinhNguoiNop;
	}

	public String getTenCanBoKy() {
		return _tenCanBoKy;
	}

	public void setTenCanBoKy(String tenCanBoKy) {
		_tenCanBoKy = tenCanBoKy;
	}

	public Long getChucVuCanBoKyId() {
		return _chucVuCanBoKyId;
	}

	public void setChucVuCanBoKyId(Long chucVuCanBoKyId) {
		_chucVuCanBoKyId = chucVuCanBoKyId;
	}

	public Long getSoDanhMucId() {
		return _soDanhMucId;
	}

	public void setSoDanhMucId(Long soDanhMucId) {
		_columnBitmask |= SODANHMUCID_COLUMN_BITMASK;

		if (!_setOriginalSoDanhMucId) {
			_setOriginalSoDanhMucId = true;

			_originalSoDanhMucId = _soDanhMucId;
		}

		_soDanhMucId = soDanhMucId;
	}

	public Long getOriginalSoDanhMucId() {
		return _originalSoDanhMucId;
	}

	public Long getThuongTruTinhId() {
		return _thuongTruTinhId;
	}

	public void setThuongTruTinhId(Long thuongTruTinhId) {
		_thuongTruTinhId = thuongTruTinhId;
	}

	public Long getThuongTruHuyenId() {
		return _thuongTruHuyenId;
	}

	public void setThuongTruHuyenId(Long thuongTruHuyenId) {
		_thuongTruHuyenId = thuongTruHuyenId;
	}

	public Long getThuongTruXaId() {
		return _thuongTruXaId;
	}

	public void setThuongTruXaId(Long thuongTruXaId) {
		_thuongTruXaId = thuongTruXaId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public HoSoChungThuc toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (HoSoChungThuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					HoSoChungThuc.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HoSoChungThucImpl hoSoChungThucImpl = new HoSoChungThucImpl();

		hoSoChungThucImpl.setHoSoChungThucId(getHoSoChungThucId());
		hoSoChungThucImpl.setTenChungThuc(getTenChungThuc());
		hoSoChungThucImpl.setSoChungThuc(getSoChungThuc());
		hoSoChungThucImpl.setNgayNopHoSo(getNgayNopHoSo());
		hoSoChungThucImpl.setNgayTraKetQua(getNgayTraKetQua());
		hoSoChungThucImpl.setHoTenNguoiNopHoSo(getHoTenNguoiNopHoSo());
		hoSoChungThucImpl.setDiaChiThuongTruNguoiNop(getDiaChiThuongTruNguoiNop());
		hoSoChungThucImpl.setSoDienThoaiCoDinhNguoiNop(getSoDienThoaiCoDinhNguoiNop());
		hoSoChungThucImpl.setTrangThaiHoSo(getTrangThaiHoSo());
		hoSoChungThucImpl.setDaXoa(getDaXoa());
		hoSoChungThucImpl.setNguoiTao(getNguoiTao());
		hoSoChungThucImpl.setNgayTao(getNgayTao());
		hoSoChungThucImpl.setNguoiSua(getNguoiSua());
		hoSoChungThucImpl.setNgaySua(getNgaySua());
		hoSoChungThucImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		hoSoChungThucImpl.setCanBoTiepNhanId(getCanBoTiepNhanId());
		hoSoChungThucImpl.setSoDienThoaiDiDongNguoiNop(getSoDienThoaiDiDongNguoiNop());
		hoSoChungThucImpl.setGhiChu(getGhiChu());
		hoSoChungThucImpl.setMucDichChungThuc(getMucDichChungThuc());
		hoSoChungThucImpl.setMaSoBienNhan(getMaSoBienNhan());
		hoSoChungThucImpl.setChuSoHuu(getChuSoHuu());
		hoSoChungThucImpl.setSoBoHoSo(getSoBoHoSo());
		hoSoChungThucImpl.setSoTo(getSoTo());
		hoSoChungThucImpl.setTruongHop(getTruongHop());
		hoSoChungThucImpl.setLePhi(getLePhi());
		hoSoChungThucImpl.setPhiHoSo(getPhiHoSo());
		hoSoChungThucImpl.setEmailNguoiNop(getEmailNguoiNop());
		hoSoChungThucImpl.setNgaySinhNguoiNop(getNgaySinhNguoiNop());
		hoSoChungThucImpl.setSoCMNDNguoiNop(getSoCMNDNguoiNop());
		hoSoChungThucImpl.setGioiTinhNguoiNop(getGioiTinhNguoiNop());
		hoSoChungThucImpl.setTenCanBoKy(getTenCanBoKy());
		hoSoChungThucImpl.setChucVuCanBoKyId(getChucVuCanBoKyId());
		hoSoChungThucImpl.setSoDanhMucId(getSoDanhMucId());
		hoSoChungThucImpl.setThuongTruTinhId(getThuongTruTinhId());
		hoSoChungThucImpl.setThuongTruHuyenId(getThuongTruHuyenId());
		hoSoChungThucImpl.setThuongTruXaId(getThuongTruXaId());

		hoSoChungThucImpl.resetOriginalValues();

		return hoSoChungThucImpl;
	}

	public int compareTo(HoSoChungThuc hoSoChungThuc) {
		int value = 0;

		value = DateUtil.compareTo(getNgayTao(), hoSoChungThuc.getNgayTao());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HoSoChungThuc hoSoChungThuc = null;

		try {
			hoSoChungThuc = (HoSoChungThuc)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hoSoChungThuc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		HoSoChungThucModelImpl hoSoChungThucModelImpl = this;

		hoSoChungThucModelImpl._originalSoChungThuc = hoSoChungThucModelImpl._soChungThuc;

		hoSoChungThucModelImpl._originalHoTenNguoiNopHoSo = hoSoChungThucModelImpl._hoTenNguoiNopHoSo;

		hoSoChungThucModelImpl._originalSoDienThoaiCoDinhNguoiNop = hoSoChungThucModelImpl._soDienThoaiCoDinhNguoiNop;

		hoSoChungThucModelImpl._originalThuTucHanhChinhId = hoSoChungThucModelImpl._thuTucHanhChinhId;

		hoSoChungThucModelImpl._setOriginalThuTucHanhChinhId = false;

		hoSoChungThucModelImpl._originalSoDienThoaiDiDongNguoiNop = hoSoChungThucModelImpl._soDienThoaiDiDongNguoiNop;

		hoSoChungThucModelImpl._originalMaSoBienNhan = hoSoChungThucModelImpl._maSoBienNhan;

		hoSoChungThucModelImpl._originalSoDanhMucId = hoSoChungThucModelImpl._soDanhMucId;

		hoSoChungThucModelImpl._setOriginalSoDanhMucId = false;

		hoSoChungThucModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<HoSoChungThuc> toCacheModel() {
		HoSoChungThucCacheModel hoSoChungThucCacheModel = new HoSoChungThucCacheModel();

		hoSoChungThucCacheModel.hoSoChungThucId = getHoSoChungThucId();

		hoSoChungThucCacheModel.tenChungThuc = getTenChungThuc();

		String tenChungThuc = hoSoChungThucCacheModel.tenChungThuc;

		if ((tenChungThuc != null) && (tenChungThuc.length() == 0)) {
			hoSoChungThucCacheModel.tenChungThuc = null;
		}

		hoSoChungThucCacheModel.soChungThuc = getSoChungThuc();

		String soChungThuc = hoSoChungThucCacheModel.soChungThuc;

		if ((soChungThuc != null) && (soChungThuc.length() == 0)) {
			hoSoChungThucCacheModel.soChungThuc = null;
		}

		Date ngayNopHoSo = getNgayNopHoSo();

		if (ngayNopHoSo != null) {
			hoSoChungThucCacheModel.ngayNopHoSo = ngayNopHoSo.getTime();
		}
		else {
			hoSoChungThucCacheModel.ngayNopHoSo = Long.MIN_VALUE;
		}

		Date ngayTraKetQua = getNgayTraKetQua();

		if (ngayTraKetQua != null) {
			hoSoChungThucCacheModel.ngayTraKetQua = ngayTraKetQua.getTime();
		}
		else {
			hoSoChungThucCacheModel.ngayTraKetQua = Long.MIN_VALUE;
		}

		hoSoChungThucCacheModel.hoTenNguoiNopHoSo = getHoTenNguoiNopHoSo();

		String hoTenNguoiNopHoSo = hoSoChungThucCacheModel.hoTenNguoiNopHoSo;

		if ((hoTenNguoiNopHoSo != null) && (hoTenNguoiNopHoSo.length() == 0)) {
			hoSoChungThucCacheModel.hoTenNguoiNopHoSo = null;
		}

		hoSoChungThucCacheModel.diaChiThuongTruNguoiNop = getDiaChiThuongTruNguoiNop();

		String diaChiThuongTruNguoiNop = hoSoChungThucCacheModel.diaChiThuongTruNguoiNop;

		if ((diaChiThuongTruNguoiNop != null) &&
				(diaChiThuongTruNguoiNop.length() == 0)) {
			hoSoChungThucCacheModel.diaChiThuongTruNguoiNop = null;
		}

		hoSoChungThucCacheModel.soDienThoaiCoDinhNguoiNop = getSoDienThoaiCoDinhNguoiNop();

		String soDienThoaiCoDinhNguoiNop = hoSoChungThucCacheModel.soDienThoaiCoDinhNguoiNop;

		if ((soDienThoaiCoDinhNguoiNop != null) &&
				(soDienThoaiCoDinhNguoiNop.length() == 0)) {
			hoSoChungThucCacheModel.soDienThoaiCoDinhNguoiNop = null;
		}

		hoSoChungThucCacheModel.trangThaiHoSo = getTrangThaiHoSo();

		hoSoChungThucCacheModel.daXoa = getDaXoa();

		hoSoChungThucCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = hoSoChungThucCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			hoSoChungThucCacheModel.nguoiTao = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			hoSoChungThucCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			hoSoChungThucCacheModel.ngayTao = Long.MIN_VALUE;
		}

		hoSoChungThucCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = hoSoChungThucCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			hoSoChungThucCacheModel.nguoiSua = null;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			hoSoChungThucCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			hoSoChungThucCacheModel.ngaySua = Long.MIN_VALUE;
		}

		hoSoChungThucCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		hoSoChungThucCacheModel.canBoTiepNhanId = getCanBoTiepNhanId();

		hoSoChungThucCacheModel.soDienThoaiDiDongNguoiNop = getSoDienThoaiDiDongNguoiNop();

		String soDienThoaiDiDongNguoiNop = hoSoChungThucCacheModel.soDienThoaiDiDongNguoiNop;

		if ((soDienThoaiDiDongNguoiNop != null) &&
				(soDienThoaiDiDongNguoiNop.length() == 0)) {
			hoSoChungThucCacheModel.soDienThoaiDiDongNguoiNop = null;
		}

		hoSoChungThucCacheModel.ghiChu = getGhiChu();

		String ghiChu = hoSoChungThucCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			hoSoChungThucCacheModel.ghiChu = null;
		}

		hoSoChungThucCacheModel.mucDichChungThuc = getMucDichChungThuc();

		String mucDichChungThuc = hoSoChungThucCacheModel.mucDichChungThuc;

		if ((mucDichChungThuc != null) && (mucDichChungThuc.length() == 0)) {
			hoSoChungThucCacheModel.mucDichChungThuc = null;
		}

		hoSoChungThucCacheModel.maSoBienNhan = getMaSoBienNhan();

		String maSoBienNhan = hoSoChungThucCacheModel.maSoBienNhan;

		if ((maSoBienNhan != null) && (maSoBienNhan.length() == 0)) {
			hoSoChungThucCacheModel.maSoBienNhan = null;
		}

		hoSoChungThucCacheModel.chuSoHuu = getChuSoHuu();

		String chuSoHuu = hoSoChungThucCacheModel.chuSoHuu;

		if ((chuSoHuu != null) && (chuSoHuu.length() == 0)) {
			hoSoChungThucCacheModel.chuSoHuu = null;
		}

		hoSoChungThucCacheModel.soBoHoSo = getSoBoHoSo();

		hoSoChungThucCacheModel.soTo = getSoTo();

		hoSoChungThucCacheModel.truongHop = getTruongHop();

		String truongHop = hoSoChungThucCacheModel.truongHop;

		if ((truongHop != null) && (truongHop.length() == 0)) {
			hoSoChungThucCacheModel.truongHop = null;
		}

		hoSoChungThucCacheModel.lePhi = getLePhi();

		hoSoChungThucCacheModel.phiHoSo = getPhiHoSo();

		hoSoChungThucCacheModel.emailNguoiNop = getEmailNguoiNop();

		String emailNguoiNop = hoSoChungThucCacheModel.emailNguoiNop;

		if ((emailNguoiNop != null) && (emailNguoiNop.length() == 0)) {
			hoSoChungThucCacheModel.emailNguoiNop = null;
		}

		Date ngaySinhNguoiNop = getNgaySinhNguoiNop();

		if (ngaySinhNguoiNop != null) {
			hoSoChungThucCacheModel.ngaySinhNguoiNop = ngaySinhNguoiNop.getTime();
		}
		else {
			hoSoChungThucCacheModel.ngaySinhNguoiNop = Long.MIN_VALUE;
		}

		hoSoChungThucCacheModel.soCMNDNguoiNop = getSoCMNDNguoiNop();

		String soCMNDNguoiNop = hoSoChungThucCacheModel.soCMNDNguoiNop;

		if ((soCMNDNguoiNop != null) && (soCMNDNguoiNop.length() == 0)) {
			hoSoChungThucCacheModel.soCMNDNguoiNop = null;
		}

		hoSoChungThucCacheModel.gioiTinhNguoiNop = getGioiTinhNguoiNop();

		hoSoChungThucCacheModel.tenCanBoKy = getTenCanBoKy();

		String tenCanBoKy = hoSoChungThucCacheModel.tenCanBoKy;

		if ((tenCanBoKy != null) && (tenCanBoKy.length() == 0)) {
			hoSoChungThucCacheModel.tenCanBoKy = null;
		}

		hoSoChungThucCacheModel.chucVuCanBoKyId = getChucVuCanBoKyId();

		hoSoChungThucCacheModel.soDanhMucId = getSoDanhMucId();

		hoSoChungThucCacheModel.thuongTruTinhId = getThuongTruTinhId();

		hoSoChungThucCacheModel.thuongTruHuyenId = getThuongTruHuyenId();

		hoSoChungThucCacheModel.thuongTruXaId = getThuongTruXaId();

		return hoSoChungThucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{hoSoChungThucId=");
		sb.append(getHoSoChungThucId());
		sb.append(", tenChungThuc=");
		sb.append(getTenChungThuc());
		sb.append(", soChungThuc=");
		sb.append(getSoChungThuc());
		sb.append(", ngayNopHoSo=");
		sb.append(getNgayNopHoSo());
		sb.append(", ngayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", hoTenNguoiNopHoSo=");
		sb.append(getHoTenNguoiNopHoSo());
		sb.append(", diaChiThuongTruNguoiNop=");
		sb.append(getDiaChiThuongTruNguoiNop());
		sb.append(", soDienThoaiCoDinhNguoiNop=");
		sb.append(getSoDienThoaiCoDinhNguoiNop());
		sb.append(", trangThaiHoSo=");
		sb.append(getTrangThaiHoSo());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", canBoTiepNhanId=");
		sb.append(getCanBoTiepNhanId());
		sb.append(", soDienThoaiDiDongNguoiNop=");
		sb.append(getSoDienThoaiDiDongNguoiNop());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", mucDichChungThuc=");
		sb.append(getMucDichChungThuc());
		sb.append(", maSoBienNhan=");
		sb.append(getMaSoBienNhan());
		sb.append(", chuSoHuu=");
		sb.append(getChuSoHuu());
		sb.append(", soBoHoSo=");
		sb.append(getSoBoHoSo());
		sb.append(", soTo=");
		sb.append(getSoTo());
		sb.append(", truongHop=");
		sb.append(getTruongHop());
		sb.append(", lePhi=");
		sb.append(getLePhi());
		sb.append(", phiHoSo=");
		sb.append(getPhiHoSo());
		sb.append(", emailNguoiNop=");
		sb.append(getEmailNguoiNop());
		sb.append(", ngaySinhNguoiNop=");
		sb.append(getNgaySinhNguoiNop());
		sb.append(", soCMNDNguoiNop=");
		sb.append(getSoCMNDNguoiNop());
		sb.append(", gioiTinhNguoiNop=");
		sb.append(getGioiTinhNguoiNop());
		sb.append(", tenCanBoKy=");
		sb.append(getTenCanBoKy());
		sb.append(", chucVuCanBoKyId=");
		sb.append(getChucVuCanBoKyId());
		sb.append(", soDanhMucId=");
		sb.append(getSoDanhMucId());
		sb.append(", thuongTruTinhId=");
		sb.append(getThuongTruTinhId());
		sb.append(", thuongTruHuyenId=");
		sb.append(getThuongTruHuyenId());
		sb.append(", thuongTruXaId=");
		sb.append(getThuongTruXaId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(112);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.chungthuc.model.HoSoChungThuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hoSoChungThucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoChungThucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenChungThuc</column-name><column-value><![CDATA[");
		sb.append(getTenChungThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soChungThuc</column-name><column-value><![CDATA[");
		sb.append(getSoChungThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayNopHoSo</column-name><column-value><![CDATA[");
		sb.append(getNgayNopHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoTenNguoiNopHoSo</column-name><column-value><![CDATA[");
		sb.append(getHoTenNguoiNopHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiThuongTruNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDiaChiThuongTruNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiCoDinhNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiCoDinhNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHoSo</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daXoa</column-name><column-value><![CDATA[");
		sb.append(getDaXoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canBoTiepNhanId</column-name><column-value><![CDATA[");
		sb.append(getCanBoTiepNhanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiDiDongNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiDiDongNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mucDichChungThuc</column-name><column-value><![CDATA[");
		sb.append(getMucDichChungThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoBienNhan</column-name><column-value><![CDATA[");
		sb.append(getMaSoBienNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chuSoHuu</column-name><column-value><![CDATA[");
		sb.append(getChuSoHuu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soBoHoSo</column-name><column-value><![CDATA[");
		sb.append(getSoBoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soTo</column-name><column-value><![CDATA[");
		sb.append(getSoTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truongHop</column-name><column-value><![CDATA[");
		sb.append(getTruongHop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lePhi</column-name><column-value><![CDATA[");
		sb.append(getLePhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiHoSo</column-name><column-value><![CDATA[");
		sb.append(getPhiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getEmailNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySinhNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getNgaySinhNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCMNDNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoCMNDNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenCanBoKy</column-name><column-value><![CDATA[");
		sb.append(getTenCanBoKy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chucVuCanBoKyId</column-name><column-value><![CDATA[");
		sb.append(getChucVuCanBoKyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDanhMucId</column-name><column-value><![CDATA[");
		sb.append(getSoDanhMucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuongTruTinhId</column-name><column-value><![CDATA[");
		sb.append(getThuongTruTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuongTruHuyenId</column-name><column-value><![CDATA[");
		sb.append(getThuongTruHuyenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuongTruXaId</column-name><column-value><![CDATA[");
		sb.append(getThuongTruXaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HoSoChungThuc.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HoSoChungThuc.class
		};
	private long _hoSoChungThucId;
	private String _tenChungThuc;
	private String _soChungThuc;
	private String _originalSoChungThuc;
	private Date _ngayNopHoSo;
	private Date _ngayTraKetQua;
	private String _hoTenNguoiNopHoSo;
	private String _originalHoTenNguoiNopHoSo;
	private String _diaChiThuongTruNguoiNop;
	private String _soDienThoaiCoDinhNguoiNop;
	private String _originalSoDienThoaiCoDinhNguoiNop;
	private int _trangThaiHoSo;
	private int _daXoa;
	private String _nguoiTao;
	private Date _ngayTao;
	private String _nguoiSua;
	private Date _ngaySua;
	private Long _thuTucHanhChinhId;
	private Long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
	private Long _canBoTiepNhanId;
	private String _soDienThoaiDiDongNguoiNop;
	private String _originalSoDienThoaiDiDongNguoiNop;
	private String _ghiChu;
	private String _mucDichChungThuc;
	private String _maSoBienNhan;
	private String _originalMaSoBienNhan;
	private String _chuSoHuu;
	private int _soBoHoSo;
	private int _soTo;
	private String _truongHop;
	private int _lePhi;
	private int _phiHoSo;
	private String _emailNguoiNop;
	private Date _ngaySinhNguoiNop;
	private String _soCMNDNguoiNop;
	private int _gioiTinhNguoiNop;
	private String _tenCanBoKy;
	private Long _chucVuCanBoKyId;
	private Long _soDanhMucId;
	private Long _originalSoDanhMucId;
	private boolean _setOriginalSoDanhMucId;
	private Long _thuongTruTinhId;
	private Long _thuongTruHuyenId;
	private Long _thuongTruXaId;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private HoSoChungThuc _escapedModelProxy;
}