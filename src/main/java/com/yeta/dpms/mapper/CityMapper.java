package com.yeta.dpms.mapper;

import com.yeta.dpms.model.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-24.
 */
public interface CityMapper {

    /**
     * 根据省码查询所有市
     * @param provinceCode
     * @return
     */
    @Select("SELECT city_code, city_, province_code FROM city WHERE province_code = #{provinceCode}")
    List<City> findAllByProvinceCode(Integer provinceCode);
}
