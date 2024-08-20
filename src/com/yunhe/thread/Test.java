package com.yunhe.thread;

public class Test {
    public static void main(String[] args) {
        Thread t01 = new ThreadDemo01();
        t01.setName("t01");
        Thread t02 = new ThreadDemo01();
        t02.setName("t02");
        Thread t03 = new ThreadDemo01();
        t03.setName("t03");

        t01.start();
        t02.start();
        t03.start();
    }
}
