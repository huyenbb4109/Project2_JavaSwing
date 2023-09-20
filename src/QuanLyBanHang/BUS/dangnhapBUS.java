/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;
import QuanLyBanHang.DAO.dangnhapDAO;
import QuanLyBanHang.DTO.phanquyen;
import QuanLyBanHang.DTO.taikhoan;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import Main.MyDialog;
import java.security.MessageDigest;
/**
 *
 * @author PC
 */
public class dangnhapBUS {
    private final static int EMPTY_ERROR = 1;
    private final static int WRONG_ERROR = 2;
    public static taikhoan taiKhoanLogin = null;

    public taikhoan getTaiKhoanDangNhap(String user, String password, boolean selected) {
        if (kiemTraDangNhap(user, password) == EMPTY_ERROR) {
            new MyDialog("Không được để trống thông tin!", MyDialog.ERROR_DIALOG);
            return null;
        }
        taikhoan tk = new taikhoan();
        tk.setTendangnhap(user);
        tk.setMatkhau(password);

        dangnhapDAO dangNhapDAO = new dangnhapDAO();
        taikhoan account = dangNhapDAO.dangNhap(tk);
        taiKhoanLogin = account;

        if (account == null) {
            new MyDialog("Sai thông tin đăng nhập hoặc tài khoản đã bị khoá!", MyDialog.ERROR_DIALOG);
        } else {
            phanquyenBUS phanQuyenBUS = new phanquyenBUS();
            phanQuyenBUS.kiemTraQuyen(account.getQuyen());
            xuLyGhiNhoDangNhap(user, password, selected);
            new MyDialog("Đăng nhập thành công!", MyDialog.SUCCESS_DIALOG);
//            new MyDialog("Vì tình hình dịch Covid phức tạp, cửa hàng chỉ thực hiện bán mang về!", MyDialog.INFO_DIALOG);
        }
        return account;
    }

    public String getTaiKhoanGhiNho() {
        try {
            FileInputStream fis = new FileInputStream("remember.dat");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = br.readLine();
            br.close();
            return line;
        }catch (Exception e) {
        }
        return "";
    }

    private void xuLyGhiNhoDangNhap(String user, String password, boolean selected) {
        try {
            if (!selected) {
                user = "";
                password = "";
            }
            FileWriter fw = new FileWriter("remember.dat");
            fw.write(user + " | " + password);
            fw.close();
        } catch (Exception e) {
        }
    }

    private int kiemTraDangNhap(String user, String password) {
        user = user.replaceAll("\\s+", "");
        password = password.replaceAll("\\s+", "");
        int result = 0;

        taikhoan tk = new taikhoan();
        tk.setTendangnhap(user);
        tk.setMatkhau(password);

        dangnhapDAO dangNhapDAO = new dangnhapDAO();
        taikhoan account = dangNhapDAO.dangNhap(tk);

        if (user.length() <= 0 || password.length() <= 0) {
            result = EMPTY_ERROR;
        } else if (account == null) {
            result = WRONG_ERROR;
        }
        return result;
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
