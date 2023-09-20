/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogNhaCungCap;

import Main.MyDialog;
import QuanLyBanHang.BUS.NhaCungCap_BUS;
import QuanLyBanHang.DTO.NhaCungCap;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynn
 */
public class jDialogChonNhaCungCap extends javax.swing.JDialog {

    /**
     * Creates new form jDialogChonNhaCungCap
     */
    public jDialogChonNhaCungCap() {
        initComponents();
        dtmNhaCungCap =(DefaultTableModel) tableNhacc.getModel();
        hienthidanhsachNhacc();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel27 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        resetNhacc = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        timkiemNhacc = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableNhacc = new javax.swing.JTable();
        chonNhacc = new javax.swing.JButton();
        themNhacc = new javax.swing.JButton();
        suaNhacc = new javax.swing.JButton();
        xoaNhacc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel21.setText("Chọn nhà cung cấp");
        jPanel27.add(jLabel21);

        resetNhacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        jPanel27.add(resetNhacc);

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
                .addComponent(timkiemNhacc, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timkiemNhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(2, 2, 2))
        );

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tableNhacc.setBackground(new java.awt.Color(255, 255, 255));
        tableNhacc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableNhacc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableNhacc.setForeground(new java.awt.Color(0, 0, 0));
        tableNhacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Số ĐT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhacc.setRowHeight(30);
        tableNhacc.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tableNhacc.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableNhacc.setShowHorizontalLines(true);
        tableNhacc.setShowVerticalLines(true);
        jScrollPane5.setViewportView(tableNhacc);
        if (tableNhacc.getColumnModel().getColumnCount() > 0) {
            tableNhacc.getColumnModel().getColumn(0).setMaxWidth(50);
            tableNhacc.getColumnModel().getColumn(1).setMaxWidth(300);
            tableNhacc.getColumnModel().getColumn(2).setMaxWidth(200);
            tableNhacc.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        chonNhacc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        chonNhacc.setText("Chọn");
        chonNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonNhaccActionPerformed(evt);
            }
        });

        themNhacc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        themNhacc.setText("Thêm");
        themNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themNhaccActionPerformed(evt);
            }
        });

        suaNhacc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        suaNhacc.setText("Sửa ");
        suaNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaNhaccActionPerformed(evt);
            }
        });

        xoaNhacc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        xoaNhacc.setText("Xóa");
        xoaNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaNhaccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(chonNhacc)
                .addGap(26, 26, 26)
                .addComponent(themNhacc)
                .addGap(31, 31, 31)
                .addComponent(suaNhacc)
                .addGap(28, 28, 28)
                .addComponent(xoaNhacc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themNhacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chonNhacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaNhacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaNhacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private NhaCungCap_BUS nhaccBUS= new NhaCungCap_BUS();
    private NhaCungCap nhaCungCapChon = null;
    private DefaultTableModel dtmNhaCungCap;
    
     public NhaCungCap getNhaCungCap() {
        return nhaCungCapChon;
    }

    private void hienthidanhsachNhacc() {
        dtmNhaCungCap.setRowCount(0);
        nhaccBUS.docDanhSach();
        ArrayList<NhaCungCap> dsncc = nhaccBUS.getListNhaCungCap();

        if (dsncc != null) {
            for (NhaCungCap ncc : dsncc) {
                Vector vec = new Vector();
                vec.add(ncc.getMancc());
                vec.add(ncc.getTencc());
                vec.add(ncc.getDiachi());
                vec.add(ncc.getSdt());
                dtmNhaCungCap.addRow(vec);
            }
        }
    }
    private void themNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themNhaccActionPerformed
        jDialogThemNhaCungCap themnhacc= new jDialogThemNhaCungCap();
        themnhacc.setVisible(true);
         if (themnhacc.getCheckThemNCC()) {
            hienthidanhsachNhacc();
        }
    }//GEN-LAST:event_themNhaccActionPerformed

    private void suaNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaNhaccActionPerformed
        int row = tableNhacc.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMancc(Integer.parseInt(tableNhacc.getValueAt(row, 0) + ""));
        ncc.setTencc(tableNhacc.getValueAt(row, 1) + "");
        ncc.setDiachi(tableNhacc.getValueAt(row, 2) + "");
        ncc.setSdt(tableNhacc.getValueAt(row, 3) + "");

        jDialogSuaNhaCungCap suanhacc= new  jDialogSuaNhaCungCap(ncc);
        suanhacc.setVisible(true);
        if (suanhacc.getCheckSuaNCC()) {
            hienthidanhsachNhacc();
        }
        
    }//GEN-LAST:event_suaNhaccActionPerformed

    private void xoaNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaNhaccActionPerformed
        int row = tableNhacc.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        NhaCungCap ncc2= new NhaCungCap();
        ncc2.setMancc(Integer.parseInt(tableNhacc.getValueAt(row, 0) + ""));
        ncc2.setTencc(tableNhacc.getValueAt(row, 1) + "");
        ncc2.setDiachi(tableNhacc.getValueAt(row, 2)+ "");
        ncc2.setSdt(tableNhacc.getValueAt(row, 3)+ "");
        
        
        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
        if (dlg.OK_OPTION == dlg.getAction()) {
            byte a= 0;
            boolean flag = nhaccBUS.xoaNhacc(ncc2.getMancc(), a);
            if (flag==true) {
                hienthidanhsachNhacc();
            }
        }
    }//GEN-LAST:event_xoaNhaccActionPerformed

    private void chonNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonNhaccActionPerformed
        int row = tableNhacc.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        int maNCC = Integer.parseInt(tableNhacc.getValueAt(row, 0) + "");
        String tenNCC = tableNhacc.getValueAt(row, 1) + "";
        String diaChi = tableNhacc.getValueAt(row, 2) + "";
        String dienThoai = tableNhacc.getValueAt(row, 3) + "";
        byte tt= 1;
        nhaCungCapChon = new NhaCungCap(maNCC, tenNCC, diaChi, dienThoai, tt);
        this.dispose();
    }//GEN-LAST:event_chonNhaccActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chonNhacc;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton resetNhacc;
    private javax.swing.JButton suaNhacc;
    private javax.swing.JTable tableNhacc;
    private javax.swing.JButton themNhacc;
    private javax.swing.JTextField timkiemNhacc;
    private javax.swing.JButton xoaNhacc;
    // End of variables declaration//GEN-END:variables
}
