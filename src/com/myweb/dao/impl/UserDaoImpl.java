package com.myweb.dao.impl;

import com.myweb.pojo.User;
import com.myweb.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUsername(String username) {
        String sql="select id,username,password,email from register where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public int saveUser(User user) {
        String sql="insert into register(username,password,email) value(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql="select id,username,password,email from register where username= ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }
}
