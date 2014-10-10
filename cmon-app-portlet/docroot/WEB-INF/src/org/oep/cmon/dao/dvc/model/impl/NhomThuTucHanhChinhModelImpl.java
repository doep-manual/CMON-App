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

import org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh;
import org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinhModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the NhomThuTucHanhChinh service. Represents a row in the &quot;CMON_NHOMTHUTUCHANHCHINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinhModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NhomThuTucHanhChinhImpl}.
 * </p>
 *
 * @author liemnn
 * @see NhomThuTucHanhChinhImpl
 * @see org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh
 * @see org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinhModel
 * @generated
 */
public class NhomThuTucHanhChinhModelImpl extends BaseModelImpl<NhomThuTucHanhChinh>
	implements NhomThuTucHanhChinhModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nhom thu tuc hanh chinh model instance should use the {@link org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_NHOMTHUTUCHANHCHINH";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NGUOITAO", Types.VARCHAR },
			{ "DANHMUCUNGDUNGID", Types.BIGINT },
			{ "PHIENBAN", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_NHOMTHUTUCHANHCHINH (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,NGUOISUA VARCHAR(75) null,NGUOITAO VARCHAR(75) null,DANHMUCUNGDUNGID LONG,PHIENBAN LONG)";
	public static final String TABLE_SQL_DROP = "drop table CMON_NHOMTHUTUCHANHCHINH";
	public static final String ORDER_BY_JPQL = " ORDER BY nhomThuTucHanhChinh.ten ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_NHOMTHUTUCHANHCHINH.TEN ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long DANHMUCUNGDUNGID_COLUMN_BITMASK = 2L;
	public static long MA_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh"));

	public NhomThuTucHanhChinhModelImpl() {
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
		return NhomThuTucHanhChinh.class;
	}

	public String getModelClassName() {
		return NhomThuTucHanhChinh.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
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
		_columnBitmask = -1L;

		_ten = ten;
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

	public long getDanhMucUngDungId() {
		return _danhMucUngDungId;
	}

	public void setDanhMucUngDungId(long danhMucUngDungId) {
		_columnBitmask |= DANHMUCUNGDUNGID_COLUMN_BITMASK;

		if (!_setOriginalDanhMucUngDungId) {
			_setOriginalDanhMucUngDungId = true;

			_originalDanhMucUngDungId = _danhMucUngDungId;
		}

		_danhMucUngDungId = danhMucUngDungId;
	}

	public long getOriginalDanhMucUngDungId() {
		return _originalDanhMucUngDungId;
	}

	public long getPhienBan() {
		return _phienBan;
	}

	public void setPhienBan(long phienBan) {
		_phienBan = phienBan;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public NhomThuTucHanhChinh toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (NhomThuTucHanhChinh)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					NhomThuTucHanhChinh.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		NhomThuTucHanhChinhImpl nhomThuTucHanhChinhImpl = new NhomThuTucHanhChinhImpl();

		nhomThuTucHanhChinhImpl.setId(getId());
		nhomThuTucHanhChinhImpl.setMa(getMa());
		nhomThuTucHanhChinhImpl.setTen(getTen());
		nhomThuTucHanhChinhImpl.setNgayTao(getNgayTao());
		nhomThuTucHanhChinhImpl.setNgaySua(getNgaySua());
		nhomThuTucHanhChinhImpl.setDaXoa(getDaXoa());
		nhomThuTucHanhChinhImpl.setNguoiSua(getNguoiSua());
		nhomThuTucHanhChinhImpl.setNguoiTao(getNguoiTao());
		nhomThuTucHanhChinhImpl.setDanhMucUngDungId(getDanhMucUngDungId());
		nhomThuTucHanhChinhImpl.setPhienBan(getPhienBan());

		nhomThuTucHanhChinhImpl.resetOriginalValues();

		return nhomThuTucHanhChinhImpl;
	}

	public int compareTo(NhomThuTucHanhChinh nhomThuTucHanhChinh) {
		int value = 0;

		value = getTen().compareTo(nhomThuTucHanhChinh.getTen());

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

		NhomThuTucHanhChinh nhomThuTucHanhChinh = null;

		try {
			nhomThuTucHanhChinh = (NhomThuTucHanhChinh)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = nhomThuTucHanhChinh.getPrimaryKey();

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
		NhomThuTucHanhChinhModelImpl nhomThuTucHanhChinhModelImpl = this;

		nhomThuTucHanhChinhModelImpl._originalMa = nhomThuTucHanhChinhModelImpl._ma;

		nhomThuTucHanhChinhModelImpl._originalDaXoa = nhomThuTucHanhChinhModelImpl._daXoa;

		nhomThuTucHanhChinhModelImpl._setOriginalDaXoa = false;

		nhomThuTucHanhChinhModelImpl._originalDanhMucUngDungId = nhomThuTucHanhChinhModelImpl._danhMucUngDungId;

		nhomThuTucHanhChinhModelImpl._setOriginalDanhMucUngDungId = false;

		nhomThuTucHanhChinhModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<NhomThuTucHanhChinh> toCacheModel() {
		NhomThuTucHanhChinhCacheModel nhomThuTucHanhChinhCacheModel = new NhomThuTucHanhChinhCacheModel();

		nhomThuTucHanhChinhCacheModel.id = getId();

		nhomThuTucHanhChinhCacheModel.ma = getMa();

		String ma = nhomThuTucHanhChinhCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			nhomThuTucHanhChinhCacheModel.ma = null;
		}

		nhomThuTucHanhChinhCacheModel.ten = getTen();

		String ten = nhomThuTucHanhChinhCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			nhomThuTucHanhChinhCacheModel.ten = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			nhomThuTucHanhChinhCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			nhomThuTucHanhChinhCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			nhomThuTucHanhChinhCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			nhomThuTucHanhChinhCacheModel.ngaySua = Long.MIN_VALUE;
		}

		nhomThuTucHanhChinhCacheModel.daXoa = getDaXoa();

		nhomThuTucHanhChinhCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = nhomThuTucHanhChinhCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			nhomThuTucHanhChinhCacheModel.nguoiSua = null;
		}

		nhomThuTucHanhChinhCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = nhomThuTucHanhChinhCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			nhomThuTucHanhChinhCacheModel.nguoiTao = null;
		}

		nhomThuTucHanhChinhCacheModel.danhMucUngDungId = getDanhMucUngDungId();

		nhomThuTucHanhChinhCacheModel.phienBan = getPhienBan();

		return nhomThuTucHanhChinhCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", danhMucUngDungId=");
		sb.append(getDanhMucUngDungId());
		sb.append(", phienBan=");
		sb.append(getPhienBan());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.dvc.model.NhomThuTucHanhChinh");
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
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhMucUngDungId</column-name><column-value><![CDATA[");
		sb.append(getDanhMucUngDungId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phienBan</column-name><column-value><![CDATA[");
		sb.append(getPhienBan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = NhomThuTucHanhChinh.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			NhomThuTucHanhChinh.class
		};
	private long _id;
	private String _ma;
	private String _originalMa;
	private String _ten;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiSua;
	private String _nguoiTao;
	private long _danhMucUngDungId;
	private long _originalDanhMucUngDungId;
	private boolean _setOriginalDanhMucUngDungId;
	private long _phienBan;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private NhomThuTucHanhChinh _escapedModelProxy;
}