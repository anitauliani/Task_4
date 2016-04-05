/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatGUI;
import java.awt.event.ActionListener;
/**
 *
 * @author Anita Auliani IF-38-09 1301144349
 */
public class ChatView extends javax.swing.JFrame{
    public ChatView(){
        initComponents();
    }
    
 @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {
 
         jScrollPane1 = new javax.swing.JScrollPane();
         txAreaChat = new javax.swing.JTextArea();
         txFieldChat = new javax.swing.JTextField();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         txAreaChat.setEditable(false);
         txAreaChat.setColumns(20);
         txAreaChat.setRows(5);
         txAreaChat.setText("Input Server IP Adress :");
         jScrollPane1.setViewportView(txAreaChat);
 
         txFieldChat.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 txFieldChatActionPerformed(evt);
             }
         });
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                 .addContainerGap()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                     .addComponent(txFieldChat))
                 .addContainerGap())
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addComponent(txFieldChat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(20, 20, 20))
         );
 
         pack();
     }// </editor-fold>//GEN-END:initComponents
 
     private void txFieldChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFieldChatActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_txFieldChatActionPerformed
 
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
             java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
 
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new ChatView().setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextArea txAreaChat;
     private javax.swing.JTextField txFieldChat;
     // End of variables declaration//GEN-END:variables
 
     public void setTxAreaChat(String message){
         txAreaChat.append(message + "\n");
     }
     
     public Object getTxFieldChat() {
         return txFieldChat;
     }
     
     public String getStringChat() {
         return txFieldChat.getText();
     }
     
     public void setTxFieldChat(String message) {
         this.txFieldChat.setText(message);
     }
     
     public void addListener(ActionListener e) {
         txFieldChat.addActionListener(e);
     }
 }
