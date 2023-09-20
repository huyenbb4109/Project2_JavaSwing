/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package jpanel;

import jpanel.jDialogXuatHoaDon.jdialogChiTietHoaDon1;
import Main.MyDialog;
import QuanLyBanHang.BUS.CtHoaDon_BUS;
import QuanLyBanHang.BUS.HoaDon_BUS;
import QuanLyBanHang.BUS.Nhomsp_BUS;
import QuanLyBanHang.BUS.Sp_BUS;
import QuanLyBanHang.BUS.dangnhapBUS;
import QuanLyBanHang.BUS.giamgiaBUS;
import QuanLyBanHang.BUS.nhanvienBUS;
import QuanLyBanHang.DTO.CtHoaDon;
import QuanLyBanHang.DTO.HoaDon;
import QuanLyBanHang.DTO.SP;
import QuanLyBanHang.DTO.nhanvien;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;

public class jpanelBanHang extends javax.swing.JPanel {

    private double tienban;

    public double getTienban() {
        return tienban;
    }

    public void setTienban(double tienban) {
        this.tienban = tienban;
    }
    
    
    public jpanelBanHang() {
        initComponents();
        dtmSanPhamBan =(DefaultTableModel) tableSp.getModel();
        hienthitableSp();
        
        dtmHoaDon =(DefaultTableModel) tableHoaDon.getModel();
        hienthitableHoaDon();
        dtmCTHoaDon =(DefaultTableModel) tableChiTietHoaDon.getModel();
         dtmGioHang = (DefaultTableModel) tableGioHang.getModel();
        hienthitableChiTietHoaDon();
        
        hienthicmbNhanvien();
        
    }

    private Sp_BUS spBUS = new Sp_BUS();
    private nhanvienBUS nvBUS = new nhanvienBUS();
    private Nhomsp_BUS nhomspBUS = new Nhomsp_BUS();
    private HoaDon_BUS hoaDonBUS = new HoaDon_BUS();
    private CtHoaDon_BUS ctHoaDonBUS= new CtHoaDon_BUS();
    private giamgiaBUS ggBUS =new giamgiaBUS();
    
    DefaultTableModel dtmCTHoaDon, dtmHoaDon;
    DefaultTableModel dtmSanPhamBan, dtmGioHang;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    DecimalFormat dcf = new DecimalFormat("###,###.##");
    
    File fileAnhSP;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel31 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        tabBanHang2 = new javax.swing.JTabbedPane();
        pnBanHang2 = new javax.swing.JPanel();
        pnTable2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSp = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        timkiemSptxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGioHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnChiTietSanPham = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        maSptxt = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tenSptxt = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        donGiatxt = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        soluongsnipper = new javax.swing.JSpinner();
        themvaogiobutton = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        nhanviencbb = new javax.swing.JComboBox<>();
        anhicon = new javax.swing.JLabel();
        xoabutton = new javax.swing.JButton();
        xuathoadonbutton = new javax.swing.JButton();
        pnHoaDon = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtmaHD = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtmaKH = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtmaNV = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtmagiam = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtngaylap = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txtghichu = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        txtGiaThap = new javax.swing.JTextField();
        txtGiaCao = new javax.swing.JTextField();
        txtTuNgay = new javax.swing.JTextField();
        txtDenNgay = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtmaHD1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtmaSp1 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtgiaSp1 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtSoluong1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableChiTietHoaDon = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtThanhtien1 = new javax.swing.JTextField();

        jDialog1.setMinimumSize(new java.awt.Dimension(600, 680));
        jDialog1.setModal(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Chi tiết hóa đơn");
        jPanel1.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Khách hàng");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("Tổng tiền");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel31.setText("Mã giảm");

        jButton6.setText("...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11)
                    .addComponent(jTextField19)
                    .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jEditorPane1);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton7.setText("Thanh toán");

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton8.setText("In hóa đơn");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton7)
                .addGap(42, 42, 42)
                .addComponent(jButton8)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jDialog2.setMinimumSize(new java.awt.Dimension(452, 523));
        jDialog2.setModal(true);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel32.setText("Từ khóa tìm ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Họ Tên", "Giới tính", "Số ĐT", "Tổng Chi"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton9.setText("Chọn");

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton10.setText("Thêm khách");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
            .addComponent(jSeparator1)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton9)
                .addGap(40, 40, 40)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDialog3.setMinimumSize(new java.awt.Dimension(752, 388));
        jDialog3.setModal(true);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel33.setText("Từ khóa tìm");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTable4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Chương trình", "%KM", "Điều kiện", "Ngày BĐ", "Ngày KT", "Tình trạng"
            }
        ));
        jScrollPane7.setViewportView(jTable4);

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton11.setText("Chọn");

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton12.setText("Hủy");

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton11)
                .addGap(126, 126, 126)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDialog4.setMinimumSize(new java.awt.Dimension(449, 268));
        jDialog4.setModal(true);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel34.setText("Mã KH");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel35.setText("Họ tên");

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel36.setText("Giới tính");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel37.setText("Số ĐT");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton13.setText("Thêm Khách");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton14.setText("Hủy");

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton13)
                .addGap(44, 44, 44)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog4Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));

        tabBanHang2.setBackground(new java.awt.Color(255, 255, 255));

        pnBanHang2.setBackground(new java.awt.Color(255, 255, 255));

        pnTable2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Danh Sách Sản Phẩm");
        jPanel3.add(jLabel4);

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset);

        tableSp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableSp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableSp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ma SP", "Ten SP", "Còn Lại", "Đơn Giá", "Loại sp", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSp.setGridColor(new java.awt.Color(0, 0, 0));
        tableSp.setRowHeight(30);
        tableSp.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableSp.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableSp.setShowHorizontalLines(true);
        tableSp.setShowVerticalLines(true);
        tableSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSp);
        if (tableSp.getColumnModel().getColumnCount() > 0) {
            tableSp.getColumnModel().getColumn(0).setMinWidth(30);
            tableSp.getColumnModel().getColumn(0).setMaxWidth(50);
            tableSp.getColumnModel().getColumn(1).setMinWidth(300);
            tableSp.getColumnModel().getColumn(2).setMaxWidth(75);
            tableSp.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel22.setText("Tìm Kiếm");
        jPanel21.add(jLabel22);

        timkiemSptxt.setColumns(25);
        timkiemSptxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timkiemSptxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemSptxtMouseClicked(evt);
            }
        });
        timkiemSptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timkiemSptxtKeyPressed(evt);
            }
        });
        jPanel21.add(timkiemSptxt);

        tableGioHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Đơn giá", "Thành tiền"
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
            tableGioHang.getColumnModel().getColumn(0).setMaxWidth(50);
            tableGioHang.getColumnModel().getColumn(1).setMinWidth(285);
            tableGioHang.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Giỏ Hàng");

        javax.swing.GroupLayout pnTable2Layout = new javax.swing.GroupLayout(pnTable2);
        pnTable2.setLayout(pnTable2Layout);
        pnTable2Layout.setHorizontalGroup(
            pnTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnTable2Layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnTable2Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addGap(278, 284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTable2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnTable2Layout.setVerticalGroup(
            pnTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTable2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pnChiTietSanPham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Chi Tiết Sản Phẩm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Mã SP:");

        maSptxt.setEditable(false);
        maSptxt.setBackground(new java.awt.Color(229, 224, 224));
        maSptxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maSptxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        maSptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maSptxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maSptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(maSptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Tên SP: ");

        tenSptxt.setEditable(false);
        tenSptxt.setBackground(new java.awt.Color(229, 224, 224));
        tenSptxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tenSptxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tenSptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSptxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tenSptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(239, 239, 239))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenSptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(5, 5, 5))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Đơn Giá:");

        donGiatxt.setEditable(false);
        donGiatxt.setBackground(new java.awt.Color(229, 224, 224));
        donGiatxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        donGiatxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(donGiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donGiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Số Lượng:");

        soluongsnipper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soluongsnipper.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soluongsnipper, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(8, 16, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(soluongsnipper, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        themvaogiobutton.setBackground(new java.awt.Color(255, 153, 0));
        themvaogiobutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        themvaogiobutton.setText("Thêm vào giỏ");
        themvaogiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themvaogiobuttonActionPerformed(evt);
            }
        });

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setText("Nhân viên");

        nhanviencbb.setBackground(new java.awt.Color(229, 224, 224));
        nhanviencbb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nhanviencbb.setForeground(new java.awt.Color(153, 153, 153));
        nhanviencbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nhanviencbb.setEnabled(false);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanviencbb, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(9, 19, Short.MAX_VALUE))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel38)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(nhanviencbb)
                .addContainerGap())
        );

        anhicon.setBackground(new java.awt.Color(204, 204, 204));
        anhicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anhicon.setText(" ");
        anhicon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        anhicon.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                anhiconComponentAdded(evt);
            }
        });

        xoabutton.setBackground(new java.awt.Color(255, 153, 0));
        xoabutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoabutton.setText("XÓA");
        xoabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoabuttonActionPerformed(evt);
            }
        });

        xuathoadonbutton.setBackground(new java.awt.Color(255, 153, 0));
        xuathoadonbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xuathoadonbutton.setText("Xuất Hóa Đơn");
        xuathoadonbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuathoadonbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChiTietSanPhamLayout = new javax.swing.GroupLayout(pnChiTietSanPham);
        pnChiTietSanPham.setLayout(pnChiTietSanPhamLayout);
        pnChiTietSanPhamLayout.setHorizontalGroup(
            pnChiTietSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnChiTietSanPhamLayout.createSequentialGroup()
                .addGroup(pnChiTietSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietSanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xoabutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xuathoadonbutton)
                .addGap(63, 63, 63))
            .addGroup(pnChiTietSanPhamLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnChiTietSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anhicon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themvaogiobutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChiTietSanPhamLayout.setVerticalGroup(
            pnChiTietSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChiTietSanPhamLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(themvaogiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(anhicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(pnChiTietSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoabutton)
                    .addComponent(xuathoadonbutton))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout pnBanHang2Layout = new javax.swing.GroupLayout(pnBanHang2);
        pnBanHang2.setLayout(pnBanHang2Layout);
        pnBanHang2Layout.setHorizontalGroup(
            pnBanHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHang2Layout.createSequentialGroup()
                .addComponent(pnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnChiTietSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnBanHang2Layout.setVerticalGroup(
            pnBanHang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnChiTietSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabBanHang2.addTab("Bán Hàng", pnBanHang2);

        pnHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Hóa Đơn");
        jPanel13.add(jLabel14);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton1);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Mã HĐ");

        txtmaHD.setEditable(false);
        txtmaHD.setBackground(new java.awt.Color(229, 224, 224));
        txtmaHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmaHD.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(48, 48, 48)
                .addComponent(txtmaHD))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tableHoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Mã KH", "Mã NV", "Giảm giá", "Ngày lập", "Tổng tiền", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHoaDon.setRowHeight(30);
        tableHoaDon.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableHoaDon.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableHoaDon.setShowHorizontalLines(true);
        tableHoaDon.setShowVerticalLines(true);
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableHoaDon);
        if (tableHoaDon.getColumnModel().getColumnCount() > 0) {
            tableHoaDon.getColumnModel().getColumn(0).setMaxWidth(60);
            tableHoaDon.getColumnModel().getColumn(1).setMaxWidth(60);
            tableHoaDon.getColumnModel().getColumn(2).setMaxWidth(80);
            tableHoaDon.getColumnModel().getColumn(3).setMaxWidth(60);
            tableHoaDon.getColumnModel().getColumn(4).setMaxWidth(210);
            tableHoaDon.getColumnModel().getColumn(5).setMaxWidth(150);
            tableHoaDon.getColumnModel().getColumn(6).setMaxWidth(120);
        }

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Mã KH");

        txtmaKH.setEditable(false);
        txtmaKH.setBackground(new java.awt.Color(229, 224, 224));
        txtmaKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmaKH.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtmaKH))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtmaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Mã NV ");

        txtmaNV.setEditable(false);
        txtmaNV.setBackground(new java.awt.Color(229, 224, 224));
        txtmaNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmaNV.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtmaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Giảm giá");

        txtmagiam.setEditable(false);
        txtmagiam.setBackground(new java.awt.Color(229, 224, 224));
        txtmagiam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmagiam.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txtmagiam, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmagiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Ngày Lập");

        txtngaylap.setEditable(false);
        txtngaylap.setBackground(new java.awt.Color(229, 224, 224));
        txtngaylap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtngaylap.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(28, 28, 28)
                .addComponent(txtngaylap))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Tổng tiền");

        txtTongtien.setEditable(false);
        txtTongtien.setBackground(new java.awt.Color(229, 224, 224));
        txtTongtien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongtien.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Ghi chú");

        txtghichu.setBackground(new java.awt.Color(255, 255, 255));
        txtghichu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtghichu.setForeground(new java.awt.Color(0, 0, 0));
        txtghichu.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setPreferredSize(new java.awt.Dimension(350, 91));

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
        txtTuNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTuNgayKeyPressed(evt);
            }
        });

        txtDenNgay.setColumns(10);
        txtDenNgay.setBorder(javax.swing.BorderFactory.createTitledBorder("Đến ngày"));
        txtDenNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenNgayActionPerformed(evt);
            }
        });
        txtDenNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDenNgayKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaThap, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(txtTuNgay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaCao, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtDenNgay)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaThap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnHoaDon.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 680));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Chi Tiết Hóa Đơn");
        jPanel16.add(jLabel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Mã HĐ");

        txtmaHD1.setEditable(false);
        txtmaHD1.setBackground(new java.awt.Color(229, 224, 224));
        txtmaHD1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmaHD1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtmaHD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaHD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(48, 48, 48)
                .addComponent(txtmaHD1))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Mã SP");

        txtmaSp1.setEditable(false);
        txtmaSp1.setBackground(new java.awt.Color(229, 224, 224));
        txtmaSp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmaSp1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtmaSp1))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtmaSp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Giá SP");

        txtgiaSp1.setEditable(false);
        txtgiaSp1.setBackground(new java.awt.Color(229, 224, 224));
        txtgiaSp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtgiaSp1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtgiaSp1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtgiaSp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Số Lượng");

        txtSoluong1.setEditable(false);
        txtSoluong1.setBackground(new java.awt.Color(229, 224, 224));
        txtSoluong1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSoluong1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addGap(26, 26, 26)
                .addComponent(txtSoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30)
                .addComponent(txtSoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableChiTietHoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableChiTietHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Mã SP", "Giá SP", "SL", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChiTietHoaDon.setRowHeight(30);
        tableChiTietHoaDon.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableChiTietHoaDon.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableChiTietHoaDon.setShowHorizontalLines(true);
        tableChiTietHoaDon.setShowVerticalLines(true);
        tableChiTietHoaDon.setSurrendersFocusOnKeystroke(true);
        tableChiTietHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChiTietHoaDonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableChiTietHoaDon);
        if (tableChiTietHoaDon.getColumnModel().getColumnCount() > 0) {
            tableChiTietHoaDon.getColumnModel().getColumn(0).setMaxWidth(50);
            tableChiTietHoaDon.getColumnModel().getColumn(1).setMaxWidth(50);
            tableChiTietHoaDon.getColumnModel().getColumn(2).setMaxWidth(150);
            tableChiTietHoaDon.getColumnModel().getColumn(3).setMaxWidth(50);
            tableChiTietHoaDon.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Thành tiền");

        txtThanhtien1.setEditable(false);
        txtThanhtien1.setBackground(new java.awt.Color(229, 224, 224));
        txtThanhtien1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtThanhtien1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtThanhtien1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtThanhtien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        pnHoaDon.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 400, 680));

        tabBanHang2.addTab("Hóa Đơn", pnHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBanHang2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBanHang2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       reset();
    }//GEN-LAST:event_resetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog3.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jDialog4.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void txtGiaThapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaThapActionPerformed
        txtGiaCao.requestFocus();
    }//GEN-LAST:event_txtGiaThapActionPerformed

    private void txtGiaCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaCaoActionPerformed
        hienthiTableHoaDonTheoGia(txtGiaThap.getText(), txtGiaCao.getText());
    }//GEN-LAST:event_txtGiaCaoActionPerformed

    private void txtTuNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuNgayActionPerformed
           txtDenNgay.requestFocus();
    }//GEN-LAST:event_txtTuNgayActionPerformed

    private void txtDenNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenNgayActionPerformed
        timkiemTheoKhoangNgay();
    }//GEN-LAST:event_txtDenNgayActionPerformed

    private void tableSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSpMouseClicked
        clickKhoHang();
    }//GEN-LAST:event_tableSpMouseClicked

    private void tableGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGioHangMouseClicked
        clickGioHang();
    }//GEN-LAST:event_tableGioHangMouseClicked

    private void timkiemSptxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemSptxtMouseClicked
        
    }//GEN-LAST:event_timkiemSptxtMouseClicked

    private void timkiemSptxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemSptxtKeyPressed
        timKiem(timkiemSptxt.getText());
    }//GEN-LAST:event_timkiemSptxtKeyPressed

    private void txtmaHD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaHD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaHD1ActionPerformed

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        clicktableHoaDon();
        hienthitableChiTietHoaDontheoMaHD();
    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void tableChiTietHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiTietHoaDonMouseClicked
        clicktableCtHoaDon();
    }//GEN-LAST:event_tableChiTietHoaDonMouseClicked

    private void xuathoadonbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuathoadonbuttonActionPerformed
        xuathoadon();
    }//GEN-LAST:event_xuathoadonbuttonActionPerformed

    private void xoabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoabuttonActionPerformed
        xoagiohang();
    }//GEN-LAST:event_xoabuttonActionPerformed

    private void themvaogiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themvaogiobuttonActionPerformed

        themvaogiohang();
    }//GEN-LAST:event_themvaogiobuttonActionPerformed

    private void tenSptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenSptxtActionPerformed

    private void maSptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maSptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maSptxtActionPerformed

    private void anhiconComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_anhiconComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_anhiconComponentAdded

    private void txtTuNgayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTuNgayKeyPressed
        
    }//GEN-LAST:event_txtTuNgayKeyPressed

    private void txtDenNgayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenNgayKeyPressed
        
    }//GEN-LAST:event_txtDenNgayKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       resetHoaDon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reset(){
        spBUS.doclistsp();
        hienthitableSp();
        maSptxt.setText("");
        tenSptxt.setText("");
        soluongsnipper.setValue(0);
        donGiatxt.setText("");
        timkiemSptxt.setText("");
        loadAnh("");
        
    }
    
    private void resetHoaDon(){
        hoaDonBUS.docDanhSach();
        hienthitableHoaDon();
        hienthitableChiTietHoaDon();
        txtmaHD.setText("");
        txtmaHD1.setText("");
        txtmaKH.setText("");
        txtmaNV.setText("");
        txtngaylap.setText("");
        txtmagiam.setText("");
        txtTongtien.setText("");
        txtghichu.setText("");
        txtmaSp1.setText("");
        txtgiaSp1.setText("");
        txtSoluong1.setText("");
        txtThanhtien1.setText("");
        txtGiaThap.setText("");
        txtGiaCao.setText("");
        txtTuNgay.setText("");
        txtDenNgay.setText("");
    }
    
    private void timKiem(String tukhoa){
        dtmSanPhamBan.setRowCount(0);
        
        spBUS.doclistsp();
        ArrayList<SP> dssp= spBUS.timKiemSpTheoTen(tukhoa);
        
        for (SP sp : dssp) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            vec.add(dcf.format(sp.getSl()));
            vec.add(dcf.format(sp.getGiaban()));
            String tennhomsp = nhomspBUS.getTenNhomsp(sp.getIdnhomsp());
            vec.add(tennhomsp);
            vec.add(sp.getAnh());
            dtmSanPhamBan.addRow(vec);
        }
    }
    
    private void hienthitableSp(){
        dtmSanPhamBan.setRowCount(0);
        spBUS.doclistsp();
       
        ArrayList<SP> dssp = spBUS.getDssp();

        for (SP sp : dssp) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            vec.add(sp.getSl());
            vec.add(dcf.format(sp.getGiaban()));
            String tennhomsp = nhomspBUS.getTenNhomsp(sp.getIdnhomsp());
            vec.add(tennhomsp);
            vec.add(sp.getAnh());
            
            dtmSanPhamBan.addRow(vec);
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
    
    private ImageIcon getAnhSP(String src) {
        src = src.trim().equals("") ? "default.png" : src;
        //Xử lý ảnh
        BufferedImage img = null;
        File fileImg = new File(src);

        if (!fileImg.exists()) {
            fileImg = new File("img/SanPham/default.png");
        }
        try {
            img = ImageIO.read(fileImg);
            fileAnhSP = new File(src);
        } catch (IOException e) {
            fileAnhSP = new File("img/SanPham/default.png");
        }
        if (img != null) {
            Image dimg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        }

        return null;
    }
    
    private void loadAnh(String anh) {
        anhicon.setIcon(getAnhSP(anh));
    }
    
    private void clickKhoHang(){
        int row = tableSp.getSelectedRow();
        if(row>-1){
            String maSP = tableSp.getValueAt(row, 0).toString();
            String tenSP = tableSp.getValueAt(row, 1).toString();
            String sl= tableSp.getValueAt(row, 2).toString();
            String dongia= tableSp.getValueAt(row, 3).toString();
            String anh= tableSp.getValueAt(row, 5).toString();
            
            int sl1= Integer.parseInt(sl);

            if(sl1==0){
                new MyDialog("Sản phẩm này đã hết hàng!", MyDialog.ERROR_DIALOG);
                return;
            }else{
                maSptxt.setText(maSP);
                tenSptxt.setText(tenSP);
                donGiatxt.setText(dongia);
                soluongsnipper.setValue(1);
                loadAnh("img/SanPham/" + anh);
            }
        }
        
        tableGioHang.clearSelection();
    }
    
    private void clickGioHang(){
        tableSp.clearSelection();
        int row = tableGioHang.getSelectedRow();
        if (row > -1) {
            maSptxt.setText(tableGioHang.getValueAt(row, 0).toString());
            tenSptxt.setText(tableGioHang.getValueAt(row, 1).toString());
            int sl= Integer.parseInt(tableGioHang.getValueAt(row, 2).toString());
            soluongsnipper.setValue(sl);
            donGiatxt.setText(tableGioHang.getValueAt(row, 3).toString());
        }
    }

    private void themvaogiohang(){
        float thanhtien= 0;
        
        int row = tableSp.getSelectedRow();
        if (row > -1) {
            int sl= 0;
            int soLuongConLai = Integer.parseInt(tableSp.getValueAt(tableSp.getSelectedRow(), 2) + "");
            String ma = maSptxt.getText();
            
            String tenSP = tenSptxt.getText();
            try{
                sl = Integer.parseInt(soluongsnipper.getValue()+ "");
            }catch(Exception ex){
                new MyDialog("Vui lòng chọn số lượng hợp lệ", MyDialog.ERROR_DIALOG);
                return;
            }
            
            if(sl<=0){
                new MyDialog("Số lượng mua không được nhỏ hơn hoặc bằng 0!", MyDialog.ERROR_DIALOG);
                return;
            }

            if (sl > soLuongConLai || soLuongConLai <= 0) {
            new MyDialog("Sản phẩm đã hết hàng", MyDialog.ERROR_DIALOG);
            return;
        }
            float dongia= Float.parseFloat(donGiatxt.getText().replace(",", ""));
            
            thanhtien = sl * dongia;
            maSptxt.setText("");
            tenSptxt.setText("");
             donGiatxt.setText("");
            
        
            soluongsnipper.setValue(0);
            if (ma.trim().equalsIgnoreCase(""))
                return;
            int key = Integer.parseInt(ma);
            for (int i = 0; i < tableGioHang.getRowCount(); i++) {
                if (ma.equals(tableGioHang.getValueAt(i, 0))) {
                    int slnhap = Integer.parseInt(tableGioHang.getValueAt(i, 2).toString());
                    // lay thanh tien = cot trong gio hang de ti cong don neu cung masp.
                    double tt= Double.parseDouble(tableGioHang.getValueAt(i, 4).toString().replace(",", ""));
                    slnhap+=sl;
                    thanhtien += tt;
                    tableGioHang.setValueAt(slnhap, i, 2);
                    tableGioHang.setValueAt(tenSP, i, 1 );
                    tableGioHang.setValueAt(dcf.format(dongia), i, 3);
                    tableGioHang.setValueAt(dcf.format(thanhtien), i, 4);
                     
                    
                    spBUS.updateSlSp(key, -sl);
                    spBUS.doclistsp();
                    hienthitableSp();
                
                    return;
                }
            }
            
            Vector vec = new Vector();
            vec.add(ma);
            vec.add(tenSP);
            vec.add(sl);
            vec.add(dcf.format(dongia));
            vec.add(dcf.format(thanhtien));
            spBUS.updateSlSp(key, -sl);
           
            hienthitableSp();
            dtmGioHang.addRow(vec);
        } else {
            new MyDialog("Chưa chọn sản phẩm để bán!", MyDialog.ERROR_DIALOG);
            return;
        }
    }
    
    
     private void xoagiohang() {
        int row = tableGioHang.getSelectedRow();
        if (row > -1) {
            int ma = Integer.parseInt(tableGioHang.getValueAt(row, 0) + "");
            int soLuong = Integer.parseInt(tableGioHang.getValueAt(row, 2) + "");
            spBUS.updateSlSp(ma, soLuong);
            hienthitableSp();
            dtmGioHang.removeRow(row);
        }else {
            new MyDialog("Chịu, chưa chọn thì ai mà biết xóa cái gì :)", MyDialog.ERROR_DIALOG);
        }
    }

    
    private void xuathoadon(){
        int row = tableGioHang.getRowCount();
        
        double tongtien= 0;
        
        if (row < 1) {
            new MyDialog("Đã cho cái gì vào giỏ hàng đâu mà biết xuất hóa đơn, xuất cái gì?!", MyDialog.ERROR_DIALOG);
            return;
        }else{
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
        
            jdialogChiTietHoaDon1 hoadonj = new jdialogChiTietHoaDon1(dsGioHang, tongtien, nhanviencbb.getSelectedItem().toString());
            hoadonj.setVisible(true);
            if (hoadonj.checkhoadon) {
            dtmGioHang.setRowCount(0);
            } 
        }
    }
    
     private void hienthitableChiTietHoaDon(){
        dtmCTHoaDon.setRowCount(0);
        ArrayList<CtHoaDon> dsct = ctHoaDonBUS.getListCTHoaDon();
        
        if (dsct != null) {
            for (CtHoaDon ct : dsct) {
                Vector vec = new Vector();
                vec.add(ct.getMahoadon());
                vec.add(ct.getMasanpham());
                vec.add(dcf.format(ct.getGiasanpham()));
                vec.add(ct.getSoluongmua());

                float gia= ct.getGiasanpham();
                int sl= ct.getSoluongmua();

                float thanhtien= gia* sl;
                vec.add(dcf.format(thanhtien));

                dtmCTHoaDon.addRow(vec);
            }
        }
    }
    
    private void hienthitableHoaDon(){
        hoaDonBUS.docDanhSach();
        ArrayList<HoaDon> dshd = hoaDonBUS.getListHoaDon();
        ArrayList<CtHoaDon> dsct = ctHoaDonBUS.getListCTHoaDon();
        if (dshd != null) {
            dtmHoaDon.setRowCount(0);

            for (HoaDon hd : dshd) {
                String tennhanvien=nvBUS.getTenNhanVien(hd.getManhanvien());
                int phantramgiam=ggBUS.getphantramGiamGia(hd.getMagiam());
                String phantramgiam2=  phantramgiam +"%";
                
                Vector vec = new Vector();
                vec.add(hd.getMahoadon());
                vec.add(hd.getMakhachhang());
                vec.add(tennhanvien);
                vec.add(phantramgiam2);
                
                vec.add(hd.getNgaylap());
                
                double tong= 0;
                for(CtHoaDon ct: dsct){
                    float gia= ct.getGiasanpham();
                    int sl= ct.getSoluongmua();

                    float thanhtien= gia* sl;
                    if(hd.getMahoadon()==ct.getMahoadon()){
                        tong+= thanhtien;
                    }
                }
                tong = tong - (tong * phantramgiam / 100);
                
                vec.add(dcf.format(tong));
                vec.add(hd.getGhichu());

                dtmHoaDon.addRow(vec);
            }

        }
    }  
 
    
    //tim kiem xong no hien ra theo ngay
    private void hienthiTableHoaDonTheoNgay(ArrayList<HoaDon> dshd) {
        ArrayList<CtHoaDon> dsct = ctHoaDonBUS.getListCTHoaDon();
        
        if (dshd != null) {
            dtmHoaDon.setRowCount(0);
            for (HoaDon hd : dshd) {
                String tennhanvien=nvBUS.getTenNhanVien(hd.getManhanvien());
                int phantramgiam=ggBUS.getphantramGiamGia(hd.getMagiam());
                String phantramgiam2=  phantramgiam +"%";
                
                Vector vec = new Vector();
                vec.add(hd.getMahoadon());
                vec.add(hd.getMakhachhang());
                vec.add(tennhanvien);
                vec.add(phantramgiam2);
                vec.add(hd.getNgaylap());
                
                double tong= 0;
                
                for(CtHoaDon ct: dsct){
                    float gia= ct.getGiasanpham();
                    int sl= ct.getSoluongmua();

                    float thanhtien= gia* sl;
                    if(hd.getMahoadon()==ct.getMahoadon()){
                        tong+= thanhtien;
                    }
                }
                
                tong = tong - (tong * phantramgiam / 100);
                
                vec.add(dcf.format(tong));
                vec.add(hd.getGhichu());
                dtmHoaDon.addRow(vec);
            }
        }
    }
    
    private void hienthiTableHoaDonTheoGia(String giathap, String giacao ) {
        int row = tableHoaDon.getRowCount();
        
        float giathap1= Float.parseFloat(giathap.replace(",", ""));
        float giacao1= Float.parseFloat(giacao.replace(",", ""));
        
        ArrayList<Vector> dshd = new ArrayList<>();
        Vector vec = new Vector();
        for (int i = 0; i < row; i++) {
            float a= Float.parseFloat(tableHoaDon.getValueAt(i, 5).toString().replace(",", ""));
            if(a>giathap1 && a<giacao1){
                
                vec.add(tableHoaDon.getValueAt(i, 0));
                vec.add(tableHoaDon.getValueAt(i, 1));
                vec.add(tableHoaDon.getValueAt(i, 2));
                vec.add(tableHoaDon.getValueAt(i, 3));
                vec.add(tableHoaDon.getValueAt(i, 4));
                vec.add(tableHoaDon.getValueAt(i, 5));
                vec.add(tableHoaDon.getValueAt(i, 6));

                dshd.add(vec);
            }
            
         
        }
        dtmHoaDon.setRowCount(0);
        for(Vector v: dshd){
            Vector vec1= new Vector();
            vec1.add(v.get(0));
            vec1.add(v.get(1));
            vec1.add(v.get(2));
            vec1.add(v.get(3));
            vec1.add(v.get(4));
            vec1.add(v.get(5));
            vec1.add(v.get(6));
            dtmHoaDon.addRow(vec1);
        }
        
    }
    
    public double tinhtienban(){
        int row = tableHoaDon.getRowCount();
        for (int i = 0; i < row; i++) {
            float tt= Float.parseFloat(tableHoaDon.getValueAt(i, 5).toString().replace(",", ""));
            tienban+=tt;
        }
        return tienban;
    }
   
    private void timkiemTheoKhoangNgay() {
        ArrayList<HoaDon> listHoaDon = hoaDonBUS.getListHoaDonTheoNgay(txtTuNgay.getText(), txtDenNgay.getText());
        hienthiTableHoaDonTheoNgay(listHoaDon);
    }
    
    private void clicktableHoaDon(){
        int row = tableHoaDon.getSelectedRow();
         if (row > -1) {
            txtmaHD.setText(tableHoaDon.getValueAt(row, 0) + "");
            txtmaKH.setText(tableHoaDon.getValueAt(row, 1) + "");
            txtmaNV.setText(tableHoaDon.getValueAt(row, 2) + "");
            txtngaylap.setText(tableHoaDon.getValueAt(row, 4) + "");
            txtTongtien.setText(tableHoaDon.getValueAt(row, 5)+ "");
            txtghichu.setText(tableHoaDon.getValueAt(row, 6)+ "");
            txtmagiam.setText(tableHoaDon.getValueAt(row, 3)+ "");
        }
    }
    private void clicktableCtHoaDon(){
        int row = tableChiTietHoaDon.getSelectedRow();
         
         if (row > -1) {
            txtmaHD1.setText(tableChiTietHoaDon.getValueAt(row, 0) + "");
            txtmaSp1.setText(tableChiTietHoaDon.getValueAt(row, 1) + "");
            txtgiaSp1.setText(tableChiTietHoaDon.getValueAt(row, 2) + "");
            txtSoluong1.setText(tableChiTietHoaDon.getValueAt(row, 3) + "");
            txtThanhtien1.setText(tableChiTietHoaDon.getValueAt(row, 4)+ "");
        }
    }

    private void hienthitableChiTietHoaDontheoMaHD(){
        int row = tableHoaDon.getSelectedRow();
        if (row > -1) {
           
            dtmCTHoaDon.setRowCount(0);
            ArrayList<CtHoaDon> dsct = ctHoaDonBUS.getListCTHoaDonTheoMaHD(tableHoaDon.getValueAt(row, 0).toString());

            if (dsct != null) {
                for (CtHoaDon ct : dsct) {
                    Vector vec = new Vector();
                    vec.add(ct.getMahoadon());
                    vec.add(ct.getMasanpham());
                    vec.add(dcf.format(ct.getGiasanpham()));
                    vec.add(ct.getSoluongmua());

                     float gia= ct.getGiasanpham();
                     int sl= ct.getSoluongmua();

                    float thanhtien= gia* sl;
                    vec.add(dcf.format(thanhtien));

                    dtmCTHoaDon.addRow(vec);
                }
            }
        }
    }  
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhicon;
    private javax.swing.JTextField donGiatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField maSptxt;
    private javax.swing.JComboBox<String> nhanviencbb;
    private javax.swing.JPanel pnBanHang2;
    private javax.swing.JPanel pnChiTietSanPham;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnTable2;
    private javax.swing.JButton reset;
    private javax.swing.JSpinner soluongsnipper;
    private javax.swing.JTabbedPane tabBanHang2;
    private javax.swing.JTable tableChiTietHoaDon;
    private javax.swing.JTable tableGioHang;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JTable tableSp;
    private javax.swing.JTextField tenSptxt;
    private javax.swing.JButton themvaogiobutton;
    private javax.swing.JTextField timkiemSptxt;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtGiaCao;
    private javax.swing.JTextField txtGiaThap;
    private javax.swing.JTextField txtSoluong1;
    private javax.swing.JTextField txtThanhtien1;
    private javax.swing.JTextField txtTongtien;
    private javax.swing.JTextField txtTuNgay;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtgiaSp1;
    private javax.swing.JTextField txtmaHD;
    private javax.swing.JTextField txtmaHD1;
    private javax.swing.JTextField txtmaKH;
    private javax.swing.JTextField txtmaNV;
    private javax.swing.JTextField txtmaSp1;
    private javax.swing.JTextField txtmagiam;
    private javax.swing.JTextField txtngaylap;
    private javax.swing.JButton xoabutton;
    private javax.swing.JButton xuathoadonbutton;
    // End of variables declaration//GEN-END:variables

//    private void setIconImage(Image icon) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
