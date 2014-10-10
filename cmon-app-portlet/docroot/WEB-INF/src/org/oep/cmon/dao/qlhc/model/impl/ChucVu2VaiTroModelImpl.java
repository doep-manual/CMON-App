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

package org.oep.cmon.dao.qlhc.model.impl;

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

import org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro;
import org.oep.cmon.dao.qlhc.model.ChucVu2VaiTroModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the ChucVu2VaiTro service. Represents a row in the &quot;CMON_CHUCVU2VAITRO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.qlhc.model.ChucVu2VaiTroModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ChucVu2VaiTroImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see ChucVu2VaiTroImpl
 * @see org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro
 * @see org.oep.cmon.dao.qlhc.model.ChucVu2VaiTroModel
 * @generated
 */
public class ChucVu2VaiTroModelImpl extends BaseModelImpl<ChucVu2VaiTro>
	implements ChucVu2VaiTroModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a chuc vu2 vai tro model instance should use the {@link org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_CHUCVU2VAITRO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "VAITROID", Types.BIGINT },
			{ "COQUANQUANLYID", Types.BIGINT },
			{ "CHUCVUID", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_CHUCVU2VAITRO (ID LONG not null primary key,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,VAITROID LONG null,COQUANQUANLYID LONG null,CHUCVUID LONG null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_CHUCVU2VAITRO";
	public static final String ORDER_BY_JPQL = " ORDER BY chucVu2VaiTro.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_CHUCVU2VAITRO.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro"),
			true);
	public static long CHUCVUID_COLUMN_BITMASK = 1L;
	public static long COQUANQUANLYID_COLUMN_BITMASK = 2L;
	public static long DAXOA_COLUMN_BITMASK = 4L;
	public static long VAITROID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro"));

	public ChucVu2VaiTroModelImpl() {
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
		return ChucVu2VaiTro.class;
	}

	public String getModelClassName() {
		return ChucVu2VaiTro.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
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

	public Long getCoQuanQuanLyId() {
		return _coQuanQuanLyId;
	}

	public void setCoQuanQuanLyId(Long coQuanQuanLyId) {
		_columnBitmask |= COQUANQUANLYID_COLUMN_BITMASK;

		if (!_setOriginalCoQuanQuanLyId) {
			_setOriginalCoQuanQuanLyId = true;

			_originalCoQuanQuanLyId = _coQuanQuanLyId;
		}

		_coQuanQuanLyId = coQuanQuanLyId;
	}

	public Long getOriginalCoQuanQuanLyId() {
		return _originalCoQuanQuanLyId;
	}

	public Long getChucVuId() {
		return _chucVuId;
	}

	public void setChucVuId(Long chucVuId) {
		_columnBitmask |= CHUCVUID_COLUMN_BITMASK;

		if (!_setOriginalChucVuId) {
			_setOriginalChucVuId = true;

			_originalChucVuId = _chucVuId;
		}

		_chucVuId = chucVuId;
	}

	public Long getOriginalChucVuId() {
		return _originalChucVuId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ChucVu2VaiTro toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ChucVu2VaiTro)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ChucVu2VaiTro.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ChucVu2VaiTroImpl chucVu2VaiTroImpl = new ChucVu2VaiTroImpl();

		chucVu2VaiTroImpl.setId(getId());
		chucVu2VaiTroImpl.setNgayTao(getNgayTao());
		chucVu2VaiTroImpl.setNgaySua(getNgaySua());
		chucVu2VaiTroImpl.setDaXoa(getDaXoa());
		chucVu2VaiTroImpl.setNguoiTao(getNguoiTao());
		chucVu2VaiTroImpl.setNguoiSua(getNguoiSua());
		chucVu2VaiTroImpl.setVaiTroId(getVaiTroId());
		chucVu2VaiTroImpl.setCoQuanQuanLyId(getCoQuanQuanLyId());
		chucVu2VaiTroImpl.setChucVuId(getChucVuId());

		chucVu2VaiTroImpl.resetOriginalValues();

		return chucVu2VaiTroImpl;
	}

	public int compareTo(ChucVu2VaiTro chucVu2VaiTro) {
		int value = 0;

		if (getId() < chucVu2VaiTro.getId()) {
			value = -1;
		}
		else if (getId() > chucVu2VaiTro.getId()) {
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

		ChucVu2VaiTro chucVu2VaiTro = null;

		try {
			chucVu2VaiTro = (ChucVu2VaiTro)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = chucVu2VaiTro.getPrimaryKey();

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
		ChucVu2VaiTroModelImpl chucVu2VaiTroModelImpl = this;

		chucVu2VaiTroModelImpl._originalDaXoa = chucVu2VaiTroModelImpl._daXoa;

		chucVu2VaiTroModelImpl._setOriginalDaXoa = false;

		chucVu2VaiTroModelImpl._originalVaiTroId = chucVu2VaiTroModelImpl._vaiTroId;

		chucVu2VaiTroModelImpl._setOriginalVaiTroId = false;

		chucVu2VaiTroModelImpl._originalCoQuanQuanLyId = chucVu2VaiTroModelImpl._coQuanQuanLyId;

		chucVu2VaiTroModelImpl._setOriginalCoQuanQuanLyId = false;

		chucVu2VaiTroModelImpl._originalChucVuId = chucVu2VaiTroModelImpl._chucVuId;

		chucVu2VaiTroModelImpl._setOriginalChucVuId = false;

		chucVu2VaiTroModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ChucVu2VaiTro> toCacheModel() {
		ChucVu2VaiTroCacheModel chucVu2VaiTroCacheModel = new ChucVu2VaiTroCacheModel();

		chucVu2VaiTroCacheModel.id = getId();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			chucVu2VaiTroCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			chucVu2VaiTroCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			chucVu2VaiTroCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			chucVu2VaiTroCacheModel.ngaySua = Long.MIN_VALUE;
		}

		chucVu2VaiTroCacheModel.daXoa = getDaXoa();

		chucVu2VaiTroCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = chucVu2VaiTroCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			chucVu2VaiTroCacheModel.nguoiTao = null;
		}

		chucVu2VaiTroCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = chucVu2VaiTroCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			chucVu2VaiTroCacheModel.nguoiSua = null;
		}

		chucVu2VaiTroCacheModel.vaiTroId = getVaiTroId();

		chucVu2VaiTroCacheModel.coQuanQuanLyId = getCoQuanQuanLyId();

		chucVu2VaiTroCacheModel.chucVuId = getChucVuId();

		return chucVu2VaiTroCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", vaiTroId=");
		sb.append(getVaiTroId());
		sb.append(", coQuanQuanLyId=");
		sb.append(getCoQuanQuanLyId());
		sb.append(", chucVuId=");
		sb.append(getChucVuId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.qlhc.model.ChucVu2VaiTro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroId</column-name><column-value><![CDATA[");
		sb.append(getVaiTroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanQuanLyId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanQuanLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chucVuId</column-name><column-value><![CDATA[");
		sb.append(getChucVuId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ChucVu2VaiTro.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ChucVu2VaiTro.class
		};
	private long _id;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private Long _vaiTroId;
	private Long _originalVaiTroId;
	private boolean _setOriginalVaiTroId;
	private Long _coQuanQuanLyId;
	private Long _originalCoQuanQuanLyId;
	private boolean _setOriginalCoQuanQuanLyId;
	private Long _chucVuId;
	private Long _originalChucVuId;
	private boolean _setOriginalChucVuId;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ChucVu2VaiTro _escapedModelProxy;
}