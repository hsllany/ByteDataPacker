package com.ubirouting.bytelib;

import java.lang.reflect.Method;

class Utils {
	private Utils() {
	};

	static Method getAccessibleMethod(String methodName, Class<?> clazz) {
		try {
			Method ms = clazz.getDeclaredMethod(methodName);
			ms.setAccessible(true);
			return ms;
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

	static boolean isToBytesClass(Class<?> c) {
		Class<?>[] interfaces = c.getInterfaces();
		for (Class<?> interfaceItem : interfaces) {
			if (interfaceItem == Bytable.class)
				return true;
		}

		return false;

	}
}