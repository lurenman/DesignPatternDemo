package com.example.dell.designpatterndemo.strategy;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 * 原文https://blog.csdn.net/lmj623565791/article/details/24116745
 */
public class StrategyActivity extends BaseActivity {
    private static final String TAG = "StrategyActivity";
    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_strategy;
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
                Role roleA = new RoleA("A");
                roleA.setAttackBehavior(new AttackJY())
                        .setDefendBehavior(new DefendTBS())
                        .setDisplayBehavior(new DisplayA())
                        .setRunBehavior(new RunJCTQ());
                System.out.println(roleA.name + ":");
                roleA.run();
                roleA.attack();
                roleA.defend();
                roleA.display();
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
