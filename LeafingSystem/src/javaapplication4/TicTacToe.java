/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class TicTacToe extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    
    private void gameScore() 
    {
        Score1.setText(String.valueOf(xCount));
        Score2.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void WinningGame()
    {
        String b1 = button1.getText();
        String b2 = button2.getText();
        String b3 = button3.getText();
        
        String b4 = button4.getText();
        String b5 = button5.getText();
        String b6 = button6.getText();
        
        String b7 = button7.getText();
        String b8 = button8.getText();
        String b9 = button9.getText();
        
        // Player X code
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button1.setBackground(Color.ORANGE);
            button2.setBackground(Color.ORANGE);
            button3.setBackground(Color.ORANGE);
        }
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button4.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button6.setBackground(Color.ORANGE);
        }
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button7.setBackground(Color.ORANGE);
            button8.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button1.setBackground(Color.ORANGE);
            button4.setBackground(Color.ORANGE);
            button7.setBackground(Color.ORANGE);
        }
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button2.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button8.setBackground(Color.ORANGE);
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button3.setBackground(Color.ORANGE);
            button6.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
         if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button1.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
          if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            button3.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button7.setBackground(Color.ORANGE);
        }

        // Player 0 Code
         if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button1.setBackground(Color.BLUE);
            button2.setBackground(Color.BLUE);
            button3.setBackground(Color.BLUE);
        }
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button4.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button6.setBackground(Color.ORANGE);
        }
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button7.setBackground(Color.ORANGE);
            button8.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button1.setBackground(Color.ORANGE);
            button4.setBackground(Color.ORANGE);
            button7.setBackground(Color.ORANGE);
        }
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button2.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button8.setBackground(Color.ORANGE);
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button3.setBackground(Color.ORANGE);
            button6.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
       if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button1.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button9.setBackground(Color.ORANGE);
        }
      if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            button3.setBackground(Color.ORANGE);
            button5.setBackground(Color.ORANGE);
            button7.setBackground(Color.ORANGE);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Player1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        Score1 = new javax.swing.JLabel();
        Score2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 100));

        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 100));

        button3.setBackground(new java.awt.Color(204, 204, 204));
        button3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, 100));

        button4.setBackground(new java.awt.Color(204, 204, 204));
        button4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 100));

        button5.setBackground(new java.awt.Color(204, 204, 204));
        button5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 110, 100));

        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 100));

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 100));

        button8.setBackground(new java.awt.Color(204, 204, 204));
        button8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 100));

        button9.setBackground(new java.awt.Color(204, 204, 204));
        button9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 6, true));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel1.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, 100));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 110, 40));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 110, 40));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Player1.setText("Player X:");
        jPanel3.add(Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Player2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Player2.setText("Player Y:");
        jPanel3.add(Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Score1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(Score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        Score2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(Score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 400, 220));

        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/back_to_30px.png"))); // NOI18N
        jMenuItem1.setText("Go back In MainBoard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/close_sign_30px.png"))); // NOI18N
        jMenuItem2.setText("LogOut");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About Us");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/add_user_group_man_man_40px.png"))); // NOI18N
        jMenuItem3.setText("About our team");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
       button1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button1.setForeground(Color.RED);
        }
        else
        {
            button1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    
        
    }//GEN-LAST:event_button1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit",
                "Tic Tac Toe" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        button1.setText(null);
        button2.setText(null);
        button3.setText(null);
        
        button4.setText(null);
        button5.setText(null);
        button6.setText(null);
        
        button7.setText(null);
        button8.setText(null);
        button9.setText(null);
        
        button1.setBackground(Color.LIGHT_GRAY);
         button2.setBackground(Color.LIGHT_GRAY);
          button3.setBackground(Color.LIGHT_GRAY);
           button4.setBackground(Color.LIGHT_GRAY);
            button5.setBackground(Color.LIGHT_GRAY);
             button6.setBackground(Color.LIGHT_GRAY);
              button7.setBackground(Color.LIGHT_GRAY);
               button8.setBackground(Color.LIGHT_GRAY);
                button9.setBackground(Color.LIGHT_GRAY);
        
  
                
    }//GEN-LAST:event_ResetActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         button2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button2.setForeground(Color.RED);
        }
        else
        {
            button2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        button3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button3.setForeground(Color.RED);
        }
        else
        {
            button3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        button4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button4.setForeground(Color.RED);
        }
        else
        {
            button4.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        button5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button5.setForeground(Color.RED);
        }
        else
        {
            button5.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        button6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button6.setForeground(Color.RED);
        }
        else
        {
            button6.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        button7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button7.setForeground(Color.RED);
        }
        else
        {
            button7.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        button8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button8.setForeground(Color.RED);
        }
        else
        {
            button8.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        button9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x"))
        {
            button9.setForeground(Color.RED);
        }
        else
        {
            button9.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_button9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response ==JOptionPane.YES_OPTION) {
                 LogIn jf5 = new LogIn();
        jf5.show();

        dispose();
        } else if(response ==JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         int response = JOptionPane.showConfirmDialog(this, "Do you want to Go back", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response ==JOptionPane.YES_OPTION) {
                 LoggedIn jf5 = new LoggedIn();
        jf5.show();

        dispose();
        } else if(response ==JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\eduar\\Documents\\NetBeansProjects\\html files\\first.html" );

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Check file details");
        }
        {
            
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Score1;
    private javax.swing.JLabel Score2;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
