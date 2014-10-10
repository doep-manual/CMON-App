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

import org.oep.cmon.dao.cd.model.GioiTinh;
import org.oep.cmon.dao.cd.model.GioiTinhModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the GioiTinh service. Represents a row in the &quot;CMON_GIOITINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.cd.model.GioiTinhModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GioiTinhImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see GioiTinhImpl
 * @see org.oep.cmon.dao.cd.model.GioiTinh
 * @see org.oep.cmon.dao.cd.model.GioiTinhModel
 * @generated
 */
public class GioiTinhModelImpl extends BaseModelImpl<GioiTinh>
	implements GioiTinhModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a gioi tinh model instance should use the {@link org.oep.cmon.dao.cd.model.GioiTinh} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_GIOITINH";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "TEN", Types.VARCHAR },
			{ "MA", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "NGUOISUA", Types.VARCHAR },
			{ "DAXOA", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_GIOITINH (ID LONG not null primary key,TEN VARCHAR(75) null,MA VARCHAR(75) null,NGAYTAO DATE null,NGUOITAO VARCHAR(75) null,NGAYSUA DATE null,NGUOISUA VARCHAR(75) null,DAXOA INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_GIOITINH";
	public static final String ORDER_BY_JPQL = " ORDER BY gioiTinh.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_GIOITINH.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.cd.model.GioiTinh"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.cd.model.GioiTinh"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.cd.model.GioiTinh"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long MA_COLUMN_BITMASK = 2L;
	public static long TEN_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.cd.model.GioiTinh"));

	public GioiTinhModelImpl() {
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
		return GioiTinh.class;
	}

	public String getModelClassName() {
		return GioiTinh.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
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

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
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

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public GioiTinh toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (GioiTinh)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					GioiTinh.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		GioiTinhImpl gioiTinhImpl = new GioiTinhImpl();

		gioiTinhImpl.setId(getId());
		gioiTinhImpl.setTen(getTen());
		gioiTinhImpl.setMa(getMa());
		gioiTinhImpl.setNgayTao(getNgayTao());
		gioiTinhImpl.setNguoiTao(getNguoiTao());
		gioiTinhImpl.setNgaySua(getNgaySua());
		gioiTinhImpl.setNguoiSua(getNguoiSua());
		gioiTinhImpl.setDaXoa(getDaXoa());

		gioiTinhImpl.resetOriginalValues();

		return gioiTinhImpl;
	}

	public int compareTo(GioiTinh gioiTinh) {
		int value = 0;

		if (getId() < gioiTinh.getId()) {
			value = -1;
		}
		else if (getId() > gioiTinh.getId()) {
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

		GioiTinh gioiTinh = null;

		try {
			gioiTinh = (GioiTinh)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = gioiTinh.getPrimaryKey();

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
		GioiTinhModelImpl gioiTinhModelImpl = this;

		gioiTinhModelImpl._originalTen = gioiTinhModelImpl._ten;

		gioiTinhModelImpl._originalMa = gioiTinhModelImpl._ma;

		gioiTinhModelImpl._originalDaXoa = gioiTinhModelImpl._daXoa;

		gioiTinhModelImpl._setOriginalDaXoa = false;

		gioiTinhModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<GioiTinh> toCacheModel() {
		GioiTinhCacheModel gioiTinhCacheModel = new GioiTinhCacheModel();

		gioiTinhCacheModel.id = getId();

		gioiTinhCacheModel.ten = getTen();

		String ten = gioiTinhCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			gioiTinhCacheModel.ten = null;
		}

		gioiTinhCacheModel.ma = getMa();

		String ma = gioiTinhCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			gioiTinhCacheModel.ma = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			gioiTinhCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			gioiTinhCacheModel.ngayTao = Long.MIN_VALUE;
		}

		gioiTinhCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = gioiTinhCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			gioiTinhCacheModel.nguoiTao = null;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			gioiTinhCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			gioiTinhCacheModel.ngaySua = Long.MIN_VALUE;
		}

		gioiTinhCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = gioiTinhCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			gioiTinhCacheModel.nguoiSua = null;
		}

		gioiTinhCacheModel.daXoa = getDaXoa();

		return gioiTinhCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.cd.model.GioiTinh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daXoa</column-name><column-value><![CDATA[");
		sb.append(getDaXoa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = GioiTinh.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			GioiTinh.class
		};
	private long _id;
	private String _ten;
	private String _originalTen;
	private String _ma;
	private String _originalMa;
	private Date _ngayTao;
	private String _nguoiTao;
	private Date _ngaySua;
	private String _nguoiSua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private GioiTinh _escapedModelProxy;
}