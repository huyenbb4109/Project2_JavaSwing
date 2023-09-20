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
public class NhomSP {
    private int idnhomsp;
    private String tennhomsp;
    private byte trangthai;

    public NhomSP() {
    }

    public NhomSP(int idnhomsp, String tennhomsp, byte trangthai) {
        this.idnhomsp = idnhomsp;
        this.tennhomsp = tennhomsp;
        this.trangthai = trangthai;
    }

    public int getIdnhomsp() {
        return idnhomsp;
    }

    public void setIdnhomsp(int idnhomsp) {
        this.idnhomsp = idnhomsp;
    }

    public String getTennhomsp() {
        return tennhomsp;
    }

    public void setTennhomsp(String tennhomsp) {
        this.tennhomsp = tennhomsp;
    }

    public byte getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(byte trangthai) {
        this.trangthai = trangthai;
    }
    
    

   
    
}
