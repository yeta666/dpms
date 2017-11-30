package com.yeta.dpms.domain;

/**
 * 与性别有关的数据库查询返回数据接收对象
 * Created by Administrator on 2017-11-28.
 */
public class SQLGender {

    /**
     * 性别
     */
    private Integer gender_;

    /**
     * 总数
     */
    private Integer count_;

    public SQLGender() {
    }

    public Integer getGender_() {
        return gender_;
    }

    public void setGender_(Integer gender_) {
        this.gender_ = gender_;
    }

    public Integer getCount_() {
        return count_;
    }

    public void setCount_(Integer count_) {
        this.count_ = count_;
    }

    @Override
    public String toString() {
        return "SQLGender{" +
                "gender_=" + gender_ +
                ", count_=" + count_ +
                '}';
    }
}
