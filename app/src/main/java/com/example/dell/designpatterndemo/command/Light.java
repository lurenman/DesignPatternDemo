package com.example.dell.designpatterndemo.command;

import android.util.Log;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 */
public class Light {
    private static final String TAG = "Light";

    public void on() {
       // System.out.println("打开电灯");
        Log.e(TAG, "on: 打开电灯");
    }

    public void off() {
       // System.out.println("关闭电灯");
        Log.e(TAG, "off: 关闭电灯");
    }

}
