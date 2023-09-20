package jpanel;

import Main.MyDialog;
import Main.MyFileChooser;
import QuanLyBanHang.BUS.Nhomsp_BUS;
import QuanLyBanHang.BUS.Sp_BUS;
import QuanLyBanHang.DAO.Sp_DAO;
import QuanLyBanHang.DTO.SP;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jpanel.jDialogQuanLyNhomSp.jDialogQuanLyNhomSp;

public class jpanelSanPham extends javax.swing.JPanel {

    public jpanelSanPham() {
        initComponents();
        dtmSanPham =(DefaultTableModel) tableSanPham.getModel();       
        hienThiDuLieuLenBangSp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        chonNhomSpButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        txtTimKiemSp = new javax.swing.JTextField();
        suaButton = new javax.swing.JButton();
        themButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        txtGiaban = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNhomsp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        soLuongsnipper = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        chonAnhButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        txtMasp = new javax.swing.JTextField();
        JHienThiAnh = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        chonNhomSpButton.setText("...");
        chonNhomSpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonNhomSpButtonActionPerformed(evt);
            }
        });

        xoaButton.setBackground(new java.awt.Color(255, 102, 102));
        xoaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-icon.png"))); // NOI18N
        xoaButton.setText("Xóa");
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        txtTimKiemSp.setColumns(20);
        txtTimKiemSp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiemSp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemSpKeyPressed(evt);
            }
        });

        suaButton.setBackground(new java.awt.Color(255, 255, 204));
        suaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pencil-icon.png"))); // NOI18N
        suaButton.setText("Sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        themButton.setBackground(new java.awt.Color(204, 204, 255));
        themButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon.png"))); // NOI18N
        themButton.setText("Thêm");
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chonNhomSpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiemSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(themButton)
                        .addGap(18, 18, 18)
                        .addComponent(suaButton)
                        .addGap(18, 18, 18)
                        .addComponent(xoaButton)))
                .addGap(79, 79, 79))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                .addComponent(chonNhomSpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoaButton)
                    .addComponent(suaButton)
                    .addComponent(themButton))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1596, 1596, 1596)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        txtGiaban.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGiaban.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mã SP");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tên SP");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setText("Quản Lý Sản Phẩm  ");

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Giá Bán");

        txtNhomsp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNhomsp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNhomsp.setSelectionEnd(1);
        txtNhomsp.setSelectionStart(1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Số Lượng");

        soLuongsnipper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nhóm SP");

        txtTensp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTensp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTensp.setText(" ");

        chonAnhButton.setText("Chọn Ảnh");
        chonAnhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonAnhButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tableSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        tableSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Mã SP", "Tên SP", "Nhóm SP", "Số Lượng", "Giá Bán", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSanPham.setRowHeight(30);
        tableSanPham.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableSanPham.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableSanPham.setShowHorizontalLines(true);
        tableSanPham.setShowVerticalLines(true);
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSanPham);
        if (tableSanPham.getColumnModel().getColumnCount() > 0) {
            tableSanPham.getColumnModel().getColumn(0).setMaxWidth(100);
            tableSanPham.getColumnModel().getColumn(1).setMaxWidth(500);
            tableSanPham.getColumnModel().getColumn(2).setMaxWidth(150);
            tableSanPham.getColumnModel().getColumn(3).setMaxWidth(150);
            tableSanPham.getColumnModel().getColumn(4).setMaxWidth(150);
            tableSanPham.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        txtMasp.setEditable(false);
        txtMasp.setBackground(new java.awt.Color(204, 204, 204));
        txtMasp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMasp.setForeground(new java.awt.Color(153, 153, 153));
        txtMasp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaspActionPerformed(evt);
            }
        });

        JHienThiAnh.setBackground(new java.awt.Color(204, 204, 204));
        JHienThiAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JHienThiAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMasp, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                    .addComponent(soLuongsnipper, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNhomsp, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTensp))
                                .addGap(75, 75, 75))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JHienThiAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(chonAnhButton)))
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNhomsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soLuongsnipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JHienThiAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chonAnhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1098, 1098, 1098))
        );

        jTabbedPane1.addTab("Quản lý sản phẩm", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    Sp_DAO spDAO= new Sp_DAO();
    Sp_BUS spBUS= new Sp_BUS();
    Nhomsp_BUS nhomspBUS= new Nhomsp_BUS();
    DefaultTableModel dtmSanPham;
    File fileAnhSP;
    
    private void chonAnhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonAnhButtonActionPerformed
        xuLyChonAnh();
    }//GEN-LAST:event_chonAnhButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        clickTableSanPham();
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void txtMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaspActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        themSp();
    }//GEN-LAST:event_themButtonActionPerformed

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked

    }//GEN-LAST:event_themButtonMouseClicked

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        suaSp();
    }//GEN-LAST:event_suaButtonActionPerformed

    private void txtTimKiemSpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemSpKeyPressed
        ArrayList<SP> dssp= spBUS.timKiemSpTheoTen(txtTimKiemSp.getText());
        hienThiDuLieuTimKiem(dssp);
    }//GEN-LAST:event_txtTimKiemSpKeyPressed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        xoaSp();
    }//GEN-LAST:event_xoaButtonActionPerformed

    private void chonNhomSpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonNhomSpButtonActionPerformed
        xuLyChonNhomSp();
    }//GEN-LAST:event_chonNhomSpButtonActionPerformed
    
    public void reset(){
        txtMasp.setText("");
        txtTensp.setText("");
        txtNhomsp.setText("");
        soLuongsnipper.setValue(0);
        txtGiaban.setText("");
        loadAnh("");
        txtTimKiemSp.setText("");
        hienThiDuLieuLenBangSp();
    }
    private void hienThiDuLieuLenBangSp(){
        dtmSanPham.setRowCount(0);
        
        spBUS.doclistsp();
        ArrayList<SP> listsp= spBUS.getDssp();
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        
        for (SP sp : listsp) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            String tennhomsp = nhomspBUS.getTenNhomsp(sp.getIdnhomsp());
            vec.add(tennhomsp);
            vec.add(dcf.format(sp.getSl()));
            vec.add(dcf.format(sp.getGiaban()));
            vec.add(sp.getAnh());
            dtmSanPham.addRow(vec);
        }
    }
    
    private void hienThiDuLieuTimKiem(ArrayList<SP> dsTimKiem){
        dtmSanPham.setRowCount(0);
        
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        
        for (SP sp : dsTimKiem) {
            Vector vec = new Vector();
            vec.add(sp.getMasp());
            vec.add(sp.getTensp());
            String tennhomsp = nhomspBUS.getTenNhomsp(sp.getIdnhomsp());
            vec.add(tennhomsp);
            vec.add(dcf.format(sp.getSl()));
            vec.add(dcf.format(sp.getGiaban()));
            vec.add(sp.getAnh());
            dtmSanPham.addRow(vec);
        }
    }
    
    private void themSp(){
        String anh = fileAnhSP.getName();
        
        String[] nhomsp = txtNhomsp.getText().split(" - ");
        boolean flag = spBUS.themSp(txtTensp.getText(), nhomsp[0], soLuongsnipper.getValue() + "", anh, txtGiaban.getText());
        
        luuFileAnh();
        if(flag==true){
            reset();
        }
    }
    
    private void clickTableSanPham() {
        int row = tableSanPham.getSelectedRow();
        if (row > -1) {
            String ma = tableSanPham.getValueAt(row, 0).toString();
            String ten = tableSanPham.getValueAt(row, 1).toString();
            String nhomsp = tableSanPham.getValueAt(row, 2).toString();
            int sl = Integer.parseInt(tableSanPham.getValueAt(row, 3).toString());
            String giaban = tableSanPham.getValueAt(row, 4).toString();
            String anh = tableSanPham.getValueAt(row, 5).toString();

            int ma1= Integer.parseInt(ma);
            int idnhom= spBUS.getNhomspTheoMasp(ma1);
            
            txtMasp.setText(ma);
            txtTensp.setText(ten);
            txtNhomsp.setText(idnhom+ " - " + nhomspBUS.getTenNhomsp(idnhom));
            soLuongsnipper.setValue(sl);
            txtGiaban.setText(giaban);
            loadAnh("img/SanPham/" + anh);
            
            
        }
    }
    
    private void suaSp(){
        int row = tableSanPham.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        String anh = fileAnhSP.getName();
        String[] nhomsp = txtNhomsp.getText().split(" - ");
        boolean flag = spBUS.suaSp(txtMasp.getText(),txtTensp.getText(), 
                nhomsp[0], soLuongsnipper.getValue() + "", anh, txtGiaban.getText());
        
        luuFileAnh();
        if(flag==true){
            reset();
        }
    }
    
    private void xoaSp(){
        int row = tableSanPham.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }

        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
        if (dlg.OK_OPTION == dlg.getAction()) {
            int ma= Integer.parseInt(txtMasp.getText().toString());
            byte tt= 0;
            boolean flag = spBUS.xoaSp(ma, tt);
//            hienThiDuLieuLenBangSp();
            if (flag==true) {
                reset();
            }
        }
    }
    
    private void xuLyChonNhomSp(){
        jDialogQuanLyNhomSp jdlQuanLyNhomSp= new jDialogQuanLyNhomSp();
        jdlQuanLyNhomSp.setVisible(true);
        // lay manhomsp va tennhomsp cua quan ly nhom sp va hien thi len cung mot o text cua nhom sp.
        if (jdlQuanLyNhomSp.getNhomSP()!= null) {
            txtNhomsp.setText(jdlQuanLyNhomSp.getNhomSP().getIdnhomsp()+ " - " + jdlQuanLyNhomSp.getNhomSP().getTennhomsp());
        } else {
            txtNhomsp.setText("");
        }
    }
    
    //lay icon anh
    private ImageIcon getAnhSP(String src) {
        src = src.trim().equals("") ? "default.png" : src;
        //bufferedImage: xu ly anh, luu mot mang 2 chieu chua thong tin cua tung pixel trong anh
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
    
    //chon anh o nut button xong set icon vao jhienthianh
    private void xuLyChonAnh() {
        JFileChooser fileChooser = new MyFileChooser("img/SanPham/");
        //FileNameExtensionFilter: gioi han loai file duoc chon. dich ra tv la bộ lọc tiện ích mở rộng tên tệp.
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Tệp hình ảnh", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);
        //tuy chinh nut phe duyet, opendialog
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileAnhSP = fileChooser.getSelectedFile();
            JHienThiAnh.setIcon(getAnhSP(fileAnhSP.getPath()));
        }
    }

    //luu anh vao file img
    private void luuFileAnh() {
        BufferedImage bImage = null;
        try {
            File initialImage = new File(fileAnhSP.getPath());
            bImage = ImageIO.read(initialImage);

            //viet anh vao file, format png
            ImageIO.write(bImage, "png", new File("img/SanPham/" + fileAnhSP.getName()));

        } catch (IOException e) {
            System.out.println("Exception occured :" + e.getMessage());
        }
    }
    
    //lay o doan lay icon anh getAnhSP. load len jhienthi
    private void loadAnh(String anh) {
        JHienThiAnh.setIcon(getAnhSP(anh));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JHienThiAnh;
    private javax.swing.JButton chonAnhButton;
    private javax.swing.JButton chonNhomSpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JSpinner soLuongsnipper;
    private javax.swing.JButton suaButton;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JButton themButton;
    private javax.swing.JTextField txtGiaban;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtNhomsp;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtTimKiemSp;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
}
