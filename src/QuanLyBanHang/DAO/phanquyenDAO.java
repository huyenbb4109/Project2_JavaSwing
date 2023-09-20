/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;
import QuanLyBanHang.DTO.phanquyen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class phanquyenDAO {
    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static  ResultSet rs = null;
    public ArrayList<phanquyen> getListQuyen() {
        
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM phanquyen");
            rs = stm.executeQuery();
            
            ArrayList<phanquyen> dspq = new ArrayList<>();
            while (rs.next()) {
                phanquyen phanQuyen = new phanquyen();
                phanQuyen.setQuyen(rs.getString(1));
                phanQuyen.setQuanlysanpham(rs.getInt(2));
                phanQuyen.setQuanlynhanvien(rs.getInt(3));
                phanQuyen.setQuanlybanhang(rs.getInt(4));
                phanQuyen.setQuanlykhachhang(rs.getInt(5));
                phanQuyen.setQuanlythongke(rs.getInt(6));
                phanQuyen.setQuanlykhuyenmai(rs.getInt(7));
                phanQuyen.setQuanlynhaphang(rs.getInt(8));
                dspq.add(phanQuyen);
            }
            return dspq;
        } catch (SQLException ex) {
            Logger.getLogger( phanquyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           Conn.closeAll(con, stm, rs);
        }
        return null;
    }

    public phanquyen getQuyen(String quyen) {
       
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM phanquyen WHERE quyen='" + quyen + "'");
            rs = stm.executeQuery();
           
            if (rs.next()) {
                phanquyen phanQuyen = new phanquyen();
                phanQuyen.setQuyen(quyen);
                
                phanQuyen.setQuanlysanpham(rs.getInt(2));
                phanQuyen.setQuanlynhanvien(rs.getInt(3));
                phanQuyen.setQuanlybanhang(rs.getInt(4));
                phanQuyen.setQuanlykhachhang(rs.getInt(5));
                phanQuyen.setQuanlythongke(rs.getInt(6));
                phanQuyen.setQuanlykhuyenmai(rs.getInt(7));
                phanQuyen.setQuanlynhaphang(rs.getInt(8));
                
                return phanQuyen;
            }
        } catch (SQLException ex) {
            Logger.getLogger( phanquyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return null;
    }

    public boolean suaQuyen(phanquyen phanQuyen) {
       
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("UPDATE phanquyen SET quanlysanpham=?, quanlynhanvien=?, quanlybanhang=?, quanlykhachhang=? , quanlythongke=? , quanlykhuyenmai=?, quanlynhaphang=?  WHERE quyen=?");
//            rs = stm.executeQuery();
            
            stm.setInt(1, phanQuyen.getQuanlysanpham());
            stm.setInt(2, phanQuyen.getQuanlynhanvien());
            stm.setInt(3, phanQuyen.getQuanlybanhang());
            stm.setInt(4, phanQuyen.getQuanlykhachhang());
            stm.setInt(5, phanQuyen.getQuanlythongke());
            stm.setInt(6, phanQuyen.getQuanlykhuyenmai());
            stm.setInt(7, phanQuyen.getQuanlynhaphang());
            stm.setString(8, phanQuyen.getQuyen());
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( phanquyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean themQuyen(phanquyen phanQuyen) {
       
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO phanquyen VALUES (?,?,?,?,?,?,?,?)");
//            rs = stm.executeQuery();
            
            stm.setString(1, phanQuyen.getQuyen());
            stm.setInt(2, phanQuyen.getQuanlysanpham());
            stm.setInt(3, phanQuyen.getQuanlynhanvien());
            stm.setInt(4, phanQuyen.getQuanlybanhang());
            stm.setInt(5, phanQuyen.getQuanlykhachhang());
            stm.setInt(6, phanQuyen.getQuanlythongke());
            stm.setInt(7, phanQuyen.getQuanlykhuyenmai());
            stm.setInt(8, phanQuyen.getQuanlynhaphang());
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( phanquyenDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean xoaQuyen(String phanQuyen) {
        
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET quyen='Default' WHERE quyen='" + phanQuyen + "'");
//            rs = stm.executeQuery();
            stm = con.prepareStatement("DELETE FROM phanquyen WHERE quyen='" + phanQuyen + "'");
            
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
