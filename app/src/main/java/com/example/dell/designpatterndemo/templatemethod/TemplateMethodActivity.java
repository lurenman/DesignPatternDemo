package com.example.dell.designpatterndemo.templatemethod;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/8
 * 作者:baiyang
 * 模版方法模式
 * 原文https://blog.csdn.net/lmj623565791/article/details/26276093
 */
public class TemplateMethodActivity extends BaseActivity {

    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_templatemethod;
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
                Worker it1 = new ITWorker("鸿洋");
                it1.workOneDay();
                Worker it2 = new ITWorker("老张");
                it2.workOneDay();
                Worker hr = new HRWorker("迪迪");
                hr.workOneDay();
                Worker qa = new QAWorker("老李");
                qa.workOneDay();
                Worker pm = new ManagerWorker("坑货");
                pm.workOneDay();
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
