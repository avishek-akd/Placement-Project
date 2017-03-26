/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.*;
import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Avishek
 */
public class Mail {

    public static void mailSend(String email, String userid, String password) {
        String sendermail = email;
        String uid = userid;
        String pwd = password;

          JFrame jfrProgress = new JFrame("Emailing  In Progress...");
          Container contentPane = jfrProgress.getContentPane();
          //SpringLayout layout = new SpringLayout();
          contentPane.setLayout(null);
          jfrProgress.setLocation(420,350);
          jfrProgress.setSize(600,90);
          jfrProgress.setLocation(330, 300);
          jfrProgress.setResizable(false);
          jfrProgress.setVisible(true);
        

        // Tries To Make Bar Close On Exit But Bar Sometimes Too Fast
        jfrProgress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Bar Progress Counter
        int progress = 100;

        // Make Bar
        JProgressBar progressBar = new JProgressBar(0, progress);
        String doing = "Step 1 - Setting Hosts.";
        jfrProgress.getContentPane().add(progressBar,BorderLayout.CENTER);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setString(doing);

        progressBar.setSize(600, 60);
        progressBar.setVisible(true);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.paintImmediately(0,0,jfrProgress.getWidth(),jfrProgress.getHeight());
        
        String Email_Password = "8908904383";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sendermail, Email_Password);//change accordingly  
            }
        });
        
           /*
          for (int i = 0; i < 1500000000; i++)
          {
              ;
          }

          // Progress ++;
          progressBar.setValue(33);
          doing = "Step 2 - Creating Email.";
          progressBar.setString(doing);
          progressBar.paintImmediately(0,0,jfrProgress.getWidth(),jfrProgress.getHeight());
        
        */
        
        
        //compose message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendermail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendermail));

            message.setSubject("Forgot Password");
            message.setText("Dear Admin..." + "\n" + "\n" + "Your USERID is :- " + uid + "\n" + "Your PASSWORD is :- " + pwd);
            
               for (int i = 0; i < 1500000000; i++)
              {
                ;
              }

              // Progress ++;
              progressBar.setValue(66);
              doing = "Step 3 - Connecting To Internet And Sending Email.";
              progressBar.setString(doing);
              progressBar.paintImmediately(0,0,jfrProgress.getWidth(),jfrProgress.getHeight());
            
            Transport.send(message);
            
            progressBar.setValue(100);
            progressBar.paintImmediately(0,0,jfrProgress.getWidth(),jfrProgress.getHeight());

            //Close
            jfrProgress.dispose();

        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}
