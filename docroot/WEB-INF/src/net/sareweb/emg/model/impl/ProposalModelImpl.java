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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.sareweb.emg.model.Proposal;
import net.sareweb.emg.model.ProposalModel;
import net.sareweb.emg.model.ProposalSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Proposal service. Represents a row in the &quot;EuroMillionGame_Proposal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.sareweb.emg.model.ProposalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProposalImpl}.
 * </p>
 *
 * @author A.Galdos
 * @see ProposalImpl
 * @see net.sareweb.emg.model.Proposal
 * @see net.sareweb.emg.model.ProposalModel
 * @generated
 */
@JSON(strict = true)
public class ProposalModelImpl extends BaseModelImpl<Proposal>
	implements ProposalModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a proposal model instance should use the {@link net.sareweb.emg.model.Proposal} interface instead.
	 */
	public static final String TABLE_NAME = "EuroMillionGame_Proposal";
	public static final Object[][] TABLE_COLUMNS = {
			{ "proposalId", Types.BIGINT },
			{ "drawId", Types.BIGINT },
			{ "emailAddress", Types.VARCHAR },
			{ "number1", Types.INTEGER },
			{ "number2", Types.INTEGER },
			{ "number3", Types.INTEGER },
			{ "number4", Types.INTEGER },
			{ "number5", Types.INTEGER },
			{ "star1", Types.INTEGER },
			{ "star2", Types.INTEGER },
			{ "type_", Types.VARCHAR },
			{ "statisticalPopulation", Types.BIGINT },
			{ "winnings", Types.FLOAT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifyDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table EuroMillionGame_Proposal (proposalId LONG not null primary key,drawId LONG,emailAddress VARCHAR(75) null,number1 INTEGER,number2 INTEGER,number3 INTEGER,number4 INTEGER,number5 INTEGER,star1 INTEGER,star2 INTEGER,type_ VARCHAR(75) null,statisticalPopulation LONG,winnings DOUBLE,createDate DATE null,modifyDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table EuroMillionGame_Proposal";
	public static final String ORDER_BY_JPQL = " ORDER BY proposal.modifyDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EuroMillionGame_Proposal.modifyDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.net.sareweb.emg.model.Proposal"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.net.sareweb.emg.model.Proposal"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.net.sareweb.emg.model.Proposal"),
			true);
	public static long DRAWID_COLUMN_BITMASK = 1L;
	public static long MODIFYDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Proposal toModel(ProposalSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Proposal model = new ProposalImpl();

		model.setProposalId(soapModel.getProposalId());
		model.setDrawId(soapModel.getDrawId());
		model.setEmailAddress(soapModel.getEmailAddress());
		model.setNumber1(soapModel.getNumber1());
		model.setNumber2(soapModel.getNumber2());
		model.setNumber3(soapModel.getNumber3());
		model.setNumber4(soapModel.getNumber4());
		model.setNumber5(soapModel.getNumber5());
		model.setStar1(soapModel.getStar1());
		model.setStar2(soapModel.getStar2());
		model.setType(soapModel.getType());
		model.setStatisticalPopulation(soapModel.getStatisticalPopulation());
		model.setWinnings(soapModel.getWinnings());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifyDate(soapModel.getModifyDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Proposal> toModels(ProposalSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Proposal> models = new ArrayList<Proposal>(soapModels.length);

		for (ProposalSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.net.sareweb.emg.model.Proposal"));

	public ProposalModelImpl() {
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

	@JSON
	@Override
	public long getProposalId() {
		return _proposalId;
	}

	@Override
	public void setProposalId(long proposalId) {
		_proposalId = proposalId;
	}

	@JSON
	@Override
	public long getDrawId() {
		return _drawId;
	}

	@Override
	public void setDrawId(long drawId) {
		_columnBitmask |= DRAWID_COLUMN_BITMASK;

		if (!_setOriginalDrawId) {
			_setOriginalDrawId = true;

			_originalDrawId = _drawId;
		}

		_drawId = drawId;
	}

	public long getOriginalDrawId() {
		return _originalDrawId;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public int getNumber1() {
		return _number1;
	}

	@Override
	public void setNumber1(int number1) {
		_number1 = number1;
	}

	@JSON
	@Override
	public int getNumber2() {
		return _number2;
	}

	@Override
	public void setNumber2(int number2) {
		_number2 = number2;
	}

	@JSON
	@Override
	public int getNumber3() {
		return _number3;
	}

	@Override
	public void setNumber3(int number3) {
		_number3 = number3;
	}

	@JSON
	@Override
	public int getNumber4() {
		return _number4;
	}

	@Override
	public void setNumber4(int number4) {
		_number4 = number4;
	}

	@JSON
	@Override
	public int getNumber5() {
		return _number5;
	}

	@Override
	public void setNumber5(int number5) {
		_number5 = number5;
	}

	@JSON
	@Override
	public int getStar1() {
		return _star1;
	}

	@Override
	public void setStar1(int star1) {
		_star1 = star1;
	}

	@JSON
	@Override
	public int getStar2() {
		return _star2;
	}

	@Override
	public void setStar2(int star2) {
		_star2 = star2;
	}

	@JSON
	@Override
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_type = type;
	}

	@JSON
	@Override
	public long getStatisticalPopulation() {
		return _statisticalPopulation;
	}

	@Override
	public void setStatisticalPopulation(long statisticalPopulation) {
		_statisticalPopulation = statisticalPopulation;
	}

	@JSON
	@Override
	public float getWinnings() {
		return _winnings;
	}

	@Override
	public void setWinnings(float winnings) {
		_winnings = winnings;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_columnBitmask = -1L;

		_modifyDate = modifyDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Proposal.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Proposal toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Proposal)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProposalImpl proposalImpl = new ProposalImpl();

		proposalImpl.setProposalId(getProposalId());
		proposalImpl.setDrawId(getDrawId());
		proposalImpl.setEmailAddress(getEmailAddress());
		proposalImpl.setNumber1(getNumber1());
		proposalImpl.setNumber2(getNumber2());
		proposalImpl.setNumber3(getNumber3());
		proposalImpl.setNumber4(getNumber4());
		proposalImpl.setNumber5(getNumber5());
		proposalImpl.setStar1(getStar1());
		proposalImpl.setStar2(getStar2());
		proposalImpl.setType(getType());
		proposalImpl.setStatisticalPopulation(getStatisticalPopulation());
		proposalImpl.setWinnings(getWinnings());
		proposalImpl.setCreateDate(getCreateDate());
		proposalImpl.setModifyDate(getModifyDate());

		proposalImpl.resetOriginalValues();

		return proposalImpl;
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

		if (!(obj instanceof Proposal)) {
			return false;
		}

		Proposal proposal = (Proposal)obj;

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
	public void resetOriginalValues() {
		ProposalModelImpl proposalModelImpl = this;

		proposalModelImpl._originalDrawId = proposalModelImpl._drawId;

		proposalModelImpl._setOriginalDrawId = false;

		proposalModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Proposal> toCacheModel() {
		ProposalCacheModel proposalCacheModel = new ProposalCacheModel();

		proposalCacheModel.proposalId = getProposalId();

		proposalCacheModel.drawId = getDrawId();

		proposalCacheModel.emailAddress = getEmailAddress();

		String emailAddress = proposalCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			proposalCacheModel.emailAddress = null;
		}

		proposalCacheModel.number1 = getNumber1();

		proposalCacheModel.number2 = getNumber2();

		proposalCacheModel.number3 = getNumber3();

		proposalCacheModel.number4 = getNumber4();

		proposalCacheModel.number5 = getNumber5();

		proposalCacheModel.star1 = getStar1();

		proposalCacheModel.star2 = getStar2();

		proposalCacheModel.type = getType();

		String type = proposalCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			proposalCacheModel.type = null;
		}

		proposalCacheModel.statisticalPopulation = getStatisticalPopulation();

		proposalCacheModel.winnings = getWinnings();

		Date createDate = getCreateDate();

		if (createDate != null) {
			proposalCacheModel.createDate = createDate.getTime();
		}
		else {
			proposalCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			proposalCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			proposalCacheModel.modifyDate = Long.MIN_VALUE;
		}

		return proposalCacheModel;
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

	private static ClassLoader _classLoader = Proposal.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Proposal.class
		};
	private long _proposalId;
	private long _drawId;
	private long _originalDrawId;
	private boolean _setOriginalDrawId;
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
	private long _columnBitmask;
	private Proposal _escapedModel;
}