package com.yeta.dpms.controller;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-30.
 */
@RestController
@RequestMapping(value = "/log")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping(value = "/delete")
    public ResponseResult delete(RequestParam requestParam) {
        return logService.delete(requestParam);
    }

    @GetMapping(value = "/findAll")
    public ResponseResult findAll() {
        return logService.findAll();
    }

    @GetMapping(value = "/findAllByTime")
    public ResponseResult findAllByTime(RequestParam requestParam) {
        return new ResponseResult();
    }
}
