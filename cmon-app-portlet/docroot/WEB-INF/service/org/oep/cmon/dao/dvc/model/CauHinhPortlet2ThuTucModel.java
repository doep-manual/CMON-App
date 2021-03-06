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

/**
 * The base model interface for the CauHinhPortlet2ThuTuc service. Represents a row in the &quot;CMON_CAUHINHPORTLET2THUTUC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.dvc.model.impl.CauHinhPortlet2ThuTucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.dvc.model.impl.CauHinhPortlet2ThuTucImpl}.
 * </p>
 *
 * @author liemnn
 * @see CauHinhPortlet2ThuTuc
 * @see org.oep.cmon.dao.dvc.model.impl.CauHinhPortlet2ThuTucImpl
 * @see org.oep.cmon.dao.dvc.model.impl.CauHinhPortlet2ThuTucModelImpl
 * @generated
 */
public interface CauHinhPortlet2ThuTucModel extends BaseModel<CauHinhPortlet2ThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cau hinh portlet2 thu tuc model instance should use the {@link CauHinhPortlet2ThuTuc} interface instead.
	 */

	/**
	 * Returns the primary key of this cau hinh portlet2 thu tuc.
	 *
	 * @return the primary key of this cau hinh portlet2 thu tuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cau hinh portlet2 thu tuc.
	 *
	 * @param primaryKey the primary key of this cau hinh portlet2 thu tuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the thu tuc hanh chinh ID of this cau hinh portlet2 thu tuc.
	 *
	 * @return the thu tuc hanh chinh ID of this cau hinh portlet2 thu tuc
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this cau hinh portlet2 thu tuc.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this cau hinh portlet2 thu tuc
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the portlet ID of this cau hinh portlet2 thu tuc.
	 *
	 * @return the portlet ID of this cau hinh portlet2 thu tuc
	 */
	public long getPortletId();

	/**
	 * Sets the portlet ID of this cau hinh portlet2 thu tuc.
	 *
	 * @param portletId the portlet ID of this cau hinh portlet2 thu tuc
	 */
	public void setPortletId(long portletId);

	/**
	 * Returns the portlet name of this cau hinh portlet2 thu tuc.
	 *
	 * @return the portlet name of this cau hinh portlet2 thu tuc
	 */
	@AutoEscape
	public String getPortletName();

	/**
	 * Sets the portlet name of this cau hinh portlet2 thu tuc.
	 *
	 * @param portletName the portlet name of this cau hinh portlet2 thu tuc
	 */
	public void setPortletName(String portletName);

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

	public int compareTo(CauHinhPortlet2ThuTuc cauHinhPortlet2ThuTuc);

	public int hashCode();

	public CacheModel<CauHinhPortlet2ThuTuc> toCacheModel();

	public CauHinhPortlet2ThuTuc toEscapedModel();

	public String toString();

	public String toXmlString();
}