package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.model.User;

import java.io.IOException;

public class Created2 {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession();
        User user = new User();
        user.setUsername("赵武");
        user.setAddress("广东");
        int insert = sqlSession.insert("org.example.mymapper.addUser", user);
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }
}
