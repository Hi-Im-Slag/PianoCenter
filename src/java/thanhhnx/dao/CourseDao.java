/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhhnx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import thanhhnx.dto.Account;
import thanhhnx.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class CourseDao {
    
    public static List<Account> searchCourse(String searchValue) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean ok = false;
        List<Account> listAccount = new ArrayList<Account>();
        
        con = DBUtils.makeConnection();
        if (con != null){
            String sql = "Select * " + "From Account " + "Where Fullname Like ?";
            stm = con.prepareStatement(sql);
            stm.setString(1,"%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()){
                    String username = rs.getString("Username");
                    String password = rs.getString("Password");
                    String fullname = rs.getString("Fullname");
                    boolean role = rs.getBoolean("Role");
                    Account acc = new Account(username, password, fullname, role);
                    System.out.println(acc.toString());
                    listAccount.add(acc);
                }
            }

       if (rs != null) rs.close();
       if (stm != null) stm.close();
       if (con != null) con.close();
       return listAccount;
    }
    
}
