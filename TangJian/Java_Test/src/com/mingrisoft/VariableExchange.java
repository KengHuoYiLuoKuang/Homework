package com.mingrisoft;

import java.util.Scanner;

public class VariableExchange { //通过位运算中的异或运算符“^”实现两个变量的互相转换
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入变量A:");//提示用户输入变量A的值
        long A = scan.nextLong();//获取用户输入的变量A的值
        System.out.println("请输入变量B:");//提示用户输入变量B的值
        long B = scan.nextLong();//获取用户输入的变量B的值
        System.out.println("A=" + A + "\tB=" + B);//打印变量A和B没有转换之前的值
        System.out.println("接下来开始执行变量互换：");//提示用户本程序接下来将要做的事
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);//打印变量A和B转换之后的值
    }
}
