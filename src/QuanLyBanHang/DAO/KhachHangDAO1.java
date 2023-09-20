/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DAO.Conn;
import QuanLyBanHang.DTO.KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class KhachHangDAO1 {
    
    private static Connection con = null;
    private static PreparedStatement stm = null ;
    private static ResultSet rs = null;
    
    public ArrayList<KhachHang> getListKhachHang() {
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM khachhang WHERE trangthai=1");          
            rs = stm.executeQuery();
            ArrayList<KhachHang> dskh = new ArrayList<>();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMakhachhang(rs.getInt(1));
                kh.setHoten(rs.getString(2));
                kh.setGioitinh(rs.getString(3));
                kh.setSodienthoai(rs.getString(4));
                kh.setGhichu(rs.getString(5));
                dskh.add(kh);
            }
            return dskh;
        } catch (SQLException ex) {
            Logger.getLogger( KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return null;
        
    }
    
    public int laysoluongkhach(){
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT COUNT(*) AS sl FROM khachhang WHERE trangthai = 1");          
            rs = stm.executeQuery();
            
            if(rs.next()){               
                return rs.getInt("sl");
            }
        } catch (SQLException se) {
            return -1;
        }
        return 0;
    }

    public KhachHang getKhachHang(int makhachhang) {
        KhachHang kh = null;
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM khachhang WHERE makhachhang=? AND trangthai=1");          
            rs = stm.executeQuery();
            stm.setInt(1, makhachhang);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                kh = new KhachHang();
                kh.setMakhachhang(rs.getInt(1));
                kh.setHoten(rs.getString(2));
                kh.setGioitinh(rs.getString(3));
                kh.setSodienthoai(rs.getString(4));
                kh.setGhichu(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger( KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return kh;
    }

    public boolean addKhachHang(KhachHang kh) {
        boolean result = false;
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO khachhang VALUES(?,?,?,?,?,1)");          
           
            stm.setInt(1, kh.getMakhachhang());
            stm.setString(2, kh.getHoten());
            stm.setString(3, kh.getGioitinh());
            stm.setString(4, kh.getSodienthoai());
            stm.setString(5, kh.getGhichu());
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }

    public boolean deleteKhachHang(int makhachhang) {
        boolean result = false;
        try {
             con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE khachhang SET trangthai=0 WHERE makhachhang=?"); 
            
//            String sql = "UPDATE khachhang SET TinhTrang=0 WHERE MaKH=?";
//            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            stm.setInt(1, makhachhang);
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }

    public boolean updateKhachHang(int makhachhang, KhachHang kh) {
        boolean result = false;
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("UPDATE khachhang SET hoten=?, gioitinh=?, sodienthoai=?, ghichu=? WHERE makhachhang=?"); 
            
            stm.setString(1, kh.getHoten());
            stm.setString(2, kh.getGioitinh());
            stm.setString(3, kh.getSodienthoai());
            stm.setString(4, kh.getGhichu());
            stm.setInt(5, makhachhang);
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger( KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return result;
    }

//    public boolean updateTongChiTieu(int maKH, int tongChiTieu) {
//        boolean result = false;
//        try {
//            
//            String sql = "UPDATE khachhang SET TongChiTieu=" + tongChiTieu + " WHERE MaKH=" + maKH;
//            Statement stmt = MyConnect.conn.createStatement();
//            result = stmt.executeUpdate(sql) > 0;
//        } catch (SQLException ex) {
//            return false;
//        }
//        return result;
//    }
    
//    public static List<KhachHang> getKhachHangList(String s){
//        List<KhachHang> dataList = new ArrayList<>();
//        
//        
//        Connection conn = null;
//        PreparedStatement statement = null;
//        
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project7", "root", "");
//            
//            String sql = "select * from khachhang";
//                if(s != null && !s.isEmpty()){
//                    sql += " where makhachhang = ?";
//                }
//            statement = conn.prepareStatement(sql);
//                if(s != null && !s.isEmpty()){
//                    statement.setString(1, s);
//                }
//            ResultSet resultSet = statement.executeQuery();
//            
//            while(resultSet.next()){
//                KhachHang khachHang = new KhachHang(
//                        resultSet.getInt("makhachhang"),
//                        resultSet.getString("hoten"),
//                        resultSet.getString("gioitinh"),
//                        resultSet.getString("sodienthoai"),
//                        resultSet.getString("ghichu")
//                        
//                );
//                dataList.add(khachHang); 
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        return dataList;
//    }
//    
//    
//    public static void insert(KhachHang khachHang){
//        Connection conn = null;
//        PreparedStatement statement = null;
//        
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project7", "root", "");
//            
//            String sql = "insert into khachhang(hoten, gioitinh, sodienthoai, ghichu) "
//                    + "values(?,?,?,?)";
//  
//            statement = conn.prepareStatement(sql);
//            statement.setString(1, khachHang.getHoten());
//            statement.setString(2, khachHang.getGioitinh());
//            statement.setString(3, khachHang.getSodienthoai());
//            statement.setString(4, khachHang.getGhichu());
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }
//    
//    public static void update(KhachHang khachHang){
//        Connection conn = null;
//        PreparedStatement statement = null;
//        
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project7", "root", "");
//            
//            String sql = "update khachhang set hoten=?, gioitinh=?, sodienthoai=?, ghichu=? where makhachhang = ? ";
//  
//            statement = conn.prepareStatement(sql);
//            statement.setString(1, khachHang.getHoten());
//            statement.setString(2, khachHang.getGioitinh());
//            statement.setString(3, khachHang.getSodienthoai());
//            statement.setString(4, khachHang.getGhichu());
//            statement.setInt(5, khachHang.getMakhachhang());
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }
//    
//    public static void delete(int makhachhang){
//        Connection conn = null;
//        PreparedStatement statement = null;
//        
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project7", "root", "");
//            
//            String sql = "delete from khachhang where makhachhang = ? ";
//  
//            statement = conn.prepareStatement(sql);
//            statement.setInt(1, makhachhang);
//            
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//            if(statement != null){
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(KhachHangDAO1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }
}
