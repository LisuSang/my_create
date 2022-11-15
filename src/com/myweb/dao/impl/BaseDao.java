package com.myweb.dao.impl;

import com.myweb.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
     //使用dbutils操作数据库
     private QueryRunner queryRunner=new QueryRunner();

     /**
      * //通过update（）执行inset、delete、update语句
      * @return 返回-1表示执行失败，返回其他影响的行数
      */
     public  int update(String sql,Object ... args){
          Connection connnection= JdbcUtils.getConnection();
          try {
              return queryRunner.update(connnection,sql,args);
          } catch (SQLException e) {
              e.printStackTrace();
          }finally {
               JdbcUtils.close(connnection);
          }
          return -1;


     }

     /**
      * 查询返回一个JavaBean的sql语句
      * @param type 返回对象类型
      * @param sql   执行的SQL语句
      * @param args   sql对应的参数值
      * @param <T>   返回的类型的泛型
      * @return
      */
     public <T> T queryForOne(Class<T> type,String sql,Object...args)  {
          Connection connection=JdbcUtils.getConnection();
          try {
               return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
          } catch (SQLException e) {
               e.printStackTrace();
          }finally {
               JdbcUtils.close(connection);
          }
          return null;
     }
     /**
      * 查询返回多个JavaBean的sql语句
      * @param type 返回对象类型
      * @param sql   执行的SQL语句
      * @param args   sql对应的参数值
      * @param <T>   返回的类型的泛型
      * @return
      */
     public <T>List<T> queryForList(Class<T> type ,String sql,Object...args){
          Connection connection=JdbcUtils.getConnection();
          try {
               return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
          } catch (SQLException e) {
                    e.printStackTrace();
          }finally {
               JdbcUtils.close(connection);
          }
          return null;
     }

     /**
      * 执行返回一行一列的sql语句
      * @param sql  执行的sql
      * @param args  sql对应的参数值
      * @return
      */
     public Object queryForsingleValue(String sql,Object...args){
          Connection con=JdbcUtils.getConnection();
          try {
               return  queryRunner.query(con,sql,new ScalarHandler(),args);
          } catch (SQLException e) {
             e.printStackTrace();
          }finally {
               JdbcUtils.close(con);
          }
          return null;
     }
}
