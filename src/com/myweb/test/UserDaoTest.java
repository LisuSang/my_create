package com.myweb.test;

import com.myweb.pojo.User;
import com.myweb.dao.UserDao;
import com.myweb.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {

        UserDao userDao=new UserDaoImpl();
    @Test
    public void queryUserByUsername() {
        if(userDao.queryUserByUsername("admin")!=null){
            System.out.println("用户名不可用");
        }else {
            System.out.println("用户名可用");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"符华","171112939@qq.com","23333")));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin","123456")==null){
            System.out.println("用户名或密码错误");
        }else{
            System.out.println("登录成功");
        }
    }
}