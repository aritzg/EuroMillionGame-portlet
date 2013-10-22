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

package net.sareweb.emg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.sareweb.emg.model.GoogleDevice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GoogleDevice in entity cache.
 *
 * @author A.Galdos
 * @see GoogleDevice
 * @generated
 */
public class GoogleDeviceCacheModel implements CacheModel<GoogleDevice>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{googleDeviceId=");
		sb.append(googleDeviceId);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", registrationId=");
		sb.append(registrationId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GoogleDevice toEntityModel() {
		GoogleDeviceImpl googleDeviceImpl = new GoogleDeviceImpl();

		googleDeviceImpl.setGoogleDeviceId(googleDeviceId);

		if (emailAddress == null) {
			googleDeviceImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			googleDeviceImpl.setEmailAddress(emailAddress);
		}

		if (registrationId == null) {
			googleDeviceImpl.setRegistrationId(StringPool.BLANK);
		}
		else {
			googleDeviceImpl.setRegistrationId(registrationId);
		}

		if (createDate == Long.MIN_VALUE) {
			googleDeviceImpl.setCreateDate(null);
		}
		else {
			googleDeviceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			googleDeviceImpl.setModifiedDate(null);
		}
		else {
			googleDeviceImpl.setModifiedDate(new Date(modifiedDate));
		}

		googleDeviceImpl.resetOriginalValues();

		return googleDeviceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		googleDeviceId = objectInput.readLong();
		emailAddress = objectInput.readUTF();
		registrationId = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(googleDeviceId);

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (registrationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationId);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long googleDeviceId;
	public String emailAddress;
	public String registrationId;
	public long createDate;
	public long modifiedDate;
}