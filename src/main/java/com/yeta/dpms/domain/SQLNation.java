package com.yeta.dpms.domain;

/**
 * 与民族有关的数据库查询返回数据接收对象
 * Created by Administrator on 2017-11-29.
 */
public class SQLNation {

    /**
     * 民族码
     */
    private Integer nation_code;

    /**
     * 民族
     */
    private String nation_;

    /**
     * 人口数量
     */
    private Integer count_;

    public SQLNation() {
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

    public Integer getCount_() {
        return count_;
    }

    public void setCount_(Integer count_) {
        this.count_ = count_;
    }

    @Override
    public String toString() {
        return "SQLNation{" +
                "nation_code=" + nation_code +
                ", nation_='" + nation_ + '\'' +
                ", count_=" + count_ +
                '}';
    }
}
