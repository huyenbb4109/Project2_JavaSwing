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
public class HoaDon {
    private int mahoadon;
    private int makhachhang;
    private int manhanvien;
    private int magiam;
    private String ngaylap;
    private String ghichu;

    public HoaDon(int mahoadon, int makhachhang, int manhanvien, int magiam, String ngaylap, String ghichu) {
        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.manhanvien = manhanvien;
        this.magiam = magiam;
        this.ngaylap = ngaylap;
        this.ghichu = ghichu;
    }

    public HoaDon() {
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public int getMagiam() {
        return magiam;
    }

    public void setMagiam(int magiam) {
        this.magiam = magiam;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    
}
