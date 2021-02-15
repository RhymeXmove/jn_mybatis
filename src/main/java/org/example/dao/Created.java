package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.model.User;

import java.io.IOException;
import java.util.UUID;

public class Created {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession();
        User user = new User();
        /*
        UUID 作为 id
        Integer a = UUID.randomUUID().hashCode();
        user.setId(a);
         */
        user.setUsername("张柳");
        user.setAddress("北京");
        int insert = sqlSession.insert("org.example.mymapper.addUser", user);
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }
}
