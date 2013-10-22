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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.sareweb.emg.NoSuchGoogleDeviceException;
import net.sareweb.emg.model.GoogleDevice;
import net.sareweb.emg.model.impl.GoogleDeviceImpl;
import net.sareweb.emg.model.impl.GoogleDeviceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the google device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see GoogleDevicePersistence
 * @see GoogleDeviceUtil
 * @generated
 */
public class GoogleDevicePersistenceImpl extends BasePersistenceImpl<GoogleDevice>
	implements GoogleDevicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GoogleDeviceUtil} to access the google device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GoogleDeviceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, GoogleDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, GoogleDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REGISTRATIONID = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, GoogleDeviceImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRegistrationId",
			new String[] { String.class.getName() },
			GoogleDeviceModelImpl.REGISTRATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTRATIONID = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegistrationId",
			new String[] { String.class.getName() });

	/**
	 * Returns the google device where registrationId = &#63; or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	 *
	 * @param registrationId the registration ID
	 * @return the matching google device
	 * @throws net.sareweb.emg.NoSuchGoogleDeviceException if a matching google device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice findByRegistrationId(String registrationId)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = fetchByRegistrationId(registrationId);

		if (googleDevice == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("registrationId=");
			msg.append(registrationId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchGoogleDeviceException(msg.toString());
		}

		return googleDevice;
	}

	/**
	 * Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registrationId the registration ID
	 * @return the matching google device, or <code>null</code> if a matching google device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByRegistrationId(String registrationId)
		throws SystemException {
		return fetchByRegistrationId(registrationId, true);
	}

	/**
	 * Returns the google device where registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registrationId the registration ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching google device, or <code>null</code> if a matching google device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByRegistrationId(String registrationId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { registrationId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
					finderArgs, this);
		}

		if (result instanceof GoogleDevice) {
			GoogleDevice googleDevice = (GoogleDevice)result;

			if (!Validator.equals(registrationId,
						googleDevice.getRegistrationId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_GOOGLEDEVICE_WHERE);

			boolean bindRegistrationId = false;

			if (registrationId == null) {
				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_1);
			}
			else if (registrationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_3);
			}
			else {
				bindRegistrationId = true;

				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegistrationId) {
					qPos.add(registrationId);
				}

				List<GoogleDevice> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"GoogleDevicePersistenceImpl.fetchByRegistrationId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					GoogleDevice googleDevice = list.get(0);

					result = googleDevice;

					cacheResult(googleDevice);

					if ((googleDevice.getRegistrationId() == null) ||
							!googleDevice.getRegistrationId()
											 .equals(registrationId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
							finderArgs, googleDevice);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (GoogleDevice)result;
		}
	}

	/**
	 * Removes the google device where registrationId = &#63; from the database.
	 *
	 * @param registrationId the registration ID
	 * @return the google device that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice removeByRegistrationId(String registrationId)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = findByRegistrationId(registrationId);

		return remove(googleDevice);
	}

	/**
	 * Returns the number of google devices where registrationId = &#63;.
	 *
	 * @param registrationId the registration ID
	 * @return the number of matching google devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegistrationId(String registrationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTRATIONID;

		Object[] finderArgs = new Object[] { registrationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GOOGLEDEVICE_WHERE);

			boolean bindRegistrationId = false;

			if (registrationId == null) {
				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_1);
			}
			else if (registrationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_3);
			}
			else {
				bindRegistrationId = true;

				query.append(_FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegistrationId) {
					qPos.add(registrationId);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_1 = "googleDevice.registrationId IS NULL";
	private static final String _FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_2 = "googleDevice.registrationId = ?";
	private static final String _FINDER_COLUMN_REGISTRATIONID_REGISTRATIONID_3 = "(googleDevice.registrationId IS NULL OR googleDevice.registrationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAILADDRESS =
		new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, GoogleDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmailAddress",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILADDRESS =
		new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, GoogleDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmailAddress",
			new String[] { String.class.getName() },
			GoogleDeviceModelImpl.EMAILADDRESS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMAILADDRESS = new FinderPath(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmailAddress",
			new String[] { String.class.getName() });

	/**
	 * Returns all the google devices where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @return the matching google devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GoogleDevice> findByEmailAddress(String emailAddress)
		throws SystemException {
		return findByEmailAddress(emailAddress, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<GoogleDevice> findByEmailAddress(String emailAddress,
		int start, int end) throws SystemException {
		return findByEmailAddress(emailAddress, start, end, null);
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
	@Override
	public List<GoogleDevice> findByEmailAddress(String emailAddress,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILADDRESS;
			finderArgs = new Object[] { emailAddress };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAILADDRESS;
			finderArgs = new Object[] {
					emailAddress,
					
					start, end, orderByComparator
				};
		}

		List<GoogleDevice> list = (List<GoogleDevice>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GoogleDevice googleDevice : list) {
				if (!Validator.equals(emailAddress,
							googleDevice.getEmailAddress())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_GOOGLEDEVICE_WHERE);

			boolean bindEmailAddress = false;

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_1);
			}
			else if (emailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_3);
			}
			else {
				bindEmailAddress = true;

				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GoogleDeviceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmailAddress) {
					qPos.add(emailAddress);
				}

				if (!pagination) {
					list = (List<GoogleDevice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GoogleDevice>(list);
				}
				else {
					list = (List<GoogleDevice>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public GoogleDevice findByEmailAddress_First(String emailAddress,
		OrderByComparator orderByComparator)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = fetchByEmailAddress_First(emailAddress,
				orderByComparator);

		if (googleDevice != null) {
			return googleDevice;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emailAddress=");
		msg.append(emailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGoogleDeviceException(msg.toString());
	}

	/**
	 * Returns the first google device in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching google device, or <code>null</code> if a matching google device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByEmailAddress_First(String emailAddress,
		OrderByComparator orderByComparator) throws SystemException {
		List<GoogleDevice> list = findByEmailAddress(emailAddress, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public GoogleDevice findByEmailAddress_Last(String emailAddress,
		OrderByComparator orderByComparator)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = fetchByEmailAddress_Last(emailAddress,
				orderByComparator);

		if (googleDevice != null) {
			return googleDevice;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emailAddress=");
		msg.append(emailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGoogleDeviceException(msg.toString());
	}

	/**
	 * Returns the last google device in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching google device, or <code>null</code> if a matching google device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByEmailAddress_Last(String emailAddress,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByEmailAddress(emailAddress);

		if (count == 0) {
			return null;
		}

		List<GoogleDevice> list = findByEmailAddress(emailAddress, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public GoogleDevice[] findByEmailAddress_PrevAndNext(long googleDeviceId,
		String emailAddress, OrderByComparator orderByComparator)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = findByPrimaryKey(googleDeviceId);

		Session session = null;

		try {
			session = openSession();

			GoogleDevice[] array = new GoogleDeviceImpl[3];

			array[0] = getByEmailAddress_PrevAndNext(session, googleDevice,
					emailAddress, orderByComparator, true);

			array[1] = googleDevice;

			array[2] = getByEmailAddress_PrevAndNext(session, googleDevice,
					emailAddress, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GoogleDevice getByEmailAddress_PrevAndNext(Session session,
		GoogleDevice googleDevice, String emailAddress,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GOOGLEDEVICE_WHERE);

		boolean bindEmailAddress = false;

		if (emailAddress == null) {
			query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_1);
		}
		else if (emailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_3);
		}
		else {
			bindEmailAddress = true;

			query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(GoogleDeviceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmailAddress) {
			qPos.add(emailAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(googleDevice);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GoogleDevice> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the google devices where emailAddress = &#63; from the database.
	 *
	 * @param emailAddress the email address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmailAddress(String emailAddress)
		throws SystemException {
		for (GoogleDevice googleDevice : findByEmailAddress(emailAddress,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(googleDevice);
		}
	}

	/**
	 * Returns the number of google devices where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @return the number of matching google devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmailAddress(String emailAddress)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMAILADDRESS;

		Object[] finderArgs = new Object[] { emailAddress };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GOOGLEDEVICE_WHERE);

			boolean bindEmailAddress = false;

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_1);
			}
			else if (emailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_3);
			}
			else {
				bindEmailAddress = true;

				query.append(_FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmailAddress) {
					qPos.add(emailAddress);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_1 = "googleDevice.emailAddress IS NULL";
	private static final String _FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_2 = "googleDevice.emailAddress = ?";
	private static final String _FINDER_COLUMN_EMAILADDRESS_EMAILADDRESS_3 = "(googleDevice.emailAddress IS NULL OR googleDevice.emailAddress = '')";

	public GoogleDevicePersistenceImpl() {
		setModelClass(GoogleDevice.class);
	}

	/**
	 * Caches the google device in the entity cache if it is enabled.
	 *
	 * @param googleDevice the google device
	 */
	@Override
	public void cacheResult(GoogleDevice googleDevice) {
		EntityCacheUtil.putResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceImpl.class, googleDevice.getPrimaryKey(), googleDevice);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
			new Object[] { googleDevice.getRegistrationId() }, googleDevice);

		googleDevice.resetOriginalValues();
	}

	/**
	 * Caches the google devices in the entity cache if it is enabled.
	 *
	 * @param googleDevices the google devices
	 */
	@Override
	public void cacheResult(List<GoogleDevice> googleDevices) {
		for (GoogleDevice googleDevice : googleDevices) {
			if (EntityCacheUtil.getResult(
						GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
						GoogleDeviceImpl.class, googleDevice.getPrimaryKey()) == null) {
				cacheResult(googleDevice);
			}
			else {
				googleDevice.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all google devices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GoogleDeviceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GoogleDeviceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the google device.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GoogleDevice googleDevice) {
		EntityCacheUtil.removeResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceImpl.class, googleDevice.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(googleDevice);
	}

	@Override
	public void clearCache(List<GoogleDevice> googleDevices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (GoogleDevice googleDevice : googleDevices) {
			EntityCacheUtil.removeResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
				GoogleDeviceImpl.class, googleDevice.getPrimaryKey());

			clearUniqueFindersCache(googleDevice);
		}
	}

	protected void cacheUniqueFindersCache(GoogleDevice googleDevice) {
		if (googleDevice.isNew()) {
			Object[] args = new Object[] { googleDevice.getRegistrationId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTRATIONID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
				args, googleDevice);
		}
		else {
			GoogleDeviceModelImpl googleDeviceModelImpl = (GoogleDeviceModelImpl)googleDevice;

			if ((googleDeviceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REGISTRATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { googleDevice.getRegistrationId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTRATIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
					args, googleDevice);
			}
		}
	}

	protected void clearUniqueFindersCache(GoogleDevice googleDevice) {
		GoogleDeviceModelImpl googleDeviceModelImpl = (GoogleDeviceModelImpl)googleDevice;

		Object[] args = new Object[] { googleDevice.getRegistrationId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTRATIONID, args);

		if ((googleDeviceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGISTRATIONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					googleDeviceModelImpl.getOriginalRegistrationId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTRATIONID,
				args);
		}
	}

	/**
	 * Creates a new google device with the primary key. Does not add the google device to the database.
	 *
	 * @param googleDeviceId the primary key for the new google device
	 * @return the new google device
	 */
	@Override
	public GoogleDevice create(long googleDeviceId) {
		GoogleDevice googleDevice = new GoogleDeviceImpl();

		googleDevice.setNew(true);
		googleDevice.setPrimaryKey(googleDeviceId);

		return googleDevice;
	}

	/**
	 * Removes the google device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param googleDeviceId the primary key of the google device
	 * @return the google device that was removed
	 * @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice remove(long googleDeviceId)
		throws NoSuchGoogleDeviceException, SystemException {
		return remove((Serializable)googleDeviceId);
	}

	/**
	 * Removes the google device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the google device
	 * @return the google device that was removed
	 * @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice remove(Serializable primaryKey)
		throws NoSuchGoogleDeviceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			GoogleDevice googleDevice = (GoogleDevice)session.get(GoogleDeviceImpl.class,
					primaryKey);

			if (googleDevice == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGoogleDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(googleDevice);
		}
		catch (NoSuchGoogleDeviceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected GoogleDevice removeImpl(GoogleDevice googleDevice)
		throws SystemException {
		googleDevice = toUnwrappedModel(googleDevice);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(googleDevice)) {
				googleDevice = (GoogleDevice)session.get(GoogleDeviceImpl.class,
						googleDevice.getPrimaryKeyObj());
			}

			if (googleDevice != null) {
				session.delete(googleDevice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (googleDevice != null) {
			clearCache(googleDevice);
		}

		return googleDevice;
	}

	@Override
	public GoogleDevice updateImpl(
		net.sareweb.emg.model.GoogleDevice googleDevice)
		throws SystemException {
		googleDevice = toUnwrappedModel(googleDevice);

		boolean isNew = googleDevice.isNew();

		GoogleDeviceModelImpl googleDeviceModelImpl = (GoogleDeviceModelImpl)googleDevice;

		Session session = null;

		try {
			session = openSession();

			if (googleDevice.isNew()) {
				session.save(googleDevice);

				googleDevice.setNew(false);
			}
			else {
				session.merge(googleDevice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !GoogleDeviceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((googleDeviceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						googleDeviceModelImpl.getOriginalEmailAddress()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAILADDRESS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILADDRESS,
					args);

				args = new Object[] { googleDeviceModelImpl.getEmailAddress() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMAILADDRESS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILADDRESS,
					args);
			}
		}

		EntityCacheUtil.putResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
			GoogleDeviceImpl.class, googleDevice.getPrimaryKey(), googleDevice);

		clearUniqueFindersCache(googleDevice);
		cacheUniqueFindersCache(googleDevice);

		return googleDevice;
	}

	protected GoogleDevice toUnwrappedModel(GoogleDevice googleDevice) {
		if (googleDevice instanceof GoogleDeviceImpl) {
			return googleDevice;
		}

		GoogleDeviceImpl googleDeviceImpl = new GoogleDeviceImpl();

		googleDeviceImpl.setNew(googleDevice.isNew());
		googleDeviceImpl.setPrimaryKey(googleDevice.getPrimaryKey());

		googleDeviceImpl.setGoogleDeviceId(googleDevice.getGoogleDeviceId());
		googleDeviceImpl.setEmailAddress(googleDevice.getEmailAddress());
		googleDeviceImpl.setRegistrationId(googleDevice.getRegistrationId());
		googleDeviceImpl.setCreateDate(googleDevice.getCreateDate());
		googleDeviceImpl.setModifiedDate(googleDevice.getModifiedDate());

		return googleDeviceImpl;
	}

	/**
	 * Returns the google device with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the google device
	 * @return the google device
	 * @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGoogleDeviceException, SystemException {
		GoogleDevice googleDevice = fetchByPrimaryKey(primaryKey);

		if (googleDevice == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGoogleDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return googleDevice;
	}

	/**
	 * Returns the google device with the primary key or throws a {@link net.sareweb.emg.NoSuchGoogleDeviceException} if it could not be found.
	 *
	 * @param googleDeviceId the primary key of the google device
	 * @return the google device
	 * @throws net.sareweb.emg.NoSuchGoogleDeviceException if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice findByPrimaryKey(long googleDeviceId)
		throws NoSuchGoogleDeviceException, SystemException {
		return findByPrimaryKey((Serializable)googleDeviceId);
	}

	/**
	 * Returns the google device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the google device
	 * @return the google device, or <code>null</code> if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		GoogleDevice googleDevice = (GoogleDevice)EntityCacheUtil.getResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
				GoogleDeviceImpl.class, primaryKey);

		if (googleDevice == _nullGoogleDevice) {
			return null;
		}

		if (googleDevice == null) {
			Session session = null;

			try {
				session = openSession();

				googleDevice = (GoogleDevice)session.get(GoogleDeviceImpl.class,
						primaryKey);

				if (googleDevice != null) {
					cacheResult(googleDevice);
				}
				else {
					EntityCacheUtil.putResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
						GoogleDeviceImpl.class, primaryKey, _nullGoogleDevice);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(GoogleDeviceModelImpl.ENTITY_CACHE_ENABLED,
					GoogleDeviceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return googleDevice;
	}

	/**
	 * Returns the google device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param googleDeviceId the primary key of the google device
	 * @return the google device, or <code>null</code> if a google device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GoogleDevice fetchByPrimaryKey(long googleDeviceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)googleDeviceId);
	}

	/**
	 * Returns all the google devices.
	 *
	 * @return the google devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GoogleDevice> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<GoogleDevice> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<GoogleDevice> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<GoogleDevice> list = (List<GoogleDevice>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GOOGLEDEVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GOOGLEDEVICE;

				if (pagination) {
					sql = sql.concat(GoogleDeviceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<GoogleDevice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GoogleDevice>(list);
				}
				else {
					list = (List<GoogleDevice>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the google devices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (GoogleDevice googleDevice : findAll()) {
			remove(googleDevice);
		}
	}

	/**
	 * Returns the number of google devices.
	 *
	 * @return the number of google devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GOOGLEDEVICE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the google device persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.emg.model.GoogleDevice")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<GoogleDevice>> listenersList = new ArrayList<ModelListener<GoogleDevice>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<GoogleDevice>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(GoogleDeviceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GOOGLEDEVICE = "SELECT googleDevice FROM GoogleDevice googleDevice";
	private static final String _SQL_SELECT_GOOGLEDEVICE_WHERE = "SELECT googleDevice FROM GoogleDevice googleDevice WHERE ";
	private static final String _SQL_COUNT_GOOGLEDEVICE = "SELECT COUNT(googleDevice) FROM GoogleDevice googleDevice";
	private static final String _SQL_COUNT_GOOGLEDEVICE_WHERE = "SELECT COUNT(googleDevice) FROM GoogleDevice googleDevice WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "googleDevice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No GoogleDevice exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No GoogleDevice exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GoogleDevicePersistenceImpl.class);
	private static GoogleDevice _nullGoogleDevice = new GoogleDeviceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<GoogleDevice> toCacheModel() {
				return _nullGoogleDeviceCacheModel;
			}
		};

	private static CacheModel<GoogleDevice> _nullGoogleDeviceCacheModel = new CacheModel<GoogleDevice>() {
			@Override
			public GoogleDevice toEntityModel() {
				return _nullGoogleDevice;
			}
		};
}