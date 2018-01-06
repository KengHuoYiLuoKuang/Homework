package com.code.practice;


import java.util.Arrays;
import java.util.Scanner;

public class Demo012 {
    /***
     *
     *
     * 控制台接收输入字符
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入需要接收的字符");
        String str="";
        str=scanner.next();
        System.out.println("输入的字符是:"+str);
    }
}
