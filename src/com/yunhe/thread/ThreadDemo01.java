package com.yunhe.thread;

public class ThreadDemo01 extends Thread{
    @Override
    public void run() {
        // 重写run方法
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);

        }
    }

}
