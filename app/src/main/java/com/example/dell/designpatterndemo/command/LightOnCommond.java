package com.example.dell.designpatterndemo.command;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 */
public class LightOnCommond implements Command {
    private Light light ;

    public LightOnCommond(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }

}
