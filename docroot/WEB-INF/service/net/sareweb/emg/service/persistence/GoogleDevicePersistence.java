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

package net.sareweb.emg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.sareweb.emg.model.GoogleDevice;

/**
 * The persistence interface for the google device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GoogleDevicePersistenceImpl
 * @see GoogleDeviceUtil
 * @generated
 */
public interface GoogleDevicePersistence extends BasePersistence<GoogleDevice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GoogleDeviceUtil} to access the google device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the google device where registrationId = &#63; or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	*
	* @param registrationId the registration ID
	* @return the matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice findByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registrationId the registration ID
	* @return the matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice fetchByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registrationId the registration ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice fetchByRegistrationId(
		java.lang.String registrationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the google device where registrationId = &#63; from the database.
	*
	* @param registrationId the registration ID
	* @return the google device that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice removeByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Returns the number of google devices where registrationId = &#63;.
	*
	* @param registrationId the registration ID
	* @return the number of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegistrationId(java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the google devices where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the google devices where emailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emailAddress the email address
	* @param start the lower bound of the range of google devices
	* @param end the upper bound of the range of google devices (not inclusive)
	* @return the range of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the google devices where emailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emailAddress the email address
	* @param start the lower bound of the range of google devices
	* @param end the upper bound of the range of google devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice findByEmailAddress_First(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Returns the first google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice fetchByEmailAddress_First(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice findByEmailAddress_Last(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Returns the last google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice fetchByEmailAddress_Last(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the google devices before and after the current google device in the ordered set where emailAddress = &#63;.
	*
	* @param googleDeviceId the primary key of the current google device
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice[] findByEmailAddress_PrevAndNext(
		long googleDeviceId, java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Removes all the google devices where emailAddress = &#63; from the database.
	*
	* @param emailAddress the email address
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of google devices where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the number of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the google device in the entity cache if it is enabled.
	*
	* @param googleDevice the google device
	*/
	public void cacheResult(net.sareweb.emg.model.GoogleDevice googleDevice);

	/**
	* Caches the google devices in the entity cache if it is enabled.
	*
	* @param googleDevices the google devices
	*/
	public void cacheResult(
		java.util.List<net.sareweb.emg.model.GoogleDevice> googleDevices);

	/**
	* Creates a new google device with the primary key. Does not add the google device to the database.
	*
	* @param googleDeviceId the primary key for the new google device
	* @return the new google device
	*/
	public net.sareweb.emg.model.GoogleDevice create(long googleDeviceId);

	/**
	* Removes the google device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device that was removed
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice remove(long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	public net.sareweb.emg.model.GoogleDevice updateImpl(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the google device with the primary key or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice findByPrimaryKey(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException;

	/**
	* Returns the google device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device, or <code>null</code> if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.GoogleDevice fetchByPrimaryKey(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the google devices.
	*
	* @return the google devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the google devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.GoogleDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of google devices
	* @param end the upper bound of the range of google devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of google devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.GoogleDevice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the google devices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of google devices.
	*
	* @return the number of google devices
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}