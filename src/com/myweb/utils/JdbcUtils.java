package com.myweb.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static DruidDataSource dataSource;


    static {

        try {
            Properties proerties=new Properties();
            //读取jdbc.properties属性配置文件
            InputStream inputStream= JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            proerties.load(inputStream);
            //创建数据库连接池
            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(proerties);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 获取数据库连接池中的连接
     * @return 返回null，连接失败
     */
    public static Connection getConnection() {
        Connection conn=null;
        try {
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    /**
     * 关闭连接
     * @param conn
     */
    public  static void close(Connection conn)  {
      if(conn!=null) {
          try {
              conn.close();
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
      }
    }

}
