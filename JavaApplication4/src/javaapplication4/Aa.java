package javaapplication4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eduar
 */
import java.util.Random;
import javax.swing.JOptionPane;


public class Aa extends javax.swing.JFrame {

    static int score = 0; // score of each correct question
       static int count = 0; // number of questions
       
       // we need To generate random number
       Random r = new Random();
       int randomNum; 
    /**
     * Creates new form ODDEVEN
     */
    public Aa() {
        initComponents();
         randomNum = r.nextInt(200);
         Number3.setText(String.valueOf(randomNum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ODD1 = new javax.swing.JButton();
        EVEN1 = new javax.swing.JButton();
        Number3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ODD1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ODD1.setText("ODD");
        ODD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODD1ActionPerformed(evt);
            }
        });
        jPanel1.add(ODD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 156, 55));

        EVEN1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EVEN1.setText("EVEN");
        EVEN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVEN1ActionPerformed(evt);
            }
        });
        jPanel1.add(EVEN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 169, 55));

        Number3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(Number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Score");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        Score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 45, 16));

        jMenu1.setText("File");

        jMenuItem1.setText("Go back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Log Out");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ODD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODD1ActionPerformed
        // TODO add your handling code here:
        
        // generate numbers but it will ever count to 10 questions
        
        count = count+1;
        int num = Integer.parseInt(Number3.getText());
        if (count == 10) {
            
            if(num%2!=0) {
                score = score+1; // adds score
                Score.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                
            }else {
                // if not odd
               randomNum = r.nextInt(100);
               Number3.setText(String.valueOf(randomNum));
            }
         JOptionPane.showMessageDialog(this, "Your score is: " +score+ "/10");
         //resetValues 
         count =0;
         score =0;
         Score.setText("");
         randomNum = r.nextInt(100);
         Number3.setText(String.valueOf(randomNum));
         
        } else {  
            if(num%2!=0) {
                score = score+1; // adds score
                Score.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                Number3.setText(String.valueOf(randomNum));
                
        } else {
                randomNum = r.nextInt(100);
                Number3.setText(String.valueOf(randomNum));
            }
     
        }
        
        
    }//GEN-LAST:event_ODD1ActionPerformed

    private void EVEN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVEN1ActionPerformed
        // TODO add your handling code here:
        count = count+1;
        int num = Integer.parseInt(Number3.getText());
        if (count == 100) {
            
            if(num%2==0) {
                score = score+1; // adds score
                Score.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                
            }else {
                // if not odd
               randomNum = r.nextInt(100);
               Number3.setText(String.valueOf(randomNum));
            }
         JOptionPane.showMessageDialog(this, "Your score is: " +score + "/100");
         //resetValues 
         count =0;
         score =0;
         Score.setText("");
         randomNum = r.nextInt(100);
         Number3.setText(String.valueOf(randomNum));
         
        } else {  
            if(num%2==0) {
                score = score+1; // adds score
                Score.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                Number3.setText(String.valueOf(randomNum));
                
        } else {
                randomNum = r.nextInt(100);
                Number3.setText(String.valueOf(randomNum));
            }
     
        }
        
            
    }//GEN-LAST:event_EVEN1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LogIn jf6 = new LogIn();   
        jf6.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userreg jf7 = new userreg();
        jf7.show();
        
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response ==JOptionPane.YES_OPTION) {
                 LoggedIn jf5 = new LoggedIn();
        jf5.show();

        dispose();
        } else if(response ==JOptionPane.NO_OPTION) {
            
            
        };
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(OddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Aa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EVEN1;
    private javax.swing.JLabel Number3;
    private javax.swing.JButton ODD1;
    private javax.swing.JLabel Score;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}