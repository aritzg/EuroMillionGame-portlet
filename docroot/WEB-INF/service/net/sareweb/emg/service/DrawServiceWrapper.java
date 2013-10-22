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
 * Provides a wrapper for {@link DrawService}.
 *
 * @author A.Galdos
 * @see DrawService
 * @generated
 */
public class DrawServiceWrapper implements DrawService,
	ServiceWrapper<DrawService> {
	public DrawServiceWrapper(DrawService drawService) {
		_drawService = drawService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _drawService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_drawService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _drawService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<net.sareweb.emg.model.Draw> getDrawsNewerThanDate(
		long date) throws com.liferay.portal.kernel.exception.SystemException {
		return _drawService.getDrawsNewerThanDate(date);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DrawService getWrappedDrawService() {
		return _drawService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDrawService(DrawService drawService) {
		_drawService = drawService;
	}

	@Override
	public DrawService getWrappedService() {
		return _drawService;
	}

	@Override
	public void setWrappedService(DrawService drawService) {
		_drawService = drawService;
	}

	private DrawService _drawService;
}