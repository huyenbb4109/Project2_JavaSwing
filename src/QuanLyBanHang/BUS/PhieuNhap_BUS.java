/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import Main.MyDialog;
import QuanLyBanHang.DAO.PhieuNhap_DAO;
import QuanLyBanHang.DTO.PhieuNhap;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author huynn
 */
public class PhieuNhap_BUS {
    private PhieuNhap_DAO pnDAO = new PhieuNhap_DAO();
    private ArrayList<PhieuNhap> listPhieuNhap = null;

    public PhieuNhap_BUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listPhieuNhap = pnDAO.getListPhieuNhap();
    }

    public ArrayList<PhieuNhap> getListPhieuNhap() {
        if (listPhieuNhap == null) {
            docDanhSach();
        }
        return listPhieuNhap;
    }

    public boolean themPhieuNhap(String idnhaCungCap, String idnhanVien, String ngay, String ghichu) {
        String[] NCC = idnhaCungCap.split(" - ");
        String[] NV = idnhanVien.split(" - ");

        int maNCC = Integer.parseInt(NCC[0]);
        int maNV = Integer.parseInt(NV[0]);
        
//        try{
        
//        Date ngay = sdf.parse(ngaynhap);
//        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        ngay= dtf.format(now);
        
//        LocalDate localDate = LocalDate.now(); lay nam hien tai
//        int year = localDate.getYear();

//        }catch(Exception ex){
//            new MyDialog("Mời nhập ngày thoe định dạng dd/MM/yyyy!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
        return pnDAO.themPhieuNhap(maNCC, maNV, ngay, ghichu);
    }

    public int getMaPnCuoiCung() {
        return pnDAO.getMaPhieuNhapCuoiCung();
    }

//    public PhieuNhap timPhieuNhap(String maPN) {
//        int ma = Integer.parseInt(maPN);
//        for (PhieuNhap pn : listPhieuNhap) {
//            if (pn.getMaPN() == ma) {
//                return pn;
//            }
//        }
//        return null;
//    }

    public float getThanhTien(float tt){
        return tt;
    }
//    public ArrayList<PhieuNhap> getListPhieuNhapTheoGia(String giaThap, String giaCao) {
//        try {
//            int min = Integer.parseInt(giaThap);
//            int max = Integer.parseInt(giaCao);
//            if (max < min) {
//                new MyDialog("Hãy nhập khoảng giá phù hợp!", MyDialog.ERROR_DIALOG);
//                return null;
//            }
//            ArrayList<PhieuNhap> result = new ArrayList<>();
//            for (PhieuNhap pn : listPhieuNhap) {
//                if (pn.getTongTien() <= max && pn.getTongTien() >= min) {
//                    result.add(pn);
//                }
//            }
//            return result;
//        } catch (Exception e) {
//            new MyDialog("Hãy nhập số nguyên cho khoảng giá!", MyDialog.ERROR_DIALOG);
//        }
//        return null;
//    }

//    public ArrayList<PhieuNhap> getListPhieuNhapTheoNgay(String tuNgay, String denNgay) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            
//            Date min = sdf.parse(tuNgay);
//            Date max = sdf.parse(denNgay);
//            if (max.before(min)) {
//                new MyDialog("Hãy nhập khoảng ngày phù hợp!", MyDialog.ERROR_DIALOG);
//                return null;
//            }
//            ArrayList<PhieuNhap> result = new ArrayList<>();
//            for (PhieuNhap pn : listPhieuNhap) {
//                if (pn.getNgaynhap().after(min) && pn.getNgaynhap().before(max)) {
//                    result.add(pn);
//                }
//            }
//            return result;
//        } catch (Exception e) {
//            new MyDialog("Hãy nhập ngày hợp lệ (dd/MM/yyy)!", MyDialog.ERROR_DIALOG);
//        }
//        return null;
//    }
}
