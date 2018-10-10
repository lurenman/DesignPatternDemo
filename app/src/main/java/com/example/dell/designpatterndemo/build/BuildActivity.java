package com.example.dell.designpatterndemo.build;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dell.designpatterndemo.R;
import com.example.dell.designpatterndemo.activity.BaseActivity;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 * 参考https://www.cnblogs.com/android-blogs/p/5530239.html
 */
public class BuildActivity extends BaseActivity {
    private static final String TAG = "BuildActivity";
    private Button bt_click;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_build;
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
                Person.Builder builder = new Person.Builder();
                Person person = builder.setAge(18).setHeight(183).setName("小明").setWeight(123).build();
                String toString = person.toString();
                Log.e(TAG, "onClick: " + toString);
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
