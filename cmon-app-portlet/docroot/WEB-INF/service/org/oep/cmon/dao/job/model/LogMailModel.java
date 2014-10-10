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

package org.oep.cmon.dao.job.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LogMail service. Represents a row in the &quot;JOB_LOGMAIL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.job.model.impl.LogMailModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.job.model.impl.LogMailImpl}.
 * </p>
 *
 * @author BinhNT
 * @see LogMail
 * @see org.oep.cmon.dao.job.model.impl.LogMailImpl
 * @see org.oep.cmon.dao.job.model.impl.LogMailModelImpl
 * @generated
 */
public interface LogMailModel extends BaseModel<LogMail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a log mail model instance should use the {@link LogMail} interface instead.
	 */

	/**
	 * Returns the primary key of this log mail.
	 *
	 * @return the primary key of this log mail
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this log mail.
	 *
	 * @param primaryKey the primary key of this log mail
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this log mail.
	 *
	 * @return the ID of this log mail
	 */
	public long getId();

	/**
	 * Sets the ID of this log mail.
	 *
	 * @param id the ID of this log mail
	 */
	public void setId(long id);

	/**
	 * Returns the type of this log mail.
	 *
	 * @return the type of this log mail
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this log mail.
	 *
	 * @param type the type of this log mail
	 */
	public void setType(String type);

	/**
	 * Returns the ho so t t h c cong ID of this log mail.
	 *
	 * @return the ho so t t h c cong ID of this log mail
	 */
	public long getHoSoTTHCCongId();

	/**
	 * Sets the ho so t t h c cong ID of this log mail.
	 *
	 * @param hoSoTTHCCongId the ho so t t h c cong ID of this log mail
	 */
	public void setHoSoTTHCCongId(long hoSoTTHCCongId);

	/**
	 * Returns the create time of this log mail.
	 *
	 * @return the create time of this log mail
	 */
	public Date getCreateTime();

	/**
	 * Sets the create time of this log mail.
	 *
	 * @param createTime the create time of this log mail
	 */
	public void setCreateTime(Date createTime);

	/**
	 * Returns the status of this log mail.
	 *
	 * @return the status of this log mail
	 */
	public int getStatus();

	/**
	 * Sets the status of this log mail.
	 *
	 * @param status the status of this log mail
	 */
	public void setStatus(int status);

	/**
	 * Returns the description of this log mail.
	 *
	 * @return the description of this log mail
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this log mail.
	 *
	 * @param description the description of this log mail
	 */
	public void setDescription(String description);

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

	public int compareTo(LogMail logMail);

	public int hashCode();

	public CacheModel<LogMail> toCacheModel();

	public LogMail toEscapedModel();

	public String toString();

	public String toXmlString();
}