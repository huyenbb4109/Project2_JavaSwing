
package QuanLyBanHang.BUS;

import Main.MyDialog;
import QuanLyBanHang.DAO.HoaDon_DAO;
import QuanLyBanHang.DTO.HoaDon;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HoaDon_BUS {
    private ArrayList<HoaDon> listHoaDon= null;
    private HoaDon_DAO hoaDonDAO = new HoaDon_DAO();
    
    public HoaDon_BUS() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listHoaDon = hoaDonDAO.getListHoaDon();
    }

    public ArrayList<HoaDon> getListHoaDon() {
        listHoaDon = hoaDonDAO.getListHoaDon();
        return listHoaDon;
    }

    public void luuHoaDon(int maKH, String nhanVien, int magiam, String ngaylap, String ghiChu) {
        String[] arrNV = nhanVien.split(" - ");
        int maNV = Integer.parseInt(arrNV[0]);
        
        hoaDonDAO.addHoaDon(maKH, maNV, magiam, ngaylap, ghiChu);
    }

    public int getMaHoaDonMoiNhat() {
        return hoaDonDAO.getMaHoaDonMoiNhat();
    }

    public HoaDon getHoaDon(String maHD) {
        int ma = Integer.parseInt(maHD);
        for (HoaDon hd : listHoaDon) {
            if (hd.getMahoadon()== ma)
                return hd;
        }
        return null;
    }

    public ArrayList<HoaDon> getListHoaDonTheoNgay(String min, String max) {
            ArrayList<HoaDon> dshd = hoaDonDAO.timkiemHoaDonTheoNgay(min, max);
            return dshd;
       
    }
}
