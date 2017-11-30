package com.yeta.dpms.domain;

/**
 * 与年龄段有关的数据库查询返回数据接收对象
 * Created by Administrator on 2017-11-29.
 */
public class SQLAgeRange {

    /**
     * 年龄段码
     */
    private Integer age_range_code;

    /**
     * 年龄段下限
     */
    private Integer bottom_;

    /**
     * 年龄段上限
     */
    private Integer top_;

    /**
     * 年龄段总人口数量
     */
    private Integer count_;

    public SQLAgeRange() {
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

    public Integer getCount_() {
        return count_;
    }

    public void setCount_(Integer count_) {
        this.count_ = count_;
    }

    @Override
    public String toString() {
        return "SQLAgeRange{" +
                "age_range_code=" + age_range_code +
                ", bottom_=" + bottom_ +
                ", top_=" + top_ +
                ", count_=" + count_ +
                '}';
    }
}
