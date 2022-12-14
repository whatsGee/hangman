/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Owner
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        playButton.setToolTipText("Click this button to start the game.");
        scoreButton.setToolTipText("Click this button to view the high scores.");
        creditButton.setToolTipText("Click this button to see who made this program.");
    
        
        KeyStroke exitKey = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        Action exitAction = new AbstractAction(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        };
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(exitKey, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", exitAction);
        
        KeyStroke creditsKey = KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0, false);
        Action creditsAction = new AbstractAction(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Credits().setVisible(true);
            }
        };
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(creditsKey, "F1");
        getRootPane().getActionMap().put("F1", creditsAction);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playButton = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        creditButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PongButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman by iDesign");
        setBackground(new java.awt.Color(153, 204, 255));
        setForeground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        playButton.setBackground(new java.awt.Color(153, 153, 153));
        playButton.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("PLAY");
        playButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton);
        playButton.setBounds(206, 148, 170, 28);

        scoreButton.setBackground(new java.awt.Color(153, 153, 153));
        scoreButton.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        scoreButton.setForeground(new java.awt.Color(255, 255, 255));
        scoreButton.setText("HIGH SCORES");
        scoreButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scoreButton);
        scoreButton.setBounds(206, 195, 170, 28);

        creditButton.setBackground(new java.awt.Color(153, 153, 153));
        creditButton.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        creditButton.setForeground(new java.awt.Color(255, 255, 255));
        creditButton.setText("CREDITS");
        creditButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(creditButton);
        creditButton.setBounds(206, 242, 170, 28);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        PongButton.setBackground(new java.awt.Color(153, 153, 153));
        PongButton.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        PongButton.setForeground(new java.awt.Color(255, 255, 255));
        PongButton.setText("PLAY PONG");
        PongButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PongButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(PongButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(PongButton)
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        dispose();
        new Game().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        dispose();
        new Scores().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        dispose();
        new Credits().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_creditButtonActionPerformed

    private void PongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PongButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        Table frame = new Table();
    }//GEN-LAST:event_PongButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PongButton;
    private javax.swing.JButton creditButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton scoreButton;
    // End of variables declaration//GEN-END:variables
}
