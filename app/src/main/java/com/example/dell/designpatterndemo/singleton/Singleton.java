package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 单例模式的饿汉式
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
