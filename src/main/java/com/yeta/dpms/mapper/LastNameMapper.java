package com.yeta.dpms.mapper;

import com.yeta.dpms.model.LastName;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-19.
 */
public interface LastNameMapper {

    /**
     * 插入一条数据
     * @param lastName
     * @return
     */
    @Insert("INSERT INTO last_name (last_name_code, last_name) VALUES (#{last_name_code}, #{last_name})")
    int save(LastName lastName);

    /**
     * 获取所有数据
     * @return
     */
    @Select("SELECT last_name_code, last_name FROM last_name")
    List<LastName> findAll();
}
