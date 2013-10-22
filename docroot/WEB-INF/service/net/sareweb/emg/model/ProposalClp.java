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
import net.sareweb.emg.service.ProposalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author A.Galdos
 */
public class ProposalClp extends BaseModelImpl<Proposal> implements Proposal {
	public ProposalClp() {
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
	public long getPrimaryKey() {
		return _proposalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProposalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _proposalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getProposalId() {
		return _proposalId;
	}

	@Override
	public void setProposalId(long proposalId) {
		_proposalId = proposalId;

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setProposalId", long.class);

				method.invoke(_proposalRemoteModel, proposalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDrawId() {
		return _drawId;
	}

	@Override
	public void setDrawId(long drawId) {
		_drawId = drawId;

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setDrawId", long.class);

				method.invoke(_proposalRemoteModel, drawId);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailAddress", String.class);

				method.invoke(_proposalRemoteModel, emailAddress);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber1", int.class);

				method.invoke(_proposalRemoteModel, number1);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber2", int.class);

				method.invoke(_proposalRemoteModel, number2);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber3", int.class);

				method.invoke(_proposalRemoteModel, number3);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber4", int.class);

				method.invoke(_proposalRemoteModel, number4);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber5", int.class);

				method.invoke(_proposalRemoteModel, number5);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setStar1", int.class);

				method.invoke(_proposalRemoteModel, star1);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setStar2", int.class);

				method.invoke(_proposalRemoteModel, star2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_proposalRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatisticalPopulation() {
		return _statisticalPopulation;
	}

	@Override
	public void setStatisticalPopulation(long statisticalPopulation) {
		_statisticalPopulation = statisticalPopulation;

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setStatisticalPopulation",
						long.class);

				method.invoke(_proposalRemoteModel, statisticalPopulation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public float getWinnings() {
		return _winnings;
	}

	@Override
	public void setWinnings(float winnings) {
		_winnings = winnings;

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setWinnings", float.class);

				method.invoke(_proposalRemoteModel, winnings);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_proposalRemoteModel, createDate);
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

		if (_proposalRemoteModel != null) {
			try {
				Class<?> clazz = _proposalRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_proposalRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProposalRemoteModel() {
		return _proposalRemoteModel;
	}

	public void setProposalRemoteModel(BaseModel<?> proposalRemoteModel) {
		_proposalRemoteModel = proposalRemoteModel;
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

		Class<?> remoteModelClass = _proposalRemoteModel.getClass();

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

		Object returnValue = method.invoke(_proposalRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProposalLocalServiceUtil.addProposal(this);
		}
		else {
			ProposalLocalServiceUtil.updateProposal(this);
		}
	}

	@Override
	public Proposal toEscapedModel() {
		return (Proposal)ProxyUtil.newProxyInstance(Proposal.class.getClassLoader(),
			new Class[] { Proposal.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProposalClp clone = new ProposalClp();

		clone.setProposalId(getProposalId());
		clone.setDrawId(getDrawId());
		clone.setEmailAddress(getEmailAddress());
		clone.setNumber1(getNumber1());
		clone.setNumber2(getNumber2());
		clone.setNumber3(getNumber3());
		clone.setNumber4(getNumber4());
		clone.setNumber5(getNumber5());
		clone.setStar1(getStar1());
		clone.setStar2(getStar2());
		clone.setType(getType());
		clone.setStatisticalPopulation(getStatisticalPopulation());
		clone.setWinnings(getWinnings());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	@Override
	public int compareTo(Proposal proposal) {
		int value = 0;

		value = DateUtil.compareTo(getModifyDate(), proposal.getModifyDate());

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

		if (!(obj instanceof ProposalClp)) {
			return false;
		}

		ProposalClp proposal = (ProposalClp)obj;

		long primaryKey = proposal.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{proposalId=");
		sb.append(getProposalId());
		sb.append(", drawId=");
		sb.append(getDrawId());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
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
		sb.append(", type=");
		sb.append(getType());
		sb.append(", statisticalPopulation=");
		sb.append(getStatisticalPopulation());
		sb.append(", winnings=");
		sb.append(getWinnings());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("net.sareweb.emg.model.Proposal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>proposalId</column-name><column-value><![CDATA[");
		sb.append(getProposalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>drawId</column-name><column-value><![CDATA[");
		sb.append(getDrawId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
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
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statisticalPopulation</column-name><column-value><![CDATA[");
		sb.append(getStatisticalPopulation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>winnings</column-name><column-value><![CDATA[");
		sb.append(getWinnings());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _proposalRemoteModel;
}