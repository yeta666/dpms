package com.yeta.dpms.model;

/**
 * 区实体
 * Created by Administrator on 2017-10-31.
 */
public class Region {

    /**
     * 区码
     */
    private Integer region_code;

    /**
     * 区名
     */
    private String region_;

    /**
     * 所属市码
     */
    private Integer city_code;

    /**
     * 人口
     */
    private Integer region_people_number;

    public Region() {
    }

    public Integer getRegion_code() {
        return region_code;
    }

    public void setRegion_code(Integer region_code) {
        this.region_code = region_code;
    }

    public String getRegion_() {
        return region_;
    }

    public void setRegion_(String region_) {
        this.region_ = region_;
    }

    public Integer getCity_code() {
        return city_code;
    }

    public void setCity_code(Integer city_code) {
        this.city_code = city_code;
    }

    public Integer getRegion_people_number() {
        return region_people_number;
    }

    public void setRegion_people_number(Integer region_people_number) {
        this.region_people_number = region_people_number;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_code=" + region_code +
                ", region_='" + region_ + '\'' +
                ", city_code=" + city_code +
                ", region_people_number=" + region_people_number +
                '}';
    }
}
