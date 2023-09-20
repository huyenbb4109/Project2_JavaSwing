/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynn
 */
public class Conn {
    
    public static Connection Conn1()  throws SQLException{     
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "");                       
    }
    
    public static void closeAll(Connection con, PreparedStatement stm, ResultSet rs) {
        if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    
                }
            } 
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (stm != null) {
            try {
                stm.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        
        
    }
   
}
