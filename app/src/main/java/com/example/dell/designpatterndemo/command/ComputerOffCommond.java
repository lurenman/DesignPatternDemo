package com.example.dell.designpatterndemo.command;

/**
 * 创建日期：2018/8/2
 * 作者:baiyang
 */
public class ComputerOffCommond implements Command {
    private Computer computer ;

    public ComputerOffCommond( Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public void execute()
    {
        computer.off();
    }

}
