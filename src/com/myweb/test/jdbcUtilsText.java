package com.myweb.test;

import com.myweb.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class jdbcUtilsText {
    @Test
    public void testJdbc(){
        for (int i = 1; i < 100; i++) {
        Connection conn=JdbcUtils.getConnection();
            System.out.println(conn);
            JdbcUtils.close(conn);
        }
    }
}
