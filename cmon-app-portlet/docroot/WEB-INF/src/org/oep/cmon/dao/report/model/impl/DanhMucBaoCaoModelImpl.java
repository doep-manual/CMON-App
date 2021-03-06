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

package org.oep.cmon.dao.report.model.impl;

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

import org.oep.cmon.dao.report.model.DanhMucBaoCao;
import org.oep.cmon.dao.report.model.DanhMucBaoCaoModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the DanhMucBaoCao service. Represents a row in the &quot;CMON_RPDANHMUCBAOCAO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.report.model.DanhMucBaoCaoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DanhMucBaoCaoImpl}.
 * </p>
 *
 * @author VIENPN
 * @see DanhMucBaoCaoImpl
 * @see org.oep.cmon.dao.report.model.DanhMucBaoCao
 * @see org.oep.cmon.dao.report.model.DanhMucBaoCaoModel
 * @generated
 */
public class DanhMucBaoCaoModelImpl extends BaseModelImpl<DanhMucBaoCao>
	implements DanhMucBaoCaoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a danh muc bao cao model instance should use the {@link org.oep.cmon.dao.report.model.DanhMucBaoCao} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_RPDANHMUCBAOCAO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "TENBAOCAO", Types.VARCHAR },
			{ "DUONGDAN", Types.VARCHAR },
			{ "ORDERS", Types.INTEGER },
			{ "STATUS", Types.INTEGER },
			{ "PUBLISH", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_RPDANHMUCBAOCAO (ID LONG not null primary key,TENBAOCAO VARCHAR(75) null,DUONGDAN VARCHAR(75) null,ORDERS INTEGER,STATUS INTEGER,PUBLISH INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_RPDANHMUCBAOCAO";
	public static final String ORDER_BY_JPQL = " ORDER BY danhMucBaoCao.ID DESC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_RPDANHMUCBAOCAO.ID DESC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.report.model.DanhMucBaoCao"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.report.model.DanhMucBaoCao"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.report.model.DanhMucBaoCao"));

	public DanhMucBaoCaoModelImpl() {
	}

	public long getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(long primaryKey) {
		setID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_ID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return DanhMucBaoCao.class;
	}

	public String getModelClassName() {
		return DanhMucBaoCao.class.getName();
	}

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public String getTENBAOCAO() {
		if (_TENBAOCAO == null) {
			return StringPool.BLANK;
		}
		else {
			return _TENBAOCAO;
		}
	}

	public void setTENBAOCAO(String TENBAOCAO) {
		_TENBAOCAO = TENBAOCAO;
	}

	public String getDUONGDAN() {
		if (_DUONGDAN == null) {
			return StringPool.BLANK;
		}
		else {
			return _DUONGDAN;
		}
	}

	public void setDUONGDAN(String DUONGDAN) {
		_DUONGDAN = DUONGDAN;
	}

	public int getORDERS() {
		return _ORDERS;
	}

	public void setORDERS(int ORDERS) {
		_ORDERS = ORDERS;
	}

	public int getSTATUS() {
		return _STATUS;
	}

	public void setSTATUS(int STATUS) {
		_STATUS = STATUS;
	}

	public int getPUBLISH() {
		return _PUBLISH;
	}

	public void setPUBLISH(int PUBLISH) {
		_PUBLISH = PUBLISH;
	}

	@Override
	public DanhMucBaoCao toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DanhMucBaoCao)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					DanhMucBaoCao.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		DanhMucBaoCaoImpl danhMucBaoCaoImpl = new DanhMucBaoCaoImpl();

		danhMucBaoCaoImpl.setID(getID());
		danhMucBaoCaoImpl.setTENBAOCAO(getTENBAOCAO());
		danhMucBaoCaoImpl.setDUONGDAN(getDUONGDAN());
		danhMucBaoCaoImpl.setORDERS(getORDERS());
		danhMucBaoCaoImpl.setSTATUS(getSTATUS());
		danhMucBaoCaoImpl.setPUBLISH(getPUBLISH());

		danhMucBaoCaoImpl.resetOriginalValues();

		return danhMucBaoCaoImpl;
	}

	public int compareTo(DanhMucBaoCao danhMucBaoCao) {
		int value = 0;

		if (getID() < danhMucBaoCao.getID()) {
			value = -1;
		}
		else if (getID() > danhMucBaoCao.getID()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		DanhMucBaoCao danhMucBaoCao = null;

		try {
			danhMucBaoCao = (DanhMucBaoCao)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = danhMucBaoCao.getPrimaryKey();

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
	}

	@Override
	public CacheModel<DanhMucBaoCao> toCacheModel() {
		DanhMucBaoCaoCacheModel danhMucBaoCaoCacheModel = new DanhMucBaoCaoCacheModel();

		danhMucBaoCaoCacheModel.ID = getID();

		danhMucBaoCaoCacheModel.TENBAOCAO = getTENBAOCAO();

		String TENBAOCAO = danhMucBaoCaoCacheModel.TENBAOCAO;

		if ((TENBAOCAO != null) && (TENBAOCAO.length() == 0)) {
			danhMucBaoCaoCacheModel.TENBAOCAO = null;
		}

		danhMucBaoCaoCacheModel.DUONGDAN = getDUONGDAN();

		String DUONGDAN = danhMucBaoCaoCacheModel.DUONGDAN;

		if ((DUONGDAN != null) && (DUONGDAN.length() == 0)) {
			danhMucBaoCaoCacheModel.DUONGDAN = null;
		}

		danhMucBaoCaoCacheModel.ORDERS = getORDERS();

		danhMucBaoCaoCacheModel.STATUS = getSTATUS();

		danhMucBaoCaoCacheModel.PUBLISH = getPUBLISH();

		return danhMucBaoCaoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", TENBAOCAO=");
		sb.append(getTENBAOCAO());
		sb.append(", DUONGDAN=");
		sb.append(getDUONGDAN());
		sb.append(", ORDERS=");
		sb.append(getORDERS());
		sb.append(", STATUS=");
		sb.append(getSTATUS());
		sb.append(", PUBLISH=");
		sb.append(getPUBLISH());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.report.model.DanhMucBaoCao");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TENBAOCAO</column-name><column-value><![CDATA[");
		sb.append(getTENBAOCAO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DUONGDAN</column-name><column-value><![CDATA[");
		sb.append(getDUONGDAN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ORDERS</column-name><column-value><![CDATA[");
		sb.append(getORDERS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATUS</column-name><column-value><![CDATA[");
		sb.append(getSTATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PUBLISH</column-name><column-value><![CDATA[");
		sb.append(getPUBLISH());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DanhMucBaoCao.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DanhMucBaoCao.class
		};
	private long _ID;
	private String _TENBAOCAO;
	private String _DUONGDAN;
	private int _ORDERS;
	private int _STATUS;
	private int _PUBLISH;
	private transient ExpandoBridge _expandoBridge;
	private DanhMucBaoCao _escapedModelProxy;
}