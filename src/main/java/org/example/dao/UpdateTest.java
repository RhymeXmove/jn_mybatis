package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.model.User;

import java.io.IOException;

public class UpdateTest {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession();
        User user = new User();
        user.setId(1);
        user.setUsername("刘松");
        int update = sqlSession.update("org.example.mymapper.updateUser", user);
        System.out.println(update);
        sqlSession.commit();
        sqlSession.close();
    }
}
