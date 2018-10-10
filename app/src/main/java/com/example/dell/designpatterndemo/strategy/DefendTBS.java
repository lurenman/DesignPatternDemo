package com.example.dell.designpatterndemo.strategy;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class DefendTBS implements IDefendBehavior {
    private static final String TAG = "DefendTBS";
    @Override
    public void defend() {
        Log.e(TAG, "铁布衫" );
    }
}
