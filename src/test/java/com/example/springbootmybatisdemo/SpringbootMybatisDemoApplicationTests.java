package com.example.springbootmybatisdemo;

import com.example.springbootmybatisdemo.dao.UserDao;
import com.example.springbootmybatisdemo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisDemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        User user=userDao.selectById(1);
        System.out.println(user);
    }

}
