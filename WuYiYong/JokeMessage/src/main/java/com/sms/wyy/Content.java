package com.sms.wyy;

import com.alibaba.fastjson.JSON;
import com.util.wyy.AESUtil;
import com.util.wyy.HttpUtil;
import com.util.wyy.PropertyUtil;

import java.util.Date;
import java.util.Properties;

public class Content {
    public static String getcontent() throws Exception {
        String content;
        while (true) {
            //10位时间戳和 page
            String time = String.valueOf(new Date().getTime());
            time = time.substring(0, 10);
            //生成page
            int page = (int) (Math.random() * 40000);
            //读取配置文件
            Properties prop= PropertyUtil.getProperty("url.properties");
            //解密key
            String key = AESUtil.decrypt(prop.getProperty("key"),"wuyiyong");
            //拼接url
            String url = HttpUtil.createUrl(prop.getProperty("url"),key,page,prop.getProperty("rows"),prop.getProperty("srot"),time);
            //发http获取返回的jsonz字符串
            String response = HttpUtil.httpGet(url);
            //解析json
            QueryResultInfo queryResultInfo = JSON.parseObject(response, QueryResultInfo.class);
            content = queryResultInfo.getResult().get(0).getContent();
            if (content.length() < 140) {
                //System.out.println(content);
                break;
            }
        }
        return content;
    }


    //测试获取的笑话
    public static void main(String[] args) throws Exception {
        System.out.println(Content.getcontent());
    }
}
