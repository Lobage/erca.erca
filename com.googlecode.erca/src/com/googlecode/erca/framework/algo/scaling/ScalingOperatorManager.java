 /*********************************************************************************
 * Copyright (c) 2007, 2008 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jean-Rémy Falleri <jr.falleri@laposte.net> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.algo.scaling;

import java.util.HashMap;
import java.util.Map;

public class ScalingOperatorManager {

	private static Map<String,ScalingOperator> scalingOperators = new HashMap<String, ScalingOperator>();

	@SuppressWarnings("unchecked")
	public static ScalingOperator getScalingOperator(String name) {
		if ( scalingOperators.containsKey(name) )
			return scalingOperators.get(name);
		else {
			ScalingOperator op = null;
			try {
				Class clOp = Class.forName(name);
				op = (ScalingOperator) clOp.newInstance();
				scalingOperators.put(name,op);
				return op;
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
			catch(IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
			catch(InstantiationException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

}
