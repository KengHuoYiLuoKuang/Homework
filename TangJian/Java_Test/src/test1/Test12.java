package test1;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入你的身份证号:");//提示用户输入自己的身份证号
        String s=scanner.nextLine();//获取用户输入的内容
        System.out.println("你的身份证号有"+s.length()+"位");//打印用户的身份证号的位数
    }
}
