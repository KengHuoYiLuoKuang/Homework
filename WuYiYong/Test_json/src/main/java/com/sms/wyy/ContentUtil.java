package com.sms.wyy;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class ContentUtil {
    public static String getcontent() throws Exception {
        String content;
        while (true) {
            //10位时间戳和 page
            String time = String.valueOf(new Date().getTime());
            time = time.substring(0, 10);
            //生成page
            int page = (int) (Math.random() * 40000);
            //读取配置文件
            Properties prop= PropertyUtil.getproperty("url.properties");
            //解密key
            String key = DecryptionTool.deciphering(prop.getProperty("key"));
            //拼接url
            String url = prop.getProperty("url")+"key="+key+"&page=" + page + "&rows="+prop.getProperty("rows")+"&sort="+prop.getProperty("sort")+"&time=" + time;
            //发http获取返回的json
            Response response = HttpUtil.httpGet(url);
            //解析json
            QueryResultInfo queryResultInfo = JSON.parseObject(response.body().string(), QueryResultInfo.class);
            content = queryResultInfo.getResult().get(0).getContent();
            if (content.length() < 140) {
                //System.out.println(content);
                break;
            }
        }
        return content;
    }



    public static void main(String[] args) throws Exception {
        System.out.println(ContentUtil.getcontent());

    }
}