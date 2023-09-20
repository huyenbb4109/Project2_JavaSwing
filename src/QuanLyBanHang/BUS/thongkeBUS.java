/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBanHang.BUS;

import java.util.ArrayList;
import QuanLyBanHang.DAO.thongkeDAO;
import QuanLyBanHang.DTO.thongke;
/**
 *
 * @author PC
 */
public class thongkeBUS {
    public thongkeDAO thongKeDAO = new thongkeDAO();
    private ArrayList<Double> doanhThuThang;

    public thongke thongKe(int nam) {
        return thongKeDAO.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeDAO.getDoanhThuThang(thang, nam);
    }
}
