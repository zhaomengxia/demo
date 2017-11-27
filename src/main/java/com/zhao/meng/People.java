package com.zhao.meng;

public class People {
    String name="类体重定义的name";
    People(){}
    public void speak(){
        String name="类体方法中定义的name";
        System.out.println(name);
        System.out.println(this.name);
    }
}
