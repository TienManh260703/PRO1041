/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author manhnt
 */
public class ViewHome extends javax.swing.JFrame {

    private static int index = 1;

    public ViewHome() {
        initComponents();
        init();
    }

    private void init() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMTenNV = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBanHang = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        pnlKhuyenMai = new javax.swing.JPanel();
        lblPhieuGiamGia = new javax.swing.JLabel();
        lblDotGiamGia = new javax.swing.JLabel();
        lblKhuyenMai = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        khachHang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nhanVien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        phieuGiamGia = new javax.swing.JPanel();
        banHang = new javax.swing.JPanel();
        hoaDon = new javax.swing.JPanel();
        sanPham = new javax.swing.JPanel();
        dotGiamGia = new javax.swing.JPanel();
        thongKe = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anhThuMuc.jpg"))); // NOI18N
        lblImg.setText("Ảnh");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Xin chào");

        lblMTenNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMTenNV.setText("Tên Nhân Viên");

        lblBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setText("Bán Hàng");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
        });

        lblHoaDon.setBackground(new java.awt.Color(0, 204, 255));
        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setText("Hóa Đơn");
        lblHoaDon.setOpaque(true);
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });

        pnlKhuyenMai.setBackground(new java.awt.Color(153, 255, 255));

        lblPhieuGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhieuGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblPhieuGiamGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhieuGiamGia.setText("Phiếu Giảm Giá");
        lblPhieuGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPhieuGiamGiaMouseClicked(evt);
            }
        });

        lblDotGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDotGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblDotGiamGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDotGiamGia.setText("Đợt Giảm Giá");
        lblDotGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDotGiamGiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlKhuyenMaiLayout = new javax.swing.GroupLayout(pnlKhuyenMai);
        pnlKhuyenMai.setLayout(pnlKhuyenMaiLayout);
        pnlKhuyenMaiLayout.setHorizontalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDotGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhieuGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKhuyenMaiLayout.setVerticalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDotGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhieuGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        lblKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhuyenMai.setText("Khuyến Mại");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
        });

        pnlBottom.setBackground(new java.awt.Color(51, 204, 255));

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống Kê");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setText("Khách Hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
        });

        lblDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("Đăng Xuất");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(pnlKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMTenNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page.setBackground(new java.awt.Color(204, 204, 204));
        page.setLayout(new java.awt.CardLayout());

        jLabel2.setText("Khách Hang");

        javax.swing.GroupLayout khachHangLayout = new javax.swing.GroupLayout(khachHang);
        khachHang.setLayout(khachHangLayout);
        khachHangLayout.setHorizontalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
        );
        khachHangLayout.setVerticalGroup(
            khachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachHangLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addContainerGap(616, Short.MAX_VALUE))
        );

        page.add(khachHang, "card2");

        jLabel3.setText("Nhân Viên");

        javax.swing.GroupLayout nhanVienLayout = new javax.swing.GroupLayout(nhanVien);
        nhanVien.setLayout(nhanVienLayout);
        nhanVienLayout.setHorizontalGroup(
            nhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanVienLayout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        nhanVienLayout.setVerticalGroup(
            nhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanVienLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel3)
                .addContainerGap(610, Short.MAX_VALUE))
        );

        page.add(nhanVien, "card3");

        javax.swing.GroupLayout phieuGiamGiaLayout = new javax.swing.GroupLayout(phieuGiamGia);
        phieuGiamGia.setLayout(phieuGiamGiaLayout);
        phieuGiamGiaLayout.setHorizontalGroup(
            phieuGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        phieuGiamGiaLayout.setVerticalGroup(
            phieuGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(phieuGiamGia, "card4");

        javax.swing.GroupLayout banHangLayout = new javax.swing.GroupLayout(banHang);
        banHang.setLayout(banHangLayout);
        banHangLayout.setHorizontalGroup(
            banHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        banHangLayout.setVerticalGroup(
            banHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(banHang, "card5");

        javax.swing.GroupLayout hoaDonLayout = new javax.swing.GroupLayout(hoaDon);
        hoaDon.setLayout(hoaDonLayout);
        hoaDonLayout.setHorizontalGroup(
            hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        hoaDonLayout.setVerticalGroup(
            hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(hoaDon, "card6");

        javax.swing.GroupLayout sanPhamLayout = new javax.swing.GroupLayout(sanPham);
        sanPham.setLayout(sanPhamLayout);
        sanPhamLayout.setHorizontalGroup(
            sanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        sanPhamLayout.setVerticalGroup(
            sanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(sanPham, "card7");

        javax.swing.GroupLayout dotGiamGiaLayout = new javax.swing.GroupLayout(dotGiamGia);
        dotGiamGia.setLayout(dotGiamGiaLayout);
        dotGiamGiaLayout.setHorizontalGroup(
            dotGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        dotGiamGiaLayout.setVerticalGroup(
            dotGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(dotGiamGia, "card8");

        javax.swing.GroupLayout thongKeLayout = new javax.swing.GroupLayout(thongKe);
        thongKe.setLayout(thongKeLayout);
        thongKeLayout.setHorizontalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        thongKeLayout.setVerticalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        page.add(thongKe, "card9");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        if (index == 1) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i <= 89; i++) {
                        pnlKhuyenMai.setSize(277, i);
                        pnlBottom.setLocation(0, pnlKhuyenMai.getY() + pnlKhuyenMai.getHeight());
                        try {
                            Thread.sleep(2);
                        } catch (InterruptedException ex) {
                        }
                    }
                    index = 0;
                }
            }).start();

        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 89; i >= 0; i--) {
                        pnlKhuyenMai.setSize(277, i);
                        pnlBottom.setLocation(0, pnlKhuyenMai.getY() + pnlKhuyenMai.getHeight());

                        try {
                            Thread.sleep(2);
                        } catch (InterruptedException ex) {
                        }
                    }
                    index = 1;
                }
            }).start();
        }
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        lblBanHang.setBackground(Color.WHITE);
        lblBanHang.setForeground(Color.BLACK);
        lblBanHang.setOpaque(true);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        nhanVien.setVisible(true);
        
        khachHang.setVisible(false);
        sanPham.setVisible(false);
        banHang.setVisible(false);
        phieuGiamGia.setVisible(false);
        dotGiamGia.setVisible(false);
        thongKe.setVisible(false);
        hoaDon.setVisible(false);
        

    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblPhieuGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhieuGiamGiaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPhieuGiamGiaMouseClicked

    private void lblDotGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDotGiamGiaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDotGiamGiaMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        khachHang.setVisible(true);
        nhanVien.setVisible(false);
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSanPhamMouseClicked

    /**
     * 249
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banHang;
    private javax.swing.JPanel container;
    private javax.swing.JPanel dotGiamGia;
    private javax.swing.JPanel hoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel khachHang;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDotGiamGia;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblMTenNV;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblPhieuGiamGia;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel nhanVien;
    private javax.swing.JPanel page;
    private javax.swing.JPanel phieuGiamGia;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlKhuyenMai;
    private javax.swing.JPanel sanPham;
    private javax.swing.JPanel thongKe;
    // End of variables declaration//GEN-END:variables
}
