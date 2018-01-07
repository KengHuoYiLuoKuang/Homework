package ding;

import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);   //创建扫描器
        System.out.println("请输入变量A的值:");
        int A =scanner.nextInt();                //获取第一个变量的值
        System.out.println("请输入变量B的是值:");
        int B =scanner.nextInt();               //获取第二个变量的值
        System.out.println("A="+A+"\tB="+B);
        System.out.println("变量互换..");
        A=A^B;                                  //异或操作
        B=B^A;
        A=A^B;
        System.out.println("A="+A+"\tB="+B);
    }
}
