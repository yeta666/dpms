package com.yeta.dpms.model;

/**
 * 姓氏实体
 * Created by Administrator on 2017-11-1.
 */
public class LastName {

    /**
     * 姓氏码
     */
    private Integer last_name_code;

    /**
     * 姓氏
     */
    private String last_name;

    public LastName() {
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

    @Override
    public String toString() {
        return "LastName{" +
                "last_name_code=" + last_name_code +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
