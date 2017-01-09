package com.coolweather.app.coolweather.util;

/**
 * Created by hixun on 2017/1/9.
 */

public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
