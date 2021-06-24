/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamgod
 * 
 * Activity 2: Developing Software for Planet Zirboin
 * This program uses a gui to exchange the number of vrobits entered into the fewest amount of coins
 */
public class ZirboinSoftware extends javax.swing.JFrame {

    /**
     * Creates new form ZirboinSoftware
     */
    public ZirboinSoftware() {
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

        LabelTitle = new javax.swing.JLabel();
        LabelNumVrobits = new javax.swing.JLabel();
        BoxOrbits = new javax.swing.JTextField();
        ButtonConvert = new javax.swing.JButton();
        LabelDescription3 = new javax.swing.JLabel();
        LabelDescription4 = new javax.swing.JLabel();
        LabelDescription5 = new javax.swing.JLabel();
        LabelDescription6 = new javax.swing.JLabel();
        LabelDescription7 = new javax.swing.JLabel();
        LabelDescription8 = new javax.swing.JLabel();
        LabelDescription9 = new javax.swing.JLabel();
        LabelDescription2 = new javax.swing.JLabel();
        LabelNumDrobzit = new javax.swing.JLabel();
        LabelNumClickwick = new javax.swing.JLabel();
        LabelNumGazoontight = new javax.swing.JLabel();
        LabelNumFrazoint = new javax.swing.JLabel();
        LabelNumBlointoint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("ZIRBOIN FINANCIAL");

        LabelNumVrobits.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumVrobits.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumVrobits.setText("-/-");

        BoxOrbits.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ButtonConvert.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        ButtonConvert.setText("CONVERT");
        ButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConvertActionPerformed(evt);
            }
        });

        LabelDescription3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription3.setText("Please enter the amount of vrobits: ");

        LabelDescription4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription4.setText("Drobzit coins (100,000 vrobits)       :");

        LabelDescription5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription5.setText("Clickwick coins (50,000 vrobits)       :");

        LabelDescription6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription6.setText("Gazoontight coins (10,000 vrobits) :");

        LabelDescription7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription7.setText("Frazoint coins (1,000 vrobits)          :");

        LabelDescription8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription8.setText("Blointoint coins (500 vrorbits)         :");

        LabelDescription9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription9.setText("Vrobits coins                                   :");

        LabelDescription2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDescription2.setText("-/-");

        LabelNumDrobzit.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumDrobzit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumDrobzit.setText("-/-");

        LabelNumClickwick.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumClickwick.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumClickwick.setText("-/-");

        LabelNumGazoontight.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumGazoontight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumGazoontight.setText("-/-");

        LabelNumFrazoint.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumFrazoint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumFrazoint.setText("-/-");

        LabelNumBlointoint.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        LabelNumBlointoint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNumBlointoint.setText("-/-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BoxOrbits, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(ButtonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription4)
                        .addGap(30, 30, 30)
                        .addComponent(LabelNumDrobzit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(LabelNumClickwick, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(LabelNumGazoontight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription7)
                        .addGap(30, 30, 30)
                        .addComponent(LabelNumFrazoint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription8)
                        .addGap(30, 30, 30)
                        .addComponent(LabelNumBlointoint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelDescription9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(LabelNumVrobits, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription3)
                    .addComponent(BoxOrbits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ButtonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LabelDescription2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription4)
                    .addComponent(LabelNumDrobzit))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription5)
                    .addComponent(LabelNumClickwick))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription6)
                    .addComponent(LabelNumGazoontight))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription7)
                    .addComponent(LabelNumFrazoint))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription8)
                    .addComponent(LabelNumBlointoint))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDescription9)
                    .addComponent(LabelNumVrobits))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Constant values for the coins
    public final int Vrobits = 1;
    public final int Drobzit = 100000;
    public final int Clickwick = 50000;
    public final int Gazoontight = 10000;
    public final int Frazoint = 1000;
    public final int Blointoint = 500;
    
    private void ButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConvertActionPerformed
        // TODO add your handling code here:
        //number of each coin
        int iVrobit, iDrobzit, iClickwick, iGazoontight, iFrazoint, iBlointoint;
        
        try{//Checks for correct input
            //Computes the total amount of each coin
            int iTotal = Integer.parseInt(BoxOrbits.getText());
            iDrobzit = iTotal/Drobzit;
            iTotal= iTotal % Drobzit;
            iClickwick = iTotal/Clickwick;
            iTotal = iTotal % Clickwick;
            iGazoontight = iTotal/Gazoontight;
            iTotal = iTotal % Gazoontight;
            iFrazoint = iTotal/Frazoint;
            iTotal= iTotal % Frazoint;
            iBlointoint = iTotal/Blointoint;
            iTotal= iTotal % Blointoint;
            iVrobit = iTotal;
        
            LabelDescription2.setText("Your vrobit coins can be exchanged into: ");
        
            LabelNumDrobzit.setText(String.valueOf(iDrobzit));
            LabelNumClickwick.setText(String.valueOf(iClickwick));
            LabelNumGazoontight.setText(String.valueOf(iGazoontight));
            LabelNumFrazoint.setText(String.valueOf(iFrazoint));
            LabelNumBlointoint.setText(String.valueOf(iBlointoint));
            LabelNumVrobits.setText(String.valueOf(iVrobit));
        }catch(NumberFormatException e){
            LabelDescription2.setText("Invalid input");
        }
        
        
    }//GEN-LAST:event_ButtonConvertActionPerformed

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
            java.util.logging.Logger.getLogger(ZirboinSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZirboinSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZirboinSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZirboinSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZirboinSoftware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoxOrbits;
    private javax.swing.JButton ButtonConvert;
    private javax.swing.JLabel LabelDescription2;
    private javax.swing.JLabel LabelDescription3;
    private javax.swing.JLabel LabelDescription4;
    private javax.swing.JLabel LabelDescription5;
    private javax.swing.JLabel LabelDescription6;
    private javax.swing.JLabel LabelDescription7;
    private javax.swing.JLabel LabelDescription8;
    private javax.swing.JLabel LabelDescription9;
    private javax.swing.JLabel LabelNumBlointoint;
    private javax.swing.JLabel LabelNumClickwick;
    private javax.swing.JLabel LabelNumDrobzit;
    private javax.swing.JLabel LabelNumFrazoint;
    private javax.swing.JLabel LabelNumGazoontight;
    private javax.swing.JLabel LabelNumVrobits;
    private javax.swing.JLabel LabelTitle;
    // End of variables declaration//GEN-END:variables
}
