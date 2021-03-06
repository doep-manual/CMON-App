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

package org.oep.cmon.dao.dvc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CapNhatKetQua service. Represents a row in the &quot;CMON_CAPNHATKETQUA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.dvc.model.impl.CapNhatKetQuaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.dvc.model.impl.CapNhatKetQuaImpl}.
 * </p>
 *
 * @author liemnn
 * @see CapNhatKetQua
 * @see org.oep.cmon.dao.dvc.model.impl.CapNhatKetQuaImpl
 * @see org.oep.cmon.dao.dvc.model.impl.CapNhatKetQuaModelImpl
 * @generated
 */
public interface CapNhatKetQuaModel extends BaseModel<CapNhatKetQua> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cap nhat ket qua model instance should use the {@link CapNhatKetQua} interface instead.
	 */

	/**
	 * Returns the primary key of this cap nhat ket qua.
	 *
	 * @return the primary key of this cap nhat ket qua
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cap nhat ket qua.
	 *
	 * @param primaryKey the primary key of this cap nhat ket qua
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this cap nhat ket qua.
	 *
	 * @return the ID of this cap nhat ket qua
	 */
	public long getId();

	/**
	 * Sets the ID of this cap nhat ket qua.
	 *
	 * @param id the ID of this cap nhat ket qua
	 */
	public void setId(long id);

	/**
	 * Returns the ten bang of this cap nhat ket qua.
	 *
	 * @return the ten bang of this cap nhat ket qua
	 */
	@AutoEscape
	public String getTenBang();

	/**
	 * Sets the ten bang of this cap nhat ket qua.
	 *
	 * @param tenBang the ten bang of this cap nhat ket qua
	 */
	public void setTenBang(String tenBang);

	/**
	 * Returns the ban ghi ID of this cap nhat ket qua.
	 *
	 * @return the ban ghi ID of this cap nhat ket qua
	 */
	public long getBanGhiId();

	/**
	 * Sets the ban ghi ID of this cap nhat ket qua.
	 *
	 * @param banGhiId the ban ghi ID of this cap nhat ket qua
	 */
	public void setBanGhiId(long banGhiId);

	/**
	 * Returns the hanh dong of this cap nhat ket qua.
	 *
	 * @return the hanh dong of this cap nhat ket qua
	 */
	public int getHanhDong();

	/**
	 * Sets the hanh dong of this cap nhat ket qua.
	 *
	 * @param hanhDong the hanh dong of this cap nhat ket qua
	 */
	public void setHanhDong(int hanhDong);

	/**
	 * Returns the ngay tao of this cap nhat ket qua.
	 *
	 * @return the ngay tao of this cap nhat ket qua
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this cap nhat ket qua.
	 *
	 * @param ngayTao the ngay tao of this cap nhat ket qua
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this cap nhat ket qua.
	 *
	 * @return the nguoi tao of this cap nhat ket qua
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this cap nhat ket qua.
	 *
	 * @param nguoiTao the nguoi tao of this cap nhat ket qua
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the ngay sua of this cap nhat ket qua.
	 *
	 * @return the ngay sua of this cap nhat ket qua
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this cap nhat ket qua.
	 *
	 * @param ngaySua the ngay sua of this cap nhat ket qua
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the nguoi sua of this cap nhat ket qua.
	 *
	 * @return the nguoi sua of this cap nhat ket qua
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this cap nhat ket qua.
	 *
	 * @param nguoiSua the nguoi sua of this cap nhat ket qua
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the da xoa of this cap nhat ket qua.
	 *
	 * @return the da xoa of this cap nhat ket qua
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this cap nhat ket qua.
	 *
	 * @param daXoa the da xoa of this cap nhat ket qua
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the hoso t t h c c ID of this cap nhat ket qua.
	 *
	 * @return the hoso t t h c c ID of this cap nhat ket qua
	 */
	public long getHosoTTHCCId();

	/**
	 * Sets the hoso t t h c c ID of this cap nhat ket qua.
	 *
	 * @param hosoTTHCCId the hoso t t h c c ID of this cap nhat ket qua
	 */
	public void setHosoTTHCCId(long hosoTTHCCId);

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

	public int compareTo(CapNhatKetQua capNhatKetQua);

	public int hashCode();

	public CacheModel<CapNhatKetQua> toCacheModel();

	public CapNhatKetQua toEscapedModel();

	public String toString();

	public String toXmlString();
}