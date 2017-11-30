package com.yeta.dpms.service;

import com.yeta.dpms.domain.*;
import com.yeta.dpms.mapper.People2016Mapper;
import com.yeta.dpms.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Administrator on 2017-11-17.
 */
@Service
public class People2016Service {

    @Autowired
    private People2016Mapper people2016Mapper;

    /**
     * 根据地区码获取该地区总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCode(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        int num = 0;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            num = people2016Mapper.findCountByProvinceCode(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            num = people2016Mapper.findCountByCityCode(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            num = people2016Mapper.findCountByRegionCode(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (num == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(num);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据地区码获取该地区男性、女性总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCodeGroupByGender(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        List<SQLGender> sqlGenderList;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            sqlGenderList = people2016Mapper.findCountByProvinceCodeGroupByGender(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            sqlGenderList = people2016Mapper.findCountByCityCodeGroupByGender(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            sqlGenderList = people2016Mapper.findCountByRegionCodeGroupByGender(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (sqlGenderList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(sqlGenderList);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据地区码获取该地区各年龄段总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCodeGroupByAgeRange(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        List<SQLAgeRange> sqlAgeRangeList;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            sqlAgeRangeList = people2016Mapper.findCountByProvinceCodeGroupByAgeRange(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            sqlAgeRangeList = people2016Mapper.findCountByCityCodeGroupByAgeRange(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            sqlAgeRangeList = people2016Mapper.findCountByRegionCodeGroupByAgeRange(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (sqlAgeRangeList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(sqlAgeRangeList);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据地区码获取该地区各民族总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCodeGroupByNation(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        List<SQLNation> sqlNationList;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            sqlNationList = people2016Mapper.findCountByProvinceCodeGroupByNation(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            sqlNationList = people2016Mapper.findCountByCityCodeGroupByNation(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            sqlNationList = people2016Mapper.findCountByRegionCodeGroupByNation(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (sqlNationList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(sqlNationList);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据地区码获取该地区各姓氏总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCodeGroupByLastName(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        List<SQLLastName> sqlLastNameList;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            sqlLastNameList = people2016Mapper.findCountByProvinceCodeGroupByLastName(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            sqlLastNameList = people2016Mapper.findCountByCityCodeGroupByLastName(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            sqlLastNameList = people2016Mapper.findCountByRegionCodeGroupByLastName(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (sqlLastNameList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(sqlLastNameList);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据地区码获取该地区各行业总人口数量
     * @param requestParam
     * @return
     */
    public ResponseResult findCountByAreaCodeGroupByProfession(RequestParam requestParam) {
        //初始化返回对象
        ResponseResult responseResult = new ResponseResult();
        List<SQLProfession> sqlProfessionList;
        //判断查询参数
        if (requestParam.getProvinceCode() != null && requestParam.getCityCode() == null && requestParam.getRegionCode() == null) {
            //根据省码查询数据库
            sqlProfessionList = people2016Mapper.findCountByProvinceCodeGroupByProfession(requestParam.getProvinceCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() != null && requestParam.getRegionCode() == null) {
            //根据市码查询数据库
            sqlProfessionList = people2016Mapper.findCountByCityCodeGroupByProfession(requestParam.getCityCode());
        }else if (requestParam.getProvinceCode() == null && requestParam.getCityCode() == null && requestParam.getRegionCode() != null) {
            //根据区码查询数据库
            sqlProfessionList = people2016Mapper.findCountByRegionCodeGroupByProfession(requestParam.getRegionCode());
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
            return responseResult;
        }
        //判断获取到的数据长度
        if (sqlProfessionList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误或数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(sqlProfessionList);
        }
        //返回
        return responseResult;
    }

    /**
     * 获取所有年份的年末常住人口、出生率、死亡率、自然增长率
     * @return
     */
    public ResponseResult findAllRate() {
        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        //从数据库获取数据
        List<Rate> rateList = people2016Mapper.findAllRate();
        //判断数据长度
        if (rateList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(rateList);
        }
        //返回
        return responseResult;
    }
}
