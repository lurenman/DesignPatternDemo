package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 单例模式懒汉式[线程不安全，不可用]
 */
public class SingletonLazyStyleSafety1 {
    private static SingletonLazyStyleSafety1 instance = null;

    public SingletonLazyStyleSafety1() {
    }

    public static SingletonLazyStyleSafety1 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyStyleSafety1.class) {
                instance = new SingletonLazyStyleSafety1();
            }
        }
        return instance;
    }
}
