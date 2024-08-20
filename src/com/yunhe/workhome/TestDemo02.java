package com.yunhe.workhome;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入输入一个日期（yyyy-MM-dd）");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串转换为日期
        Date date = format.parse(s);
        //将日期转换为字符串
        String s1 = format.format(date);
        System.out.println(s1);
    }

}
