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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    VIENPN
 * @generated
 */
public class Role2NhomTTHCSoap implements Serializable {
	public static Role2NhomTTHCSoap toSoapModel(Role2NhomTTHC model) {
		Role2NhomTTHCSoap soapModel = new Role2NhomTTHCSoap();

		soapModel.setID(model.getID());
		soapModel.setRPDANHMUCROLEID(model.getRPDANHMUCROLEID());
		soapModel.setRPDANHMUCBAOCAOID(model.getRPDANHMUCBAOCAOID());
		soapModel.setNHOMTHUTUCHANHCHINHID(model.getNHOMTHUTUCHANHCHINHID());

		return soapModel;
	}

	public static Role2NhomTTHCSoap[] toSoapModels(Role2NhomTTHC[] models) {
		Role2NhomTTHCSoap[] soapModels = new Role2NhomTTHCSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Role2NhomTTHCSoap[][] toSoapModels(Role2NhomTTHC[][] models) {
		Role2NhomTTHCSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Role2NhomTTHCSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Role2NhomTTHCSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Role2NhomTTHCSoap[] toSoapModels(List<Role2NhomTTHC> models) {
		List<Role2NhomTTHCSoap> soapModels = new ArrayList<Role2NhomTTHCSoap>(models.size());

		for (Role2NhomTTHC model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Role2NhomTTHCSoap[soapModels.size()]);
	}

	public Role2NhomTTHCSoap() {
	}

	public long getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(long pk) {
		setID(pk);
	}

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public long getRPDANHMUCROLEID() {
		return _RPDANHMUCROLEID;
	}

	public void setRPDANHMUCROLEID(long RPDANHMUCROLEID) {
		_RPDANHMUCROLEID = RPDANHMUCROLEID;
	}

	public long getRPDANHMUCBAOCAOID() {
		return _RPDANHMUCBAOCAOID;
	}

	public void setRPDANHMUCBAOCAOID(long RPDANHMUCBAOCAOID) {
		_RPDANHMUCBAOCAOID = RPDANHMUCBAOCAOID;
	}

	public long getNHOMTHUTUCHANHCHINHID() {
		return _NHOMTHUTUCHANHCHINHID;
	}

	public void setNHOMTHUTUCHANHCHINHID(long NHOMTHUTUCHANHCHINHID) {
		_NHOMTHUTUCHANHCHINHID = NHOMTHUTUCHANHCHINHID;
	}

	private long _ID;
	private long _RPDANHMUCROLEID;
	private long _RPDANHMUCBAOCAOID;
	private long _NHOMTHUTUCHANHCHINHID;
}