package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.utils.SqlSessionFactoryUtils;

import java.util.List;

/*修改配置方式
 将mapper.xml放入java- mapper文件夹内
 原配置方式为resources下的mapper.xml
 */
public class TestMain2 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }
}
