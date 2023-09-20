/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.jDialogXuatHoaDon;

import Main.MyDialog;
import QuanLyBanHang.BUS.CtHoaDon_BUS;
import QuanLyBanHang.BUS.HoaDon_BUS;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import jpanel.jDialogXuatHoaDon.GiamGia.jdialogKhuyenMai;
import jpanel.jDialogXuatHoaDon.KhachHang.jdialogKhachHang;
import jpanel.jpanelBanHang;


public class jdialogChiTietHoaDon1 extends javax.swing.JDialog {

    public jdialogChiTietHoaDon1() {
//        checkhoadon = false;
        initComponents();
        
        Image icon = Toolkit.getDefaultToolkit().getImage("src/img/mau-logo-shop-quan-ao-7.jpg");
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
    }

    private ArrayList<Vector> dsGioHang;
    private double tongTien;
    private String nhanVien;
    public static boolean checkhoadon= false;
    private HoaDon_BUS hoadonBUS= new HoaDon_BUS();
    private CtHoaDon_BUS ctHoaDonBUS= new CtHoaDon_BUS();
    private jdialogKhuyenMai khuyenMaij;
    private jdialogKhachHang jdialogKhachHang;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private LocalDateTime now = LocalDateTime.now();
    private DecimalFormat dcf = new DecimalFormat("###,### VND");

    public jdialogChiTietHoaDon1(ArrayList<Vector> dsGioHang, double tongTien, String nhanVien) {
        this();
        this.dsGioHang = dsGioHang;
        this.tongTien = tongTien;
        this.nhanVien = nhanVien;
        
        DecimalFormat dcf = new DecimalFormat("###,###");
        txtTongtien.setText(dcf.format(tongTien));
    }
    
    private void xuLyHienThiHoaDon() {
        txtHoaDon.setContentType("text/html");
        
        String hd = "<style> "
                + "table {"
                + "border: 1px solid;"
                + "border-bottom: none"
                + "}"
                + "tr {"
                + "border-bottom: 1px solid;"
                + "}"
                + "td {"
                + "padding: 8px;"
                + "} "
                + "th {"
                + "font-size:16pt"
                + "}"
                + "</style>";
        hd += "<h1 style='text-align:center;'>HOÁ ĐƠN THANH TOÁN</h1>";
        hd += "Nhân viên: " + nhanVien + "<br/>";
        hd += "Ngày lập: " + dtf.format(now) + "<br/>";
        hd += "Khách hàng: " + txtKhachHang.getText() + "<br/>";
        hd += "<div style='text-align:center;'>==========================================</div><br/>";
        hd += "<div style='text-align:center'>";
        hd += "<table style='max-width:100%'>";
        hd += "<tr>"
                + "<th>Mã SP</th>"
                + "<th>Tên SP</th>"
                + "<th>Số lượng</th>"
                + "<th>Đơn giá</th>"
                + "<th>Thành tiền</th>"
                + "</tr>";
        for (Vector vec : dsGioHang) {
            hd += "<tr>";
            hd += "<td style='text-align:center;'>" + vec.get(0) + "</td>";
            hd += "<td style='text-align:left;'>" + vec.get(1) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(2) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(3) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(4) + "</td>";
            hd += "</tr>";
        }
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Tổng cộng</td>";
        hd += "<td style='text-align:center;'>" + dcf.format(tongTien) + "</td>";
        hd += "</tr>";
        if (khuyenMaij.getKhuyenMaiChon() != null) {
            // lấy phần trăm giảm
            int phantram = khuyenMaij.getKhuyenMaiChon().getPhantramgiam();
            if (tongTien >= khuyenMaij.getKhuyenMaiChon().getDieukien()) {
                tongTien = tongTien - (tongTien * phantram / 100);
            } else {
                new MyDialog("Không đủ điều kiện nhận ưu đãi!", MyDialog.ERROR_DIALOG);
                chonGiamGiaButton.setEnabled(true);
                return;
            }
        }
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Khuyến mãi</td>";
        hd += "<td style='text-align:center;'>" + khuyenMaij.getKhuyenMaiChon().getPhantramgiam() + "%" + "</td>";
        hd += "</tr>";
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Thành tiền</td>";
        hd += "<td style='text-align:center;'>" + dcf.format(tongTien) + "</td>";
        hd += "</tr>";
        hd += "</table>";
        hd += "</div>";
        hd += "<div style='text-align:center;'>==========================================</div><br/>";
        txtHoaDon.setText(hd);
        txtTongtien.setText(dcf.format(tongTien));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JTextField();
        chonKhachButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        chonGiamGiaButton = new javax.swing.JButton();
        txtGhichu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtHoaDon = new javax.swing.JEditorPane();
        thanhToanButton = new javax.swing.JButton();
        inhoadonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Chi tiết hóa đơn");
        jPanel1.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Khách hàng");

        txtKhachHang.setEditable(false);
        txtKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        txtKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chonKhachButton.setText("...");
        chonKhachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonKhachButtonActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("Tổng tiền");

        txtTongtien.setEditable(false);
        txtTongtien.setBackground(new java.awt.Color(204, 204, 204));
        txtTongtien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel31.setText("Mã giảm");

        txtGiamGia.setEditable(false);
        txtGiamGia.setBackground(new java.awt.Color(204, 204, 204));
        txtGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chonGiamGiaButton.setText("...");
        chonGiamGiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonGiamGiaButtonActionPerformed(evt);
            }
        });

        txtGhichu.setBackground(new java.awt.Color(255, 255, 255));
        txtGhichu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGhichu.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Ghi chú");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGhichu)
                    .addComponent(txtKhachHang)
                    .addComponent(txtTongtien)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chonKhachButton)
                    .addComponent(chonGiamGiaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chonKhachButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chonGiamGiaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        jScrollPane5.setViewportView(txtHoaDon);

        thanhToanButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        thanhToanButton.setText("Thanh toán");
        thanhToanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhToanButtonActionPerformed(evt);
            }
        });

        inhoadonButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        inhoadonButton.setText("In hóa đơn");
        inhoadonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inhoadonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(thanhToanButton)
                .addGap(42, 42, 42)
                .addComponent(inhoadonButton)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thanhToanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(inhoadonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chonKhachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonKhachButtonActionPerformed
        jdialogKhachHang = new jdialogKhachHang();
        jdialogKhachHang.setVisible(true);
        
        if(jdialogKhachHang.getKhachHangChon()!=null){
            txtKhachHang.setText(jdialogKhachHang.getKhachHangChon().getHoten()+ " - "+ jdialogKhachHang.getKhachHangChon().getSodienthoai());
        }else {
            txtKhachHang.setText("");
        }
         
    }//GEN-LAST:event_chonKhachButtonActionPerformed

    private void chonGiamGiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonGiamGiaButtonActionPerformed
        khuyenMaij= new jdialogKhuyenMai(tongTien);
        khuyenMaij.setVisible(true);
        
        if(khuyenMaij.getKhuyenMaiChon()!=null){
            txtGiamGia.setText(khuyenMaij.getKhuyenMaiChon().getPhantramgiam()+ "%");
        }else{
            txtGiamGia.setText("");
        }
    }//GEN-LAST:event_chonGiamGiaButtonActionPerformed

    private void inhoadonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inhoadonButtonActionPerformed
       try {
            if (!txtHoaDon.getText().equals("")) {
                txtHoaDon.print();
                this.dispose();
            }
        } catch (PrinterException ex) {
        }
    }//GEN-LAST:event_inhoadonButtonActionPerformed

    private void thanhToanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhToanButtonActionPerformed
        checkhoadon = false;
        if (txtKhachHang.getText().equals("")) {
            new MyDialog("Xin chọn khách hàng", MyDialog.ERROR_DIALOG);
            return;
        }
        if (txtGiamGia.getText().equals("")) {
            new MyDialog("Xin chọn mã giảm", MyDialog.ERROR_DIALOG);
            return;
        }
        xuLyHienThiHoaDon();
        inhoadonButton.setEnabled(true);

        hoadonBUS.luuHoaDon(jdialogKhachHang.getKhachHangChon().getMakhachhang(), nhanVien, khuyenMaij.getKhuyenMaiChon().getMagiam(),dtf1.format(now), txtGhichu.getText());

        for (Vector vec : dsGioHang) {
            int maSP = Integer.parseInt(vec.get(0).toString());
            int slmua = Integer.parseInt(vec.get(2).toString());
            String giasp = vec.get(3).toString();
            String thanhTien = vec.get(4) + "";
            ctHoaDonBUS.addCTHoaDon(maSP, giasp, slmua);
        }
        thanhToanButton.setEnabled(false);
        chonGiamGiaButton.setEnabled(false);
        chonKhachButton.setEnabled(false);
        checkhoadon = true;
    }//GEN-LAST:event_thanhToanButtonActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chonGiamGiaButton;
    private javax.swing.JButton chonKhachButton;
    private javax.swing.JButton inhoadonButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton thanhToanButton;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JEditorPane txtHoaDon;
    private javax.swing.JTextField txtKhachHang;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
