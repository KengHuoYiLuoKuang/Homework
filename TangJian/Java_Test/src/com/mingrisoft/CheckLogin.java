package com.mingrisoft;

import java.util.Scanner;

public class CheckLogin { //登陆验证
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入你的用户名：");//提示用户输入用户名
        String username=scanner.nextLine();//获取用户输入的内容
        System.out.println("请输入你的密码：");//提示用户输入密码
        String password=scanner.nextLine();//获取用户输入的内容
        if(!username.equals("mi")){//判断用户名是否正确
            System.out.println("用户名错误！");//提示用户名输入错误
        }
        else if(!password.equals("soft")){//判断密码是否正确
            System.out.println("密码错误！");//提示用户密码输入错误
        }
        else{
            System.out.println("恭喜你登陆成功！");//提示用户登录成功
        }
    }
}
