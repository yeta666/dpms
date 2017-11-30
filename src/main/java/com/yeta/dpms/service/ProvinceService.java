package com.yeta.dpms.service;

import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.mapper.ProvinceMapper;
import com.yeta.dpms.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-11-23.
 */
@Service
public class ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    /**
     * 获取所有省
     * @return
     */
    public ResponseResult findAll() {

        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        //获取数据
        List<Province> provinceList = provinceMapper.findAll();
        //判断数据长度
        if (provinceList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("province表中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(provinceList);
        }
        return responseResult;
    }
}
