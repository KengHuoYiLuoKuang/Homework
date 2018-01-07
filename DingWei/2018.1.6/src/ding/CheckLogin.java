package ding;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);     //创建扫描器
        System.out.println("请输入用户名:");
        String username=scanner.nextLine();         //获取用户名
        System.out.println("请输入密码:");
        String psaaword=scanner.nextLine();         //获取密码
        if(!username.equals("ding"))                  //判断用户名合法性
            System.out.println("用户名非法。");
        else if(!psaaword.equals("wei"))        //判断密码是否正确
            System.out.println("登录密码错误。");
        else
            System.out.println("登录成功!");
    }
}
