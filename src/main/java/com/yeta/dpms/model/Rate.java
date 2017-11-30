package com.yeta.dpms.model;

/**
 * 年末常住人口、出生率、死亡率、自然增长率实体
 * Created by Administrator on 2017-11-29.
 */
public class Rate {

    /**
     * 码
     */
    private Integer rate_code;

    /**
     * 年份
     */
    private Integer year_;

    /**
     * 年末常住人口
     * 单位：万
     */
    private double people_number;

    /**
     * 出生率 - 省
     */
    private double province_birth_rate;

    /**
     * 死亡率 - 省
     */
    private double province_death_rate;

    /**
     * 自然增长率 - 省
     */
    private double province_growth_rate;

    /**
     * 出生率 - 市
     */
    private double city_birth_rate;

    /**
     * 死亡率 - 市
     */
    private double city_death_rate;

    /**
     * 自然增长率 - 市
     */
    private double city_growth_rate;

    /**
     * 出生率 - 县
     */
    private double region_birth_rate;

    /**
     * 死亡率 - 县
     */
    private double region_death_rate;

    /**
     * 自然增长率 - 县
     */
    private double region_growth_rate;

    public Rate() {
    }

    public Integer getRate_code() {
        return rate_code;
    }

    public void setRate_code(Integer rate_code) {
        this.rate_code = rate_code;
    }

    public Integer getYear_() {
        return year_;
    }

    public void setYear_(Integer year_) {
        this.year_ = year_;
    }

    public double getPeople_number() {
        return people_number;
    }

    public void setPeople_number(double people_number) {
        this.people_number = people_number;
    }

    public double getProvince_birth_rate() {
        return province_birth_rate;
    }

    public void setProvince_birth_rate(double province_birth_rate) {
        this.province_birth_rate = province_birth_rate;
    }

    public double getProvince_death_rate() {
        return province_death_rate;
    }

    public void setProvince_death_rate(double province_death_rate) {
        this.province_death_rate = province_death_rate;
    }

    public double getProvince_growth_rate() {
        return province_growth_rate;
    }

    public void setProvince_growth_rate(double province_growth_rate) {
        this.province_growth_rate = province_growth_rate;
    }

    public double getCity_birth_rate() {
        return city_birth_rate;
    }

    public void setCity_birth_rate(double city_birth_rate) {
        this.city_birth_rate = city_birth_rate;
    }

    public double getCity_death_rate() {
        return city_death_rate;
    }

    public void setCity_death_rate(double city_death_rate) {
        this.city_death_rate = city_death_rate;
    }

    public double getCity_growth_rate() {
        return city_growth_rate;
    }

    public void setCity_growth_rate(double city_growth_rate) {
        this.city_growth_rate = city_growth_rate;
    }

    public double getRegion_birth_rate() {
        return region_birth_rate;
    }

    public void setRegion_birth_rate(double region_birth_rate) {
        this.region_birth_rate = region_birth_rate;
    }

    public double getRegion_death_rate() {
        return region_death_rate;
    }

    public void setRegion_death_rate(double region_death_rate) {
        this.region_death_rate = region_death_rate;
    }

    public double getRegion_growth_rate() {
        return region_growth_rate;
    }

    public void setRegion_growth_rate(double region_growth_rate) {
        this.region_growth_rate = region_growth_rate;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "rate_code=" + rate_code +
                ", year_=" + year_ +
                ", people_number=" + people_number +
                ", province_birth_rate=" + province_birth_rate +
                ", province_death_rate=" + province_death_rate +
                ", province_growth_rate=" + province_growth_rate +
                ", city_birth_rate=" + city_birth_rate +
                ", city_death_rate=" + city_death_rate +
                ", city_growth_rate=" + city_growth_rate +
                ", region_birth_rate=" + region_birth_rate +
                ", region_death_rate=" + region_death_rate +
                ", region_growth_rate=" + region_growth_rate +
                '}';
    }
}
