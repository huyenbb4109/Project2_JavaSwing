/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DTO;

/**
 *
 * @author huynn
 */
public class CtHoaDon {
    private int mahoadon;
    private int masanpham;
    private float giasanpham;
    private int soluongmua;

    public CtHoaDon(int mahoadon, int masanpham, float giasanpham, int soluongmua) {
        this.mahoadon = mahoadon;
        this.masanpham = masanpham;
        this.giasanpham = giasanpham;
        this.soluongmua = soluongmua;
    }

    public CtHoaDon() {
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    public float getGiasanpham() {
        return giasanpham;
    }

    public void setGiasanpham(float giasanpham) {
        this.giasanpham = giasanpham;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }
    
    
}
