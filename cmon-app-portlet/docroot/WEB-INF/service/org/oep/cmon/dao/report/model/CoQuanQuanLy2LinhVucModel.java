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

package org.oep.cmon.dao.report.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CoQuanQuanLy2LinhVuc service. Represents a row in the &quot;DNICT_CoQuanQuanLy2LinhVuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.report.model.impl.CoQuanQuanLy2LinhVucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.report.model.impl.CoQuanQuanLy2LinhVucImpl}.
 * </p>
 *
 * @author VIENPN
 * @see CoQuanQuanLy2LinhVuc
 * @see org.oep.cmon.dao.report.model.impl.CoQuanQuanLy2LinhVucImpl
 * @see org.oep.cmon.dao.report.model.impl.CoQuanQuanLy2LinhVucModelImpl
 * @generated
 */
public interface CoQuanQuanLy2LinhVucModel extends BaseModel<CoQuanQuanLy2LinhVuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a co quan quan ly2 linh vuc model instance should use the {@link CoQuanQuanLy2LinhVuc} interface instead.
	 */

	/**
	 * Returns the primary key of this co quan quan ly2 linh vuc.
	 *
	 * @return the primary key of this co quan quan ly2 linh vuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this co quan quan ly2 linh vuc.
	 *
	 * @param primaryKey the primary key of this co quan quan ly2 linh vuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the n h o m t h u t u c h a n h c h i n h i d of this co quan quan ly2 linh vuc.
	 *
	 * @return the n h o m t h u t u c h a n h c h i n h i d of this co quan quan ly2 linh vuc
	 */
	public long getNHOMTHUTUCHANHCHINHID();

	/**
	 * Sets the n h o m t h u t u c h a n h c h i n h i d of this co quan quan ly2 linh vuc.
	 *
	 * @param NHOMTHUTUCHANHCHINHID the n h o m t h u t u c h a n h c h i n h i d of this co quan quan ly2 linh vuc
	 */
	public void setNHOMTHUTUCHANHCHINHID(long NHOMTHUTUCHANHCHINHID);

	/**
	 * Returns the t e n n h o m t t h c of this co quan quan ly2 linh vuc.
	 *
	 * @return the t e n n h o m t t h c of this co quan quan ly2 linh vuc
	 */
	@AutoEscape
	public String getTENNHOMTTHC();

	/**
	 * Sets the t e n n h o m t t h c of this co quan quan ly2 linh vuc.
	 *
	 * @param TENNHOMTTHC the t e n n h o m t t h c of this co quan quan ly2 linh vuc
	 */
	public void setTENNHOMTTHC(String TENNHOMTTHC);

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

	public int compareTo(CoQuanQuanLy2LinhVuc coQuanQuanLy2LinhVuc);

	public int hashCode();

	public CacheModel<CoQuanQuanLy2LinhVuc> toCacheModel();

	public CoQuanQuanLy2LinhVuc toEscapedModel();

	public String toString();

	public String toXmlString();
}