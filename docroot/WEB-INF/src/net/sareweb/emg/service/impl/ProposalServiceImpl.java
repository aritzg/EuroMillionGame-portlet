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

package net.sareweb.emg.service.impl;

import java.util.Date;
import java.util.List;

import net.sareweb.emg.model.Proposal;
import net.sareweb.emg.service.ProposalLocalServiceUtil;
import net.sareweb.emg.service.base.ProposalServiceBaseImpl;
import net.sareweb.emg.util.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the proposal remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link net.sareweb.emg.service.ProposalService} interface.
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author A.Galdos
 * @see net.sareweb.emg.service.base.ProposalServiceBaseImpl
 * @see net.sareweb.emg.service.ProposalServiceUtil
 */
public class ProposalServiceImpl extends ProposalServiceBaseImpl {

	public Proposal addProposal(long drawId, String emailAddress, int number1,
			int number2, int number3, int number4, int number5, int star1,
			int star2) throws SystemException {
		Proposal proposal = ProposalLocalServiceUtil
				.createProposal(CounterLocalServiceUtil.increment());

		proposal.setDrawId(drawId);
		proposal.setEmailAddress(emailAddress);
		proposal.setNumber1(number1);
		proposal.setNumber2(number2);
		proposal.setNumber3(number3);
		proposal.setNumber4(number4);
		proposal.setNumber5(number5);
		proposal.setStar1(star1);
		proposal.setStar2(star2);
		proposal.setType(Constants.PROPOSAL_TYPE_ACTUAL);
		Date currentDate = new Date();
		proposal.setCreateDate(currentDate);
		proposal.setModifyDate(currentDate);

		return ProposalLocalServiceUtil.addProposal(proposal);

	}

	public List<Proposal> getStatisticalProposalNewerThanDate(long date)
			throws SystemException {
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Proposal.class);
		if (date == 0) {
			Criterion dateCr = PropertyFactoryUtil.forName("modifyDate").le(
					new Date());
			dq.add(dateCr);
		} else {
			Criterion dateCr = PropertyFactoryUtil.forName("modifyDate").le(
					new Date(date));
			dq.add(dateCr);
		}
		dq.addOrder(OrderFactoryUtil.desc("createDate"));
		return proposalPersistence.findWithDynamicQuery(dq);
	}
}