package jpanel.xuatphieunhap;


import Main.MyDialog;
import QuanLyBanHang.BUS.CtPhieuNhap_BUS;
import QuanLyBanHang.BUS.PhieuNhap_BUS;
import QuanLyBanHang.BUS.Sp_BUS;
import QuanLyBanHang.DTO.SP;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;

public class JpanelXuatPhieuNhap extends javax.swing.JDialog {

    public JpanelXuatPhieuNhap() {
        checkNhap= false;
        initComponents();
//        txtChiTiet.setEditable(false);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("src/img/mau-logo-shop-quan-ao-7.jpg");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        
    }
    
    private ArrayList<Vector> dsGioHang;
    private double tongTien;
    public static boolean checkNhap = false;
    private String nhaCungCap;
    private String nhanVien;
    private String ghichu;
    
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private LocalDateTime now = LocalDateTime.now();
    private DecimalFormat dcf = new DecimalFormat("###,### VND");

    public JpanelXuatPhieuNhap(String nhaCungCap, String nhanVien, String ghichu, double tongtien, ArrayList<Vector> dsGioHang) {
       
        this();
        this.nhaCungCap = nhaCungCap;
        this.nhanVien = nhanVien;
        this.ghichu= ghichu;
        this.tongTien= tongtien;
        this.dsGioHang= dsGioHang;
    
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtChiTiet = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnXacNhan = new javax.swing.JButton();
        btnInPhieu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtChiTiet.setEditable(false);
        jScrollPane1.setViewportView(txtChiTiet);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thông tin phiếu nhập");
        jPanel1.add(jLabel1);

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setPreferredSize(new java.awt.Dimension(145, 40));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel2.add(btnXacNhan);

        btnInPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInPhieu.setText("In phiếu nhập");
        btnInPhieu.setPreferredSize(new java.awt.Dimension(145, 40));
        btnInPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPhieuActionPerformed(evt);
            }
        });
        jPanel2.add(btnInPhieu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        checkNhap = true;
        btnXacNhan.setEnabled(false);
        btnInPhieu.setEnabled(true);

        Sp_BUS sanPhamBUS = new Sp_BUS();
        PhieuNhap_BUS phieuNhapBUS = new PhieuNhap_BUS();
        
        ArrayList<SP> dssp = sanPhamBUS.getDssp();

        txtChiTiet.setContentType("text/html");
        

        // Lưu Phiếu nhập trước để xíu lấy cái mã
        phieuNhapBUS.themPhieuNhap(nhaCungCap, nhanVien,dtf.format(now), ghichu);
        
        int maPN = phieuNhapBUS.getMaPnCuoiCung();
        CtPhieuNhap_BUS ctPhieuNhapBUS = new CtPhieuNhap_BUS();

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
        hd += "<h1 style='text-align:center;'>CHI TIẾT PHIẾU NHẬP</h1>";
        hd += "Nhân viên: " + nhanVien + "<br/>";
        hd += "Ngày lập: " + dtf.format(now) + "<br/>";
        hd += "Nhà cung cấp: " + nhaCungCap + "<br/>";
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
                
//            ctpn.setMaphieunhap(maPN);
            hd += "<tr>";
            hd += "<td style='text-align:center;'>" + vec.get(0)+ "</td>";
            hd += "<td style='text-align:left;'>" + vec.get(1)+ "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(2)+ "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(3)+ "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(4) + "</td>";
            hd += "</tr>";

            //===================================================
            //===================LƯU CTPN VÀO DB=================
            //===================================================
            
//            ctPhieuNhapBUS.luuCTPhieuNhap(ctpn.getMaphieunhap(), ctpn.getMasp(), ctpn.getGianhap(), ctpn.getSlnhap());
            ctPhieuNhapBUS.themCTPhieuNhap(vec.get(0).toString(), vec.get(3).toString(), vec.get(2).toString());
           
        }
        
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
        hd += "Ghi chú: " + ghichu + "<br/>";

        txtChiTiet.setText(hd);
        
        new MyDialog("Xác nhận thành công!", MyDialog.SUCCESS_DIALOG);
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnInPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPhieuActionPerformed
        try {
            txtChiTiet.print();
        } catch (PrinterException e) {
        }
        this.dispose();
    }//GEN-LAST:event_btnInPhieuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInPhieu;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane txtChiTiet;
    // End of variables declaration//GEN-END:variables
}
