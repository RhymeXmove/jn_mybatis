package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.utils.SqlSessionFactoryUtils;

import java.util.List;

public class getUserByUsernameAndIdTest {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserByUsernameAndId(2, "java");
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(null, "javaboy");
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(5, null);
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(null, null);
        System.out.println(list);
    }
}
