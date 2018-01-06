package com.code.practice;

import java.util.Scanner;

public class Demo015 {
    /**
     * 使用位运算符实现简单的加密
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str=sc.next();
        char[] chars = str.toCharArray();
        String[] str2=new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i]=(char)(chars[i]^2000);
        }
        System.out.println("加密后结果为：");
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i]=(char)(chars[i]^2000);
        }
        System.out.println("解密后结果为：");
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
