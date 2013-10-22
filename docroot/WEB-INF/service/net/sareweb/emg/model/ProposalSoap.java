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
 * This class is used by SOAP remote services, specifically {@link net.sareweb.emg.service.http.ProposalServiceSoap}.
 *
 * @author A.Galdos
 * @see net.sareweb.emg.service.http.ProposalServiceSoap
 * @generated
 */
public class ProposalSoap implements Serializable {
	public static ProposalSoap toSoapModel(Proposal model) {
		ProposalSoap soapModel = new ProposalSoap();

		soapModel.setProposalId(model.getProposalId());
		soapModel.setDrawId(model.getDrawId());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setNumber1(model.getNumber1());
		soapModel.setNumber2(model.getNumber2());
		soapModel.setNumber3(model.getNumber3());
		soapModel.setNumber4(model.getNumber4());
		soapModel.setNumber5(model.getNumber5());
		soapModel.setStar1(model.getStar1());
		soapModel.setStar2(model.getStar2());
		soapModel.setType(model.getType());
		soapModel.setStatisticalPopulation(model.getStatisticalPopulation());
		soapModel.setWinnings(model.getWinnings());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static ProposalSoap[] toSoapModels(Proposal[] models) {
		ProposalSoap[] soapModels = new ProposalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProposalSoap[][] toSoapModels(Proposal[][] models) {
		ProposalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProposalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProposalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProposalSoap[] toSoapModels(List<Proposal> models) {
		List<ProposalSoap> soapModels = new ArrayList<ProposalSoap>(models.size());

		for (Proposal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProposalSoap[soapModels.size()]);
	}

	public ProposalSoap() {
	}

	public long getPrimaryKey() {
		return _proposalId;
	}

	public void setPrimaryKey(long pk) {
		setProposalId(pk);
	}

	public long getProposalId() {
		return _proposalId;
	}

	public void setProposalId(long proposalId) {
		_proposalId = proposalId;
	}

	public long getDrawId() {
		return _drawId;
	}

	public void setDrawId(long drawId) {
		_drawId = drawId;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
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

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public long getStatisticalPopulation() {
		return _statisticalPopulation;
	}

	public void setStatisticalPopulation(long statisticalPopulation) {
		_statisticalPopulation = statisticalPopulation;
	}

	public float getWinnings() {
		return _winnings;
	}

	public void setWinnings(float winnings) {
		_winnings = winnings;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	private long _proposalId;
	private long _drawId;
	private String _emailAddress;
	private int _number1;
	private int _number2;
	private int _number3;
	private int _number4;
	private int _number5;
	private int _star1;
	private int _star2;
	private String _type;
	private long _statisticalPopulation;
	private float _winnings;
	private Date _createDate;
	private Date _modifyDate;
}