package com.code.practice;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo013 {
    public static void main(String[] args) {
        PrintStream out=System.out;
        PrintStream ps= null;
        try {
            ps = new PrintStream("./log.txt");
            System.setOut(ps);
            System.out.println("这是一个新的输出流");
            System.setOut(out);
            System.out.println("输入完毕请查看");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
