package com.mingrisoft;

import java.util.Scanner;

public class ProductPrice {//通过运算获得用户等级并打印用户可以获得的折扣优惠
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("累计消费金额为：");//提示用户输入
        float money=scanner.nextFloat();//获取用户累计消费金额
        String rebate="";//用户可获得的折扣
        if(money>200){//判断用户累计消费金额是否已经达到可以获得优惠的程度
            int grade=(int) money/200;//计算用户等级
            switch (grade){
                case 1:
                    rebate="九五折";
                    break;
                case 2:
                    rebate="九折";
                    break;
                case 3:
                    rebate="八五折";
                    break;
                case 4:
                    rebate="八三折";
                    break;
                case 5:
                    rebate="八折";
                    break;
                case 6:
                    rebate="七八折";
                    break;
                case 7:
                    rebate="七五折";
                    break;
                case 8:
                    rebate="七三折";
                    break;
                case 9:
                    rebate="七折";
                    break;
                case 10:
                    rebate="六五折";
                    break;
                default:
                    rebate="六折";
            }
        }
        System.out.println("您的累计消费金额为："+money);//打印用户已经消费的金额
        System.out.println("您将享受"+rebate+"优惠");//打印用户可以获得的优惠
    }
}
