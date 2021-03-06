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

package org.oep.cmon.dao.nsd.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Liemnn
 * @generated
 */
public class TaiNguyenSoap implements Serializable {
	public static TaiNguyenSoap toSoapModel(TaiNguyen model) {
		TaiNguyenSoap soapModel = new TaiNguyenSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());
		soapModel.setMoTa(model.getMoTa());
		soapModel.setLoai(model.getLoai());
		soapModel.setGiaTri(model.getGiaTri());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setNgaySua(model.getNgaySua());
		soapModel.setNguoiSua(model.getNguoiSua());
		soapModel.setDaXoa(model.getDaXoa());
		soapModel.setUngDungId(model.getUngDungId());
		soapModel.setHeThongId(model.getHeThongId());

		return soapModel;
	}

	public static TaiNguyenSoap[] toSoapModels(TaiNguyen[] models) {
		TaiNguyenSoap[] soapModels = new TaiNguyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaiNguyenSoap[][] toSoapModels(TaiNguyen[][] models) {
		TaiNguyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TaiNguyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaiNguyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaiNguyenSoap[] toSoapModels(List<TaiNguyen> models) {
		List<TaiNguyenSoap> soapModels = new ArrayList<TaiNguyenSoap>(models.size());

		for (TaiNguyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TaiNguyenSoap[soapModels.size()]);
	}

	public TaiNguyenSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getTen() {
		return _ten;
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public String getMoTa() {
		return _moTa;
	}

	public void setMoTa(String moTa) {
		_moTa = moTa;
	}

	public int getLoai() {
		return _loai;
	}

	public void setLoai(int loai) {
		_loai = loai;
	}

	public String getGiaTri() {
		return _giaTri;
	}

	public void setGiaTri(String giaTri) {
		_giaTri = giaTri;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public String getNguoiTao() {
		return _nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public String getNguoiSua() {
		return _nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		_nguoiSua = nguoiSua;
	}

	public int getDaXoa() {
		return _daXoa;
	}

	public void setDaXoa(int daXoa) {
		_daXoa = daXoa;
	}

	public Long getUngDungId() {
		return _ungDungId;
	}

	public void setUngDungId(Long ungDungId) {
		_ungDungId = ungDungId;
	}

	public Long getHeThongId() {
		return _heThongId;
	}

	public void setHeThongId(Long heThongId) {
		_heThongId = heThongId;
	}

	private long _id;
	private String _ten;
	private String _moTa;
	private int _loai;
	private String _giaTri;
	private int _trangThai;
	private Date _ngayTao;
	private String _nguoiTao;
	private Date _ngaySua;
	private String _nguoiSua;
	private int _daXoa;
	private Long _ungDungId;
	private Long _heThongId;
}