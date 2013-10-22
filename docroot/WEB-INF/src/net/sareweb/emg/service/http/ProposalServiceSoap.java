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

package net.sareweb.emg.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import net.sareweb.emg.service.ProposalServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link net.sareweb.emg.service.ProposalServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link net.sareweb.emg.model.ProposalSoap}.
 * If the method in the service utility returns a
 * {@link net.sareweb.emg.model.Proposal}, that is translated to a
 * {@link net.sareweb.emg.model.ProposalSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author A.Galdos
 * @see ProposalServiceHttp
 * @see net.sareweb.emg.model.ProposalSoap
 * @see net.sareweb.emg.service.ProposalServiceUtil
 * @generated
 */
public class ProposalServiceSoap {
	public static net.sareweb.emg.model.ProposalSoap addProposal(long drawId,
		java.lang.String emailAddress, int number1, int number2, int number3,
		int number4, int number5, int star1, int star2)
		throws RemoteException {
		try {
			net.sareweb.emg.model.Proposal returnValue = ProposalServiceUtil.addProposal(drawId,
					emailAddress, number1, number2, number3, number4, number5,
					star1, star2);

			return net.sareweb.emg.model.ProposalSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static net.sareweb.emg.model.ProposalSoap[] getStatisticalProposalNewerThanDate(
		long date) throws RemoteException {
		try {
			java.util.List<net.sareweb.emg.model.Proposal> returnValue = ProposalServiceUtil.getStatisticalProposalNewerThanDate(date);

			return net.sareweb.emg.model.ProposalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ProposalServiceSoap.class);
}