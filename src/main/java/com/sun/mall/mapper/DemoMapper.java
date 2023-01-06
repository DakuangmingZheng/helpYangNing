package com.sun.mall.mapper;

import com.sun.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {
    @Select("select * from user where username = #{username}")
    public User fetchUserInfo(@Param("username") String username);
}
