package com.yeta.dpms.service;

import com.yeta.dpms.domain.RequestParam;
import com.yeta.dpms.domain.ResponseResult;
import com.yeta.dpms.mapper.LogMapper;
import com.yeta.dpms.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-11-30.
 */
@Service
public class LogService {

    @Autowired
    private LogMapper logMapper;

    /**
     * 获取所有日志数据
     * @return
     */
    public ResponseResult findAll() {
        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        //从数据库中查询
        List<Log> logList = logMapper.findAll();
        //判断数据长度
        if (logList.size() == 0) {
            responseResult.setRequest(false);
            responseResult.setMessage("数据库中无数据！");
        }else {
            responseResult.setRequest(true);
            responseResult.setData(logList);
        }
        //返回
        return responseResult;
    }

    /**
     * 根据日志码删除相应日志
     * @param requestParam
     * @return
     */
    public ResponseResult delete(RequestParam requestParam) {
        //初始化返回结果
        ResponseResult responseResult = new ResponseResult();
        //判断日志码数组长度
        if (requestParam.getLogCodeArr() == null) {
            responseResult.setRequest(false);
            responseResult.setMessage("请求参数错误！");
        }else {
            for (int logCode : requestParam.getLogCodeArr()) {
                logMapper.delete(logCode);
            }
            responseResult.setRequest(true);
        }
        //返回
        return responseResult;
    }

}
