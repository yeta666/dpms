package com.yeta.dpms.domain;

/**
 * 返回前端的对象
 * Created by Administrator on 2017-11-23.
 */
public class ResponseResult {

    /**
     * 请求状态
     */
    private boolean request;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 提示消息
     */
    private String message;

    public ResponseResult() {
    }

    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "request=" + request +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
