package com.nnf.signapptest;

public class PrintThread extends Thread {
    private String msg;

    public PrintThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        // do nothing
    }

    public void print() {
        System.out.println(msg);
    }
}
