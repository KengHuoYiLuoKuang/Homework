package ding;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);     //创建扫描器
        System.out.println("请输入一个年份:");
        int year=scanner.nextInt();                 //获取输入的值
        if(year%4==0&&year%100!=0||year%400==0){    //判断是不是闰年
            System.out.println(year+"年是闰年");
        }
        else
            System.out.println(year+"年不是闰年");
    }
}
