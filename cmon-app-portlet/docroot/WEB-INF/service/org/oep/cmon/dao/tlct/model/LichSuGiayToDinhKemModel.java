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

package org.oep.cmon.dao.tlct.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LichSuGiayToDinhKem service. Represents a row in the &quot;CMON_LICHSUGIAYTODINHKEM&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.tlct.model.impl.LichSuGiayToDinhKemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.tlct.model.impl.LichSuGiayToDinhKemImpl}.
 * </p>
 *
 * @author Liemnn
 * @see LichSuGiayToDinhKem
 * @see org.oep.cmon.dao.tlct.model.impl.LichSuGiayToDinhKemImpl
 * @see org.oep.cmon.dao.tlct.model.impl.LichSuGiayToDinhKemModelImpl
 * @generated
 */
public interface LichSuGiayToDinhKemModel extends BaseModel<LichSuGiayToDinhKem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lich su giay to dinh kem model instance should use the {@link LichSuGiayToDinhKem} interface instead.
	 */

	/**
	 * Returns the primary key of this lich su giay to dinh kem.
	 *
	 * @return the primary key of this lich su giay to dinh kem
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lich su giay to dinh kem.
	 *
	 * @param primaryKey the primary key of this lich su giay to dinh kem
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this lich su giay to dinh kem.
	 *
	 * @return the ID of this lich su giay to dinh kem
	 */
	public long getId();

	/**
	 * Sets the ID of this lich su giay to dinh kem.
	 *
	 * @param id the ID of this lich su giay to dinh kem
	 */
	public void setId(long id);

	/**
	 * Returns the giay to dinh kem ho so ID of this lich su giay to dinh kem.
	 *
	 * @return the giay to dinh kem ho so ID of this lich su giay to dinh kem
	 */
	public Long getGiayToDinhKemHoSoId();

	/**
	 * Sets the giay to dinh kem ho so ID of this lich su giay to dinh kem.
	 *
	 * @param giayToDinhKemHoSoId the giay to dinh kem ho so ID of this lich su giay to dinh kem
	 */
	public void setGiayToDinhKemHoSoId(Long giayToDinhKemHoSoId);

	/**
	 * Returns the hanh dong of this lich su giay to dinh kem.
	 *
	 * @return the hanh dong of this lich su giay to dinh kem
	 */
	public int getHanhDong();

	/**
	 * Sets the hanh dong of this lich su giay to dinh kem.
	 *
	 * @param hanhDong the hanh dong of this lich su giay to dinh kem
	 */
	public void setHanhDong(int hanhDong);

	/**
	 * Returns the nguoi tao of this lich su giay to dinh kem.
	 *
	 * @return the nguoi tao of this lich su giay to dinh kem
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this lich su giay to dinh kem.
	 *
	 * @param nguoiTao the nguoi tao of this lich su giay to dinh kem
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the noi luu tru tai lieu ID of this lich su giay to dinh kem.
	 *
	 * @return the noi luu tru tai lieu ID of this lich su giay to dinh kem
	 */
	public long getNoiLuuTruTaiLieuId();

	/**
	 * Sets the noi luu tru tai lieu ID of this lich su giay to dinh kem.
	 *
	 * @param noiLuuTruTaiLieuId the noi luu tru tai lieu ID of this lich su giay to dinh kem
	 */
	public void setNoiLuuTruTaiLieuId(long noiLuuTruTaiLieuId);

	/**
	 * Returns the ngay tao of this lich su giay to dinh kem.
	 *
	 * @return the ngay tao of this lich su giay to dinh kem
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this lich su giay to dinh kem.
	 *
	 * @param ngayTao the ngay tao of this lich su giay to dinh kem
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the ten tai lieu of this lich su giay to dinh kem.
	 *
	 * @return the ten tai lieu of this lich su giay to dinh kem
	 */
	@AutoEscape
	public String getTenTaiLieu();

	/**
	 * Sets the ten tai lieu of this lich su giay to dinh kem.
	 *
	 * @param tenTaiLieu the ten tai lieu of this lich su giay to dinh kem
	 */
	public void setTenTaiLieu(String tenTaiLieu);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(LichSuGiayToDinhKem lichSuGiayToDinhKem);

	public int hashCode();

	public CacheModel<LichSuGiayToDinhKem> toCacheModel();

	public LichSuGiayToDinhKem toEscapedModel();

	public String toString();

	public String toXmlString();
}