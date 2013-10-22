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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.sareweb.emg.service.ClpSerializer;
import net.sareweb.emg.service.GoogleDeviceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class GoogleDeviceClp extends BaseModelImpl<GoogleDevice>
	implements GoogleDevice {
	public GoogleDeviceClp() {
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
	public long getPrimaryKey() {
		return _googleDeviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGoogleDeviceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _googleDeviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getGoogleDeviceId() {
		return _googleDeviceId;
	}

	@Override
	public void setGoogleDeviceId(long googleDeviceId) {
		_googleDeviceId = googleDeviceId;

		if (_googleDeviceRemoteModel != null) {
			try {
				Class<?> clazz = _googleDeviceRemoteModel.getClass();

				Method method = clazz.getMethod("setGoogleDeviceId", long.class);

				method.invoke(_googleDeviceRemoteModel, googleDeviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailAddress() {
		return _emailAddress;
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;

		if (_googleDeviceRemoteModel != null) {
			try {
				Class<?> clazz = _googleDeviceRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailAddress", String.class);

				method.invoke(_googleDeviceRemoteModel, emailAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistrationId() {
		return _registrationId;
	}

	@Override
	public void setRegistrationId(String registrationId) {
		_registrationId = registrationId;

		if (_googleDeviceRemoteModel != null) {
			try {
				Class<?> clazz = _googleDeviceRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistrationId",
						String.class);

				method.invoke(_googleDeviceRemoteModel, registrationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_googleDeviceRemoteModel != null) {
			try {
				Class<?> clazz = _googleDeviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_googleDeviceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_googleDeviceRemoteModel != null) {
			try {
				Class<?> clazz = _googleDeviceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_googleDeviceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getGoogleDeviceRemoteModel() {
		return _googleDeviceRemoteModel;
	}

	public void setGoogleDeviceRemoteModel(BaseModel<?> googleDeviceRemoteModel) {
		_googleDeviceRemoteModel = googleDeviceRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _googleDeviceRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_googleDeviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GoogleDeviceLocalServiceUtil.addGoogleDevice(this);
		}
		else {
			GoogleDeviceLocalServiceUtil.updateGoogleDevice(this);
		}
	}

	@Override
	public GoogleDevice toEscapedModel() {
		return (GoogleDevice)ProxyUtil.newProxyInstance(GoogleDevice.class.getClassLoader(),
			new Class[] { GoogleDevice.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GoogleDeviceClp clone = new GoogleDeviceClp();

		clone.setGoogleDeviceId(getGoogleDeviceId());
		clone.setEmailAddress(getEmailAddress());
		clone.setRegistrationId(getRegistrationId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(GoogleDevice googleDevice) {
		long primaryKey = googleDevice.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GoogleDeviceClp)) {
			return false;
		}

		GoogleDeviceClp googleDevice = (GoogleDeviceClp)obj;

		long primaryKey = googleDevice.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{googleDeviceId=");
		sb.append(getGoogleDeviceId());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", registrationId=");
		sb.append(getRegistrationId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.emg.model.GoogleDevice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>googleDeviceId</column-name><column-value><![CDATA[");
		sb.append(getGoogleDeviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationId</column-name><column-value><![CDATA[");
		sb.append(getRegistrationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _googleDeviceId;
	private String _emailAddress;
	private String _registrationId;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _googleDeviceRemoteModel;
}