package com.example.dell.designpatterndemo.factroy.simpleFactroy;

import android.util.Log;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 苹果手机
 */
public class ApplePhone extends Phone {
    private static final String TAG = "ApplePhone";

    public ApplePhone() {
    }

    @Override
    public void makeCreating() {
        Log.e(TAG, "makeCreating: " + "IOS手机正在被制造");
    }
}
