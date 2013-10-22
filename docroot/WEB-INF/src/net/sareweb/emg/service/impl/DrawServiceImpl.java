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

package net.sareweb.emg.service.impl;

import java.util.Date;
import java.util.List;

import net.sareweb.emg.model.Draw;
import net.sareweb.emg.service.base.DrawServiceBaseImpl;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the draw remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link net.sareweb.emg.service.DrawService} interface.
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author A.Galdos
 * @see net.sareweb.emg.service.base.DrawServiceBaseImpl
 * @see net.sareweb.emg.service.DrawServiceUtil
 */
public class DrawServiceImpl extends DrawServiceBaseImpl {

	public List<Draw> getDrawsNewerThanDate(long date) throws SystemException {
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(Draw.class);
		if (date == 0) {
			Criterion dateCr = PropertyFactoryUtil.forName("modifyDate").le(
					new Date());
			dq.add(dateCr);
		} else {
			Criterion dateCr = PropertyFactoryUtil.forName("modifyDate").le(
					new Date(date));
			dq.add(dateCr);
		}
		dq.addOrder(OrderFactoryUtil.desc("createDate"));
		return drawPersistence.findWithDynamicQuery(dq);
	}

}