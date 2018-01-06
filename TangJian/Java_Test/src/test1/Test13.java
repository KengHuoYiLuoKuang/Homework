package test1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test13 {
    public static void main(String[] args) {
        try {
            PrintStream out=System.out;//保存元输出流
            PrintStream ps=new PrintStream("/log.txt");//创建文件输出流
            System.setOut(ps);//设置使用新的输出流
            int age=20;//定义一个整形变量
            System.out.println("年龄变量定义成功，初始值为20");
            String sex="男";//定义一个字符串变量
            System.out.println("性别变量定义成功，初始值为男");
            String info="这是一个"+age+"岁的"+sex+"孩子";//把前两个变量整合
            System.out.println(info);//输出整合后的字符串变量info
            System.setOut(out);//恢复原有输出流
            System.out.println("程序运行完毕，请查看日志文件。");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
