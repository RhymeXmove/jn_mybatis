package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.model.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args)
            throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession();
        User user = (User) sqlSession.selectOne("org.example.mymapper.getUserById", 3);
        System.out.println(user);
        sqlSession.close();
    }
}
