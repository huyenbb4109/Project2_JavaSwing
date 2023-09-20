/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang.BUS;


import QuanLyBanHang.DAO.KhachHangDAO1;
import QuanLyBanHang.DTO.KhachHang;
import Main.MyDialog;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class KhachHangBUS {
    
     private ArrayList<KhachHang> listKhachHang = null;
    private KhachHangDAO1 khachHangDAO1 = new KhachHangDAO1();

    public void docDanhSach() {
        this.listKhachHang = khachHangDAO1.getListKhachHang();
    }

    public ArrayList<KhachHang> getListKhachHang() {
        if (listKhachHang == null)
            docDanhSach();
        return listKhachHang;
    }

//    public ArrayList<KhachHang> timKiemKhachHang(String txtMin, String txtMax) {
//        if (txtMax.trim().equals("") && txtMin.trim().equals(""))
//            return listKhachHang;
//        try {
//            ArrayList<KhachHang> dskh = new ArrayList<>();
//            txtMin = txtMin.replace(",", "");
//            txtMax = txtMax.replace(",", "");
//            int min = Integer.parseInt(txtMin);
//            int max = Integer.parseInt(txtMax);
//            for (KhachHang kh : listKhachHang) {
//                if (kh.getTongChiTieu() >= min && kh.getTongChiTieu() <= max) {
//                    dskh.add(kh);
//                }
//            }
//            return dskh;
//        } catch (Exception e) {
//            new MyDialog("Hãy nhập giá trị nguyên phù hợp!", MyDialog.ERROR_DIALOG);
//        }
//        return null;
//    }
//
    public ArrayList<KhachHang> timKiemKhachHang(String tuKhoa) {
           tuKhoa = tuKhoa.toLowerCase();
           ArrayList<KhachHang> dskh = new ArrayList<>();
           for (KhachHang kh : listKhachHang) {
               String hoten = kh.getHoten().toLowerCase();
               String sodienthoai = kh.getSodienthoai().toLowerCase();
               String gioiTinh = kh.getGioitinh().toLowerCase();
               if (hoten.contains(tuKhoa) || sodienthoai.contains(tuKhoa) || gioiTinh.contains(tuKhoa)) {
                   dskh.add(kh);
               }
           }
           return dskh;
    }
    

    public boolean themKhachHang(String hoten, String gioitinh, String sodienthoai, String ghichu) {
        if (hoten.trim().equals("")) {
            new MyDialog("Không được để trống tên!", MyDialog.ERROR_DIALOG);
            return false;
        }
//            Pattern k = Pattern.compile("^$");
//                if(k.matcher(hoten).find()){
//                    new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
//                }else{
//                    new MyDialog("Nhập đúng số điện thoại!", MyDialog.ERROR_DIALOG);
//                }
        
        String regex="^0[98]{1}\\d{8}$";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher =pattern.matcher(sodienthoai);
        if( ! matcher.find()){
            new MyDialog("Số điện thoại không hợp lệ", MyDialog.ERROR_DIALOG);
            return false;
        }
            
//                if(p.matcher(sodienthoai).find()){
//                    new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
//                }else{
//                    new MyDialog("Nhập đúng số điện thoại!", MyDialog.ERROR_DIALOG);
//                }
           
        if (gioitinh.equals("Chọn giới tính")) {
            new MyDialog("Hãy chọn giới tính!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        KhachHang kh = new KhachHang();
        kh.setHoten(hoten);
        kh.setGioitinh(gioitinh);
        kh.setSodienthoai(sodienthoai);
        kh.setGhichu(ghichu);
//        kh.setTongChiTieu(0);
        boolean flag = khachHangDAO1.addKhachHang(kh);
        if (flag) {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
//         return false;
    }

    public boolean suaKhachHang(String ma, String hoten, String gioitinh, String sodienthoai, String ghichu) {
        if (hoten.trim().equals("")) {
            new MyDialog("Không được để trống tên!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(sodienthoai.trim().equals("")) {
            new MyDialog("Không được để trống số điện thoại!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (gioitinh.equals("Chọn giới tính")) {
            new MyDialog("Hãy chọn giới tính!", MyDialog.ERROR_DIALOG);
            return false;
        }
        KhachHang kh = new KhachHang();
        kh.setHoten(hoten);
        kh.setGioitinh(gioitinh);
        kh.setSodienthoai(sodienthoai);
        kh.setGhichu(ghichu);
        boolean flag = khachHangDAO1.updateKhachHang(Integer.parseInt(ma), kh);
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean xoaKhachHang(String ma) {
        boolean flag = false;
        try {
            int maKH = Integer.parseInt(ma);
            MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
            if(dlg.getAction() == MyDialog.CANCEL_OPTION)
                return false;
            flag = khachHangDAO1.deleteKhachHang(maKH);
        } catch (Exception e) {
            new MyDialog("Chưa chọn khách hàng!", MyDialog.ERROR_DIALOG);
        }
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
    
//    private ArrayList<KhachHang> listKhachHang = null;
//    private KhachHangDAO khachHangDAO = new KhachHangDAO();
//
//    public void docDanhSach() {
//        this.listKhachHang = khachHangDAO.getListKhachHang();
//    }
//
//    public ArrayList<KhachHang> getListKhachHang() {
//        if (listKhachHang == null)
//            docDanhSach();
//        return listKhachHang;
//    }
//    
////    public ArrayList<KhachHang> timKiemKhachHang(String tuKhoa) {
////        tuKhoa = tuKhoa.toLowerCase();
////        ArrayList<KhachHang> dskh = new ArrayList<>();
////        for (KhachHang kh : listKhachHang) {
////            String Hoten = kh.getHoten().toLowerCase();
////            String gioitinh = kh.isGioitinh().toLowerCase();
////            String sodienthoai = kh.getSodienthoai().toLowerCase();
////            if (Hoten.contains(tuKhoa) || gioitinh.contains(tuKhoa) || sodienthoai.contains(tuKhoa)) {
////                dskh.add(kh);
////            }
////        }
////        return dskh;
////    }
//    
//    public boolean themKhachHang(String hoten, String gioitinh, String sodienthoai, String ghichu) {
//        if (hoten.trim().equals("")) {
//            MyDialog myDialog = new MyDialog("Không được để trống họ tên!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        if (gioitinh.equals("Chọn giới tính")) {
//            MyDialog myDialog = new MyDialog("Hãy chọn giới tính!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        if (sodienthoai.trim().equals("")) {
//            MyDialog myDialog = new MyDialog("Không được để trống số điện thoại!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        KhachHang kh = new KhachHang();
//        kh.setHoten(hoten);
//        kh.setGioitinh(gioitinh);
//        kh.setSodienthoai(sodienthoai);
//        kh.setGhichu(ghichu);
//        boolean flag = khachHangDAO.addKhachHang(kh);
//        if (flag) {
//            MyDialog myDialog = new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
//        } else {
//            MyDialog myDialog = new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
//        }
//        return flag;
//    }
//    
//    public boolean suaKhachHang(String makhachhang, String hoten, String gioitinh, String sodienthoai,String ghichu) {
//        if (hoten.trim().equals("")) {
//            MyDialog myDialog = new MyDialog("Không được để trống tên!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        if (makhachhang.trim().equals("")) {
//            MyDialog myDialog = new MyDialog("Không được để trống Mã!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        if (sodienthoai.trim().equals("")) {
//            MyDialog myDialog = new MyDialog("Không được để trống số điện thoại!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        if (gioitinh.equals("Chọn giới tính")) {
//            MyDialog myDialog = new MyDialog("Hãy chọn giới tính!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        
//        KhachHang kh = new KhachHang();
//        kh.setHoten(hoten);
//        kh.setGioitinh(gioitinh);
//        kh.setSodienthoai(sodienthoai);
//        kh.setGhichu(ghichu);
//        boolean flag = khachHangDAO.updateKhachHang(Integer.parseInt(makhachhang), kh);
//        if (flag) {
//            MyDialog myDialog = new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
//        } else {
//            MyDialog myDialog = new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
//        }
//        return flag;
//    }
//    
//     public boolean xoaKhachHang(String makhachhang) {
//        boolean flag = false;
//        try {
//            int maKH = Integer.parseInt(makhachhang);
//            MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
//            if(dlg.getAction() == MyDialog.CANCEL_OPTION)
//                return false;
//            flag = khachHangDAO.deleteKhachHang(maKH);
//        } catch (NumberFormatException e) {
//            MyDialog myDialog = new MyDialog("Chưa chọn khách hàng!", MyDialog.ERROR_DIALOG);
//        }
//        if (flag) {
//            MyDialog myDialog = new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
//        } else {
//            MyDialog myDialog = new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
//        }
//        return flag;
//    }
}
