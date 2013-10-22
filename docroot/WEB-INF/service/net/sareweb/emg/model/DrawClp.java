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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.sareweb.emg.service.ClpSerializer;
import net.sareweb.emg.service.DrawLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class DrawClp extends BaseModelImpl<Draw> implements Draw {
	public DrawClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Draw.class;
	}

	@Override
	public String getModelClassName() {
		return Draw.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _drawId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDrawId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _drawId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("drawId", getDrawId());
		attributes.put("number1", getNumber1());
		attributes.put("number2", getNumber2());
		attributes.put("number3", getNumber3());
		attributes.put("number4", getNumber4());
		attributes.put("number5", getNumber5());
		attributes.put("star1", getStar1());
		attributes.put("star2", getStar2());
		attributes.put("number1Guess", getNumber1Guess());
		attributes.put("number2Guess", getNumber2Guess());
		attributes.put("number3Guess", getNumber3Guess());
		attributes.put("number4Guess", getNumber4Guess());
		attributes.put("number5Guess", getNumber5Guess());
		attributes.put("star1Guess", getStar1Guess());
		attributes.put("star2Guess", getStar2Guess());
		attributes.put("drawDate", getDrawDate());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long drawId = (Long)attributes.get("drawId");

		if (drawId != null) {
			setDrawId(drawId);
		}

		Integer number1 = (Integer)attributes.get("number1");

		if (number1 != null) {
			setNumber1(number1);
		}

		Integer number2 = (Integer)attributes.get("number2");

		if (number2 != null) {
			setNumber2(number2);
		}

		Integer number3 = (Integer)attributes.get("number3");

		if (number3 != null) {
			setNumber3(number3);
		}

		Integer number4 = (Integer)attributes.get("number4");

		if (number4 != null) {
			setNumber4(number4);
		}

		Integer number5 = (Integer)attributes.get("number5");

		if (number5 != null) {
			setNumber5(number5);
		}

		Integer star1 = (Integer)attributes.get("star1");

		if (star1 != null) {
			setStar1(star1);
		}

		Integer star2 = (Integer)attributes.get("star2");

		if (star2 != null) {
			setStar2(star2);
		}

		Integer number1Guess = (Integer)attributes.get("number1Guess");

		if (number1Guess != null) {
			setNumber1Guess(number1Guess);
		}

		Integer number2Guess = (Integer)attributes.get("number2Guess");

		if (number2Guess != null) {
			setNumber2Guess(number2Guess);
		}

		Integer number3Guess = (Integer)attributes.get("number3Guess");

		if (number3Guess != null) {
			setNumber3Guess(number3Guess);
		}

		Integer number4Guess = (Integer)attributes.get("number4Guess");

		if (number4Guess != null) {
			setNumber4Guess(number4Guess);
		}

		Integer number5Guess = (Integer)attributes.get("number5Guess");

		if (number5Guess != null) {
			setNumber5Guess(number5Guess);
		}

		Integer star1Guess = (Integer)attributes.get("star1Guess");

		if (star1Guess != null) {
			setStar1Guess(star1Guess);
		}

		Integer star2Guess = (Integer)attributes.get("star2Guess");

		if (star2Guess != null) {
			setStar2Guess(star2Guess);
		}

		Date drawDate = (Date)attributes.get("drawDate");

		if (drawDate != null) {
			setDrawDate(drawDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	@Override
	public long getDrawId() {
		return _drawId;
	}

	@Override
	public void setDrawId(long drawId) {
		_drawId = drawId;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setDrawId", long.class);

				method.invoke(_drawRemoteModel, drawId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber1() {
		return _number1;
	}

	@Override
	public void setNumber1(int number1) {
		_number1 = number1;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber1", int.class);

				method.invoke(_drawRemoteModel, number1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber2() {
		return _number2;
	}

	@Override
	public void setNumber2(int number2) {
		_number2 = number2;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber2", int.class);

				method.invoke(_drawRemoteModel, number2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber3() {
		return _number3;
	}

	@Override
	public void setNumber3(int number3) {
		_number3 = number3;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber3", int.class);

				method.invoke(_drawRemoteModel, number3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber4() {
		return _number4;
	}

	@Override
	public void setNumber4(int number4) {
		_number4 = number4;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber4", int.class);

				method.invoke(_drawRemoteModel, number4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber5() {
		return _number5;
	}

	@Override
	public void setNumber5(int number5) {
		_number5 = number5;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber5", int.class);

				method.invoke(_drawRemoteModel, number5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStar1() {
		return _star1;
	}

	@Override
	public void setStar1(int star1) {
		_star1 = star1;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setStar1", int.class);

				method.invoke(_drawRemoteModel, star1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStar2() {
		return _star2;
	}

	@Override
	public void setStar2(int star2) {
		_star2 = star2;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setStar2", int.class);

				method.invoke(_drawRemoteModel, star2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber1Guess() {
		return _number1Guess;
	}

	@Override
	public void setNumber1Guess(int number1Guess) {
		_number1Guess = number1Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber1Guess", int.class);

				method.invoke(_drawRemoteModel, number1Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber2Guess() {
		return _number2Guess;
	}

	@Override
	public void setNumber2Guess(int number2Guess) {
		_number2Guess = number2Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber2Guess", int.class);

				method.invoke(_drawRemoteModel, number2Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber3Guess() {
		return _number3Guess;
	}

	@Override
	public void setNumber3Guess(int number3Guess) {
		_number3Guess = number3Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber3Guess", int.class);

				method.invoke(_drawRemoteModel, number3Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber4Guess() {
		return _number4Guess;
	}

	@Override
	public void setNumber4Guess(int number4Guess) {
		_number4Guess = number4Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber4Guess", int.class);

				method.invoke(_drawRemoteModel, number4Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumber5Guess() {
		return _number5Guess;
	}

	@Override
	public void setNumber5Guess(int number5Guess) {
		_number5Guess = number5Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber5Guess", int.class);

				method.invoke(_drawRemoteModel, number5Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStar1Guess() {
		return _star1Guess;
	}

	@Override
	public void setStar1Guess(int star1Guess) {
		_star1Guess = star1Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setStar1Guess", int.class);

				method.invoke(_drawRemoteModel, star1Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStar2Guess() {
		return _star2Guess;
	}

	@Override
	public void setStar2Guess(int star2Guess) {
		_star2Guess = star2Guess;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setStar2Guess", int.class);

				method.invoke(_drawRemoteModel, star2Guess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDrawDate() {
		return _drawDate;
	}

	@Override
	public void setDrawDate(Date drawDate) {
		_drawDate = drawDate;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setDrawDate", Date.class);

				method.invoke(_drawRemoteModel, drawDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;

		if (_drawRemoteModel != null) {
			try {
				Class<?> clazz = _drawRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_drawRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDrawRemoteModel() {
		return _drawRemoteModel;
	}

	public void setDrawRemoteModel(BaseModel<?> drawRemoteModel) {
		_drawRemoteModel = drawRemoteModel;
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

		Class<?> remoteModelClass = _drawRemoteModel.getClass();

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

		Object returnValue = method.invoke(_drawRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DrawLocalServiceUtil.addDraw(this);
		}
		else {
			DrawLocalServiceUtil.updateDraw(this);
		}
	}

	@Override
	public Draw toEscapedModel() {
		return (Draw)ProxyUtil.newProxyInstance(Draw.class.getClassLoader(),
			new Class[] { Draw.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DrawClp clone = new DrawClp();

		clone.setDrawId(getDrawId());
		clone.setNumber1(getNumber1());
		clone.setNumber2(getNumber2());
		clone.setNumber3(getNumber3());
		clone.setNumber4(getNumber4());
		clone.setNumber5(getNumber5());
		clone.setStar1(getStar1());
		clone.setStar2(getStar2());
		clone.setNumber1Guess(getNumber1Guess());
		clone.setNumber2Guess(getNumber2Guess());
		clone.setNumber3Guess(getNumber3Guess());
		clone.setNumber4Guess(getNumber4Guess());
		clone.setNumber5Guess(getNumber5Guess());
		clone.setStar1Guess(getStar1Guess());
		clone.setStar2Guess(getStar2Guess());
		clone.setDrawDate(getDrawDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	@Override
	public int compareTo(Draw draw) {
		int value = 0;

		value = DateUtil.compareTo(getDrawDate(), draw.getDrawDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrawClp)) {
			return false;
		}

		DrawClp draw = (DrawClp)obj;

		long primaryKey = draw.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{drawId=");
		sb.append(getDrawId());
		sb.append(", number1=");
		sb.append(getNumber1());
		sb.append(", number2=");
		sb.append(getNumber2());
		sb.append(", number3=");
		sb.append(getNumber3());
		sb.append(", number4=");
		sb.append(getNumber4());
		sb.append(", number5=");
		sb.append(getNumber5());
		sb.append(", star1=");
		sb.append(getStar1());
		sb.append(", star2=");
		sb.append(getStar2());
		sb.append(", number1Guess=");
		sb.append(getNumber1Guess());
		sb.append(", number2Guess=");
		sb.append(getNumber2Guess());
		sb.append(", number3Guess=");
		sb.append(getNumber3Guess());
		sb.append(", number4Guess=");
		sb.append(getNumber4Guess());
		sb.append(", number5Guess=");
		sb.append(getNumber5Guess());
		sb.append(", star1Guess=");
		sb.append(getStar1Guess());
		sb.append(", star2Guess=");
		sb.append(getStar2Guess());
		sb.append(", drawDate=");
		sb.append(getDrawDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.emg.model.Draw");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>drawId</column-name><column-value><![CDATA[");
		sb.append(getDrawId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number1</column-name><column-value><![CDATA[");
		sb.append(getNumber1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number2</column-name><column-value><![CDATA[");
		sb.append(getNumber2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number3</column-name><column-value><![CDATA[");
		sb.append(getNumber3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number4</column-name><column-value><![CDATA[");
		sb.append(getNumber4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number5</column-name><column-value><![CDATA[");
		sb.append(getNumber5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>star1</column-name><column-value><![CDATA[");
		sb.append(getStar1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>star2</column-name><column-value><![CDATA[");
		sb.append(getStar2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number1Guess</column-name><column-value><![CDATA[");
		sb.append(getNumber1Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number2Guess</column-name><column-value><![CDATA[");
		sb.append(getNumber2Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number3Guess</column-name><column-value><![CDATA[");
		sb.append(getNumber3Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number4Guess</column-name><column-value><![CDATA[");
		sb.append(getNumber4Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number5Guess</column-name><column-value><![CDATA[");
		sb.append(getNumber5Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>star1Guess</column-name><column-value><![CDATA[");
		sb.append(getStar1Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>star2Guess</column-name><column-value><![CDATA[");
		sb.append(getStar2Guess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>drawDate</column-name><column-value><![CDATA[");
		sb.append(getDrawDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _drawId;
	private int _number1;
	private int _number2;
	private int _number3;
	private int _number4;
	private int _number5;
	private int _star1;
	private int _star2;
	private int _number1Guess;
	private int _number2Guess;
	private int _number3Guess;
	private int _number4Guess;
	private int _number5Guess;
	private int _star1Guess;
	private int _star2Guess;
	private Date _drawDate;
	private Date _modifyDate;
	private BaseModel<?> _drawRemoteModel;
}