package com.code.practice;

public class Demo018 {
    /**
     * 不借助第三个变量完成两个变量的交换
     * @param args
     */
    public static void main(String[] args) {
        int i1=1;
        int i2=2;
        System.out.println("交换前i1="+i1+",i2="+i2);
        if(i1<i2){
            i1=i1+i2;
            i2=i1-i2;
            i1=i1-i2;
        }
        System.out.println("交换后i1="+i1+",i2="+i2);
    }
}
