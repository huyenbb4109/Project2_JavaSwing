/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.HoaDon;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class HoaDon_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> dshd = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM hoadon ORDER BY mahoadon desc");
            rs= stm.executeQuery();
            
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahoadon(rs.getInt("mahoadon"));
                hd.setMakhachhang(rs.getInt("makhachhang"));
                hd.setManhanvien(rs.getInt("manhanvien"));
                hd.setMagiam(rs.getInt("magiam"));
                hd.setNgaylap(rs.getString("ngaylap"));
                hd.setGhichu(rs.getString("ghichu"));
                dshd.add(hd);
            }
        } catch (SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return dshd;
    }

    public boolean addHoaDon(int makh, int manv, int magiam, String ngaylap, String ghichu) {
        int kq= 0;
        try {
            con= Conn.Conn1();
            
            stm = con.prepareStatement("INSERT INTO hoadon(makhachhang, manhanvien, magiam, ngaylap, ghiChu) VALUES(?, ?, ?, ?, ?)");
            stm.setInt(1, makh);
            stm.setInt(2, manv);
            stm.setInt(3, magiam);
            stm.setString(4, ngaylap);
            stm.setString(5, ghichu);
            
            kq= stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }

    public int getMaHoaDonMoiNhat() {
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT MAX(mahoadon) FROM hoadon");
            rs= stm.executeQuery();
            
            if (rs.next())
                return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return -1;
    }

    public ArrayList<HoaDon> timkiemHoaDonTheoNgay(String dateMin, String dateMax) {
        try {
            con= Conn.Conn1();
            
            stm = con.prepareStatement("SELECT * FROM hoadon WHERE ngaylap BETWEEN ? and ?");
            stm.setString(1, dateMin);
            stm.setString(2, dateMax);
            
            rs= stm.executeQuery();
            
            ArrayList<HoaDon> dshd = new ArrayList<>();

            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahoadon(rs.getInt("mahoadon"));
                hd.setMakhachhang(rs.getInt("makhachhang"));
                hd.setManhanvien(rs.getInt("manhanvien"));
                hd.setMagiam(rs.getInt("magiam"));
                hd.setNgaylap(rs.getString("ngaylap"));
                hd.setGhichu(rs.getString("ghichu"));
                dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return null;
    }
}
