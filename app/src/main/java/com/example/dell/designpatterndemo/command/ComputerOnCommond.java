package com.example.dell.designpatterndemo.command;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 */
public class ComputerOnCommond implements Command {
    private Computer computer ;

    public ComputerOnCommond( Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public void execute()
    {
        computer.on();
    }

}
