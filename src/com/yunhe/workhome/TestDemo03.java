package com.yunhe.workhome;

import java.util.Scanner;

public class TestDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个字符串");
            String s = sc.nextLine();
            if(s.equals("exit")){
                break;
            }
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length/2; i++) {
                char n =  chars[i];
                chars[i] = chars[chars.length-1-i];
                chars[chars.length-1-i]=n;
            }
            String s1 = new String(chars);
            if(s.equals(s1)){
                System.out.println(s+"对称");
            }else {
                System.out.println(s+"不对称");
            }
        }


    }
}
