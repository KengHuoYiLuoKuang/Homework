package ding;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );    //创建输入流扫描器
        System.out.println("请输入身份证号:");     //用户提示
        String id=scanner.nextLine();                //获取输入信息
        System.out.println("你的身份证是"+id.length()+"位"); //打印输入长度
    }
}
