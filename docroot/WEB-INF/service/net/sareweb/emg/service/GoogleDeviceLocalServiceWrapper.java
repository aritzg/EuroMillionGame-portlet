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
 * Provides a wrapper for {@link GoogleDeviceLocalService}.
 *
 * @author A.Galdos
 * @see GoogleDeviceLocalService
 * @generated
 */
public class GoogleDeviceLocalServiceWrapper implements GoogleDeviceLocalService,
	ServiceWrapper<GoogleDeviceLocalService> {
	public GoogleDeviceLocalServiceWrapper(
		GoogleDeviceLocalService googleDeviceLocalService) {
		_googleDeviceLocalService = googleDeviceLocalService;
	}

	/**
	* Adds the google device to the database. Also notifies the appropriate model listeners.
	*
	* @param googleDevice the google device
	* @return the google device that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice addGoogleDevice(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.addGoogleDevice(googleDevice);
	}

	/**
	* Creates a new google device with the primary key. Does not add the google device to the database.
	*
	* @param googleDeviceId the primary key for the new google device
	* @return the new google device
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice createGoogleDevice(
		long googleDeviceId) {
		return _googleDeviceLocalService.createGoogleDevice(googleDeviceId);
	}

	/**
	* Deletes the google device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device that was removed
	* @throws PortalException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice deleteGoogleDevice(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.deleteGoogleDevice(googleDeviceId);
	}

	/**
	* Deletes the google device from the database. Also notifies the appropriate model listeners.
	*
	* @param googleDevice the google device
	* @return the google device that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice deleteGoogleDevice(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.deleteGoogleDevice(googleDevice);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _googleDeviceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public net.sareweb.emg.model.GoogleDevice fetchGoogleDevice(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.fetchGoogleDevice(googleDeviceId);
	}

	/**
	* Returns the google device with the primary key.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device
	* @throws PortalException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice getGoogleDevice(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.getGoogleDevice(googleDeviceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the google devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of google devices
	* @param end the upper bound of the range of google devices (not inclusive)
	* @return the range of google devices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<net.sareweb.emg.model.GoogleDevice> getGoogleDevices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.getGoogleDevices(start, end);
	}

	/**
	* Returns the number of google devices.
	*
	* @return the number of google devices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGoogleDevicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.getGoogleDevicesCount();
	}

	/**
	* Updates the google device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param googleDevice the google device
	* @return the google device that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.GoogleDevice updateGoogleDevice(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _googleDeviceLocalService.updateGoogleDevice(googleDevice);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _googleDeviceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_googleDeviceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _googleDeviceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public GoogleDeviceLocalService getWrappedGoogleDeviceLocalService() {
		return _googleDeviceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGoogleDeviceLocalService(
		GoogleDeviceLocalService googleDeviceLocalService) {
		_googleDeviceLocalService = googleDeviceLocalService;
	}

	@Override
	public GoogleDeviceLocalService getWrappedService() {
		return _googleDeviceLocalService;
	}

	@Override
	public void setWrappedService(
		GoogleDeviceLocalService googleDeviceLocalService) {
		_googleDeviceLocalService = googleDeviceLocalService;
	}

	private GoogleDeviceLocalService _googleDeviceLocalService;
}