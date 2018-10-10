package com.example.dell.designpatterndemo.facade;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/8
 * 作者:baiyang
 * 外观模式https://blog.csdn.net/lmj623565791/article/details/25837275
 */
public class FacadeActivity extends BaseActivity {

    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_facade;
    }

    @Override
    protected void initViews() {
        bt_click = (Button) findViewById(R.id.bt_click);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void loadData() {

    }
}
