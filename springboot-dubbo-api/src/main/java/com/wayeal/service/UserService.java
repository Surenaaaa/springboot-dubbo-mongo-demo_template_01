package com.wayeal.service;

import com.wayeal.pojo.User;

import java.util.List;

/**
 * @version 1.0
 * @Author: tyf
 * @Date: 2022/06/16/10:33
 * @Description:
 */
public interface UserService {

    String getName(String name);

    void save(User user);

    void delete(Integer id);

    void update(Integer id,String name,Integer age,String pwd);

    List<User> findAll();

    List<User> findById(Integer id);

}
