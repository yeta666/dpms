package com.yeta.dpms.domain;

/**
 * 与行业有关的数据库查询返回数据接收对象
 * Created by Administrator on 2017-11-29.
 */
public class SQLProfession {

    /**
     * 行业码
     */
    private Integer profession_code;

    /**
     * 行业
     */
    private String profession_;

    /**
     * 人口数量
     */
    private Integer count_;

    public SQLProfession() {
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

    public Integer getCount_() {
        return count_;
    }

    public void setCount_(Integer count_) {
        this.count_ = count_;
    }

    @Override
    public String toString() {
        return "SQLProfession{" +
                "profession_code=" + profession_code +
                ", profession_='" + profession_ + '\'' +
                ", count_=" + count_ +
                '}';
    }
}
