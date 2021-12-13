package com.family.structure;

/*import com.family.structure.tables.Employee;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.family.structure.tables.Employee.EMPLOYEE;
import static java.util.logging.Logger.getLogger;*/

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月26日 17时26分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
public class Test {
    public static void main(String[] args) {
       /* Logger.getLogger("org.jooq.Constants").setLevel(Level.WARNING);


        String jdbcUrl = "jdbc:mysql://localhost:3306/family";
        String jdbcUsername = "root";
        String jdbcPassword = "123456";

        // 获取 JDBC 链接
        try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword)) {
            // 获取 jOOQ 执行器
            DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);

            // fetch方法可以返回一个结果集对象 Result
            // jOOQ的Result对象实现了List接口，可以直接当做集合使用
            *//*Result<Record> recordResult = dslContext.select().from("Employee").fetch();
            System.out.println(recordResult);
            recordResult.forEach(x->{
                System.out.println(x.getValue(EMPLOYEE.ID));
            });*//*
           *//* List<String> nameList = dslContext.select(EMPLOYEE.NAME).from(EMPLOYEE).fetchInto(String.class);

            nameList.forEach(System.out::println);*//*
            Result<Record2<Integer, String>> fetch = dslContext.select(EMPLOYEE.ID,EMPLOYEE.NAME).from(EMPLOYEE)
                    .orderBy(EMPLOYEE.ID.desc()).limit(1).offset(10).fetch();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
