/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleBasedWorkAreas.DataAnalystPanels;

//import javafx.application.Application;
import Business.Models.Crop;
import static UserInterface.RoleBasedWorkAreas.DataAnalystJPanel.quantityGeneratedPerCrop;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author kpraneeth
 */
public class CropDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CropDataJPanel
     */
    public CropDataJPanel() {
        initComponents();
        drawChart();
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

        jLabel1.setText("Crop Yield Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(607, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void drawChart() {
        DefaultPieDataset pie = new DefaultPieDataset();
//        pie.setValue("One", 10);
//        pie.setValue("Two", 20);
//        pie.setValue("Three", 30);
//        pie.setValue("Four", 40);
        System.out.println("Crop data number-"+quantityGeneratedPerCrop.keySet());
        for(Crop crop : quantityGeneratedPerCrop.keySet()){
            System.out.println("Crop data-"+crop.getName()+"--"+quantityGeneratedPerCrop.get(crop)+"-- number--"+(Number) quantityGeneratedPerCrop.get(crop));
            pie.setValue(crop.getName(),(Number) quantityGeneratedPerCrop.get(crop));
        }
        
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pie, true, true, true);
        
//        PiePlot3D p = (PiePlot3D) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
         frame.setVisible(true);
        frame.setSize(450, 300);
        
    }
}
