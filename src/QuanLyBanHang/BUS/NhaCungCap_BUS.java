/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import Main.MyDialog;
import QuanLyBanHang.DAO.NhaCungCap_DAO;
import QuanLyBanHang.DTO.NhaCungCap;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author huynn
 */
public class NhaCungCap_BUS {
    private NhaCungCap_DAO nhaCungCapDAO = new NhaCungCap_DAO();
    private ArrayList<NhaCungCap> listNhaCungCap = null;

    public NhaCungCap_BUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhaCungCap = nhaCungCapDAO.getListNhaCungCap();
    }

    public ArrayList<NhaCungCap> getListNhaCungCap() {
        if (this.listNhaCungCap == null) {
            docDanhSach();
        }
        return this.listNhaCungCap;
    }
    
    public String getTenNhacc(int manhacc){
        for (NhaCungCap ncc : listNhaCungCap) {
            if(manhacc==ncc.getMancc()){
                return ncc.getTencc();
            }
        }
        return "";
    }

    public boolean themNhacc(String tenncc, String diachi, String sdt) {
        if (tenncc.trim().equals("")) {
            new MyDialog("Hãy nhập tên Nhà cung cấp này!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (diachi.trim().equals("")) {
            new MyDialog("Hãy nhập địa chỉ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(sdt).matches()) {
            new MyDialog("Hãy nhập số điện thoại hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        boolean flag = nhaCungCapDAO.themNcc(tenncc, diachi, sdt);
        if (flag==true) {
            new MyDialog("Thêm mới thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm mới thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean suaNhacc(String maNCC, String tenNCC, String diaChi, String dienThoai) {
        if (tenNCC.trim().equals("")) {
            new MyDialog("Hãy nhập tên Nhà cung cấp này!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (diaChi.trim().equals("")) {
            new MyDialog("Hãy nhập địa chỉ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            new MyDialog("Hãy nhập số điện thoại hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }

        int ma = Integer.parseInt(maNCC);

        
        boolean flag = nhaCungCapDAO.suaNcc(ma, tenNCC, diaChi, maNCC);

        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
    public boolean xoaNhacc(int mancc, byte tt){
        if(nhaCungCapDAO.xoaNcc(mancc, tt)){
            new MyDialog("Xóa thành công", MyDialog.SUCCESS_DIALOG);
            return true;
        }else{
            new MyDialog("Xóa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
    
    public ArrayList<NhaCungCap> timKiemNhacc(String tukhoa) {
        tukhoa = tukhoa.toLowerCase();
        ArrayList<NhaCungCap> dsncc = new ArrayList<>();
        for (NhaCungCap ncc : listNhaCungCap) {
            String ten = ncc.getTencc().toLowerCase();
            if (ten.contains(tukhoa)) {
                dsncc.add(ncc);
            }
        }
        return dsncc;
    }

}
