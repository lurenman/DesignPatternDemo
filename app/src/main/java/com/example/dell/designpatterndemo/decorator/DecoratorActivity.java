package com.example.dell.designpatterndemo.decorator;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/3
 * 作者:baiyang
 * 原文https://blog.csdn.net/lmj623565791/article/details/24269409
 */
public class DecoratorActivity extends BaseActivity {
    private static final String TAG = "DecoratorActivity";
    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_decorator;
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
               // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
                System.out.println(" 一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
                IEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
                System.out.println("攻击力  : " + equip.caculateAttack());
                System.out.println("描述 :" + equip.description());
                System.out.println("-------");
                // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
                System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
                equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
                System.out.println("攻击力  : " + equip.caculateAttack());
                System.out.println("描述 :" + equip.description());
                System.out.println("-------");

            }
        });
    }

    @Override
    protected void loadData() {

    }
}
