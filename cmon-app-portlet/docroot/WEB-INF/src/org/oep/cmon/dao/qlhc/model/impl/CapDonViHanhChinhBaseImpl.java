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

package org.oep.cmon.dao.qlhc.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.cmon.dao.qlhc.model.CapDonViHanhChinh;
import org.oep.cmon.dao.qlhc.service.CapDonViHanhChinhLocalServiceUtil;

/**
 * The extended model base implementation for the CapDonViHanhChinh service. Represents a row in the &quot;CMON_CAPDONVIHANHCHINH&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CapDonViHanhChinhImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see CapDonViHanhChinhImpl
 * @see org.oep.cmon.dao.qlhc.model.CapDonViHanhChinh
 * @generated
 */
public abstract class CapDonViHanhChinhBaseImpl
	extends CapDonViHanhChinhModelImpl implements CapDonViHanhChinh {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cap don vi hanh chinh model instance should use the {@link CapDonViHanhChinh} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			CapDonViHanhChinhLocalServiceUtil.addCapDonViHanhChinh(this);
		}
		else {
			CapDonViHanhChinhLocalServiceUtil.updateCapDonViHanhChinh(this);
		}
	}
}