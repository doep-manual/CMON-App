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
 * The base model interface for the DanhMucRole service. Represents a row in the &quot;CMON_RPDANHMUCROLE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.report.model.impl.DanhMucRoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.report.model.impl.DanhMucRoleImpl}.
 * </p>
 *
 * @author VIENPN
 * @see DanhMucRole
 * @see org.oep.cmon.dao.report.model.impl.DanhMucRoleImpl
 * @see org.oep.cmon.dao.report.model.impl.DanhMucRoleModelImpl
 * @generated
 */
public interface DanhMucRoleModel extends BaseModel<DanhMucRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a danh muc role model instance should use the {@link DanhMucRole} interface instead.
	 */

	/**
	 * Returns the primary key of this danh muc role.
	 *
	 * @return the primary key of this danh muc role
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this danh muc role.
	 *
	 * @param primaryKey the primary key of this danh muc role
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the i d of this danh muc role.
	 *
	 * @return the i d of this danh muc role
	 */
	public long getID();

	/**
	 * Sets the i d of this danh muc role.
	 *
	 * @param ID the i d of this danh muc role
	 */
	public void setID(long ID);

	/**
	 * Returns the n a m e of this danh muc role.
	 *
	 * @return the n a m e of this danh muc role
	 */
	@AutoEscape
	public String getNAME();

	/**
	 * Sets the n a m e of this danh muc role.
	 *
	 * @param NAME the n a m e of this danh muc role
	 */
	public void setNAME(String NAME);

	/**
	 * Returns the o r d e r s of this danh muc role.
	 *
	 * @return the o r d e r s of this danh muc role
	 */
	public int getORDERS();

	/**
	 * Sets the o r d e r s of this danh muc role.
	 *
	 * @param ORDERS the o r d e r s of this danh muc role
	 */
	public void setORDERS(int ORDERS);

	/**
	 * Returns the s t a t u s of this danh muc role.
	 *
	 * @return the s t a t u s of this danh muc role
	 */
	public int getSTATUS();

	/**
	 * Sets the s t a t u s of this danh muc role.
	 *
	 * @param STATUS the s t a t u s of this danh muc role
	 */
	public void setSTATUS(int STATUS);

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

	public int compareTo(DanhMucRole danhMucRole);

	public int hashCode();

	public CacheModel<DanhMucRole> toCacheModel();

	public DanhMucRole toEscapedModel();

	public String toString();

	public String toXmlString();
}