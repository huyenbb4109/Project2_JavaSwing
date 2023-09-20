/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import Main.MyDialog;
import QuanLyBanHang.DAO.NhomSp_DAO;
import QuanLyBanHang.DTO.NhomSP;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class Nhomsp_BUS {
    private NhomSp_DAO nhomspDAO= new NhomSp_DAO();
    private ArrayList<NhomSP> listNhomsp= null;
    
    public Nhomsp_BUS(){
        doclistNhomsp();
    }
    
    public void doclistNhomsp(){
        listNhomsp= nhomspDAO.getlistNhomsp();
    }
    //lay danh sach nhom sanpham
    public ArrayList<NhomSP> getDsNhomsp(){
        if(listNhomsp== null){
            doclistNhomsp();
        }
        return listNhomsp;
    }
    
    //.
    public String getTenNhomsp(int manhomsp){
        for (NhomSP nhomSP : listNhomsp) {
            if(manhomsp==nhomSP.getIdnhomsp()){
                return nhomSP.getTennhomsp();
            }
        }
        return "";
    }
    
    public boolean themNhomsp(String tennhomsp){       
        if(tennhomsp.trim().equals("")){
            new MyDialog("Không được để trống tên nhóm sản phẩm!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(tennhomsp.length()>20){
            new MyDialog("Tên nhóm sản phẩm chỉ được tối đa 20 kí tự!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(nhomspDAO.themNhomsp(tennhomsp)==true){
            new MyDialog("Thêm thành công", MyDialog.SUCCESS_DIALOG);
            return true;
        }else{
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
    
    public boolean suaNhomsp(String manhomsp, String tennhomsp){
        if(tennhomsp.trim().equals("")){
            new MyDialog("Không được để trống tên nhóm sản phẩm!", MyDialog.ERROR_DIALOG);
            return false;
        }
        int ma= Integer.parseInt(manhomsp);
        if(nhomspDAO.suaNhomsp(ma, tennhomsp)==true){
            new MyDialog("Sửa thành công", MyDialog.SUCCESS_DIALOG);
            return true;
        }else{
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
    
    public boolean xoaNhomsp(int idnhomsp, byte trangthai){
        if(nhomspDAO.xoaNhomsp(idnhomsp, trangthai)){
            new MyDialog("Xóa thành công", MyDialog.SUCCESS_DIALOG);
            return true;
        }else{
            new MyDialog("Xóa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
    
    public ArrayList<NhomSP> timKiemNhomsp(String tukhoa) {
        tukhoa = tukhoa.toLowerCase();
        ArrayList<NhomSP> dsNhomsp = new ArrayList<>();
        for (NhomSP nsp : listNhomsp) {
            String ten = nsp.getTennhomsp().toLowerCase();
            if (ten.contains(tukhoa)) {
                dsNhomsp.add(nsp);
            }
        }
        return dsNhomsp;
    }
    
}
