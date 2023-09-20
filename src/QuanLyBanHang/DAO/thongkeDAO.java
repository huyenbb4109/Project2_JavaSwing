/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import QuanLyBanHang.DTO.thongke;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class thongkeDAO {
    private static Connection con = null;
    private static PreparedStatement stm = null;
    private static  ResultSet rs = null;
    public thongke getThongKe(int nam) {
        thongke thongKe = new thongke();
        int[] tongThuQuy = new int[4];
        thongKe.setSoLuongSP(getTongSoLuongSP());
        thongKe.setSoLuongKH(getSoLuongKhachHang());
        thongKe.setSoLuongNV(getSoLuongNhanVien());
//        tongThuQuy[0] = getTongThuQuy(nam, 1);
//        tongThuQuy[1] = getTongThuQuy(nam, 2);
//        tongThuQuy[2] = getTongThuQuy(nam, 3);
//        tongThuQuy[3] = getTongThuQuy(nam, 4);
//        thongKe.setTongThuQuy(tongThuQuy);
//        thongKe.setTopSanPhamBanChay(getTopBanChay());
        return thongKe;
    }

//    private ArrayList<sanpham> getTopBanChay() {
//        try {
//            con  = Conn.Conn1();
//            stm = con.prepareStatement( "SELECT MaSP, DaBan FROM (" +
//                    "SELECT MaSP, SUM(SoLuong) AS DaBan FROM " +
//                    "cthoadon GROUP BY MaSP" +
//                    ") temp " +
//                    "ORDER BY DaBan " +
//                    "DESC LIMIT 5");
//            rs = stm.executeQuery();
//            ArrayList<SanPham> dssp = new ArrayList<>();
//            SanPhamBUS spBUS = new SanPhamBUS();
//            while (rs.next()) {
//                SanPham sp = new SanPham();
//                sp.setMaSP(rs.getInt(1));
//                sp.setSoLuong(rs.getInt(2));
//                sp.setTenSP(spBUS.getTenSP(sp.getMaSP()));
//                dssp.add(sp);
//            }
//            return dssp;
//      } catch (SQLException ex) {
//            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            Conn.closeAll(con, stm, rs);
//        }
//        return null;
//    }

    private int getTongSoLuongSP() {
        try {
            con = Conn.Conn1();
            
//            rs = stm.executeQuery("SELECT COUNT(*) FROM sanpham");
            stm = con.prepareStatement("SELECT COUNT(*) FROM sanpham");
            rs = stm.executeQuery("SELECT COUNT(*) FROM sanpham");
           
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return 0;
    }

    private String[] getDateString(int nam, int quy) {
        int namBatDau = nam;
        int namKetThuc = nam;
        String thangBatDau = "01"; 
        String thangKetThuc = "04"; 
        String[] kq = new String[2];
        switch (quy) {
            case 1:
                thangBatDau = "01";
                thangKetThuc = "04";
                break;
            case 2:
                thangBatDau = "03";
                thangKetThuc = "07";
                break;
            case 3:
                thangBatDau = "06";
                thangKetThuc = "10";
                break;
            case 4:
                thangBatDau = "09";
                thangKetThuc = "01";
                namKetThuc++;
        }
        String strBatDau = Integer.toString(namBatDau) + thangBatDau + "01";
        String strKetThuc = Integer.toString(namKetThuc) + thangKetThuc + "01";
        kq[0] = strBatDau;
        kq[1] = strKetThuc;
        return kq;
    }

    private int getTongThuQuy(int nam, int quy) {
        String[] dateString = getDateString(nam, quy);
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT SUM(TongTien) FROM hoadon "
                    + "WHERE NgayLap >= ? AND NgayLap < ?");
            
            stm.setString(1, dateString[0]);
            stm.setString(2, dateString[1]);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
         } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return 0;
    }

    private int getSoLuongNhanVien() {
        try {
            con = Conn.Conn1();
            
            stm = con.prepareStatement("SELECT COUNT(*) FROM nhanvien");
            rs = stm.executeQuery("SELECT COUNT(*) FROM nhanvien");
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return 0;
    }

    private int getSoLuongKhachHang() {
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT COUNT(*) FROM khachhang");
            rs = stm.executeQuery("SELECT COUNT(*) FROM khachhang");
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return 0;
    }

    public double getDoanhThuThang(int thang, int nam) {
        try {
            String thangBD = nam + "-" + thang + "-01";
            String thangKT = nam + "-" + (thang + 1) + "-01";
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT SUM(TongTien) FROM HoaDon WHERE NgayLap BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)");
           
            stm.setString(1, thangBD);
            stm.setString(2, thangKT);
            rs = stm.executeQuery();
            while (rs.next()) {
                return Double.parseDouble(rs.getInt(1) + "");
            }
        } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return nam;
    }

    public double abc(int thang, int nam) {
        try {
            String d1 = nam + "-" + thang + "-01";
            String d2 = nam + "-" + (thang + 1) + "-01";
             con = Conn.Conn1();
            stm = con.prepareStatement("SELECT SUM(TongTien) FROM HoaDon WHERE NgayLap BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)");
            
            stm.setString(1, d1);
            stm.setString(2, d2);
            rs = stm.executeQuery();

            while (rs.next())
                return rs.getDouble(1);
       } catch (SQLException ex) {
            Logger.getLogger( thongkeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } finally {
            Conn.closeAll(con, stm, rs);
        }
        return 0.0f;
    }
}
