/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;
import QuanLyBanHang.DAO.taikhoanDAO;
import QuanLyBanHang.DTO.taikhoan;
import Main.MyDialog;
import java.security.MessageDigest;
/**
 *
 * @author PC
 */
public class taikhoanBUS {
    private taikhoanDAO taiKhoanDAO = new taikhoanDAO();

    public String getMatKhauTheoMa(String ma) {
        int manhanvien = Integer.parseInt(ma);
        return taiKhoanDAO.getMatKhauTheoMa(manhanvien);
    }
    public String getTenDangNhapTheoMa(String ma) {
        int manhanvien = Integer.parseInt(ma);
        return taiKhoanDAO.getTenDangNhapTheoMa(manhanvien);
    }

    public String getQuyenTheoMa(String ma) {
        int manhanvien = Integer.parseInt(ma);
        return taiKhoanDAO.getQuyenTheoMa(manhanvien);
    }

    public void datLaiMatKhau(String ma, String matkhau) {
        int manhanvien = Integer.parseInt(ma);
        boolean flag = taiKhoanDAO.datLaiMatKhau(manhanvien, matkhau);
        if (flag) {
            new MyDialog("Đặt lại thành công! Mật khẩu mới là: " + matkhau, MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Đặt lại thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public void datLaiQuyen(String ma, String quyen) {
        int manhanvien = Integer.parseInt(ma);
        boolean flag = taiKhoanDAO.datLaiQuyen(manhanvien, quyen);
        if (flag) {
            new MyDialog("Đặt lại thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Đặt lại thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public boolean kiemTraTrungTenDangNhap(String tendangnhap) {
        return taiKhoanDAO.kiemTraTrungTenDangNhap(tendangnhap);
    }

    public boolean themTaiKhoan(String ma, String tendangnhap,String matkhau, String quyen) {
        int manhanvien = Integer.parseInt(ma);
        if (tendangnhap.trim().equals("")) {
            new MyDialog("Không được để trống Tên đăng nhập!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (kiemTraTrungTenDangNhap(tendangnhap)) {
            MyDialog dlg = new MyDialog("Tên đăng nhập bị trùng! Có thể tài khoản bị khoá, thực hiện mở khoá?", MyDialog.WARNING_DIALOG);
            if (dlg.getAction() == MyDialog.OK_OPTION) {
                moKhoaTaiKhoan(ma);
                return true;
            }
            return false;
        }
        boolean flag = taiKhoanDAO.themTaiKhoan(manhanvien, tendangnhap, matkhau, quyen);
        if (flag) {
            new MyDialog("Cấp tài khoản thành công! Mật khẩu là " + md5(matkhau), MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Cấp tài khoản thất bại! Tài khoản đã tồn tại", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public void khoaTaiKhoan(String ma) {
        int manhanvien = Integer.parseInt(ma);
        boolean flag = taiKhoanDAO.khoaTaiKhoan(manhanvien);
        if (flag) {
            new MyDialog("Khoá tài khoản thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Khoá tài khoản thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public void moKhoaTaiKhoan(String ma) {
        int manhanvien = Integer.parseInt(ma);
        boolean flag = taiKhoanDAO.moKhoaTaiKhoan(manhanvien);
        if (flag) {
            new MyDialog("Mở khoá tài khoản thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Mở khoá tài khoản thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi, String nhapLaiMatKhau) {
        if(!matKhauMoi.equals(nhapLaiMatKhau)) {
            new MyDialog("Mật khẩu mới không khớp!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = taiKhoanDAO.doiMatKhau(matKhauCu, matKhauMoi);
        if (flag) {
            new MyDialog("Đổi thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Mật khẩu cũ nhập sai!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
    public int getTrangThai(String manhanvien) {
        int ma = Integer.parseInt(manhanvien);
        return taiKhoanDAO.getTrangThai(ma);
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
