package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.utils.SqlSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class getUserByIdTest {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer id = 1724461240;
        List<User> list = new ArrayList<User>();
        list = mapper.getUserById(id);
        System.out.println(list);
        sqlSession.commit();
    }
}
