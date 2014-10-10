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

import org.oep.cmon.dao.cd.model.NgheNghiep;
import org.oep.cmon.dao.cd.model.NgheNghiepModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the NgheNghiep service. Represents a row in the &quot;CMON_NGHENGHIEP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.cd.model.NgheNghiepModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NgheNghiepImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see NgheNghiepImpl
 * @see org.oep.cmon.dao.cd.model.NgheNghiep
 * @see org.oep.cmon.dao.cd.model.NgheNghiepModel
 * @generated
 */
public class NgheNghiepModelImpl extends BaseModelImpl<NgheNghiep>
	implements NgheNghiepModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nghe nghiep model instance should use the {@link org.oep.cmon.dao.cd.model.NgheNghiep} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_NGHENGHIEP";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "PHIENBAN", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_NGHENGHIEP (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,NGAYTAO DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,NGAYSUA DATE null,PHIENBAN LONG)";
	public static final String TABLE_SQL_DROP = "drop table CMON_NGHENGHIEP";
	public static final String ORDER_BY_JPQL = " ORDER BY ngheNghiep.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_NGHENGHIEP.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.cd.model.NgheNghiep"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.cd.model.NgheNghiep"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.cd.model.NgheNghiep"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.cd.model.NgheNghiep"));

	public NgheNghiepModelImpl() {
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
		return NgheNghiep.class;
	}

	public String getModelClassName() {
		return NgheNghiep.class.getName();
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
		_ma = ma;
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
		_ten = ten;
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
	public NgheNghiep toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (NgheNghiep)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					NgheNghiep.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		NgheNghiepImpl ngheNghiepImpl = new NgheNghiepImpl();

		ngheNghiepImpl.setId(getId());
		ngheNghiepImpl.setMa(getMa());
		ngheNghiepImpl.setTen(getTen());
		ngheNghiepImpl.setNgayTao(getNgayTao());
		ngheNghiepImpl.setDaXoa(getDaXoa());
		ngheNghiepImpl.setNguoiTao(getNguoiTao());
		ngheNghiepImpl.setNguoiSua(getNguoiSua());
		ngheNghiepImpl.setNgaySua(getNgaySua());
		ngheNghiepImpl.setPhienBan(getPhienBan());

		ngheNghiepImpl.resetOriginalValues();

		return ngheNghiepImpl;
	}

	public int compareTo(NgheNghiep ngheNghiep) {
		int value = 0;

		if (getId() < ngheNghiep.getId()) {
			value = -1;
		}
		else if (getId() > ngheNghiep.getId()) {
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

		NgheNghiep ngheNghiep = null;

		try {
			ngheNghiep = (NgheNghiep)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = ngheNghiep.getPrimaryKey();

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
		NgheNghiepModelImpl ngheNghiepModelImpl = this;

		ngheNghiepModelImpl._originalDaXoa = ngheNghiepModelImpl._daXoa;

		ngheNghiepModelImpl._setOriginalDaXoa = false;

		ngheNghiepModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<NgheNghiep> toCacheModel() {
		NgheNghiepCacheModel ngheNghiepCacheModel = new NgheNghiepCacheModel();

		ngheNghiepCacheModel.id = getId();

		ngheNghiepCacheModel.ma = getMa();

		String ma = ngheNghiepCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			ngheNghiepCacheModel.ma = null;
		}

		ngheNghiepCacheModel.ten = getTen();

		String ten = ngheNghiepCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			ngheNghiepCacheModel.ten = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			ngheNghiepCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			ngheNghiepCacheModel.ngayTao = Long.MIN_VALUE;
		}

		ngheNghiepCacheModel.daXoa = getDaXoa();

		ngheNghiepCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = ngheNghiepCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			ngheNghiepCacheModel.nguoiTao = null;
		}

		ngheNghiepCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = ngheNghiepCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			ngheNghiepCacheModel.nguoiSua = null;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			ngheNghiepCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			ngheNghiepCacheModel.ngaySua = Long.MIN_VALUE;
		}

		ngheNghiepCacheModel.phienBan = getPhienBan();

		return ngheNghiepCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ten=");
		sb.append(getTen());
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
		sb.append(", phienBan=");
		sb.append(getPhienBan());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.cd.model.NgheNghiep");
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
			"<column><column-name>phienBan</column-name><column-value><![CDATA[");
		sb.append(getPhienBan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = NgheNghiep.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			NgheNghiep.class
		};
	private long _id;
	private String _ma;
	private String _ten;
	private Date _ngayTao;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private Date _ngaySua;
	private long _phienBan;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private NgheNghiep _escapedModelProxy;
}