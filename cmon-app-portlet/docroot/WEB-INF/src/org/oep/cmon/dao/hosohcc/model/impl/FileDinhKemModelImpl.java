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

package org.oep.cmon.dao.hosohcc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.cmon.dao.hosohcc.model.FileDinhKem;
import org.oep.cmon.dao.hosohcc.model.FileDinhKemModel;
import org.oep.cmon.dao.hosohcc.model.FileDinhKemSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the FileDinhKem service. Represents a row in the &quot;CMON_GIAYTODINHKEMHOSO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.cmon.dao.hosohcc.model.FileDinhKemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FileDinhKemImpl}.
 * </p>
 *
 * @author LIEMNn
 * @see FileDinhKemImpl
 * @see org.oep.cmon.dao.hosohcc.model.FileDinhKem
 * @see org.oep.cmon.dao.hosohcc.model.FileDinhKemModel
 * @generated
 */
@JSON(strict = true)
public class FileDinhKemModelImpl extends BaseModelImpl<FileDinhKem>
	implements FileDinhKemModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a file dinh kem model instance should use the {@link org.oep.cmon.dao.hosohcc.model.FileDinhKem} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_GIAYTODINHKEMHOSO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "SOBANGIAY", Types.BIGINT },
			{ "DADOICHIEU", Types.INTEGER },
			{ "TTHSTAITHOIDIEMDINHKEM", Types.INTEGER },
			{ "NOILUUTRUTAILIEUID", Types.BIGINT },
			{ "CANBOID", Types.BIGINT },
			{ "HOSOTTHCCONGID", Types.BIGINT },
			{ "THUTUC2GIAYTOID", Types.BIGINT },
			{ "DANHMUCGIAYTOID", Types.BIGINT },
			{ "NGAYUPLOAD", Types.TIMESTAMP },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "NGUOIUPLOAD", Types.VARCHAR },
			{ "MALOAITAILIEUDUOCTHAYTHE", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "DAXOA", Types.INTEGER },
			{ "DATRA", Types.INTEGER },
			{ "BANCHINH", Types.BIGINT },
			{ "GHICHU", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_GIAYTODINHKEMHOSO (ID LONG not null primary key,SOBANGIAY LONG,DADOICHIEU INTEGER,TTHSTAITHOIDIEMDINHKEM INTEGER,NOILUUTRUTAILIEUID LONG null,CANBOID LONG null,HOSOTTHCCONGID LONG null,THUTUC2GIAYTOID LONG null,DANHMUCGIAYTOID LONG null,NGAYUPLOAD DATE null,NGAYSUA DATE null,NGUOIUPLOAD VARCHAR(75) null,MALOAITAILIEUDUOCTHAYTHE VARCHAR(75) null,NGUOISUA VARCHAR(75) null,DAXOA INTEGER,DATRA INTEGER,BANCHINH LONG,GHICHU VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMON_GIAYTODINHKEMHOSO";
	public static final String ORDER_BY_JPQL = " ORDER BY fileDinhKem.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_GIAYTODINHKEMHOSO.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.cmon.dao.hosohcc.model.FileDinhKem"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.cmon.dao.hosohcc.model.FileDinhKem"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FileDinhKem toModel(FileDinhKemSoap soapModel) {
		FileDinhKem model = new FileDinhKemImpl();

		model.setId(soapModel.getId());
		model.setSoBanGiay(soapModel.getSoBanGiay());
		model.setDaDoiChieu(soapModel.getDaDoiChieu());
		model.setTrangThaiHoSoTaiThoiDiemDinhKem(soapModel.getTrangThaiHoSoTaiThoiDiemDinhKem());
		model.setNoiLuuTruTaiLieuId(soapModel.getNoiLuuTruTaiLieuId());
		model.setCanBoId(soapModel.getCanBoId());
		model.setHoSoTTHCCongId(soapModel.getHoSoTTHCCongId());
		model.setThuTuc2GiayToId(soapModel.getThuTuc2GiayToId());
		model.setDanhMucGiayToId(soapModel.getDanhMucGiayToId());
		model.setNgayUpload(soapModel.getNgayUpload());
		model.setNgaySua(soapModel.getNgaySua());
		model.setNguoiUpload(soapModel.getNguoiUpload());
		model.setMaLoaiTaiLieuDuocThayThe(soapModel.getMaLoaiTaiLieuDuocThayThe());
		model.setNguoiSua(soapModel.getNguoiSua());
		model.setXoa(soapModel.getXoa());
		model.setDaTra(soapModel.getDaTra());
		model.setBanChinh(soapModel.getBanChinh());
		model.setGhiChu(soapModel.getGhiChu());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FileDinhKem> toModels(FileDinhKemSoap[] soapModels) {
		List<FileDinhKem> models = new ArrayList<FileDinhKem>(soapModels.length);

		for (FileDinhKemSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.cmon.dao.hosohcc.model.FileDinhKem"));

	public FileDinhKemModelImpl() {
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
		return FileDinhKem.class;
	}

	public String getModelClassName() {
		return FileDinhKem.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public long getSoBanGiay() {
		return _soBanGiay;
	}

	public void setSoBanGiay(long soBanGiay) {
		_soBanGiay = soBanGiay;
	}

	@JSON
	public int getDaDoiChieu() {
		return _daDoiChieu;
	}

	public void setDaDoiChieu(int daDoiChieu) {
		_daDoiChieu = daDoiChieu;
	}

	@JSON
	public int getTrangThaiHoSoTaiThoiDiemDinhKem() {
		return _trangThaiHoSoTaiThoiDiemDinhKem;
	}

	public void setTrangThaiHoSoTaiThoiDiemDinhKem(
		int trangThaiHoSoTaiThoiDiemDinhKem) {
		_trangThaiHoSoTaiThoiDiemDinhKem = trangThaiHoSoTaiThoiDiemDinhKem;
	}

	@JSON
	public Long getNoiLuuTruTaiLieuId() {
		return _noiLuuTruTaiLieuId;
	}

	public void setNoiLuuTruTaiLieuId(Long noiLuuTruTaiLieuId) {
		_noiLuuTruTaiLieuId = noiLuuTruTaiLieuId;
	}

	@JSON
	public Long getCanBoId() {
		return _canBoId;
	}

	public void setCanBoId(Long canBoId) {
		_canBoId = canBoId;
	}

	@JSON
	public Long getHoSoTTHCCongId() {
		return _hoSoTTHCCongId;
	}

	public void setHoSoTTHCCongId(Long hoSoTTHCCongId) {
		_hoSoTTHCCongId = hoSoTTHCCongId;
	}

	@JSON
	public Long getThuTuc2GiayToId() {
		return _thuTuc2GiayToId;
	}

	public void setThuTuc2GiayToId(Long thuTuc2GiayToId) {
		_thuTuc2GiayToId = thuTuc2GiayToId;
	}

	@JSON
	public Long getDanhMucGiayToId() {
		return _danhMucGiayToId;
	}

	public void setDanhMucGiayToId(Long danhMucGiayToId) {
		_danhMucGiayToId = danhMucGiayToId;
	}

	@JSON
	public Date getNgayUpload() {
		return _ngayUpload;
	}

	public void setNgayUpload(Date ngayUpload) {
		_ngayUpload = ngayUpload;
	}

	@JSON
	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	@JSON
	public String getNguoiUpload() {
		if (_nguoiUpload == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiUpload;
		}
	}

	public void setNguoiUpload(String nguoiUpload) {
		_nguoiUpload = nguoiUpload;
	}

	@JSON
	public String getMaLoaiTaiLieuDuocThayThe() {
		if (_maLoaiTaiLieuDuocThayThe == null) {
			return StringPool.BLANK;
		}
		else {
			return _maLoaiTaiLieuDuocThayThe;
		}
	}

	public void setMaLoaiTaiLieuDuocThayThe(String maLoaiTaiLieuDuocThayThe) {
		_maLoaiTaiLieuDuocThayThe = maLoaiTaiLieuDuocThayThe;
	}

	@JSON
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

	@JSON
	public int getXoa() {
		return _xoa;
	}

	public void setXoa(int xoa) {
		_xoa = xoa;
	}

	@JSON
	public int getDaTra() {
		return _daTra;
	}

	public void setDaTra(int daTra) {
		_daTra = daTra;
	}

	@JSON
	public long getBanChinh() {
		return _banChinh;
	}

	public void setBanChinh(long banChinh) {
		_banChinh = banChinh;
	}

	@JSON
	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	@Override
	public FileDinhKem toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (FileDinhKem)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					FileDinhKem.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		FileDinhKemImpl fileDinhKemImpl = new FileDinhKemImpl();

		fileDinhKemImpl.setId(getId());
		fileDinhKemImpl.setSoBanGiay(getSoBanGiay());
		fileDinhKemImpl.setDaDoiChieu(getDaDoiChieu());
		fileDinhKemImpl.setTrangThaiHoSoTaiThoiDiemDinhKem(getTrangThaiHoSoTaiThoiDiemDinhKem());
		fileDinhKemImpl.setNoiLuuTruTaiLieuId(getNoiLuuTruTaiLieuId());
		fileDinhKemImpl.setCanBoId(getCanBoId());
		fileDinhKemImpl.setHoSoTTHCCongId(getHoSoTTHCCongId());
		fileDinhKemImpl.setThuTuc2GiayToId(getThuTuc2GiayToId());
		fileDinhKemImpl.setDanhMucGiayToId(getDanhMucGiayToId());
		fileDinhKemImpl.setNgayUpload(getNgayUpload());
		fileDinhKemImpl.setNgaySua(getNgaySua());
		fileDinhKemImpl.setNguoiUpload(getNguoiUpload());
		fileDinhKemImpl.setMaLoaiTaiLieuDuocThayThe(getMaLoaiTaiLieuDuocThayThe());
		fileDinhKemImpl.setNguoiSua(getNguoiSua());
		fileDinhKemImpl.setXoa(getXoa());
		fileDinhKemImpl.setDaTra(getDaTra());
		fileDinhKemImpl.setBanChinh(getBanChinh());
		fileDinhKemImpl.setGhiChu(getGhiChu());

		fileDinhKemImpl.resetOriginalValues();

		return fileDinhKemImpl;
	}

	public int compareTo(FileDinhKem fileDinhKem) {
		int value = 0;

		if (getId() < fileDinhKem.getId()) {
			value = -1;
		}
		else if (getId() > fileDinhKem.getId()) {
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

		FileDinhKem fileDinhKem = null;

		try {
			fileDinhKem = (FileDinhKem)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = fileDinhKem.getPrimaryKey();

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
	public CacheModel<FileDinhKem> toCacheModel() {
		FileDinhKemCacheModel fileDinhKemCacheModel = new FileDinhKemCacheModel();

		fileDinhKemCacheModel.id = getId();

		fileDinhKemCacheModel.soBanGiay = getSoBanGiay();

		fileDinhKemCacheModel.daDoiChieu = getDaDoiChieu();

		fileDinhKemCacheModel.trangThaiHoSoTaiThoiDiemDinhKem = getTrangThaiHoSoTaiThoiDiemDinhKem();

		fileDinhKemCacheModel.noiLuuTruTaiLieuId = getNoiLuuTruTaiLieuId();

		fileDinhKemCacheModel.canBoId = getCanBoId();

		fileDinhKemCacheModel.hoSoTTHCCongId = getHoSoTTHCCongId();

		fileDinhKemCacheModel.thuTuc2GiayToId = getThuTuc2GiayToId();

		fileDinhKemCacheModel.danhMucGiayToId = getDanhMucGiayToId();

		Date ngayUpload = getNgayUpload();

		if (ngayUpload != null) {
			fileDinhKemCacheModel.ngayUpload = ngayUpload.getTime();
		}
		else {
			fileDinhKemCacheModel.ngayUpload = Long.MIN_VALUE;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			fileDinhKemCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			fileDinhKemCacheModel.ngaySua = Long.MIN_VALUE;
		}

		fileDinhKemCacheModel.nguoiUpload = getNguoiUpload();

		String nguoiUpload = fileDinhKemCacheModel.nguoiUpload;

		if ((nguoiUpload != null) && (nguoiUpload.length() == 0)) {
			fileDinhKemCacheModel.nguoiUpload = null;
		}

		fileDinhKemCacheModel.maLoaiTaiLieuDuocThayThe = getMaLoaiTaiLieuDuocThayThe();

		String maLoaiTaiLieuDuocThayThe = fileDinhKemCacheModel.maLoaiTaiLieuDuocThayThe;

		if ((maLoaiTaiLieuDuocThayThe != null) &&
				(maLoaiTaiLieuDuocThayThe.length() == 0)) {
			fileDinhKemCacheModel.maLoaiTaiLieuDuocThayThe = null;
		}

		fileDinhKemCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = fileDinhKemCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			fileDinhKemCacheModel.nguoiSua = null;
		}

		fileDinhKemCacheModel.xoa = getXoa();

		fileDinhKemCacheModel.daTra = getDaTra();

		fileDinhKemCacheModel.banChinh = getBanChinh();

		fileDinhKemCacheModel.ghiChu = getGhiChu();

		String ghiChu = fileDinhKemCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			fileDinhKemCacheModel.ghiChu = null;
		}

		return fileDinhKemCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", soBanGiay=");
		sb.append(getSoBanGiay());
		sb.append(", daDoiChieu=");
		sb.append(getDaDoiChieu());
		sb.append(", trangThaiHoSoTaiThoiDiemDinhKem=");
		sb.append(getTrangThaiHoSoTaiThoiDiemDinhKem());
		sb.append(", noiLuuTruTaiLieuId=");
		sb.append(getNoiLuuTruTaiLieuId());
		sb.append(", canBoId=");
		sb.append(getCanBoId());
		sb.append(", hoSoTTHCCongId=");
		sb.append(getHoSoTTHCCongId());
		sb.append(", thuTuc2GiayToId=");
		sb.append(getThuTuc2GiayToId());
		sb.append(", danhMucGiayToId=");
		sb.append(getDanhMucGiayToId());
		sb.append(", ngayUpload=");
		sb.append(getNgayUpload());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", nguoiUpload=");
		sb.append(getNguoiUpload());
		sb.append(", maLoaiTaiLieuDuocThayThe=");
		sb.append(getMaLoaiTaiLieuDuocThayThe());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", xoa=");
		sb.append(getXoa());
		sb.append(", daTra=");
		sb.append(getDaTra());
		sb.append(", banChinh=");
		sb.append(getBanChinh());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.cmon.dao.hosohcc.model.FileDinhKem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soBanGiay</column-name><column-value><![CDATA[");
		sb.append(getSoBanGiay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daDoiChieu</column-name><column-value><![CDATA[");
		sb.append(getDaDoiChieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiHoSoTaiThoiDiemDinhKem</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiHoSoTaiThoiDiemDinhKem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiLuuTruTaiLieuId</column-name><column-value><![CDATA[");
		sb.append(getNoiLuuTruTaiLieuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canBoId</column-name><column-value><![CDATA[");
		sb.append(getCanBoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoTTHCCongId</column-name><column-value><![CDATA[");
		sb.append(getHoSoTTHCCongId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTuc2GiayToId</column-name><column-value><![CDATA[");
		sb.append(getThuTuc2GiayToId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danhMucGiayToId</column-name><column-value><![CDATA[");
		sb.append(getDanhMucGiayToId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayUpload</column-name><column-value><![CDATA[");
		sb.append(getNgayUpload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiUpload</column-name><column-value><![CDATA[");
		sb.append(getNguoiUpload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maLoaiTaiLieuDuocThayThe</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiTaiLieuDuocThayThe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xoa</column-name><column-value><![CDATA[");
		sb.append(getXoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daTra</column-name><column-value><![CDATA[");
		sb.append(getDaTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>banChinh</column-name><column-value><![CDATA[");
		sb.append(getBanChinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = FileDinhKem.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			FileDinhKem.class
		};
	private long _id;
	private long _soBanGiay;
	private int _daDoiChieu;
	private int _trangThaiHoSoTaiThoiDiemDinhKem;
	private Long _noiLuuTruTaiLieuId;
	private Long _canBoId;
	private Long _hoSoTTHCCongId;
	private Long _thuTuc2GiayToId;
	private Long _danhMucGiayToId;
	private Date _ngayUpload;
	private Date _ngaySua;
	private String _nguoiUpload;
	private String _maLoaiTaiLieuDuocThayThe;
	private String _nguoiSua;
	private int _xoa;
	private int _daTra;
	private long _banChinh;
	private String _ghiChu;
	private transient ExpandoBridge _expandoBridge;
	private FileDinhKem _escapedModelProxy;
}