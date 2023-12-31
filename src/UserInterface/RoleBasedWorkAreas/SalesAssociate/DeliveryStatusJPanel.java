/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleBasedWorkAreas.SalesAssociate;

import Business.Models.DeliveryShipment;
import Business.Models.Store;
import Business.Models.StoreCropQuantityRequirement;
import Business.Roles.DeliveryDriver;
import javax.swing.table.DefaultTableModel;
import UserInterface.RoleBasedWorkAreas.DataAnalystJPanel;
import static UserInterface.RoleBasedWorkAreas.DataAnalystJPanel.deliveriesMasterList;

/**
 *
 * @author kpraneeth
 */
public class DeliveryStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form deliveryStatusJPanel
     */
    public DeliveryStatusJPanel() {
        initComponents();
        loadTable();
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
        deliveryStatusTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        deliveryStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Driver Name", "Store Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deliveryStatusTbl.setOpaque(false);
        jScrollPane1.setViewportView(deliveryStatusTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deliveryStatusTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) deliveryStatusTbl.getModel();
    model.setRowCount(0);

    for (DeliveryShipment shipment : deliveriesMasterList) {
        DeliveryDriver driver = shipment.getDeliveryDriver();
            for (StoreCropQuantityRequirement storeReq : shipment.getStoresListInThatShipment()) {
                Store store = storeReq.getStore();

                Object[] row = new Object[3];
                row[0] = driver.getName();
                row[1] = store.getStoreName();
                row[2] = storeReq.getDeliveryStatus(); // Assuming delivery status is now stored in StoreCropQuantityRequirement
                model.addRow(row);
            }
        }
    }
}
