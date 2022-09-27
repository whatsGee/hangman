/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colors;

/**
 *
 * @author Owner
 */
public class colorMenu extends javax.swing.JFrame {

    /**
     * Creates new form colorMenu
     */
    public colorMenu() {
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

        playButton = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        creditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Color Game by iDesign");
        setResizable(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(playButton)
                .addGap(18, 18, 18)
                .addComponent(scoreButton)
                .addGap(18, 18, 18)
                .addComponent(creditButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        dispose();
        new colorStart().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        dispose();
        new colorScores().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        dispose();
        new colorCredits().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_creditButtonActionPerformed

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
            java.util.logging.Logger.getLogger(colorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton scoreButton;
    // End of variables declaration//GEN-END:variables
}
