package com.yeta.dpms.model;

/**
 * 市实体
 * Created by Administrator on 2017-11-1.
 */
public class City {

    /**
     * 市码
     */
    private Integer city_code;

    /**
     * 市名
     */
    private String city_;

    /**
     * 所属省码
     */
    private Integer province_code;

    public City() {
    }

    public Integer getCity_code() {
        return city_code;
    }

    public void setCity_code(Integer city_code) {
        this.city_code = city_code;
    }

    public String getCity_() {
        return city_;
    }

    public void setCity_(String city_) {
        this.city_ = city_;
    }

    public Integer getProvince_code() {
        return province_code;
    }

    public void setProvince_code(Integer province_code) {
        this.province_code = province_code;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_code=" + city_code +
                ", city_='" + city_ + '\'' +
                ", province_code=" + province_code +
                '}';
    }
}
