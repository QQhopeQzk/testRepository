package com.yunhe.workhome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class TestDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字字符串");
        String str = sc.nextLine();
        String[] split = str.split("[，,.]");
        Map<String,Integer> map = new HashMap<>();
        for (String s : split) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        map.forEach(( key,  value)-> {
            System.out.println(key+"出现了"+value+"次");
        });

    }

}
