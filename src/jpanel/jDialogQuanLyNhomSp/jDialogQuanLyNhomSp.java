/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogQuanLyNhomSp;

import Main.MyDialog;
import QuanLyBanHang.BUS.Nhomsp_BUS;
import QuanLyBanHang.DTO.NhomSP;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynn
 */
public class jDialogQuanLyNhomSp extends javax.swing.JDialog {

    public jDialogQuanLyNhomSp() {
        initComponents();
//        customControls();

        dtmNhomSp =(DefaultTableModel) jTableNhomSp.getModel();
        
        hienThiDuLieuLenBangNhomSp();
        
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableNhomSp = new javax.swing.JTable();
        jButtonThemNhomSp = new javax.swing.JButton();
        jButtonSuaNhomSp = new javax.swing.JButton();
        jButtonXoaNhomSp = new javax.swing.JButton();
        jButtonDongYChonNhomSp = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtTimKiemNhomSp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel4.setText("Quản lý nhóm sản phẩm");
        jPanel5.add(jLabel4);

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh-icon.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel5.add(refresh);

        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTableNhomSp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableNhomSp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableNhomSp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhóm", "Tên nhóm"
            }
        ));
        jTableNhomSp.setRowHeight(30);
        jTableNhomSp.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableNhomSp.setShowHorizontalLines(true);
        jTableNhomSp.setShowVerticalLines(true);
        jTableNhomSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhomSpMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableNhomSp);

        jButtonThemNhomSp.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButtonThemNhomSp.setText(" Thêm ");
        jButtonThemNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemNhomSpActionPerformed(evt);
            }
        });

        jButtonSuaNhomSp.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButtonSuaNhomSp.setText("Sửa");
        jButtonSuaNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaNhomSpActionPerformed(evt);
            }
        });

        jButtonXoaNhomSp.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButtonXoaNhomSp.setText("Xóa");
        jButtonXoaNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaNhomSpActionPerformed(evt);
            }
        });

        jButtonDongYChonNhomSp.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButtonDongYChonNhomSp.setText("Chọn");
        jButtonDongYChonNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDongYChonNhomSpActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Tìm kiếm");

        txtTimKiemNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemNhomSpActionPerformed(evt);
            }
        });
        txtTimKiemNhomSp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemNhomSpKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiemNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTimKiemNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButtonDongYChonNhomSp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonThemNhomSp)
                .addGap(39, 39, 39)
                .addComponent(jButtonSuaNhomSp)
                .addGap(43, 43, 43)
                .addComponent(jButtonXoaNhomSp)
                .addGap(37, 37, 37))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemNhomSp)
                    .addComponent(jButtonSuaNhomSp)
                    .addComponent(jButtonXoaNhomSp)
                    .addComponent(jButtonDongYChonNhomSp))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //khai bao nhomsp de chon
    private NhomSP nspChon= null;
    private Nhomsp_BUS nhomspBus= new Nhomsp_BUS();
    private DefaultTableModel dtmNhomSp;
    
   
    //lay nhom sp de chon
    public NhomSP getNhomSP(){
        return nspChon;
    }
     
    private void hienThiDuLieuLenBangNhomSp(){
        dtmNhomSp.setRowCount(0);
        nhomspBus.doclistNhomsp();
        ArrayList<NhomSP> dsnsp = nhomspBus.getDsNhomsp();

        if (dsnsp != null) {
            for (NhomSP nsp : dsnsp) {
                Vector vec = new Vector();
                vec.add(nsp.getIdnhomsp());
                vec.add(nsp.getTennhomsp());
               
                dtmNhomSp.addRow(vec);
            }
        }
    }
    
    private void hienthiDanhSachNhomSp(ArrayList<NhomSP> dsNhomsp) {
        dtmNhomSp.setRowCount(0);
        for (NhomSP nsp : dsNhomsp) {
            Vector vec = new Vector();
            vec.add(nsp.getIdnhomsp());
            vec.add(nsp.getTennhomsp());
            
            dtmNhomSp.addRow(vec);
        }
    }
    
    private void jButtonThemNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemNhomSpActionPerformed
        jDialogThemNhomSp jdlThemNhomSp= new jDialogThemNhomSp();
        jdlThemNhomSp.setVisible(true);
        if (jdlThemNhomSp.getCheckThemNsp()==true) {
            hienThiDuLieuLenBangNhomSp();            
        }

    }//GEN-LAST:event_jButtonThemNhomSpActionPerformed

    private void jButtonSuaNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaNhomSpActionPerformed
        int row = jTableNhomSp.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        // cai dat gia tri cua idnhomsp va tennsp= voi gia tri cua hang ma da chon.
        NhomSP nsp1= new NhomSP();
        nsp1.setIdnhomsp(Integer.parseInt(jTableNhomSp.getValueAt(row, 0) + ""));
        nsp1.setTennhomsp(jTableNhomSp.getValueAt(row, 1) + "");
        
        jDialogSuaNhomSp jdlSuaNhomSp= new jDialogSuaNhomSp(nsp1);
        jdlSuaNhomSp.setVisible(true);
        if (jdlSuaNhomSp.getCheckSuaNhomSp()) {
            hienThiDuLieuLenBangNhomSp();
        }
    }//GEN-LAST:event_jButtonSuaNhomSpActionPerformed

    private void jButtonDongYChonNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDongYChonNhomSpActionPerformed
        int row = jTableNhomSp.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        int mansp= Integer.parseInt(jTableNhomSp.getValueAt(row, 0) + "");
        String tennsp= jTableNhomSp.getValueAt(row, 1)+ "";
        byte tt= 1;
        nspChon= new NhomSP(mansp, tennsp, tt);
        this.dispose();
        
    }//GEN-LAST:event_jButtonDongYChonNhomSpActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        txtTimKiemNhomSp.setText("");
        hienThiDuLieuLenBangNhomSp();
    }//GEN-LAST:event_refreshActionPerformed

    private void jTableNhomSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhomSpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNhomSpMouseClicked

    private void jButtonXoaNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaNhomSpActionPerformed
        int row = jTableNhomSp.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        NhomSP nsp2= new NhomSP();
        nsp2.setIdnhomsp(Integer.parseInt(jTableNhomSp.getValueAt(row, 0) + ""));
        nsp2.setTennhomsp(jTableNhomSp.getValueAt(row, 1) + "");
        
        
        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
        if (dlg.OK_OPTION == dlg.getAction()) {
            byte a= 0;
            boolean flag = nhomspBus.xoaNhomsp(nsp2.getIdnhomsp(), a);
            if (flag==true) {
                hienThiDuLieuLenBangNhomSp();
            }
        }
    }//GEN-LAST:event_jButtonXoaNhomSpActionPerformed

    private void txtTimKiemNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemNhomSpActionPerformed
        
        
    }//GEN-LAST:event_txtTimKiemNhomSpActionPerformed

    private void txtTimKiemNhomSpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemNhomSpKeyPressed
        ArrayList<NhomSP> dsNhomSP = nhomspBus.timKiemNhomsp(txtTimKiemNhomSp.getText());
        hienthiDanhSachNhomSp(dsNhomSP);
    }//GEN-LAST:event_txtTimKiemNhomSpKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDongYChonNhomSp;
    private javax.swing.JButton jButtonSuaNhomSp;
    private javax.swing.JButton jButtonThemNhomSp;
    private javax.swing.JButton jButtonXoaNhomSp;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableNhomSp;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField txtTimKiemNhomSp;
    // End of variables declaration//GEN-END:variables
}
