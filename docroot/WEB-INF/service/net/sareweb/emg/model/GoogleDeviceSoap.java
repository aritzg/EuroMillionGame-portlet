/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package net.sareweb.emg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.sareweb.emg.service.http.GoogleDeviceServiceSoap}.
 *
 * @author A.Galdos
 * @see net.sareweb.emg.service.http.GoogleDeviceServiceSoap
 * @generated
 */
public class GoogleDeviceSoap implements Serializable {
	public static GoogleDeviceSoap toSoapModel(GoogleDevice model) {
		GoogleDeviceSoap soapModel = new GoogleDeviceSoap();

		soapModel.setGoogleDeviceId(model.getGoogleDeviceId());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setRegistrationId(model.getRegistrationId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static GoogleDeviceSoap[] toSoapModels(GoogleDevice[] models) {
		GoogleDeviceSoap[] soapModels = new GoogleDeviceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GoogleDeviceSoap[][] toSoapModels(GoogleDevice[][] models) {
		GoogleDeviceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GoogleDeviceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GoogleDeviceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GoogleDeviceSoap[] toSoapModels(List<GoogleDevice> models) {
		List<GoogleDeviceSoap> soapModels = new ArrayList<GoogleDeviceSoap>(models.size());

		for (GoogleDevice model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GoogleDeviceSoap[soapModels.size()]);
	}

	public GoogleDeviceSoap() {
	}

	public long getPrimaryKey() {
		return _googleDeviceId;
	}

	public void setPrimaryKey(long pk) {
		setGoogleDeviceId(pk);
	}

	public long getGoogleDeviceId() {
		return _googleDeviceId;
	}

	public void setGoogleDeviceId(long googleDeviceId) {
		_googleDeviceId = googleDeviceId;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getRegistrationId() {
		return _registrationId;
	}

	public void setRegistrationId(String registrationId) {
		_registrationId = registrationId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _googleDeviceId;
	private String _emailAddress;
	private String _registrationId;
	private Date _createDate;
	private Date _modifiedDate;
}