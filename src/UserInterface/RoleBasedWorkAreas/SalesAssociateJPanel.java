/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleBasedWorkAreas;

import Business.LoginPerson.LoginPerson;
import Business.Roles.DeliveryDriver;
import Business.Roles.SalesAssociate;
import Business.Roles.WarehouseCoordinator;
import UserInterface.RoleBasedWorkAreas.DataAnalystPanels.BestSeasonsJPanel;
import UserInterface.RoleBasedWorkAreas.SalesAssociate.DeliveryStatusJPanel;
import UserInterface.RoleBasedWorkAreas.SalesAssociate.FeedbackJPanel;
import UserInterface.RoleBasedWorkAreas.SalesAssociate.SendRequirementJPanel;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author yash
 */
public class SalesAssociateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesAssociateJPanel
     */
    LoginPerson person;
    List<SalesAssociate> salesAssociateList;
    JPanel MainJPanel;
    SalesAssociate loggedIn;

    public SalesAssociateJPanel(LoginPerson person,
            List<SalesAssociate> salesAssociateList,
            JPanel MainJPanel) {
        this.person = person;
        this.salesAssociateList = salesAssociateList;
        this.MainJPanel = MainJPanel;
        this.loggedIn = getSalesLogin();
        initComponents();
    }

    public SalesAssociate getSalesLogin() {
        for (SalesAssociate sales : salesAssociateList) {
            if (sales.getUserName().equalsIgnoreCase(person.getUserName())) {
                return sales;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        buttonJPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSendReq = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setOpaque(false);

        buttonJPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonJPanel.setOpaque(false);

        jButton3.setText("Delivery Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Feedback");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnSendReq.setText("Send Requirement");
        btnSendReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReqActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Sales Associate");

        javax.swing.GroupLayout buttonJPanelLayout = new javax.swing.GroupLayout(buttonJPanel);
        buttonJPanel.setLayout(buttonJPanelLayout);
        buttonJPanelLayout.setHorizontalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnLogout)
                            .addComponent(btnSendReq)
                            .addComponent(jButton4)
                            .addComponent(jButton3)))
                    .addGroup(buttonJPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogout, btnSendReq, jButton3, jButton4});

        buttonJPanelLayout.setVerticalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(jButton3)
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(btnSendReq)
                .addGap(35, 35, 35)
                .addComponent(btnLogout)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        buttonJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogout, btnSendReq, jButton3, jButton4});

        jSplitPane1.setLeftComponent(buttonJPanel);

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setOpaque(false);
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workAreaJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        DeliveryStatusJPanel deliveryStatusJPanel = new DeliveryStatusJPanel();
        workAreaJPanel.add("bestSeasonsJPanel", deliveryStatusJPanel);
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        FeedbackJPanel feedbackJPanel = new FeedbackJPanel();
        workAreaJPanel.add("bestSeasonsJPanel", feedbackJPanel);
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        MainJPanel.remove(this);
        CardLayout layout = (CardLayout) MainJPanel.getLayout();
        layout.previous(MainJPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSendReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReqActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        SendRequirementJPanel sendRequirementJPanel = new SendRequirementJPanel(workAreaJPanel);
        workAreaJPanel.add("sendRequirementJPanel", sendRequirementJPanel);
        layout.next(workAreaJPanel); 
    }//GEN-LAST:event_btnSendReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSendReq;
    private javax.swing.JPanel buttonJPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
