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

import org.oep.cmon.dao.report.service.persistence.ReportThongKePK;

import java.io.Serializable;

/**
 * The base model interface for the ReportThongKe service. Represents a row in the &quot;CMON_RPTHONGKE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.report.model.impl.ReportThongKeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.report.model.impl.ReportThongKeImpl}.
 * </p>
 *
 * @author VIENPN
 * @see ReportThongKe
 * @see org.oep.cmon.dao.report.model.impl.ReportThongKeImpl
 * @see org.oep.cmon.dao.report.model.impl.ReportThongKeModelImpl
 * @generated
 */
public interface ReportThongKeModel extends BaseModel<ReportThongKe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a report thong ke model instance should use the {@link ReportThongKe} interface instead.
	 */

	/**
	 * Returns the primary key of this report thong ke.
	 *
	 * @return the primary key of this report thong ke
	 */
	public ReportThongKePK getPrimaryKey();

	/**
	 * Sets the primary key of this report thong ke.
	 *
	 * @param primaryKey the primary key of this report thong ke
	 */
	public void setPrimaryKey(ReportThongKePK primaryKey);

	/**
	 * Returns the c a p c o q u a n q u a n l y i d of this report thong ke.
	 *
	 * @return the c a p c o q u a n q u a n l y i d of this report thong ke
	 */
	public long getCAPCOQUANQUANLYID();

	/**
	 * Sets the c a p c o q u a n q u a n l y i d of this report thong ke.
	 *
	 * @param CAPCOQUANQUANLYID the c a p c o q u a n q u a n l y i d of this report thong ke
	 */
	public void setCAPCOQUANQUANLYID(long CAPCOQUANQUANLYID);

	/**
	 * Returns the c o q u a n q u a n l y i d of this report thong ke.
	 *
	 * @return the c o q u a n q u a n l y i d of this report thong ke
	 */
	public long getCOQUANQUANLYID();

	/**
	 * Sets the c o q u a n q u a n l y i d of this report thong ke.
	 *
	 * @param COQUANQUANLYID the c o q u a n q u a n l y i d of this report thong ke
	 */
	public void setCOQUANQUANLYID(long COQUANQUANLYID);

	/**
	 * Returns the t h a n g of this report thong ke.
	 *
	 * @return the t h a n g of this report thong ke
	 */
	public int getTHANG();

	/**
	 * Sets the t h a n g of this report thong ke.
	 *
	 * @param THANG the t h a n g of this report thong ke
	 */
	public void setTHANG(int THANG);

	/**
	 * Returns the n a m of this report thong ke.
	 *
	 * @return the n a m of this report thong ke
	 */
	public int getNAM();

	/**
	 * Sets the n a m of this report thong ke.
	 *
	 * @param NAM the n a m of this report thong ke
	 */
	public void setNAM(int NAM);

	/**
	 * Returns the t o n g n h a n of this report thong ke.
	 *
	 * @return the t o n g n h a n of this report thong ke
	 */
	public long getTONGNHAN();

	/**
	 * Sets the t o n g n h a n of this report thong ke.
	 *
	 * @param TONGNHAN the t o n g n h a n of this report thong ke
	 */
	public void setTONGNHAN(long TONGNHAN);

	/**
	 * Returns the t i e p n h a n of this report thong ke.
	 *
	 * @return the t i e p n h a n of this report thong ke
	 */
	public long getTIEPNHAN();

	/**
	 * Sets the t i e p n h a n of this report thong ke.
	 *
	 * @param TIEPNHAN the t i e p n h a n of this report thong ke
	 */
	public void setTIEPNHAN(long TIEPNHAN);

	/**
	 * Returns the t o n d a u of this report thong ke.
	 *
	 * @return the t o n d a u of this report thong ke
	 */
	public long getTONDAU();

	/**
	 * Sets the t o n d a u of this report thong ke.
	 *
	 * @param TONDAU the t o n d a u of this report thong ke
	 */
	public void setTONDAU(long TONDAU);

	/**
	 * Returns the t o n g d a g i a i q u y e t of this report thong ke.
	 *
	 * @return the t o n g d a g i a i q u y e t of this report thong ke
	 */
	public long getTONGDAGIAIQUYET();

	/**
	 * Sets the t o n g d a g i a i q u y e t of this report thong ke.
	 *
	 * @param TONGDAGIAIQUYET the t o n g d a g i a i q u y e t of this report thong ke
	 */
	public void setTONGDAGIAIQUYET(long TONGDAGIAIQUYET);

	/**
	 * Returns the s o m of this report thong ke.
	 *
	 * @return the s o m of this report thong ke
	 */
	public long getSOM();

	/**
	 * Sets the s o m of this report thong ke.
	 *
	 * @param SOM the s o m of this report thong ke
	 */
	public void setSOM(long SOM);

	/**
	 * Returns the d u n g of this report thong ke.
	 *
	 * @return the d u n g of this report thong ke
	 */
	public long getDUNG();

	/**
	 * Sets the d u n g of this report thong ke.
	 *
	 * @param DUNG the d u n g of this report thong ke
	 */
	public void setDUNG(long DUNG);

	/**
	 * Returns the t r e of this report thong ke.
	 *
	 * @return the t r e of this report thong ke
	 */
	public long getTRE();

	/**
	 * Sets the t r e of this report thong ke.
	 *
	 * @param TRE the t r e of this report thong ke
	 */
	public void setTRE(long TRE);

	/**
	 * Returns the t o n g d a n g g i a i q u y e t of this report thong ke.
	 *
	 * @return the t o n g d a n g g i a i q u y e t of this report thong ke
	 */
	public long getTONGDANGGIAIQUYET();

	/**
	 * Sets the t o n g d a n g g i a i q u y e t of this report thong ke.
	 *
	 * @param TONGDANGGIAIQUYET the t o n g d a n g g i a i q u y e t of this report thong ke
	 */
	public void setTONGDANGGIAIQUYET(long TONGDANGGIAIQUYET);

	/**
	 * Returns the c h u a d e n h a n of this report thong ke.
	 *
	 * @return the c h u a d e n h a n of this report thong ke
	 */
	public long getCHUADENHAN();

	/**
	 * Sets the c h u a d e n h a n of this report thong ke.
	 *
	 * @param CHUADENHAN the c h u a d e n h a n of this report thong ke
	 */
	public void setCHUADENHAN(long CHUADENHAN);

	/**
	 * Returns the q u a h a n of this report thong ke.
	 *
	 * @return the q u a h a n of this report thong ke
	 */
	public long getQUAHAN();

	/**
	 * Sets the q u a h a n of this report thong ke.
	 *
	 * @param QUAHAN the q u a h a n of this report thong ke
	 */
	public void setQUAHAN(long QUAHAN);

	/**
	 * Returns the r u t h o s o of this report thong ke.
	 *
	 * @return the r u t h o s o of this report thong ke
	 */
	public long getRUTHOSO();

	/**
	 * Sets the r u t h o s o of this report thong ke.
	 *
	 * @param RUTHOSO the r u t h o s o of this report thong ke
	 */
	public void setRUTHOSO(long RUTHOSO);

	/**
	 * Returns the k h o n g h o p l e of this report thong ke.
	 *
	 * @return the k h o n g h o p l e of this report thong ke
	 */
	public long getKHONGHOPLE();

	/**
	 * Sets the k h o n g h o p l e of this report thong ke.
	 *
	 * @param KHONGHOPLE the k h o n g h o p l e of this report thong ke
	 */
	public void setKHONGHOPLE(long KHONGHOPLE);

	/**
	 * Returns the t y l e of this report thong ke.
	 *
	 * @return the t y l e of this report thong ke
	 */
	public double getTYLE();

	/**
	 * Sets the t y l e of this report thong ke.
	 *
	 * @param TYLE the t y l e of this report thong ke
	 */
	public void setTYLE(double TYLE);

	/**
	 * Returns the t o n c u o i of this report thong ke.
	 *
	 * @return the t o n c u o i of this report thong ke
	 */
	public long getTONCUOI();

	/**
	 * Sets the t o n c u o i of this report thong ke.
	 *
	 * @param TONCUOI the t o n c u o i of this report thong ke
	 */
	public void setTONCUOI(long TONCUOI);

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

	public int compareTo(ReportThongKe reportThongKe);

	public int hashCode();

	public CacheModel<ReportThongKe> toCacheModel();

	public ReportThongKe toEscapedModel();

	public String toString();

	public String toXmlString();
}