package com.yiyi.comm.out;

/**
 * Created by liuzhe on 16/6/13.
 */
public class PrintHelper {
    Printer printer;

    public PrintHelper(Printer printer){
        this.printer = printer;
    }

    public void print(){
        printer.print("test");
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
