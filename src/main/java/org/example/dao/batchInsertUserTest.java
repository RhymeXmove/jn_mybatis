package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.utils.SqlSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class batchInsertUserTest {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setUsername("张三");
        u1.setAddress("深圳");
        users.add(u1);
        User u2 = new User();
        u2.setUsername("李四");
        u2.setAddress("广州");
        users.add(u2);
        mapper.batchInsertUser(users);
        sqlSession.commit();
    }


}
