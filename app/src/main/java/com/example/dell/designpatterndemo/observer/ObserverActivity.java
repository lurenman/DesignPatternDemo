package com.example.dell.designpatterndemo.observer;

import android.util.Log;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;
import com.example.dell.designpatterndemo.observer.system.SystemObservable;
import com.example.dell.designpatterndemo.observer.system.SystemObserver;

/**
 * 创建日期：2018/6/8
 * 作者:baiyang
 * rxjava好像
 * 参考https://www.cnblogs.com/android-blogs/p/5530239.html
 */
public class ObserverActivity extends BaseActivity {
    private static final String TAG = "ObserverActivity";

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_observer;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initVariables() {
        //被观察者
        //  Observable observable=new Observable<>();
        Observable<Weather> observable = new Observable<>();


        //初始化观察者1
        Observer<Weather> observer1 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                String description = data.getDescription();
                Log.e(TAG, "onUpdate observer1: " + description);
            }
        };
        //初始化观察者2
        Observer<Weather> observer2 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                String description = data.getDescription();
                Log.e(TAG, "onUpdate observer2: " + description);
            }
        };
        //被观察者注册观察者
        observable.register(observer1);
        observable.register(observer2);

        Weather weather = new Weather();
        weather.setDescription("蓝天白云");

        observable.notifyObservers(weather);

        observable.unregister(observer2);
        weather.setDescription("晴空万里");

        observable.notifyObservers(weather);

        //系统Api被观察者
        SystemObservable<Weather> systemObservable=new SystemObservable<>();

        //系统观察者
        SystemObserver systemObserver=new SystemObserver();
        //观察者订阅 被观察者
       // systemObserver.registerSubject(systemObservable);
        //被观察者订阅 观察者   （还是喜欢像这种订阅方式）
        systemObservable.registerSubject(systemObserver);

        systemObservable.mNotifyObservers(weather);




    }

    @Override
    protected void initEnvent() {
        super.initEnvent();

    }

    @Override
    protected void loadData() {

    }
}
