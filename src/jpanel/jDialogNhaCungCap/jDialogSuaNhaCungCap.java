/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogNhaCungCap;

import QuanLyBanHang.BUS.NhaCungCap_BUS;
import QuanLyBanHang.DTO.NhaCungCap;

/**
 *
 * @author huynn
 */
public class jDialogSuaNhaCungCap extends javax.swing.JDialog {

    /**
     * Creates new form jDialogSuaNhaCungCap
     */
    public jDialogSuaNhaCungCap(NhaCungCap nhacc) {
        checkSuaNCC= false;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
        
        txtManccSua.setText(nhacc.getMancc()+ "");
        txtTennccSua.setText(nhacc.getTencc());
        txtDiachinccSua.setText(nhacc.getDiachi());
        txtSdtnccSua.setText(nhacc.getSdt());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel31 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        txtManccSua = new javax.swing.JTextField();
        txtTennccSua = new javax.swing.JTextField();
        txtDiachinccSua = new javax.swing.JTextField();
        txtSdtnccSua = new javax.swing.JTextField();
        luunccSua = new javax.swing.JButton();
        huynccSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel24.setText("Sửa nhà cung cấp");
        jPanel31.add(jLabel24);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        txtManccSua.setEditable(false);
        txtManccSua.setBackground(new java.awt.Color(204, 204, 204));
        txtManccSua.setForeground(new java.awt.Color(0, 0, 0));
        txtManccSua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        txtTennccSua.setBackground(new java.awt.Color(255, 255, 255));
        txtTennccSua.setForeground(new java.awt.Color(0, 0, 0));
        txtTennccSua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên NCC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        txtTennccSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTennccSuaActionPerformed(evt);
            }
        });

        txtDiachinccSua.setBackground(new java.awt.Color(255, 255, 255));
        txtDiachinccSua.setForeground(new java.awt.Color(0, 0, 0));
        txtDiachinccSua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Địa Chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        txtSdtnccSua.setBackground(new java.awt.Color(255, 255, 255));
        txtSdtnccSua.setForeground(new java.awt.Color(0, 0, 0));
        txtSdtnccSua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số ĐT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        luunccSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        luunccSua.setText("Lưu mới");
        luunccSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luunccSuaActionPerformed(evt);
            }
        });

        huynccSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        huynccSua.setText("Hủy");
        huynccSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huynccSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtManccSua, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(txtTennccSua)
                            .addComponent(txtDiachinccSua)
                            .addComponent(txtSdtnccSua)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(luunccSua)
                        .addGap(18, 18, 18)
                        .addComponent(huynccSua)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(txtManccSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTennccSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiachinccSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSdtnccSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luunccSua)
                    .addComponent(huynccSua))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkSuaNCC = false;

    public boolean getCheckSuaNCC() {
        return checkSuaNCC;
    }
    
    private void txtTennccSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTennccSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTennccSuaActionPerformed

    private void luunccSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luunccSuaActionPerformed
        NhaCungCap_BUS nhaccBUS = new NhaCungCap_BUS();
        checkSuaNCC = nhaccBUS.suaNhacc(txtManccSua.getText(), txtTennccSua.getText(), txtDiachinccSua.getText(), txtSdtnccSua.getText());
        if (checkSuaNCC) {
            this.dispose();
        }
    }//GEN-LAST:event_luunccSuaActionPerformed

    private void huynccSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huynccSuaActionPerformed
        this.dispose();
    }//GEN-LAST:event_huynccSuaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton huynccSua;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JButton luunccSua;
    private javax.swing.JTextField txtDiachinccSua;
    private javax.swing.JTextField txtManccSua;
    private javax.swing.JTextField txtSdtnccSua;
    private javax.swing.JTextField txtTennccSua;
    // End of variables declaration//GEN-END:variables
}
