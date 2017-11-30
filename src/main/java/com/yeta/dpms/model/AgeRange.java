package com.yeta.dpms.model;

/**
 * 年龄段实体
 * Created by Administrator on 2017-11-2.
 */
public class AgeRange {

    /**
     * 年龄段码
     */
    private Integer age_range_code;

    /**
     * 下限
     */
    private Integer bottom_;

    /**
     * 上限
     */
    private Integer top_;

    public AgeRange() {
    }

    public Integer getAge_range_code() {
        return age_range_code;
    }

    public void setAge_range_code(Integer age_range_code) {
        this.age_range_code = age_range_code;
    }

    public Integer getBottom_() {
        return bottom_;
    }

    public void setBottom_(Integer bottom_) {
        this.bottom_ = bottom_;
    }

    public Integer getTop_() {
        return top_;
    }

    public void setTop_(Integer top_) {
        this.top_ = top_;
    }

    @Override
    public String toString() {
        return "AgeRange{" +
                "age_range_code=" + age_range_code +
                ", bottom_=" + bottom_ +
                ", top_=" + top_ +
                '}';
    }
}
