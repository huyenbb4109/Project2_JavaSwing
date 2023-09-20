/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogNhaCungCap;

import QuanLyBanHang.BUS.NhaCungCap_BUS;

/**
 *
 * @author huynn
 */
public class jDialogThemNhaCungCap extends javax.swing.JDialog {

    public jDialogThemNhaCungCap() {
        checkThemNCC= false;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel29 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        txtMancc = new javax.swing.JTextField();
        txtTenncc = new javax.swing.JTextField();
        txtDiachiNhacc = new javax.swing.JTextField();
        themThemncc = new javax.swing.JButton();
        txtSdtNhacc = new javax.swing.JTextField();
        huyThemNhacc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel23.setText("Thêm nhà cung cấp");
        jPanel29.add(jLabel23);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        txtMancc.setEditable(false);
        txtMancc.setBackground(new java.awt.Color(204, 204, 204));
        txtMancc.setForeground(new java.awt.Color(204, 204, 204));
        txtMancc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        txtTenncc.setBackground(new java.awt.Color(255, 255, 255));
        txtTenncc.setForeground(new java.awt.Color(0, 0, 0));
        txtTenncc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        txtTenncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTennccActionPerformed(evt);
            }
        });

        txtDiachiNhacc.setBackground(new java.awt.Color(255, 255, 255));
        txtDiachiNhacc.setForeground(new java.awt.Color(0, 0, 0));
        txtDiachiNhacc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Địa Chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        txtDiachiNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiachiNhaccActionPerformed(evt);
            }
        });

        themThemncc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        themThemncc.setText("Thêm");
        themThemncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themThemnccActionPerformed(evt);
            }
        });

        txtSdtNhacc.setBackground(new java.awt.Color(255, 255, 255));
        txtSdtNhacc.setForeground(new java.awt.Color(0, 0, 0));
        txtSdtNhacc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số ĐT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        txtSdtNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtNhaccActionPerformed(evt);
            }
        });

        huyThemNhacc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        huyThemNhacc.setText("Hủy");
        huyThemNhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyThemNhaccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMancc, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtTenncc)
                    .addComponent(txtDiachiNhacc)
                    .addComponent(txtSdtNhacc))
                .addContainerGap())
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(themThemncc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(huyThemNhacc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(txtMancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiachiNhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSdtNhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themThemncc)
                    .addComponent(huyThemNhacc))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkThemNCC = false;
    private NhaCungCap_BUS nhaccBUS= new NhaCungCap_BUS();

    public boolean getCheckThemNCC() {
        return checkThemNCC;
    }
    
    private void txtTennccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTennccActionPerformed
        txtDiachiNhacc.requestFocus();
    }//GEN-LAST:event_txtTennccActionPerformed

    private void txtSdtNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtNhaccActionPerformed
        themThemncc.doClick();
    }//GEN-LAST:event_txtSdtNhaccActionPerformed

    private void themThemnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themThemnccActionPerformed
        boolean flag = nhaccBUS.themNhacc(txtTenncc.getText(), txtDiachiNhacc.getText(), txtSdtNhacc.getText());
        checkThemNCC = flag;
        if (flag) {
            this.dispose();
        }
    }//GEN-LAST:event_themThemnccActionPerformed

    private void huyThemNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyThemNhaccActionPerformed
        this.dispose();
    }//GEN-LAST:event_huyThemNhaccActionPerformed

    private void txtDiachiNhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiachiNhaccActionPerformed
        txtTenncc.requestFocus();
    }//GEN-LAST:event_txtDiachiNhaccActionPerformed

 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton huyThemNhacc;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JButton themThemncc;
    private javax.swing.JTextField txtDiachiNhacc;
    private javax.swing.JTextField txtMancc;
    private javax.swing.JTextField txtSdtNhacc;
    private javax.swing.JTextField txtTenncc;
    // End of variables declaration//GEN-END:variables
}
