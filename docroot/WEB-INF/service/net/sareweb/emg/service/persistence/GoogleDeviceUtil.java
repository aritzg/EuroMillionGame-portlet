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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.sareweb.emg.model.GoogleDevice;

import java.util.List;

/**
 * The persistence utility for the google device service. This utility wraps {@link GoogleDevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GoogleDevicePersistence
 * @see GoogleDevicePersistenceImpl
 * @generated
 */
public class GoogleDeviceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(GoogleDevice googleDevice) {
		getPersistence().clearCache(googleDevice);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GoogleDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GoogleDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GoogleDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static GoogleDevice update(GoogleDevice googleDevice)
		throws SystemException {
		return getPersistence().update(googleDevice);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static GoogleDevice update(GoogleDevice googleDevice,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(googleDevice, serviceContext);
	}

	/**
	* Returns the google device where registrationId = &#63; or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	*
	* @param registrationId the registration ID
	* @return the matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice findByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence().findByRegistrationId(registrationId);
	}

	/**
	* Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registrationId the registration ID
	* @return the matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice fetchByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRegistrationId(registrationId);
	}

	/**
	* Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registrationId the registration ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice fetchByRegistrationId(
		java.lang.String registrationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegistrationId(registrationId, retrieveFromCache);
	}

	/**
	* Removes the google device where registrationId = &#63; from the database.
	*
	* @param registrationId the registration ID
	* @return the google device that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice removeByRegistrationId(
		java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence().removeByRegistrationId(registrationId);
	}

	/**
	* Returns the number of google devices where registrationId = &#63;.
	*
	* @param registrationId the registration ID
	* @return the number of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegistrationId(java.lang.String registrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegistrationId(registrationId);
	}

	/**
	* Returns all the google devices where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmailAddress(emailAddress);
	}

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
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmailAddress(emailAddress, start, end);
	}

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
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findByEmailAddress(
		java.lang.String emailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmailAddress(emailAddress, start, end,
			orderByComparator);
	}

	/**
	* Returns the first google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice findByEmailAddress_First(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence()
				   .findByEmailAddress_First(emailAddress, orderByComparator);
	}

	/**
	* Returns the first google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice fetchByEmailAddress_First(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmailAddress_First(emailAddress, orderByComparator);
	}

	/**
	* Returns the last google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice findByEmailAddress_Last(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence()
				   .findByEmailAddress_Last(emailAddress, orderByComparator);
	}

	/**
	* Returns the last google device in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching google device, or <code>null</code> if a matching google device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice fetchByEmailAddress_Last(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmailAddress_Last(emailAddress, orderByComparator);
	}

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
	public static net.sareweb.emg.model.GoogleDevice[] findByEmailAddress_PrevAndNext(
		long googleDeviceId, java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence()
				   .findByEmailAddress_PrevAndNext(googleDeviceId,
			emailAddress, orderByComparator);
	}

	/**
	* Removes all the google devices where emailAddress = &#63; from the database.
	*
	* @param emailAddress the email address
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmailAddress(emailAddress);
	}

	/**
	* Returns the number of google devices where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the number of matching google devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmailAddress(emailAddress);
	}

	/**
	* Caches the google device in the entity cache if it is enabled.
	*
	* @param googleDevice the google device
	*/
	public static void cacheResult(
		net.sareweb.emg.model.GoogleDevice googleDevice) {
		getPersistence().cacheResult(googleDevice);
	}

	/**
	* Caches the google devices in the entity cache if it is enabled.
	*
	* @param googleDevices the google devices
	*/
	public static void cacheResult(
		java.util.List<net.sareweb.emg.model.GoogleDevice> googleDevices) {
		getPersistence().cacheResult(googleDevices);
	}

	/**
	* Creates a new google device with the primary key. Does not add the google device to the database.
	*
	* @param googleDeviceId the primary key for the new google device
	* @return the new google device
	*/
	public static net.sareweb.emg.model.GoogleDevice create(long googleDeviceId) {
		return getPersistence().create(googleDeviceId);
	}

	/**
	* Removes the google device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device that was removed
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice remove(long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence().remove(googleDeviceId);
	}

	public static net.sareweb.emg.model.GoogleDevice updateImpl(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(googleDevice);
	}

	/**
	* Returns the google device with the primary key or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device
	* @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice findByPrimaryKey(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchGoogleDeviceException {
		return getPersistence().findByPrimaryKey(googleDeviceId);
	}

	/**
	* Returns the google device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param googleDeviceId the primary key of the google device
	* @return the google device, or <code>null</code> if a google device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.sareweb.emg.model.GoogleDevice fetchByPrimaryKey(
		long googleDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(googleDeviceId);
	}

	/**
	* Returns all the google devices.
	*
	* @return the google devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<net.sareweb.emg.model.GoogleDevice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the google devices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of google devices.
	*
	* @return the number of google devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GoogleDevicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GoogleDevicePersistence)PortletBeanLocatorUtil.locate(net.sareweb.emg.service.ClpSerializer.getServletContextName(),
					GoogleDevicePersistence.class.getName());

			ReferenceRegistry.registerReference(GoogleDeviceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(GoogleDevicePersistence persistence) {
	}

	private static GoogleDevicePersistence _persistence;
}