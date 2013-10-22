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

import net.sareweb.emg.model.Proposal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Proposal in entity cache.
 *
 * @author A.Galdos
 * @see Proposal
 * @generated
 */
public class ProposalCacheModel implements CacheModel<Proposal>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{proposalId=");
		sb.append(proposalId);
		sb.append(", drawId=");
		sb.append(drawId);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", number1=");
		sb.append(number1);
		sb.append(", number2=");
		sb.append(number2);
		sb.append(", number3=");
		sb.append(number3);
		sb.append(", number4=");
		sb.append(number4);
		sb.append(", number5=");
		sb.append(number5);
		sb.append(", star1=");
		sb.append(star1);
		sb.append(", star2=");
		sb.append(star2);
		sb.append(", type=");
		sb.append(type);
		sb.append(", statisticalPopulation=");
		sb.append(statisticalPopulation);
		sb.append(", winnings=");
		sb.append(winnings);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Proposal toEntityModel() {
		ProposalImpl proposalImpl = new ProposalImpl();

		proposalImpl.setProposalId(proposalId);
		proposalImpl.setDrawId(drawId);

		if (emailAddress == null) {
			proposalImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			proposalImpl.setEmailAddress(emailAddress);
		}

		proposalImpl.setNumber1(number1);
		proposalImpl.setNumber2(number2);
		proposalImpl.setNumber3(number3);
		proposalImpl.setNumber4(number4);
		proposalImpl.setNumber5(number5);
		proposalImpl.setStar1(star1);
		proposalImpl.setStar2(star2);

		if (type == null) {
			proposalImpl.setType(StringPool.BLANK);
		}
		else {
			proposalImpl.setType(type);
		}

		proposalImpl.setStatisticalPopulation(statisticalPopulation);
		proposalImpl.setWinnings(winnings);

		if (createDate == Long.MIN_VALUE) {
			proposalImpl.setCreateDate(null);
		}
		else {
			proposalImpl.setCreateDate(new Date(createDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			proposalImpl.setModifyDate(null);
		}
		else {
			proposalImpl.setModifyDate(new Date(modifyDate));
		}

		proposalImpl.resetOriginalValues();

		return proposalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		proposalId = objectInput.readLong();
		drawId = objectInput.readLong();
		emailAddress = objectInput.readUTF();
		number1 = objectInput.readInt();
		number2 = objectInput.readInt();
		number3 = objectInput.readInt();
		number4 = objectInput.readInt();
		number5 = objectInput.readInt();
		star1 = objectInput.readInt();
		star2 = objectInput.readInt();
		type = objectInput.readUTF();
		statisticalPopulation = objectInput.readLong();
		winnings = objectInput.readFloat();
		createDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(proposalId);
		objectOutput.writeLong(drawId);

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeInt(number1);
		objectOutput.writeInt(number2);
		objectOutput.writeInt(number3);
		objectOutput.writeInt(number4);
		objectOutput.writeInt(number5);
		objectOutput.writeInt(star1);
		objectOutput.writeInt(star2);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(statisticalPopulation);
		objectOutput.writeFloat(winnings);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifyDate);
	}

	public long proposalId;
	public long drawId;
	public String emailAddress;
	public int number1;
	public int number2;
	public int number3;
	public int number4;
	public int number5;
	public int star1;
	public int star2;
	public String type;
	public long statisticalPopulation;
	public float winnings;
	public long createDate;
	public long modifyDate;
}