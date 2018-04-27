package com.sky.dao;

import com.sky.beans.User;

public interface UserDao {
    public int insert(User user);

    public int deleteById(Integer id);

    public int update(User user);

    public User getById(Integer id);
}