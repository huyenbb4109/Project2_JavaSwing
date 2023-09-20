/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import QuanLyBanHang.DAO.giamgiaDAO;
import QuanLyBanHang.DTO.giamgia;
import java.util.ArrayList;
import java.util.Date;
import Main.MyDialog;
/**
 *
 * @author PC
 */
public class giamgiaBUS {
     private ArrayList<giamgia> listGiamGia = null;
    private giamgiaDAO giamGiaDAO = new giamgiaDAO();

    public giamgiaBUS() {
        docDanhSach();
    }
     public int getphantramGiamGia(int magiam){
        for (giamgia gg : listGiamGia) {
            if(magiam==gg.getMagiam()){
                return gg.getPhantramgiam();
            }
        }
        return -1;
    }
    public void docDanhSach() {
        this.listGiamGia = giamGiaDAO.getDanhSachMaGiam();
    }

    public ArrayList<giamgia> getDanhSachGiamGia() {
        if (this.listGiamGia == null)
            docDanhSach();
        return this.listGiamGia;
    }

    public boolean themMaGiam(String tengiamgia, String phantramgiam, String dieukien, Date ngaybatdau, Date ngayketthuc) {
        tengiamgia = tengiamgia.trim();
        phantramgiam = phantramgiam.replace("%", "");
        dieukien = dieukien.replace(",", "");
        if (tengiamgia.equals("")) {
            new MyDialog("Hãy nhập tên chương trình khuyến mãi!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngaybatdau.compareTo(ngayketthuc) > 0 || ngaybatdau.compareTo(ngayketthuc) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            int phantram = Integer.parseInt(phantramgiam);
            int dk = Integer.parseInt(dieukien);

            giamgia gg = new giamgia();
            gg.setTengiamgia(tengiamgia);
            gg.setPhantramgiam(phantram);
            gg.setDieukien(dk);
            gg.setNgaybatdau(ngaybatdau);
            gg.setNgayketthuc(ngayketthuc);

            flag = giamGiaDAO.themMaGiam(gg);
        } catch (Exception e) {
            new MyDialog("Hãy nhập số nguyên hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
            new MyDialog("Thêm mới thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm mới thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean suaMaGiam(String ma, String tengiamgia, String phantramgiam, String dieukien, Date ngaybatdau, Date ngayketthuc) {
        tengiamgia = tengiamgia.trim();
        phantramgiam = phantramgiam.replace("%", "");
        dieukien = dieukien.replace(",", "");
        if (ma.equals("")) {
            new MyDialog("Chưa chọn mã để sửa!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (tengiamgia.equals("")) {
            new MyDialog("Hãy nhập tên chương trình khuyến mãi!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngaybatdau.compareTo(ngayketthuc) > 0 || ngaybatdau.compareTo(ngayketthuc) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            int maGiam = Integer.parseInt(ma);
            int phantram = Integer.parseInt(phantramgiam);
            int dieukiengiam = Integer.parseInt(dieukien);

            giamgia gg = new giamgia();
            gg.setMagiam(maGiam);
            gg.setTengiamgia(tengiamgia);
            gg.setPhantramgiam(phantram);
            gg.setDieukien(dieukiengiam);
            gg.setNgaybatdau(ngaybatdau);
            gg.setNgayketthuc(ngayketthuc);

            flag = giamGiaDAO.suaMaGiam(gg);
        } catch (Exception e) {
            new MyDialog("Hãy nhập số nguyên hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    public boolean xoaGiamGia(String ma) {
        try {
            int magiam = Integer.parseInt(ma);
            MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
            boolean flag = false;
            if (dlg.getAction() == MyDialog.OK_OPTION) {
                flag = giamGiaDAO.deleteGiamGia(magiam);
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
    public ArrayList<giamgia> timgiamgia(String tuKhoa) {
        
        ArrayList<giamgia> dsgg = new ArrayList<>();
        for (giamgia gg : listGiamGia) {
            String phantram= gg.getPhantramgiam()+ "";
            if (phantram.contains(tuKhoa)) {
                dsgg.add(gg);
            }
        }
        return dsgg;
    }
}
