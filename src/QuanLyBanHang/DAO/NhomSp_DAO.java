/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.NhomSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class NhomSp_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
        
    public ArrayList<NhomSP> getlistNhomsp(){
        try {
            con= Conn.Conn1();
            stm= con.prepareStatement("select * from nhomsanpham where trangthai= 1");
            rs= stm.executeQuery();
            ArrayList<NhomSP> listNhomsp= new ArrayList<>();
            
            while(rs.next()){
                NhomSP nhomsp= new NhomSP(rs.getInt("manhomsanpham"), rs.getString("tennhomsanpham"), rs.getByte("trangthai"));
                listNhomsp.add(nhomsp);
            }           
            return listNhomsp;
        } catch (SQLException se) {
        }       
        return null;
    }
    
    
    public boolean themNhomsp(String tenidsp){
        try {
            con= Conn.Conn1();
            stm= con.prepareCall("insert into nhomsanpham(tennhomsanpham) value(?)");
            stm.setString(1, tenidsp);
                        
            int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException se) {
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }
    
    public boolean suaNhomsp(int manhomsanpham, String tennhomsanpham){
        try {
           con= Conn.Conn1();
           stm= con.prepareStatement("update nhomsanpham set tennhomsanpham= ? where manhomsanpham= ?");
           stm.setString(1, tennhomsanpham);
           stm.setInt(2, manhomsanpham);
           
           int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException se) {
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return false;    
    }
    
    public boolean xoaNhomsp(int manhomsanpham, byte trangthai){
        try {
           con= Conn.Conn1();
           stm= con.prepareStatement("update nhomsanpham set trangthai= ? where manhomsanpham= ?");
           stm.setByte(1, trangthai);
           stm.setInt(2, manhomsanpham);
           
           int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException se) {
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return false;   
    }
}
