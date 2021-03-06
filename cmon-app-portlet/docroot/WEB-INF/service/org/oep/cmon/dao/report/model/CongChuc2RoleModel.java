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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CongChuc2Role service. Represents a row in the &quot;CMON_RPNGUOIDUNG2ROLE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.report.model.impl.CongChuc2RoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.report.model.impl.CongChuc2RoleImpl}.
 * </p>
 *
 * @author VIENPN
 * @see CongChuc2Role
 * @see org.oep.cmon.dao.report.model.impl.CongChuc2RoleImpl
 * @see org.oep.cmon.dao.report.model.impl.CongChuc2RoleModelImpl
 * @generated
 */
public interface CongChuc2RoleModel extends BaseModel<CongChuc2Role> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cong chuc2 role model instance should use the {@link CongChuc2Role} interface instead.
	 */

	/**
	 * Returns the primary key of this cong chuc2 role.
	 *
	 * @return the primary key of this cong chuc2 role
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cong chuc2 role.
	 *
	 * @param primaryKey the primary key of this cong chuc2 role
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the i d of this cong chuc2 role.
	 *
	 * @return the i d of this cong chuc2 role
	 */
	public long getID();

	/**
	 * Sets the i d of this cong chuc2 role.
	 *
	 * @param ID the i d of this cong chuc2 role
	 */
	public void setID(long ID);

	/**
	 * Returns the c o n g c h u c i d of this cong chuc2 role.
	 *
	 * @return the c o n g c h u c i d of this cong chuc2 role
	 */
	public long getCONGCHUCID();

	/**
	 * Sets the c o n g c h u c i d of this cong chuc2 role.
	 *
	 * @param CONGCHUCID the c o n g c h u c i d of this cong chuc2 role
	 */
	public void setCONGCHUCID(long CONGCHUCID);

	/**
	 * Returns the r p d a n h m u c r o l e i d of this cong chuc2 role.
	 *
	 * @return the r p d a n h m u c r o l e i d of this cong chuc2 role
	 */
	public long getRPDANHMUCROLEID();

	/**
	 * Sets the r p d a n h m u c r o l e i d of this cong chuc2 role.
	 *
	 * @param RPDANHMUCROLEID the r p d a n h m u c r o l e i d of this cong chuc2 role
	 */
	public void setRPDANHMUCROLEID(long RPDANHMUCROLEID);

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

	public int compareTo(CongChuc2Role congChuc2Role);

	public int hashCode();

	public CacheModel<CongChuc2Role> toCacheModel();

	public CongChuc2Role toEscapedModel();

	public String toString();

	public String toXmlString();
}