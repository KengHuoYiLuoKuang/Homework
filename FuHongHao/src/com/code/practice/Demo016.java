package com.code.practice;

import java.util.Scanner;

public class Demo016 {
    /**
     * 三元运算符判断奇偶数
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i=sc.nextInt();
        System.out.println((i%2==0)?"偶数":"奇数");
    }
}
