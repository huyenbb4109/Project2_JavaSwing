/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;
import QuanLyBanHang.DTO.phanquyen;
import QuanLyBanHang.DAO.phanquyenDAO;
import Main.MyDialog;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class phanquyenBUS {
     public static phanquyen quyenTK = null;
    private phanquyenDAO phanQuyenDAO = new phanquyenDAO();
    private ArrayList<phanquyen> listPhanQuyen = null;

    public void docDanhSachQuyen() {
        this.listPhanQuyen = phanQuyenDAO.getListQuyen();
    }

    public void kiemTraQuyen(String quyen) {
        quyenTK = phanQuyenDAO.getQuyen(quyen);
    }

    public ArrayList<phanquyen> getListQuyen() {
        if (listPhanQuyen == null)
            docDanhSachQuyen();
        return this.listPhanQuyen;
    }

    public boolean suaQuyen(String tenQuyen, int sanPham, int nhanVien, int banHang,int khachHang ,int thongKe,int khuyenMai,int nhapHang) {
        phanquyen phanQuyen = new phanquyen(tenQuyen, sanPham, nhanVien, banHang,khachHang, thongKe, khuyenMai, nhapHang);
        boolean flag = phanQuyenDAO.suaQuyen(phanQuyen);
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean themQuyen(String tenQuyen) {
        if (tenQuyen == null || tenQuyen.trim().equals("")) {
            return false;
        }

        if (kiemTonTaiTraQuyen(tenQuyen)) {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
            return false;
        }

        phanquyen phanQuyen = new phanquyen(tenQuyen, 0, 0, 0, 0, 0, 0 ,0);
        boolean flag = phanQuyenDAO.themQuyen(phanQuyen);
        if (flag) {
            new MyDialog("Thêm thành công! Hãy hiệu chỉnh quyền", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    private boolean kiemTonTaiTraQuyen(String tenQuyen) {
        docDanhSachQuyen();
        for (phanquyen q : listPhanQuyen) {
            if (q.getQuyen().equalsIgnoreCase(tenQuyen))
                return true;
        }
        return false;
    }

    public boolean xoaQuyen(String tenQuyen) {
        boolean flag = phanQuyenDAO.xoaQuyen(tenQuyen);
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
}
