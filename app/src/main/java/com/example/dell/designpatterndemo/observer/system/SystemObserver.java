package com.example.dell.designpatterndemo.observer.system;

import android.util.Log;

import com.example.dell.designpatterndemo.observer.Weather;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 观察者
 */
public class SystemObserver implements Observer {
    private static final String TAG = "SystemObserver";

    public SystemObserver() {
    }
//    public void registerSubject(Observable observable)
//    {
//        observable.addObserver(this);
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SystemObservable) {
            if (arg instanceof Weather) {
                Weather weather = (Weather) arg;
                String description = weather.getDescription();
                Log.e(TAG, "update: " + description);
            }
        }
    }
}
