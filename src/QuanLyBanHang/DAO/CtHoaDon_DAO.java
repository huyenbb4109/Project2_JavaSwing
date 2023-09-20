/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.CtHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtHoaDon_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    public ArrayList<CtHoaDon> getListCTHoaDon() {
        ArrayList<CtHoaDon> dscthd = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM chitiethoadon ORDER BY mahoadon desc");
            rs= stm.executeQuery();
            
            while(rs.next()) {
                CtHoaDon cthd = new CtHoaDon();
                cthd.setMahoadon(rs.getInt("mahoadon"));
                cthd.setMasanpham(rs.getInt("masanpham"));
                cthd.setGiasanpham(rs.getFloat("giasanpham"));
                cthd.setSoluongmua(rs.getInt("soluongmua"));
                dscthd.add(cthd);
            }
        } catch(SQLException ex) {
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return dscthd;
    }

    public ArrayList<CtHoaDon> getListCTHoaDonTheoMaHD(int maHD) {
        ArrayList<CtHoaDon> dscthd = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM chitiethoadon WHERE mahoadon= ?");
            rs= stm.executeQuery();
            
            while(rs.next()) {
                CtHoaDon cthd = new CtHoaDon();
                cthd.setMahoadon(rs.getInt("mahoadon"));
                cthd.setMasanpham(rs.getInt("masanpham"));
                cthd.setGiasanpham(rs.getFloat("giasanpham"));
                cthd.setSoluongmua(rs.getInt("soluongmua"));
                dscthd.add(cthd);
            }
        } catch(SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return dscthd;
    }

    public ArrayList<CtHoaDon> getListCTHoaDonTheoMaSP(int maSP) {
        ArrayList<CtHoaDon> dscthd = new ArrayList<>();
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM chitiethoadon WHERE masanpham= ?");
            rs= stm.executeQuery();
            
            while(rs.next()) {
                CtHoaDon cthd = new CtHoaDon();
                cthd.setMahoadon(rs.getInt("mahoadon"));
                cthd.setMasanpham(rs.getInt("masanpham"));
                cthd.setGiasanpham(rs.getFloat("giasanpham"));
                cthd.setSoluongmua(rs.getInt("soluongmua"));
                dscthd.add(cthd);
            }
        } catch(SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return dscthd;
    }

    public boolean addCTHoaDon(int mahd, int masp, float giasp, int slmua) {
        int kq = 0;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO chitiethoadon VALUES(?,?,?,?)");
            stm.setInt(1, mahd);
            stm.setInt(2, masp);
            stm.setFloat(3, giasp);
            stm.setInt(4, slmua);
            
            kq= stm.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }

    
}
