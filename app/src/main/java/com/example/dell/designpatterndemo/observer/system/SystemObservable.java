package com.example.dell.designpatterndemo.observer.system;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 被观察者
 */
public class SystemObservable<T> extends Observable {

    public void registerSubject(Observer observer) {
        addObserver(observer);
    }

    public void mNotifyObservers(T data) {
        setChanged();
        notifyObservers(data);
    }

}
