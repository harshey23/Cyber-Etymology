/*
    cyber etymology server code
*/


import java.awt.HeadlessException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class chat_server extends javax.swing.JFrame {

    /**
     * Creates new form chat_server
     */
   
    static ServerSocket ss1,ss2,ss3,ss4,ss5,ss6;
    static Socket s1,s2,s3,s4,s5,s6;
    static DataInputStream din1,din2,din3,din4,din5,din6;
    static DataOutputStream dout1,dout2,dout3,dout4,dout5,dout6;
    static int rnumber1=1;
  
    
   
    
    public chat_server() {
        initComponents();
    }

        
    
       static void accepted(String msgin) throws IOException{
                                                     dout1.writeUTF("acceptmsg");
                                                     dout2.writeUTF("acceptmsg");
                                                     dout3.writeUTF("acceptmsg");
                                                     dout4.writeUTF("acceptmsg");
                                                     dout5.writeUTF("acceptmsg");
                                                     
                                                     dout1.writeUTF(msgin);
                                                     dout2.writeUTF(msgin);
                                                     dout3.writeUTF(msgin);
                                                     dout4.writeUTF(msgin);
                                                     dout5.writeUTF(msgin);
                                                
                                                 teamlist.setText(teamlist.getText().trim()+"\n "+msgin); 
        
    }
    
    static void rejected(String msgin) throws IOException{
                                         
                                              dout1.writeUTF("rejectmsg");
                                              dout2.writeUTF("rejectmsg");
                                              dout3.writeUTF("rejectmsg");
                                              dout4.writeUTF("rejectmsg");
                                              dout5.writeUTF("rejectmsg");
                                         
                                              dout1.writeUTF(msgin);
                                              dout2.writeUTF(msgin);
                                              dout3.writeUTF(msgin);
                                              dout4.writeUTF(msgin);
                                              dout5.writeUTF(msgin);
                                              
                                              
                                               teamlist.setText(teamlist.getText().trim()+"\nRejected :"+msgin); 
        
        
    }
    
    
    
    
    
    
   static int weightfun(String msg)
    {
        int sum=0;
        int l=msg.length();
        for(int j=0; j<l ; j++)
        {
            sum+=weightfunperchar(msg.charAt(j));
        }   
        return sum;
    }
   
   static int weightfunperchar(char ch)
   {
       switch(ch)
       {
           case  'a' : return (1);
           case  'b' : return (2);
           case  'c' : return (3);
           case  'd' : return (2);
           case  'e' : return (1);
           case  'f' : return (4);
           case  'g' : return (2);
           case  'h' : return (4);
           case  'i' : return (1);
           case  'j' : return (3);
           case  'k' : return (5);
           case  'l' : return (1);
           case  'm' : return (3);
           case  'n' : return (1);
           case  'o' : return (1);
           case  'p' : return (3);
           case  'q' : return (8);
           case  'r' : return (1);
           case  's' : return (1);
           case  't' : return (1);
           case  'u' : return (2);
           case  'v' : return (4);
           case  'w' : return (4);
           case  'x' : return (7);
           case  'y' : return (4);
           case  'z' : return (8);
           case 'A' : return (1);
           case 'B' : return (2);
           case 'C' : return (3);
           case 'D' : return (2);
           case 'E' : return (1);
           case 'F' : return (4);
           case 'G' : return (2);
           case 'H' : return (4);
           case 'I' : return (1);
           case 'J' : return (3);
           case 'K' : return (5);
           case 'L' : return (1);
           case 'M' : return (3);
           case 'N' : return (1);
           case 'O' : return (1);
           case 'P' : return (3);
           case 'Q' : return (8);
           case 'R' : return (1);
           case 'S' : return (1);
           case 'T' : return (1);
           case 'U' : return (2);
           case 'V' : return (4);
           case 'W'  : return (4);
           case 'X': return (7);
           case 'Y' : return (4);
           case 'Z' : return (8);
           default : return (0);
       }
   }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        send_ch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamlist = new javax.swing.JTextArea();
        send_ch2 = new javax.swing.JButton();
        send_ch3 = new javax.swing.JButton();
        send_ch4 = new javax.swing.JButton();
        send_ch5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sent_ch = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rnumber = new javax.swing.JLabel();
        gover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        send_ch1.setText("Send");
        send_ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ch1ActionPerformed(evt);
            }
        });

        teamlist.setBackground(new java.awt.Color(204, 204, 204));
        teamlist.setColumns(20);
        teamlist.setFont(new java.awt.Font("Myanmar Text", 0, 15)); // NOI18N
        teamlist.setRows(5);
        jScrollPane1.setViewportView(teamlist);

        send_ch2.setText("Send");
        send_ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ch2ActionPerformed(evt);
            }
        });

        send_ch3.setText("Send");
        send_ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ch3ActionPerformed(evt);
            }
        });

        send_ch4.setText("Send");
        send_ch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ch4ActionPerformed(evt);
            }
        });

        send_ch5.setText("Send");
        send_ch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ch5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEAM - B");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TEAM - C");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TEAM - A");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TEAM - D");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TEAM - E");

        sent_ch.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("ROUND   -");

        rnumber.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        gover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gover.setText("Game over");
        gover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gover)
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(send_ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(send_ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(send_ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(send_ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(send_ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addComponent(sent_ch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(send_ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send_ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(send_ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(sent_ch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send_ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send_ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gover, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ch1ActionPerformed
        // Below code sends a charecter to player 1:
        
          
        rnumber.setText(Integer.toString(rnumber1));
      //   teamlist.setText("\n ROUND ---  "+ Integer.toString(rnumber1)); 
          teamlist.setText(teamlist.getText().trim()+"\nROUND --- "+ Integer.toString(rnumber1)); 
        rnumber1++;
        Random r = new Random();
        char c = (char)(r.nextInt(26)+'A');
        String sendch = Character.toString(c);
       sent_ch.setText(sendch);
       
        try {             send_ch1.setEnabled(false);
                      send_ch2.setEnabled(true);
                      dout1.writeUTF("charmsg");
                      dout1.writeUTF(sendch);
                    
    
            }catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_send_ch1ActionPerformed

    private void send_ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ch2ActionPerformed
        // Below code sends a charecter to player 2:
        
                Random r = new Random();
        char c = (char)(r.nextInt(26)+'A');
        String sendch = Character.toString(c);
           sent_ch.setText(sendch);
     
        try {            send_ch2.setEnabled(false);
                     send_ch3.setEnabled(true);
                     dout2.writeUTF("charmsg");
                     dout2.writeUTF(sendch);
                    
       
            } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_send_ch2ActionPerformed

    private void send_ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ch3ActionPerformed
        // Below code sends a charecter to player 3:
                Random r = new Random();
        char c = (char)(r.nextInt(26)+'A');
        String sendch = Character.toString(c);
           sent_ch.setText(sendch);
       
        
        try {   
                       send_ch3.setEnabled(false);
                 send_ch4.setEnabled(true);
                 dout3.writeUTF("charmsg");
                 dout3.writeUTF(sendch);
              
            } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_send_ch3ActionPerformed

    private void send_ch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ch4ActionPerformed
               // Below code sends a charecter to player 4:
        
                Random r = new Random();
        char c = (char)(r.nextInt(26)+'A');
        String sendch = Character.toString(c);
           sent_ch.setText(sendch);
       
        try {   
                 send_ch4.setEnabled(false);
                 send_ch5.setEnabled(true);
                 dout4.writeUTF("charmsg");
                 dout4.writeUTF(sendch);
                
    
            } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_send_ch4ActionPerformed

    private void send_ch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ch5ActionPerformed
             // Below code sends a charecter to player 3:
        rnumber.setText(Integer.toString(rnumber1));
                Random r = new Random();
        char c = (char)(r.nextInt(26)+'A');
        String sendch = Character.toString(c);
           sent_ch.setText(sendch);
       
        
        try {   
                  send_ch5.setEnabled(false);
                 send_ch1.setEnabled(true);
                 dout5.writeUTF("charmsg");
                 dout5.writeUTF(sendch);
               
            } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_send_ch5ActionPerformed

    private void goverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goverActionPerformed
        try {
            // TODO add your handling code here:

                                              dout1.writeUTF("gameover");
                                              dout2.writeUTF("gameover");
                                              dout3.writeUTF("gameover");
                                              dout4.writeUTF("gameover");
                                              dout5.writeUTF("gameover");
                                              dout6.writeUTF("gameover");
        
            
        } catch (IOException ex) {
            Logger.getLogger(chat_server.class.getName()).log(Level.SEVERE, null, ex);
        }
                                            
        
    }//GEN-LAST:event_goverActionPerformed

    
    public static void main(String args[]) {
       
             try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_server().setVisible(true);
            }
        });
         int choice = 1;
         String msgin = "" ;
         try{
        
                     ss1 = new ServerSocket(8085);
                     ss2 = new ServerSocket(8090);
                     ss3 = new ServerSocket(8095);
                     ss4 = new ServerSocket(8080);
                     ss5 = new ServerSocket(8075);
                     ss6 = new ServerSocket(8088);
           
                     s1 = ss1.accept();
                     s2 = ss2.accept();
                     s3 = ss3.accept();
                     s4 = ss4.accept();
                     s5 = ss5.accept();
                     s6 = ss6.accept();
         
                     int p = 0;
                     int w = 0;
          
                     din1 = new DataInputStream(s1.getInputStream());
                     dout1 = new DataOutputStream(s1.getOutputStream());
          
          
                     din2 = new DataInputStream(s2.getInputStream());
                     dout2 = new DataOutputStream(s2.getOutputStream());
         
          
                     din3 = new DataInputStream(s3.getInputStream());
                     dout3 = new DataOutputStream(s3.getOutputStream());
                     
                               
                     din4 = new DataInputStream(s4.getInputStream());
                     dout4 = new DataOutputStream(s4.getOutputStream());
         
                   
                     din5 = new DataInputStream(s5.getInputStream());
                     dout5 = new DataOutputStream(s5.getOutputStream());
                     
                      
                     din6 = new DataInputStream(s6.getInputStream());
                     dout6 = new DataOutputStream(s6.getOutputStream());
         
     rnumber.setText(Integer.toString(rnumber1));
       while(true)
       {
         
       
          switch(choice){
          
          
         
               
             case 1: choice++;          System.out.println("direct 1");
                               if(!msgin.equals("exit"))
                               {
                                 msgin = din1.readUTF();
                                 System.out.println(msgin);
                                 String []options = {"Accept","Reject"};
                                if(msgin.equalsIgnoreCase("9999")){
                                     dout6.writeUTF("reject");
                                 JOptionPane.showMessageDialog(null," The Player Entered a WRONG WORD !");
                                     }
                                 else if(msgin.equalsIgnoreCase("7777")){
                                      dout6.writeUTF("reject");
                                          JOptionPane.showMessageDialog(null," No WORD was Entered !");    
                                        }
                                else{
               
                                         p = JOptionPane.showOptionDialog(null,"Entered word : \""+msgin+"\"","Word Validation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
              
                                         if(p==0)
                                            {
                                             
                                                              accepted(msgin);
                                                              w = weightfun(msgin);
                                              
                                                             dout6.writeUTF("1");
                                                             String str=Integer.toString(w);
                                                             dout6.writeUTF(str);
                                            }
                                         else 
                                         {  
                                             rejected(msgin);
                                             dout6.writeUTF("reject");
                                         }
                                    }
                            }
          
                                    break;
             case 2 : choice++;          System.out.println("direct 2");
                             if(!msgin.equals("exit"))
                               {
                                 msgin = din2.readUTF();
                                 System.out.println(msgin);
                                 String []options = {"Accept","Reject"};
                                if(msgin.equalsIgnoreCase("9999")){
                                     dout6.writeUTF("reject");
                                 JOptionPane.showMessageDialog(null," The Player Entered a WRONG WORD !");
                                     }
                                 else if(msgin.equalsIgnoreCase("7777")){
                                      dout6.writeUTF("reject");
                                          JOptionPane.showMessageDialog(null," No WORD was Entered !");    
                                        }
                                else{
               
                                         p = JOptionPane.showOptionDialog(null,"Entered word : \""+msgin+"\"","Word Validation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
              
                                         if(p==0)
                                            {
                                                     accepted(msgin);
                                                     w = weightfun(msgin);
                                              
                                                   dout6.writeUTF("2");
                                                   String str=Integer.toString(w);
                                                   dout6.writeUTF(str);
                                                   
                                              
                                            }
                                         else 
                                         {   
                                             rejected(msgin);   
                                             dout6.writeUTF("reject");
                                         }
                                    }
                            }
          
                                    break;
       
       
                case 3 : choice++;          System.out.println("direct 3");
                             if(!msgin.equals("exit"))
                               {
                                 msgin = din3.readUTF();
                                 System.out.println(msgin);
                                 String []options = {"Accept","Reject"};
                                if(msgin.equalsIgnoreCase("9999")){
                                     dout6.writeUTF("reject");
                                 JOptionPane.showMessageDialog(null," The Player Entered a WRONG WORD !");
                                     }
                                 else if(msgin.equalsIgnoreCase("7777")){
                                      dout6.writeUTF("reject");
                                          JOptionPane.showMessageDialog(null," No WORD was Entered !");    
                                        }
                                else{
               
                                         p = JOptionPane.showOptionDialog(null,"Entered word : \""+msgin+"\"","Word Validation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
              
                                         if(p==0)
                                            {
                                                           accepted(msgin);
                                                           w = weightfun(msgin);
                                                           dout6.writeUTF("3");
                                                           String str=Integer.toString(w);
                                                           dout6.writeUTF(str);
                                                
                                            }
                                         else 
                                         {   
                                                   rejected(msgin); 
                                                   dout6.writeUTF("reject");
                                         }
                                    }
                            }
          
                                    break;
                                    
                case 4:                    choice++;          System.out.println("direct 4");
                               if(!msgin.equals("exit"))
                               {
                                 msgin = din4.readUTF();
                                 System.out.println(msgin);
                                 String []options = {"Accept","Reject"};
                                if(msgin.equalsIgnoreCase("9999")){
                                     dout6.writeUTF("reject");
                                 JOptionPane.showMessageDialog(null," The Player Entered a WRONG WORD !");
                                     }
                                 else if(msgin.equalsIgnoreCase("7777")){
                                      dout6.writeUTF("reject");
                                          JOptionPane.showMessageDialog(null," No WORD was Entered !");    
                                        }
                                else{
               
                                         p = JOptionPane.showOptionDialog(null,"Entered word : \""+msgin+"\"","Word Validation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
              
                                         if(p==0)
                                            {
                                                      accepted(msgin);
                                                      w = weightfun(msgin);
                                             
                                                      dout6.writeUTF("4");
                                                      String str=Integer.toString(w);
                                                      dout6.writeUTF(str);
                                               
              
                                            }
                                         else 
                                         {  
                                                  rejected(msgin);
                                                  dout6.writeUTF("reject");
                                         }
                                    }
                            }
          
                                    break;
                                    
                                    
                case 5:      choice = 1;          System.out.println("direct 5");
                               if(!msgin.equals("exit"))
                               {
                                 msgin = din5.readUTF();
                                 System.out.println(msgin);
                                 String []options = {"Accept","Reject"};
                                if(msgin.equalsIgnoreCase("9999")){
                                     dout6.writeUTF("reject");
                                 JOptionPane.showMessageDialog(null," The Player Entered a WRONG WORD !");
                                     }
                                 else if(msgin.equalsIgnoreCase("7777")){
                                      dout6.writeUTF("reject");
                                          JOptionPane.showMessageDialog(null," No WORD was Entered !");    
                                        }
                                else{
               
                                         p = JOptionPane.showOptionDialog(null,"Entered word : \""+msgin+"\"","Word Validation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
              
                                         if(p==0)
                                            {
                                             
                                                     accepted(msgin);
                                                     w = weightfun(msgin);
                                                     dout6.writeUTF("5");
                                                     String str=Integer.toString(w);
                                                     dout6.writeUTF(str);
        
                                            }
                                         else 
                                         {  
                                                    rejected(msgin); 
                                                    dout6.writeUTF("reject");
                                         }
                                    }
                            }
          
                                    break;
                                    
                default :
       
      
       
       
      }
       
       }  
       
     }catch(HeadlessException | IOException e){}
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel rnumber;
    private javax.swing.JButton send_ch1;
    private javax.swing.JButton send_ch2;
    private javax.swing.JButton send_ch3;
    private javax.swing.JButton send_ch4;
    private javax.swing.JButton send_ch5;
    private javax.swing.JLabel sent_ch;
    private static javax.swing.JTextArea teamlist;
    // End of variables declaration//GEN-END:variables
}