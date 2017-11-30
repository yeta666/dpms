package com.yeta.dpms.aspect;

import com.yeta.dpms.mapper.LogMapper;
import com.yeta.dpms.model.Log;
import org.apache.ibatis.javassist.*;
import org.apache.ibatis.javassist.bytecode.CodeAttribute;
import org.apache.ibatis.javassist.bytecode.LocalVariableAttribute;
import org.apache.ibatis.javassist.bytecode.MethodInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2017-11-24.
 */

@Aspect
@Configuration
public class HttpAspect {

    @Autowired
    private LogMapper logMapper;

    /**
     * 开始时间
     */
    private static long startTime;

    /**
     * 日志对象
     */
    private static Log log = new Log();

    //设置切点
    @Pointcut("execution(public * com.yeta.dpms.controller.*.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) throws IOException, ServletException, ClassNotFoundException, NotFoundException {
        //在方法执行之前执行

        //获取request和response
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();

        //设置哪url可以跨域请求到本域
        response.setHeader("Access-Control-Allow-Origin", "*");

        //设置开始时间
        startTime = System.currentTimeMillis();
        //封装日志对象
        log.setLog_date_time(new Date());
        log.setRequest_uri(request.getRequestURI());
        log.setRequest_method(request.getMethod());
        if (joinPoint.getArgs().length != 0) {
            log.setRequest_param(joinPoint.getArgs()[0].toString());
        }else {
            log.setRequest_param("RequestParam{}");
        }
    }

    @After("log()")
    public void doAfter(){
        //在方法执行之后执行
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object){
        //在最后最后执行

        //封装日志对象
        log.setResponse_content(object.toString());
        log.setSpend_time((System.currentTimeMillis() - startTime) / 1000f);
        logMapper.save(log);
    }
}
