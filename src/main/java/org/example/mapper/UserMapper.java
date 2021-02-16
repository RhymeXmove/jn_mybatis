package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.model.User;

import java.util.List;

public interface UserMapper {
    User getUserById1(Integer id);

    Integer addUser(User user);

    Integer addUser2(User user);

    Integer deleteUserById(Integer id);

    List<User> updateUser(@Param("username") String username,@Param("address") String address,@Param("favorites") String favorites,@Param("id") Integer id);

    Integer updateUsernameById(@Param("username") String username,@Param("id") Integer id);

    List<User> getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    List<User> getUserByPage(@Param("start") Integer start, @Param("count") Integer count);

    List<User> getUserByUsernameAndId(@Param("id") Integer id, @Param("name") String name);

    Integer batchInsertUser(@Param("users") List<User> user);

}
