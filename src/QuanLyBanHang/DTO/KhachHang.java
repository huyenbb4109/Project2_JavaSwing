/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang.DTO;

/**
 *
 * @author DELL
 */
public class KhachHang {
    private int makhachhang;
    private String hoten;
    private String gioitinh;
    private String sodienthoai;
    private String ghichu;

    public KhachHang(){
    }
    
    public KhachHang(int makhachhang, String hoten, String gioitinh, String sodienthoai, String ghichu) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.ghichu = ghichu;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    
}
