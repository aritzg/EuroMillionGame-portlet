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
 * This class is a wrapper for {@link Proposal}.
 * </p>
 *
 * @author A.Galdos
 * @see Proposal
 * @generated
 */
public class ProposalWrapper implements Proposal, ModelWrapper<Proposal> {
	public ProposalWrapper(Proposal proposal) {
		_proposal = proposal;
	}

	@Override
	public Class<?> getModelClass() {
		return Proposal.class;
	}

	@Override
	public String getModelClassName() {
		return Proposal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("proposalId", getProposalId());
		attributes.put("drawId", getDrawId());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("number1", getNumber1());
		attributes.put("number2", getNumber2());
		attributes.put("number3", getNumber3());
		attributes.put("number4", getNumber4());
		attributes.put("number5", getNumber5());
		attributes.put("star1", getStar1());
		attributes.put("star2", getStar2());
		attributes.put("type", getType());
		attributes.put("statisticalPopulation", getStatisticalPopulation());
		attributes.put("winnings", getWinnings());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long proposalId = (Long)attributes.get("proposalId");

		if (proposalId != null) {
			setProposalId(proposalId);
		}

		Long drawId = (Long)attributes.get("drawId");

		if (drawId != null) {
			setDrawId(drawId);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
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

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long statisticalPopulation = (Long)attributes.get(
				"statisticalPopulation");

		if (statisticalPopulation != null) {
			setStatisticalPopulation(statisticalPopulation);
		}

		Float winnings = (Float)attributes.get("winnings");

		if (winnings != null) {
			setWinnings(winnings);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	/**
	* Returns the primary key of this proposal.
	*
	* @return the primary key of this proposal
	*/
	@Override
	public long getPrimaryKey() {
		return _proposal.getPrimaryKey();
	}

	/**
	* Sets the primary key of this proposal.
	*
	* @param primaryKey the primary key of this proposal
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_proposal.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the proposal ID of this proposal.
	*
	* @return the proposal ID of this proposal
	*/
	@Override
	public long getProposalId() {
		return _proposal.getProposalId();
	}

	/**
	* Sets the proposal ID of this proposal.
	*
	* @param proposalId the proposal ID of this proposal
	*/
	@Override
	public void setProposalId(long proposalId) {
		_proposal.setProposalId(proposalId);
	}

	/**
	* Returns the draw ID of this proposal.
	*
	* @return the draw ID of this proposal
	*/
	@Override
	public long getDrawId() {
		return _proposal.getDrawId();
	}

	/**
	* Sets the draw ID of this proposal.
	*
	* @param drawId the draw ID of this proposal
	*/
	@Override
	public void setDrawId(long drawId) {
		_proposal.setDrawId(drawId);
	}

	/**
	* Returns the email address of this proposal.
	*
	* @return the email address of this proposal
	*/
	@Override
	public java.lang.String getEmailAddress() {
		return _proposal.getEmailAddress();
	}

	/**
	* Sets the email address of this proposal.
	*
	* @param emailAddress the email address of this proposal
	*/
	@Override
	public void setEmailAddress(java.lang.String emailAddress) {
		_proposal.setEmailAddress(emailAddress);
	}

	/**
	* Returns the number1 of this proposal.
	*
	* @return the number1 of this proposal
	*/
	@Override
	public int getNumber1() {
		return _proposal.getNumber1();
	}

	/**
	* Sets the number1 of this proposal.
	*
	* @param number1 the number1 of this proposal
	*/
	@Override
	public void setNumber1(int number1) {
		_proposal.setNumber1(number1);
	}

	/**
	* Returns the number2 of this proposal.
	*
	* @return the number2 of this proposal
	*/
	@Override
	public int getNumber2() {
		return _proposal.getNumber2();
	}

	/**
	* Sets the number2 of this proposal.
	*
	* @param number2 the number2 of this proposal
	*/
	@Override
	public void setNumber2(int number2) {
		_proposal.setNumber2(number2);
	}

	/**
	* Returns the number3 of this proposal.
	*
	* @return the number3 of this proposal
	*/
	@Override
	public int getNumber3() {
		return _proposal.getNumber3();
	}

	/**
	* Sets the number3 of this proposal.
	*
	* @param number3 the number3 of this proposal
	*/
	@Override
	public void setNumber3(int number3) {
		_proposal.setNumber3(number3);
	}

	/**
	* Returns the number4 of this proposal.
	*
	* @return the number4 of this proposal
	*/
	@Override
	public int getNumber4() {
		return _proposal.getNumber4();
	}

	/**
	* Sets the number4 of this proposal.
	*
	* @param number4 the number4 of this proposal
	*/
	@Override
	public void setNumber4(int number4) {
		_proposal.setNumber4(number4);
	}

	/**
	* Returns the number5 of this proposal.
	*
	* @return the number5 of this proposal
	*/
	@Override
	public int getNumber5() {
		return _proposal.getNumber5();
	}

	/**
	* Sets the number5 of this proposal.
	*
	* @param number5 the number5 of this proposal
	*/
	@Override
	public void setNumber5(int number5) {
		_proposal.setNumber5(number5);
	}

	/**
	* Returns the star1 of this proposal.
	*
	* @return the star1 of this proposal
	*/
	@Override
	public int getStar1() {
		return _proposal.getStar1();
	}

	/**
	* Sets the star1 of this proposal.
	*
	* @param star1 the star1 of this proposal
	*/
	@Override
	public void setStar1(int star1) {
		_proposal.setStar1(star1);
	}

	/**
	* Returns the star2 of this proposal.
	*
	* @return the star2 of this proposal
	*/
	@Override
	public int getStar2() {
		return _proposal.getStar2();
	}

	/**
	* Sets the star2 of this proposal.
	*
	* @param star2 the star2 of this proposal
	*/
	@Override
	public void setStar2(int star2) {
		_proposal.setStar2(star2);
	}

	/**
	* Returns the type of this proposal.
	*
	* @return the type of this proposal
	*/
	@Override
	public java.lang.String getType() {
		return _proposal.getType();
	}

	/**
	* Sets the type of this proposal.
	*
	* @param type the type of this proposal
	*/
	@Override
	public void setType(java.lang.String type) {
		_proposal.setType(type);
	}

	/**
	* Returns the statistical population of this proposal.
	*
	* @return the statistical population of this proposal
	*/
	@Override
	public long getStatisticalPopulation() {
		return _proposal.getStatisticalPopulation();
	}

	/**
	* Sets the statistical population of this proposal.
	*
	* @param statisticalPopulation the statistical population of this proposal
	*/
	@Override
	public void setStatisticalPopulation(long statisticalPopulation) {
		_proposal.setStatisticalPopulation(statisticalPopulation);
	}

	/**
	* Returns the winnings of this proposal.
	*
	* @return the winnings of this proposal
	*/
	@Override
	public float getWinnings() {
		return _proposal.getWinnings();
	}

	/**
	* Sets the winnings of this proposal.
	*
	* @param winnings the winnings of this proposal
	*/
	@Override
	public void setWinnings(float winnings) {
		_proposal.setWinnings(winnings);
	}

	/**
	* Returns the create date of this proposal.
	*
	* @return the create date of this proposal
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _proposal.getCreateDate();
	}

	/**
	* Sets the create date of this proposal.
	*
	* @param createDate the create date of this proposal
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_proposal.setCreateDate(createDate);
	}

	/**
	* Returns the modify date of this proposal.
	*
	* @return the modify date of this proposal
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _proposal.getModifyDate();
	}

	/**
	* Sets the modify date of this proposal.
	*
	* @param modifyDate the modify date of this proposal
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_proposal.setModifyDate(modifyDate);
	}

	@Override
	public boolean isNew() {
		return _proposal.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_proposal.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _proposal.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_proposal.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _proposal.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _proposal.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_proposal.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _proposal.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_proposal.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_proposal.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_proposal.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProposalWrapper((Proposal)_proposal.clone());
	}

	@Override
	public int compareTo(net.sareweb.emg.model.Proposal proposal) {
		return _proposal.compareTo(proposal);
	}

	@Override
	public int hashCode() {
		return _proposal.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<net.sareweb.emg.model.Proposal> toCacheModel() {
		return _proposal.toCacheModel();
	}

	@Override
	public net.sareweb.emg.model.Proposal toEscapedModel() {
		return new ProposalWrapper(_proposal.toEscapedModel());
	}

	@Override
	public net.sareweb.emg.model.Proposal toUnescapedModel() {
		return new ProposalWrapper(_proposal.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _proposal.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _proposal.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_proposal.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProposalWrapper)) {
			return false;
		}

		ProposalWrapper proposalWrapper = (ProposalWrapper)obj;

		if (Validator.equals(_proposal, proposalWrapper._proposal)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Proposal getWrappedProposal() {
		return _proposal;
	}

	@Override
	public Proposal getWrappedModel() {
		return _proposal;
	}

	@Override
	public void resetOriginalValues() {
		_proposal.resetOriginalValues();
	}

	private Proposal _proposal;
}