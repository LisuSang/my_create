package com.myweb.service.impl;

import com.myweb.dao.UserDao;
import com.myweb.dao.impl.UserDaoImpl;
import com.myweb.pojo.User;
import com.myweb.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if(userDao.queryUserByUsername(username) == null)
            return true;
        else return false;
    }
}
