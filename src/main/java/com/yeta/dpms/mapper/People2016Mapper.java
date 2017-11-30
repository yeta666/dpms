package com.yeta.dpms.mapper;

import com.yeta.dpms.domain.*;
import com.yeta.dpms.model.People2016;
import com.yeta.dpms.model.Rate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-17.
 */
public interface People2016Mapper {

    /**
     * 获取所有人口数据
     * @return
     */
    @Select("SELECT " +
                "id_," +
                "id_number," +
                "last_name_code," +
                "last_name," +
                "first_name," +
                "gender_," +
                "age_range_code," +
                "age_," +
                "nation_code," +
                "nation_," +
                "province_code," +
                "province_," +
                "city_code," +
                "city_," +
                "region_code," +
                "region_," +
                "profession_code," +
                "profession_" +
            " FROM " +
                "people2016")
    List<People2016> findAll();

    /**
     * 保存一条人口数据
     * @param people2016
     * @return
     */
    @Insert("INSERT INTO people2016 (" +
                "id_," +
                "id_number," +
                "last_name_code," +
                "last_name," +
                "first_name," +
                "gender_," +
                "age_range_code," +
                "age_," +
                "nation_code," +
                "nation_," +
                "province_code," +
                "province_," +
                "city_code," +
                "city_," +
                "region_code," +
                "region_," +
                "profession_code," +
                "profession_" +
            ")VALUES(" +
                "#{id_}, " +
                "#{id_number}, " +
                "#{last_name_code}," +
                "#{last_name}, " +
                "#{first_name}, " +
                "#{gender_}, " +
                "#{age_range_code}, " +
                "#{age_}, " +
                "#{nation_code}, " +
                "#{nation_}, " +
                "#{province_code}, " +
                "#{province_}, " +
                "#{city_code}," +
                "#{city_}, " +
                "#{region_code}, " +
                "#{region_}, " +
                "#{profession_code}, " +
                "#{profession_}" +
            ")")
    int save(People2016 people2016);

    /**
     * 根据省码获取所有人口数据
     * @param provinceCode
     * @return
     */
    @Select("SELECT " +
            "id_," +
            "id_number," +
            "last_name_code," +
            "last_name," +
            "first_name," +
            "gender_," +
            "age_range_code," +
            "age_," +
            "nation_code," +
            "nation_," +
            "province_code," +
            "province_," +
            "city_code," +
            "city_," +
            "region_code," +
            "region_," +
            "profession_code," +
            "profession_" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " province_code = #{provinceCode} LIMIT 10000")
    List<People2016> findAllByProvinceCode(Integer provinceCode);

    /**
     * 根据省码获取所有人口数据总数
     * @param provinceCode
     * @return
     */
    @Select("SELECT " +
            "COUNT(*)" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " province_code = #{provinceCode}")
    int findCountByProvinceCode(Integer provinceCode);

    /**
     * 根据市码获取所有人口数据
     * @param cityCode
     * @return
     */
    @Select("SELECT " +
            "id_," +
            "id_number," +
            "last_name_code," +
            "last_name," +
            "first_name," +
            "gender_," +
            "age_range_code," +
            "age_," +
            "nation_code," +
            "nation_," +
            "province_code," +
            "province_," +
            "city_code," +
            "city_," +
            "region_code," +
            "region_," +
            "profession_code," +
            "profession_" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " city_code = #{cityCode} LIMIT 10000")
    List<People2016> findAllByCityCode(Integer cityCode);

    /**
     * 根据市码获取所有人口数据总数
     * @param cityCode
     * @return
     */
    @Select("SELECT " +
            "COUNT(*)" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " city_code = #{cityCode}")
    int findCountByCityCode(Integer cityCode);

    /**
     * 根据区码获取所有人口数据
     * @param regionCode
     * @return
     */
    @Select("SELECT " +
            "id_," +
            "id_number," +
            "last_name_code," +
            "last_name," +
            "first_name," +
            "gender_," +
            "age_range_code," +
            "age_," +
            "nation_code," +
            "nation_," +
            "province_code," +
            "province_," +
            "city_code," +
            "city_," +
            "region_code," +
            "region_," +
            "profession_code," +
            "profession_" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " region_code = #{regionCode} LIMIT 10000")
    List<People2016> findAllByRegionCode(Integer regionCode);

    /**
     * 根据区码获取所有人口数据总数
     * @param regionCode
     * @return
     */
    @Select("SELECT " +
            "COUNT(*)" +
            " FROM" +
            " people2016" +
            " WHERE" +
            " region_code = #{regionCode}")
    int findCountByRegionCode(Integer regionCode);

    /**
     * 根据区码查询该区男性、女性总人数
     * @param regionCode
     * @return
     */
    @Select("SELECT gender_, COUNT(gender_) AS count_ FROM people2016 WHERE region_code = #{regionCode} GROUP BY gender_")
    List<SQLGender> findCountByRegionCodeGroupByGender(Integer regionCode);

    /**
     * 根据市码查询该市男性、女性总人数
     * @param cityCode
     * @return
     */
    @Select("SELECT gender_, COUNT(gender_) AS count_ FROM people2016 WHERE city_code = #{cityCode} GROUP BY gender_")
    List<SQLGender> findCountByCityCodeGroupByGender(Integer cityCode);

    /**
     * 根据省码查询该省男性、女性总人数
     * @param provinceCode
     * @return
     */
    @Select("SELECT gender_, COUNT(gender_) AS count_ FROM people2016 WHERE province_code = #{provinceCode} GROUP BY gender_")
    List<SQLGender> findCountByProvinceCodeGroupByGender(Integer provinceCode);

    /**
     * 根据区码查询该区各年龄段的总人数
     * @param regionCode
     * @return
     */
    @Select("SELECT p.age_range_code, a.bottom_, a.top_, COUNT(p.age_range_code) AS count_ FROM people2016 AS p INNER JOIN age_range AS a ON p.age_range_code = a.age_range_code WHERE p.region_code = #{regionCode} GROUP BY p.age_range_code ORDER BY p.age_range_code ASC")
    List<SQLAgeRange> findCountByRegionCodeGroupByAgeRange(Integer regionCode);

    /**
     * 根据市码查询该市各年龄段的总人数
     * @param cityCode
     * @return
     */
    @Select("SELECT p.age_range_code, a.bottom_, a.top_, COUNT(p.age_range_code) AS count_ FROM people2016 AS p INNER JOIN age_range AS a ON p.age_range_code = a.age_range_code WHERE p.city_code = #{cityCode} GROUP BY p.age_range_code ORDER BY p.age_range_code ASC")
    List<SQLAgeRange> findCountByCityCodeGroupByAgeRange(Integer cityCode);

    /**
     * 根据省码查询该省各年龄段的总人数
     * @param provinceCode
     * @return
     */
    @Select("SELECT p.age_range_code, a.bottom_, a.top_, COUNT(p.age_range_code) AS count_ FROM people2016 AS p INNER JOIN age_range AS a ON p.age_range_code = a.age_range_code WHERE p.province_code = #{provinceCode} GROUP BY p.age_range_code ORDER BY p.age_range_code ASC")
    List<SQLAgeRange> findCountByProvinceCodeGroupByAgeRange(Integer provinceCode);

    /**
     * 根据区码查询该区各民族的总人数
     * @param regionCode
     * @return
     */
    @Select("SELECT p.nation_code, p.nation_, COUNT(p.nation_code) AS count_ FROM people2016 AS p WHERE p.region_code = #{regionCode} GROUP BY p.nation_code ORDER BY p.nation_code ASC")
    List<SQLNation> findCountByRegionCodeGroupByNation(Integer regionCode);

    /**
     * 根据市码查询该市各民族的总人数
     * @param cityCode
     * @return
     */
    @Select("SELECT p.nation_code, p.nation_, COUNT(p.nation_code) AS count_ FROM people2016 AS p WHERE p.city_code = #{cityCode} GROUP BY p.nation_code ORDER BY p.nation_code ASC")
    List<SQLNation> findCountByCityCodeGroupByNation(Integer cityCode);

    /**
     * 根据省码查询该省各民族的总人数
     * @param provinceCode
     * @return
     */
    @Select("SELECT p.nation_code, p.nation_, COUNT(p.nation_code) AS count_ FROM people2016 AS p WHERE p.province_code = #{provinceCode} GROUP BY p.nation_code ORDER BY p.nation_code ASC")
    List<SQLNation> findCountByProvinceCodeGroupByNation(Integer provinceCode);

    /**
     * 根据区码查询该区各姓氏的总人数
     * @param regionCode
     * @return
     */
    @Select("SELECT p.last_name_code, p.last_name, COUNT(p.last_name_code) AS count_ FROM people2016 AS p WHERE p.region_code = #{regionCode} GROUP BY p.last_name_code ORDER BY p.last_name_code ASC")
    List<SQLLastName> findCountByRegionCodeGroupByLastName(Integer regionCode);

    /**
     * 根据市码查询该市各姓氏的总人数
     * @param cityCode
     * @return
     */
    @Select("SELECT p.last_name_code, p.last_name, COUNT(p.last_name_code) AS count_ FROM people2016 AS p WHERE p.city_code = #{cityCode} GROUP BY p.last_name_code ORDER BY p.last_name_code ASC")
    List<SQLLastName> findCountByCityCodeGroupByLastName(Integer cityCode);

    /**
     * 根据省码查询该省各姓氏的总人数
     * @param provinceCode
     * @return
     */
    @Select("SELECT p.last_name_code, p.last_name, COUNT(p.last_name_code) AS count_ FROM people2016 AS p WHERE p.province_code = #{provinceCode} GROUP BY p.last_name_code ORDER BY p.last_name_code ASC")
    List<SQLLastName> findCountByProvinceCodeGroupByLastName(Integer provinceCode);

    /**
     * 根据区码查询该区各行业的总人数
     * @param regionCode
     * @return
     */
    @Select("SELECT p.profession_code, p.profession_, COUNT(p.profession_code) AS count_ FROM people2016 AS p WHERE p.region_code = #{regionCode} GROUP BY p.profession_code")
    List<SQLProfession> findCountByRegionCodeGroupByProfession(Integer regionCode);

    /**
     * 根据市码查询该市各行业的总人数
     * @param cityCode
     * @return
     */
    @Select("SELECT p.profession_code, p.profession_, COUNT(p.profession_code) AS count_ FROM people2016 AS p WHERE p.city_code = #{cityCode} GROUP BY p.profession_code")
    List<SQLProfession> findCountByCityCodeGroupByProfession(Integer cityCode);

    /**
     * 根据省码查询该省各行业的总人数
     * @param provinceCode
     * @return
     */
    @Select("SELECT p.profession_code, p.profession_, COUNT(p.profession_code) AS count_ FROM people2016 AS p WHERE p.province_code = #{provinceCode} GROUP BY p.profession_code")
    List<SQLProfession> findCountByProvinceCodeGroupByProfession(Integer provinceCode);

    /**
     * 查询所有年份的年末常住人口、出生率、死亡率、自然增长率
     * @return
     */
    @Select("SELECT r.rate_code, r.year_, r.people_number, r.province_birth_rate, r.province_death_rate, r.province_growth_rate, r.city_birth_rate, r.city_death_rate, r.city_growth_rate, r.region_birth_rate, r.region_death_rate, r.region_growth_rate FROM rate AS r")
    List<Rate> findAllRate();
}
