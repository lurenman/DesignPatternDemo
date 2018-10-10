package com.example.dell.designpatterndemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.adapter.AdapterActivity;
import com.example.dell.designpatterndemo.build.BuildActivity;
import com.example.dell.designpatterndemo.command.CommandActivity;
import com.example.dell.designpatterndemo.decorator.DecoratorActivity;
import com.example.dell.designpatterndemo.factroy.FactroyActivty;
import com.example.dell.designpatterndemo.observer.ObserverActivity;
import com.example.dell.designpatterndemo.singleton.SingletonActivity;
import com.example.dell.designpatterndemo.strategy.StrategyActivity;
import com.example.dell.designpatterndemo.templatemethod.TemplateMethodActivity;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Context mContext = null;
    private Button bt_observer;
    private Button bt_singleton;
    private Button bt_factroy;
    private Button bt_build;
    private Button bt_strategy;
    private Button bt_adapter;
    private Button bt_command;
    private Button bt_decorator;
    private Button bt_facade;
    private Button bt_template_method;
    private Button bt_state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        bt_singleton = (Button) findViewById(R.id.bt_singleton);
        bt_observer = (Button) findViewById(R.id.bt_observer);
        bt_factroy = (Button) findViewById(R.id.bt_factroy);
        bt_build = (Button) findViewById(R.id.bt_build);
        bt_strategy = (Button) findViewById(R.id.bt_strategy);
        bt_adapter = (Button) findViewById(R.id.bt_adapter);
        bt_command = (Button) findViewById(R.id.bt_command);
        bt_decorator = (Button) findViewById(R.id.bt_decorator);
        bt_facade = (Button) findViewById(R.id.bt_facade);
        bt_template_method = (Button) findViewById(R.id.bt_template_method);
        bt_state = (Button) findViewById(R.id.bt_state);

        bt_singleton.setOnClickListener(this);
        bt_observer.setOnClickListener(this);
        bt_factroy.setOnClickListener(this);
        bt_build.setOnClickListener(this);
        bt_strategy.setOnClickListener(this);
        bt_adapter.setOnClickListener(this);
        bt_command.setOnClickListener(this);
        bt_decorator.setOnClickListener(this);
        bt_facade.setOnClickListener(this);
        bt_template_method.setOnClickListener(this);
        bt_state.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_singleton:
                startActivity(new Intent(mContext, SingletonActivity.class));
                break;
            case R.id.bt_observer:
                startActivity(new Intent(mContext, ObserverActivity.class));
                break;
            case R.id.bt_factroy:
                startActivity(new Intent(mContext, FactroyActivty.class));
                break;
            case R.id.bt_build:
                startActivity(new Intent(mContext, BuildActivity.class));
                break;
            case R.id.bt_strategy:
                startActivity(new Intent(mContext, StrategyActivity.class));
                break;
            case R.id.bt_adapter:
                startActivity(new Intent(mContext, AdapterActivity.class));
                break;
            case R.id.bt_command:
                startActivity(new Intent(mContext, CommandActivity.class));
                break;
            case R.id.bt_decorator:
                startActivity(new Intent(mContext, DecoratorActivity.class));
                break;
            case R.id.bt_facade:
                startActivity(new Intent(mContext, FactroyActivty.class));
                break;
            case R.id.bt_template_method:
                startActivity(new Intent(mContext, TemplateMethodActivity.class));
                break;
            case R.id.bt_state:
                String url="https://blog.csdn.net/lmj623565791/article/details/26350617";
                Log.e(TAG, "onClick: 详见"+url);
                break;
            default:
                break;
        }
    }
}
