package com.example.dell.designpatterndemo.factroy.simpleFactroy;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 简单工厂模式（造手机）
 */
public class SimpleFactroy {
    /**
     * 工厂造手机
     *
     * @param type
     * @return
     */
    public Phone createPhone(PhoneType type) {
        Phone phone = null;
        if (type == PhoneType.ANDROID) {
            phone = new AndroidPhone();

        } else if (type == PhoneType.IOS) {
            phone = new ApplePhone();
        }
        return phone;
    }

}
