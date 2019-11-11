package com.family.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:37 2019/10/8
 */
public class TransactionDemo {

    public static void main(String[] args) {
        Connection connection=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://192.168.0.190:3306/visa");
            //不自动提交事务
            connection.setAutoCommit(false);
            connection.commit();
            connection.rollback();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }finally {

           if(connection!=null){
               try {
                   connection.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
        }


    }
}
