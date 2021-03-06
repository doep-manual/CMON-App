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

package org.oep.cmon.dao.cd.model.impl;

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

import org.oep.cmon.dao.cd.model.HeThong;
import org.oep.cmon.dao.cd.model.HeThongModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HeThong service. Represents a row in the &quot;CMON_HETHONG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.cd.model.HeThongModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HeThongImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see HeThongImpl
 * @see org.oep.cmon.dao.cd.model.HeThong
 * @see org.oep.cmon.dao.cd.model.HeThongModel
 * @generated
 */
public class HeThongModelImpl extends BaseModelImpl<HeThong>
	implements HeThongModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a he thong model instance should use the {@link org.oep.cmon.dao.cd.model.HeThong} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_HETHONG";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "MOTA", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "TRANGTHAI", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_HETHONG (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,MOTA VARCHAR(75) null,NGAYTAO DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,NGAYSUA DATE null,TRANGTHAI INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_HETHONG";
	public static final String ORDER_BY_JPQL = " ORDER BY heThong.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_HETHONG.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.cd.model.HeThong"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.cd.model.HeThong"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.cd.model.HeThong"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long MA_COLUMN_BITMASK = 2L;
	public static long TEN_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.cd.model.HeThong"));

	public HeThongModelImpl() {
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
		return HeThong.class;
	}

	public String getModelClassName() {
		return HeThong.class.getName();
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

	public String getMoTa() {
		if (_moTa == null) {
			return StringPool.BLANK;
		}
		else {
			return _moTa;
		}
	}

	public void setMoTa(String moTa) {
		_moTa = moTa;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
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

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public HeThong toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (HeThong)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					HeThong.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HeThongImpl heThongImpl = new HeThongImpl();

		heThongImpl.setId(getId());
		heThongImpl.setMa(getMa());
		heThongImpl.setTen(getTen());
		heThongImpl.setMoTa(getMoTa());
		heThongImpl.setNgayTao(getNgayTao());
		heThongImpl.setDaXoa(getDaXoa());
		heThongImpl.setNguoiTao(getNguoiTao());
		heThongImpl.setNguoiSua(getNguoiSua());
		heThongImpl.setNgaySua(getNgaySua());
		heThongImpl.setTrangThai(getTrangThai());

		heThongImpl.resetOriginalValues();

		return heThongImpl;
	}

	public int compareTo(HeThong heThong) {
		int value = 0;

		if (getId() < heThong.getId()) {
			value = -1;
		}
		else if (getId() > heThong.getId()) {
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

		HeThong heThong = null;

		try {
			heThong = (HeThong)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = heThong.getPrimaryKey();

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
		HeThongModelImpl heThongModelImpl = this;

		heThongModelImpl._originalMa = heThongModelImpl._ma;

		heThongModelImpl._originalTen = heThongModelImpl._ten;

		heThongModelImpl._originalDaXoa = heThongModelImpl._daXoa;

		heThongModelImpl._setOriginalDaXoa = false;

		heThongModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<HeThong> toCacheModel() {
		HeThongCacheModel heThongCacheModel = new HeThongCacheModel();

		heThongCacheModel.id = getId();

		heThongCacheModel.ma = getMa();

		String ma = heThongCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			heThongCacheModel.ma = null;
		}

		heThongCacheModel.ten = getTen();

		String ten = heThongCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			heThongCacheModel.ten = null;
		}

		heThongCacheModel.moTa = getMoTa();

		String moTa = heThongCacheModel.moTa;

		if ((moTa != null) && (moTa.length() == 0)) {
			heThongCacheModel.moTa = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			heThongCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			heThongCacheModel.ngayTao = Long.MIN_VALUE;
		}

		heThongCacheModel.daXoa = getDaXoa();

		heThongCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = heThongCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			heThongCacheModel.nguoiTao = null;
		}

		heThongCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = heThongCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			heThongCacheModel.nguoiSua = null;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			heThongCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			heThongCacheModel.ngaySua = Long.MIN_VALUE;
		}

		heThongCacheModel.trangThai = getTrangThai();

		return heThongCacheModel;
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
		sb.append(", moTa=");
		sb.append(getMoTa());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.cd.model.HeThong");
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
			"<column><column-name>moTa</column-name><column-value><![CDATA[");
		sb.append(getMoTa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
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
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HeThong.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HeThong.class
		};
	private long _id;
	private String _ma;
	private String _originalMa;
	private String _ten;
	private String _originalTen;
	private String _moTa;
	private Date _ngayTao;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private Date _ngaySua;
	private int _trangThai;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private HeThong _escapedModelProxy;
}