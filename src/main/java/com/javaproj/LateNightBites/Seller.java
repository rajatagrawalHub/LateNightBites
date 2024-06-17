package com.javaproj.LateNightBites;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.awt.Color;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.table.DefaultTableModel;

public class Seller extends javax.swing.JFrame implements ActionListener {
    
   DatabaseReference mainDB;
   DatabaseReference dOrder;
    DefaultTableModel tableModel;

    public Seller() {
        initComponents();
        setVisible(true);
        mainDB = FirebaseDatabase.getInstance().getReference();
        dOrder = mainDB.child("Order");
        tableModel = new DefaultTableModel();
        jTable2.setModel(tableModel);
        tableModel.addColumn("Order ID");
        tableModel.addColumn("Status");
        tableModel.addColumn("Mobile Number");
        tableModel.addColumn("Amount");
        dOrder.addValueEventListener(new ValueEventListener() {
        public void onDataChange(DataSnapshot datasnapshot) {
            // Handle data change
            if(datasnapshot.exists()){
                for (DataSnapshot OrderSnapshot : datasnapshot.getChildren()) {
                    String OrderiD = OrderSnapshot.getKey();
                    String Status = OrderSnapshot.child("Status").getValue(String.class)  ;
                    Long Mobileno = OrderSnapshot.child("Mobile Number").getValue(Long.class) ;
                    Long Amount = OrderSnapshot.child("Amount").getValue(Long.class) ;
                    
                    Object[] rowdata = {OrderiD,Status,Mobileno,Amount};
                    tableModel.addRow(rowdata);
                }
            }
        }

        public void onCancelled(DatabaseError databaseError) {
            // Handle error
            System.out.println("Error: " + databaseError.getMessage());
        }
    });       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        TopBar = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(420, 500));

        jLayeredPane1.setBackground(new java.awt.Color(50, 50, 50));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(650, 500));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopBar.setBackground(new java.awt.Color(255, 0, 0));
        TopBar.setOpaque(true);

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 30));

        jLabel9.setBackground(new java.awt.Color(255, 239, 153));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 239, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LATE NIGHT BITES");
        jLabel9.setFocusable(false);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Orders");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jTable1.setBackground(new java.awt.Color(217, 217, 217));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 160));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Order ID");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 273, -1, 30));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField1.setToolTipText("Order iD");
        jLayeredPane1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Order Details");
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 265, -1, -1));

        jButton2.setBackground(new java.awt.Color(154, 118, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Order Details");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 142, 142), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, 30));

        jButton3.setBackground(new java.awt.Color(255, 138, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 138, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

        jTable2.setBackground(new java.awt.Color(217, 217, 217));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Status", "Mobile Number", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 160));

        jButton4.setBackground(new java.awt.Color(255, 142, 142));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Change Status");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 142, 142), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dOrder.addValueEventListener(new ValueEventListener() {
        public void onDataChange(DataSnapshot datasnapshot) {
            // Handle data change
            if(datasnapshot.exists()){
                for (DataSnapshot OrderSnapshot : datasnapshot.getChildren()) {
                    String OrderiD = OrderSnapshot.getKey();
                    if(OrderiD.equals(jFormattedTextField1.getText())){
                        String Status = OrderSnapshot.child("Status").getValue(String.class)  ;
                        Long Mobileno = OrderSnapshot.child("Mobile Number").getValue(Long.class) ;
                        Long Amount = OrderSnapshot.child("Amount").getValue(Long.class) ;
                        DefaultTableModel tableModele = new DefaultTableModel();
                        jTable2.setModel(tableModele);
                        tableModele.addColumn("Order ID");
                        tableModele.addColumn("Status");
                        tableModele.addColumn("Mobile Number");
                        tableModele.addColumn("Amount");
                        Object[] rowdata = {OrderiD,Status,Mobileno,Amount};
                        tableModele.addRow(rowdata);
                    }
                }
            }
        }

        public void onCancelled(DatabaseError databaseError) {
            // Handle error
            System.out.println("Error: " + databaseError.getMessage());
        }
    });    
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
   
    public static void main(String args[]) {
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane TopBar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
