/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DTO;

import java.util.Date;

/**
 *
 * @author PC
 */
public class giamgia {
    private int magiam;
    private String tengiamgia;
    private int phantramgiam;
    private int dieukien;
    private Date ngaybatdau;
    private Date ngayketthuc;
    public giamgia(){
        
    }

    public giamgia(int magiam, String tengiamgia, int phantramgiam, int dieukien, Date ngaybatdau, Date ngayketthuc) {
        this.magiam = magiam;
        this.tengiamgia = tengiamgia;
        this.phantramgiam = phantramgiam;
        this.dieukien = dieukien;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public int getMagiam() {
        return magiam;
    }

    public void setMagiam(int magiam) {
        this.magiam = magiam;
    }

    public String getTengiamgia() {
        return tengiamgia;
    }

    public void setTengiamgia(String tengiamgia) {
        this.tengiamgia = tengiamgia;
    }

    public int getPhantramgiam() {
        return phantramgiam;
    }

    public void setPhantramgiam(int phantramgiam) {
        this.phantramgiam = phantramgiam;
    }

    public int getDieukien() {
        return dieukien;
    }

    public void setDieukien(int dieukien) {
        this.dieukien = dieukien;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
    
}
