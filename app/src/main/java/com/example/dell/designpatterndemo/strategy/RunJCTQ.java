package com.example.dell.designpatterndemo.strategy;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class RunJCTQ implements IRunBehavior {
    private static final String TAG = "RunJCTQ";

    @Override
    public void run() {
        Log.e(TAG, "金蝉脱壳");
    }
}
