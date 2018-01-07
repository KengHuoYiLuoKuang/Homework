package ding;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入消费的金额:");
        float money=scanner.nextFloat();
        String rebate=null;
        if(money>200){
            int grade=(int)money/200;
            switch(grade){
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
                    rebate="八折";
                    break;
                case 5:
                    rebate="七五折";
                    break;
                case 6:
                    rebate="七折";
                    break;
                case 7:
                    rebate="六五折";
                    break;
                case 8:
                    rebate="六折";
                    break;
                    default:
                        rebate="五五折";
            }
        }
        System.out.println("您的累积消费为:"+money);
        System.out.println("您将享受"+rebate+"优惠");
    }
}
