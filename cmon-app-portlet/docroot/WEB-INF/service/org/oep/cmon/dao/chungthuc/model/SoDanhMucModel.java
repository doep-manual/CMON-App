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

package org.oep.cmon.dao.chungthuc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SoDanhMuc service. Represents a row in the &quot;CMON_SODANHMUC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.chungthuc.model.impl.SoDanhMucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.chungthuc.model.impl.SoDanhMucImpl}.
 * </p>
 *
 * @author vietho
 * @see SoDanhMuc
 * @see org.oep.cmon.dao.chungthuc.model.impl.SoDanhMucImpl
 * @see org.oep.cmon.dao.chungthuc.model.impl.SoDanhMucModelImpl
 * @generated
 */
public interface SoDanhMucModel extends BaseModel<SoDanhMuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a so danh muc model instance should use the {@link SoDanhMuc} interface instead.
	 */

	/**
	 * Returns the primary key of this so danh muc.
	 *
	 * @return the primary key of this so danh muc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this so danh muc.
	 *
	 * @param primaryKey the primary key of this so danh muc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this so danh muc.
	 *
	 * @return the ID of this so danh muc
	 */
	public long getId();

	/**
	 * Sets the ID of this so danh muc.
	 *
	 * @param id the ID of this so danh muc
	 */
	public void setId(long id);

	/**
	 * Returns the ten so of this so danh muc.
	 *
	 * @return the ten so of this so danh muc
	 */
	@AutoEscape
	public String getTenSo();

	/**
	 * Sets the ten so of this so danh muc.
	 *
	 * @param tenSo the ten so of this so danh muc
	 */
	public void setTenSo(String tenSo);

	/**
	 * Returns the so so of this so danh muc.
	 *
	 * @return the so so of this so danh muc
	 */
	@AutoEscape
	public String getSoSo();

	/**
	 * Sets the so so of this so danh muc.
	 *
	 * @param soSo the so so of this so danh muc
	 */
	public void setSoSo(String soSo);

	/**
	 * Returns the thu tuc hanh chinh ID of this so danh muc.
	 *
	 * @return the thu tuc hanh chinh ID of this so danh muc
	 */
	public Long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this so danh muc.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this so danh muc
	 */
	public void setThuTucHanhChinhId(Long thuTucHanhChinhId);

	/**
	 * Returns the nam of this so danh muc.
	 *
	 * @return the nam of this so danh muc
	 */
	public Long getNam();

	/**
	 * Sets the nam of this so danh muc.
	 *
	 * @param nam the nam of this so danh muc
	 */
	public void setNam(Long nam);

	/**
	 * Returns the theo quyet dinh of this so danh muc.
	 *
	 * @return the theo quyet dinh of this so danh muc
	 */
	@AutoEscape
	public String getTheoQuyetDinh();

	/**
	 * Sets the theo quyet dinh of this so danh muc.
	 *
	 * @param theoQuyetDinh the theo quyet dinh of this so danh muc
	 */
	public void setTheoQuyetDinh(String theoQuyetDinh);

	/**
	 * Returns the co quan quan li ID of this so danh muc.
	 *
	 * @return the co quan quan li ID of this so danh muc
	 */
	public Long getCoQuanQuanLiId();

	/**
	 * Sets the co quan quan li ID of this so danh muc.
	 *
	 * @param coQuanQuanLiId the co quan quan li ID of this so danh muc
	 */
	public void setCoQuanQuanLiId(Long coQuanQuanLiId);

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

	public int compareTo(SoDanhMuc soDanhMuc);

	public int hashCode();

	public CacheModel<SoDanhMuc> toCacheModel();

	public SoDanhMuc toEscapedModel();

	public String toString();

	public String toXmlString();
}