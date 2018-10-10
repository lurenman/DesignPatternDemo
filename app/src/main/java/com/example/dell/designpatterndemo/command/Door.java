package com.example.dell.designpatterndemo.command;

import android.util.Log;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 */
public class Door {
    private static final String TAG = "Door";

    public void open() {
        //System.out.println("打开门");
        Log.e(TAG, "open: 打开门");
    }

    public void close() {
        // System.out.println("关闭门");
        Log.e(TAG, "close: 关闭门");

    }
}
