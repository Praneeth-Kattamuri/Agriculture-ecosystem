/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleBasedWorkAreas.HarvestTechnicianPanels;

import Business.Models.Crop;
import Business.Models.CropScheduleTechniqueRelation;
import Business.Roles.CropPlanner;
import UserInterface.RoleBasedWorkAreas.CropPlannerPanels.CropPlantingScheduleJPanel;
import UserInterface.RoleBasedWorkAreas.DataAnalystJPanel;
import UserInterface.RoleBasedWorkAreas.HarvestTechnicianJPanel;
import static Utils.Constants.harvestingStatus;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yash
 */
public class CropsHarvestPlanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CropsHarvestListPanel
     */
    JPanel MainJPanel;
    ArrayList<String> selectedRowData = new ArrayList();
    String selectedCropPlanner;
    HashMap<CropPlanner,HashMap<Crop, List<CropScheduleTechniqueRelation>>> cropPlannerScheduleList;
    HashMap<Crop,Integer> quantityGeneratedPerCrop;
    private boolean isQtyTxtFieldVisible = false;

    public CropsHarvestPlanJPanel(JPanel MainJPanel, ArrayList<String> selectedRowData, String selectedCropPlanner) {
        initComponents();
        this.MainJPanel = MainJPanel;
        this.selectedRowData = selectedRowData;
        this.selectedCropPlanner = selectedCropPlanner;
        cropPlannerScheduleList = new HashMap<CropPlanner,HashMap<Crop, List<CropScheduleTechniqueRelation>>>();
        cropPlannerScheduleList = DataAnalystJPanel.cropPlannerList;
        
        quantityGeneratedPerCrop = new HashMap<Crop, Integer>();
        quantityGeneratedPerCrop = DataAnalystJPanel.quantityGeneratedPerCrop;
        
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cropLbl = new javax.swing.JLabel();
        techniqueLbl = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        statusLbl = new javax.swing.JLabel();
        qtyLbl = new javax.swing.JLabel();
        cropTxtField = new javax.swing.JTextField();
        techniqueTxtField = new javax.swing.JTextField();
        qtyTxtField = new javax.swing.JTextField();
        headerLbl = new javax.swing.JLabel();
        updatePlanBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        cropLbl.setBackground(new java.awt.Color(255, 255, 255));
        cropLbl.setText("Crop ");

        techniqueLbl.setBackground(new java.awt.Color(255, 255, 255));
        techniqueLbl.setText("Technique");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        statusLbl.setBackground(new java.awt.Color(255, 255, 255));
        statusLbl.setText("Status");

        qtyLbl.setBackground(new java.awt.Color(255, 255, 255));
        qtyLbl.setText("Quantity Produced");

        techniqueTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techniqueTxtFieldActionPerformed(evt);
            }
        });

        headerLbl.setBackground(new java.awt.Color(255, 255, 255));
        headerLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        headerLbl.setText("Update Crop Harvest Plan");

        updatePlanBtn.setText("Update Plan");
        updatePlanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlanBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(techniqueLbl)
                                            .addGap(84, 84, 84))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(statusLbl)
                                            .addGap(107, 107, 107)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cropLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cropTxtField)
                                    .addComponent(techniqueTxtField)
                                    .addComponent(statusComboBox, 0, 108, Short.MAX_VALUE)
                                    .addComponent(qtyTxtField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(backBtn)
                        .addGap(172, 172, 172)
                        .addComponent(updatePlanBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(headerLbl)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(headerLbl)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statusLbl)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cropLbl)
                            .addComponent(cropTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(techniqueLbl)
                            .addComponent(techniqueTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl)
                    .addComponent(qtyTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePlanBtn)
                    .addComponent(backBtn))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void techniqueTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techniqueTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_techniqueTxtFieldActionPerformed

    private void updatePlanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlanBtnActionPerformed
        // TODO add your handling code here:
        String qtyProduced =  qtyTxtField.getText();
        String selectedStatus = (String) statusComboBox.getSelectedItem();

        // Get the crop planner object from the list
        for (CropPlanner planner : cropPlannerScheduleList.keySet()) {

            if (planner.getName().equals(selectedCropPlanner)) {
        // Get the specific crop name whose schedule has to be updated 
               for (Crop crop : cropPlannerScheduleList.get(planner).keySet()) {
                   if(crop.getName().equals(cropTxtField.getText())) {
                       for (CropScheduleTechniqueRelation relation : cropPlannerScheduleList.get(planner).get(crop)) {
                           if(relation.getTechnique().equals(techniqueTxtField.getText())){
                                 relation.setHarvestTechnicianStatus(selectedStatus);
                           }
                       }
                       
                       // Adding to the cropProductQuantity object
                        String cropName = cropTxtField.getText();
                        boolean cropExists = false;
                        int existingQuantity = 0;
                        Crop cropObject = new Crop();

                        for (Map.Entry<Crop, Integer> entry : quantityGeneratedPerCrop.entrySet()) {
                            if (entry.getKey().getName().equals(cropName)) {
                                cropExists = true;
                                existingQuantity = entry.getValue();
                                cropObject = entry.getKey();
                                break;
                            }
                        }

                        if (!qtyProduced.isBlank()) {
                            if (cropExists) {
                                // Crop exists, update the quantity
                                int newQuantity = existingQuantity + Integer.parseInt(qtyProduced);
                                quantityGeneratedPerCrop.put(crop, newQuantity);
                            } else {
                                // Crop doesn't exist, add it to quantityGeneratedPerCrop
                                quantityGeneratedPerCrop.put(crop, Integer.parseInt(qtyProduced));
                            }
                        }
                   }
               }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Crop updated the status", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_updatePlanBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        MainJPanel.remove(this);
        CardLayout layout = (CardLayout) MainJPanel.getLayout();
        layout.previous(MainJPanel);
        Component component = MainJPanel.getComponent(MainJPanel.getComponentCount() - 1);
        
        if (component instanceof HarvestTechnicianJPanel) {
        ((HarvestTechnicianJPanel)component).populateCropTable();
        } 
    }//GEN-LAST:event_backBtnActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
          String selectedStatus = (String) statusComboBox.getSelectedItem();
    
        // Check if the selectedStatus is not null
        if (selectedStatus != null){
            if(selectedStatus.equals("Completed")){
                 isQtyTxtFieldVisible = true;
                  qtyTxtField.setVisible(isQtyTxtFieldVisible);
            }
            else{
                 isQtyTxtFieldVisible = false;
                 qtyTxtField.setVisible(isQtyTxtFieldVisible);
            }
        }    
    }//GEN-LAST:event_statusComboBoxActionPerformed

    public void populateFields(){
       
        cropTxtField.setText(selectedRowData.get(0));
        techniqueTxtField.setText(selectedRowData.get(1));
        
        statusComboBox.removeAllItems();

        for (String status : harvestingStatus) {
            statusComboBox.addItem(status);
        }
        statusComboBox.setSelectedItem(selectedRowData.get(2));
       
         // Initially set the visibility of qtyTxtField based on the selected status
        String selectedStatus = (String) statusComboBox.getSelectedItem();
        isQtyTxtFieldVisible = "Completed".equals(selectedStatus);
        qtyTxtField.setVisible(isQtyTxtFieldVisible);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cropLbl;
    private javax.swing.JTextField cropTxtField;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JTextField qtyTxtField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel techniqueLbl;
    private javax.swing.JTextField techniqueTxtField;
    private javax.swing.JButton updatePlanBtn;
    // End of variables declaration//GEN-END:variables
}
