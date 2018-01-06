package com.code.practice;

import java.util.Scanner;

public class Demo021 {
    /**
     * 使用switch为员工分类
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入该员工的编程语言:");
        String language=sc.next();
        switch (language){
            case "Java":
                System.out.println("该员工被分配到Java开发组");
                break;
            case "C++":
                System.out.println("该员工被分配到C++开发组");
                break;
            case "PHP":
                System.out.println("该员工被分配到PHP开发组");
                break;
            case "Pathon":
                System.out.println("该员工被分配到Pathon开发组");
                break;
                default:
                    System.out.println("本公司不需要"+language+"语言的开发人员");
        }
    }
}
