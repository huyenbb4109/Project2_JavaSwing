/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.DTO;

   
public class nhanvien {
    private int manhanvien;
    private String ho;
    private String ten;
    private String gioitinh;
    private String sodienthoai;
    private String diachi;
    private String chucvu;
    private byte trangthai;
    public static void main(String[] args) {
        System.out.println("chịu");
    }
    public nhanvien(){
        
    }

    public nhanvien(int manhanvien, String ho, String ten, String gioitinh, String sodienthoai, String diachi, String chucvu, byte trangthai) {
        this.manhanvien = manhanvien;
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
        this.chucvu = chucvu;
        this.trangthai = trangthai;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public byte getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(byte trangthai) {
        this.trangthai = trangthai;
    }

    
    
}
