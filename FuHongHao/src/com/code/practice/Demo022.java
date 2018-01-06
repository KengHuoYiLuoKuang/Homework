package com.code.practice;

import java.util.Scanner;

public class Demo022 {
    /**
     * 使用switch根据金额计算折扣
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的消费金额:");
        int money=sc.nextInt();
        String rebatc=null;
        if(money>=200){
            int grade=money/100;
            switch(grade){
                case 2:
                    rebatc="9折";
                    break;
                case 3:
                    rebatc="8折";
                    break;
                case 4:
                    rebatc="7折";
                    break;
                case 5:
                    rebatc="6折";
                    break;
                    default:
                        rebatc="5折";

            }
            System.out.println("您消费金额为："+money+",享受折扣为："+rebatc);
        }else{
            System.out.println("您的消费金额尚未到达享受折扣的要求!");
        }
    }
}
