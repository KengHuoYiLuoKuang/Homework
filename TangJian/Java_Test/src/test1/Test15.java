package test1;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个英文字符串或解密字符串：");
        String password=scanner.nextLine();//获取用户输入的内容
        char[] array=password.toCharArray();//获取字符串数组
        for(int i=0;i<array.length;i++){
            array[i]=(char) (array[i]^2000);//对每个数组元素进行异或运算
        }
        System.out.println("加密或解密结果如下");
        System.out.println(new String(array));//输出密钥
    }
}
