
package jpanel;

import Main.MyDialog;
import QuanLyBanHang.BUS.CtPhieuNhap_BUS;
import QuanLyBanHang.BUS.NhaCungCap_BUS;
import QuanLyBanHang.BUS.PhieuNhap_BUS;
import QuanLyBanHang.BUS.Sp_BUS;
import QuanLyBanHang.BUS.nhanvienBUS;
import QuanLyBanHang.DTO.SP;
import QuanLyBanHang.DTO.nhanvien;
import QuanLyBanHang.BUS.dangnhapBUS;
import QuanLyBanHang.DTO.CtPhieuNhap;
import QuanLyBanHang.DTO.PhieuNhap;
import QuanLyBanHang.DTO.model.CtPhieuNhap2;
import QuanLyBanHang.DTO.model.PhieuNhap2;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import jpanel.jDialogNhaCungCap.jDialogChonNhaCungCap;
import jpanel.xuatphieunhap.JpanelXuatPhieuNhap;

/**
 *
 * @author DELL
 */
public class jpanelNhapHang extends javax.swing.JPanel {

    
    public jpanelNhapHang() {
        initComponents();
        dtmKho =(DefaultTableModel) tableKhoHang.getModel();       
        hienthidulieutableKho();
        dtmPhieuNhap= (DefaultTableModel) tablePhieuNhap.getModel();
        hienthitablePhieuNhap();
        dtmCTPhieuNhap= (DefaultTableModel) tableCtPhieuNhap.getModel();
        dtmGioNhap= (DefaultTableModel) tableGioHang.getModel();
        hienthitableCtPhieuNhap();
        hienthicmbNhanvien();
       
        
//        hienthicmbNhanvien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel27 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel29 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextField23 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel31 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jTextField24 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resetKhoHang = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiemKhohang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKhoHang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGioHang = new javax.swing.JTable();
        pnThongTin = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        masptxt = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tensptxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        btnThemVaoGio = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNhaCungCap = new javax.swing.JTextField();
        btnChonNhaCungCap = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nhanviencbb = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        xoagiohang = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        ghichutxt = new javax.swing.JTextField();
        slNhapsnipper = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnCTPhieuNhap = new javax.swing.JPanel();
        pnPhieuNhap = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        resetPhieuNhap = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmaNV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtnhaCC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        txtghichu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        txtGiaThap = new javax.swing.JTextField();
        txtGiaCao = new javax.swing.JTextField();
        txtTuNgay = new javax.swing.JTextField();
        txtDenNgay = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePhieuNhap = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        txtMaphieunhap = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        txtSP2 = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        txtGiaNHap2 = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        txtThanhtien2 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        txtSoLuong2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCtPhieuNhap = new javax.swing.JTable();

        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setMinimumSize(new java.awt.Dimension(519, 525));
        jDialog1.setModal(true);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel21.setText("Chọn nhà cung cấp");
        jPanel27.add(jLabel21);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel22.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(2, 2, 2))
        );

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Số ĐT", "Trạng thái"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton12.setText("Chọn");

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton13.setText("Thêm");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton14.setText("Sửa ");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton17.setText("Xóa");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton12)
                .addGap(26, 26, 26)
                .addComponent(jButton13)
                .addGap(31, 31, 31)
                .addComponent(jButton14)
                .addGap(28, 28, 28)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDialog2.setMinimumSize(new java.awt.Dimension(400, 500));
        jDialog2.setModal(true);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel23.setText("Thêm nhà cung cấp");
        jPanel29.add(jLabel23);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Địa Chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trạng thái", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton15.setText("Thêm");

        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số ĐT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton20.setText("Hủy");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jTextField16)
                    .addComponent(jTextField17)
                    .addComponent(jTextField18)
                    .addComponent(jTextField23))
                .addContainerGap())
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton15)
                .addGap(53, 53, 53)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog3.setMinimumSize(new java.awt.Dimension(400, 500));
        jDialog3.setModal(true);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel24.setText("Sửa nhà cung cấp");
        jPanel31.add(jLabel24);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jTextField20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Địa Chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jTextField22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số ĐT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton16.setText("Lưu mới");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jTextField24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trạng thái", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton21.setText("Hủy");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jTextField20)
                    .addComponent(jTextField21)
                    .addComponent(jTextField22)
                    .addComponent(jTextField24))
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton16)
                .addGap(29, 29, 29)
                .addComponent(jButton21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setText("Kho Hàng");
        jPanel5.add(jLabel1);

        resetKhoHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        resetKhoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetKhoHangActionPerformed(evt);
            }
        });
        jPanel5.add(resetKhoHang);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tìm kiếm");
        jPanel15.add(jLabel12);

        txtTimKiemKhohang.setColumns(20);
        txtTimKiemKhohang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiemKhohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemKhohangActionPerformed(evt);
            }
        });
        txtTimKiemKhohang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKhohangKeyPressed(evt);
            }
        });
        jPanel15.add(txtTimKiemKhohang);

        jScrollPane1.setEnabled(false);

        tableKhoHang.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableKhoHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableKhoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Tồn Kho", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKhoHang.setRowHeight(30);
        tableKhoHang.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableKhoHang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableKhoHang.setShowHorizontalLines(true);
        tableKhoHang.setShowVerticalLines(true);
        tableKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKhoHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKhoHang);
        if (tableKhoHang.getColumnModel().getColumnCount() > 0) {
            tableKhoHang.getColumnModel().getColumn(0).setMaxWidth(70);
            tableKhoHang.getColumnModel().getColumn(1).setMaxWidth(400);
            tableKhoHang.getColumnModel().getColumn(2).setMaxWidth(100);
            tableKhoHang.getColumnModel().getColumn(3).setMaxWidth(160);
        }

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel2.setText("Hàng chờ nhập");
        jPanel6.add(jLabel2);

        tableGioHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL nhập", "Giá nhập", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGioHang.setRowHeight(30);
        tableGioHang.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableGioHang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableGioHang.setShowHorizontalLines(true);
        tableGioHang.setShowVerticalLines(true);
        tableGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableGioHang);
        if (tableGioHang.getColumnModel().getColumnCount() > 0) {
            tableGioHang.getColumnModel().getColumn(0).setMaxWidth(70);
            tableGioHang.getColumnModel().getColumn(1).setMinWidth(200);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnThongTin.setBackground(new java.awt.Color(255, 255, 255));
        pnThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mã SP");
        jLabel5.setPreferredSize(new java.awt.Dimension(56, 22));
        jPanel7.add(jLabel5);

        masptxt.setEditable(false);
        masptxt.setBackground(new java.awt.Color(229, 224, 224));
        masptxt.setColumns(15);
        masptxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        masptxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(masptxt);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Thông tin sản phẩm");
        jPanel8.add(jLabel3);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đơn giá nhập");
        jLabel4.setPreferredSize(new java.awt.Dimension(116, 22));

        txtDonGia.setColumns(10);
        txtDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDonGia))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tên SP");
        jPanel10.add(jLabel6);

        tensptxt.setEditable(false);
        tensptxt.setBackground(new java.awt.Color(229, 224, 224));
        tensptxt.setColumns(15);
        tensptxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tensptxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel10.add(tensptxt);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Thông tin phiếu nhập");
        jPanel4.add(jLabel7);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        btnThemVaoGio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemVaoGio.setText("Chọn nhập");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });
        jPanel11.add(btnThemVaoGio);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Nhà cung cấp");

        txtNhaCungCap.setEditable(false);
        txtNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        txtNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnChonNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChonNhaCungCap.setText("...");
        btnChonNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonNhaCungCapActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nhân viên");

        nhanviencbb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nhanviencbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nhanviencbb.setEnabled(false);
        nhanviencbb.setPreferredSize(new java.awt.Dimension(280, 28));
        nhanviencbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanviencbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhanviencbb, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanviencbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtNhaCungCap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChonNhaCungCap)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonNhaCungCap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        xoagiohang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xoagiohang.setText("Xóa");
        xoagiohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoagiohangActionPerformed(evt);
            }
        });

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Ghi chú");

        ghichutxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ghichutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghichutxtActionPerformed(evt);
            }
        });

        slNhapsnipper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số lượng nhập");

        javax.swing.GroupLayout pnThongTinLayout = new javax.swing.GroupLayout(pnThongTin);
        pnThongTin.setLayout(pnThongTinLayout);
        pnThongTinLayout.setHorizontalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slNhapsnipper, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnThongTinLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(xoagiohang)
                        .addGap(18, 18, 18)
                        .addComponent(btnXacNhan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addComponent(ghichutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(125, 125, 125)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))))
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnThongTinLayout.setVerticalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(slNhapsnipper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(3, 3, 3)))
                .addComponent(ghichutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoagiohang)
                    .addComponent(btnXacNhan))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nhập Hàng", jPanel1);

        pnCTPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));

        pnPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        pnPhieuNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnPhieuNhap.setPreferredSize(new java.awt.Dimension(350, 808));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Phiếu nhập");
        jPanel22.add(jLabel17);

        resetPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        resetPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPhieuNhapActionPerformed(evt);
            }
        });
        jPanel22.add(resetPhieuNhap);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin PN"));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Mã phiếu nhập");

        txtMaPN.setEditable(false);
        txtMaPN.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMaPN.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Nhân viên");

        txtmaNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtmaNV.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Ngày lập");

        txtNgayLap.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Nhà cung cấp");

        txtnhaCC.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtnhaCC.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Tổng tiền");

        txtTongtien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTongtien.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtghichu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtghichu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtghichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtghichuActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Ghi chú");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPN)
                    .addComponent(txtmaNV)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnhaCC, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtTongtien)
                    .addComponent(txtghichu)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtnhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(350, 91));

        txtGiaThap.setColumns(10);
        txtGiaThap.setBorder(javax.swing.BorderFactory.createTitledBorder("Giá từ"));
        txtGiaThap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaThapActionPerformed(evt);
            }
        });

        txtGiaCao.setColumns(10);
        txtGiaCao.setBorder(javax.swing.BorderFactory.createTitledBorder("tới"));
        txtGiaCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaCaoActionPerformed(evt);
            }
        });

        txtTuNgay.setColumns(10);
        txtTuNgay.setBorder(javax.swing.BorderFactory.createTitledBorder("Từ ngày"));
        txtTuNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuNgayActionPerformed(evt);
            }
        });

        txtDenNgay.setColumns(10);
        txtDenNgay.setBorder(javax.swing.BorderFactory.createTitledBorder("Đến ngày"));
        txtDenNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaThap, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtTuNgay))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDenNgay)
                    .addComponent(txtGiaCao)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaThap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tablePhieuNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tablePhieuNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablePhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã PN", "NV", "NhàCC", "Ngày lập", "Tổng tiền", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePhieuNhap.setGridColor(new java.awt.Color(0, 0, 0));
        tablePhieuNhap.setRowHeight(30);
        tablePhieuNhap.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tablePhieuNhap.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablePhieuNhap.setShowHorizontalLines(true);
        tablePhieuNhap.setShowVerticalLines(true);
        tablePhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePhieuNhap);
        if (tablePhieuNhap.getColumnModel().getColumnCount() > 0) {
            tablePhieuNhap.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout pnPhieuNhapLayout = new javax.swing.GroupLayout(pnPhieuNhap);
        pnPhieuNhap.setLayout(pnPhieuNhapLayout);
        pnPhieuNhapLayout.setHorizontalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPhieuNhapLayout.setVerticalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuNhapLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Chi tiết phiếu nhập");
        jPanel34.add(jLabel20);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        txtMaphieunhap.setEditable(false);
        txtMaphieunhap.setBackground(new java.awt.Color(255, 255, 255));
        txtMaphieunhap.setColumns(15);
        txtMaphieunhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaphieunhap.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMaphieunhap.setBorder(javax.swing.BorderFactory.createTitledBorder("Mã phiếu nhập"));
        jPanel35.add(txtMaphieunhap);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        txtSP2.setEditable(false);
        txtSP2.setBackground(new java.awt.Color(255, 255, 255));
        txtSP2.setColumns(15);
        txtSP2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSP2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSP2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));
        jPanel36.add(txtSP2);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        txtGiaNHap2.setEditable(false);
        txtGiaNHap2.setBackground(new java.awt.Color(255, 255, 255));
        txtGiaNHap2.setColumns(15);
        txtGiaNHap2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGiaNHap2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGiaNHap2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giá nhập"));
        jPanel37.add(txtGiaNHap2);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        txtThanhtien2.setEditable(false);
        txtThanhtien2.setBackground(new java.awt.Color(255, 255, 255));
        txtThanhtien2.setColumns(15);
        txtThanhtien2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtThanhtien2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtThanhtien2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thành tiền"));
        jPanel39.add(txtThanhtien2);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        txtSoLuong2.setEditable(false);
        txtSoLuong2.setBackground(new java.awt.Color(255, 255, 255));
        txtSoLuong2.setColumns(15);
        txtSoLuong2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSoLuong2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoLuong2.setBorder(javax.swing.BorderFactory.createTitledBorder("Số lượng nhập"));
        jPanel40.add(txtSoLuong2);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                    .addContainerGap(194, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(101, 101, 101)))
        );

        tableCtPhieuNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableCtPhieuNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableCtPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Mã SP", "Giá nhập", "Số lượng nhập", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCtPhieuNhap.setGridColor(new java.awt.Color(0, 0, 0));
        tableCtPhieuNhap.setRowHeight(30);
        tableCtPhieuNhap.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableCtPhieuNhap.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableCtPhieuNhap.setShowHorizontalLines(true);
        tableCtPhieuNhap.setShowVerticalLines(true);
        tableCtPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCtPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableCtPhieuNhap);
        if (tableCtPhieuNhap.getColumnModel().getColumnCount() > 0) {
            tableCtPhieuNhap.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(306, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnCTPhieuNhapLayout = new javax.swing.GroupLayout(pnCTPhieuNhap);
        pnCTPhieuNhap.setLayout(pnCTPhieuNhapLayout);
        pnCTPhieuNhapLayout.setHorizontalGroup(
            pnCTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTPhieuNhapLayout.createSequentialGroup()
                .addComponent(pnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCTPhieuNhapLayout.setVerticalGroup(
            pnCTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCTPhieuNhapLayout.createSequentialGroup()
                .addGroup(pnCTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnCTPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnCTPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xem lại phiếu nhập", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private Sp_BUS spBUS = new Sp_BUS();
    private nhanvienBUS nvBUS = new nhanvienBUS();
    private PhieuNhap_BUS phieuNhapBUS = new PhieuNhap_BUS();
    private CtPhieuNhap_BUS ctPhieuNhapBUS = new CtPhieuNhap_BUS();
    private NhaCungCap_BUS nhaccBUS= new NhaCungCap_BUS();
    
    private DefaultTableModel dtmKho, dtmGioNhap, dtmPhieuNhap, dtmCTPhieuNhap;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
    DecimalFormat dcf = new DecimalFormat("###,###.##");
    
   
    
    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioActionPerformed
        themvaogiohang();
    }//GEN-LAST:event_btnThemVaoGioActionPerformed
    
    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
           xacNhanPhieuNhap();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnChonNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonNhaCungCapActionPerformed
        xulychonNhacc();
    }//GEN-LAST:event_btnChonNhaCungCapActionPerformed

    private void resetPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPhieuNhapActionPerformed
       resetPhieuNhap();
    }//GEN-LAST:event_resetPhieuNhapActionPerformed

    private void txtGiaThapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaThapActionPerformed
       
    }//GEN-LAST:event_txtGiaThapActionPerformed

    private void txtGiaCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaCaoActionPerformed
        
    }//GEN-LAST:event_txtGiaCaoActionPerformed

    private void txtTuNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuNgayActionPerformed
       
    }//GEN-LAST:event_txtTuNgayActionPerformed

    private void txtDenNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenNgayActionPerformed
       
    }//GEN-LAST:event_txtDenNgayActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
//        jDialog2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
//        jDialog3.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void txtghichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtghichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtghichuActionPerformed

    private void ghichutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghichutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ghichutxtActionPerformed

    private void txtTimKiemKhohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemKhohangActionPerformed
//        timkiemTableKho(txtTimKiemKhohang.getText());
    }//GEN-LAST:event_txtTimKiemKhohangActionPerformed

    private void resetKhoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetKhoHangActionPerformed
        reset();
    }//GEN-LAST:event_resetKhoHangActionPerformed

    private void txtTimKiemKhohangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKhohangKeyPressed
        timkiemTableKho(txtTimKiemKhohang.getText());
    }//GEN-LAST:event_txtTimKiemKhohangKeyPressed

    private void xoagiohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoagiohangActionPerformed
        xoagiohang();
    }//GEN-LAST:event_xoagiohangActionPerformed

    private void tableKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKhoHangMouseClicked
        clickKhoHang();
    }//GEN-LAST:event_tableKhoHangMouseClicked

    private void nhanviencbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanviencbbActionPerformed
        
        
    }//GEN-LAST:event_nhanviencbbActionPerformed

    private void tableGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGioHangMouseClicked
        clickGioHang();
    }//GEN-LAST:event_tableGioHangMouseClicked

    private void tablePhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePhieuNhapMouseClicked
      clicktablePhieuNhap();
      hienthitableChiTietPhieuNhaptheoPN();
    }//GEN-LAST:event_tablePhieuNhapMouseClicked

    private void tableCtPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCtPhieuNhapMouseClicked
        clicktableCtPhieuNhap();
    }//GEN-LAST:event_tableCtPhieuNhapMouseClicked
    
    
    private void hienthidulieutableKho() {
        dtmKho.setRowCount(0);
        spBUS.doclistsp();
        
        ArrayList<SP> dssp = spBUS.getDssp();
        
        for (SP sp : dssp) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            vec.add(sp.getSl());
            vec.add(dcf.format(sp.getGiaban()));
            dtmKho.addRow(vec);
        }
    }
    
    private void reset(){
        spBUS.doclistsp();
        hienthidulieutableKho();
        masptxt.setText("");
        tensptxt.setText("");
        slNhapsnipper.setValue(0);
        txtDonGia.setText("");
        txtNhaCungCap.setText("");
        ghichutxt.setText("");
        dtmGioNhap.setRowCount(0);
    }
    
    private void resetPhieuNhap(){
        phieuNhapBUS.docDanhSach();
        hienthitablePhieuNhap();
        hienthitableCtPhieuNhap();
        txtMaphieunhap.setText("");
        txtmaNV.setText("");
        txtMaPN.setText("");
        txtmaNV.setText("");
        txtNgayLap.setText("");
        txtnhaCC.setText("");
        txtTongtien.setText("");
        txtghichu.setText("");
        txtSP2.setText("");
        txtSoLuong2.setText("");
        txtGiaNHap2.setText("");
        txtThanhtien2.setText("");
        txtGiaThap.setText("");
        txtGiaCao.setText("");
        txtTuNgay.setText("");
        txtDenNgay.setText("");
    }

    private void timkiemTableKho(String tuKhoa) {
        dtmKho.setRowCount(0);
        ArrayList<SP> dssp = spBUS.timKiemSpTheoTen(tuKhoa);
        for (SP sp : dssp) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            vec.add(sp.getSl());
            dtmKho.addRow(vec);
        }
    }
    
    private void xulychonNhacc(){
        jDialogChonNhaCungCap jdlchonnhacc= new jDialogChonNhaCungCap();
        jdlchonnhacc.setVisible(true);
        // hien thi kieu nhu the nay 1 - nha cng cap minh tung.
        if (jdlchonnhacc.getNhaCungCap()!= null) {
            txtNhaCungCap.setText(jdlchonnhacc.getNhaCungCap().getMancc()+ " - " + jdlchonnhacc.getNhaCungCap().getTencc());
        } else {
            txtNhaCungCap.setText("");
        }
    }
    
    private void hienthicmbNhanvien() {
        nhanviencbb.removeAllItems();
        nvBUS.docDanhSach();
        List<nhanvien> dsnv = nvBUS.getDanhSachNhanVien();
        if (dsnv != null) {
            for (nhanvien nv : dsnv) {
                nhanviencbb.addItem(nv.getManhanvien()+ " - " + nv.getHo() + " " + nv.getTen());
            }
        }

        for (int i = 0; i < nhanviencbb.getItemCount(); i++) {
            String[] cmbValue = nhanviencbb.getItemAt(i).split(" - ");
            if (cmbValue[0].equals(dangnhapBUS.taiKhoanLogin.getManhanvien()+ "")) {
                nhanviencbb.setSelectedIndex(i);
                break;
            }
        }
    }
    
    private void themvaogiohang(){
        int sl = 0;
        float donGia = 0;
        double thanhtien= 0;
        
        try {
            sl = Integer.parseInt(slNhapsnipper.getValue()+ "");
            donGia = Float.parseFloat(txtDonGia.getText().replace(",", ""));
        } catch (Exception e) {
            new MyDialog("Vui lòng chọn số lượng và đơn giá hợp lệ!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        if(sl<=0 || donGia<=0){
            new MyDialog("Đơn giá và số lượng không được nhỏ hơn hoặc bằng 0 !", MyDialog.ERROR_DIALOG);
            return;
        }

        int row = tableKhoHang.getSelectedRow();
        if (row > -1) {
            String maSP = tableKhoHang.getValueAt(row, 0) + "";
            String tenSP = tableKhoHang.getValueAt(row, 1) + "";
            
            float dongianhap= Float.parseFloat(txtDonGia.getText().replace(",", ""));
            
            thanhtien = sl * donGia;
            
            for (int i = 0; i < tableGioHang.getRowCount(); i++) {
                float dongiagiohang= Float.parseFloat(tableGioHang.getValueAt(i, 3).toString().replace(",", ""));
                if (maSP.equals(tableGioHang.getValueAt(i, 0)) && dongianhap==dongiagiohang) {
                    int slnhap = Integer.parseInt(tableGioHang.getValueAt(i, 2).toString());
                    double tt= Double.parseDouble(tableGioHang.getValueAt(i, 4).toString().replace(",", ""));
                    sl += slnhap;
                    thanhtien += tt;
                    tableGioHang.setValueAt(sl, i, 2);
                    tableGioHang.setValueAt(dcf.format(donGia), i, 3);
                    tableGioHang.setValueAt(dcf.format(thanhtien), i, 4);
                    return;
                }
        }
            
            
            Vector vec = new Vector();
            vec.add(maSP);
            vec.add(tenSP);
            vec.add(sl);
            vec.add(dcf.format(donGia));
            vec.add(dcf.format(thanhtien));
            dtmGioNhap.addRow(vec);
        } else {
            new MyDialog("Chưa chọn sản phẩm để nhập!", MyDialog.ERROR_DIALOG);
        }
    }
    
    private void xoagiohang(){
        int row = tableGioHang.getSelectedRow();

        if (row > -1) {
            dtmGioNhap.removeRow(row);
        } else {
            new MyDialog("Chịu, chưa chọn thì ai mà biết xóa cái gì :)", MyDialog.ERROR_DIALOG);
        }
    }
    
    private void clickKhoHang(){
        int row = tableKhoHang.getSelectedRow();
        if(row>-1){
            String maSP = tableKhoHang.getValueAt(row, 0) + "";
            String tenSP = tableKhoHang.getValueAt(row, 1) + "";
            masptxt.setText(maSP);
            tensptxt.setText(tenSP);
            txtDonGia.setText("1");
            slNhapsnipper.setValue(1);
        }
        
        tableGioHang.clearSelection();
    }
    
    private void clickGioHang(){
        tableKhoHang.clearSelection();
        int row = tableGioHang.getSelectedRow();
        if (row > -1) {
            masptxt.setText(tableGioHang.getValueAt(row, 0).toString());
            tensptxt.setText(tableGioHang.getValueAt(row, 1).toString());
            int sl= Integer.parseInt(tableGioHang.getValueAt(row, 2).toString());
            slNhapsnipper.setValue(sl);
            txtDonGia.setText(tableGioHang.getValueAt(row, 3).toString());
        }
    }
    
    private void xacNhanPhieuNhap(){
        int row = tableGioHang.getRowCount();
        
        double tongtien= 0;
        
        if (row < 1) {
            new MyDialog("Chưa có gì để nhập hết á!", MyDialog.ERROR_DIALOG);
            return;
        }else{

            String nhaCungCap = txtNhaCungCap.getText();
            String[] nhacc = nhaCungCap.split(" - ");
            String nhanVien = nhanviencbb.getSelectedItem().toString();

            if (nhaCungCap.equals("")) {
                new MyDialog("Hãy chọn nhà cung cấp!", MyDialog.ERROR_DIALOG);
                return;
            }

            ArrayList<Vector> dsGioHang = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                Vector vec = new Vector();
                vec.add(tableGioHang.getValueAt(i, 0));
                vec.add(tableGioHang.getValueAt(i, 1));
                vec.add(tableGioHang.getValueAt(i, 2));
                vec.add(tableGioHang.getValueAt(i, 3));
                vec.add(tableGioHang.getValueAt(i, 4));

                float thanhtien= Float.parseFloat(tableGioHang.getValueAt(i, 4).toString().replace(",", ""));
                tongtien= tongtien+ thanhtien;

                dsGioHang.add(vec);
            }

            JpanelXuatPhieuNhap xuatPhieuNhap = new JpanelXuatPhieuNhap(nhaCungCap, nhanVien, ghichutxt.getText(), tongtien, dsGioHang);
            xuatPhieuNhap.setVisible(true);
            if (xuatPhieuNhap.checkNhap) {
                dtmGioNhap.setRowCount(0);
                spBUS.doclistsp();
                hienthidulieutableKho();
            }
        }
    }
     private void hienthitableChiTietPhieuNhaptheoPN(){
        int row = tablePhieuNhap.getSelectedRow();
        if (row > -1) {
            
            dtmCTPhieuNhap.setRowCount(0);
            ArrayList<CtPhieuNhap> dsct = ctPhieuNhapBUS.getListPhieuNhap(tablePhieuNhap.getValueAt(row, 0).toString());

            if (dsct != null) {
                for (CtPhieuNhap ct : dsct) {
                    Vector vec = new Vector();
                    vec.add(ct.getMaphieunhap());
                    vec.add(ct.getMasp());
                    vec.add(dcf.format(ct.getGianhap()));
                    vec.add(ct.getSlnhap());

                     float gia= ct.getGianhap();
                     int sl= ct.getSlnhap();

                    float thanhtien= gia* sl;
                    vec.add(dcf.format(thanhtien));

                    dtmCTPhieuNhap.addRow(vec);
                }
            }
        }
    }
    
    private void hienthitablePhieuNhap(){
        phieuNhapBUS.docDanhSach();
        ArrayList<PhieuNhap> dspn = phieuNhapBUS.getListPhieuNhap();
        ArrayList<CtPhieuNhap> dsct = ctPhieuNhapBUS.getListCtPhieuNhap();
        
        if (dspn != null) {
            dtmPhieuNhap.setRowCount(0);
            for (PhieuNhap pn : dspn) {
                String tennhanvien=nvBUS.getTenNhanVien(pn.getManv());
                String tennhacc=nhaccBUS.getTenNhacc(pn.getManhacc());
                
                Vector vec = new Vector();
                vec.add(pn.getMaphieunhap());
                vec.add(tennhanvien);
                vec.add(tennhacc);
                vec.add(pn.getNgaynhap());
                
                double tong= 0;
                for(CtPhieuNhap ct: dsct){
                    float gia= ct.getGianhap();
                    int sl= ct.getSlnhap();

                    float thanhtien= gia* sl;
                    if(pn.getMaphieunhap()==ct.getMaphieunhap()){
                        tong+= thanhtien;
                    }
                }
                
                vec.add(dcf.format(tong));
                vec.add(pn.getGhichu());
                
                dtmPhieuNhap.addRow(vec);
            }
        }
    }
    
    private void hienthitableCtPhieuNhap(){
        dtmCTPhieuNhap.setRowCount(0);
        ArrayList<CtPhieuNhap> dsct = ctPhieuNhapBUS.getListCtPhieuNhap();
        if (dsct != null) {
            for (CtPhieuNhap ct : dsct) {

                Vector vec = new Vector();
                vec.add(ct.getMaphieunhap());
                vec.add(ct.getMasp());
                vec.add(ct.getSlnhap());
                vec.add(dcf.format(ct.getGianhap()));

                float gia= ct.getGianhap();
                int sl= ct.getSlnhap();

                float thanhtien= gia* sl;
                vec.add(dcf.format(thanhtien));
                
                dtmCTPhieuNhap.addRow(vec);
                }
        }
    }
    
    private void clicktablePhieuNhap(){
        int row = tablePhieuNhap.getSelectedRow();
         if (row > -1) {
            txtMaPN.setText(tablePhieuNhap.getValueAt(row, 0) + "");
            txtmaNV.setText(tablePhieuNhap.getValueAt(row, 1) + "");
            txtnhaCC.setText(tablePhieuNhap.getValueAt(row, 2) + "");
            txtNgayLap.setText(tablePhieuNhap.getValueAt(row, 3) + "");
            txtTongtien.setText(tablePhieuNhap.getValueAt(row, 4)+ "");
            txtghichu.setText(tablePhieuNhap.getValueAt(row, 5)+ "");
        }
    }
    private void clicktableCtPhieuNhap(){
        int row = tableCtPhieuNhap.getSelectedRow();
         if (row > -1) {
            txtMaphieunhap.setText(tableCtPhieuNhap.getValueAt(row, 0) + "");
            txtSP2.setText(tableCtPhieuNhap.getValueAt(row, 1) + "");
            txtGiaNHap2.setText(tableCtPhieuNhap.getValueAt(row, 2) + "");
            txtSoLuong2.setText(tableCtPhieuNhap.getValueAt(row, 3) + "");
            txtThanhtien2.setText(tableCtPhieuNhap.getValueAt(row, 4)+ "");
           
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonNhaCungCap;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JTextField ghichutxt;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField masptxt;
    private javax.swing.JComboBox<String> nhanviencbb;
    private javax.swing.JPanel pnCTPhieuNhap;
    private javax.swing.JPanel pnPhieuNhap;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JButton resetKhoHang;
    private javax.swing.JButton resetPhieuNhap;
    private javax.swing.JSpinner slNhapsnipper;
    private javax.swing.JTable tableCtPhieuNhap;
    private javax.swing.JTable tableGioHang;
    private javax.swing.JTable tableKhoHang;
    private javax.swing.JTable tablePhieuNhap;
    private javax.swing.JTextField tensptxt;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaCao;
    private javax.swing.JTextField txtGiaNHap2;
    private javax.swing.JTextField txtGiaThap;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtMaphieunhap;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtSP2;
    private javax.swing.JTextField txtSoLuong2;
    private javax.swing.JTextField txtThanhtien2;
    private javax.swing.JTextField txtTimKiemKhohang;
    private javax.swing.JTextField txtTongtien;
    private javax.swing.JTextField txtTuNgay;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtmaNV;
    private javax.swing.JTextField txtnhaCC;
    private javax.swing.JButton xoagiohang;
    // End of variables declaration//GEN-END:variables
}
