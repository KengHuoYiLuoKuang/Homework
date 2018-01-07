package ding;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num=scanner.nextInt();
       String s=(num%2==0)?"这是个偶数":"这是个奇数";
        System.out.println(s);
    }
}
