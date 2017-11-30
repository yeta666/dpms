package com.yeta.dpms.controller;

import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-23.
 */
@RestController
@RequestMapping(value = "/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping(value = "/findAll")
    public ResponseResult findAll() {
        return provinceService.findAll();
    }
}
