package com.mingrisoft;

import java.util.Scanner;

public class ParityCheck {  //这是一个判断输入整数的奇偶性的类
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个整数：");//提示用户输入
        long number=scanner.nextLong();//获取用户输入的内容
        String check=(number%2==0)?"这个数字是偶数":"这个数字是奇数";//判断用户输入的数字的奇偶性
        System.out.println(check);//打印结果
    }
}
