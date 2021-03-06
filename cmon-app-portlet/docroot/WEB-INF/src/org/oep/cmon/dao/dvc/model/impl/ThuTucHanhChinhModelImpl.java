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

package org.oep.cmon.dao.dvc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.cmon.dao.dvc.model.ThuTucHanhChinh;
import org.oep.cmon.dao.dvc.model.ThuTucHanhChinhModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the ThuTucHanhChinh service. Represents a row in the &quot;CMON_THUTUCHANHCHINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.dvc.model.ThuTucHanhChinhModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ThuTucHanhChinhImpl}.
 * </p>
 *
 * @author liemnn
 * @see ThuTucHanhChinhImpl
 * @see org.oep.cmon.dao.dvc.model.ThuTucHanhChinh
 * @see org.oep.cmon.dao.dvc.model.ThuTucHanhChinhModel
 * @generated
 */
public class ThuTucHanhChinhModelImpl extends BaseModelImpl<ThuTucHanhChinh>
	implements ThuTucHanhChinhModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a thu tuc hanh chinh model instance should use the {@link org.oep.cmon.dao.dvc.model.ThuTucHanhChinh} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_THUTUCHANHCHINH";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "SONGAYXULY", Types.BIGINT },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NHOMTHUTUCHANHCHINHID", Types.BIGINT },
			{ "TRANGTHAI", Types.INTEGER },
			{ "PHIENBAN", Types.BIGINT },
			{ "CANTICHHOP", Types.INTEGER },
			{ "TRINHTUTHUCHIEN", Types.VARCHAR },
			{ "CACHTHUCHIEN", Types.VARCHAR },
			{ "THANHPHANHOSO", Types.VARCHAR },
			{ "LEPHI", Types.BIGINT },
			{ "DONVILEPHI", Types.VARCHAR },
			{ "PHI", Types.BIGINT },
			{ "DONVIPHI", Types.VARCHAR },
			{ "TENMAUDONTOKHAI", Types.VARCHAR },
			{ "YEUCAUDIEUKIENTHUCHIEN", Types.VARCHAR },
			{ "CANCUPHAPLY", Types.VARCHAR },
			{ "CAPCOQUANQUANLYID", Types.BIGINT },
			{ "LINHVUCTHUCHIEN", Types.VARCHAR },
			{ "MADNG", Types.VARCHAR },
			{ "UENGINEPROCESSNAME", Types.VARCHAR },
			{ "THUTUCLIENTHONGID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_THUTUCHANHCHINH (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,SONGAYXULY LONG,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,NHOMTHUTUCHANHCHINHID LONG,TRANGTHAI INTEGER,PHIENBAN LONG,CANTICHHOP INTEGER,TRINHTUTHUCHIEN VARCHAR(75) null,CACHTHUCHIEN VARCHAR(75) null,THANHPHANHOSO VARCHAR(75) null,LEPHI LONG,DONVILEPHI VARCHAR(75) null,PHI LONG,DONVIPHI VARCHAR(75) null,TENMAUDONTOKHAI VARCHAR(75) null,YEUCAUDIEUKIENTHUCHIEN VARCHAR(75) null,CANCUPHAPLY VARCHAR(75) null,CAPCOQUANQUANLYID LONG null,LINHVUCTHUCHIEN VARCHAR(75) null,MADNG VARCHAR(75) null,UENGINEPROCESSNAME VARCHAR(75) null,THUTUCLIENTHONGID LONG null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_THUTUCHANHCHINH";
	public static final String ORDER_BY_JPQL = " ORDER BY thuTucHanhChinh.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_THUTUCHANHCHINH.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.dvc.model.ThuTucHanhChinh"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.dvc.model.ThuTucHanhChinh"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.dvc.model.ThuTucHanhChinh"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long MA_COLUMN_BITMASK = 2L;
	public static long NHOMTHUTUCHANHCHINHID_COLUMN_BITMASK = 4L;
	public static long TEN_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.dvc.model.ThuTucHanhChinh"));

	public ThuTucHanhChinhModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ThuTucHanhChinh.class;
	}

	public String getModelClassName() {
		return ThuTucHanhChinh.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	public String getMa() {
		if (_ma == null) {
			return StringPool.BLANK;
		}
		else {
			return _ma;
		}
	}

	public void setMa(String ma) {
		_columnBitmask |= MA_COLUMN_BITMASK;

		if (_originalMa == null) {
			_originalMa = _ma;
		}

		_ma = ma;
	}

	public String getOriginalMa() {
		return GetterUtil.getString(_originalMa);
	}

	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	public void setTen(String ten) {
		_columnBitmask |= TEN_COLUMN_BITMASK;

		if (_originalTen == null) {
			_originalTen = _ten;
		}

		_ten = ten;
	}

	public String getOriginalTen() {
		return GetterUtil.getString(_originalTen);
	}

	public long getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	public void setSoNgayXuLy(long soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public int getDaXoa() {
		return _daXoa;
	}

	public void setDaXoa(int daXoa) {
		_columnBitmask |= DAXOA_COLUMN_BITMASK;

		if (!_setOriginalDaXoa) {
			_setOriginalDaXoa = true;

			_originalDaXoa = _daXoa;
		}

		_daXoa = daXoa;
	}

	public int getOriginalDaXoa() {
		return _originalDaXoa;
	}

	public String getNguoiTao() {
		if (_nguoiTao == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiTao;
		}
	}

	public void setNguoiTao(String nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public String getNguoiSua() {
		if (_nguoiSua == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiSua;
		}
	}

	public void setNguoiSua(String nguoiSua) {
		_nguoiSua = nguoiSua;
	}

	public long getNhomThuTucHanhChinhId() {
		return _nhomThuTucHanhChinhId;
	}

	public void setNhomThuTucHanhChinhId(long nhomThuTucHanhChinhId) {
		_columnBitmask |= NHOMTHUTUCHANHCHINHID_COLUMN_BITMASK;

		if (!_setOriginalNhomThuTucHanhChinhId) {
			_setOriginalNhomThuTucHanhChinhId = true;

			_originalNhomThuTucHanhChinhId = _nhomThuTucHanhChinhId;
		}

		_nhomThuTucHanhChinhId = nhomThuTucHanhChinhId;
	}

	public long getOriginalNhomThuTucHanhChinhId() {
		return _originalNhomThuTucHanhChinhId;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public long getPhienBan() {
		return _phienBan;
	}

	public void setPhienBan(long phienBan) {
		_phienBan = phienBan;
	}

	public int getCanTichHop() {
		return _canTichHop;
	}

	public void setCanTichHop(int canTichHop) {
		_canTichHop = canTichHop;
	}

	public String getTrinhTuThucHien() {
		if (_trinhTuThucHien == null) {
			return StringPool.BLANK;
		}
		else {
			return _trinhTuThucHien;
		}
	}

	public void setTrinhTuThucHien(String trinhTuThucHien) {
		_trinhTuThucHien = trinhTuThucHien;
	}

	public String getCachThucHien() {
		if (_cachThucHien == null) {
			return StringPool.BLANK;
		}
		else {
			return _cachThucHien;
		}
	}

	public void setCachThucHien(String cachThucHien) {
		_cachThucHien = cachThucHien;
	}

	public String getThanhPhanHoSo() {
		if (_thanhPhanHoSo == null) {
			return StringPool.BLANK;
		}
		else {
			return _thanhPhanHoSo;
		}
	}

	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;
	}

	public long getLePhi() {
		return _lePhi;
	}

	public void setLePhi(long lePhi) {
		_lePhi = lePhi;
	}

	public String getDonViLePhi() {
		if (_donViLePhi == null) {
			return StringPool.BLANK;
		}
		else {
			return _donViLePhi;
		}
	}

	public void setDonViLePhi(String donViLePhi) {
		_donViLePhi = donViLePhi;
	}

	public long getPhi() {
		return _phi;
	}

	public void setPhi(long phi) {
		_phi = phi;
	}

	public String getDonViPhi() {
		if (_donViPhi == null) {
			return StringPool.BLANK;
		}
		else {
			return _donViPhi;
		}
	}

	public void setDonViPhi(String donViPhi) {
		_donViPhi = donViPhi;
	}

	public String getTenMauDonToKhai() {
		if (_tenMauDonToKhai == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenMauDonToKhai;
		}
	}

	public void setTenMauDonToKhai(String tenMauDonToKhai) {
		_tenMauDonToKhai = tenMauDonToKhai;
	}

	public String getYeuCauDieuKienThucHien() {
		if (_yeuCauDieuKienThucHien == null) {
			return StringPool.BLANK;
		}
		else {
			return _yeuCauDieuKienThucHien;
		}
	}

	public void setYeuCauDieuKienThucHien(String yeuCauDieuKienThucHien) {
		_yeuCauDieuKienThucHien = yeuCauDieuKienThucHien;
	}

	public String getCanCuPhapLy() {
		if (_canCuPhapLy == null) {
			return StringPool.BLANK;
		}
		else {
			return _canCuPhapLy;
		}
	}

	public void setCanCuPhapLy(String canCuPhapLy) {
		_canCuPhapLy = canCuPhapLy;
	}

	public Long getCapCoQuanQuanLyId() {
		return _capCoQuanQuanLyId;
	}

	public void setCapCoQuanQuanLyId(Long capCoQuanQuanLyId) {
		_capCoQuanQuanLyId = capCoQuanQuanLyId;
	}

	public String getLinhVucThucHien() {
		if (_linhVucThucHien == null) {
			return StringPool.BLANK;
		}
		else {
			return _linhVucThucHien;
		}
	}

	public void setLinhVucThucHien(String linhVucThucHien) {
		_linhVucThucHien = linhVucThucHien;
	}

	public String getMaDNG() {
		if (_maDNG == null) {
			return StringPool.BLANK;
		}
		else {
			return _maDNG;
		}
	}

	public void setMaDNG(String maDNG) {
		_maDNG = maDNG;
	}

	public String getUengineProcessName() {
		if (_uengineProcessName == null) {
			return StringPool.BLANK;
		}
		else {
			return _uengineProcessName;
		}
	}

	public void setUengineProcessName(String uengineProcessName) {
		_uengineProcessName = uengineProcessName;
	}

	public Long getThuTucLienThongId() {
		return _thuTucLienThongId;
	}

	public void setThuTucLienThongId(Long thuTucLienThongId) {
		_thuTucLienThongId = thuTucLienThongId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ThuTucHanhChinh toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ThuTucHanhChinh)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ThuTucHanhChinh.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ThuTucHanhChinhImpl thuTucHanhChinhImpl = new ThuTucHanhChinhImpl();

		thuTucHanhChinhImpl.setId(getId());
		thuTucHanhChinhImpl.setMa(getMa());
		thuTucHanhChinhImpl.setTen(getTen());
		thuTucHanhChinhImpl.setSoNgayXuLy(getSoNgayXuLy());
		thuTucHanhChinhImpl.setNgayTao(getNgayTao());
		thuTucHanhChinhImpl.setNgaySua(getNgaySua());
		thuTucHanhChinhImpl.setDaXoa(getDaXoa());
		thuTucHanhChinhImpl.setNguoiTao(getNguoiTao());
		thuTucHanhChinhImpl.setNguoiSua(getNguoiSua());
		thuTucHanhChinhImpl.setNhomThuTucHanhChinhId(getNhomThuTucHanhChinhId());
		thuTucHanhChinhImpl.setTrangThai(getTrangThai());
		thuTucHanhChinhImpl.setPhienBan(getPhienBan());
		thuTucHanhChinhImpl.setCanTichHop(getCanTichHop());
		thuTucHanhChinhImpl.setTrinhTuThucHien(getTrinhTuThucHien());
		thuTucHanhChinhImpl.setCachThucHien(getCachThucHien());
		thuTucHanhChinhImpl.setThanhPhanHoSo(getThanhPhanHoSo());
		thuTucHanhChinhImpl.setLePhi(getLePhi());
		thuTucHanhChinhImpl.setDonViLePhi(getDonViLePhi());
		thuTucHanhChinhImpl.setPhi(getPhi());
		thuTucHanhChinhImpl.setDonViPhi(getDonViPhi());
		thuTucHanhChinhImpl.setTenMauDonToKhai(getTenMauDonToKhai());
		thuTucHanhChinhImpl.setYeuCauDieuKienThucHien(getYeuCauDieuKienThucHien());
		thuTucHanhChinhImpl.setCanCuPhapLy(getCanCuPhapLy());
		thuTucHanhChinhImpl.setCapCoQuanQuanLyId(getCapCoQuanQuanLyId());
		thuTucHanhChinhImpl.setLinhVucThucHien(getLinhVucThucHien());
		thuTucHanhChinhImpl.setMaDNG(getMaDNG());
		thuTucHanhChinhImpl.setUengineProcessName(getUengineProcessName());
		thuTucHanhChinhImpl.setThuTucLienThongId(getThuTucLienThongId());

		thuTucHanhChinhImpl.resetOriginalValues();

		return thuTucHanhChinhImpl;
	}

	public int compareTo(ThuTucHanhChinh thuTucHanhChinh) {
		int value = 0;

		if (getId() < thuTucHanhChinh.getId()) {
			value = -1;
		}
		else if (getId() > thuTucHanhChinh.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		ThuTucHanhChinh thuTucHanhChinh = null;

		try {
			thuTucHanhChinh = (ThuTucHanhChinh)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = thuTucHanhChinh.getPrimaryKey();

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
		ThuTucHanhChinhModelImpl thuTucHanhChinhModelImpl = this;

		thuTucHanhChinhModelImpl._originalMa = thuTucHanhChinhModelImpl._ma;

		thuTucHanhChinhModelImpl._originalTen = thuTucHanhChinhModelImpl._ten;

		thuTucHanhChinhModelImpl._originalDaXoa = thuTucHanhChinhModelImpl._daXoa;

		thuTucHanhChinhModelImpl._setOriginalDaXoa = false;

		thuTucHanhChinhModelImpl._originalNhomThuTucHanhChinhId = thuTucHanhChinhModelImpl._nhomThuTucHanhChinhId;

		thuTucHanhChinhModelImpl._setOriginalNhomThuTucHanhChinhId = false;

		thuTucHanhChinhModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ThuTucHanhChinh> toCacheModel() {
		ThuTucHanhChinhCacheModel thuTucHanhChinhCacheModel = new ThuTucHanhChinhCacheModel();

		thuTucHanhChinhCacheModel.id = getId();

		thuTucHanhChinhCacheModel.ma = getMa();

		String ma = thuTucHanhChinhCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			thuTucHanhChinhCacheModel.ma = null;
		}

		thuTucHanhChinhCacheModel.ten = getTen();

		String ten = thuTucHanhChinhCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			thuTucHanhChinhCacheModel.ten = null;
		}

		thuTucHanhChinhCacheModel.soNgayXuLy = getSoNgayXuLy();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			thuTucHanhChinhCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			thuTucHanhChinhCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			thuTucHanhChinhCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			thuTucHanhChinhCacheModel.ngaySua = Long.MIN_VALUE;
		}

		thuTucHanhChinhCacheModel.daXoa = getDaXoa();

		thuTucHanhChinhCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = thuTucHanhChinhCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			thuTucHanhChinhCacheModel.nguoiTao = null;
		}

		thuTucHanhChinhCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = thuTucHanhChinhCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			thuTucHanhChinhCacheModel.nguoiSua = null;
		}

		thuTucHanhChinhCacheModel.nhomThuTucHanhChinhId = getNhomThuTucHanhChinhId();

		thuTucHanhChinhCacheModel.trangThai = getTrangThai();

		thuTucHanhChinhCacheModel.phienBan = getPhienBan();

		thuTucHanhChinhCacheModel.canTichHop = getCanTichHop();

		thuTucHanhChinhCacheModel.trinhTuThucHien = getTrinhTuThucHien();

		String trinhTuThucHien = thuTucHanhChinhCacheModel.trinhTuThucHien;

		if ((trinhTuThucHien != null) && (trinhTuThucHien.length() == 0)) {
			thuTucHanhChinhCacheModel.trinhTuThucHien = null;
		}

		thuTucHanhChinhCacheModel.cachThucHien = getCachThucHien();

		String cachThucHien = thuTucHanhChinhCacheModel.cachThucHien;

		if ((cachThucHien != null) && (cachThucHien.length() == 0)) {
			thuTucHanhChinhCacheModel.cachThucHien = null;
		}

		thuTucHanhChinhCacheModel.thanhPhanHoSo = getThanhPhanHoSo();

		String thanhPhanHoSo = thuTucHanhChinhCacheModel.thanhPhanHoSo;

		if ((thanhPhanHoSo != null) && (thanhPhanHoSo.length() == 0)) {
			thuTucHanhChinhCacheModel.thanhPhanHoSo = null;
		}

		thuTucHanhChinhCacheModel.lePhi = getLePhi();

		thuTucHanhChinhCacheModel.donViLePhi = getDonViLePhi();

		String donViLePhi = thuTucHanhChinhCacheModel.donViLePhi;

		if ((donViLePhi != null) && (donViLePhi.length() == 0)) {
			thuTucHanhChinhCacheModel.donViLePhi = null;
		}

		thuTucHanhChinhCacheModel.phi = getPhi();

		thuTucHanhChinhCacheModel.donViPhi = getDonViPhi();

		String donViPhi = thuTucHanhChinhCacheModel.donViPhi;

		if ((donViPhi != null) && (donViPhi.length() == 0)) {
			thuTucHanhChinhCacheModel.donViPhi = null;
		}

		thuTucHanhChinhCacheModel.tenMauDonToKhai = getTenMauDonToKhai();

		String tenMauDonToKhai = thuTucHanhChinhCacheModel.tenMauDonToKhai;

		if ((tenMauDonToKhai != null) && (tenMauDonToKhai.length() == 0)) {
			thuTucHanhChinhCacheModel.tenMauDonToKhai = null;
		}

		thuTucHanhChinhCacheModel.yeuCauDieuKienThucHien = getYeuCauDieuKienThucHien();

		String yeuCauDieuKienThucHien = thuTucHanhChinhCacheModel.yeuCauDieuKienThucHien;

		if ((yeuCauDieuKienThucHien != null) &&
				(yeuCauDieuKienThucHien.length() == 0)) {
			thuTucHanhChinhCacheModel.yeuCauDieuKienThucHien = null;
		}

		thuTucHanhChinhCacheModel.canCuPhapLy = getCanCuPhapLy();

		String canCuPhapLy = thuTucHanhChinhCacheModel.canCuPhapLy;

		if ((canCuPhapLy != null) && (canCuPhapLy.length() == 0)) {
			thuTucHanhChinhCacheModel.canCuPhapLy = null;
		}

		thuTucHanhChinhCacheModel.capCoQuanQuanLyId = getCapCoQuanQuanLyId();

		thuTucHanhChinhCacheModel.linhVucThucHien = getLinhVucThucHien();

		String linhVucThucHien = thuTucHanhChinhCacheModel.linhVucThucHien;

		if ((linhVucThucHien != null) && (linhVucThucHien.length() == 0)) {
			thuTucHanhChinhCacheModel.linhVucThucHien = null;
		}

		thuTucHanhChinhCacheModel.maDNG = getMaDNG();

		String maDNG = thuTucHanhChinhCacheModel.maDNG;

		if ((maDNG != null) && (maDNG.length() == 0)) {
			thuTucHanhChinhCacheModel.maDNG = null;
		}

		thuTucHanhChinhCacheModel.uengineProcessName = getUengineProcessName();

		String uengineProcessName = thuTucHanhChinhCacheModel.uengineProcessName;

		if ((uengineProcessName != null) && (uengineProcessName.length() == 0)) {
			thuTucHanhChinhCacheModel.uengineProcessName = null;
		}

		thuTucHanhChinhCacheModel.thuTucLienThongId = getThuTucLienThongId();

		return thuTucHanhChinhCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", soNgayXuLy=");
		sb.append(getSoNgayXuLy());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", nhomThuTucHanhChinhId=");
		sb.append(getNhomThuTucHanhChinhId());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", phienBan=");
		sb.append(getPhienBan());
		sb.append(", canTichHop=");
		sb.append(getCanTichHop());
		sb.append(", trinhTuThucHien=");
		sb.append(getTrinhTuThucHien());
		sb.append(", cachThucHien=");
		sb.append(getCachThucHien());
		sb.append(", thanhPhanHoSo=");
		sb.append(getThanhPhanHoSo());
		sb.append(", lePhi=");
		sb.append(getLePhi());
		sb.append(", donViLePhi=");
		sb.append(getDonViLePhi());
		sb.append(", phi=");
		sb.append(getPhi());
		sb.append(", donViPhi=");
		sb.append(getDonViPhi());
		sb.append(", tenMauDonToKhai=");
		sb.append(getTenMauDonToKhai());
		sb.append(", yeuCauDieuKienThucHien=");
		sb.append(getYeuCauDieuKienThucHien());
		sb.append(", canCuPhapLy=");
		sb.append(getCanCuPhapLy());
		sb.append(", capCoQuanQuanLyId=");
		sb.append(getCapCoQuanQuanLyId());
		sb.append(", linhVucThucHien=");
		sb.append(getLinhVucThucHien());
		sb.append(", maDNG=");
		sb.append(getMaDNG());
		sb.append(", uengineProcessName=");
		sb.append(getUengineProcessName());
		sb.append(", thuTucLienThongId=");
		sb.append(getThuTucLienThongId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.dvc.model.ThuTucHanhChinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNgayXuLy</column-name><column-value><![CDATA[");
		sb.append(getSoNgayXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
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
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomThuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getNhomThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phienBan</column-name><column-value><![CDATA[");
		sb.append(getPhienBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canTichHop</column-name><column-value><![CDATA[");
		sb.append(getCanTichHop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trinhTuThucHien</column-name><column-value><![CDATA[");
		sb.append(getTrinhTuThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cachThucHien</column-name><column-value><![CDATA[");
		sb.append(getCachThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSo</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lePhi</column-name><column-value><![CDATA[");
		sb.append(getLePhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViLePhi</column-name><column-value><![CDATA[");
		sb.append(getDonViLePhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phi</column-name><column-value><![CDATA[");
		sb.append(getPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViPhi</column-name><column-value><![CDATA[");
		sb.append(getDonViPhi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenMauDonToKhai</column-name><column-value><![CDATA[");
		sb.append(getTenMauDonToKhai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yeuCauDieuKienThucHien</column-name><column-value><![CDATA[");
		sb.append(getYeuCauDieuKienThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canCuPhapLy</column-name><column-value><![CDATA[");
		sb.append(getCanCuPhapLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capCoQuanQuanLyId</column-name><column-value><![CDATA[");
		sb.append(getCapCoQuanQuanLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linhVucThucHien</column-name><column-value><![CDATA[");
		sb.append(getLinhVucThucHien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maDNG</column-name><column-value><![CDATA[");
		sb.append(getMaDNG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uengineProcessName</column-name><column-value><![CDATA[");
		sb.append(getUengineProcessName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucLienThongId</column-name><column-value><![CDATA[");
		sb.append(getThuTucLienThongId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ThuTucHanhChinh.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ThuTucHanhChinh.class
		};
	private long _id;
	private String _ma;
	private String _originalMa;
	private String _ten;
	private String _originalTen;
	private long _soNgayXuLy;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private long _nhomThuTucHanhChinhId;
	private long _originalNhomThuTucHanhChinhId;
	private boolean _setOriginalNhomThuTucHanhChinhId;
	private int _trangThai;
	private long _phienBan;
	private int _canTichHop;
	private String _trinhTuThucHien;
	private String _cachThucHien;
	private String _thanhPhanHoSo;
	private long _lePhi;
	private String _donViLePhi;
	private long _phi;
	private String _donViPhi;
	private String _tenMauDonToKhai;
	private String _yeuCauDieuKienThucHien;
	private String _canCuPhapLy;
	private Long _capCoQuanQuanLyId;
	private String _linhVucThucHien;
	private String _maDNG;
	private String _uengineProcessName;
	private Long _thuTucLienThongId;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ThuTucHanhChinh _escapedModelProxy;
}