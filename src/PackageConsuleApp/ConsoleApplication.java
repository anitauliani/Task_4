/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageConsuleApp;
import javaChat.ClientConnection;
/**
 *
 * @author Anita Auliani IF-38-09 1301144349
 */
public class ConsoleApplication {
    private ClientConnection client;
     
     public void startChat() {
         try {
             client = new ClientConnection();
             System.out.println("input server IP : ");
             String ip = client.inputString();
             client.connect(ip);
             ReadInput in = new ReadInput();
             WriteOutput out = new WriteOutput();
             in.start();
             out.start();
         } catch(Exception e) {
             System.out.println("Exception occurred: " + e.getMessage());
         }
     }
     
     public class ReadInput extends Thread {
         @Override
         public void run() {
             try {
                 String inputKeyboard;
                 do {
                     System.out.println(">> ");
                     inputKeyboard = client.inputString();
                     client.writeStream(inputKeyboard);
                 } while (!inputKeyboard.equals("quit"));
                 client.disconnect();
             } catch(Exception e) {
                 System.out.println("Exception occurred: " + e.getMessage());
             }
         }
     }
     
     public class WriteOutput extends Thread {
         @Override
         public void run() {
             try {
                 String inputan;
                 while ((inputan = client.readStream()) != null) {
                     System.out.println(inputan);
                     System.out.println(">> ");
                 } 
             } catch(Exception e) {
                 System.out.println("Exception occurred: " + e.getMessage());
             }
         }
     }
}

