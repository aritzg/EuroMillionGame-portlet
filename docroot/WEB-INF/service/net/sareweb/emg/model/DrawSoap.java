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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.emg.service.http.DrawServiceSoap}.
 *
 * @author A.Galdos
 * @see net.sareweb.emg.service.http.DrawServiceSoap
 * @generated
 */
public class DrawSoap implements Serializable {
	public static DrawSoap toSoapModel(Draw model) {
		DrawSoap soapModel = new DrawSoap();

		soapModel.setDrawId(model.getDrawId());
		soapModel.setNumber1(model.getNumber1());
		soapModel.setNumber2(model.getNumber2());
		soapModel.setNumber3(model.getNumber3());
		soapModel.setNumber4(model.getNumber4());
		soapModel.setNumber5(model.getNumber5());
		soapModel.setStar1(model.getStar1());
		soapModel.setStar2(model.getStar2());
		soapModel.setNumber1Guess(model.getNumber1Guess());
		soapModel.setNumber2Guess(model.getNumber2Guess());
		soapModel.setNumber3Guess(model.getNumber3Guess());
		soapModel.setNumber4Guess(model.getNumber4Guess());
		soapModel.setNumber5Guess(model.getNumber5Guess());
		soapModel.setStar1Guess(model.getStar1Guess());
		soapModel.setStar2Guess(model.getStar2Guess());
		soapModel.setDrawDate(model.getDrawDate());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static DrawSoap[] toSoapModels(Draw[] models) {
		DrawSoap[] soapModels = new DrawSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DrawSoap[][] toSoapModels(Draw[][] models) {
		DrawSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DrawSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DrawSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DrawSoap[] toSoapModels(List<Draw> models) {
		List<DrawSoap> soapModels = new ArrayList<DrawSoap>(models.size());

		for (Draw model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DrawSoap[soapModels.size()]);
	}

	public DrawSoap() {
	}

	public long getPrimaryKey() {
		return _drawId;
	}

	public void setPrimaryKey(long pk) {
		setDrawId(pk);
	}

	public long getDrawId() {
		return _drawId;
	}

	public void setDrawId(long drawId) {
		_drawId = drawId;
	}

	public int getNumber1() {
		return _number1;
	}

	public void setNumber1(int number1) {
		_number1 = number1;
	}

	public int getNumber2() {
		return _number2;
	}

	public void setNumber2(int number2) {
		_number2 = number2;
	}

	public int getNumber3() {
		return _number3;
	}

	public void setNumber3(int number3) {
		_number3 = number3;
	}

	public int getNumber4() {
		return _number4;
	}

	public void setNumber4(int number4) {
		_number4 = number4;
	}

	public int getNumber5() {
		return _number5;
	}

	public void setNumber5(int number5) {
		_number5 = number5;
	}

	public int getStar1() {
		return _star1;
	}

	public void setStar1(int star1) {
		_star1 = star1;
	}

	public int getStar2() {
		return _star2;
	}

	public void setStar2(int star2) {
		_star2 = star2;
	}

	public int getNumber1Guess() {
		return _number1Guess;
	}

	public void setNumber1Guess(int number1Guess) {
		_number1Guess = number1Guess;
	}

	public int getNumber2Guess() {
		return _number2Guess;
	}

	public void setNumber2Guess(int number2Guess) {
		_number2Guess = number2Guess;
	}

	public int getNumber3Guess() {
		return _number3Guess;
	}

	public void setNumber3Guess(int number3Guess) {
		_number3Guess = number3Guess;
	}

	public int getNumber4Guess() {
		return _number4Guess;
	}

	public void setNumber4Guess(int number4Guess) {
		_number4Guess = number4Guess;
	}

	public int getNumber5Guess() {
		return _number5Guess;
	}

	public void setNumber5Guess(int number5Guess) {
		_number5Guess = number5Guess;
	}

	public int getStar1Guess() {
		return _star1Guess;
	}

	public void setStar1Guess(int star1Guess) {
		_star1Guess = star1Guess;
	}

	public int getStar2Guess() {
		return _star2Guess;
	}

	public void setStar2Guess(int star2Guess) {
		_star2Guess = star2Guess;
	}

	public Date getDrawDate() {
		return _drawDate;
	}

	public void setDrawDate(Date drawDate) {
		_drawDate = drawDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
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
}