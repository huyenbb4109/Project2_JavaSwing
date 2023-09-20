/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import QuanLyBanHang.DTO.giamgia;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class giamgiaDAO {
    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static  ResultSet rs = null;
    public ArrayList<giamgia> getDanhSachMaGiam() {
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM giamgia where trangthai = 1");
            rs = stm.executeQuery();
            
            ArrayList<giamgia> dsgg = new ArrayList<>();
            while (rs.next()) {
                giamgia gg = new giamgia();
                gg.setMagiam(rs.getInt(1));
                gg.setTengiamgia(rs.getString(2));
                gg.setPhantramgiam(rs.getInt(3));
                gg.setDieukien(rs.getInt(4));
                gg.setNgaybatdau(rs.getDate(5));
                gg.setNgayketthuc(rs.getDate(6));
                dsgg.add(gg);
            }
            return dsgg;
         } catch (SQLException ex) {
            Logger.getLogger( giamgiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return null;
    }

    public boolean themMaGiam(giamgia gg) {
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO giamgia(tengiamgia, phantramgiam , dieukien, ngaybatdau, ngayketthuc) VALUES (?, ?, ?, ?, ?)");
            
            stm.setString(1, gg.getTengiamgia());
            stm.setInt(2, gg.getPhantramgiam());
            stm.setInt(3, gg.getDieukien());

            stm.setTimestamp(4, new java.sql.Timestamp(gg.getNgaybatdau().getTime()));
            stm.setTimestamp(5, new java.sql.Timestamp(gg.getNgayketthuc().getTime()));

            return stm.executeUpdate() > 0;
       } catch (SQLException ex) {
            Logger.getLogger( giamgiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean suaMaGiam(giamgia gg) {
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("UPDATE giamgia SET tengiamgia=?, phantramgiam=?, dieukien=?, ngaybatdau=?, ngayketthuc=? WHERE magiam=?");
            
            stm.setString(1, gg.getTengiamgia());
            stm.setInt(2, gg.getPhantramgiam());
            stm.setInt(3, gg.getDieukien());

            stm.setTimestamp(4, new java.sql.Timestamp(gg.getNgaybatdau().getTime()));
            stm.setTimestamp(5, new java.sql.Timestamp(gg.getNgayketthuc().getTime()));

            stm.setInt(6, gg.getMagiam());
            return stm.executeUpdate() > 0;
       } catch (SQLException ex) {
            Logger.getLogger( giamgiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }
     public boolean deleteGiamGia(int magiam) {
        boolean result = false;
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE giamgia SET trangthai=0 WHERE magiam=?");
//            rs = stm.executeQuery();
            stm.setInt(1, magiam);
            result = stm.executeUpdate() > 0;
       } catch (SQLException ex) {
            Logger.getLogger( giamgiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }
}
