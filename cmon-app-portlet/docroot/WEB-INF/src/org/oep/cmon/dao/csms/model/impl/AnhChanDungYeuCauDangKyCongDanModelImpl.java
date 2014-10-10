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

package org.oep.cmon.dao.csms.model.impl;

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

import org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan;
import org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDanModel;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the AnhChanDungYeuCauDangKyCongDan service. Represents a row in the &quot;csms_yeucaudangkycongdan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDanModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AnhChanDungYeuCauDangKyCongDanImpl}.
 * </p>
 *
 * @author NAM
 * @see AnhChanDungYeuCauDangKyCongDanImpl
 * @see org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan
 * @see org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDanModel
 * @generated
 */
public class AnhChanDungYeuCauDangKyCongDanModelImpl extends BaseModelImpl<AnhChanDungYeuCauDangKyCongDan>
	implements AnhChanDungYeuCauDangKyCongDanModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a anh chan dung yeu cau dang ky cong dan model instance should use the {@link org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan} interface instead.
	 */
	public static final String TABLE_NAME = "csms_yeucaudangkycongdan";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "ANHCHANDUNG", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table csms_yeucaudangkycongdan (ID LONG not null primary key,ANHCHANDUNG VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table csms_yeucaudangkycongdan";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan"));

	public AnhChanDungYeuCauDangKyCongDanModelImpl() {
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
		return AnhChanDungYeuCauDangKyCongDan.class;
	}

	public String getModelClassName() {
		return AnhChanDungYeuCauDangKyCongDan.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getAnhChanDung() {
		if (_AnhChanDung == null) {
			return StringPool.BLANK;
		}
		else {
			return _AnhChanDung;
		}
	}

	public void setAnhChanDung(String AnhChanDung) {
		_AnhChanDung = AnhChanDung;
	}

	@Override
	public AnhChanDungYeuCauDangKyCongDan toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (AnhChanDungYeuCauDangKyCongDan)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					AnhChanDungYeuCauDangKyCongDan.class.getName(),
					getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		AnhChanDungYeuCauDangKyCongDanImpl anhChanDungYeuCauDangKyCongDanImpl = new AnhChanDungYeuCauDangKyCongDanImpl();

		anhChanDungYeuCauDangKyCongDanImpl.setId(getId());
		anhChanDungYeuCauDangKyCongDanImpl.setAnhChanDung(getAnhChanDung());

		anhChanDungYeuCauDangKyCongDanImpl.resetOriginalValues();

		return anhChanDungYeuCauDangKyCongDanImpl;
	}

	public int compareTo(
		AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan) {
		long primaryKey = anhChanDungYeuCauDangKyCongDan.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		AnhChanDungYeuCauDangKyCongDan anhChanDungYeuCauDangKyCongDan = null;

		try {
			anhChanDungYeuCauDangKyCongDan = (AnhChanDungYeuCauDangKyCongDan)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = anhChanDungYeuCauDangKyCongDan.getPrimaryKey();

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
	public CacheModel<AnhChanDungYeuCauDangKyCongDan> toCacheModel() {
		AnhChanDungYeuCauDangKyCongDanCacheModel anhChanDungYeuCauDangKyCongDanCacheModel =
			new AnhChanDungYeuCauDangKyCongDanCacheModel();

		anhChanDungYeuCauDangKyCongDanCacheModel.id = getId();

		anhChanDungYeuCauDangKyCongDanCacheModel.AnhChanDung = getAnhChanDung();

		String AnhChanDung = anhChanDungYeuCauDangKyCongDanCacheModel.AnhChanDung;

		if ((AnhChanDung != null) && (AnhChanDung.length() == 0)) {
			anhChanDungYeuCauDangKyCongDanCacheModel.AnhChanDung = null;
		}

		return anhChanDungYeuCauDangKyCongDanCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", AnhChanDung=");
		sb.append(getAnhChanDung());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.csms.model.AnhChanDungYeuCauDangKyCongDan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AnhChanDung</column-name><column-value><![CDATA[");
		sb.append(getAnhChanDung());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AnhChanDungYeuCauDangKyCongDan.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			AnhChanDungYeuCauDangKyCongDan.class
		};
	private long _id;
	private String _AnhChanDung;
	private transient ExpandoBridge _expandoBridge;
	private AnhChanDungYeuCauDangKyCongDan _escapedModelProxy;
}