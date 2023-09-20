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
public class SP {
    private int masp;
    private String tensp;
    private int idnhomsp;
    private int sl;
    private String anh;
    private float giaban;
    private byte trangthai;

    public SP() {
    }

    public SP(int masp, String tensp, int idnhomsp, int sl, String anh, float giaban, byte trangthai) {
        this.masp = masp;
        this.tensp = tensp;
        this.idnhomsp = idnhomsp;
        this.sl = sl;
        this.anh = anh;
        this.giaban = giaban;
        this.trangthai = trangthai;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getIdnhomsp() {
        return idnhomsp;
    }

    public void setIdnhomsp(int idnhomsp) {
        this.idnhomsp = idnhomsp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public byte getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(byte trangthai) {
        this.trangthai = trangthai;
    }

    
   
    
}
