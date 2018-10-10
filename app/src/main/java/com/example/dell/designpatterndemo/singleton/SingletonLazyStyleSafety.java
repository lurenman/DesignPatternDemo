package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 懒汉式线程安全的[线程安全，效率低不推荐使用]
 */
public class SingletonLazyStyleSafety {
    private static SingletonLazyStyleSafety instance = null;

    public SingletonLazyStyleSafety() {
    }

    public static synchronized SingletonLazyStyleSafety getInstance() {
        if (instance == null) {
            instance = new SingletonLazyStyleSafety();
        }
        return instance;
    }
}
