
package jpanel.jDialogXuatHoaDon.KhachHang;

import QuanLyBanHang.BUS.KhachHangBUS;
import QuanLyBanHang.DTO.KhachHang;
import Main.MyDialog;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class jdialogKhachHang extends javax.swing.JDialog {

   
    public jdialogKhachHang() {
        
        initComponents();
        dtmkhachhang = (DefaultTableModel) tabKhachHang.getModel();
        hienthidanhsachKhachHang();
        
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
    }

    private KhachHangBUS khachhangBUS = new KhachHangBUS();
    private KhachHang khachhangchon = null;
    private DefaultTableModel dtmkhachhang;
    
    public KhachHang getKhachHangChon() {
        return khachhangchon;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabKhachHang = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        chonButton = new javax.swing.JButton();
        themKhachButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel32.setText("Từ khóa tìm ");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tabKhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Họ Tên", "Giới tính", "Số ĐT", "Ghi chú"
            }
        ));
        tabKhachHang.setRowHeight(30);
        tabKhachHang.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tabKhachHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(tabKhachHang);
        if (tabKhachHang.getColumnModel().getColumnCount() > 0) {
            tabKhachHang.getColumnModel().getColumn(0).setMaxWidth(40);
            tabKhachHang.getColumnModel().getColumn(1).setMaxWidth(350);
            tabKhachHang.getColumnModel().getColumn(2).setMaxWidth(40);
            tabKhachHang.getColumnModel().getColumn(3).setMaxWidth(200);
            tabKhachHang.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        chonButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        chonButton.setText("Chọn");
        chonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonButtonActionPerformed(evt);
            }
        });

        themKhachButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        themKhachButton.setText("Thêm khách");
        themKhachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKhachButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setText("Huỷ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(chonButton)
                .addGap(12, 12, 12)
                .addComponent(themKhachButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themKhachButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themKhachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKhachButtonActionPerformed
        jdialogThemKhach themKhachJdialog= new jdialogThemKhach();
        themKhachJdialog.setVisible(true);
        if(themKhachJdialog.getCheckThemKhach()){
            hienthidanhsachKhachHang();
        }
    }//GEN-LAST:event_themKhachButtonActionPerformed

    private void chonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonButtonActionPerformed
        chonKhach();
    }//GEN-LAST:event_chonButtonActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        timkiemKhach(txtTimKiem.getText());
        
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void hienthidanhsachKhachHang() {
        dtmkhachhang.setRowCount(0);
        khachhangBUS.docDanhSach();
        ArrayList<KhachHang> dsncc = khachhangBUS.getListKhachHang();

        if (dsncc != null) {
            for (KhachHang ncc : dsncc) {
                Vector vec = new Vector();
                vec.add(ncc.getMakhachhang());
                vec.add(ncc.getHoten());
                vec.add(ncc.getGioitinh());
                vec.add(ncc.getSodienthoai());
                vec.add(ncc.getGhichu());
                dtmkhachhang.addRow(vec);
            }
        }
    }

    private void timkiemKhach(String tukhoa){
        dtmkhachhang.setRowCount(0);
        ArrayList<KhachHang> dskh = khachhangBUS.timKiemKhachHang(tukhoa);
        for (KhachHang kh : dskh) {
            Vector vec = new Vector();
            vec.add(kh.getMakhachhang());
            vec.add(kh.getHoten());
            vec.add(kh.getGioitinh());
            vec.add(kh.getSodienthoai());
            vec.add(kh.getGhichu());
            
            dtmkhachhang.addRow(vec);
        }
    }
    private void chonKhach(){                                          
        int row = tabKhachHang.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn khách hàng kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        int makhach = Integer.parseInt(tabKhachHang.getValueAt(row, 0).toString());
        String hoten = tabKhachHang.getValueAt(row, 1).toString();
        String gioitinh = tabKhachHang.getValueAt(row, 2).toString();
        String sdt= tabKhachHang.getValueAt(row, 3).toString();
        String ghichu = tabKhachHang.getValueAt(row, 4).toString();
        
        khachhangchon = new KhachHang(makhach, hoten, gioitinh, sdt, ghichu);
        this.dispose();
    }           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chonButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabKhachHang;
    private javax.swing.JButton themKhachButton;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

