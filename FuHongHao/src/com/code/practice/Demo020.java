package com.code.practice;

import java.util.Scanner;

public class Demo020 {
    /**
     * 使用equals()验证字符串是否相等
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.next();
        System.out.println("请输入密码：");
        String password=sc.next();
        if(!username.equals("Blankmargin")){
            System.out.println("非法用户名!");
        }else if(!password.equals("960131")){
            System.out.println("请输入正确的密码!");
        }else{
            System.out.println("登录成功!");
        }
    }
}
