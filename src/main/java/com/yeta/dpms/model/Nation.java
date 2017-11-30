package com.yeta.dpms.model;

/**
 * 民族实体
 * Created by Administrator on 2017-11-1.
 */
public class Nation {

    /**
     * 民族码
     */
    private Integer nation_code;

    /**
     * 民族名称
     */
    private String nation_;

    public Nation() {
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

    @Override
    public String toString() {
        return "Nation{" +
                "nation_code=" + nation_code +
                ", nation_='" + nation_ + '\'' +
                '}';
    }
}
