package com.example.dell.designpatterndemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getLayoutResId());
        initViews();
        initVariables();
        initEnvent();
        loadData();
    }


    protected abstract int getLayoutResId();

    protected abstract void initViews();

    protected abstract void initVariables();

    protected abstract void loadData();

    protected void initEnvent() {

    }

}
