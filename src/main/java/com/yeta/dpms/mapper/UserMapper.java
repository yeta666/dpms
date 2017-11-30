package com.yeta.dpms.mapper;

import com.yeta.dpms.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-11-30.
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    @Select("SELECT `user`.user_code, `user`.username_, `user`.password_, `user`.role_ FROM user WHERE `user`.username_ = #{username}")
    List<User> findAllByUsername(String username);

    /**
     * 保存一条用户数据
     * @param user
     * @return
     */
    @Insert("INSERT INTO `user` (`user`.username_, `user`.password_, `user`.role_) VALUES (#{username_}, #{password_}, #{role_}")
    int save(User user);
}
