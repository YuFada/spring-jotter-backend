package com.evan.wj.utils;

import java.util.Random;

/**
 * @author fada.yu
 * @date 2020/8/21 16:29
 * @Description：
 */
public class StringUtils {
    //测试util使用
    public static void main(String[] args) {
        String randomString = StringUtils.getRandomString(20);
        System.out.println(randomString);
    }

    public static String getRandomString(int length){
        String base="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <length ; i++) {
            int num = random.nextInt(base.length());
            sb.append(base.charAt(num));

        }
        return sb.toString();
    }
}


