package com.mingrisoft;

import java.util.Scanner;

public class Demo { //计算闰年
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个年份：");//提示用户输入内容
        long year;//定义一个长整型变量
        try{
            year=scan.nextLong();//获取用户输入的年份
            if(year%4==0&&year%100!=0||year%400==0){//判断是否为闰年的条件
                System.out.println(year+"年是闰年");//打印判断结果
            }
            else{
                System.out.println(year+"年不是闰年");//打印判断结果
            }
        }catch (Exception E){
            System.out.println("您输入的不是有效的年份");//捕捉到的异常输入
        }
    }
}
