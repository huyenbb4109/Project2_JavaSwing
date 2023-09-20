/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DTO;

/**
 *
 * @author PC
 */
public class taikhoan {
    private int manhanvien;
    private String tendangnhap;
    private String matkhau;
    private String quyen;
    public taikhoan(){
    
    }

    public taikhoan(int manhanvien, String tendangnhap, String matkhau, String quyen) {
        this.manhanvien = manhanvien;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.quyen = quyen;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
    
    
}
