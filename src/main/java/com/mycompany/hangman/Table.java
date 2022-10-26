/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Gian
 */
public class Table extends JFrame {
    
    PongGameplay panel;
    
    Table(){
        panel = new PongGameplay();
        this.add(panel);
        this.setTitle("Ping Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
    
}
