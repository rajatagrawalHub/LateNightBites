package com.javaproj.LateNightBites;

import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.io.File;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.*;
import javax.swing.table.DefaultTableModel;





public class LateNightBites extends javax.swing.JFrame implements ActionListener {
    
    DatabaseReference mainDB;
    DatabaseReference dProfile;
    DatabaseReference dItem;
    Double TotalAmount = 0.00;
    DefaultTableModel tableModel;
    
    public LateNightBites() {
        initComponents();
        setVisible(true);
         AddItem.setVisible(false);
         ViewCart.setVisible(false);
         Homepage.setVisible(true);
         jButton8.setBackground(Color.white);
         jButton9.setBackground(Color.white);
         jButton5.setBackground(Color.white);
         jComboBox1.setBackground(Color.white);
         jComboBox2.setBackground(Color.white);
         mainDB = FirebaseDatabase.getInstance().getReference();
         dProfile = mainDB.child("Profile");
         dItem = mainDB.child("Item");
         tableModel = new DefaultTableModel();
            jTable1.setModel(tableModel);
            tableModel.addColumn("Name");
            tableModel.addColumn("Quantity");
            tableModel.addColumn("Price");
            tableModel.addColumn("Amount");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        AddItem = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        ViewCart = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Menu = new javax.swing.JLayeredPane();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TopBar = new javax.swing.JLayeredPane();
        Homepage = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 450));
        setSize(new java.awt.Dimension(650, 450));

        jLayeredPane1.setBackground(new java.awt.Color(50, 50, 50));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(650, 450));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddItem.setBackground(new java.awt.Color(50, 50, 50));
        AddItem.setEnabled(false);
        AddItem.setFocusable(false);
        AddItem.setName(""); // NOI18N
        AddItem.setOpaque(true);
        AddItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 239, 153));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 239, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LATE NIGHT BITES");
        jLabel9.setFocusable(false);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        AddItem.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 120, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD ITEM");
        AddItem.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("0.00");
        AddItem.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        AddItem.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        AddItem.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", " ", " " }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        AddItem.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 130, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Beverage", "Snack" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        jComboBox2.setLightWeightPopupEnabled(false);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        AddItem.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, 30));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        AddItem.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 130, 30));

        jButton2.setBackground(new java.awt.Color(255, 142, 142));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Item");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 142, 142), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddItem.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 80, 30));

        jButton3.setBackground(new java.awt.Color(255, 138, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Send to Cart");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 138, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AddItem.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 80, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        AddItem.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Grand Total");
        AddItem.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 51));
        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Rs.");
        AddItem.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

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
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        AddItem.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, 140));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Price");
        AddItem.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField2.setText("40");
        jFormattedTextField2.setEnabled(false);
        AddItem.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 130, 30));

        jLayeredPane1.add(AddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 420));
        AddItem.getAccessibleContext().setAccessibleName("");

        ViewCart.setBackground(new java.awt.Color(50, 50, 50));
        ViewCart.setEnabled(false);
        ViewCart.setFocusable(false);
        ViewCart.setName(""); // NOI18N
        ViewCart.setOpaque(true);
        ViewCart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 239, 153));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 239, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LATE NIGHT BITES");
        jLabel12.setFocusable(false);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ViewCart.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VIEW CART");
        ViewCart.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 142, 142));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 142, 142), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ViewCart.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 30));

        jButton7.setBackground(new java.awt.Color(255, 138, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Bill");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 138, 0), 1, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ViewCart.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, 30));

        jTable2.setBackground(new java.awt.Color(217, 217, 217));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price", "Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        ViewCart.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, 200));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Grand Total");
        ViewCart.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 51));
        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Rs.");
        ViewCart.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 51));
        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("0.00");
        ViewCart.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 90, -1));

        jLayeredPane1.add(ViewCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 420));

        Menu.setBackground(new java.awt.Color(255, 215, 0));
        Menu.setOpaque(true);
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton8.setText("Add Item");
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 40));

        jButton9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton9.setText("View Cart");
        jButton9.setBorder(null);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Menu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 40));

        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("View Status");
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Menu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("LATE NIGHT BITES");
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 30));

        jLayeredPane1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 450));

        TopBar.setBackground(new java.awt.Color(255, 138, 0));
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

        jLayeredPane1.add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 420, 30));

        Homepage.setBackground(new java.awt.Color(50, 50, 50));
        Homepage.setOpaque(true);
        Homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Home Page");
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Homepage.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\rajat\\OneDrive\\Desktop\\Home_fill.png")); // NOI18N
        Homepage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 240, 210));

        jLayeredPane1.add(Homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        AddItem.setVisible(true);
        ViewCart.setVisible(false);
        Homepage.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

private void getData(String category, String iN) {
    DatabaseReference dItem = mainDB.child("Item");

    dItem.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot datasnapshot) {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Select Item");

            if (datasnapshot.exists()) {
                for (DataSnapshot itemSnapshot : datasnapshot.getChildren()) {
                    String itemName = itemSnapshot.getKey();
                    if (itemSnapshot.child("Category").getValue(String.class).equalsIgnoreCase(category)) {
                        jComboBox1.addItem(itemName);

                    }
                }
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            // Handle error
            System.out.println("Error: " + databaseError.getMessage());
        }
    });
}

    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        AddItem.setVisible(false);
        ViewCart.setVisible(true);
        Homepage.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        AddItem.setVisible(false);
        ViewCart.setVisible(false);
        Homepage.setVisible(true);
        new ViewStatus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!jFormattedTextField2.getText().equals("") || !jFormattedTextField1.getText().equals("")){
            int Amount = Integer.parseInt(jFormattedTextField2.getText()) * Integer.parseInt(jFormattedTextField1.getText());
            Object[] rowdata = {jComboBox2.getSelectedItem().toString(),jFormattedTextField1.getText(),jFormattedTextField2.getText(),Amount};
            tableModel.addRow(rowdata);
            TotalAmount += Amount;
            jLabel3.setText(TotalAmount.toString());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        getData(jComboBox2.getSelectedItem().toString(),"ABC");
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        //getData(jComboBox2.getSelectedItem().toString(),jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    
   
    public static void main(String args[]) {
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                       new LateNightBites();                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AddItem;
    private javax.swing.JLayeredPane Homepage;
    private javax.swing.JLayeredPane Menu;
    private javax.swing.JLayeredPane TopBar;
    private javax.swing.JLayeredPane ViewCart;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
