/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.university.course.service.impl;

import com.liferay.portal.aop.AopService;

import com.university.course.service.base.CourseLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.university.course.model.Course",
	service = AopService.class
)
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {
}