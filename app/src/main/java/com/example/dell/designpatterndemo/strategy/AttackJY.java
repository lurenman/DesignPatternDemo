package com.example.dell.designpatterndemo.strategy;

import android.util.Log;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class AttackJY implements IAttackBehavior {
    private static final String TAG = "AttackJY";

    @Override
    public void attack() {
        Log.e(TAG, "九阳神功！");
    }
}
