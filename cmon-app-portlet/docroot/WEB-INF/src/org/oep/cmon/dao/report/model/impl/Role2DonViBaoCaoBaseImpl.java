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

package org.oep.cmon.dao.report.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.cmon.dao.report.model.Role2DonViBaoCao;
import org.oep.cmon.dao.report.service.Role2DonViBaoCaoLocalServiceUtil;

/**
 * The extended model base implementation for the Role2DonViBaoCao service. Represents a row in the &quot;CMON_RPROLE2DONVIBAOCAO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Role2DonViBaoCaoImpl}.
 * </p>
 *
 * @author VIENPN
 * @see Role2DonViBaoCaoImpl
 * @see org.oep.cmon.dao.report.model.Role2DonViBaoCao
 * @generated
 */
public abstract class Role2DonViBaoCaoBaseImpl extends Role2DonViBaoCaoModelImpl
	implements Role2DonViBaoCao {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a role2 don vi bao cao model instance should use the {@link Role2DonViBaoCao} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			Role2DonViBaoCaoLocalServiceUtil.addRole2DonViBaoCao(this);
		}
		else {
			Role2DonViBaoCaoLocalServiceUtil.updateRole2DonViBaoCao(this);
		}
	}
}