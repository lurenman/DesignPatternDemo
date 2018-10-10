package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 单例模式懒汉式双重校验锁[推荐用]
 */
public class SingletonLazyStyleSafety2 {
    private static SingletonLazyStyleSafety2 instance = null;

    public SingletonLazyStyleSafety2() {
    }

    public static SingletonLazyStyleSafety2 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyStyleSafety2.class) {
                if (instance == null) {
                    instance = new SingletonLazyStyleSafety2();
                }
            }
        }
        return instance;
    }
}
