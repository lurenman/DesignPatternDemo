package com.example.dell.designpatterndemo.observer;

/**
 * 创建日期：2018/7/27
 * 作者:baiyang
 */
public class Weather {
    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public Weather() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
