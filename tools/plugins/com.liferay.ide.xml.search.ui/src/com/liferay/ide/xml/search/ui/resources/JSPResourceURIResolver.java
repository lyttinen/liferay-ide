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

package com.liferay.ide.xml.search.ui.resources;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kuo Zhang
 */
public class JSPResourceURIResolver extends AbstractWebResourceURIResolver {

	public static final JSPResourceURIResolver INSTANCE = new JSPResourceURIResolver();

	public JSPResourceURIResolver() {
		super(true);
	}

	@Override
	protected Set<String> getExtensions() {
		return _extensions;
	}

	private static final Set<String> _extensions;

	static {
		_extensions = new HashSet<>();

		_extensions.add("jsp");
	}

}