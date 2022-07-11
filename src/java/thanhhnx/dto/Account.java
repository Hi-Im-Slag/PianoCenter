/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhhnx.dto;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String username;
    private String password;
    private String fullname;
    private boolean role;

    public Account(String username, String password, String fullname, boolean role) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public boolean getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
