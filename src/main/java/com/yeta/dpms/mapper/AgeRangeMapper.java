package com.yeta.dpms.mapper;

import com.yeta.dpms.model.AgeRange;
import com.yeta.dpms.model.Region;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-18.
 */
public interface AgeRangeMapper {

    /**
     * 根据年龄段码获取年龄段
     * @param age_range_code
     * @return
     */
    @Select("SELECT age_range_code, bottom_, top_ FROM age_range WHERE age_range_code = #{age_range_code}")
    AgeRange findOne(@Param("age_range_code") Integer age_range_code);
}
