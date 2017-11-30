package com.yeta.dpms.domain;

/**
 * 与姓氏有关的数据库查询返回数据接收对象
 * Created by Administrator on 2017-11-29.
 */
public class SQLLastName {

    /**
     * 姓氏码
     */
    private Integer last_name_code;

    /**
     * 姓氏
     */
    private String last_name;

    /**
     * 人口数量
     */
    private Integer count_;

    public SQLLastName() {
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

    public Integer getCount_() {
        return count_;
    }

    public void setCount_(Integer count_) {
        this.count_ = count_;
    }

    @Override
    public String toString() {
        return "SQLLastName{" +
                "last_name_code=" + last_name_code +
                ", last_name='" + last_name + '\'' +
                ", count_=" + count_ +
                '}';
    }
}
