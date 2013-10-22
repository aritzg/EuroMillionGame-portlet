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

package net.sareweb.emg.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.sareweb.emg.service.ClpSerializer;
import net.sareweb.emg.service.DrawLocalServiceUtil;
import net.sareweb.emg.service.DrawServiceUtil;
import net.sareweb.emg.service.GoogleDeviceLocalServiceUtil;
import net.sareweb.emg.service.GoogleDeviceServiceUtil;
import net.sareweb.emg.service.ProposalLocalServiceUtil;
import net.sareweb.emg.service.ProposalServiceUtil;

/**
 * @author A.Galdos
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			DrawLocalServiceUtil.clearService();

			DrawServiceUtil.clearService();
			GoogleDeviceLocalServiceUtil.clearService();

			GoogleDeviceServiceUtil.clearService();
			ProposalLocalServiceUtil.clearService();

			ProposalServiceUtil.clearService();
		}
	}
}