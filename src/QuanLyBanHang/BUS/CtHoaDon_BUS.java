/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import QuanLyBanHang.DAO.CtHoaDon_DAO;
import QuanLyBanHang.DTO.CtHoaDon;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class CtHoaDon_BUS {
    private ArrayList<CtHoaDon> listCTHoaDon;
    private CtHoaDon_DAO ctHDDAO = new CtHoaDon_DAO();
    private HoaDon_BUS hdBUS = new HoaDon_BUS();

    public CtHoaDon_BUS() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
    }

    public ArrayList<CtHoaDon> getListCTHoaDon() {
        return listCTHoaDon;
    }

    public ArrayList<CtHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
        int ma = Integer.parseInt(maHD);
        ArrayList<CtHoaDon> dsct = new ArrayList<>();

        for (CtHoaDon cthd : listCTHoaDon) {
            if (cthd.getMahoadon()== ma)
                dsct.add(cthd);
        }

        return dsct;
    }

    public void addCTHoaDon(int maSP, String giasp, int slmua) {
        int ma = hdBUS.getMaHoaDonMoiNhat();

        float giasp1 = Float.parseFloat(giasp.replace(",",""));

        ctHDDAO.addCTHoaDon(ma, maSP, giasp1, slmua);
    }
}
