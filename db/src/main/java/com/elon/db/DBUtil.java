package com.elon.db;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2017/6/29 10:04.
 * <p>
 * Email: cheerUpPing@163.com
 */
public class DBUtil {


    /**
     * 查询所有
     *
     * @param table
     * @return
     * @throws SQLException
     */
    public static List<Map<String, Object>> query(String table) throws SQLException {
        String sql = "select * from " + table;
        Connection connection = DataSourceUtil.getConnection("", "", "");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int count = resultSetMetaData.getColumnCount();
        List<String> columns = new ArrayList<String>(count);
        List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        for (int i = 1; i <= count; i++) {
            columns.add(resultSetMetaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<String, Object>(count);
            for (int j = 0; j < columns.size(); j++) {
                String column = columns.get(j);
                Object data = resultSet.getObject(column);
                map.put(column, data);
            }
            maps.add(map);
        }
        return maps;
    }

    /**
     * 获取对象
     *
     * @param table
     * @param tClass
     * @param <T>
     * @return
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws InvocationTargetException
     */
    public static <T> List<T> query(String table, Class<T> tClass) throws SQLException, IllegalAccessException, InstantiationException, InvocationTargetException {

        String sql = "select * from " + table;
        Connection connection = DataSourceUtil.getConnection("jdbc:mysql://127.0.0.1:3306/talk?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int count = resultSetMetaData.getColumnCount();
        List<String> columns = new ArrayList<String>(count);
        List ts = new ArrayList();
        for (int i = 1; i <= count; i++) {
            columns.add(resultSetMetaData.getColumnName(i));
        }
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<String, Object>(count);
            for (int j = 0; j < columns.size(); j++) {
                String column = columns.get(j);
                Object data = resultSet.getObject(column);
                map.put(column, data);
            }
            T t = tClass.newInstance();
            BeanUtils.populate(t, map);
            ts.add(t);
        }
        return ts;
    }



}
