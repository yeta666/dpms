package com.yeta.dpms.service;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.mapper.CityMapper;
import com.yeta.dpms.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-11-24.
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public ResponseResult findAllByProvinceCode(RequestParam requestParam) {

        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        //判断查询参数
        if (requestParam.getProvinceCode() != null) {
            //获取数据
            List<City> cityList = cityMapper.findAllByProvinceCode(requestParam.getProvinceCode());
            //判断数据长度
            if (cityList.size() == 0) {
                responseResult.setRequest(false);
                responseResult.setMessage("查询参数错误或数据库错误！");
            }else {
                responseResult.setRequest(true);
                responseResult.setData(cityList);
            }
        }else {
            responseResult.setRequest(false);
            responseResult.setMessage("查询参数错误！");
        }
        //返回
        return responseResult;
    }
}
