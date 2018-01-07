package ding;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );    //创建扫描器
        System.out.println("请输入一个整数:");
        int num=scanner.nextInt();                  //获取输入值
        System.out.println("你输入的数字是:"+num);
        System.out.println("该数字乘以2的运算结果为:"+(num<<1));//左移操作
        System.out.println("该数字乘以4的运算结果为:"+(num<<2));
        System.out.println("该数字乘以8的运算结果为:"+(num<<3));
        System.out.println("该数字乘以16的运算结果为:"+(num<<4));
    }
}
