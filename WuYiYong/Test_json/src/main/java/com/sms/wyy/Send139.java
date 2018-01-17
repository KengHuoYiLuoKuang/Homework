package com.sms.wyy;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Send139 {
    public static void main(String[] args) throws Exception {
        //获取远程资源并发送邮件
        EmailUtil.send(ContentUtil.getcontent()+"==>>(^.^)(^.^)晚安!");


    }
}
