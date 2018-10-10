package com.example.dell.designpatterndemo.build;

/**
 * 创建日期：2018/8/1
 * 作者:baiyang
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        //return super.toString();
        String s="name:"+name+"age:"+age+"height:"+height+"weight:"+weight;
        return s;
    }

    public static class Builder {
        private String name;
        private int age;
        private double height;
        private double weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
