package com.evan.wj.entity;

/**
 * @author fada.yu
 * @date 2020/8/21 11:05
 * @Description：
 */
public class User {
    int id;
    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUseranem(String useranem) {
        this.username = useranem;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User(int id, String useranem, String password) {
        this.id = id;
        this.username = useranem;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", useranem='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
