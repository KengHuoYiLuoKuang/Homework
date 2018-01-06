package com.mingrisoft;

import java.util.Scanner;

public class Example { //这是一个进行位运算的类
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个整数:");//提示用户输入
        long number=scanner.nextLong();//获取用户输入的内容
        System.out.println("输入的整数是："+number);
        System.out.println("这个整数乘以2的结果为："+(number<<1));
        System.out.println("这个整数乘以4的结果为："+(number<<2));
        System.out.println("这个整数乘以8的结果为："+(number<<3));
        System.out.println("这个整数乘以16的结果为："+(number<<54));
    }
}
