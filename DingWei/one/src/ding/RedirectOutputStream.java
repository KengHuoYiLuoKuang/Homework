package ding;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        PrintStream out =System.out;            //原输出流
        try (PrintStream ps = new PrintStream("ding.txt")) {    //创建新输出流
            System.setOut(ps);                  //设置新的输出流
            String sex="男";
            String info="我是一个"+sex+"人!";
            System.out.println(info);           //打印信息到输出流
            System.setOut(out);                 //设置回原来的输出流
            System.out.println("程序运行结束!");//再次打印信息
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
