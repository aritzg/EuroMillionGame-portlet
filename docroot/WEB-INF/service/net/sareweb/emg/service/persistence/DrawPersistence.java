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

import net.sareweb.emg.model.Draw;

/**
 * The persistence interface for the draw service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see DrawPersistenceImpl
 * @see DrawUtil
 * @generated
 */
public interface DrawPersistence extends BasePersistence<Draw> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DrawUtil} to access the draw persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the draw in the entity cache if it is enabled.
	*
	* @param draw the draw
	*/
	public void cacheResult(net.sareweb.emg.model.Draw draw);

	/**
	* Caches the draws in the entity cache if it is enabled.
	*
	* @param draws the draws
	*/
	public void cacheResult(java.util.List<net.sareweb.emg.model.Draw> draws);

	/**
	* Creates a new draw with the primary key. Does not add the draw to the database.
	*
	* @param drawId the primary key for the new draw
	* @return the new draw
	*/
	public net.sareweb.emg.model.Draw create(long drawId);

	/**
	* Removes the draw with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drawId the primary key of the draw
	* @return the draw that was removed
	* @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Draw remove(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchDrawException;

	public net.sareweb.emg.model.Draw updateImpl(
		net.sareweb.emg.model.Draw draw)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the draw with the primary key or throws a {@link net.sareweb.emg.NoSuchDrawException} if it could not be found.
	*
	* @param drawId the primary key of the draw
	* @return the draw
	* @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Draw findByPrimaryKey(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchDrawException;

	/**
	* Returns the draw with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param drawId the primary key of the draw
	* @return the draw, or <code>null</code> if a draw with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Draw fetchByPrimaryKey(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the draws.
	*
	* @return the draws
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Draw> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the draws.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.DrawModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draws
	* @param end the upper bound of the range of draws (not inclusive)
	* @return the range of draws
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Draw> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the draws.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.DrawModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draws
	* @param end the upper bound of the range of draws (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of draws
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Draw> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the draws from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of draws.
	*
	* @return the number of draws
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}