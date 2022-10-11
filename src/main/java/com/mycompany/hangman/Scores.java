/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hangman;

/**
 *
 * @author Owner
 */
public class Scores extends javax.swing.JFrame {

    /**
     * Creates new form Scores
     */
    public Scores() {
        initComponents();
    }
    
    public Scores(int score) {
        initComponents();
        newScore = score;
        InOut();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Score5 = new javax.swing.JLabel();
        backScores2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Score1 = new javax.swing.JLabel();
        Score2 = new javax.swing.JLabel();
        Score3 = new javax.swing.JLabel();
        Score4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Scoreboard");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        jLabel1.setText("Scoreboard");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(154, 65, 279, 58);

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setText("Name                       Score");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(144, 129, 320, 35);

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel2.setText("___");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 170, 40, 30);

        Score5.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        Score5.setText("___");
        getContentPane().add(Score5);
        Score5.setBounds(420, 320, 40, 30);

        backScores2.setBackground(new java.awt.Color(153, 153, 153));
        backScores2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        backScores2.setForeground(new java.awt.Color(255, 255, 255));
        backScores2.setText("Back");
        backScores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backScores2ActionPerformed(evt);
            }
        });
        getContentPane().add(backScores2);
        backScores2.setBounds(6, 365, 72, 23);

        jLabel5.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel5.setText("___");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 200, 36, 30);

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel6.setText("___");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 240, 40, 30);

        jLabel7.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel7.setText("___");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 280, 40, 30);

        jLabel8.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel8.setText("___");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 320, 40, 30);

        Score1.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        Score1.setText("___");
        getContentPane().add(Score1);
        Score1.setBounds(420, 170, 40, 30);

        Score2.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        Score2.setText("___");
        getContentPane().add(Score2);
        Score2.setBounds(420, 200, 40, 30);

        Score3.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        Score3.setText("___");
        getContentPane().add(Score3);
        Score3.setBounds(420, 240, 40, 30);

        Score4.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        Score4.setText("___");
        getContentPane().add(Score4);
        Score4.setBounds(420, 280, 40, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backScores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backScores2ActionPerformed
        dispose();
        new Menu().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_backScores2ActionPerformed

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
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scores().setVisible(true);
            }
        });
    }
    private int newScore;
    private int newentry;
    private int highScore1;
    private int highScore2;
    private int highScore3;
    private int highScore4;
    private int highScore5;
    private String Name1;
    private String Name2;
    private String Name3;
    private String Name4;
    private String Name5;
    private int x = 0;
    Integer [] Scores = new Integer [5];
    public Integer[] getAllscores(){
        highScore1 = Scores[0];
        printScore1();
        highScore2 = Scores[1];
        printScore2();
        highScore3 = Scores[2];
        printScore3();
        highScore4 = Scores[3];
        printScore4();
        highScore5 = Scores[4];
        printScore5();
        return Scores;
    }
        public void setScore(){
        if(newentry == 0){
            highScore1 = Scores[0];
            printScore1();
        }
        else if(newentry == 1){
            highScore2 = Scores[1];
            printScore2();
        }
        else if(newentry == 2){
            highScore3 = Scores[2];
            printScore3();
        }
        else if(newentry == 3){
            highScore4 = Scores[3];
            printScore4();
        }
        else if(newentry == 4){
            highScore5 = Scores[4];
            printScore5();
        }
    }
    public void InOut(){
        for(int i = 0; i<Scores.length; i++){
                if(Scores[i] == null){
                    newentry = i;
                    Scores[newentry] = newScore;
                    setScore();
                    dispose();
                    new ColorGame(newScore,false).setVisible(true);
                    break;
                }
                else if(Scores[i] < newScore){
                    compare();
                    break;
                }
                else {
                    dispose();
                    new ColorGame(newScore,false).setVisible(true);
                    break;
                }    
        }
    }
    public void compare(){
        if(x < 5){
            if (Scores[x] != null){
                if(Scores[x] > newScore){
                    x++;
                    compare();
                }
                else if(Scores[x] < newScore){
                    newentry = x;
                    pop();
                }
            }
            else{
                newentry = x;
                setScore();
            }
        }
    }
    public void pop(){
        int temp = Scores[newentry];
        int temp2;
        Scores[newentry] = newScore;
        for(int i = newentry;i<Scores.length;i++){
            temp2 = Scores[i + 1];
            Scores[i + 1] = temp;
            temp = temp2;
        }
        getAllscores();
    }
    public void printScore1(){
    Score1.setText(String.valueOf(highScore1));
    }
    public void printScore2(){
    Score2.setText(String.valueOf(highScore2));
    }
    public void printScore3(){
    Score3.setText(String.valueOf(highScore3));
    }
    public void printScore4(){
    Score4.setText(String.valueOf(highScore4));
    }
    public void printScore5(){
    Score5.setText(String.valueOf(highScore5));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score1;
    private javax.swing.JLabel Score2;
    private javax.swing.JLabel Score3;
    private javax.swing.JLabel Score4;
    private javax.swing.JLabel Score5;
    private javax.swing.JButton backScores2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
