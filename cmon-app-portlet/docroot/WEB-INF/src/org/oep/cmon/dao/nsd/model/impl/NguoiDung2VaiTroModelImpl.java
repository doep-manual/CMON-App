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

package org.oep.cmon.dao.nsd.model.impl;

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

import org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro;
import org.oep.cmon.dao.nsd.model.NguoiDung2VaiTroModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the NguoiDung2VaiTro service. Represents a row in the &quot;CMON_NGUOIDUNG2VAITRO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.nsd.model.NguoiDung2VaiTroModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NguoiDung2VaiTroImpl}.
 * </p>
 *
 * @author Liemnn
 * @see NguoiDung2VaiTroImpl
 * @see org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro
 * @see org.oep.cmon.dao.nsd.model.NguoiDung2VaiTroModel
 * @generated
 */
public class NguoiDung2VaiTroModelImpl extends BaseModelImpl<NguoiDung2VaiTro>
	implements NguoiDung2VaiTroModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nguoi dung2 vai tro model instance should use the {@link org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_NGUOIDUNG2VAITRO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "VAITROID", Types.BIGINT },
			{ "TAIKHOANNGUOIDUNGID", Types.BIGINT },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGUOITAO", Types.VARCHAR },
			{ "DAXOA", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_NGUOIDUNG2VAITRO (ID LONG not null primary key,VAITROID LONG null,TAIKHOANNGUOIDUNGID LONG null,NGAYTAO DATE null,NGUOITAO VARCHAR(75) null,DAXOA INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CMON_NGUOIDUNG2VAITRO";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static long TAIKHOANNGUOIDUNGID_COLUMN_BITMASK = 2L;
	public static long VAITROID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro"));

	public NguoiDung2VaiTroModelImpl() {
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
		return NguoiDung2VaiTro.class;
	}

	public String getModelClassName() {
		return NguoiDung2VaiTro.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Long getVaiTroId() {
		return _vaiTroId;
	}

	public void setVaiTroId(Long vaiTroId) {
		_columnBitmask |= VAITROID_COLUMN_BITMASK;

		if (!_setOriginalVaiTroId) {
			_setOriginalVaiTroId = true;

			_originalVaiTroId = _vaiTroId;
		}

		_vaiTroId = vaiTroId;
	}

	public Long getOriginalVaiTroId() {
		return _originalVaiTroId;
	}

	public Long getTaiKhoanNguoiDungId() {
		return _taiKhoanNguoiDungId;
	}

	public void setTaiKhoanNguoiDungId(Long taiKhoanNguoiDungId) {
		_columnBitmask |= TAIKHOANNGUOIDUNGID_COLUMN_BITMASK;

		if (!_setOriginalTaiKhoanNguoiDungId) {
			_setOriginalTaiKhoanNguoiDungId = true;

			_originalTaiKhoanNguoiDungId = _taiKhoanNguoiDungId;
		}

		_taiKhoanNguoiDungId = taiKhoanNguoiDungId;
	}

	public Long getOriginalTaiKhoanNguoiDungId() {
		return _originalTaiKhoanNguoiDungId;
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
	public NguoiDung2VaiTro toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (NguoiDung2VaiTro)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					NguoiDung2VaiTro.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		NguoiDung2VaiTroImpl nguoiDung2VaiTroImpl = new NguoiDung2VaiTroImpl();

		nguoiDung2VaiTroImpl.setId(getId());
		nguoiDung2VaiTroImpl.setVaiTroId(getVaiTroId());
		nguoiDung2VaiTroImpl.setTaiKhoanNguoiDungId(getTaiKhoanNguoiDungId());
		nguoiDung2VaiTroImpl.setNgayTao(getNgayTao());
		nguoiDung2VaiTroImpl.setNguoiTao(getNguoiTao());
		nguoiDung2VaiTroImpl.setDaXoa(getDaXoa());

		nguoiDung2VaiTroImpl.resetOriginalValues();

		return nguoiDung2VaiTroImpl;
	}

	public int compareTo(NguoiDung2VaiTro nguoiDung2VaiTro) {
		long primaryKey = nguoiDung2VaiTro.getPrimaryKey();

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

		NguoiDung2VaiTro nguoiDung2VaiTro = null;

		try {
			nguoiDung2VaiTro = (NguoiDung2VaiTro)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = nguoiDung2VaiTro.getPrimaryKey();

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
		NguoiDung2VaiTroModelImpl nguoiDung2VaiTroModelImpl = this;

		nguoiDung2VaiTroModelImpl._originalVaiTroId = nguoiDung2VaiTroModelImpl._vaiTroId;

		nguoiDung2VaiTroModelImpl._setOriginalVaiTroId = false;

		nguoiDung2VaiTroModelImpl._originalTaiKhoanNguoiDungId = nguoiDung2VaiTroModelImpl._taiKhoanNguoiDungId;

		nguoiDung2VaiTroModelImpl._setOriginalTaiKhoanNguoiDungId = false;

		nguoiDung2VaiTroModelImpl._originalDaXoa = nguoiDung2VaiTroModelImpl._daXoa;

		nguoiDung2VaiTroModelImpl._setOriginalDaXoa = false;

		nguoiDung2VaiTroModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<NguoiDung2VaiTro> toCacheModel() {
		NguoiDung2VaiTroCacheModel nguoiDung2VaiTroCacheModel = new NguoiDung2VaiTroCacheModel();

		nguoiDung2VaiTroCacheModel.id = getId();

		nguoiDung2VaiTroCacheModel.vaiTroId = getVaiTroId();

		nguoiDung2VaiTroCacheModel.taiKhoanNguoiDungId = getTaiKhoanNguoiDungId();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			nguoiDung2VaiTroCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			nguoiDung2VaiTroCacheModel.ngayTao = Long.MIN_VALUE;
		}

		nguoiDung2VaiTroCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = nguoiDung2VaiTroCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			nguoiDung2VaiTroCacheModel.nguoiTao = null;
		}

		nguoiDung2VaiTroCacheModel.daXoa = getDaXoa();

		return nguoiDung2VaiTroCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vaiTroId=");
		sb.append(getVaiTroId());
		sb.append(", taiKhoanNguoiDungId=");
		sb.append(getTaiKhoanNguoiDungId());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.nsd.model.NguoiDung2VaiTro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroId</column-name><column-value><![CDATA[");
		sb.append(getVaiTroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoanNguoiDungId</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoanNguoiDungId());
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
			"<column><column-name>daXoa</column-name><column-value><![CDATA[");
		sb.append(getDaXoa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = NguoiDung2VaiTro.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			NguoiDung2VaiTro.class
		};
	private long _id;
	private Long _vaiTroId;
	private Long _originalVaiTroId;
	private boolean _setOriginalVaiTroId;
	private Long _taiKhoanNguoiDungId;
	private Long _originalTaiKhoanNguoiDungId;
	private boolean _setOriginalTaiKhoanNguoiDungId;
	private Date _ngayTao;
	private String _nguoiTao;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private NguoiDung2VaiTro _escapedModelProxy;
}