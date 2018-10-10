package com.example.dell.designpatterndemo.strategy;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class DisplayA implements IDisplayBehavior {
    private static final String TAG = "DisplayA";

    @Override
    public void display() {
        Log.e(TAG, "display: A");
    }
}
