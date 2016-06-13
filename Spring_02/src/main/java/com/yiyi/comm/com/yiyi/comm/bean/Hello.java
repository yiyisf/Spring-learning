package com.yiyi.comm.com.yiyi.comm.bean;

/**
 * Created by liuzhe on 16/6/13.
 */
public interface Hello {
    void printHello(String msg);

    /**
     * Created by liuzhe on 16/6/13.
     * 实现Hello接口
     */
    class HelloImpl implements Hello {
        public void printHello(String msg) {
            System.out.print("Hello from test02 " + msg);
        }
    }
}
