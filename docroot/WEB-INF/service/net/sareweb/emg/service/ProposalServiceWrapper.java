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

package net.sareweb.emg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProposalService}.
 *
 * @author A.Galdos
 * @see ProposalService
 * @generated
 */
public class ProposalServiceWrapper implements ProposalService,
	ServiceWrapper<ProposalService> {
	public ProposalServiceWrapper(ProposalService proposalService) {
		_proposalService = proposalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _proposalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_proposalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _proposalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public net.sareweb.emg.model.Proposal addProposal(long drawId,
		java.lang.String emailAddress, int number1, int number2, int number3,
		int number4, int number5, int star1, int star2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _proposalService.addProposal(drawId, emailAddress, number1,
			number2, number3, number4, number5, star1, star2);
	}

	@Override
	public java.util.List<net.sareweb.emg.model.Proposal> getStatisticalProposalNewerThanDate(
		long date) throws com.liferay.portal.kernel.exception.SystemException {
		return _proposalService.getStatisticalProposalNewerThanDate(date);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProposalService getWrappedProposalService() {
		return _proposalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProposalService(ProposalService proposalService) {
		_proposalService = proposalService;
	}

	@Override
	public ProposalService getWrappedService() {
		return _proposalService;
	}

	@Override
	public void setWrappedService(ProposalService proposalService) {
		_proposalService = proposalService;
	}

	private ProposalService _proposalService;
}