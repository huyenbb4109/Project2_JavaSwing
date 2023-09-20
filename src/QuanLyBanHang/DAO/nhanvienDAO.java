/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;
import QuanLyBanHang.DTO.nhanvien;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author PC
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nhanvienDAO {
    
    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static  ResultSet rs = null;
    
    public  List<nhanvien> getDanhSachNhanVien() {
       
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("select * from nhanvien where trangthai= 1");
            rs = stm.executeQuery();
            List<nhanvien> dsnv = new ArrayList<>();
            while(rs.next()){
                nhanvien nv = new nhanvien();

                nv.setManhanvien(rs.getInt(1));
                nv.setHo(rs.getString(2));
                nv.setTen(rs.getString(3));
                nv.setGioitinh(rs.getString(4));
                nv.setSodienthoai(rs.getString(5));
                nv.setDiachi(rs.getString(6));
                nv.setChucvu(rs.getString(7));
                nv.setTrangthai(rs.getByte(8));
                dsnv.add(nv);
            }
            return dsnv;
        } catch (SQLException ex) {
            Logger.getLogger( nhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return null;
    }

    public nhanvien getNhanVien(int manhanvien) {
        nhanvien nv = null;
       
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM nhanvien WHERE manhanvien=? ");
//            rs = stm.executeQuery();
            stm.setInt(0,manhanvien);
            rs = stm.executeQuery();
            while(rs.next()){
                nv = new nhanvien();

                nv.setManhanvien(rs.getInt(1));
                nv.setHo(rs.getString(2));
                nv.setTen(rs.getString(3));
                nv.setGioitinh(rs.getString(4));
                nv.setSodienthoai(rs.getString(5));
                nv.setDiachi(rs.getString(6));
                nv.setChucvu(rs.getString(7));
                nv.setTrangthai(rs.getByte(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger( nhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }

        return nv;
    }
    
    public int laysoluongnhanvien(){
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT COUNT(*) AS sl FROM nhanvien WHERE trangthai = 1");          
            rs = stm.executeQuery();
            
            if(rs.next()){               
                return rs.getInt("sl");
            }
        } catch (SQLException se) {
            return -1;
        }
        return 0;
    }

    public boolean updateNhanVien(nhanvien nv) {
        boolean result = false;
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE nhanvien SET ho=?, ten=?, gioitinh=?,  sodienthoai=? ,diachi=? ,chucvu=? WHERE manhanvien=? ");
//            rs = stm.executeQuery();
            
            stm.setString(1, nv.getHo());
            stm.setString(2, nv.getTen());
            stm.setString(3, nv.getGioitinh());
            stm.setString(4, nv.getSodienthoai());
            stm.setString(5, nv.getDiachi());
            stm.setString(6, nv.getChucvu());
            
            stm.setInt(7, nv.getManhanvien());
            
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( nhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }

    public boolean deleteNhanVien(int manhanvien, byte trangthai) {
         int kq= 0;
        
        try {
            con = Conn.Conn1();
            
            stm= con.prepareStatement("UPDATE nhanvien SET trangthai= ? WHERE manhanvien= ?");
            stm.setByte(1, trangthai);
            stm.setInt(2, manhanvien);
            
            kq = stm.executeUpdate() ;
       } catch (SQLException ex) {
            Logger.getLogger( nhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return  kq>0?true:false;
    }

    public boolean themNhanVien(nhanvien nv) {
        boolean result = false;
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO nhanvien(ho, ten, gioitinh, sodienthoai, diachi, chucvu) VALUES(?, ?, ?, ?, ?, ?)");
//            rs = stm.executeQuery();
            stm.setString(1, nv.getHo());
            stm.setString(2, nv.getTen());
            stm.setString(3, nv.getGioitinh());
            stm.setString(4, nv.getSodienthoai());
            stm.setString(5, nv.getDiachi());
            stm.setString(6, nv.getChucvu());
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( nhanvienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }
   
}
