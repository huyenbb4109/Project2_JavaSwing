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
public class CtPhieuNhap {
    private int maphieunhap;
    private int masp;
    private float gianhap;
    private int slnhap;

    public CtPhieuNhap() {
    }

    public CtPhieuNhap(int maphieunhap, int masp, float gianhap, int slnhap) {
        this.maphieunhap = maphieunhap;
        this.masp = masp;
        this.gianhap = gianhap;
        this.slnhap = slnhap;
    }

    public int getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(int maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }

    public int getSlnhap() {
        return slnhap;
    }

    public void setSlnhap(int slnhap) {
        this.slnhap = slnhap;
    }
    
    
}
