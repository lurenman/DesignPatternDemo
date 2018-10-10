package com.example.dell.designpatterndemo.factroy.simpleFactroy;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 手机制造商
 */
public class Manufacturer {
    private SimpleFactroy factroy;

    public Manufacturer(SimpleFactroy factroy) {
        this.factroy = factroy;
    }

    public Phone createPhone(PhoneType phoneType) {
        Phone phone = null;
        if (factroy != null) {
            phone = factroy.createPhone(phoneType);
            //看log开始制作
            phone.makeCreating();
        }
        return phone;
    }
}
