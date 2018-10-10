package com.example.dell.designpatterndemo.adapter;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 * 适配器，把220V电压变成5V
 */
public class V5PowerAdapter implements V5Power {
    private static final String TAG = "V5PowerAdapter";
    /**
     * 组合的方式
     */
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        //power经过各种操作-->5
        Log.e(TAG, "provideV5Power: "+"适配器：我悄悄的适配了电压。");
        return 5;
    }

}
