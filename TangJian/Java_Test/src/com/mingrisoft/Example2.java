package com.mingrisoft;

import com.sun.java.util.jar.pack.*;

import java.util.Scanner;

public class Example2 {//通过扫描器获取人事部门输入的新员工姓名和应聘的编程语言，然后根据每种语言对应的哈希码来判断分配的部门
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入新员工的姓名：");//提示用户输入
        String name=scanner.nextLine();//获取用户输入的新员工的姓名
        System.out.println("请输入新员工应聘的编程语言：");//提示用户输入
        String language=scanner.nextLine();//获取用户输入的新员工应聘的编程语言
        //根据编程语言确定员工分配部门
        switch(language.hashCode()){
            case 3254818://java的哈希码
            case 2301506://Java的哈希码
            case 2269730://JAVA的哈希码
                System.out.println("员工" + name + "被分配到java部门。");//打印员工分配的部门
                break;//对多个条件采取相同业务操作时可以把多个条件关联在一起，省略他们之间的“break;”，而在最后一个相同的条件分支实现业务处理并执行break。
            case 3104://c#的哈希码
            case 2112://C#的哈希码
                System.out.println("员工" + name + "被分配到C#部门。");//打印员工分配的部门
                break;
            case -709190099://asp.net的哈希码
            case 955463181://Asp.net的哈希码
            case 9745901://ASP.net的哈希码
                System.out.println("员工" + name + "被分配到Asp.net部门。");//打印员工分配的部门
                break;
            default:
                System.out.println("本公司不需要" + language + "语言的程序员。");
        }
    }
}
