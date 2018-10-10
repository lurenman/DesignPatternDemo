package com.example.dell.designpatterndemo.templatemethod;

/**
 * 创建日期：2018/8/8
 * 作者:baiyang
 */
public class ITWorker extends Worker
{

    public ITWorker(String name)
    {
        super(name);
    }

    @Override
    public void work()
    {
        System.out.println(name + "写程序-测bug-fix bug");
    }

}
