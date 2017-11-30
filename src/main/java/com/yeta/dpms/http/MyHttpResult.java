package com.yeta.dpms.http;

/**
 * http请求结果封装类
 * Created by Administrator on 2017-10-19.
 */
public class MyHttpResult {

    /**
     * 状态码
     */
    private int code;

    /**
     * 内容
     */
    private String content;

    public MyHttpResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
