package org.example.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.model.User;

import java.io.IOException;
import java.util.List;

public class SelectTest {
    public static void main(String[] args)
        throws IOException {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession = factory.openSession();
            List<User> list = sqlSession.selectList("org.example.mymapper.getAllUser");
            System.out.println(list);
            sqlSession.commit();
            sqlSession.close();
    }
}
