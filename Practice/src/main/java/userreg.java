
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class userreg extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Frame2
     */
    public userreg() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Register = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        userinput = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        genderselect = new javax.swing.JComboBox<>();
        gender = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        maile = new javax.swing.JTextField();
        Username1 = new javax.swing.JLabel();
        passinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        regclick = new javax.swing.JButton();
        phoneinput1 = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Go back in Odd even");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jButton2.setText("Go back In Color Changer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        Register.setText("Register Form");
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 160, 20));

        Fname.setText("jTextField1");
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 30));

        firstname.setText("Last Name");
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        Lname.setText("jTextField1");
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 180, 30));

        Address.setText("jTextField1");
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 180, 30));

        userinput.setText("jTextField1");
        jPanel1.add(userinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 180, 30));

        lastname.setText("First Name");
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        genderselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(genderselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        gender.setText("Gender");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, 20));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        email1.setText("Email");
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        maile.setText("jTextField1");
        jPanel1.add(maile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, 30));

        Username1.setText("Username");
        jPanel1.add(Username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        passinput.setText("jTextField1");
        jPanel1.add(passinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 180, 30));

        jLabel1.setText("Phone Number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        regclick.setText("Register");
        regclick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclickActionPerformed(evt);
            }
        });
        jPanel1.add(regclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        phoneinput1.setText("jTextField1");
        jPanel1.add(phoneinput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 180, 30));

        LogIn.setText("Click here to Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel1.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OddFrame jf2 = new OddFrame();   
        jf2.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NewJFrame jf1 = new NewJFrame();
        jf1.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void regclickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclickActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO `user`(`fname`, `lname`, `addr`, `gender`, `email`, `phone`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/userreg", "root", "null");
                    pst=con.prepareStatement(query);
                    pst.setString(1, Fname.getText());
                    pst.setString(2, Lname.getText());
                    pst.setString(3, Address.getText());
                    pst.setString(4, genderselect.getSelectedItem().toString());
                    pst.setString(5, maile.getText());
                    pst.setString(6, passinput.getText());
                    pst.setString(7, userinput.getText());
                    pst.setString(8, passinput.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "REGISTER SUCESSFULLY");
                    
                    
                    
                    
                    
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
    }//GEN-LAST:event_regclickActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
        SystemLog jf4 = new SystemLog();
        jf4.show();
        
        dispose();
    }//GEN-LAST:event_LogInActionPerformed

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
            java.util.logging.Logger.getLogger(userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel Username1;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderselect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField maile;
    private javax.swing.JTextField passinput;
    private javax.swing.JTextField phoneinput1;
    private javax.swing.JButton regclick;
    private javax.swing.JTextField userinput;
    // End of variables declaration//GEN-END:variables
}