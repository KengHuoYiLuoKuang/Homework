package com.sms.wyy;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpUtil {
    //发送http获取返回的json
    public static Response httpGet(String url) throws IOException {
        OkHttpClient mOkHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(url).build();
        return mOkHttpClient.newCall(request).execute();
    }
}
