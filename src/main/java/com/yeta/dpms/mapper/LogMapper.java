package com.yeta.dpms.mapper;

import com.yeta.dpms.model.Log;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Created by Administrator on 2017-11-30.
 */
public interface LogMapper {

    /**
     * 获取所有日志
     * @return
     */
    @Select("SELECT log.log_code, log.log_date_time, log.request_uri, log.request_method, log.request_param, log.response_content, log.spend_time FROM log")
    List<Log> findAll();

    /**
     * 保存一条日志数据
     * @return
     */
    @Insert("INSERT INTO log (log.log_date_time, log.request_uri, log.request_method, log.request_param, log.response_content, log.spend_time) VALUES (#{log_date_time}, #{request_uri}, #{request_method}, #{request_param}, #{response_content}, #{spend_time})")
    int save(Log log);

    /**
     * 删除一条日志数据
     * @param logCode
     * @return
     */
    @Delete("DELETE FROM log WHERE log.log_code = #{logCode}")
    int delete(Integer logCode);
}
