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

import net.sareweb.emg.model.Proposal;

/**
 * The persistence interface for the proposal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see ProposalPersistenceImpl
 * @see ProposalUtil
 * @generated
 */
public interface ProposalPersistence extends BasePersistence<Proposal> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProposalUtil} to access the proposal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the proposals where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @return the matching proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findByDrawId(
		long drawId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the proposals where drawId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.ProposalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param drawId the draw ID
	* @param start the lower bound of the range of proposals
	* @param end the upper bound of the range of proposals (not inclusive)
	* @return the range of matching proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findByDrawId(
		long drawId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the proposals where drawId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.ProposalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param drawId the draw ID
	* @param start the lower bound of the range of proposals
	* @param end the upper bound of the range of proposals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findByDrawId(
		long drawId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first proposal in the ordered set where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching proposal
	* @throws net.sareweb.emg.NoSuchProposalException if a matching proposal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal findByDrawId_First(long drawId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchProposalException;

	/**
	* Returns the first proposal in the ordered set where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching proposal, or <code>null</code> if a matching proposal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal fetchByDrawId_First(long drawId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last proposal in the ordered set where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching proposal
	* @throws net.sareweb.emg.NoSuchProposalException if a matching proposal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal findByDrawId_Last(long drawId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchProposalException;

	/**
	* Returns the last proposal in the ordered set where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching proposal, or <code>null</code> if a matching proposal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal fetchByDrawId_Last(long drawId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proposals before and after the current proposal in the ordered set where drawId = &#63;.
	*
	* @param proposalId the primary key of the current proposal
	* @param drawId the draw ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next proposal
	* @throws net.sareweb.emg.NoSuchProposalException if a proposal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal[] findByDrawId_PrevAndNext(
		long proposalId, long drawId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchProposalException;

	/**
	* Removes all the proposals where drawId = &#63; from the database.
	*
	* @param drawId the draw ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDrawId(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of proposals where drawId = &#63;.
	*
	* @param drawId the draw ID
	* @return the number of matching proposals
	* @throws SystemException if a system exception occurred
	*/
	public int countByDrawId(long drawId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the proposal in the entity cache if it is enabled.
	*
	* @param proposal the proposal
	*/
	public void cacheResult(net.sareweb.emg.model.Proposal proposal);

	/**
	* Caches the proposals in the entity cache if it is enabled.
	*
	* @param proposals the proposals
	*/
	public void cacheResult(
		java.util.List<net.sareweb.emg.model.Proposal> proposals);

	/**
	* Creates a new proposal with the primary key. Does not add the proposal to the database.
	*
	* @param proposalId the primary key for the new proposal
	* @return the new proposal
	*/
	public net.sareweb.emg.model.Proposal create(long proposalId);

	/**
	* Removes the proposal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param proposalId the primary key of the proposal
	* @return the proposal that was removed
	* @throws net.sareweb.emg.NoSuchProposalException if a proposal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal remove(long proposalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchProposalException;

	public net.sareweb.emg.model.Proposal updateImpl(
		net.sareweb.emg.model.Proposal proposal)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the proposal with the primary key or throws a {@link net.sareweb.emg.NoSuchProposalException} if it could not be found.
	*
	* @param proposalId the primary key of the proposal
	* @return the proposal
	* @throws net.sareweb.emg.NoSuchProposalException if a proposal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal findByPrimaryKey(long proposalId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.sareweb.emg.NoSuchProposalException;

	/**
	* Returns the proposal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param proposalId the primary key of the proposal
	* @return the proposal, or <code>null</code> if a proposal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.sareweb.emg.model.Proposal fetchByPrimaryKey(long proposalId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the proposals.
	*
	* @return the proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the proposals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.ProposalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of proposals
	* @param end the upper bound of the range of proposals (not inclusive)
	* @return the range of proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the proposals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.sareweb.emg.model.impl.ProposalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of proposals
	* @param end the upper bound of the range of proposals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of proposals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.sareweb.emg.model.Proposal> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the proposals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of proposals.
	*
	* @return the number of proposals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}