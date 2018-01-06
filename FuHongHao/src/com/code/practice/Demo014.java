package com.code.practice;

public class Demo014 {
    /**
     * 类型转换
     * @param args
     */
    public static void main(String[] args) {
        byte b=127;
        char c='a';
        int i=100;
        float f=3.1415f;
        double d=22.22;
        //低转高
        System.out.println("转成char："+(b+c));
        System.out.println("转成int："+(b+c+i));
        System.out.println("转成float："+(b+c+i+f));
        System.out.println("转成double："+(b+c+i+f+d));
        //高转低
        System.out.println("double转成int：");
        System.out.println("float转成int：");
        System.out.println("int转成char：");
    }
}
