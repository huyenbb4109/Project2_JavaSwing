/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;
import QuanLyBanHang.DTO.taikhoan;
import QuanLyBanHang.BUS.dangnhapBUS;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class taikhoanDAO {
    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static ResultSet rs = null;
    public boolean themTaiKhoan(int manhanvien, String tendangnhap,String matkhau, String quyen) {
       
        try {
            con  = Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO taikhoan(manhanvien, tendangnhap, matkhau, quyen) VALUES (?, ?, ?, ?)");
//            rs = stm.executeQuery();
           
            stm.setInt(1, manhanvien);
            stm.setString(2, tendangnhap);
            stm.setString(3, matkhau);
            stm.setString(4, quyen);
            return stm.executeUpdate() > 0;
       } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean kiemTraTrungTenDangNhap(String tendangnhap) {
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM taikhoan WHERE tendangnhap = '" + tendangnhap + "'");
            rs = stm.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }        
        return false;
    }

    public String getMatKhauTheoMa(int manhanvien) {
       
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT matkhau FROM taikhoan WHERE manhanvien=" + manhanvien);
            rs = stm.executeQuery();
            
            if (rs.next()) {
                return rs.getString(1);
            }
         } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return "";
    }
    public String getTenDangNhapTheoMa(int manhanvien) {
       
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT tendangnhap FROM taikhoan WHERE manhanvien=" + manhanvien);
            rs = stm.executeQuery();
            
            if (rs.next()) {
                return rs.getString(1);
            }
         } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return "";
    }
    public boolean datLaiMatKhau(int manhanvien, String matkhau) {
       
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET matkhau=? WHERE manhanvien=?");
//            rs = stm.executeQuery();
           
            stm.setString(1, matkhau);
            stm.setInt(2, manhanvien);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return false;
    }

    public boolean datLaiQuyen(int manhanvien, String quyen) {
       
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET quyen=? WHERE manhanvien=?");
//            rs = stm.executeQuery();
           
            stm.setString(1, quyen);
            stm.setInt(2, manhanvien);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           Conn.closeAll(con, stm, rs);
        }     
        return false;
    }

    public String getQuyenTheoMa(int manhanvien) {
       
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("SELECT quyen FROM taikhoan WHERE manhanvien=" + manhanvien);
            rs = stm.executeQuery();
           
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return "";
    }

    public boolean khoaTaiKhoan(int manhanvien) {
        
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET trangthai=0 WHERE manhanvien=?");
//            rs = stm.executeQuery();
           
            stm.setInt(1, manhanvien);
            return stm.executeUpdate() > 0;
       } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return false;
    }

    public boolean moKhoaTaiKhoan(int manhanvien) {
       
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET trangthai=1 WHERE manhanvien=?");
//            rs = stm.executeQuery();
            
            stm.setInt(1, manhanvien);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return false;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
       
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE taikhoan SET matkhau=? WHERE manhanvien=? AND matkhau=?");
//            rs = stm.executeQuery();
            
            stm.setString(1, matKhauMoi);
            stm.setInt(2, dangnhapBUS.taiKhoanLogin.getManhanvien());
            stm.setString(3, matKhauCu);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return false;
    }

    public int getTrangThai(int ma) {
       
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT trangthai FROM taikhoan WHERE manhanvien=" + ma);
            rs = stm.executeQuery();
            
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( taikhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }     
        return -1;
    }
    private String md5(String c){
        try{
            MessageDigest digs =MessageDigest.getInstance("MD5");
            digs.update((new String(c)).getBytes("UTF8"));
            String str =new String(digs.digest());
            return str;
        }catch(Exception ex){
            return "";
        }
    }
    
}
