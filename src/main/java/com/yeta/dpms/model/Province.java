package com.yeta.dpms.model;

/**
 * 省实体
 * Created by Administrator on 2017-11-1.
 */
public class Province {

    /**
     * 省码
     */
    private Integer province_code;

    /**
     * 省名
     */
    private String province_;

    public Province() {
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

    @Override
    public String toString() {
        return "Province{" +
                "province_code=" + province_code +
                ", province_='" + province_ + '\'' +
                '}';
    }
}
