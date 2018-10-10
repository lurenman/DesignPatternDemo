package com.example.dell.designpatterndemo.adapter;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class Mobile {
    private static final String TAG = "Mobile";

    /**
     * 充电
     * @param power
     */
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        Log.e(TAG, "inputPower: " + "手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }

}
