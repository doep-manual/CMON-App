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

import org.oep.cmon.dao.report.model.Lephi_chitiet;
import org.oep.cmon.dao.report.model.Lephi_chitietModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the Lephi_chitiet service. Represents a row in the &quot;Lephi_chitiet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.report.model.Lephi_chitietModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Lephi_chitietImpl}.
 * </p>
 *
 * @author VIENPN
 * @see Lephi_chitietImpl
 * @see org.oep.cmon.dao.report.model.Lephi_chitiet
 * @see org.oep.cmon.dao.report.model.Lephi_chitietModel
 * @generated
 */
public class Lephi_chitietModelImpl extends BaseModelImpl<Lephi_chitiet>
	implements Lephi_chitietModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lephi_chitiet model instance should use the {@link org.oep.cmon.dao.report.model.Lephi_chitiet} interface instead.
	 */
	public static final String TABLE_NAME = "Lephi_chitiet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "TENHOSO", Types.VARCHAR },
			{ "NGUOINOP", Types.VARCHAR },
			{ "CHUHOSO", Types.VARCHAR },
			{ "DIACHI", Types.VARCHAR },
			{ "SOBOHOSO", Types.VARCHAR },
			{ "LEPHI", Types.VARCHAR },
			{ "PHIHOSO", Types.VARCHAR },
			{ "TONGLEPHI", Types.VARCHAR },
			{ "GHICHU", Types.VARCHAR },
			{ "NHOMTHUTUCHANHCHINHID", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table Lephi_chitiet (ID LONG not null primary key,TENHOSO VARCHAR(75) null,NGUOINOP VARCHAR(75) null,CHUHOSO VARCHAR(75) null,DIACHI VARCHAR(75) null,SOBOHOSO VARCHAR(75) null,LEPHI VARCHAR(75) null,PHIHOSO VARCHAR(75) null,TONGLEPHI VARCHAR(75) null,GHICHU VARCHAR(75) null,NHOMTHUTUCHANHCHINHID INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table Lephi_chitiet";
	public static final String ORDER_BY_JPQL = " ORDER BY lephi_chitiet.ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Lephi_chitiet.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.report.model.Lephi_chitiet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.report.model.Lephi_chitiet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.report.model.Lephi_chitiet"));

	public Lephi_chitietModelImpl() {
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
		return Lephi_chitiet.class;
	}

	public String getModelClassName() {
		return Lephi_chitiet.class.getName();
	}

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public String getTENHOSO() {
		if (_TENHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _TENHOSO;
		}
	}

	public void setTENHOSO(String TENHOSO) {
		_TENHOSO = TENHOSO;
	}

	public String getNGUOINOP() {
		if (_NGUOINOP == null) {
			return StringPool.BLANK;
		}
		else {
			return _NGUOINOP;
		}
	}

	public void setNGUOINOP(String NGUOINOP) {
		_NGUOINOP = NGUOINOP;
	}

	public String getCHUHOSO() {
		if (_CHUHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _CHUHOSO;
		}
	}

	public void setCHUHOSO(String CHUHOSO) {
		_CHUHOSO = CHUHOSO;
	}

	public String getDIACHI() {
		if (_DIACHI == null) {
			return StringPool.BLANK;
		}
		else {
			return _DIACHI;
		}
	}

	public void setDIACHI(String DIACHI) {
		_DIACHI = DIACHI;
	}

	public String getSOBOHOSO() {
		if (_SOBOHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _SOBOHOSO;
		}
	}

	public void setSOBOHOSO(String SOBOHOSO) {
		_SOBOHOSO = SOBOHOSO;
	}

	public String getLEPHI() {
		if (_LEPHI == null) {
			return StringPool.BLANK;
		}
		else {
			return _LEPHI;
		}
	}

	public void setLEPHI(String LEPHI) {
		_LEPHI = LEPHI;
	}

	public String getPHIHOSO() {
		if (_PHIHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _PHIHOSO;
		}
	}

	public void setPHIHOSO(String PHIHOSO) {
		_PHIHOSO = PHIHOSO;
	}

	public String getTONGLEPHI() {
		if (_TONGLEPHI == null) {
			return StringPool.BLANK;
		}
		else {
			return _TONGLEPHI;
		}
	}

	public void setTONGLEPHI(String TONGLEPHI) {
		_TONGLEPHI = TONGLEPHI;
	}

	public String getGHICHU() {
		if (_GHICHU == null) {
			return StringPool.BLANK;
		}
		else {
			return _GHICHU;
		}
	}

	public void setGHICHU(String GHICHU) {
		_GHICHU = GHICHU;
	}

	public int getNHOMTHUTUCHANHCHINHID() {
		return _NHOMTHUTUCHANHCHINHID;
	}

	public void setNHOMTHUTUCHANHCHINHID(int NHOMTHUTUCHANHCHINHID) {
		_NHOMTHUTUCHANHCHINHID = NHOMTHUTUCHANHCHINHID;
	}

	@Override
	public Lephi_chitiet toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Lephi_chitiet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Lephi_chitiet.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		Lephi_chitietImpl lephi_chitietImpl = new Lephi_chitietImpl();

		lephi_chitietImpl.setID(getID());
		lephi_chitietImpl.setTENHOSO(getTENHOSO());
		lephi_chitietImpl.setNGUOINOP(getNGUOINOP());
		lephi_chitietImpl.setCHUHOSO(getCHUHOSO());
		lephi_chitietImpl.setDIACHI(getDIACHI());
		lephi_chitietImpl.setSOBOHOSO(getSOBOHOSO());
		lephi_chitietImpl.setLEPHI(getLEPHI());
		lephi_chitietImpl.setPHIHOSO(getPHIHOSO());
		lephi_chitietImpl.setTONGLEPHI(getTONGLEPHI());
		lephi_chitietImpl.setGHICHU(getGHICHU());
		lephi_chitietImpl.setNHOMTHUTUCHANHCHINHID(getNHOMTHUTUCHANHCHINHID());

		lephi_chitietImpl.resetOriginalValues();

		return lephi_chitietImpl;
	}

	public int compareTo(Lephi_chitiet lephi_chitiet) {
		int value = 0;

		if (getID() < lephi_chitiet.getID()) {
			value = -1;
		}
		else if (getID() > lephi_chitiet.getID()) {
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

		Lephi_chitiet lephi_chitiet = null;

		try {
			lephi_chitiet = (Lephi_chitiet)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = lephi_chitiet.getPrimaryKey();

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
	public CacheModel<Lephi_chitiet> toCacheModel() {
		Lephi_chitietCacheModel lephi_chitietCacheModel = new Lephi_chitietCacheModel();

		lephi_chitietCacheModel.ID = getID();

		lephi_chitietCacheModel.TENHOSO = getTENHOSO();

		String TENHOSO = lephi_chitietCacheModel.TENHOSO;

		if ((TENHOSO != null) && (TENHOSO.length() == 0)) {
			lephi_chitietCacheModel.TENHOSO = null;
		}

		lephi_chitietCacheModel.NGUOINOP = getNGUOINOP();

		String NGUOINOP = lephi_chitietCacheModel.NGUOINOP;

		if ((NGUOINOP != null) && (NGUOINOP.length() == 0)) {
			lephi_chitietCacheModel.NGUOINOP = null;
		}

		lephi_chitietCacheModel.CHUHOSO = getCHUHOSO();

		String CHUHOSO = lephi_chitietCacheModel.CHUHOSO;

		if ((CHUHOSO != null) && (CHUHOSO.length() == 0)) {
			lephi_chitietCacheModel.CHUHOSO = null;
		}

		lephi_chitietCacheModel.DIACHI = getDIACHI();

		String DIACHI = lephi_chitietCacheModel.DIACHI;

		if ((DIACHI != null) && (DIACHI.length() == 0)) {
			lephi_chitietCacheModel.DIACHI = null;
		}

		lephi_chitietCacheModel.SOBOHOSO = getSOBOHOSO();

		String SOBOHOSO = lephi_chitietCacheModel.SOBOHOSO;

		if ((SOBOHOSO != null) && (SOBOHOSO.length() == 0)) {
			lephi_chitietCacheModel.SOBOHOSO = null;
		}

		lephi_chitietCacheModel.LEPHI = getLEPHI();

		String LEPHI = lephi_chitietCacheModel.LEPHI;

		if ((LEPHI != null) && (LEPHI.length() == 0)) {
			lephi_chitietCacheModel.LEPHI = null;
		}

		lephi_chitietCacheModel.PHIHOSO = getPHIHOSO();

		String PHIHOSO = lephi_chitietCacheModel.PHIHOSO;

		if ((PHIHOSO != null) && (PHIHOSO.length() == 0)) {
			lephi_chitietCacheModel.PHIHOSO = null;
		}

		lephi_chitietCacheModel.TONGLEPHI = getTONGLEPHI();

		String TONGLEPHI = lephi_chitietCacheModel.TONGLEPHI;

		if ((TONGLEPHI != null) && (TONGLEPHI.length() == 0)) {
			lephi_chitietCacheModel.TONGLEPHI = null;
		}

		lephi_chitietCacheModel.GHICHU = getGHICHU();

		String GHICHU = lephi_chitietCacheModel.GHICHU;

		if ((GHICHU != null) && (GHICHU.length() == 0)) {
			lephi_chitietCacheModel.GHICHU = null;
		}

		lephi_chitietCacheModel.NHOMTHUTUCHANHCHINHID = getNHOMTHUTUCHANHCHINHID();

		return lephi_chitietCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", TENHOSO=");
		sb.append(getTENHOSO());
		sb.append(", NGUOINOP=");
		sb.append(getNGUOINOP());
		sb.append(", CHUHOSO=");
		sb.append(getCHUHOSO());
		sb.append(", DIACHI=");
		sb.append(getDIACHI());
		sb.append(", SOBOHOSO=");
		sb.append(getSOBOHOSO());
		sb.append(", LEPHI=");
		sb.append(getLEPHI());
		sb.append(", PHIHOSO=");
		sb.append(getPHIHOSO());
		sb.append(", TONGLEPHI=");
		sb.append(getTONGLEPHI());
		sb.append(", GHICHU=");
		sb.append(getGHICHU());
		sb.append(", NHOMTHUTUCHANHCHINHID=");
		sb.append(getNHOMTHUTUCHANHCHINHID());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.report.model.Lephi_chitiet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TENHOSO</column-name><column-value><![CDATA[");
		sb.append(getTENHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NGUOINOP</column-name><column-value><![CDATA[");
		sb.append(getNGUOINOP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHUHOSO</column-name><column-value><![CDATA[");
		sb.append(getCHUHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DIACHI</column-name><column-value><![CDATA[");
		sb.append(getDIACHI());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SOBOHOSO</column-name><column-value><![CDATA[");
		sb.append(getSOBOHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LEPHI</column-name><column-value><![CDATA[");
		sb.append(getLEPHI());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHIHOSO</column-name><column-value><![CDATA[");
		sb.append(getPHIHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TONGLEPHI</column-name><column-value><![CDATA[");
		sb.append(getTONGLEPHI());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GHICHU</column-name><column-value><![CDATA[");
		sb.append(getGHICHU());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NHOMTHUTUCHANHCHINHID</column-name><column-value><![CDATA[");
		sb.append(getNHOMTHUTUCHANHCHINHID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Lephi_chitiet.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Lephi_chitiet.class
		};
	private long _ID;
	private String _TENHOSO;
	private String _NGUOINOP;
	private String _CHUHOSO;
	private String _DIACHI;
	private String _SOBOHOSO;
	private String _LEPHI;
	private String _PHIHOSO;
	private String _TONGLEPHI;
	private String _GHICHU;
	private int _NHOMTHUTUCHANHCHINHID;
	private transient ExpandoBridge _expandoBridge;
	private Lephi_chitiet _escapedModelProxy;
}