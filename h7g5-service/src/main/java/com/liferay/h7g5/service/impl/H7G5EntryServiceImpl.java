/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import org.osgi.service.component.annotations.Component;

import java.util.Objects;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
		property = {
				"json.web.service.context.name=ohqiwtsfhl",
				"json.web.service.context.path=H7G5Entry"
		},
		service = AopService.class
)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {


	@Override
	public java.util.List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId)  throws PortalException {
		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}
		return  h7g5EntryLocalService.findByH7G5FolderId(h7g5FolderId);
	}
	@Override
	public H7G5Entry findByKey(String key) throws NoSuchH7G5EntryException, PortalException {
		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}
		return h7g5EntryLocalService.findByKey(key);
	}
	@Override
	public java.util.List<H7G5Entry> findByName(String name) throws PortalException{
		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.findByName(name);
	}
	@Override
	public H7G5Entry fetchByH_D_N(long h7g5FolderId, String description, String name) throws PortalException {
		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.fetchByH_D_N(h7g5FolderId, description, name);
	}

}