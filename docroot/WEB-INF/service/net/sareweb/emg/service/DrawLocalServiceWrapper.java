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
 * Provides a wrapper for {@link DrawLocalService}.
 *
 * @author A.Galdos
 * @see DrawLocalService
 * @generated
 */
public class DrawLocalServiceWrapper implements DrawLocalService,
	ServiceWrapper<DrawLocalService> {
	public DrawLocalServiceWrapper(DrawLocalService drawLocalService) {
		_drawLocalService = drawLocalService;
	}

	/**
	* Adds the draw to the database. Also notifies the appropriate model listeners.
	*
	* @param draw the draw
	* @return the draw that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.Draw addDraw(net.sareweb.emg.model.Draw draw)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.addDraw(draw);
	}

	/**
	* Creates a new draw with the primary key. Does not add the draw to the database.
	*
	* @param drawId the primary key for the new draw
	* @return the new draw
	*/
	@Override
	public net.sareweb.emg.model.Draw createDraw(long drawId) {
		return _drawLocalService.createDraw(drawId);
	}

	/**
	* Deletes the draw with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drawId the primary key of the draw
	* @return the draw that was removed
	* @throws PortalException if a draw with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.Draw deleteDraw(long drawId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.deleteDraw(drawId);
	}

	/**
	* Deletes the draw from the database. Also notifies the appropriate model listeners.
	*
	* @param draw the draw
	* @return the draw that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.Draw deleteDraw(
		net.sareweb.emg.model.Draw draw)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.deleteDraw(draw);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _drawLocalService.dynamicQuery();
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
		return _drawLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.DrawModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _drawLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.DrawModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _drawLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _drawLocalService.dynamicQueryCount(dynamicQuery);
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
		return _drawLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public net.sareweb.emg.model.Draw fetchDraw(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.fetchDraw(drawId);
	}

	/**
	* Returns the draw with the primary key.
	*
	* @param drawId the primary key of the draw
	* @return the draw
	* @throws PortalException if a draw with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.Draw getDraw(long drawId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.getDraw(drawId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<net.sareweb.emg.model.Draw> getDraws(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.getDraws(start, end);
	}

	/**
	* Returns the number of draws.
	*
	* @return the number of draws
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDrawsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.getDrawsCount();
	}

	/**
	* Updates the draw in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param draw the draw
	* @return the draw that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public net.sareweb.emg.model.Draw updateDraw(
		net.sareweb.emg.model.Draw draw)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _drawLocalService.updateDraw(draw);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _drawLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_drawLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _drawLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DrawLocalService getWrappedDrawLocalService() {
		return _drawLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDrawLocalService(DrawLocalService drawLocalService) {
		_drawLocalService = drawLocalService;
	}

	@Override
	public DrawLocalService getWrappedService() {
		return _drawLocalService;
	}

	@Override
	public void setWrappedService(DrawLocalService drawLocalService) {
		_drawLocalService = drawLocalService;
	}

	private DrawLocalService _drawLocalService;
}