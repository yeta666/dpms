package com.yeta.dpms.http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * http方法
 * Created by Administrator on 2017-10-19.
 */
@Component
public class MyHttpMethod {

    public MyHttpResult get(MyHttpParam param) throws IOException {

        //初始化返回结果
        MyHttpResult result = new MyHttpResult();

        //创建默认的httpClient实例
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //封装uri
        String uri = param.getUri();

        //创建httpget
        HttpGet get = new HttpGet(uri);

        //请求
        CloseableHttpResponse response = httpClient.execute(get);

        //封装返回结果
        result.setCode(response.getStatusLine().getStatusCode());
        result.setContent(EntityUtils.toString(response.getEntity(), "gb2312"));

        //关闭连接，释放内存
        response.close();
        httpClient.close();

        return result;
    }
}
