package com.yunhe.Util;

import java.util.Random;

public class RandomUtil {
    public static String getRandomString() {
        //返回一个16位的随机字符串
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 创建一个长度为length的随机字符串
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int a = random.nextInt(61);
            sb.append(base.charAt(a));
        }

        return sb.toString();

    }

}
