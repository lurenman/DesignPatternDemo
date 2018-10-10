package com.example.dell.designpatterndemo.singleton;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 * 参考
 * https://blog.csdn.net/dmk877/article/details/50311791
 */
public class SingletonActivity extends BaseActivity {
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_singleton;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initVariables() {
        SingletonEnum instance = SingletonEnum.instance;
    }

    @Override
    protected void loadData() {

    }
}
