package com.example.dell.designpatterndemo.decorator;

/**
 * 创建日期：2018/8/3
 * 作者:baiyang
 * 装备的接口
 */
public interface IEquip {
    /**
     * 计算攻击力
     *
     * @return
     */
    public int caculateAttack();

    /**
     * 装备的描述
     *
     * @return
     */
    public String description();
}
