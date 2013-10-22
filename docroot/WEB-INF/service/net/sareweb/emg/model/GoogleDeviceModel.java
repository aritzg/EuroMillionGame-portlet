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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the GoogleDevice service. Represents a row in the &quot;EuroMillionGame_GoogleDevice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.sareweb.emg.model.impl.GoogleDeviceImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see GoogleDevice
 * @see net.sareweb.emg.model.impl.GoogleDeviceImpl
 * @see net.sareweb.emg.model.impl.GoogleDeviceModelImpl
 * @generated
 */
public interface GoogleDeviceModel extends BaseModel<GoogleDevice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a google device model instance should use the {@link GoogleDevice} interface instead.
	 */

	/**
	 * Returns the primary key of this google device.
	 *
	 * @return the primary key of this google device
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this google device.
	 *
	 * @param primaryKey the primary key of this google device
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the google device ID of this google device.
	 *
	 * @return the google device ID of this google device
	 */
	public long getGoogleDeviceId();

	/**
	 * Sets the google device ID of this google device.
	 *
	 * @param googleDeviceId the google device ID of this google device
	 */
	public void setGoogleDeviceId(long googleDeviceId);

	/**
	 * Returns the email address of this google device.
	 *
	 * @return the email address of this google device
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this google device.
	 *
	 * @param emailAddress the email address of this google device
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the registration ID of this google device.
	 *
	 * @return the registration ID of this google device
	 */
	@AutoEscape
	public String getRegistrationId();

	/**
	 * Sets the registration ID of this google device.
	 *
	 * @param registrationId the registration ID of this google device
	 */
	public void setRegistrationId(String registrationId);

	/**
	 * Returns the create date of this google device.
	 *
	 * @return the create date of this google device
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this google device.
	 *
	 * @param createDate the create date of this google device
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this google device.
	 *
	 * @return the modified date of this google device
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this google device.
	 *
	 * @param modifiedDate the modified date of this google device
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(GoogleDevice googleDevice);

	@Override
	public int hashCode();

	@Override
	public CacheModel<GoogleDevice> toCacheModel();

	@Override
	public GoogleDevice toEscapedModel();

	@Override
	public GoogleDevice toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}