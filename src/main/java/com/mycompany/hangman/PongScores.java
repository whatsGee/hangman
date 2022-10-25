/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.*;

/**
 *
 * @author Gian
 */
public class PongScores extends Rectangle{
    static int WIDTH;
    static int HEIGHT;
    int player1;
    int player2;
    
    PongScores(int WIDTH, int HEIGHT){
        PongScores.WIDTH = WIDTH;
        PongScores.HEIGHT = HEIGHT;
    }
    
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 60));
        
        g.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
        
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (WIDTH / 2) - 85, 50);
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (WIDTH / 2) + 20, 50);
    }
    
}
