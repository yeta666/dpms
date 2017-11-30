package com.yeta.dpms.model;

/**
 * 四川2016年人口实体
 * Created by Administrator on 2017-11-17.
 */
public class People2016 {

    /**
     * id
     * 唯一标识
     */
    private Integer id_;

    /**
     * 身份证
     */
    private String id_number;

    /**
     * 姓氏码
     */
    private Integer last_name_code;

    /**
     * 姓氏
     */
    private String last_name;

    /**
     * 名字
     */
    private String first_name;

    /**
     * 性别
     * 1：男/0：女
     */
    private Integer gender_;

    /**
     * 年龄段码
     */
    private Integer age_range_code;

    /**
     * 年龄
     */
    private Integer age_;

    /**
     * 民族码
     */
    private Integer nation_code;

    /**
     * 民族
     */
    private String nation_;

    /**
     * 省码
     */
    private Integer province_code;

    /**
     * 省
     */
    private String province_;

    /**
     * 市码
     */
    private Integer city_code;

    /**
     * 市
     */
    private String city_;

    /**
     * 区码
     */
    private Integer region_code;

    /**
     * 区
     */
    private String region_;

    /**
     * 行业码
     */
    private Integer profession_code;

    /**
     * 行业
     */
    private String profession_;

    public People2016() {
    }

    public Integer getId_() {
        return id_;
    }

    public void setId_(Integer id_) {
        this.id_ = id_;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public Integer getLast_name_code() {
        return last_name_code;
    }

    public void setLast_name_code(Integer last_name_code) {
        this.last_name_code = last_name_code;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Integer getGender_() {
        return gender_;
    }

    public void setGender_(Integer gender_) {
        this.gender_ = gender_;
    }

    public Integer getAge_range_code() {
        return age_range_code;
    }

    public void setAge_range_code(Integer age_range_code) {
        this.age_range_code = age_range_code;
    }

    public Integer getAge_() {
        return age_;
    }

    public void setAge_(Integer age_) {
        this.age_ = age_;
    }

    public Integer getNation_code() {
        return nation_code;
    }

    public void setNation_code(Integer nation_code) {
        this.nation_code = nation_code;
    }

    public String getNation_() {
        return nation_;
    }

    public void setNation_(String nation_) {
        this.nation_ = nation_;
    }

    public Integer getProvince_code() {
        return province_code;
    }

    public void setProvince_code(Integer province_code) {
        this.province_code = province_code;
    }

    public String getProvince_() {
        return province_;
    }

    public void setProvince_(String province_) {
        this.province_ = province_;
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

    public Integer getProfession_code() {
        return profession_code;
    }

    public void setProfession_code(Integer profession_code) {
        this.profession_code = profession_code;
    }

    public String getProfession_() {
        return profession_;
    }

    public void setProfession_(String profession_) {
        this.profession_ = profession_;
    }

    @Override
    public String toString() {
        return "People2016{" +
                "id_=" + id_ +
                ", id_number='" + id_number + '\'' +
                ", last_name_code=" + last_name_code +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", gender_=" + gender_ +
                ", age_range_code=" + age_range_code +
                ", age_=" + age_ +
                ", nation_code=" + nation_code +
                ", nation_='" + nation_ + '\'' +
                ", province_code=" + province_code +
                ", province_='" + province_ + '\'' +
                ", city_code=" + city_code +
                ", city_='" + city_ + '\'' +
                ", region_code=" + region_code +
                ", region_='" + region_ + '\'' +
                ", profession_code=" + profession_code +
                ", profession_='" + profession_ + '\'' +
                '}';
    }
}
