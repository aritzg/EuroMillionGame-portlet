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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GoogleDevice}.
 * </p>
 *
 * @author A.Galdos
 * @see GoogleDevice
 * @generated
 */
public class GoogleDeviceWrapper implements GoogleDevice,
	ModelWrapper<GoogleDevice> {
	public GoogleDeviceWrapper(GoogleDevice googleDevice) {
		_googleDevice = googleDevice;
	}

	@Override
	public Class<?> getModelClass() {
		return GoogleDevice.class;
	}

	@Override
	public String getModelClassName() {
		return GoogleDevice.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("googleDeviceId", getGoogleDeviceId());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("registrationId", getRegistrationId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long googleDeviceId = (Long)attributes.get("googleDeviceId");

		if (googleDeviceId != null) {
			setGoogleDeviceId(googleDeviceId);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String registrationId = (String)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this google device.
	*
	* @return the primary key of this google device
	*/
	@Override
	public long getPrimaryKey() {
		return _googleDevice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this google device.
	*
	* @param primaryKey the primary key of this google device
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_googleDevice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the google device ID of this google device.
	*
	* @return the google device ID of this google device
	*/
	@Override
	public long getGoogleDeviceId() {
		return _googleDevice.getGoogleDeviceId();
	}

	/**
	* Sets the google device ID of this google device.
	*
	* @param googleDeviceId the google device ID of this google device
	*/
	@Override
	public void setGoogleDeviceId(long googleDeviceId) {
		_googleDevice.setGoogleDeviceId(googleDeviceId);
	}

	/**
	* Returns the email address of this google device.
	*
	* @return the email address of this google device
	*/
	@Override
	public java.lang.String getEmailAddress() {
		return _googleDevice.getEmailAddress();
	}

	/**
	* Sets the email address of this google device.
	*
	* @param emailAddress the email address of this google device
	*/
	@Override
	public void setEmailAddress(java.lang.String emailAddress) {
		_googleDevice.setEmailAddress(emailAddress);
	}

	/**
	* Returns the registration ID of this google device.
	*
	* @return the registration ID of this google device
	*/
	@Override
	public java.lang.String getRegistrationId() {
		return _googleDevice.getRegistrationId();
	}

	/**
	* Sets the registration ID of this google device.
	*
	* @param registrationId the registration ID of this google device
	*/
	@Override
	public void setRegistrationId(java.lang.String registrationId) {
		_googleDevice.setRegistrationId(registrationId);
	}

	/**
	* Returns the create date of this google device.
	*
	* @return the create date of this google device
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _googleDevice.getCreateDate();
	}

	/**
	* Sets the create date of this google device.
	*
	* @param createDate the create date of this google device
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_googleDevice.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this google device.
	*
	* @return the modified date of this google device
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _googleDevice.getModifiedDate();
	}

	/**
	* Sets the modified date of this google device.
	*
	* @param modifiedDate the modified date of this google device
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_googleDevice.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _googleDevice.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_googleDevice.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _googleDevice.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_googleDevice.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _googleDevice.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _googleDevice.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_googleDevice.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _googleDevice.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_googleDevice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_googleDevice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_googleDevice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GoogleDeviceWrapper((GoogleDevice)_googleDevice.clone());
	}

	@Override
	public int compareTo(net.sareweb.emg.model.GoogleDevice googleDevice) {
		return _googleDevice.compareTo(googleDevice);
	}

	@Override
	public int hashCode() {
		return _googleDevice.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<net.sareweb.emg.model.GoogleDevice> toCacheModel() {
		return _googleDevice.toCacheModel();
	}

	@Override
	public net.sareweb.emg.model.GoogleDevice toEscapedModel() {
		return new GoogleDeviceWrapper(_googleDevice.toEscapedModel());
	}

	@Override
	public net.sareweb.emg.model.GoogleDevice toUnescapedModel() {
		return new GoogleDeviceWrapper(_googleDevice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _googleDevice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _googleDevice.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_googleDevice.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GoogleDeviceWrapper)) {
			return false;
		}

		GoogleDeviceWrapper googleDeviceWrapper = (GoogleDeviceWrapper)obj;

		if (Validator.equals(_googleDevice, googleDeviceWrapper._googleDevice)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GoogleDevice getWrappedGoogleDevice() {
		return _googleDevice;
	}

	@Override
	public GoogleDevice getWrappedModel() {
		return _googleDevice;
	}

	@Override
	public void resetOriginalValues() {
		_googleDevice.resetOriginalValues();
	}

	private GoogleDevice _googleDevice;
}