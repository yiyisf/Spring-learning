package com.yiyi.comm.out;

/**
 * Created by liuzhe on 16/6/13.
 */
public class JsonPrinter implements Printer {
    public void print(String msg) {
        System.out.println("from Json printer" + msg);
    }
}
