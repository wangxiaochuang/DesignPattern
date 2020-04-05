package com.wxc.chapter014;

import java.util.HashMap;
import java.util.Map;

public class MysqlCredentialStoageImpl implements CredentialStorage {
    private static Map<String, String> appMap = new HashMap<String, String>() {
        {
            put("client_a", "passwd_a");
            put("client_b", "passwd_b");
            put("client_c", "passwd_c");
        }
    };
	@Override
	public String getPasswordByAppId(String appId) {
		return appMap.get(appId);
	}
    
}