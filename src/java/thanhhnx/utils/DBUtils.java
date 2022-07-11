/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhhnx.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DBUtils {
    
    public static Connection makeConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost\\LAPTOP-KO224VRJ:1433;databaseName=PianoCenter";
        Connection con = DriverManager.getConnection(url,"sa","12345");
        return con;
    }
}
