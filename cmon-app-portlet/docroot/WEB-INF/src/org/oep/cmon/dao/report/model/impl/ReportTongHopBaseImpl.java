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

import org.oep.cmon.dao.report.model.ReportTongHop;
import org.oep.cmon.dao.report.service.ReportTongHopLocalServiceUtil;

/**
 * The extended model base implementation for the ReportTongHop service. Represents a row in the &quot;CMON_RPTONGHOP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ReportTongHopImpl}.
 * </p>
 *
 * @author VIENPN
 * @see ReportTongHopImpl
 * @see org.oep.cmon.dao.report.model.ReportTongHop
 * @generated
 */
public abstract class ReportTongHopBaseImpl extends ReportTongHopModelImpl
	implements ReportTongHop {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a report tong hop model instance should use the {@link ReportTongHop} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			ReportTongHopLocalServiceUtil.addReportTongHop(this);
		}
		else {
			ReportTongHopLocalServiceUtil.updateReportTongHop(this);
		}
	}
}