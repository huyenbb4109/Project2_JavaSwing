/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogQuanLyNhomSp;

import QuanLyBanHang.BUS.Nhomsp_BUS;
import QuanLyBanHang.DTO.NhomSP;

/**
 *
 * @author huynn
 */
public class jDialogSuaNhomSp extends javax.swing.JDialog {

    /**
     * Creates new form jDialogSuaNhomSp
     */
    public jDialogSuaNhomSp(NhomSP nhomsp) {
        checkSuaNhomSp= false;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
        
        jTextSuaMaNhomSp.setText(nhomsp.getIdnhomsp()+ "");
        jTextSuaTenNhomSp.setText(nhomsp.getTennhomsp());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextSuaTenNhomSp = new javax.swing.JTextField();
        jTextSuaMaNhomSp = new javax.swing.JTextField();
        jButtonDongYSua = new javax.swing.JButton();
        jButtonHuySua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel17.setText("Sửa nhóm sản phẩm");
        jPanel19.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setText("Mã nhóm SP");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setText("Tên nhóm SP");

        jTextSuaTenNhomSp.setForeground(new java.awt.Color(0, 0, 0));

        jTextSuaMaNhomSp.setEditable(false);
        jTextSuaMaNhomSp.setBackground(new java.awt.Color(153, 153, 153));
        jTextSuaMaNhomSp.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextSuaTenNhomSp, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jTextSuaMaNhomSp))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextSuaMaNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextSuaTenNhomSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonDongYSua.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButtonDongYSua.setText("Sửa");
        jButtonDongYSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDongYSuaActionPerformed(evt);
            }
        });

        jButtonHuySua.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jButtonHuySua.setText("Hủy");
        jButtonHuySua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuySuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDongYSua)
                .addGap(86, 86, 86)
                .addComponent(jButtonHuySua)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDongYSua)
                    .addComponent(jButtonHuySua))
                .addGap(0, 91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkSuaNhomSp = false;

    public boolean getCheckSuaNhomSp() {
        return checkSuaNhomSp;
    }
    
    private void jButtonHuySuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuySuaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonHuySuaActionPerformed

    private void jButtonDongYSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDongYSuaActionPerformed
        Nhomsp_BUS nhomspBUS = new Nhomsp_BUS();
        checkSuaNhomSp = nhomspBUS.suaNhomsp(jTextSuaMaNhomSp.getText(), jTextSuaTenNhomSp.getText());
        if (checkSuaNhomSp) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonDongYSuaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDongYSua;
    private javax.swing.JButton jButtonHuySua;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JTextField jTextSuaMaNhomSp;
    private javax.swing.JTextField jTextSuaTenNhomSp;
    // End of variables declaration//GEN-END:variables
}
