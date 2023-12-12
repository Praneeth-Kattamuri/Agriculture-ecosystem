/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleBasedWorkAreas.DataAnalystPanels;

import Business.Models.Crop;
import Business.Models.CropSalesRelation;
import Utils.HistoricalData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yash
 */
public class DABestCropsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DABestCropsJPanel
     */
    ArrayList<CropSalesRelation> data;
    LinkedHashMap<String, Integer> bestCropsMap;
    
    public DABestCropsJPanel() {
        initComponents();
        bestCropsMap = new LinkedHashMap<>();
        data = HistoricalData.marketBasedData;
        populateTable();
    }
    
    private void populateTable(){
        getCropsWithHighestSales(data);
        
        DefaultTableModel model = (DefaultTableModel) bestCropsJTable.getModel();
        model.setRowCount(0);
        
        for (String key : bestCropsMap.keySet()) {        
            Object[] row = new Object[2];
            row[0] = key;
            row[1] = bestCropsMap.get(key);
            model.addRow(row);
        }
    }
    
     public void getCropsWithHighestSales(ArrayList<CropSalesRelation> marketBasedData) {
        // Step 1: Sort marketBasedData based on the quantity of sales in descending order
        Collections.sort(marketBasedData, new Comparator<CropSalesRelation>() {
            @Override
            public int compare(CropSalesRelation o1, CropSalesRelation o2) {
                // Compare in descending order based on sales quantity
                return Integer.compare(o2.getSales().getQuantity(), o1.getSales().getQuantity());
            }
        });


        for (CropSalesRelation obj : marketBasedData) {
            System.out.println("Key: " + obj.getCrop().getName() + ", Value: " + obj.getSales().getQuantity());
            bestCropsMap.put(obj.getCrop().getName(), obj.getSales().getQuantity());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bestCropsJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Best crops based on Market Demand");

        bestCropsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Crops", "Sales Qty"
            }
        ));
        bestCropsJTable.setOpaque(false);
        jScrollPane1.setViewportView(bestCropsJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bestCropsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}