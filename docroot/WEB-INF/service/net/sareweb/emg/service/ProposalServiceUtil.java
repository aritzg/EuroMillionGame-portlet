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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Proposal. This utility wraps
 * {@link net.sareweb.emg.service.impl.ProposalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author A.Galdos
 * @see ProposalService
 * @see net.sareweb.emg.service.base.ProposalServiceBaseImpl
 * @see net.sareweb.emg.service.impl.ProposalServiceImpl
 * @generated
 */
public class ProposalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.sareweb.emg.service.impl.ProposalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static net.sareweb.emg.model.Proposal addProposal(long drawId,
		java.lang.String emailAddress, int number1, int number2, int number3,
		int number4, int number5, int star1, int star2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addProposal(drawId, emailAddress, number1, number2,
			number3, number4, number5, star1, star2);
	}

	public static java.util.List<net.sareweb.emg.model.Proposal> getStatisticalProposalNewerThanDate(
		long date) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatisticalProposalNewerThanDate(date);
	}

	public static void clearService() {
		_service = null;
	}

	public static ProposalService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProposalService.class.getName());

			if (invokableService instanceof ProposalService) {
				_service = (ProposalService)invokableService;
			}
			else {
				_service = new ProposalServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ProposalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProposalService service) {
	}

	private static ProposalService _service;
}