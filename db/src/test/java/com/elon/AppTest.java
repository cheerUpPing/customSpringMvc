package com.elon;

import com.elon.db.DBUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args) throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException {
        List<User> users = DBUtil.query("user", User.class);
        System.out.println(users);
    }

    public void ttt() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException {
        List<User> users = DBUtil.query("user", User.class);
        System.out.println(users);
    }
}
