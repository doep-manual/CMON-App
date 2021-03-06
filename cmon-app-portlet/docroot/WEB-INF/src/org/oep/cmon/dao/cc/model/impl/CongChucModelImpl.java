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

package org.oep.cmon.dao.cc.model.impl;

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

import org.oep.cmon.dao.cc.model.CongChuc;
import org.oep.cmon.dao.cc.model.CongChucModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the CongChuc service. Represents a row in the &quot;CMON_CONGCHUC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.cc.model.CongChucModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CongChucImpl}.
 * </p>
 *
 * @author Liemnn
 * @see CongChucImpl
 * @see org.oep.cmon.dao.cc.model.CongChuc
 * @see org.oep.cmon.dao.cc.model.CongChucModel
 * @generated
 */
public class CongChucModelImpl extends BaseModelImpl<CongChuc>
	implements CongChucModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cong chuc model instance should use the {@link org.oep.cmon.dao.cc.model.CongChuc} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_CONGCHUC";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "HOVATEN", Types.VARCHAR },
			{ "NGAYSINH", Types.TIMESTAMP },
			{ "SOCMND", Types.VARCHAR },
			{ "NGAYCAPCMND", Types.TIMESTAMP },
			{ "NOICAPCMND", Types.VARCHAR },
			{ "GIOITINHID", Types.BIGINT },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "TAIKHOANNGUOIDUNGID", Types.BIGINT },
			{ "NGUOISUA", Types.VARCHAR },
			{ "CHUCVUID", Types.BIGINT },
			{ "COQUANQUANLYID", Types.BIGINT },
			{ "NGUOITAO", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_CONGCHUC (ID LONG not null primary key,MA VARCHAR(75) null,HOVATEN VARCHAR(75) null,NGAYSINH DATE null,SOCMND VARCHAR(75) null,NGAYCAPCMND DATE null,NOICAPCMND VARCHAR(75) null,GIOITINHID LONG,NGAYTAO DATE null,NGAYSUA DATE null,DAXOA INTEGER,TAIKHOANNGUOIDUNGID LONG null,NGUOISUA VARCHAR(75) null,CHUCVUID LONG,COQUANQUANLYID LONG,NGUOITAO VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_CONGCHUC";
	public static final String ORDER_BY_JPQL = " ORDER BY congChuc.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_CONGCHUC.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.cc.model.CongChuc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.cc.model.CongChuc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.cmon.dao.cc.model.CongChuc"),
			true);
	public static long CHUCVUID_COLUMN_BITMASK = 1L;
	public static long COQUANQUANLYID_COLUMN_BITMASK = 2L;
	public static long DAXOA_COLUMN_BITMASK = 4L;
	public static long MA_COLUMN_BITMASK = 8L;
	public static long TAIKHOANNGUOIDUNGID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.cc.model.CongChuc"));

	public CongChucModelImpl() {
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
		return CongChuc.class;
	}

	public String getModelClassName() {
		return CongChuc.class.getName();
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

	public String getHoVaTen() {
		if (_hoVaTen == null) {
			return StringPool.BLANK;
		}
		else {
			return _hoVaTen;
		}
	}

	public void setHoVaTen(String hoVaTen) {
		_hoVaTen = hoVaTen;
	}

	public Date getNgaySinh() {
		return _ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		_ngaySinh = ngaySinh;
	}

	public String getSoCmnd() {
		if (_soCmnd == null) {
			return StringPool.BLANK;
		}
		else {
			return _soCmnd;
		}
	}

	public void setSoCmnd(String soCmnd) {
		_soCmnd = soCmnd;
	}

	public Date getNgayCapCmnd() {
		return _ngayCapCmnd;
	}

	public void setNgayCapCmnd(Date ngayCapCmnd) {
		_ngayCapCmnd = ngayCapCmnd;
	}

	public String getNoiCapCmnd() {
		if (_noiCapCmnd == null) {
			return StringPool.BLANK;
		}
		else {
			return _noiCapCmnd;
		}
	}

	public void setNoiCapCmnd(String noiCapCmnd) {
		_noiCapCmnd = noiCapCmnd;
	}

	public long getGioiTinhId() {
		return _gioiTinhId;
	}

	public void setGioiTinhId(long gioiTinhId) {
		_gioiTinhId = gioiTinhId;
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

	public long getChucVuId() {
		return _chucVuId;
	}

	public void setChucVuId(long chucVuId) {
		_columnBitmask |= CHUCVUID_COLUMN_BITMASK;

		if (!_setOriginalChucVuId) {
			_setOriginalChucVuId = true;

			_originalChucVuId = _chucVuId;
		}

		_chucVuId = chucVuId;
	}

	public long getOriginalChucVuId() {
		return _originalChucVuId;
	}

	public long getCoQuanQuanLyId() {
		return _coQuanQuanLyId;
	}

	public void setCoQuanQuanLyId(long coQuanQuanLyId) {
		_columnBitmask |= COQUANQUANLYID_COLUMN_BITMASK;

		if (!_setOriginalCoQuanQuanLyId) {
			_setOriginalCoQuanQuanLyId = true;

			_originalCoQuanQuanLyId = _coQuanQuanLyId;
		}

		_coQuanQuanLyId = coQuanQuanLyId;
	}

	public long getOriginalCoQuanQuanLyId() {
		return _originalCoQuanQuanLyId;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public CongChuc toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (CongChuc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					CongChuc.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		CongChucImpl congChucImpl = new CongChucImpl();

		congChucImpl.setId(getId());
		congChucImpl.setMa(getMa());
		congChucImpl.setHoVaTen(getHoVaTen());
		congChucImpl.setNgaySinh(getNgaySinh());
		congChucImpl.setSoCmnd(getSoCmnd());
		congChucImpl.setNgayCapCmnd(getNgayCapCmnd());
		congChucImpl.setNoiCapCmnd(getNoiCapCmnd());
		congChucImpl.setGioiTinhId(getGioiTinhId());
		congChucImpl.setNgayTao(getNgayTao());
		congChucImpl.setNgaySua(getNgaySua());
		congChucImpl.setDaXoa(getDaXoa());
		congChucImpl.setTaiKhoanNguoiDungId(getTaiKhoanNguoiDungId());
		congChucImpl.setNguoiSua(getNguoiSua());
		congChucImpl.setChucVuId(getChucVuId());
		congChucImpl.setCoQuanQuanLyId(getCoQuanQuanLyId());
		congChucImpl.setNguoiTao(getNguoiTao());

		congChucImpl.resetOriginalValues();

		return congChucImpl;
	}

	public int compareTo(CongChuc congChuc) {
		int value = 0;

		if (getId() < congChuc.getId()) {
			value = -1;
		}
		else if (getId() > congChuc.getId()) {
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

		CongChuc congChuc = null;

		try {
			congChuc = (CongChuc)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = congChuc.getPrimaryKey();

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
		CongChucModelImpl congChucModelImpl = this;

		congChucModelImpl._originalMa = congChucModelImpl._ma;

		congChucModelImpl._originalDaXoa = congChucModelImpl._daXoa;

		congChucModelImpl._setOriginalDaXoa = false;

		congChucModelImpl._originalTaiKhoanNguoiDungId = congChucModelImpl._taiKhoanNguoiDungId;

		congChucModelImpl._setOriginalTaiKhoanNguoiDungId = false;

		congChucModelImpl._originalChucVuId = congChucModelImpl._chucVuId;

		congChucModelImpl._setOriginalChucVuId = false;

		congChucModelImpl._originalCoQuanQuanLyId = congChucModelImpl._coQuanQuanLyId;

		congChucModelImpl._setOriginalCoQuanQuanLyId = false;

		congChucModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CongChuc> toCacheModel() {
		CongChucCacheModel congChucCacheModel = new CongChucCacheModel();

		congChucCacheModel.id = getId();

		congChucCacheModel.ma = getMa();

		String ma = congChucCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			congChucCacheModel.ma = null;
		}

		congChucCacheModel.hoVaTen = getHoVaTen();

		String hoVaTen = congChucCacheModel.hoVaTen;

		if ((hoVaTen != null) && (hoVaTen.length() == 0)) {
			congChucCacheModel.hoVaTen = null;
		}

		Date ngaySinh = getNgaySinh();

		if (ngaySinh != null) {
			congChucCacheModel.ngaySinh = ngaySinh.getTime();
		}
		else {
			congChucCacheModel.ngaySinh = Long.MIN_VALUE;
		}

		congChucCacheModel.soCmnd = getSoCmnd();

		String soCmnd = congChucCacheModel.soCmnd;

		if ((soCmnd != null) && (soCmnd.length() == 0)) {
			congChucCacheModel.soCmnd = null;
		}

		Date ngayCapCmnd = getNgayCapCmnd();

		if (ngayCapCmnd != null) {
			congChucCacheModel.ngayCapCmnd = ngayCapCmnd.getTime();
		}
		else {
			congChucCacheModel.ngayCapCmnd = Long.MIN_VALUE;
		}

		congChucCacheModel.noiCapCmnd = getNoiCapCmnd();

		String noiCapCmnd = congChucCacheModel.noiCapCmnd;

		if ((noiCapCmnd != null) && (noiCapCmnd.length() == 0)) {
			congChucCacheModel.noiCapCmnd = null;
		}

		congChucCacheModel.gioiTinhId = getGioiTinhId();

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			congChucCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			congChucCacheModel.ngayTao = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			congChucCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			congChucCacheModel.ngaySua = Long.MIN_VALUE;
		}

		congChucCacheModel.daXoa = getDaXoa();

		congChucCacheModel.taiKhoanNguoiDungId = getTaiKhoanNguoiDungId();

		congChucCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = congChucCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			congChucCacheModel.nguoiSua = null;
		}

		congChucCacheModel.chucVuId = getChucVuId();

		congChucCacheModel.coQuanQuanLyId = getCoQuanQuanLyId();

		congChucCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = congChucCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			congChucCacheModel.nguoiTao = null;
		}

		return congChucCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", hoVaTen=");
		sb.append(getHoVaTen());
		sb.append(", ngaySinh=");
		sb.append(getNgaySinh());
		sb.append(", soCmnd=");
		sb.append(getSoCmnd());
		sb.append(", ngayCapCmnd=");
		sb.append(getNgayCapCmnd());
		sb.append(", noiCapCmnd=");
		sb.append(getNoiCapCmnd());
		sb.append(", gioiTinhId=");
		sb.append(getGioiTinhId());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", taiKhoanNguoiDungId=");
		sb.append(getTaiKhoanNguoiDungId());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", chucVuId=");
		sb.append(getChucVuId());
		sb.append(", coQuanQuanLyId=");
		sb.append(getCoQuanQuanLyId());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.cc.model.CongChuc");
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
			"<column><column-name>hoVaTen</column-name><column-value><![CDATA[");
		sb.append(getHoVaTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soCmnd</column-name><column-value><![CDATA[");
		sb.append(getSoCmnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayCapCmnd</column-name><column-value><![CDATA[");
		sb.append(getNgayCapCmnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiCapCmnd</column-name><column-value><![CDATA[");
		sb.append(getNoiCapCmnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinhId</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhId());
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
			"<column><column-name>taiKhoanNguoiDungId</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoanNguoiDungId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chucVuId</column-name><column-value><![CDATA[");
		sb.append(getChucVuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coQuanQuanLyId</column-name><column-value><![CDATA[");
		sb.append(getCoQuanQuanLyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CongChuc.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			CongChuc.class
		};
	private long _id;
	private String _ma;
	private String _originalMa;
	private String _hoVaTen;
	private Date _ngaySinh;
	private String _soCmnd;
	private Date _ngayCapCmnd;
	private String _noiCapCmnd;
	private long _gioiTinhId;
	private Date _ngayTao;
	private Date _ngaySua;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private Long _taiKhoanNguoiDungId;
	private Long _originalTaiKhoanNguoiDungId;
	private boolean _setOriginalTaiKhoanNguoiDungId;
	private String _nguoiSua;
	private long _chucVuId;
	private long _originalChucVuId;
	private boolean _setOriginalChucVuId;
	private long _coQuanQuanLyId;
	private long _originalCoQuanQuanLyId;
	private boolean _setOriginalCoQuanQuanLyId;
	private String _nguoiTao;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private CongChuc _escapedModelProxy;
}