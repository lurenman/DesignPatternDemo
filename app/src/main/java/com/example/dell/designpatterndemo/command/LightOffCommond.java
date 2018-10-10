package com.example.dell.designpatterndemo.command;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 * 关闭电灯的命令
 */
public class LightOffCommond implements Command {

    private Light light ;

    public LightOffCommond(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();
    }

}
