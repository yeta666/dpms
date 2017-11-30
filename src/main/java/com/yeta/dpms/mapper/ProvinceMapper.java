package com.yeta.dpms.mapper;

import com.yeta.dpms.model.Province;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-17.
 */
public interface ProvinceMapper {

    /**
     * 获取所有数据
     * @return
     */
    @Select("SELECT province_code, province_ FROM province where province_ = '四川省' or province_ = '广东省'")
    List<Province> findAll();
}
