/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogQuanLyNhomSp;

import QuanLyBanHang.BUS.Nhomsp_BUS;

/**
 *
 * @author huynn
 */
public class jDialogThemNhomSp extends javax.swing.JDialog {

    /**
     * Creates new form jDialogThemNhomSp
     */
    public jDialogThemNhomSp() {
        checkThemNhomSp = false;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextThemTenNhomSp = new javax.swing.JTextField();
        jTextThemMaNhomSp = new javax.swing.JTextField();
        jButtonDongYThemNhomSp = new javax.swing.JButton();
        jButtonHuyThemNhomSp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel8.setText("Thêm nhóm sản phẩm");
        jPanel17.add(jLabel8);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setText("Mã nhóm SP");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setText("Tên nhóm SP");

        jTextThemTenNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextThemTenNhomSpActionPerformed(evt);
            }
        });

        jTextThemMaNhomSp.setEditable(false);
        jTextThemMaNhomSp.setBackground(new java.awt.Color(204, 204, 204));
        jTextThemMaNhomSp.setForeground(new java.awt.Color(204, 204, 204));
        jTextThemMaNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextThemMaNhomSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextThemTenNhomSp)
                    .addComponent(jTextThemMaNhomSp))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextThemMaNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextThemTenNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonDongYThemNhomSp.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButtonDongYThemNhomSp.setText("Thêm");
        jButtonDongYThemNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDongYThemNhomSpActionPerformed(evt);
            }
        });

        jButtonHuyThemNhomSp.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButtonHuyThemNhomSp.setText("Hủy");
        jButtonHuyThemNhomSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyThemNhomSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jButtonDongYThemNhomSp)
                .addGap(62, 62, 62)
                .addComponent(jButtonHuyThemNhomSp)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDongYThemNhomSp)
                    .addComponent(jButtonHuyThemNhomSp))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkThemNhomSp = false;

    public boolean getCheckThemNsp() {
        return checkThemNhomSp;
    }
    
    private void jButtonHuyThemNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyThemNhomSpActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonHuyThemNhomSpActionPerformed

    private void jButtonDongYThemNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDongYThemNhomSpActionPerformed
        Nhomsp_BUS nhomspBUS= new Nhomsp_BUS();
        checkThemNhomSp = nhomspBUS.themNhomsp(jTextThemTenNhomSp.getText());
        
        if (checkThemNhomSp==true) {           
            this.dispose();
            
        }else{
            jTextThemTenNhomSp.requestFocus();
        }
    }//GEN-LAST:event_jButtonDongYThemNhomSpActionPerformed

    private void jTextThemMaNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextThemMaNhomSpActionPerformed
//        jTextThemTenNhomSp.requestFocus();
    }//GEN-LAST:event_jTextThemMaNhomSpActionPerformed

    private void jTextThemTenNhomSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextThemTenNhomSpActionPerformed
        jTextThemTenNhomSp.requestFocus();
    }//GEN-LAST:event_jTextThemTenNhomSpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDongYThemNhomSp;
    private javax.swing.JButton jButtonHuyThemNhomSp;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JTextField jTextThemMaNhomSp;
    private javax.swing.JTextField jTextThemTenNhomSp;
    // End of variables declaration//GEN-END:variables
}
