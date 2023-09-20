
package jpanel.jDialogXuatHoaDon.GiamGia;

import Main.MyDialog;
import QuanLyBanHang.BUS.giamgiaBUS;
import QuanLyBanHang.DTO.giamgia;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class jdialogKhuyenMai extends javax.swing.JDialog {

    public jdialogKhuyenMai(double tongTien) {
        this.tongTien = tongTien;
        initComponents();
        dtmKhuyenMai= (DefaultTableModel) tableKhuyenMai.getModel();
        hienthiTableKhuyenMai();
        
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
    }

    private DefaultTableModel dtmKhuyenMai;
    
    private giamgiaBUS giamgiaBUS= new giamgiaBUS();
    private giamgia khuyenMaiChon;
    private double tongTien = 0;
    
    public giamgia getKhuyenMaiChon() {
        return khuyenMaiChon;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel30 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jtablekm = new javax.swing.JScrollPane();
        tableKhuyenMai = new javax.swing.JTable();
        chonKmButton = new javax.swing.JButton();
        huyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel33.setText("Từ khóa tìm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tableKhuyenMai.setBackground(new java.awt.Color(255, 255, 255));
        tableKhuyenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableKhuyenMai.setForeground(new java.awt.Color(0, 0, 0));
        tableKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Chương trình", "%KM", "Điều kiện", "Ngày BĐ", "Ngày KT", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKhuyenMai.setRowHeight(30);
        tableKhuyenMai.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tableKhuyenMai.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableKhuyenMai.setShowHorizontalLines(true);
        tableKhuyenMai.setShowVerticalLines(true);
        tableKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKhuyenMaiMouseClicked(evt);
            }
        });
        jtablekm.setViewportView(tableKhuyenMai);
        if (tableKhuyenMai.getColumnModel().getColumnCount() > 0) {
            tableKhuyenMai.getColumnModel().getColumn(0).setMaxWidth(40);
            tableKhuyenMai.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        chonKmButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        chonKmButton.setText("Chọn");
        chonKmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonKmButtonActionPerformed(evt);
            }
        });

        huyButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        huyButton.setText("Hủy");
        huyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtablekm)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(chonKmButton)
                .addGap(126, 126, 126)
                .addComponent(huyButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jtablekm, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chonKmButton)
                    .addComponent(huyButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_huyButtonActionPerformed

    private void chonKmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonKmButtonActionPerformed
        int row = tableKhuyenMai.getSelectedRow();
        if (row < 0) {
            new MyDialog("Ủa chưa chọn kìa!", MyDialog.ERROR_DIALOG);
            return;
        }
        int magiam = Integer.parseInt(tableKhuyenMai.getValueAt(row, 0).toString());
        String tengiam = tableKhuyenMai.getValueAt(row, 1).toString();
        int phantramgiam = Integer.parseInt(tableKhuyenMai.getValueAt(row, 2).toString());
        int dieukien = Integer.parseInt(tableKhuyenMai.getValueAt(row, 3).toString().replace(",", "").replace(">", ""));
        String ngaybd = tableKhuyenMai.getValueAt(row, 4).toString();
        String ngaykt = tableKhuyenMai.getValueAt(row, 5).toString();
        
        Date ngaybd1= null;
        Date ngaykt1= null;
        try {
            ngaybd1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngaybd);
            ngaykt1= new SimpleDateFormat("dd/MM/yyyy").parse(ngaykt);
        } catch (ParseException ex) {
            
        }
        
        khuyenMaiChon = new giamgia(magiam, tengiam, phantramgiam, dieukien, ngaybd1, ngaykt1);
        
        this.dispose();
    }//GEN-LAST:event_chonKmButtonActionPerformed

    private void tableKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKhuyenMaiMouseClicked
        xuLyChonMaGiam();
    }//GEN-LAST:event_tableKhuyenMaiMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        ArrayList<giamgia> dsgg = giamgiaBUS.timgiamgia(txtTimKiem.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat dcf = new DecimalFormat(">###,###");
        dtmKhuyenMai.setRowCount(0);
        for (giamgia gg: dsgg) {
            Vector vec = new Vector();
            vec.add(gg.getMagiam());
            vec.add(gg.getTengiamgia());
           
            vec.add(gg.getPhantramgiam());
             vec.add(dcf.format(gg.getDieukien()));
            vec.add(sdf.format(gg.getNgaybatdau()));
            vec.add(sdf.format(gg.getNgayketthuc()));
            Date now = new Date();
            if (gg.getNgaybatdau().before(now) && gg.getNgayketthuc().after(now)) {
                vec.add("Có hiệu lực");
            } else {
                vec.add("Không hiệu lực");
            }
          
             dtmKhuyenMai.addRow(vec);
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

     private void hienthiTableKhuyenMai(){
        dtmKhuyenMai.setRowCount(0);
        giamgiaBUS.docDanhSach();
        ArrayList<giamgia> dskm= giamgiaBUS.getDanhSachGiamGia();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat dcf = new DecimalFormat(">###,###");
        for (giamgia gg : dskm) {
            Vector vec = new Vector();
            vec.add(gg.getMagiam());
            vec.add(gg.getTengiamgia());
            vec.add(gg.getPhantramgiam());
            vec.add(dcf.format(gg.getDieukien()));
            vec.add(sdf.format(gg.getNgaybatdau()));
            vec.add(sdf.format(gg.getNgayketthuc()));
                
            Date now = new Date();
            if (gg.getNgaybatdau().before(now) && gg.getNgayketthuc().after(now)) {
                vec.add("Có hiệu lực");
            } else {
                vec.add("Không hiệu lực");
            }
            
            dtmKhuyenMai.addRow(vec);
        }
       
        
    }
    
    private void xuLyChonMaGiam() {
        int row = tableKhuyenMai.getSelectedRow();
        if (row > -1) {
            try {
                if (tableKhuyenMai.getValueAt(row, 6).equals("Không hiệu lực")) {
                    new MyDialog("Mã này đã hết hiệu lực!", MyDialog.ERROR_DIALOG);
                    hienthiTableKhuyenMai();
                    return;
                }
                int ma = Integer.parseInt(tableKhuyenMai.getValueAt(row, 0) + "");
                String ten = tableKhuyenMai.getValueAt(row, 1) + "";
                int phanTram = Integer.parseInt(tableKhuyenMai.getValueAt(row, 2) + "");
                String dieuKienst = tableKhuyenMai.getValueAt(row, 3) + "";
                dieuKienst = dieuKienst.replace(">", "");
                dieuKienst = dieuKienst.replace(",", "");
                int dieuKien = Integer.parseInt(dieuKienst);

                if(dieuKien > tongTien) {
                    new MyDialog("Không đủ điều kiện áp dụng mã giảm này!", MyDialog.ERROR_DIALOG);
                    return;
                }
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                Date ngayBD = sdf.parse(tableKhuyenMai.getValueAt(row, 4) + "");
                Date ngayKT = sdf.parse(tableKhuyenMai.getValueAt(row, 5) + "");

                khuyenMaiChon = new giamgia();
                khuyenMaiChon.setMagiam(ma);
                khuyenMaiChon.setTengiamgia(ten);
                khuyenMaiChon.setPhantramgiam(phanTram);
                khuyenMaiChon.setDieukien(dieuKien);
                khuyenMaiChon.setNgaybatdau(ngayBD);
                khuyenMaiChon.setNgayketthuc(ngayKT);
            } catch (ParseException ex) {
            }
        }
//        xuLyThoat();
    }
    
    private void xuLyThoat() {
        dispose();
    }
    
   
    
//    private void timkiemKhuyeMai(){
//        dtmKhuyenMai.setRowCount(0);
//        ArrayList<giamgia> dskm = giamgiaBUS.;
//        for (giamgia km : dskm) {
//            Vector vec = new Vector();
//            vec.add(kh.getMakhachhang());
//            vec.add(kh.getHoten());
//            vec.add(kh.getGioitinh());
//            vec.add(kh.getSodienthoai());
//            vec.add(kh.getGhichu());
//            
//            dtmkhachhang.addRow(vec);
//        }
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chonKmButton;
    private javax.swing.JButton huyButton;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JScrollPane jtablekm;
    private javax.swing.JTable tableKhuyenMai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
