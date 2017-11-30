package com.yeta.dpms.controller;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-24.
 */
@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "/findAllByProvinceCode")
    public ResponseResult findAllByProvinceCode(RequestParam requestParam) {
        return cityService.findAllByProvinceCode(requestParam);
    }
}
