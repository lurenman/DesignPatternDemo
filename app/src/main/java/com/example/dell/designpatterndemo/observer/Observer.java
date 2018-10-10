package com.example.dell.designpatterndemo.observer;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 观察者
 */
public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}
