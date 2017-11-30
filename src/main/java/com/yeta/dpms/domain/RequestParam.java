package com.yeta.dpms.domain;

import com.yeta.dpms.model.User;

import java.util.Arrays;

/**
 * 接收查询参数的对象
 * Created by Administrator on 2017-11-28.
 */
public class RequestParam {

    /**
     * 省码
     */
    private Integer provinceCode;

    /**
     * 市码
     */
    private Integer cityCode;

    /**
     * 区码
     */
    private Integer regionCode;

    /**
     * 日志码
     */
    private int[] logCodeArr;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public RequestParam() {
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public int[] getLogCodeArr() {
        return logCodeArr;
    }

    public void setLogCodeArr(int[] logCodeArr) {
        this.logCodeArr = logCodeArr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RequestParam{" +
                "provinceCode=" + provinceCode +
                ", cityCode=" + cityCode +
                ", regionCode=" + regionCode +
                ", logCodeArr=" + Arrays.toString(logCodeArr) +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
