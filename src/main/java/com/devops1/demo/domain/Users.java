package com.devops1.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="devtab")
public class Users {
    @Id
private String userid;
private String pass;
public Users() {
}
public Users(String username, String password) {
    this.userid = username;
    this.pass = password;
}
public String getUsername() {
    return userid;
}
public void setUsername(String username) {
    this.userid = username;
}
public String getPassword() {
    return pass;
}
public void setPassword(String password) {
    this.pass = password;
}

}
