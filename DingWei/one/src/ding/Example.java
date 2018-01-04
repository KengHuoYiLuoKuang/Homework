package ding;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);   //创建输入流扫描器
        System.out.println("请输入一个字符串:");    //提示信息
        String pw=scanner.nextLine();               //获取输入
        char[] a=pw.toCharArray();                  //转换为字符数组
        for(int i=0;i<a.length;i++){                //便利数组
            a[i]=(char)(a[i]^5);
        }
        System.out.println("加密后:");
        System.out.println(new String(a));
    }
}
