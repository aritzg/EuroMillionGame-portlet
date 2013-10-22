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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import net.sareweb.emg.NoSuchDrawException;
import net.sareweb.emg.model.Draw;
import net.sareweb.emg.model.impl.DrawImpl;
import net.sareweb.emg.model.impl.DrawModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the draw service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A.Galdos
 * @see DrawPersistence
 * @see DrawUtil
 * @generated
 */
public class DrawPersistenceImpl extends BasePersistenceImpl<Draw>
	implements DrawPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DrawUtil} to access the draw persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DrawImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawModelImpl.FINDER_CACHE_ENABLED, DrawImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawModelImpl.FINDER_CACHE_ENABLED, DrawImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DrawPersistenceImpl() {
		setModelClass(Draw.class);
	}

	/**
	 * Caches the draw in the entity cache if it is enabled.
	 *
	 * @param draw the draw
	 */
	@Override
	public void cacheResult(Draw draw) {
		EntityCacheUtil.putResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawImpl.class, draw.getPrimaryKey(), draw);

		draw.resetOriginalValues();
	}

	/**
	 * Caches the draws in the entity cache if it is enabled.
	 *
	 * @param draws the draws
	 */
	@Override
	public void cacheResult(List<Draw> draws) {
		for (Draw draw : draws) {
			if (EntityCacheUtil.getResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
						DrawImpl.class, draw.getPrimaryKey()) == null) {
				cacheResult(draw);
			}
			else {
				draw.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all draws.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DrawImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DrawImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the draw.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Draw draw) {
		EntityCacheUtil.removeResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawImpl.class, draw.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Draw> draws) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Draw draw : draws) {
			EntityCacheUtil.removeResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
				DrawImpl.class, draw.getPrimaryKey());
		}
	}

	/**
	 * Creates a new draw with the primary key. Does not add the draw to the database.
	 *
	 * @param drawId the primary key for the new draw
	 * @return the new draw
	 */
	@Override
	public Draw create(long drawId) {
		Draw draw = new DrawImpl();

		draw.setNew(true);
		draw.setPrimaryKey(drawId);

		return draw;
	}

	/**
	 * Removes the draw with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drawId the primary key of the draw
	 * @return the draw that was removed
	 * @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw remove(long drawId) throws NoSuchDrawException, SystemException {
		return remove((Serializable)drawId);
	}

	/**
	 * Removes the draw with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the draw
	 * @return the draw that was removed
	 * @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw remove(Serializable primaryKey)
		throws NoSuchDrawException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Draw draw = (Draw)session.get(DrawImpl.class, primaryKey);

			if (draw == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDrawException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(draw);
		}
		catch (NoSuchDrawException nsee) {
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
	protected Draw removeImpl(Draw draw) throws SystemException {
		draw = toUnwrappedModel(draw);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(draw)) {
				draw = (Draw)session.get(DrawImpl.class, draw.getPrimaryKeyObj());
			}

			if (draw != null) {
				session.delete(draw);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (draw != null) {
			clearCache(draw);
		}

		return draw;
	}

	@Override
	public Draw updateImpl(net.sareweb.emg.model.Draw draw)
		throws SystemException {
		draw = toUnwrappedModel(draw);

		boolean isNew = draw.isNew();

		Session session = null;

		try {
			session = openSession();

			if (draw.isNew()) {
				session.save(draw);

				draw.setNew(false);
			}
			else {
				session.merge(draw);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
			DrawImpl.class, draw.getPrimaryKey(), draw);

		return draw;
	}

	protected Draw toUnwrappedModel(Draw draw) {
		if (draw instanceof DrawImpl) {
			return draw;
		}

		DrawImpl drawImpl = new DrawImpl();

		drawImpl.setNew(draw.isNew());
		drawImpl.setPrimaryKey(draw.getPrimaryKey());

		drawImpl.setDrawId(draw.getDrawId());
		drawImpl.setNumber1(draw.getNumber1());
		drawImpl.setNumber2(draw.getNumber2());
		drawImpl.setNumber3(draw.getNumber3());
		drawImpl.setNumber4(draw.getNumber4());
		drawImpl.setNumber5(draw.getNumber5());
		drawImpl.setStar1(draw.getStar1());
		drawImpl.setStar2(draw.getStar2());
		drawImpl.setNumber1Guess(draw.getNumber1Guess());
		drawImpl.setNumber2Guess(draw.getNumber2Guess());
		drawImpl.setNumber3Guess(draw.getNumber3Guess());
		drawImpl.setNumber4Guess(draw.getNumber4Guess());
		drawImpl.setNumber5Guess(draw.getNumber5Guess());
		drawImpl.setStar1Guess(draw.getStar1Guess());
		drawImpl.setStar2Guess(draw.getStar2Guess());
		drawImpl.setDrawDate(draw.getDrawDate());
		drawImpl.setModifyDate(draw.getModifyDate());

		return drawImpl;
	}

	/**
	 * Returns the draw with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the draw
	 * @return the draw
	 * @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDrawException, SystemException {
		Draw draw = fetchByPrimaryKey(primaryKey);

		if (draw == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDrawException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return draw;
	}

	/**
	 * Returns the draw with the primary key or throws a {@link net.sareweb.emg.NoSuchDrawException} if it could not be found.
	 *
	 * @param drawId the primary key of the draw
	 * @return the draw
	 * @throws net.sareweb.emg.NoSuchDrawException if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw findByPrimaryKey(long drawId)
		throws NoSuchDrawException, SystemException {
		return findByPrimaryKey((Serializable)drawId);
	}

	/**
	 * Returns the draw with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the draw
	 * @return the draw, or <code>null</code> if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Draw draw = (Draw)EntityCacheUtil.getResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
				DrawImpl.class, primaryKey);

		if (draw == _nullDraw) {
			return null;
		}

		if (draw == null) {
			Session session = null;

			try {
				session = openSession();

				draw = (Draw)session.get(DrawImpl.class, primaryKey);

				if (draw != null) {
					cacheResult(draw);
				}
				else {
					EntityCacheUtil.putResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
						DrawImpl.class, primaryKey, _nullDraw);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DrawModelImpl.ENTITY_CACHE_ENABLED,
					DrawImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return draw;
	}

	/**
	 * Returns the draw with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drawId the primary key of the draw
	 * @return the draw, or <code>null</code> if a draw with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Draw fetchByPrimaryKey(long drawId) throws SystemException {
		return fetchByPrimaryKey((Serializable)drawId);
	}

	/**
	 * Returns all the draws.
	 *
	 * @return the draws
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Draw> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Draw> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Draw> findAll(int start, int end,
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

		List<Draw> list = (List<Draw>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DRAW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DRAW;

				if (pagination) {
					sql = sql.concat(DrawModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Draw>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Draw>(list);
				}
				else {
					list = (List<Draw>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the draws from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Draw draw : findAll()) {
			remove(draw);
		}
	}

	/**
	 * Returns the number of draws.
	 *
	 * @return the number of draws
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

				Query q = session.createQuery(_SQL_COUNT_DRAW);

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
	 * Initializes the draw persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.net.sareweb.emg.model.Draw")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Draw>> listenersList = new ArrayList<ModelListener<Draw>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Draw>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DrawImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DRAW = "SELECT draw FROM Draw draw";
	private static final String _SQL_COUNT_DRAW = "SELECT COUNT(draw) FROM Draw draw";
	private static final String _ORDER_BY_ENTITY_ALIAS = "draw.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Draw exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DrawPersistenceImpl.class);
	private static Draw _nullDraw = new DrawImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Draw> toCacheModel() {
				return _nullDrawCacheModel;
			}
		};

	private static CacheModel<Draw> _nullDrawCacheModel = new CacheModel<Draw>() {
			@Override
			public Draw toEntityModel() {
				return _nullDraw;
			}
		};
}