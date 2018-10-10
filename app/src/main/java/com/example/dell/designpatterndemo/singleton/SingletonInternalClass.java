package com.example.dell.designpatterndemo.singleton;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 内部类[推荐用]
 */
public class SingletonInternalClass {
    public SingletonInternalClass() {
    }
    private static class SingletonHolder{
        private static SingletonInternalClass instance=new SingletonInternalClass();
    }
    public static SingletonInternalClass getInstance(){
        return SingletonHolder.instance;
    }
}
