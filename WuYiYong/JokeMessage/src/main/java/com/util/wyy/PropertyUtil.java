package com.util.wyy;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyUtil {

    public static Properties getProperty(String file) throws Exception {
        Properties prop = new Properties();
        //读取属性文件a.properties
        InputStreamReader in = new InputStreamReader(new FileInputStream(file),"utf-8");
        prop.load(in);     ///加载属性列表
        return prop;
    }
    public static String readProperties(Properties p,String key){
        return p.getProperty(key);
    }


   //测试方法
    public static void main(String[] args) throws Exception {
        Properties prop = PropertyUtil.getProperty("mail.properties");
        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + " " + prop.getProperty( key));
        }
    }

}
