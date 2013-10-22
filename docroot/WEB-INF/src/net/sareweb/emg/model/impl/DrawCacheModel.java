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
import com.liferay.portal.model.CacheModel;

import net.sareweb.emg.model.Draw;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Draw in entity cache.
 *
 * @author A.Galdos
 * @see Draw
 * @generated
 */
public class DrawCacheModel implements CacheModel<Draw>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{drawId=");
		sb.append(drawId);
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
		sb.append(", number1Guess=");
		sb.append(number1Guess);
		sb.append(", number2Guess=");
		sb.append(number2Guess);
		sb.append(", number3Guess=");
		sb.append(number3Guess);
		sb.append(", number4Guess=");
		sb.append(number4Guess);
		sb.append(", number5Guess=");
		sb.append(number5Guess);
		sb.append(", star1Guess=");
		sb.append(star1Guess);
		sb.append(", star2Guess=");
		sb.append(star2Guess);
		sb.append(", drawDate=");
		sb.append(drawDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Draw toEntityModel() {
		DrawImpl drawImpl = new DrawImpl();

		drawImpl.setDrawId(drawId);
		drawImpl.setNumber1(number1);
		drawImpl.setNumber2(number2);
		drawImpl.setNumber3(number3);
		drawImpl.setNumber4(number4);
		drawImpl.setNumber5(number5);
		drawImpl.setStar1(star1);
		drawImpl.setStar2(star2);
		drawImpl.setNumber1Guess(number1Guess);
		drawImpl.setNumber2Guess(number2Guess);
		drawImpl.setNumber3Guess(number3Guess);
		drawImpl.setNumber4Guess(number4Guess);
		drawImpl.setNumber5Guess(number5Guess);
		drawImpl.setStar1Guess(star1Guess);
		drawImpl.setStar2Guess(star2Guess);

		if (drawDate == Long.MIN_VALUE) {
			drawImpl.setDrawDate(null);
		}
		else {
			drawImpl.setDrawDate(new Date(drawDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			drawImpl.setModifyDate(null);
		}
		else {
			drawImpl.setModifyDate(new Date(modifyDate));
		}

		drawImpl.resetOriginalValues();

		return drawImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		drawId = objectInput.readLong();
		number1 = objectInput.readInt();
		number2 = objectInput.readInt();
		number3 = objectInput.readInt();
		number4 = objectInput.readInt();
		number5 = objectInput.readInt();
		star1 = objectInput.readInt();
		star2 = objectInput.readInt();
		number1Guess = objectInput.readInt();
		number2Guess = objectInput.readInt();
		number3Guess = objectInput.readInt();
		number4Guess = objectInput.readInt();
		number5Guess = objectInput.readInt();
		star1Guess = objectInput.readInt();
		star2Guess = objectInput.readInt();
		drawDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(drawId);
		objectOutput.writeInt(number1);
		objectOutput.writeInt(number2);
		objectOutput.writeInt(number3);
		objectOutput.writeInt(number4);
		objectOutput.writeInt(number5);
		objectOutput.writeInt(star1);
		objectOutput.writeInt(star2);
		objectOutput.writeInt(number1Guess);
		objectOutput.writeInt(number2Guess);
		objectOutput.writeInt(number3Guess);
		objectOutput.writeInt(number4Guess);
		objectOutput.writeInt(number5Guess);
		objectOutput.writeInt(star1Guess);
		objectOutput.writeInt(star2Guess);
		objectOutput.writeLong(drawDate);
		objectOutput.writeLong(modifyDate);
	}

	public long drawId;
	public int number1;
	public int number2;
	public int number3;
	public int number4;
	public int number5;
	public int star1;
	public int star2;
	public int number1Guess;
	public int number2Guess;
	public int number3Guess;
	public int number4Guess;
	public int number5Guess;
	public int star1Guess;
	public int star2Guess;
	public long drawDate;
	public long modifyDate;
}