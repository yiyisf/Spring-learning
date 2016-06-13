package com.yiyi.common;

/**
 * Created by liuzhe on 16/6/13.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void pringHello(){
        System.out.print("Hello Spring3 " + name);
    }
}
