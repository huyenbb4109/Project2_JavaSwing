/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import QuanLyBanHang.DAO.CtPhieuNhap_DAO;
import QuanLyBanHang.DTO.CtPhieuNhap;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class CtPhieuNhap_BUS {
    private CtPhieuNhap_DAO ctpnDAO = new CtPhieuNhap_DAO();
    private ArrayList<CtPhieuNhap> listPhieuNhap = null;
    private PhieuNhap_BUS pnBUS= new PhieuNhap_BUS();
    
    

    public CtPhieuNhap_BUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listPhieuNhap = ctpnDAO.getListCTPhieuNhap();
    }

    public ArrayList<CtPhieuNhap> getListCtPhieuNhap() {
        if (listPhieuNhap == null) {
            docDanhSach();
        }
        return listPhieuNhap;
    }
    
    public ArrayList<CtPhieuNhap> getListPhieuNhap(String maPN) {
        ArrayList<CtPhieuNhap> dsct = new ArrayList<>();
        int ma = Integer.parseInt(maPN);
        
        for(CtPhieuNhap ct: listPhieuNhap) {
            if(ct.getMaphieunhap()== ma) {
                dsct.add(ct);
            }
        }
        
        return dsct;
    }
//     public boolean luuCTPhieuNhap(CtPhieuNhap ctpn) {
//        return ctpnDAO.addCTPhieuNhap(ctpn);
//    }
    public boolean themCTPhieuNhap( String masanpham, String gianhap, String soluongnhaphang) {
        int mapn= pnBUS.getMaPnCuoiCung();
        int masp= Integer.parseInt(masanpham);
        float gianhap1= Float.parseFloat(gianhap.replace(",", ""));
        int sl= Integer.parseInt(soluongnhaphang);
        return ctpnDAO.addCTPhieuNhap(mapn, masp, gianhap1, sl);
    }
}
