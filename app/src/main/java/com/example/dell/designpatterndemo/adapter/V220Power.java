package com.example.dell.designpatterndemo.adapter;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 * 家用220V交流电
 */
public class V220Power {
    private static final String TAG = "V220Power";

    /**
     * 提供220V电压
     *
     * @return
     */
    public int provideV220Power() {
        Log.e(TAG, "provideV220Power:我提供220V交流电压。");
        return 220;
    }

}
