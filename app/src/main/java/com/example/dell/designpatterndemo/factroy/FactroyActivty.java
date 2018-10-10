package com.example.dell.designpatterndemo.factroy;

import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;
import com.example.dell.designpatterndemo.factroy.simpleFactroy.Manufacturer;
import com.example.dell.designpatterndemo.factroy.simpleFactroy.PhoneType;
import com.example.dell.designpatterndemo.factroy.simpleFactroy.SimpleFactroy;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 参考https://blog.csdn.net/lmj623565791/article/details/24460585
 */
public class FactroyActivty extends BaseActivity {

    private Button bt_simpleFactroy;
    private Manufacturer manufacturer;
    private SimpleFactroy simpleFactroy;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_factroy;
    }

    @Override
    protected void initViews() {
        bt_simpleFactroy = (Button) findViewById(R.id.bt_simpleFactroy);
    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        bt_simpleFactroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manufacturer.createPhone(PhoneType.ANDROID);
                manufacturer.createPhone(PhoneType.IOS);
            }
        });
    }

    @Override
    protected void initVariables() {
        simpleFactroy = new SimpleFactroy();
        manufacturer = new Manufacturer(simpleFactroy);
    }

    @Override
    protected void loadData() {

    }
}
