/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import javax.swing.JOptionPane;

/**
 *
 * @author META
 */
public class OrderForm extends javax.swing.JFrame {

    private CustomerController customerController = new CustomerController();
    private ItemController itemController = new ItemController();
    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        OrderId = new javax.swing.JLabel();
        CustId = new javax.swing.JLabel();
        itemCode = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtCustId = new javax.swing.JTextField();
        txtItemCode = new javax.swing.JTextField();
        CustSearch = new javax.swing.JButton();
        itemSearch = new javax.swing.JButton();
        qty = new javax.swing.JLabel();
        Discount = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add1 = new javax.swing.JButton();
        CustDetails = new javax.swing.JLabel();
        ItemDetails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Order Form");

        OrderId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OrderId.setText("Order ID ");

        CustId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustId.setText("Customer Id");

        itemCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemCode.setText("Item Code");

        CustSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustSearch.setText("Search");
        CustSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustSearchActionPerformed(evt);
            }
        });

        itemSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemSearch.setText("Search");
        itemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchActionPerformed(evt);
            }
        });

        qty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        qty.setText("Qty");

        Discount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Discount.setText("Discount");

        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setText("Place Order");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

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

        add1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add1.setText("Add to table");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        CustDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustDetails.setText("Customer details");

        ItemDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ItemDetails.setText("Item details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(itemSearch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ItemDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(431, Short.MAX_VALUE)
                    .addComponent(add1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderId)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustId)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustSearch)
                    .addComponent(CustDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCode)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemSearch)
                    .addComponent(ItemDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty)
                    .addComponent(Discount)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(add1)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add1ActionPerformed

    private void CustSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustSearchActionPerformed
        // TODO add your handling code here:
        searchCutomer();
    }//GEN-LAST:event_CustSearchActionPerformed

    private void itemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchActionPerformed
        // TODO add your handling code here:
        searchItem();
    }//GEN-LAST:event_itemSearchActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustDetails;
    private javax.swing.JLabel CustId;
    private javax.swing.JButton CustSearch;
    private javax.swing.JLabel Discount;
    private javax.swing.JLabel ItemDetails;
    private javax.swing.JLabel OrderId;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JLabel itemCode;
    private javax.swing.JButton itemSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel qty;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void searchCutomer() {
        try {
            String custId = txtCustId.getText();
            CustomerDto customerDto = customerController.searchCustomer(custId);
            if(customerDto!=null){
                CustDetails.setText(customerDto.getId()+" | "
                    +customerDto.getTitle()+"."+ customerDto.getName());
            }else{
                CustDetails.setText("Customer Not Found");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }

    private void searchItem() {
        try {
            String itemCode = txtItemCode.getText();
            ItemDto itemDto = itemController.searchItem(itemCode);
            if(itemDto!=null){
                ItemDetails.setText(itemDto.getCode()+" | "
                    +itemDto.getDescription());
            }else{
                ItemDetails.setText("Item Not Found");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
}
