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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the NguoiDung2VaiTro service. Represents a row in the &quot;CMON_NGUOIDUNG2VAITRO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.nsd.model.impl.NguoiDung2VaiTroModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.nsd.model.impl.NguoiDung2VaiTroImpl}.
 * </p>
 *
 * @author Liemnn
 * @see NguoiDung2VaiTro
 * @see org.oep.cmon.dao.nsd.model.impl.NguoiDung2VaiTroImpl
 * @see org.oep.cmon.dao.nsd.model.impl.NguoiDung2VaiTroModelImpl
 * @generated
 */
public interface NguoiDung2VaiTroModel extends BaseModel<NguoiDung2VaiTro> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nguoi dung2 vai tro model instance should use the {@link NguoiDung2VaiTro} interface instead.
	 */

	/**
	 * Returns the primary key of this nguoi dung2 vai tro.
	 *
	 * @return the primary key of this nguoi dung2 vai tro
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nguoi dung2 vai tro.
	 *
	 * @param primaryKey the primary key of this nguoi dung2 vai tro
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this nguoi dung2 vai tro.
	 *
	 * @return the ID of this nguoi dung2 vai tro
	 */
	public long getId();

	/**
	 * Sets the ID of this nguoi dung2 vai tro.
	 *
	 * @param id the ID of this nguoi dung2 vai tro
	 */
	public void setId(long id);

	/**
	 * Returns the vai tro ID of this nguoi dung2 vai tro.
	 *
	 * @return the vai tro ID of this nguoi dung2 vai tro
	 */
	public Long getVaiTroId();

	/**
	 * Sets the vai tro ID of this nguoi dung2 vai tro.
	 *
	 * @param vaiTroId the vai tro ID of this nguoi dung2 vai tro
	 */
	public void setVaiTroId(Long vaiTroId);

	/**
	 * Returns the tai khoan nguoi dung ID of this nguoi dung2 vai tro.
	 *
	 * @return the tai khoan nguoi dung ID of this nguoi dung2 vai tro
	 */
	public Long getTaiKhoanNguoiDungId();

	/**
	 * Sets the tai khoan nguoi dung ID of this nguoi dung2 vai tro.
	 *
	 * @param taiKhoanNguoiDungId the tai khoan nguoi dung ID of this nguoi dung2 vai tro
	 */
	public void setTaiKhoanNguoiDungId(Long taiKhoanNguoiDungId);

	/**
	 * Returns the ngay tao of this nguoi dung2 vai tro.
	 *
	 * @return the ngay tao of this nguoi dung2 vai tro
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this nguoi dung2 vai tro.
	 *
	 * @param ngayTao the ngay tao of this nguoi dung2 vai tro
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this nguoi dung2 vai tro.
	 *
	 * @return the nguoi tao of this nguoi dung2 vai tro
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this nguoi dung2 vai tro.
	 *
	 * @param nguoiTao the nguoi tao of this nguoi dung2 vai tro
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the da xoa of this nguoi dung2 vai tro.
	 *
	 * @return the da xoa of this nguoi dung2 vai tro
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this nguoi dung2 vai tro.
	 *
	 * @param daXoa the da xoa of this nguoi dung2 vai tro
	 */
	public void setDaXoa(int daXoa);

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

	public int compareTo(NguoiDung2VaiTro nguoiDung2VaiTro);

	public int hashCode();

	public CacheModel<NguoiDung2VaiTro> toCacheModel();

	public NguoiDung2VaiTro toEscapedModel();

	public String toString();

	public String toXmlString();
}