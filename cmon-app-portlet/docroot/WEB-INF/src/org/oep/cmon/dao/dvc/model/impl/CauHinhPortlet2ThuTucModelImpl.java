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

import org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc;
import org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTucModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the CauHinhPortlet2ThuTuc service. Represents a row in the &quot;CMON_CAUHINHPORTLET2THUTUC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CauHinhPortlet2ThuTucImpl}.
 * </p>
 *
 * @author liemnn
 * @see CauHinhPortlet2ThuTucImpl
 * @see org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc
 * @see org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTucModel
 * @generated
 */
public class CauHinhPortlet2ThuTucModelImpl extends BaseModelImpl<CauHinhPortlet2ThuTuc>
	implements CauHinhPortlet2ThuTucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cau hinh portlet2 thu tuc model instance should use the {@link org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_CAUHINHPORTLET2THUTUC";
	public static final Object[][] TABLE_COLUMNS = {
			{ "THUTUCHANHCHINHID", Types.BIGINT },
			{ "PORTLETID", Types.BIGINT },
			{ "PORTLETNAME", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_CAUHINHPORTLET2THUTUC (THUTUCHANHCHINHID LONG not null primary key,PORTLETID LONG,PORTLETNAME VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_CAUHINHPORTLET2THUTUC";
	public static final String ORDER_BY_JPQL = " ORDER BY cauHinhPortlet2ThuTuc.thuTucHanhChinhId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_CAUHINHPORTLET2THUTUC.THUTUCHANHCHINHID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc"),
			true);
	public static long THUTUCHANHCHINHID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc"));

	public CauHinhPortlet2ThuTucModelImpl() {
	}

	public long getPrimaryKey() {
		return _thuTucHanhChinhId;
	}

	public void setPrimaryKey(long primaryKey) {
		setThuTucHanhChinhId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_thuTucHanhChinhId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return CauHinhPortlet2ThuTuc.class;
	}

	public String getModelClassName() {
		return CauHinhPortlet2ThuTuc.class.getName();
	}

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_columnBitmask = -1L;

		if (!_setOriginalThuTucHanhChinhId) {
			_setOriginalThuTucHanhChinhId = true;

			_originalThuTucHanhChinhId = _thuTucHanhChinhId;
		}

		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public long getOriginalThuTucHanhChinhId() {
		return _originalThuTucHanhChinhId;
	}

	public long getPortletId() {
		return _portletId;
	}

	public void setPortletId(long portletId) {
		_portletId = portletId;
	}

	public String getPortletName() {
		if (_portletName == null) {
			return StringPool.BLANK;
		}
		else {
			return _portletName;
		}
	}

	public void setPortletName(String portletName) {
		_portletName = portletName;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public CauHinhPortlet2ThuTuc toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (CauHinhPortlet2ThuTuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					CauHinhPortlet2ThuTuc.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		CauHinhPortlet2ThuTucImpl cauHinhPortlet2ThuTucImpl = new CauHinhPortlet2ThuTucImpl();

		cauHinhPortlet2ThuTucImpl.setThuTucHanhChinhId(getThuTucHanhChinhId());
		cauHinhPortlet2ThuTucImpl.setPortletId(getPortletId());
		cauHinhPortlet2ThuTucImpl.setPortletName(getPortletName());

		cauHinhPortlet2ThuTucImpl.resetOriginalValues();

		return cauHinhPortlet2ThuTucImpl;
	}

	public int compareTo(CauHinhPortlet2ThuTuc cauHinhPortlet2ThuTuc) {
		int value = 0;

		if (getThuTucHanhChinhId() < cauHinhPortlet2ThuTuc.getThuTucHanhChinhId()) {
			value = -1;
		}
		else if (getThuTucHanhChinhId() > cauHinhPortlet2ThuTuc.getThuTucHanhChinhId()) {
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

		CauHinhPortlet2ThuTuc cauHinhPortlet2ThuTuc = null;

		try {
			cauHinhPortlet2ThuTuc = (CauHinhPortlet2ThuTuc)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = cauHinhPortlet2ThuTuc.getPrimaryKey();

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
		CauHinhPortlet2ThuTucModelImpl cauHinhPortlet2ThuTucModelImpl = this;

		cauHinhPortlet2ThuTucModelImpl._originalThuTucHanhChinhId = cauHinhPortlet2ThuTucModelImpl._thuTucHanhChinhId;

		cauHinhPortlet2ThuTucModelImpl._setOriginalThuTucHanhChinhId = false;

		cauHinhPortlet2ThuTucModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CauHinhPortlet2ThuTuc> toCacheModel() {
		CauHinhPortlet2ThuTucCacheModel cauHinhPortlet2ThuTucCacheModel = new CauHinhPortlet2ThuTucCacheModel();

		cauHinhPortlet2ThuTucCacheModel.thuTucHanhChinhId = getThuTucHanhChinhId();

		cauHinhPortlet2ThuTucCacheModel.portletId = getPortletId();

		cauHinhPortlet2ThuTucCacheModel.portletName = getPortletName();

		String portletName = cauHinhPortlet2ThuTucCacheModel.portletName;

		if ((portletName != null) && (portletName.length() == 0)) {
			cauHinhPortlet2ThuTucCacheModel.portletName = null;
		}

		return cauHinhPortlet2ThuTucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", portletId=");
		sb.append(getPortletId());
		sb.append(", portletName=");
		sb.append(getPortletName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.dvc.model.CauHinhPortlet2ThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletId</column-name><column-value><![CDATA[");
		sb.append(getPortletId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletName</column-name><column-value><![CDATA[");
		sb.append(getPortletName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CauHinhPortlet2ThuTuc.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			CauHinhPortlet2ThuTuc.class
		};
	private long _thuTucHanhChinhId;
	private long _originalThuTucHanhChinhId;
	private boolean _setOriginalThuTucHanhChinhId;
	private long _portletId;
	private String _portletName;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private CauHinhPortlet2ThuTuc _escapedModelProxy;
}