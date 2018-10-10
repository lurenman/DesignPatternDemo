package com.example.dell.designpatterndemo.command;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 * 原文https://blog.csdn.net/lmj623565791/article/details/24602057
 */
public class CommandActivity extends BaseActivity {
    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_command;
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
/**
 * 三个家电
 */
                Light light = new Light();
                Door door = new Door();
                Computer computer = new Computer();
                /**
                 * 一个控制器，假设是我们的app主界面
                 */
                ControlPanel controlPanel = new ControlPanel();
                // 为每个按钮设置功能
                controlPanel.setCommand(0, new LightOnCommond(light));
                controlPanel.setCommand(1, new LightOffCommond(light));
                controlPanel.setCommand(2, new ComputerOnCommond(computer));
                controlPanel.setCommand(3, new ComputerOffCommond(computer));
//                controlPanel.setCommand(4, new DoorOnCommond(door));
//                controlPanel.setCommand(5, new DoorOffCommond(door));

                // 模拟点击
                controlPanel.keyPressed(0);
                controlPanel.keyPressed(2);
                controlPanel.keyPressed(3);
//                controlPanel.keyPressed(4);
//                controlPanel.keyPressed(5);
                controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳

            }
        });
    }

    @Override
    protected void loadData() {

    }
}
