package com.example.dell.designpatterndemo.decorator;

/**
 * 创建日期：2018/8/3
 * 作者:baiyang
 * 黄宝石装饰品
 * 每颗攻击力+10
 */
public class YellowGemDecorator implements IEquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }

    @Override
    public int caculateAttack()
    {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description()
    {
        return equip.description() + "+ 黄宝石";
    }

}
