package com.example.dell.designpatterndemo.adapter;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang  适配器模式
 * 原文https://blog.csdn.net/lmj623565791/article/details/25833393
 */
public class AdapterActivity extends BaseActivity {

    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_adapter;
    }

    @Override
    protected void initViews() {
        bt_click = (Button) findViewById(R.id.bt_click);
    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mobile mobile = new Mobile();
                V5Power v5Power = new V5PowerAdapter(new V220Power());
                mobile.inputPower(v5Power);
            }
        });
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void loadData() {

    }
}
