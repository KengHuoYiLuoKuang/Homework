package ding;

public class OutputDebugAndError {
    public static void main(String[] args) {
        System.out.println("main方法开始!");    //输出调试信息
        System.err.println("这里有一个错!");    //输出错误信息
        System.err.println("请及时修改!");
        System.out.println("main方法结束!");
    }
}
