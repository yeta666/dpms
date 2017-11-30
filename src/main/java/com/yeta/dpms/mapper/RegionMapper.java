package com.yeta.dpms.mapper;

import com.yeta.dpms.model.Region;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-18.
 */
public interface RegionMapper {

    /**
     * 根据市码获取所有区
     * @param cityCode
     * @return
     */
    @Select("SELECT region_code, region_, city_code, region_people_number FROM region WHERE city_code = #{cityCode}")
    List<Region> findAllByCityCode(Integer cityCode);
}
