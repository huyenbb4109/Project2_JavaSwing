/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.NhaCungCap;
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
public class NhaCungCap_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    public ArrayList<NhaCungCap> getListNhaCungCap() {
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM nhacungcap where trangthai= 1");
            rs = stm.executeQuery();
            ArrayList<NhaCungCap> dsncc = new ArrayList<>();
            while (rs.next()) {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMancc(rs.getInt("manhacungcap"));
                ncc.setTencc(rs.getString("tennhacungcap"));
                ncc.setDiachi(rs.getString("diachi"));
                ncc.setSdt(rs.getString("sodienthoai"));
                ncc.setTrangthai(rs.getByte("trangthai"));
                dsncc.add(ncc);
            }
            return dsncc;
        } catch (SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
    }

    public NhaCungCap getNhaCungCapTheoMa(int maNCC) {
        NhaCungCap ncc= null;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("SELECT * FROM nhacungcap where manhacungcap= ?");
            stm.setInt(1, maNCC);
            rs = stm.executeQuery();
            while (rs.next()) {
                ncc = new NhaCungCap();
                ncc.setMancc(rs.getInt("manhacungcap"));
                ncc.setTencc(rs.getString("tennhacungcap"));
                ncc.setDiachi(rs.getString("diachi"));
                ncc.setSdt(rs.getString("sodienthoai"));
                ncc.setTrangthai(rs.getByte("trangthai"));
//                return ncc;
            }
        } catch (SQLException ex) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return ncc;
    }

    public boolean themNcc(String tennhacungcap, String diachi, String sdt) {
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("INSERT INTO nhacungcap(tennhacungcap, diachi, sodienthoai) VALUES(?,?,?)");
            stm.setString(1, tennhacungcap);
            stm.setString(2, diachi);
            stm.setString(3, sdt);
           
            int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException ex) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        
    }

    public boolean suaNcc(int mancc, String tenncc, String diachi, String sdt) {
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE nhacungcap SET tennhacungcap=?, diachi=?, sodienthoai=? WHERE manhacungcap=?");
            stm.setString(1, tenncc);
            stm.setString(2, diachi);
            stm.setString(3, sdt);
            stm.setInt(4, mancc);
           
            int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException ex) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
    }

    public boolean xoaNcc(int manhacc, byte trangthai) {
        try {
           con= Conn.Conn1();
           stm= con.prepareStatement("update nhacungcap set trangthai= ? where manhacungcap= ?");
           stm.setByte(1, trangthai);
           stm.setInt(2, manhacc);
           
           int kq = stm.executeUpdate();
            
            return kq > 0 ? true : false;
        } catch (SQLException ex) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
    }
}
