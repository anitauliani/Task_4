/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatGUI;
import java.awt.event.ActionEvent;
import javaChat.ClientConnection;
import java.awt.event.ActionListener;
/**
 *
 * @author Anita Auliani IF-38-09 1301144349
 */
public class ChatController implements ActionListener {
     private ChatView view;
     private ClientConnection client = null;
     
     public ChatController() {
         view = new ChatView();
         view.setVisible(true);
         view.addListener(this);
         client = null;
     }
     
     public class WriteOutput extends Thread{
         @Override
         public void run() {
             try {
                 String inputan;
                 while((inputan = client.readStream()) != null){
                     view.setTxAreaChat(inputan);
                 }
             } catch(Exception z) {
                 System.out.println("Exception occurred: " + z.getMessage());
             }
         }
     }
     
     @Override
     public void actionPerformed(ActionEvent ae) {
         Object source = ae.getSource();
         if (source == view.getTxFieldChat()) {
             if (client == null) {
                 try {
                     client = new ClientConnection();
                     String ip = view.getStringChat();
                     client.connect(ip);
                     WriteOutput w = new WriteOutput();
                     w.start();
                 } catch(Exception e) {
                     System.out.println("Exception occurred: " + e.getMessage());
                 }
             } else {
                 String input = view.getStringChat();
                 client.writeStream(input);
                 view.setTxFieldChat("");
             }
         }
     }
}
