package com.yeta.dpms.service;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.mapper.UserMapper;
import com.yeta.dpms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-11-30.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     * @param requestParam
     * @return
     */
    public ResponseResult login(RequestParam requestParam) {
        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        responseResult.setRequest(false);
        //判断查询参数
        if (requestParam.getUsername() != null && requestParam.getPassword() != null) {
            //从数据库中查询
            List<User> userList = userMapper.findAllByUsername(requestParam.getUsername());
            //判断数据条数
            if (userList.size() > 1) {
                responseResult.setMessage("数据库错误！");
            }else if (userList.size() == 0) {
                responseResult.setMessage("用户名或密码错误！");
            }else {
                //判断密码是否正确
                if (requestParam.getPassword().equals(userList.get(0).getPassword_())) {
                    responseResult.setRequest(true);
                    responseResult.setMessage(null);
                    responseResult.setData(userList.get(0));
                }else {
                    responseResult.setMessage("用户名或密码错误！");
                }
            }
        }else {
            responseResult.setMessage("请求参数错误！");
        }
        //返回
        return responseResult;
    }
}
