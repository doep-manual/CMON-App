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

import org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo;
import org.oep.cmon.dao.dvc.model.ThuTuc2GiayToModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the ThuTuc2GiayTo service. Represents a row in the &quot;CMON_THUTUC2GIAYTO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.dvc.model.ThuTuc2GiayToModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ThuTuc2GiayToImpl}.
 * </p>
 *
 * @author liemnn
 * @see ThuTuc2GiayToImpl
 * @see org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo
 * @see org.oep.cmon.dao.dvc.model.ThuTuc2GiayToModel
 * @generated
 */
public class ThuTuc2GiayToModelImpl extends BaseModelImpl<ThuTuc2GiayTo>
	implements ThuTuc2GiayToModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a thu tuc2 giay to model instance should use the {@link org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_THUTUC2GIAYTO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "GHICHU", Types.VARCHAR },
			{ "BATBUOC", Types.INTEGER },
			{ "THUTUHIENTHI", Types.BIGINT },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "THUTUCHANHCHINHID", Types.BIGINT },
			{ "DANHMUCGIAYTOID", Types.BIGINT },
			{ "TRANGTHAI", Types.INTEGER },
			{ "GIAIDOAN", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_THUTUC2GIAYTO (ID LONG not null primary key,GHICHU VARCHAR(75) null,BATBUOC INTEGER,THUTUHIENTHI LONG,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,THUTUCHANHCHINHID LONG,DANHMUCGIAYTOID LONG,TRANGTHAI INTEGER,GIAIDOAN INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_THUTUC2GIAYTO";
	public static final String ORDER_BY_JPQL = " ORDER BY thuTuc2GiayTo.thuTuHienThi ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_THUTUC2GIAYTO.THUTUHIENTHI ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long DANHMUCGIAYTOID_COLUMN_BITMASK = 2L;
	public static long GIAIDOAN_COLUMN_BITMASK = 4L;
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo"));

	public ThuTuc2GiayToModelImpl() {
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
		return ThuTuc2GiayTo.class;
	}

	public String getModelClassName() {
		return ThuTuc2GiayTo.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public int getBatBuoc() {
		return _batBuoc;
	}

	public void setBatBuoc(int batBuoc) {
		_batBuoc = batBuoc;
	}

	public long getThuTuHienThi() {
		return _thuTuHienThi;
	}

	public void setThuTuHienThi(long thuTuHienThi) {
		_columnBitmask = -1L;

		_thuTuHienThi = thuTuHienThi;
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

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_columnBitmask |= THUTUCHANHCHINHID_COLUMN_BITMASK;

		if (!_setOriginalThuTucHanhChinhId) {
			_setOriginalThuTucHanhChinhId = true;

			_originalThuTucHanhChinhId = _thuTucHanhChinhId;
		}

		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getOriginalThuTucHanhChinhId() {
		return _originalThuTucHanhChinhId;
	}

	public long getDanhMucGiayToId() {
		return _danhMucGiayToId;
	}

	public void setDanhMucGiayToId(long danhMucGiayToId) {
		_columnBitmask |= DANHMUCGIAYTOID_COLUMN_BITMASK;

		if (!_setOriginalDanhMucGiayToId) {
			_setOriginalDanhMucGiayToId = true;

			_originalDanhMucGiayToId = _danhMucGiayToId;
		}

		_danhMucGiayToId = danhMucGiayToId;
	}

	public long getOriginalDanhMucGiayToId() {
		return _originalDanhMucGiayToId;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getGiaidoan() {
		return _giaidoan;
	}

	public void setGiaidoan(int giaidoan) {
		_columnBitmask |= GIAIDOAN_COLUMN_BITMASK;

		if (!_setOriginalGiaidoan) {
			_setOriginalGiaidoan = true;

			_originalGiaidoan = _giaidoan;
		}

		_giaidoan = giaidoan;
	}

	public int getOriginalGiaidoan() {
		return _originalGiaidoan;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ThuTuc2GiayTo toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ThuTuc2GiayTo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ThuTuc2GiayTo.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ThuTuc2GiayToImpl thuTuc2GiayToImpl = new ThuTuc2GiayToImpl();

		thuTuc2GiayToImpl.setId(getId());
		thuTuc2GiayToImpl.setGhiChu(getGhiChu());
		thuTuc2GiayToImpl.setBatBuoc(getBatBuoc());
		thuTuc2GiayToImpl.setThuTuHienThi(getThuTuHienThi());
		thuTuc2GiayToImpl.setNgayTao(getNgayTao());
		thuTuc2GiayToImpl.setNgaySua(getNgaySua());
		thuTuc2GiayToImpl.setDaXoa(getDaXoa());
		thuTuc2GiayToImpl.setNguoiTao(getNguoiTao());
		thuTuc2GiayToImpl.setNguoiSua(getNguoiSua());
		thuTuc2GiayToImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		thuTuc2GiayToImpl.setDanhMucGiayToId(getDanhMucGiayToId());
		thuTuc2GiayToImpl.setTrangThai(getTrangThai());
		thuTuc2GiayToImpl.setGiaidoan(getGiaidoan());

		thuTuc2GiayToImpl.resetOriginalValues();

		return thuTuc2GiayToImpl;
	}

	public int compareTo(ThuTuc2GiayTo thuTuc2GiayTo) {
		int value = 0;

		if (getThuTuHienThi() < thuTuc2GiayTo.getThuTuHienThi()) {
			value = -1;
		}
		else if (getThuTuHienThi() > thuTuc2GiayTo.getThuTuHienThi()) {
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

		ThuTuc2GiayTo thuTuc2GiayTo = null;

		try {
			thuTuc2GiayTo = (ThuTuc2GiayTo)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = thuTuc2GiayTo.getPrimaryKey();

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
		ThuTuc2GiayToModelImpl thuTuc2GiayToModelImpl = this;

		thuTuc2GiayToModelImpl._originalDaXoa = thuTuc2GiayToModelImpl._daXoa;

		thuTuc2GiayToModelImpl._setOriginalDaXoa = false;

		thuTuc2GiayToModelImpl._originalThuTucHanhChinhId = thuTuc2GiayToModelImpl._thuTucHanhChinhId;

		thuTuc2GiayToModelImpl._setOriginalThuTucHanhChinhId = false;

		thuTuc2GiayToModelImpl._originalDanhMucGiayToId = thuTuc2GiayToModelImpl._danhMucGiayToId;

		thuTuc2GiayToModelImpl._setOriginalDanhMucGiayToId = false;

		thuTuc2GiayToModelImpl._originalGiaidoan = thuTuc2GiayToModelImpl._giaidoan;

		thuTuc2GiayToModelImpl._setOriginalGiaidoan = false;

		thuTuc2GiayToModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ThuTuc2GiayTo> toCacheModel() {
		ThuTuc2GiayToCacheModel thuTuc2GiayToCacheModel = new ThuTuc2GiayToCacheModel();

		thuTuc2GiayToCacheModel.id = getId();

		thuTuc2GiayToCacheModel.ghiChu = getGhiChu();

		String ghiChu = thuTuc2GiayToCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			thuTuc2GiayToCacheModel.ghiChu = null;
		}

		thuTuc2GiayToCacheModel.batBuoc = getBatBuoc();

		thuTuc2GiayToCacheModel.thuTuHienThi = getThuTuHienThi();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			thuTuc2GiayToCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			thuTuc2GiayToCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			thuTuc2GiayToCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			thuTuc2GiayToCacheModel.ngaySua = Long.MIN_VALUE;
		}

		thuTuc2GiayToCacheModel.daXoa = getDaXoa();

		thuTuc2GiayToCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = thuTuc2GiayToCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			thuTuc2GiayToCacheModel.nguoiTao = null;
		}

		thuTuc2GiayToCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = thuTuc2GiayToCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			thuTuc2GiayToCacheModel.nguoiSua = null;
		}

		thuTuc2GiayToCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		thuTuc2GiayToCacheModel.danhMucGiayToId = getDanhMucGiayToId();

		thuTuc2GiayToCacheModel.trangThai = getTrangThai();

		thuTuc2GiayToCacheModel.giaidoan = getGiaidoan();

		return thuTuc2GiayToCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", batBuoc=");
		sb.append(getBatBuoc());
		sb.append(", thuTuHienThi=");
		sb.append(getThuTuHienThi());
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
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", danhMucGiayToId=");
		sb.append(getDanhMucGiayToId());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", giaidoan=");
		sb.append(getGiaidoan());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.dvc.model.ThuTuc2GiayTo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>batBuoc</column-name><column-value><![CDATA[");
		sb.append(getBatBuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuHienThi</column-name><column-value><![CDATA[");
		sb.append(getThuTuHienThi());
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
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhMucGiayToId</column-name><column-value><![CDATA[");
		sb.append(getDanhMucGiayToId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaidoan</column-name><column-value><![CDATA[");
		sb.append(getGiaidoan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ThuTuc2GiayTo.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ThuTuc2GiayTo.class
		};
	private long _id;
	private String _ghiChu;
	private int _batBuoc;
	private long _thuTuHienThi;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private long _thuTucHanhChinhId;
	private long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
	private long _danhMucGiayToId;
	private long _originalDanhMucGiayToId;
	private boolean _setOriginalDanhMucGiayToId;
	private int _trangThai;
	private int _giaidoan;
	private int _originalGiaidoan;
	private boolean _setOriginalGiaidoan;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ThuTuc2GiayTo _escapedModelProxy;
}