/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;
import QuanLyBanHang.DTO.nhanvien;
import QuanLyBanHang.DAO.nhanvienDAO;
import java.util.ArrayList;
import Main.MyDialog;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author PC
 */
public class nhanvienBUS {
    private nhanvienDAO nvDAO = new nhanvienDAO();
    private List<nhanvien> listNhanVien = null;

    public nhanvienBUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhanVien = nvDAO.getDanhSachNhanVien();
    }

    public List<nhanvien> getDanhSachNhanVien() {
        if (this.listNhanVien == null)
            docDanhSach();
        return this.listNhanVien;
    }
    public String getTenNhanVien(int manhanvien){
        for (nhanvien nv : listNhanVien) {
            if(manhanvien==nv.getManhanvien()){
                return nv.getTen();
            }
        }
        return "";
    }
    public boolean themNhanVien(String ho, String ten, String gioitinh , String sodienthoai, String diachi, String chucvu) {
        ho = ho.trim();
        ten = ten.trim();
        sodienthoai= sodienthoai.trim();
        diachi= diachi.trim();
        chucvu = chucvu.trim();
        String regex="^0[98]{1}\\d{8}$";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher =pattern.matcher(sodienthoai);
        if( ! matcher.find()){
            new MyDialog("Số điện thoại không hợp lệ", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ten.equals("")) {
            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (chucvu.equals("")) {
            new MyDialog("Chức vụ không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        nhanvien nv = new nhanvien();
     
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioitinh(gioitinh);
        nv.setSodienthoai(sodienthoai);
        nv.setDiachi(diachi);
        nv.setChucvu(chucvu);
        boolean flag = nvDAO.themNhanVien(nv);
        if (!flag) {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
        } else {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public boolean updateNhanVien(String ma, String ho, String ten, String gioitinh , String sodienthoai, String diachi, String chucvu) {
        int manhanvien = Integer.parseInt(ma);
        ho = ho.trim();
        ten = ten.trim();
        sodienthoai= sodienthoai.trim();
        diachi= diachi.trim();
        chucvu = chucvu.trim();
        if (ten.equals("")) {
            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (chucvu.equals("")) {
            new MyDialog("Chức vụ không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        nhanvien nv = new nhanvien();
        nv.setManhanvien(manhanvien);
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioitinh(gioitinh);
        nv.setSodienthoai(sodienthoai);
        nv.setDiachi(diachi);
        nv.setChucvu(chucvu);
        boolean flag = nvDAO.updateNhanVien(nv);
        if (!flag) {
            new MyDialog("Cập nhập thất bại!", MyDialog.ERROR_DIALOG);
        } else {
            new MyDialog("Cập nhập thành công!", MyDialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public ArrayList<nhanvien> timNhanVien(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<nhanvien> dsnv = new ArrayList<>();
        for (nhanvien nv : listNhanVien) {
            if (nv.getHo().toLowerCase().contains(tuKhoa) || nv.getTen().toLowerCase().contains(tuKhoa) ||
                  nv.getGioitinh().toLowerCase().contains(tuKhoa)||   nv.getSodienthoai().toLowerCase().contains(tuKhoa)
                    || nv.getDiachi().toLowerCase().contains(tuKhoa) || nv.getChucvu().toLowerCase().contains(tuKhoa)) {
                dsnv.add(nv);
            }
        }
        return dsnv;
    }

    public boolean xoaNhanVien(String ma, byte trangthai) {
        try {
            int manhanvien = Integer.parseInt(ma);
            MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
            boolean flag = false;
            if (dlg.getAction() == MyDialog.OK_OPTION) {
                flag = nvDAO.deleteNhanVien(manhanvien,trangthai);
                if (flag) {
                    new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
                } else {
                    new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
                }
            }
            return flag;
        } catch (Exception e) {
            new MyDialog("Chưa chọn nhân viên!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    

    
}
