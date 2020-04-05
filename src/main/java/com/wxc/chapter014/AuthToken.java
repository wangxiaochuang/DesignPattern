package com.wxc.chapter014;

public class AuthToken {
    
	public AuthToken(String token, long timestamp) {
	}

	public boolean isExpired() {
		return false;
	}

	public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
		return null;
	}

	public boolean math(AuthToken clientAuthToken) {
		return false;
	}

}
