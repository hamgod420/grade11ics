/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Andy Yan
 * 2021-06-11
 * Activity 3: Creating An Encryption Program
 * This program turns decrypted messages into encrypted messages and encrypted messages into non decrypted messages
 */
public class DecryptionSoftware extends javax.swing.JFrame {

    private int encryptionKey[]={3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};//Values to alter each char
    private boolean randReverse;//Boolean to reverse the string
    /**
     * Creates new form DecryptionSoftware
     */
    public DecryptionSoftware() {
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

        LabelDescription1 = new javax.swing.JLabel();
        LabelDescription2 = new javax.swing.JLabel();
        BoxDecryptedInput = new javax.swing.JTextField();
        ButtonEncrypt = new javax.swing.JButton();
        BoxEncryptedOutput = new javax.swing.JTextField();
        BoxDecryptedOutput = new javax.swing.JTextField();
        ButtonDecrypt = new javax.swing.JButton();
        BoxEncryptedInput = new javax.swing.JTextField();
        LabelDescription3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelDescription1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelDescription1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDescription1.setText("ENCRYPTION AND DECRYPTION SOFTWARE");

        LabelDescription2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDescription2.setText("Enter a decrypted message and it will be encrypted (32 characters max)");

        BoxDecryptedInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ButtonEncrypt.setText("ENCRYPT");
        ButtonEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEncryptActionPerformed(evt);
            }
        });

        BoxEncryptedOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BoxDecryptedOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ButtonDecrypt.setText("DECRYPT");
        ButtonDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDecryptActionPerformed(evt);
            }
        });

        BoxEncryptedInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelDescription3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDescription3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDescription3.setText("Enter an encrypted message and it will be decrypted");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxDecryptedInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxEncryptedOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BoxEncryptedInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelDescription3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxDecryptedOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LabelDescription1)
                .addGap(46, 46, 46)
                .addComponent(LabelDescription2)
                .addGap(18, 18, 18)
                .addComponent(BoxDecryptedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEncrypt)
                .addGap(18, 18, 18)
                .addComponent(BoxEncryptedOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LabelDescription3)
                .addGap(18, 18, 18)
                .addComponent(BoxEncryptedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonDecrypt)
                .addGap(18, 18, 18)
                .addComponent(BoxDecryptedOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void permutation(){
        randReverse = Math.random()>0.5;//50% chance it will be flipped
    }
    private void ButtonEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEncryptActionPerformed
        // TODO add your handling code here:
        
        String sEncrypted = "";
        String sMessage = BoxDecryptedInput.getText();
        //Checks if reverse is needed
        permutation();
        if(randReverse==true){
            //Reverses string using string builder
            StringBuilder reverse = new StringBuilder();
            reverse.append(sMessage);
            reverse.reverse();
            sMessage = reverse.toString();
        }
        //looping through entire string an altering it by the encryptionKey
        for(int i = 0;i < sMessage.length();i++){
            int asciiValue = (int)sMessage.charAt(i) + encryptionKey[i];//The sum of the ascii values of the current char and the value of encryption key creates the new encrypted letter
            String sTemp = Character.toString((char)asciiValue);
            sEncrypted += sTemp;//Appends to new encrypted message
        }
        //Add indicator for reverse
        if(randReverse == true){
            sEncrypted += "!";//Using ! because it has the ascii value
        }
        BoxEncryptedOutput.setText(sEncrypted);
    }//GEN-LAST:event_ButtonEncryptActionPerformed

    private void ButtonDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDecryptActionPerformed
        // TODO add your handling code here:
        String sEncrypted = BoxEncryptedInput.getText();
        String sMessage = "";
        //Check if it is reversed
        if(sEncrypted.charAt(sEncrypted.length()-1)=='!'){
            //Remove indicator
            sEncrypted = sEncrypted.substring(0,sEncrypted.length()-1);
            //Revert ascii value changes
            for(int i = 0;i < sEncrypted.length();i++){
                int asciiValue = (int)sEncrypted.charAt(i) - encryptionKey[i];//Reverse the ascii value changes
                String sTemp = Character.toString((char)asciiValue);
                sMessage += sTemp;
            }
            StringBuilder reverse = new StringBuilder();
            reverse.append(sMessage);
            reverse.reverse();
            sMessage = reverse.toString();
        }else{
            //Revert ascii value changes
            for(int i = 0;i < sEncrypted.length();i++){
                int asciiValue = (int)sEncrypted.charAt(i) - encryptionKey[i];
                String sTemp = Character.toString((char)asciiValue);
                sMessage += sTemp;
            }
        }        
        BoxDecryptedOutput.setText(sMessage);
    }//GEN-LAST:event_ButtonDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(DecryptionSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecryptionSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecryptionSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecryptionSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecryptionSoftware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoxDecryptedInput;
    private javax.swing.JTextField BoxDecryptedOutput;
    private javax.swing.JTextField BoxEncryptedInput;
    private javax.swing.JTextField BoxEncryptedOutput;
    private javax.swing.JButton ButtonDecrypt;
    private javax.swing.JButton ButtonEncrypt;
    private javax.swing.JLabel LabelDescription1;
    private javax.swing.JLabel LabelDescription2;
    private javax.swing.JLabel LabelDescription3;
    // End of variables declaration//GEN-END:variables
}
