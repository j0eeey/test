package com.example.springbootmybatisdemo.dao;

import com.example.springbootmybatisdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from tb_user where id=#{id}")
    User selectById(int id);
}
