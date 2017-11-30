package com.yeta.dpms.http;

import java.util.List;
import java.util.Map;

/**
 * http请求参数
 * Created by Administrator on 2017-10-19.
 */
public class MyHttpParam {

    /**
     * uri
     */
    private String uri;

    /**
     * 参数key
     */
    private List<String> paramKeyList;

    /**
     * 参数value
     */
    private Map<String, String> paramValueMap;

    public MyHttpParam() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<String> getParamKeyList() {
        return paramKeyList;
    }

    public void setParamKeyList(List<String> paramKeyList) {
        this.paramKeyList = paramKeyList;
    }

    public Map<String, String> getParamValueMap() {
        return paramValueMap;
    }

    public void setParamValueMap(Map<String, String> paramValueMap) {
        this.paramValueMap = paramValueMap;
    }
}
