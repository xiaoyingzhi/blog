package com.h2;

/**
 * @author wangheng
 * @date 2020-12-08
 **/

import java.sql.*;

/**
 * @Description: 内嵌数据库H2的使用
 * @author： zxt
 * @time: 2019年6月4日 下午3:30:13
 */
public class H2Test {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:./db/user", "root", "root");
        Statement statement = conn.createStatement();
        //建表
        statement.execute("DROP TABLE IF EXISTS USER_INF");
        statement.execute("CREATE TABLE USER_INF(id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), sex VARCHAR(1))");

        //todo 测试用例1
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Jack', '男') ");
        //statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tony', '男') ");

        //打印表中所有的数据
        printResultSet(statement.executeQuery("select * from USER_INF"));

        //TRUNCATE
        statement.execute("TRUNCATE TABLE USER_INF RESTART IDENTITY");
        System.out.println("===========================================================");

        //todo 测试用例2，在生产环境，测试用例2的输出结果id不是从1开始的
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Rose', '女') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");
        statement.executeUpdate("INSERT INTO USER_INF (`name`,`sex`) VALUES('Tom', '男') ");

        //打印表中所有的数据
        printResultSet(statement.executeQuery("select * from USER_INF"));

        statement.close();
        conn.close();
    }

    private static void printResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ", "
                    + resultSet.getString("name") + ", "
                    + resultSet.getString("sex"));
        }
    }
}
