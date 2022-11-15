package com.myweb.service;

import com.myweb.pojo.User;

public interface UserService {
    /**
     * 注册
     * @param user
     */
    public void registerUser(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 查询用户名可用
     * @param username
     * @return
     */
    public boolean existUsername(String username);
}
