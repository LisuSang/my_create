package com.myweb.dao;

import com.myweb.pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 返回null，说明没有这个用户
     */
    public User queryUserByUsername(String username);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);
    public User queryUserByUsernameAndPassword(String username,String password);
}
