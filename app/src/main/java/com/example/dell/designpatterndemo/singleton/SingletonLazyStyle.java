package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 单例模式的懒汉式[线程不安全，不可用]
 */
public class SingletonLazyStyle {
    private static SingletonLazyStyle instance = null;

    public SingletonLazyStyle() {
    }

    public static SingletonLazyStyle getInstance() {
        if (instance == null) {
            instance = new SingletonLazyStyle();
        }
        return instance;
    }
}
