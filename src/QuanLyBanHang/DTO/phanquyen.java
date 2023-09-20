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
public class phanquyen {
    private String quyen;
    private int quanlysanpham;  
    private int quanlynhanvien;
    private int quanlybanhang;
    private int quanlykhachhang;
    private int quanlythongke;
    private int quanlykhuyenmai;
    private int quanlynhaphang;
    
    public phanquyen(){
        
    }

    public phanquyen(String quyen, int quanlysanpham, int quanlynhanvien, int quanlybanhang, int quanlykhachhang, int quanlythongke, int quanlykhuyenmai, int quanlynhaphang) {
        this.quyen = quyen;
        this.quanlysanpham = quanlysanpham;
        this.quanlynhanvien = quanlynhanvien;
        this.quanlybanhang = quanlybanhang;
        this.quanlykhachhang = quanlykhachhang;
        this.quanlythongke = quanlythongke;
        this.quanlykhuyenmai = quanlykhuyenmai;
        this.quanlynhaphang = quanlynhaphang;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public int getQuanlysanpham() {
        return quanlysanpham;
    }

    public void setQuanlysanpham(int quanlysanpham) {
        this.quanlysanpham = quanlysanpham;
    }

    public int getQuanlynhanvien() {
        return quanlynhanvien;
    }

    public void setQuanlynhanvien(int quanlynhanvien) {
        this.quanlynhanvien = quanlynhanvien;
    }

    public int getQuanlybanhang() {
        return quanlybanhang;
    }

    public void setQuanlybanhang(int quanlybanhang) {
        this.quanlybanhang = quanlybanhang;
    }

    public int getQuanlykhachhang() {
        return quanlykhachhang;
    }

    public void setQuanlykhachhang(int quanlykhachhang) {
        this.quanlykhachhang = quanlykhachhang;
    }

    public int getQuanlythongke() {
        return quanlythongke;
    }

    public void setQuanlythongke(int quanlythongke) {
        this.quanlythongke = quanlythongke;
    }

    public int getQuanlykhuyenmai() {
        return quanlykhuyenmai;
    }

    public void setQuanlykhuyenmai(int quanlykhuyenmai) {
        this.quanlykhuyenmai = quanlykhuyenmai;
    }

    public int getQuanlynhaphang() {
        return quanlynhaphang;
    }

    public void setQuanlynhaphang(int quanlynhaphang) {
        this.quanlynhaphang = quanlynhaphang;
    }
    
   
   
    
}
