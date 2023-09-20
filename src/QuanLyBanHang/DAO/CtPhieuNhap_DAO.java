/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.CtPhieuNhap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class CtPhieuNhap_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    public ArrayList<CtPhieuNhap> getListCTPhieuNhap() {
        ArrayList<CtPhieuNhap> dsctpn = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM chitietphieunhap ORDER BY maphieunhap desc");
            rs= stm.executeQuery();
            
            while (rs.next()) {
                CtPhieuNhap ctpn = new CtPhieuNhap();
                ctpn.setMaphieunhap(rs.getInt("maphieunhap"));
                ctpn.setMasp(rs.getInt("masanpham"));
                ctpn.setGianhap(rs.getInt("gianhap"));
                ctpn.setSlnhap(rs.getInt("soluongnhaphang"));
                dsctpn.add(ctpn);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dsctpn;
    }

    public ArrayList<CtPhieuNhap> getListCTPhieuNhapTheoMaPN(int maPN) {
        ArrayList<CtPhieuNhap> dsctpn = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM chitietphieunhap WHERE maphieunhap= ? ORDER BY maphieunhap desc");
            rs= stm.executeQuery();
            while (rs.next()) {
                CtPhieuNhap ctpn = new CtPhieuNhap();
                ctpn.setMaphieunhap(rs.getInt("maphieunhap"));
                ctpn.setMasp(rs.getInt("masanpham"));
                ctpn.setGianhap(rs.getInt("gianhap"));
                ctpn.setSlnhap(rs.getInt("soluongnhaphang"));
                dsctpn.add(ctpn);
            }
        } catch (SQLException ex) {
            return null;
        }
        return dsctpn;
    }

//    public ArrayList<CTPhieuNhap> getListCTPhieuNhapTheoMaSP(int maSP) {
//        ArrayList<CTPhieuNhap> dsctpn = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM ctphieunhap WHERE MaSP=" + maSP;
//            Statement stmt = MyConnect.conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                CTPhieuNhap ctpn = new CTPhieuNhap();
//                ctpn.setMaPN(rs.getInt(1));
//                ctpn.setMaSP(rs.getInt(2));
//                ctpn.setSoLuong(rs.getInt(3));
//                ctpn.setDonGia(rs.getInt(4));
//                ctpn.setThanhTien(rs.getInt(5));
//                dsctpn.add(ctpn);
//            }
//        } catch (SQLException ex) {
//            return null;
//        }
//        return dsctpn;
//    }

    public boolean addCTPhieuNhap(int maphieunhap, int masanpham, float gianhap, int soluongnhaphang) {
        int kq = 0;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE sanpham SET soluong = soluong + ? WHERE masanpham = ?");
            stm.setInt(1, soluongnhaphang);
            stm.setInt(2, masanpham);
            stm.executeUpdate();
            
            
            stm = con.prepareStatement("INSERT INTO chitietphieunhap VALUES(?,?,?,?)");
            stm.setInt(1, maphieunhap);
            stm.setInt(2, masanpham);
            stm.setFloat(3, gianhap);
            stm.setInt(4, soluongnhaphang);
            
            kq= stm.executeUpdate();

        } catch (SQLException ex) {
            return false;
        }
       return kq>0?true:false;
    }
     public boolean updateCTPhieuNhap(int maphieunhap, int masanpham, float gianhap, int soluongnhaphang) {
        boolean result = false;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE chitietphieunhap SET maphieunhap=?, masanpham=?, gianhap=?, soluongnhaphang=? WHERE maphieunhap=?");
            
            stm.setInt(1, maphieunhap);
            stm.setInt(2, masanpham);
            stm.setFloat(3, gianhap);
            stm.setInt(4, soluongnhaphang);
           
            result = stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }
//    public boolean deleteCTPhieuNhap(int maPN) {
//        boolean result = false;
//        try {
//            String sql = "DELETE FROM ctphieunhap WHERE MaPN=" + maPN;
//            Statement stmt = MyConnect.conn.createStatement();
//            result = stmt.executeUpdate(sql) > 0;
//        } catch (SQLException ex) {
//            return false;
//        }
//        return result;
//    }
//
//    public boolean deleteCTPhieuNhap(int maPN, int maSP) {
//        boolean result = false;
//        try {
//            String sql = "DELETE FROM ctphieunhap WHERE MaPN=" + maPN + " AND MaSP=" + maSP;
//            Statement stmt = MyConnect.conn.createStatement();
//            result = stmt.executeUpdate(sql) > 0;
//        } catch (SQLException ex) {
//            return false;
//        }
//        return result;
//    }

//   
}
