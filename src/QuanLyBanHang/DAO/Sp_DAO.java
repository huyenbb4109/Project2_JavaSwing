
package QuanLyBanHang.DAO;

import QuanLyBanHang.DTO.SP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sp_DAO {
    private Connection con= null;
    private PreparedStatement stm= null;
    private ResultSet rs= null;
    
    //cho sanpham vao mot list.
    public ArrayList<SP> getListSp(){
        ArrayList<SP> listsp= null;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("select * from sanpham where trangthai= 1");
            rs= stm.executeQuery();
            listsp= new ArrayList<>();
             
            
            while(rs.next()){
                SP sp= new SP();
                sp.setMasp(rs.getInt("masanpham"));
                sp.setTensp(rs.getString("tensanpham"));
                sp.setIdnhomsp(rs.getInt("manhomsanpham"));
                sp.setSl(rs.getInt("soluong"));
                sp.setAnh(rs.getString("anh"));
                sp.setGiaban(rs.getFloat("giaban"));
                sp.setTrangthai(rs.getByte("trangthai"));

                listsp.add(sp);
            }
        } catch (SQLException se) {
            return null;
        }finally{
            Conn.closeAll(con,stm, rs);
        }
        
        return listsp;
    }
    
    //lay sanpham theo masanpham
    public SP getSpTheoMasp(int masp){
        
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("select * from sanpham where masanpham= ?");     
            stm.setInt(1, masp);
            rs= stm.executeQuery();
            
            SP sp= new SP();
            if(rs.next()){               
                sp.setMasp(rs.getInt("masanpham"));
                sp.setTensp(rs.getString("tensanpham"));
                sp.setIdnhomsp(rs.getInt("manhomsanpham"));
                sp.setSl(rs.getInt("soluong"));
                sp.setAnh(rs.getString("anh"));
                sp.setGiaban(rs.getFloat("giaban")); 
                sp.setTrangthai(rs.getByte("trangthai"));
                return sp;
            }            
        }catch (SQLException se) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        
        return null;
    }
    
    public int getNhomSpTheoMasp(int masp){
        try{
            con= Conn.Conn1();
            stm = con.prepareStatement("select manhomsanpham from sanpham where masanpham= ?");     
            stm.setInt(1, masp);
            rs= stm.executeQuery();
            
            if(rs.next()){               
                return rs.getInt("manhomsanpham");
            }  
        }catch(SQLException se){
            return 0;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return 0;
    }
    
    public int laysoluongsp(){
        
        try {
            con = Conn.Conn1();
            stm = con.prepareStatement("SELECT COUNT(*) AS sl FROM sanpham WHERE trangthai = 1");          
            rs = stm.executeQuery();
            
            if(rs.next()){               
                return rs.getInt("sl");
            }
        } catch (SQLException se) {
            return -1;
        }
        return 0;
    }
    
    public ArrayList<SP> getSpTheoNhomSp(int idnhomsp){
        ArrayList<SP> listsptheoloai= null;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("select * from sanpham where manhomsanpham= ?");     
            stm.setInt(1, idnhomsp);
            rs= stm.executeQuery();
            
            listsptheoloai= new ArrayList<>();
            SP sp= new SP();
            while(rs.next()){              
                sp.setMasp(rs.getInt("masanpham"));
                sp.setTensp(rs.getString("tensanpham"));
                sp.setIdnhomsp(rs.getInt("manhomsanpham"));
                sp.setSl(rs.getInt("soluong"));
                sp.setAnh(rs.getString("anh"));
                sp.setGiaban(rs.getFloat("giaban"));
                sp.setTrangthai(rs.getByte("trangthai"));
                
                listsptheoloai.add(sp);              
            } 
            
            
        }catch (SQLException se) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return listsptheoloai;
    }
    
     
    public void updateSlSp(int masp, int slban){
        SP sp= getSpTheoMasp(masp);
        int sl= sp.getSl();
        sp.setSl(sl+slban);
        
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE sanpham SET soluong= ? WHERE masanpham= ?");
            stm.setInt(1, sp.getSl());
            stm.setInt(2, masp);
            
            stm.executeUpdate();
            
        }catch (SQLException se) {
        }finally{
            Conn.closeAll(con, stm, rs);
        }
    }
    
   
    //lay ten anh theo masp de tim trong file
    public String getAnh(int masp){
        
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("select anh from sanpham where masanpham= ?");     
            stm.setInt(1, masp);
            rs= stm.executeQuery();
            
            if(rs.next()){               
                return rs.getString("anh");
            }            
        }catch (SQLException se) {
            return null;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        
        return null;
    }
    
    public boolean themSp(String tensp, int idnhomsp,
            int sl, String anh, float giaban){
        int kq= 0;
        try {
            con= Conn.Conn1();
            stm = con.prepareStatement("insert into sanpham(tensanpham, manhomsanpham, soluong, anh, giaban) value(?,?,?,?,?)");     
            stm.setString(1, tensp);
            stm.setInt(2, idnhomsp);
            stm.setInt(3, sl);
            stm.setString(4, anh);
            stm.setFloat(5, giaban);
            
            kq= stm.executeUpdate();
            
        }catch (SQLException se) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }
    
    public boolean xoasp(int masp, byte trangthai){
        int kq= 0;
        try {
           con= Conn.Conn1();
           stm= con.prepareStatement("UPDATE sanpham SET trangthai= ? WHERE masanpham= ?");
           stm.setByte(1, trangthai);
           stm.setInt(2, masp);
           
           kq= stm.executeUpdate();
            
        }catch (SQLException se) {
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }
    
    public boolean updatesp(int masp, String tensp, int idnhomsp,
            int sl, String anh, float giaban){
        int kq= 0;
        try{
            con= Conn.Conn1();
            stm = con.prepareStatement("UPDATE sanpham SET tensanpham= ?, manhomsanpham= ?, "
                    + "soluong= ?, anh= ?, giaban= ? WHERE masanpham= ?");
            
            stm.setString(1, tensp);
            stm.setInt(2, idnhomsp);
            stm.setInt(3, sl);
            stm.setString(4, anh);
            stm.setFloat(5, giaban);
            stm.setInt(6, masp);
            
            kq= stm.executeUpdate();
            
        }catch(SQLException se){
            return false;
        }finally{
            Conn.closeAll(con, stm, rs);
        }
        return kq>0?true:false;
    }
    
}
