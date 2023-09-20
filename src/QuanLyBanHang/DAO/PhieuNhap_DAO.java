/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.PhieuNhap;
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
public class PhieuNhap_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    public ArrayList<PhieuNhap> getListPhieuNhap() {
        ArrayList<PhieuNhap> dspn = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("select * from phieunhap ORDER BY ngaynhap desc");
            rs= stm.executeQuery();
            while (rs.next()) {
                PhieuNhap pn = new PhieuNhap();
                pn.setMaphieunhap(rs.getInt("maphieunhap"));
                pn.setManhacc(rs.getInt("manhacungcap"));
                pn.setManv(rs.getInt("manhanvien"));
                pn.setNgaynhap(rs.getString("ngaynhap"));
                pn.setGhichu(rs.getString("ghichu"));
                dspn.add(pn);
            }
        } catch (SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return dspn;
    }

    public boolean themPhieuNhap(int mancc, int manv, String ngaynhap, String ghichu) {
        int kq = 0;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO phieunhap(manhacungcap, manhanvien, ngaynhap, ghichu) VALUES(?,?,?,?)");
            stm.setInt(1, mancc);
            stm.setInt(2, manv);
            stm.setString(3, ngaynhap);
            stm.setString(4, ghichu);
            
            kq = stm.executeUpdate();
            
        } catch (SQLException ex) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }

    public PhieuNhap getPhieuNhapTheoMa(int maPN) {
        PhieuNhap pn = null;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM phieunhap WHERE maphieunhap= ?"+maPN);
            stm.setInt(1, maPN);
            rs= stm.executeQuery();
            
            while (rs.next()) {
                pn = new PhieuNhap();
                pn.setMaphieunhap(rs.getInt("maphieunhap"));
                pn.setManhacc(rs.getInt("manhacungcap"));
                pn.setManv(rs.getInt("manhanvien"));
                pn.setNgaynhap(rs.getString("ngaynhap"));
                pn.setGhichu(rs.getString("ghichu"));
                
            }
        } catch (SQLException ex) {
            return null;
        }
        return pn;
    }

    public boolean updatePhieuNhap(int maPN, String ghichu) {
        int kq = 0;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE phieunhap SET ghichu=? WHERE maphieunhap= ?"+ maPN);
            stm.setString(1, ghichu);
            stm.setInt(2, maPN);
            
            kq = stm.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return kq>0?true:false;
    }

    public int getMaPhieuNhapCuoiCung() {
        try {
            con=Conn.Conn1();
            stm = con.prepareStatement("SELECT MAX(maphieunhap) FROM phieunhap");
            rs = stm.executeQuery();
            if (rs.next())
                return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
