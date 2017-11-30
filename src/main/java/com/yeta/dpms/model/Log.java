package com.yeta.dpms.model;

import java.sql.Time;
import java.util.Date;

/**
 * 日志实体
 * Created by Administrator on 2017-11-30.
 */
public class Log {

    /**
     * 日志码
     */
    private Integer log_code;

    /**
     * 日志日期
     */
    private Date log_date_time;

    /**
     * 请求uri
     */
    private String request_uri;

    /**
     * 请求方法
     */
    private String request_method;

    /**
     * 请求参数
     */
    private String request_param;

    /**
     * 返回内容
     */
    private String response_content;

    /**
     * 耗时
     * 秒
     */
    private double spend_time;

    public Log() {
    }

    public Integer getLog_code() {
        return log_code;
    }

    public void setLog_code(Integer log_code) {
        this.log_code = log_code;
    }

    public Date getLog_date_time() {
        return log_date_time;
    }

    public void setLog_date_time(Date log_date_time) {
        this.log_date_time = log_date_time;
    }

    public String getRequest_uri() {
        return request_uri;
    }

    public void setRequest_uri(String request_uri) {
        this.request_uri = request_uri;
    }

    public String getRequest_method() {
        return request_method;
    }

    public void setRequest_method(String request_method) {
        this.request_method = request_method;
    }

    public String getRequest_param() {
        return request_param;
    }

    public void setRequest_param(String request_param) {
        this.request_param = request_param;
    }

    public String getResponse_content() {
        return response_content;
    }

    public void setResponse_content(String response_content) {
        this.response_content = response_content;
    }

    public double getSpend_time() {
        return spend_time;
    }

    public void setSpend_time(double spend_time) {
        this.spend_time = spend_time;
    }

    @Override
    public String toString() {
        return "Log{" +
                "log_code=" + log_code +
                ", log_date_time=" + log_date_time +
                ", request_uri='" + request_uri + '\'' +
                ", request_method='" + request_method + '\'' +
                ", request_param='" + request_param + '\'' +
                ", response_content='" + response_content + '\'' +
                ", spend_time=" + spend_time +
                '}';
    }
}
