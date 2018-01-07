package com.lsxy.ussd;

import com.ussd.client.GPOauthClient;
import com.ussd.client.def.DefaultGPOauthClient;
import com.ussd.client.model.GPSendRequest;
import com.ussd.client.model.GPSmsSendResponse;
import com.ussd.client.weibo4j.model.WeiboException;

/**
 * Created by tandy on 16/11/11.
 */
public class SendMessage {
    public static void send() throws WeiboException {
        String url = "https://120.77.56.61:9443";
        String appkey = "94306e33-aa15-47a5-ab3b-d4c9f7e8e3aa"; //应用分配的app_key
        String secret = "7Pq5wnZu5JfqkGB05LhaDQ=="; //申请应用时分配的app_secret
        String username = "10001"; //授权用户的用户名 String password = "123456"; //授权用户的密码
        String password = "123456";

        GPOauthClient client = new DefaultGPOauthClient(url, appkey, secret,username,password);
        GPSendRequest req = new GPSendRequest();

        req.setTempId("200442"); //设置模板ID
        req.setDestPhone("13971068693");//设置接收号码
        //18602015268

        req.setTempArgs("content1:123456;content2:流水行云 *-*！！"); //设置模板参数,如模板无参数则此行可不要
        long sdt = System.currentTimeMillis();
        GPSmsSendResponse rsp = client.execute(req); //发送请求
        System.out.println(rsp.getBody());//输出返回消息

        System.out.println((System.currentTimeMillis() - sdt)/1000 + "S");

        sdt = System.currentTimeMillis();
        rsp = client.execute(req); //发送请求
        System.out.println(rsp.getBody());//输出返回消息
        System.out.println((System.currentTimeMillis() - sdt)/1000 + "S");

        sdt = System.currentTimeMillis();
        rsp = client.execute(req); //发送请求
        System.out.println(rsp.getBody());//输出返回消息
        System.out.println((System.currentTimeMillis() - sdt)/1000 + "S");
    }

    public static void main(String[] args) throws WeiboException {
        send();
    }
}
