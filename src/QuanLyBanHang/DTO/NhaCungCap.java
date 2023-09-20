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
public class NhaCungCap {
    private int mancc;
    private String tencc;
    private String diachi;
    private String sdt;
    private byte trangthai;

    public NhaCungCap() {
    }

    public NhaCungCap(int mancc, String tencc, String diachi, String sdt, byte trangthai) {
        this.mancc = mancc;
        this.tencc = tencc;
        this.diachi = diachi;
        this.sdt = sdt;
        this.trangthai = trangthai;
    }

    public int getMancc() {
        return mancc;
    }

    public void setMancc(int mancc) {
        this.mancc = mancc;
    }

    public String getTencc() {
        return tencc;
    }

    public void setTencc(String tencc) {
        this.tencc = tencc;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public byte getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(byte trangthai) {
        this.trangthai = trangthai;
    }
    
    
    
}
