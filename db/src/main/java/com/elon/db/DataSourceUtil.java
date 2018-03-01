package com.elon.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 2017/6/29 9:57.
 * <p>
 * Email: cheerUpPing@163.com
 */
public class DataSourceUtil {

    /**
     * 加载数据库驱动
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取链接
     *
     * @param url
     * @param username
     * @param pass
     * @return
     * @throws SQLException
     */
    public static Connection getConnection(String url, String username, String pass) throws SQLException {
        return DriverManager.getConnection(url, username, pass);
    }

    /**
     * 关闭链接
     *
     * @param connection
     * @throws SQLException
     */
    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }


}
