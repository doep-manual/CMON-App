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
 * The base model interface for the Baocaochitiet service. Represents a row in the &quot;DNICT_Baocaochitiet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.cmon.dao.report.model.impl.BaocaochitietModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.cmon.dao.report.model.impl.BaocaochitietImpl}.
 * </p>
 *
 * @author VIENPN
 * @see Baocaochitiet
 * @see org.oep.cmon.dao.report.model.impl.BaocaochitietImpl
 * @see org.oep.cmon.dao.report.model.impl.BaocaochitietModelImpl
 * @generated
 */
public interface BaocaochitietModel extends BaseModel<Baocaochitiet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a baocaochitiet model instance should use the {@link Baocaochitiet} interface instead.
	 */

	/**
	 * Returns the primary key of this baocaochitiet.
	 *
	 * @return the primary key of this baocaochitiet
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this baocaochitiet.
	 *
	 * @param primaryKey the primary key of this baocaochitiet
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the l i n h v u c i d of this baocaochitiet.
	 *
	 * @return the l i n h v u c i d of this baocaochitiet
	 */
	public long getLINHVUCID();

	/**
	 * Sets the l i n h v u c i d of this baocaochitiet.
	 *
	 * @param LINHVUCID the l i n h v u c i d of this baocaochitiet
	 */
	public void setLINHVUCID(long LINHVUCID);

	/**
	 * Returns the m a s o h o s o of this baocaochitiet.
	 *
	 * @return the m a s o h o s o of this baocaochitiet
	 */
	@AutoEscape
	public String getMASOHOSO();

	/**
	 * Sets the m a s o h o s o of this baocaochitiet.
	 *
	 * @param MASOHOSO the m a s o h o s o of this baocaochitiet
	 */
	public void setMASOHOSO(String MASOHOSO);

	/**
	 * Returns the t e n of this baocaochitiet.
	 *
	 * @return the t e n of this baocaochitiet
	 */
	@AutoEscape
	public String getTEN();

	/**
	 * Sets the t e n of this baocaochitiet.
	 *
	 * @param TEN the t e n of this baocaochitiet
	 */
	public void setTEN(String TEN);

	/**
	 * Returns the t r a n g t h a i of this baocaochitiet.
	 *
	 * @return the t r a n g t h a i of this baocaochitiet
	 */
	@AutoEscape
	public String getTRANGTHAI();

	/**
	 * Sets the t r a n g t h a i of this baocaochitiet.
	 *
	 * @param TRANGTHAI the t r a n g t h a i of this baocaochitiet
	 */
	public void setTRANGTHAI(String TRANGTHAI);

	/**
	 * Returns the d i a c h i h i e n n a y of this baocaochitiet.
	 *
	 * @return the d i a c h i h i e n n a y of this baocaochitiet
	 */
	@AutoEscape
	public String getDIACHIHIENNAY();

	/**
	 * Sets the d i a c h i h i e n n a y of this baocaochitiet.
	 *
	 * @param DIACHIHIENNAY the d i a c h i h i e n n a y of this baocaochitiet
	 */
	public void setDIACHIHIENNAY(String DIACHIHIENNAY);

	/**
	 * Returns the d i e n t h o a i d i d o n g of this baocaochitiet.
	 *
	 * @return the d i e n t h o a i d i d o n g of this baocaochitiet
	 */
	@AutoEscape
	public String getDIENTHOAIDIDONG();

	/**
	 * Sets the d i e n t h o a i d i d o n g of this baocaochitiet.
	 *
	 * @param DIENTHOAIDIDONG the d i e n t h o a i d i d o n g of this baocaochitiet
	 */
	public void setDIENTHOAIDIDONG(String DIENTHOAIDIDONG);

	/**
	 * Returns the h o t e n n g u o i n o p h o s o of this baocaochitiet.
	 *
	 * @return the h o t e n n g u o i n o p h o s o of this baocaochitiet
	 */
	@AutoEscape
	public String getHOTENNGUOINOPHOSO();

	/**
	 * Sets the h o t e n n g u o i n o p h o s o of this baocaochitiet.
	 *
	 * @param HOTENNGUOINOPHOSO the h o t e n n g u o i n o p h o s o of this baocaochitiet
	 */
	public void setHOTENNGUOINOPHOSO(String HOTENNGUOINOPHOSO);

	/**
	 * Returns the n g u o i d a i d i e n p h a p l u a t of this baocaochitiet.
	 *
	 * @return the n g u o i d a i d i e n p h a p l u a t of this baocaochitiet
	 */
	@AutoEscape
	public String getNGUOIDAIDIENPHAPLUAT();

	/**
	 * Sets the n g u o i d a i d i e n p h a p l u a t of this baocaochitiet.
	 *
	 * @param NGUOIDAIDIENPHAPLUAT the n g u o i d a i d i e n p h a p l u a t of this baocaochitiet
	 */
	public void setNGUOIDAIDIENPHAPLUAT(String NGUOIDAIDIENPHAPLUAT);

	/**
	 * Returns the n g a y n h a n h o s o of this baocaochitiet.
	 *
	 * @return the n g a y n h a n h o s o of this baocaochitiet
	 */
	@AutoEscape
	public String getNGAYNHANHOSO();

	/**
	 * Sets the n g a y n h a n h o s o of this baocaochitiet.
	 *
	 * @param NGAYNHANHOSO the n g a y n h a n h o s o of this baocaochitiet
	 */
	public void setNGAYNHANHOSO(String NGAYNHANHOSO);

	/**
	 * Returns the n g a y t r a k e t q u a of this baocaochitiet.
	 *
	 * @return the n g a y t r a k e t q u a of this baocaochitiet
	 */
	@AutoEscape
	public String getNGAYTRAKETQUA();

	/**
	 * Sets the n g a y t r a k e t q u a of this baocaochitiet.
	 *
	 * @param NGAYTRAKETQUA the n g a y t r a k e t q u a of this baocaochitiet
	 */
	public void setNGAYTRAKETQUA(String NGAYTRAKETQUA);

	/**
	 * Returns the n g a y h e n t r a k e t q u a of this baocaochitiet.
	 *
	 * @return the n g a y h e n t r a k e t q u a of this baocaochitiet
	 */
	@AutoEscape
	public String getNGAYHENTRAKETQUA();

	/**
	 * Sets the n g a y h e n t r a k e t q u a of this baocaochitiet.
	 *
	 * @param NGAYHENTRAKETQUA the n g a y h e n t r a k e t q u a of this baocaochitiet
	 */
	public void setNGAYHENTRAKETQUA(String NGAYHENTRAKETQUA);

	/**
	 * Returns the l i n h v u c of this baocaochitiet.
	 *
	 * @return the l i n h v u c of this baocaochitiet
	 */
	@AutoEscape
	public String getLINHVUC();

	/**
	 * Sets the l i n h v u c of this baocaochitiet.
	 *
	 * @param LINHVUC the l i n h v u c of this baocaochitiet
	 */
	public void setLINHVUC(String LINHVUC);

	/**
	 * Returns the g h i c h u of this baocaochitiet.
	 *
	 * @return the g h i c h u of this baocaochitiet
	 */
	@AutoEscape
	public String getGHICHU();

	/**
	 * Sets the g h i c h u of this baocaochitiet.
	 *
	 * @param GHICHU the g h i c h u of this baocaochitiet
	 */
	public void setGHICHU(String GHICHU);

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

	public int compareTo(Baocaochitiet baocaochitiet);

	public int hashCode();

	public CacheModel<Baocaochitiet> toCacheModel();

	public Baocaochitiet toEscapedModel();

	public String toString();

	public String toXmlString();
}