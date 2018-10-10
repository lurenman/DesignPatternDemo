package com.example.dell.designpatterndemo.decorator;

/**
 * 创建日期：2018/8/3
 * 作者:baiyang
 * 护腕
 * 攻击力 5
 */
public class WristEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
