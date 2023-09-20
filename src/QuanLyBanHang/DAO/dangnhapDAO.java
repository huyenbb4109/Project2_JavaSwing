/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DAO;
import QuanLyBanHang.DTO.taikhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class dangnhapDAO {
    public taikhoan dangNhap(taikhoan tk) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "");
            stm = con.prepareStatement("SELECT * FROM taikhoan WHERE tendangnhap=? AND matkhau=? AND trangthai=1");
            stm.setString(1, tk.getTendangnhap());
            stm.setString(2, tk.getMatkhau());
            rs = stm.executeQuery();
            taikhoan tkLogin = null;
            if (rs.next()) {
                tkLogin = tk;
                tkLogin.setManhanvien(rs.getInt("manhanvien"));
                tkLogin.setQuyen(rs.getString("quyen"));
            }
            return tkLogin;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tk;
    }
}
