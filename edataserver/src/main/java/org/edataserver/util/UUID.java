package org.edataserver.util;

public class UUID {

	public static String getUUID() {
		String uuid = java.util.UUID.randomUUID().toString().replace("-","");
		return uuid;
	}
}
