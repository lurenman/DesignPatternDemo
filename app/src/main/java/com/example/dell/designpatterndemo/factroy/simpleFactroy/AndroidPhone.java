package com.example.dell.designpatterndemo.factroy.simpleFactroy;

import android.util.Log;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 安卓手机
 */
public class AndroidPhone extends Phone {
    private static final String TAG = "AndroidPhone";
    public AndroidPhone() {

    }

    @Override
    public void makeCreating() {
        Log.e(TAG, "makeCreating: "+"安卓手机正在被制造");
    }
}
