package com.wxc.chapter014;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiRequest {
	private String appId;
    private String token;
    private long timestamp;
    private String originalUrl;

    public String getAppId() {
        return this.appId;
    }
    public String getToken() {
        return this.token;
    }
    public long getTimestamp() {
        return this.timestamp;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }
	
	public static ApiRequest buildFromUrl(String urlstr) throws MalformedURLException {
        URL url = new URL(urlstr);
        String queryStr = url.getQuery();
		return null;
	}

    public static void main(String[] args) {
        String appId = "client_a";
        long ts = System.currentTimeMillis();
        String token = "alsdfjalskdfasdf";
        String urlStr = String.format("http://www.baidu.com/path?key=val&appid=%s&ts=%ld&token=%s", appId, ts, token);
        try {
            ApiRequest apiRequest = ApiRequest.buildFromUrl(urlStr);
            System.out.println(apiRequest.getToken());
		} catch (MalformedURLException e) {
            System.out.println("invalid url");
		}
    }
}
