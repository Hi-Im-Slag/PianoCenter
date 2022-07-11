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
import thanhhnx.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class AccountDao {
    public static boolean login(String username,String password) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean ok = false;
        
        con = DBUtils.makeConnection();
        if (con != null){
            String sql = "Select acc_Username " + "From Account " + "Where acc_Username = ? and acc_Password = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()){
                    ok = true;
                }
            }

       if (rs != null) rs.close();
       if (stm != null) stm.close();
       if (con != null) con.close();
       
       return ok;
    }
}
