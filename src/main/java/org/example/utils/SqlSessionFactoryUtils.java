package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory SQL_SESSION_FACTORY = null;
    public static SqlSessionFactory getInstance(){
        if(SQL_SESSION_FACTORY == null) {
            try {
                SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder()
                        .build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SQL_SESSION_FACTORY;
    }
}
