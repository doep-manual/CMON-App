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

import org.oep.cmon.dao.report.model.Lephi_linhvuc;
import org.oep.cmon.dao.report.model.Lephi_linhvucModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the Lephi_linhvuc service. Represents a row in the &quot;Lephi_linhvuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.report.model.Lephi_linhvucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Lephi_linhvucImpl}.
 * </p>
 *
 * @author VIENPN
 * @see Lephi_linhvucImpl
 * @see org.oep.cmon.dao.report.model.Lephi_linhvuc
 * @see org.oep.cmon.dao.report.model.Lephi_linhvucModel
 * @generated
 */
public class Lephi_linhvucModelImpl extends BaseModelImpl<Lephi_linhvuc>
	implements Lephi_linhvucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lephi_linhvuc model instance should use the {@link org.oep.cmon.dao.report.model.Lephi_linhvuc} interface instead.
	 */
	public static final String TABLE_NAME = "Lephi_linhvuc";
	public static final Object[][] TABLE_COLUMNS = {
			{ "NHOMTHUTUCHANHCHINHID", Types.INTEGER },
			{ "TONGHOSO", Types.VARCHAR },
			{ "LEPHIHOSO", Types.VARCHAR },
			{ "PHIHOSO", Types.VARCHAR },
			{ "TONGLEPHI", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Lephi_linhvuc (NHOMTHUTUCHANHCHINHID INTEGER not null primary key,TONGHOSO VARCHAR(75) null,LEPHIHOSO VARCHAR(75) null,PHIHOSO VARCHAR(75) null,TONGLEPHI VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Lephi_linhvuc";
	public static final String ORDER_BY_JPQL = " ORDER BY lephi_linhvuc.NHOMTHUTUCHANHCHINHID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Lephi_linhvuc.NHOMTHUTUCHANHCHINHID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.report.model.Lephi_linhvuc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.report.model.Lephi_linhvuc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.report.model.Lephi_linhvuc"));

	public Lephi_linhvucModelImpl() {
	}

	public int getPrimaryKey() {
		return _NHOMTHUTUCHANHCHINHID;
	}

	public void setPrimaryKey(int primaryKey) {
		setNHOMTHUTUCHANHCHINHID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_NHOMTHUTUCHANHCHINHID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return Lephi_linhvuc.class;
	}

	public String getModelClassName() {
		return Lephi_linhvuc.class.getName();
	}

	public int getNHOMTHUTUCHANHCHINHID() {
		return _NHOMTHUTUCHANHCHINHID;
	}

	public void setNHOMTHUTUCHANHCHINHID(int NHOMTHUTUCHANHCHINHID) {
		_NHOMTHUTUCHANHCHINHID = NHOMTHUTUCHANHCHINHID;
	}

	public String getTONGHOSO() {
		if (_TONGHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _TONGHOSO;
		}
	}

	public void setTONGHOSO(String TONGHOSO) {
		_TONGHOSO = TONGHOSO;
	}

	public String getLEPHIHOSO() {
		if (_LEPHIHOSO == null) {
			return StringPool.BLANK;
		}
		else {
			return _LEPHIHOSO;
		}
	}

	public void setLEPHIHOSO(String LEPHIHOSO) {
		_LEPHIHOSO = LEPHIHOSO;
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

	@Override
	public Lephi_linhvuc toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Lephi_linhvuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		Lephi_linhvucImpl lephi_linhvucImpl = new Lephi_linhvucImpl();

		lephi_linhvucImpl.setNHOMTHUTUCHANHCHINHID(getNHOMTHUTUCHANHCHINHID());
		lephi_linhvucImpl.setTONGHOSO(getTONGHOSO());
		lephi_linhvucImpl.setLEPHIHOSO(getLEPHIHOSO());
		lephi_linhvucImpl.setPHIHOSO(getPHIHOSO());
		lephi_linhvucImpl.setTONGLEPHI(getTONGLEPHI());

		lephi_linhvucImpl.resetOriginalValues();

		return lephi_linhvucImpl;
	}

	public int compareTo(Lephi_linhvuc lephi_linhvuc) {
		int value = 0;

		if (getNHOMTHUTUCHANHCHINHID() < lephi_linhvuc.getNHOMTHUTUCHANHCHINHID()) {
			value = -1;
		}
		else if (getNHOMTHUTUCHANHCHINHID() > lephi_linhvuc.getNHOMTHUTUCHANHCHINHID()) {
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

		Lephi_linhvuc lephi_linhvuc = null;

		try {
			lephi_linhvuc = (Lephi_linhvuc)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = lephi_linhvuc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Lephi_linhvuc> toCacheModel() {
		Lephi_linhvucCacheModel lephi_linhvucCacheModel = new Lephi_linhvucCacheModel();

		lephi_linhvucCacheModel.NHOMTHUTUCHANHCHINHID = getNHOMTHUTUCHANHCHINHID();

		lephi_linhvucCacheModel.TONGHOSO = getTONGHOSO();

		String TONGHOSO = lephi_linhvucCacheModel.TONGHOSO;

		if ((TONGHOSO != null) && (TONGHOSO.length() == 0)) {
			lephi_linhvucCacheModel.TONGHOSO = null;
		}

		lephi_linhvucCacheModel.LEPHIHOSO = getLEPHIHOSO();

		String LEPHIHOSO = lephi_linhvucCacheModel.LEPHIHOSO;

		if ((LEPHIHOSO != null) && (LEPHIHOSO.length() == 0)) {
			lephi_linhvucCacheModel.LEPHIHOSO = null;
		}

		lephi_linhvucCacheModel.PHIHOSO = getPHIHOSO();

		String PHIHOSO = lephi_linhvucCacheModel.PHIHOSO;

		if ((PHIHOSO != null) && (PHIHOSO.length() == 0)) {
			lephi_linhvucCacheModel.PHIHOSO = null;
		}

		lephi_linhvucCacheModel.TONGLEPHI = getTONGLEPHI();

		String TONGLEPHI = lephi_linhvucCacheModel.TONGLEPHI;

		if ((TONGLEPHI != null) && (TONGLEPHI.length() == 0)) {
			lephi_linhvucCacheModel.TONGLEPHI = null;
		}

		return lephi_linhvucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{NHOMTHUTUCHANHCHINHID=");
		sb.append(getNHOMTHUTUCHANHCHINHID());
		sb.append(", TONGHOSO=");
		sb.append(getTONGHOSO());
		sb.append(", LEPHIHOSO=");
		sb.append(getLEPHIHOSO());
		sb.append(", PHIHOSO=");
		sb.append(getPHIHOSO());
		sb.append(", TONGLEPHI=");
		sb.append(getTONGLEPHI());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.report.model.Lephi_linhvuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>NHOMTHUTUCHANHCHINHID</column-name><column-value><![CDATA[");
		sb.append(getNHOMTHUTUCHANHCHINHID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TONGHOSO</column-name><column-value><![CDATA[");
		sb.append(getTONGHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LEPHIHOSO</column-name><column-value><![CDATA[");
		sb.append(getLEPHIHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHIHOSO</column-name><column-value><![CDATA[");
		sb.append(getPHIHOSO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TONGLEPHI</column-name><column-value><![CDATA[");
		sb.append(getTONGLEPHI());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Lephi_linhvuc.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Lephi_linhvuc.class
		};
	private int _NHOMTHUTUCHANHCHINHID;
	private String _TONGHOSO;
	private String _LEPHIHOSO;
	private String _PHIHOSO;
	private String _TONGLEPHI;
	private Lephi_linhvuc _escapedModelProxy;
}