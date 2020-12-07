package com.family.base;

import java.sql.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/25 上午10:46
 * @modified By:
 */
public class ConnectionTest {

    public static void main(String[] args) {
        String driverName="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/family";
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            //加载驱动
            Class.forName(driverName);
             //获取连接
             connection = DriverManager.getConnection(url, "root", "123456");
            //准备sql
             String sql="select * from a where id=?";
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,1);
             //执行
             ResultSet resultSet = preparedStatement.executeQuery();
             System.out.println("result:"+resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
