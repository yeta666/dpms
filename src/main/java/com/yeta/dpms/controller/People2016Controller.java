package com.yeta.dpms.controller;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.service.People2016Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-17.
 */
@RestController
@RequestMapping(value = "/people2016")
public class People2016Controller {

    @Autowired
    private People2016Service people2016Service;

    @GetMapping(value = "/findCountByAreaCode")
    public ResponseResult findCountByAreaCode(RequestParam requestParam) {
        return people2016Service.findCountByAreaCode(requestParam);
    }

    @GetMapping(value = "/findCountByAreaCodeGroupByGender")
    public ResponseResult findCountByAreaCodeGroupByGender(RequestParam requestParam) {
        return people2016Service.findCountByAreaCodeGroupByGender(requestParam);
    }

    @GetMapping(value = "/findCountByAreaCodeGroupByAgeRange")
    public ResponseResult findCountByAreaCodeGroupByAgeRange(RequestParam requestParam) {
        return people2016Service.findCountByAreaCodeGroupByAgeRange(requestParam);
    }

    @GetMapping(value = "/findCountByAreaCodeGroupByNation")
    public ResponseResult findCountByAreaCodeGroupByNation(RequestParam requestParam) {
        return people2016Service.findCountByAreaCodeGroupByNation(requestParam);
    }

    @GetMapping(value = "/findCountByAreaCodeGroupByLastName")
    public ResponseResult findCountByAreaCodeGroupByLastName(RequestParam requestParam) {
        return people2016Service.findCountByAreaCodeGroupByLastName(requestParam);
    }

    @GetMapping(value = "/findCountByAreaCodeGroupByProfession")
    public ResponseResult findCountByAreaCodeGroupByProfession(RequestParam requestParam) {
        return people2016Service.findCountByAreaCodeGroupByProfession(requestParam);
    }

    @GetMapping(value = "/findAllRate")
    public ResponseResult findAllRate() {
        return people2016Service.findAllRate();
    }

}
