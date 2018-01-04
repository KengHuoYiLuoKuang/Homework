package ding;

public class TypeConversion {
    public static void main(String[] args) {
        byte b=127;
        char c='C';
        int i=40;
        float f=2.256F;
        double d=5.55;
        long l=123456L;
        short s=25123;
        //低类型到高类型自动转换
        System.out.println("累加byte："+(b+1));
        System.out.println("累加char："+(b+c));
        System.out.println("累加short："+(b+c+s));
        System.out.println("累加int："+(b+c+s+i));
        System.out.println("累加float："+(b+c+s+i+f));
        System.out.println("累加double："+(b+c+s+i+f+d));
        System.out.println("累加long："+(b+c+s+i+f+d+l));
        //高类型到低类型强制转换
        System.out.println("long强制转换为int:"+(int)l);
        //高类型到低类型强制转换会丢数据
        System.out.println("long强制转换为short:"+(short)l);
        //高类型到低类型强制转换丢精度
        System.out.println("float强制转换为int:"+(int)f);
        //高类型到低类型强制转换会转化为对应编码的字符
        System.out.println("int强制转换为char:"+(char)i);
    }
}
