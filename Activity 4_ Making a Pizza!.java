/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamgod
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Description1 = new javax.swing.JLabel();
        DiameterBox = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        Description2 = new javax.swing.JLabel();
        Description3 = new javax.swing.JLabel();
        Description4 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubtotalLabel = new javax.swing.JLabel();
        TaxesLabel = new javax.swing.JLabel();
        GrandTotalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Description1.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Description1.setText("Diameter of Pizza(cm):");

        DiameterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiameterBoxActionPerformed(evt);
            }
        });

        CalculateButton.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        Description2.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Description2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Description2.setText("Subtotal($):");

        Description3.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Description3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Description3.setText("Taxes($):");

        Description4.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Description4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Description4.setText("Grand Total($):");

        Message.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message.setText("Welcome to Putrid Pizza!");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setText("PUTRID PIZZA");

        SubtotalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        SubtotalLabel.setText("0.00");

        TaxesLabel.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        TaxesLabel.setText("0.00");

        GrandTotalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        GrandTotalLabel.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CalculateButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Description1)
                                    .addGap(18, 18, 18)
                                    .addComponent(DiameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Description3)
                                        .addComponent(Description2)
                                        .addComponent(Description4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SubtotalLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TaxesLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(GrandTotalLabel))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description1)
                    .addComponent(DiameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CalculateButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description2)
                    .addComponent(SubtotalLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description3)
                    .addComponent(TaxesLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description4)
                    .addComponent(GrandTotalLabel))
                .addGap(18, 18, 18)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiameterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiameterBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiameterBoxActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        // TODO add your handling code here:
        //input
        double dDiameter = Double.parseDouble(DiameterBox.getText());
        //varibles
        double dSubtotal,dTaxes,dGrandTotal;
        String sSubtotal,sTaxes,sGrandTotal;
        String sMessage = "";
        //calculations
        dSubtotal = 0.5*dDiameter + 0.75 + 0.99;
        dTaxes = 0.13*dSubtotal;
        dGrandTotal = dSubtotal+dTaxes;
        //conditions
        if(dDiameter >= 1.0 && dDiameter <= 15){
            sMessage = "We are going to make you a cute little pizza!";
        }else if(dDiameter > 20.0 && dDiameter < 40.0){
            sMessage = "This will be delicious!";
        }else{//No more conditions
            sMessage = "Whoa, big pizza!";
        }
        //output
        sSubtotal = String.format("%.2f",dSubtotal);
        sTaxes = String.format("%.2f",dTaxes);
        sGrandTotal = String.format("%.2f",dGrandTotal);
        
        SubtotalLabel.setText(sSubtotal);
        TaxesLabel.setText(sTaxes);
        GrandTotalLabel.setText(sGrandTotal);
        Message.setText(sMessage);
    }//GEN-LAST:event_CalculateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateButton;
    private javax.swing.JLabel Description1;
    private javax.swing.JLabel Description2;
    private javax.swing.JLabel Description3;
    private javax.swing.JLabel Description4;
    private javax.swing.JTextField DiameterBox;
    private javax.swing.JLabel GrandTotalLabel;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel SubtotalLabel;
    private javax.swing.JLabel TaxesLabel;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
