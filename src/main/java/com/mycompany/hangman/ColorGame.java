/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangman;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class ColorGame extends javax.swing.JFrame {

    /**
     * Creates new form ColorGame
     */
    public ColorGame() {
        initComponents();
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        jLabel2.setText("Score : " + String.valueOf(Score));
        setRandom();
        setForeground();
        endPage.setVisible(false);
    }
    public ColorGame(int scores){
        Score = scores;
        initComponents();
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        jLabel2.setText("Score : " + String.valueOf(scores));
        setRandom();
        setForeground();
        endPage.setVisible(false);
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endPage = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        blueBtn = new javax.swing.JButton();
        redBtn = new javax.swing.JButton();
        purpleBtn = new javax.swing.JButton();
        greenBtn = new javax.swing.JButton();
        yellowBtn = new javax.swing.JButton();
        randCol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Color Game");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        endPage.setLayout(null);

        jButton1.setText("END");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        endPage.add(jButton1);
        jButton1.setBounds(100, 120, 100, 40);

        jLabel1.setText("Score");
        endPage.add(jLabel1);
        jLabel1.setBounds(130, 90, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("Game Over!");
        endPage.add(jLabel3);
        jLabel3.setBounds(80, 60, 150, 30);

        getContentPane().add(endPage);
        endPage.setBounds(140, 80, 300, 230);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(null);

        blueBtn.setBackground(new java.awt.Color(51, 51, 255));
        blueBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blueBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blueBtnMouseExited(evt);
            }
        });
        blueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueBtnActionPerformed(evt);
            }
        });
        jPanel1.add(blueBtn);
        blueBtn.setBounds(260, 170, 100, 100);

        redBtn.setBackground(new java.awt.Color(255, 102, 102));
        redBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                redBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redBtnMouseExited(evt);
            }
        });
        redBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBtnActionPerformed(evt);
            }
        });
        jPanel1.add(redBtn);
        redBtn.setBounds(50, 90, 100, 100);

        purpleBtn.setBackground(new java.awt.Color(204, 51, 255));
        purpleBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purpleBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purpleBtnMouseExited(evt);
            }
        });
        purpleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(purpleBtn);
        purpleBtn.setBounds(430, 260, 100, 100);

        greenBtn.setBackground(new java.awt.Color(153, 255, 153));
        greenBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        greenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                greenBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                greenBtnMouseExited(evt);
            }
        });
        greenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(greenBtn);
        greenBtn.setBounds(100, 240, 100, 100);

        yellowBtn.setBackground(new java.awt.Color(255, 255, 153));
        yellowBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yellowBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yellowBtnMouseExited(evt);
            }
        });
        yellowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(yellowBtn);
        yellowBtn.setBounds(430, 100, 100, 100);

        randCol.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        randCol.setForeground(new java.awt.Color(255, 255, 255));
        randCol.setText("Color");
        jPanel1.add(randCol);
        randCol.setBounds(220, 30, 190, 50);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Score");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 20, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 400);

        setSize(new java.awt.Dimension(616, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void blueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueBtnActionPerformed
        Number = 1;
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        setScore();
        setRandom();
        setForeground();
        
        Random r = new Random();
        blueBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        greenBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        yellowBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        purpleBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        redBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        Counter++;
        endGame();
        jLabel2.setText("Score : " + String.valueOf(Score));
// TODO add your handling code here:
    }//GEN-LAST:event_blueBtnActionPerformed

    private void blueBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueBtnMouseEntered
      blueBtn.setBackground(Color.blue); // TODO add your handling code here:
    }//GEN-LAST:event_blueBtnMouseEntered

    private void blueBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueBtnMouseExited
      blueBtn.setBackground(new Color(51, 102, 255)); // TODO add your handling code here:
    }//GEN-LAST:event_blueBtnMouseExited

    private void greenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenBtnActionPerformed
        Number = 2;
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        setScore();
        setRandom();
        setForeground();
        
        Random r = new Random();
        blueBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        greenBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        yellowBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        purpleBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        redBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        Counter++;
        endGame();
        jLabel2.setText("Score : " + String.valueOf(Score));
// TODO add your handling code here:
    }//GEN-LAST:event_greenBtnActionPerformed

    private void redBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redBtnMouseEntered
       redBtn.setBackground(Color.red); // TODO add your handling code here:
    }//GEN-LAST:event_redBtnMouseEntered

    private void redBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redBtnMouseExited
       redBtn.setBackground(new Color(255,102,102)); // TODO add your handling code here:
    }//GEN-LAST:event_redBtnMouseExited

    private void greenBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenBtnMouseEntered
       greenBtn.setBackground(Color.green); // TODO add your handling code here:
    }//GEN-LAST:event_greenBtnMouseEntered

    private void greenBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenBtnMouseExited
       greenBtn.setBackground(new Color(153,255,153)); // TODO add your handling code here:
    }//GEN-LAST:event_greenBtnMouseExited

    private void yellowBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowBtnMouseEntered
       yellowBtn.setBackground(Color.yellow); // TODO add your handling code here:
    }//GEN-LAST:event_yellowBtnMouseEntered

    private void yellowBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowBtnMouseExited
       yellowBtn.setBackground(new Color(255,255,153)); // TODO add your handling code here:
    }//GEN-LAST:event_yellowBtnMouseExited

    private void purpleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purpleBtnMouseEntered
       purpleBtn.setBackground(new Color(153,0,255)); // TODO add your handling code here:
    }//GEN-LAST:event_purpleBtnMouseEntered

    private void purpleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purpleBtnMouseExited
       purpleBtn.setBackground(new Color(204,51,255)); // TODO add your handling code here:
    }//GEN-LAST:event_purpleBtnMouseExited

    private void redBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBtnActionPerformed
       randCol.setText(randColor.getRandomColor(randColor.colorString()));
       Number = 3;
       setScore();
       setRandom();
       setForeground();
        
       Random r = new Random();
       blueBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
       greenBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
       yellowBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
       purpleBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
       redBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
       Counter++;
       endGame();
       jLabel2.setText("Score : " + String.valueOf(Score));
       // TODO add your handling code here:
    }//GEN-LAST:event_redBtnActionPerformed

    private void yellowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowBtnActionPerformed
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        Number = 4;
        setScore();
        setRandom();
        setForeground();
        
        Random r = new Random();
        blueBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        greenBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        yellowBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        purpleBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        redBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        Counter++;
        endGame();
        jLabel2.setText("Score : " + String.valueOf(Score));
// TODO add your handling code here:
    }//GEN-LAST:event_yellowBtnActionPerformed

    private void purpleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleBtnActionPerformed
        randCol.setText(randColor.getRandomColor(randColor.colorString()));
        Number = 5;
        setScore();
        setRandom();
        setForeground();
                
        Random r = new Random();
        blueBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        greenBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        yellowBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        purpleBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        redBtn.setLocation(r.nextInt(500), r.nextInt(250-150)+150);
        Counter++;
        endGame();
        jLabel2.setText("Score : " + String.valueOf(Score));
// TODO add your handling code here:
    }//GEN-LAST:event_purpleBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Menu().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    colorGenerator randColor = new colorGenerator();
    
    public class colorGenerator{
        private ArrayList<String> col = new ArrayList();
        
        public colorGenerator(){
            colorRandomizer();
        }
        
        public ArrayList<String> colorString(){
            return col;
        }
        
        public String getRandomColor(ArrayList<String> list) {
            return list.get(new Random().nextInt(list.size()));
        }
        
        private void colorRandomizer(){
            col.add("BLUE");
            col.add("RED");
            col.add("YELLOW");
            col.add("PURPLE");
            col.add("GREEN");
        }
    }
    public void setForeground(){
        if (Random == 1){
            randCol.setForeground(Color.blue);
        }
        else if (Random == 2){
            randCol.setForeground(Color.green);
        }
        else if (Random == 3){
            randCol.setForeground(Color.red);
        }
        else if (Random == 4){
            randCol.setForeground(Color.yellow);
        }
        else if (Random == 5){
            randCol.setForeground(new Color(204,51,255));
        }
    }
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
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorGame().setVisible(true);
            }
        });
    }
    private int Score;
    private int Random;
    private int Counter = 0;
    private int Number = 0;
    
    public int getScore(){
        return Score;
    }
    public void setRandom(){
        Random m = new Random();
        Random = m.nextInt(6 - 1) +1;
    }
    public void setScore(){
        if(Random == Number){
            Score = Score +100;
        }
    }
    
    public void endGame(){
        if(Counter == 5){
            blueBtn.setVisible(false);
            yellowBtn.setVisible(false);
            purpleBtn.setVisible(false);
            greenBtn.setVisible(false);
            redBtn.setVisible(false);
            randCol.setVisible(false);
            endPage.setVisible(true);
            jLabel1.setText("Score : " + String.valueOf(Score));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueBtn;
    private javax.swing.JPanel endPage;
    private javax.swing.JButton greenBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton purpleBtn;
    private javax.swing.JLabel randCol;
    private javax.swing.JButton redBtn;
    private javax.swing.JButton yellowBtn;
    // End of variables declaration//GEN-END:variables
}
