/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import ServicesInterface.IMauSacSerivces;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CheckTrungService;
import services.MauSacServices;
import utilities.ULHelper;
import viewmodel.MauSacView;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

/**
 *
 * @author ADMIN
 */
public class MauSac extends javax.swing.JFrame {

    private final IMauSacSerivces servicecs = new MauSacServices();
    List<MauSacView> lst = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    Date date = Date.valueOf(LocalDate.now());



    /**
     * Creates new form MauSac
     */
    public MauSac() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblmausac.getModel();
        filltable();
        showdetail(0);
    }
    
    public void filltable() {
        try {
            model.setRowCount(0);
            lst = servicecs.getList();
            for (MauSacView a : lst) {
                model.addRow(new Object[]{
                    a.getId(), a.getMa(), a.getTen()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showdetail(int index) {
        lbhienthiid.setText(lst.get(index).getId());
        txtma.setText(lst.get(index).getMa());
        txtten.setText(lst.get(index).getTen());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbhienthiid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmausac = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnxoaform = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("quản lý màu sắc");

        jLabel2.setText("ID");

        lbhienthiid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Mã");

        jLabel5.setText("Tên");

        txtma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaActionPerformed(evt);
            }
        });

        tblmausac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "mã", "tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmausac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmausacMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblmausac);

        btnthem.setText("thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnxoaform.setText("xóa form");
        btnxoaform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaformActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtma)
                            .addComponent(lbhienthiid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtten))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnxoaform))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnsua, btnthem, btnxoa, btnxoaform});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbhienthiid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(74, 74, 74)
                        .addComponent(btnxoaform)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel4, jLabel5, txtma, txtten});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnsua, btnthem, btnxoa, btnxoaform, lbhienthiid});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtma, "mã trống")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtma.getText(),
                        "mausac", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "mã trùng");
                    return;
                }
            }
            
            if (ULHelper.checknull(txtten, "tên trống")) {
                return;
            }
            
            MauSacView mau = new MauSacView(txtma.getText(), txtten.getText(), date , date ,0);
            int thongBao = servicecs.them(mau);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "thêm ok");
                filltable();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "thêm không ok");
                return;
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaformActionPerformed
        // TODO add your handling code here:
        try {
            lbhienthiid.setText("");
            txtma.setText("");
            txtten.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnxoaformActionPerformed

    private void tblmausacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmausacMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblmausac.getSelectedRow();
            showdetail(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblmausacMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtma, "mã trống")) {
                return;
            }
            if (ULHelper.checknull(txtten, "tên trống")) {
                return;
            }
            MauSacView mau = new MauSacView(txtma.getText(), txtten.getText(), date , date ,0);
            int thongBao = servicecs.sua(mau);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "sửa ok");
                filltable();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "sửa không ok");
                return;
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtma.getText();
            int thongBao = servicecs.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "xóa ok");
                filltable();
                showdetail(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "xóa không ok");
                return;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MauSac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoaform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbhienthiid;
    private javax.swing.JTable tblmausac;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
