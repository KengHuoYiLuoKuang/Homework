package ding;


import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);     //创建扫描器
        System.out.println("请输入员工姓名:");
        String name=scanner.nextLine();             //获取员工姓名
        System.out.println("请输入员工编程语言:");
        String lang=scanner.nextLine();             //获取员工应聘语言
        //根据编程语言分配部门
       switch(lang.hashCode()){
            case 3254818:           //java哈希编码
            case 2301506:           //Java哈希编码
            case 2269730:           //JAVA哈希编码
                System.out.println("员工"+name+"被分配到Java程序开发部门");
                break;
            case 3104:              //c#哈希编码
            case 2112:              //C#哈希编码
                System.out.println("员工"+name+"被分配到C#程序开发部门");
                break;
           case 955463181:          //Asp.net哈希编码
           case 9745901:            //ASP.NET哈希编码
               System.out.println("员工"+name+"被分配到Asp.net程序开发部门");
                break;
           case 110968:             //php哈希编码
           case 2650:               //PHP哈希编码
               System.out.println("员工"+name+"被分配到php程序开发部门");
               default:
                System.out.println("本公司不需要"+lang+"语言开发人员。");
        }
    }
}
