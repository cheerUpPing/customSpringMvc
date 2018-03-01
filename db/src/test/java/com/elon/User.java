package com.elon;

/**
 * 2017/6/29 11:10.
 * <p>
 * Email: cheerUpPing@163.com
 */
public class User {

    private String user_name;

    private String user_pass;

    private String add_time;

    private String login_time;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", add_time='" + add_time + '\'' +
                ", login_time='" + login_time + '\'' +
                '}' ;
    }
}
