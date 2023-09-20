/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import Main.MyDialog;
import QuanLyBanHang.DAO.Sp_DAO;
import QuanLyBanHang.DTO.SP;
import java.util.ArrayList;

/**
 *
 * @author huynn
 */
public class Sp_BUS {
    private Sp_DAO spDAO= new Sp_DAO();
    private ArrayList<SP> listSp= null;
    
    
    public void doclistsp(){
        listSp= spDAO.getListSp();
    }
    public ArrayList<SP> getDssp(){
        if(listSp== null){
            doclistsp();
        }
        return listSp;
    }
    
    //lay sp theo masp
    public SP getSanPhamTheoMasp(int ma) {
        for (SP sp : listSp) {
             if (sp.getMasp() == ma) {
                 return sp;
             }
         }
       
        return null;
    }
    
    //timkiem thoe ten
    public ArrayList<SP> timKiemSpTheoTen(String ten){
        ArrayList<SP> listten= new ArrayList<>();
        for (SP sp : listSp) {
            String tensp= sp.getTensp();
            if(tensp.toLowerCase().contains(ten.toLowerCase())){
                listten.add(sp);
            }
        }
        return listten;
    }
       
    
    
    public ArrayList<SP> getSpTheoNhomsp(String manhomsp){
        if(manhomsp.trim().equals("")){
            ArrayList<SP> listnhomsp= new ArrayList<>();
            try {
                int idnhomsp= Integer.parseInt(manhomsp);
                for (SP sp1 : listSp) {
                    if(sp1.getIdnhomsp()== idnhomsp){
                        listnhomsp.add(sp1);
                    }
                }
                return listnhomsp;
            } catch (Exception e) {
            }
        }
        return null;
    }
    
    //lay ten ten theo masp
    public String getAnh(int masp){
        return spDAO.getAnh(masp);
    }
    
    public int getNhomspTheoMasp(int masp){
        return spDAO.getNhomSpTheoMasp(masp);
    }
    //update số lượng sản phẩm khi mà đã bán đi
    public void updateSlSp(int masp, int slban){
        spDAO.updateSlSp(masp, slban);
    }
    
    public boolean themSp(String tensp, String idnhomsp, String sl1, String anh, String giaban){
        
        //kiểm tra nếu không nhập gì thì thông báo.          
        if(tensp.trim().equals("")){
            new MyDialog("Tên sản phẩm không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(idnhomsp.trim().equals("")){
            new MyDialog("Nhóm sản phẩm không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(sl1.trim().equals("")){
            new MyDialog("Số lượng không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(giaban.trim().equals("")){
            new MyDialog("Giá bán không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(anh.trim().equals("")){
           new MyDialog("Ảnh không được để trống!", MyDialog.ERROR_DIALOG);
            return false; 
        }

        // không cho phép nhập giá nhập giá bán không đúng định dạng chấm phẩy.
        char a= '.';
        int count= 0;
        //charAt: trả về một kí tự tại vị trí i.
        for (int i = 0; i < giaban.length(); i++) {
            if (giaban.charAt(i) == a) {
                count++;
            }
        }

        if(count>1){
            new MyDialog("Chỉ cho phép giá có một dấu '.'\n để nhận dạng số thập phân,\nví dụ 20,000.5623!", MyDialog.ERROR_DIALOG);
            return false;
        }
        //loai bo dau phay trong giaban.
        giaban = giaban.replace(",", "");

        //ép về kiểu giống trong db để add vào.
        
        try {
            int sl= Integer.parseInt(sl1);
            float giaban1= Float.parseFloat(giaban);
            int idnhomsp1= Integer.parseInt(idnhomsp);
            
            if(sl<0){
                new MyDialog("Số lượng không được âm!", MyDialog.ERROR_DIALOG);
                return false;
            }
            if(giaban1<0){
                new MyDialog("Giá bán không được âm!", MyDialog.ERROR_DIALOG);
                return false;
            }
           
            boolean them= spDAO.themSp(tensp, idnhomsp1, sl, anh, giaban1);
            if(them==true){
                new MyDialog("Thêm thành công", MyDialog.SUCCESS_DIALOG);
                return true;
            }else{
                new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
            
        } catch (Exception e) {
            new MyDialog("Nhập số hợp lệ cho số lượng và giá bán!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }
    
    public boolean suaSp(String masp, String tensp, 
            String idnhomsp, String sl, String anh, 
            String giaban){
        
        if(masp.trim().equals("")){
            new MyDialog("Chưa chọn sản phẩm để sửa!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(tensp.trim().equals("")){
            new MyDialog("Tên sản phẩm không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(idnhomsp.trim().equals("")){
            new MyDialog("Nhóm sản phẩm không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(sl.trim().equals("")){
            new MyDialog("Số lượng không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(giaban.trim().equals("")){
            new MyDialog("Giá bán không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if(anh.trim().equals("")){
           new MyDialog("Ảnh không được để trống!", MyDialog.ERROR_DIALOG);
            return false; 
        }
        // không cho phép nhập giá nhập giá bán không đúng định dạng chấm phẩy.
        char a= '.';
        int count= 0;
        //charAt: trả về một kí tự tại vị trí i.
        for (int i = 0; i < giaban.length(); i++) {
            if (giaban.charAt(i) == a) {
                count++;
            }
        }

        if(count>1){
            new MyDialog("Chỉ cho phép giá có một dấu '.'\n để nhận dạng số thập phân,\nví dụ 20000.56!", MyDialog.ERROR_DIALOG);
            return false;
        }

        giaban = giaban.replace(",", "");
        //ép về kiểu giống trong db để add vào.
        try {
            int masp1= Integer.parseInt(masp);
            int idnhomsp1= Integer.parseInt(idnhomsp);
            int sl1= Integer.parseInt(sl);
            float giaban1= Float.parseFloat(giaban);
            
            if(sl1<0){
                new MyDialog("Số lượng không được âm!", MyDialog.ERROR_DIALOG);
                return false;
            }
            if(giaban1<0){
                new MyDialog("Giá bán không được âm!", MyDialog.ERROR_DIALOG);
                return false;
            }
            
            boolean sua= spDAO.updatesp(masp1, tensp, idnhomsp1, sl1, anh, giaban1);
            if(sua==true){
                new MyDialog("Sửa thành công", MyDialog.SUCCESS_DIALOG);
                return true;
            }else{
                new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
                return false;
            }
            
        } catch (Exception e) {
            new MyDialog("Nhập số hợp lệ cho số lượng và giá bán!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
    }
    
    public boolean xoaSp(int masp, byte trangthai){
//        if(masp.trim().equals("")){
//            new MyDialog("Chưa chọn sản phẩm để xóa!", MyDialog.ERROR_DIALOG);
//            return false;
//        }
//        int msp= Integer.parseInt(masp);
        if(spDAO.xoasp(masp, trangthai)==true){
            new MyDialog("Xóa sản phẩm thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        }else{
            new MyDialog("Xóa sản phẩm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
    
    //lay ten sp theo masp de hien thi ten cung voi ma cho de nhin okla chua.
    public String getTensp(int masp){
        for (SP sp : listSp) {
            if(sp.getMasp()==masp){
                return sp.getTensp();
            }
        }
        return "";
    }
     
}
