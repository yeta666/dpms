package com.yeta.dpms.model;

/**
 * 行业实体
 * Created by Administrator on 2017-11-1.
 */
public class Profession {

    /**
     * 行业码
     */
    private Integer profession_code;

    /**
     * 行业名
     */
    private String profession_;

    public Profession() {
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
        return "Profession{" +
                "profession_code=" + profession_code +
                ", profession_='" + profession_ + '\'' +
                '}';
    }
}
