package test1;

public class Test14 {
    public static void main(String[] args) {
        byte b=127;//定义一个字节型变量
        char c='W';//定义一个字符变量
        short s=23561;//定义一个短整型变量
        int i=3333;//定义一个整形变量
        long l=400000L;//定义一个长整型变量
        float f=3.14159F;//定义一个单精度浮点型变量
        double d=54.555;//定义一个双精度浮点型变量
        //开始输出累加结果
        System.out.println("累加byte等于："+b);
        System.out.println("累加char等于："+(b+c));
        System.out.println("累加short等于："+(b+c+s));
        System.out.println("累加int等于："+(b+c+s+i));
        System.out.println("累加long等于："+(b+c+s+i+l));
        System.out.println("累加float等于："+(b+c+s+i+l+f));
        System.out.println("累加double等于："+(b+c+s+i+l+f+d));
    }
}
