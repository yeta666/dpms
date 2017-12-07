package com.yeta.dpms.controller;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-28.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "login")
    public ResponseResult login(RequestParam requestParam) {
        return userService.login(requestParam);
    }

    @GetMapping(value = "/delete")
    public ResponseResult delete(RequestParam requestParam) {
        return userService.login(requestParam);
    }

    @GetMapping(value = "/findAll")
    public ResponseResult findAll(RequestParam requestParam) {
        return userService.login(requestParam);
    }

    @GetMapping(value = "/save")
    public ResponseResult save(RequestParam requestParam) {
        return userService.login(requestParam);
    }

    @GetMapping(value = "/update")
    public ResponseResult update(RequestParam requestParam) {
        return userService.login(requestParam);
    }

    @GetMapping(value = "/findByUsername")
    public ResponseResult findByUsername(RequestParam requestParam) {
        return userService.login(requestParam);
    }
}
