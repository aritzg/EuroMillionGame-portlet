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
 * This class is a wrapper for {@link Draw}.
 * </p>
 *
 * @author A.Galdos
 * @see Draw
 * @generated
 */
public class DrawWrapper implements Draw, ModelWrapper<Draw> {
	public DrawWrapper(Draw draw) {
		_draw = draw;
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

	/**
	* Returns the primary key of this draw.
	*
	* @return the primary key of this draw
	*/
	@Override
	public long getPrimaryKey() {
		return _draw.getPrimaryKey();
	}

	/**
	* Sets the primary key of this draw.
	*
	* @param primaryKey the primary key of this draw
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_draw.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the draw ID of this draw.
	*
	* @return the draw ID of this draw
	*/
	@Override
	public long getDrawId() {
		return _draw.getDrawId();
	}

	/**
	* Sets the draw ID of this draw.
	*
	* @param drawId the draw ID of this draw
	*/
	@Override
	public void setDrawId(long drawId) {
		_draw.setDrawId(drawId);
	}

	/**
	* Returns the number1 of this draw.
	*
	* @return the number1 of this draw
	*/
	@Override
	public int getNumber1() {
		return _draw.getNumber1();
	}

	/**
	* Sets the number1 of this draw.
	*
	* @param number1 the number1 of this draw
	*/
	@Override
	public void setNumber1(int number1) {
		_draw.setNumber1(number1);
	}

	/**
	* Returns the number2 of this draw.
	*
	* @return the number2 of this draw
	*/
	@Override
	public int getNumber2() {
		return _draw.getNumber2();
	}

	/**
	* Sets the number2 of this draw.
	*
	* @param number2 the number2 of this draw
	*/
	@Override
	public void setNumber2(int number2) {
		_draw.setNumber2(number2);
	}

	/**
	* Returns the number3 of this draw.
	*
	* @return the number3 of this draw
	*/
	@Override
	public int getNumber3() {
		return _draw.getNumber3();
	}

	/**
	* Sets the number3 of this draw.
	*
	* @param number3 the number3 of this draw
	*/
	@Override
	public void setNumber3(int number3) {
		_draw.setNumber3(number3);
	}

	/**
	* Returns the number4 of this draw.
	*
	* @return the number4 of this draw
	*/
	@Override
	public int getNumber4() {
		return _draw.getNumber4();
	}

	/**
	* Sets the number4 of this draw.
	*
	* @param number4 the number4 of this draw
	*/
	@Override
	public void setNumber4(int number4) {
		_draw.setNumber4(number4);
	}

	/**
	* Returns the number5 of this draw.
	*
	* @return the number5 of this draw
	*/
	@Override
	public int getNumber5() {
		return _draw.getNumber5();
	}

	/**
	* Sets the number5 of this draw.
	*
	* @param number5 the number5 of this draw
	*/
	@Override
	public void setNumber5(int number5) {
		_draw.setNumber5(number5);
	}

	/**
	* Returns the star1 of this draw.
	*
	* @return the star1 of this draw
	*/
	@Override
	public int getStar1() {
		return _draw.getStar1();
	}

	/**
	* Sets the star1 of this draw.
	*
	* @param star1 the star1 of this draw
	*/
	@Override
	public void setStar1(int star1) {
		_draw.setStar1(star1);
	}

	/**
	* Returns the star2 of this draw.
	*
	* @return the star2 of this draw
	*/
	@Override
	public int getStar2() {
		return _draw.getStar2();
	}

	/**
	* Sets the star2 of this draw.
	*
	* @param star2 the star2 of this draw
	*/
	@Override
	public void setStar2(int star2) {
		_draw.setStar2(star2);
	}

	/**
	* Returns the number1 guess of this draw.
	*
	* @return the number1 guess of this draw
	*/
	@Override
	public int getNumber1Guess() {
		return _draw.getNumber1Guess();
	}

	/**
	* Sets the number1 guess of this draw.
	*
	* @param number1Guess the number1 guess of this draw
	*/
	@Override
	public void setNumber1Guess(int number1Guess) {
		_draw.setNumber1Guess(number1Guess);
	}

	/**
	* Returns the number2 guess of this draw.
	*
	* @return the number2 guess of this draw
	*/
	@Override
	public int getNumber2Guess() {
		return _draw.getNumber2Guess();
	}

	/**
	* Sets the number2 guess of this draw.
	*
	* @param number2Guess the number2 guess of this draw
	*/
	@Override
	public void setNumber2Guess(int number2Guess) {
		_draw.setNumber2Guess(number2Guess);
	}

	/**
	* Returns the number3 guess of this draw.
	*
	* @return the number3 guess of this draw
	*/
	@Override
	public int getNumber3Guess() {
		return _draw.getNumber3Guess();
	}

	/**
	* Sets the number3 guess of this draw.
	*
	* @param number3Guess the number3 guess of this draw
	*/
	@Override
	public void setNumber3Guess(int number3Guess) {
		_draw.setNumber3Guess(number3Guess);
	}

	/**
	* Returns the number4 guess of this draw.
	*
	* @return the number4 guess of this draw
	*/
	@Override
	public int getNumber4Guess() {
		return _draw.getNumber4Guess();
	}

	/**
	* Sets the number4 guess of this draw.
	*
	* @param number4Guess the number4 guess of this draw
	*/
	@Override
	public void setNumber4Guess(int number4Guess) {
		_draw.setNumber4Guess(number4Guess);
	}

	/**
	* Returns the number5 guess of this draw.
	*
	* @return the number5 guess of this draw
	*/
	@Override
	public int getNumber5Guess() {
		return _draw.getNumber5Guess();
	}

	/**
	* Sets the number5 guess of this draw.
	*
	* @param number5Guess the number5 guess of this draw
	*/
	@Override
	public void setNumber5Guess(int number5Guess) {
		_draw.setNumber5Guess(number5Guess);
	}

	/**
	* Returns the star1 guess of this draw.
	*
	* @return the star1 guess of this draw
	*/
	@Override
	public int getStar1Guess() {
		return _draw.getStar1Guess();
	}

	/**
	* Sets the star1 guess of this draw.
	*
	* @param star1Guess the star1 guess of this draw
	*/
	@Override
	public void setStar1Guess(int star1Guess) {
		_draw.setStar1Guess(star1Guess);
	}

	/**
	* Returns the star2 guess of this draw.
	*
	* @return the star2 guess of this draw
	*/
	@Override
	public int getStar2Guess() {
		return _draw.getStar2Guess();
	}

	/**
	* Sets the star2 guess of this draw.
	*
	* @param star2Guess the star2 guess of this draw
	*/
	@Override
	public void setStar2Guess(int star2Guess) {
		_draw.setStar2Guess(star2Guess);
	}

	/**
	* Returns the draw date of this draw.
	*
	* @return the draw date of this draw
	*/
	@Override
	public java.util.Date getDrawDate() {
		return _draw.getDrawDate();
	}

	/**
	* Sets the draw date of this draw.
	*
	* @param drawDate the draw date of this draw
	*/
	@Override
	public void setDrawDate(java.util.Date drawDate) {
		_draw.setDrawDate(drawDate);
	}

	/**
	* Returns the modify date of this draw.
	*
	* @return the modify date of this draw
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _draw.getModifyDate();
	}

	/**
	* Sets the modify date of this draw.
	*
	* @param modifyDate the modify date of this draw
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_draw.setModifyDate(modifyDate);
	}

	@Override
	public boolean isNew() {
		return _draw.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_draw.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _draw.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_draw.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _draw.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _draw.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_draw.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _draw.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_draw.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_draw.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_draw.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DrawWrapper((Draw)_draw.clone());
	}

	@Override
	public int compareTo(net.sareweb.emg.model.Draw draw) {
		return _draw.compareTo(draw);
	}

	@Override
	public int hashCode() {
		return _draw.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<net.sareweb.emg.model.Draw> toCacheModel() {
		return _draw.toCacheModel();
	}

	@Override
	public net.sareweb.emg.model.Draw toEscapedModel() {
		return new DrawWrapper(_draw.toEscapedModel());
	}

	@Override
	public net.sareweb.emg.model.Draw toUnescapedModel() {
		return new DrawWrapper(_draw.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _draw.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _draw.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_draw.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrawWrapper)) {
			return false;
		}

		DrawWrapper drawWrapper = (DrawWrapper)obj;

		if (Validator.equals(_draw, drawWrapper._draw)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Draw getWrappedDraw() {
		return _draw;
	}

	@Override
	public Draw getWrappedModel() {
		return _draw;
	}

	@Override
	public void resetOriginalValues() {
		_draw.resetOriginalValues();
	}

	private Draw _draw;
}