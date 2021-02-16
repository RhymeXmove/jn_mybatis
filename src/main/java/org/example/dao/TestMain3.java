package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.utils.SqlSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class TestMain3 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("第五貉");
        user.setAddress("提兵山");
        List<String> fav = new ArrayList<String>();
        fav.add("兵");
        fav.add("武");
        fav.add("位");
        user.setFavorites(fav);
        mapper.addUser(user);
        sqlSession.commit();
    }
}
