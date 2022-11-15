package com.myweb.servlet.test;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import com.myweb.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    UserService userService=new UserServiceImpl();
    @Test
    public void registerUser() {
       userService.registerUser(new User(null,"琪亚娜","123456","qweqwe@11.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"admin",null,"12345")));
    }

    @Test
    public void existUsername() {

    }
}