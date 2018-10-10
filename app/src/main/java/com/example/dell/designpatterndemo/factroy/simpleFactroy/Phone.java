package com.example.dell.designpatterndemo.factroy.simpleFactroy;

/**
 * 创建日期：2018/7/31
 * 作者:baiyang
 * 手机base类
 */
public abstract class Phone {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  public abstract void makeCreating();
}
