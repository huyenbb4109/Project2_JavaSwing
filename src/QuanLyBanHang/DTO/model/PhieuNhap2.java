/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DTO.model;

/**
 *
 * @author huynn
 */
public class PhieuNhap2 {
    private int maphieunhap;
    private int manhacc;
    private int manv;
    private String ngaynhap;
    private String ghichu;
    private double thanhtien;

    public PhieuNhap2(int maphieunhap, int manhacc, int manv, String ngaynhap, String ghichu, double thanhtien) {
        this.maphieunhap = maphieunhap;
        this.manhacc = manhacc;
        this.manv = manv;
        this.ngaynhap = ngaynhap;
        this.ghichu = ghichu;
        this.thanhtien = thanhtien;
    }

    public PhieuNhap2() {
    }

    public int getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(int maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public int getManhacc() {
        return manhacc;
    }

    public void setManhacc(int manhacc) {
        this.manhacc = manhacc;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
     
}
