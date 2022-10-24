/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hangman;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author amelieando
 */
public class Pong extends JFrame{
    int Width = 800;
    int Height = 400;
    Dimension screenSize = new Dimension (Width, Height);
    
    Image dbImage;
    Graphics dbGraphics;
    
    static Ball b = new Ball (250, 200);

    public Pong() {
            this.setTitle("Pong");
            this.setSize(screenSize);
            this.setBackground(Color.BLACK);
            this.addKeyListener(new AL());
            this.setVisible(true);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pong pg = new Pong();

        Thread ball = new Thread (b);
        ball.start();
        Thread p1 = new Thread(b.p1);
        Thread p2 = new Thread(b.p2);
        p2.start();
        p1.start();
        }

    @Override
    public void paint(Graphics g){
        dbImage = createImage(getWidth(), getHeight());
        dbGraphics = dbImage.getGraphics();
        draw(dbGraphics);
        g.drawImage(dbImage, 0, 0, this);
        }

    public void draw (Graphics g) {
        b.draw(g);
        b.p1.draw(g);
        b.p2.draw(g);

        g.setColor(Color.WHITE);
        g.drawString(""+b.p1score, 15, 20);
        g.drawString(""+b.p2score, 385, 20);

        repaint();
        }

    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            b.p1.keyPressed(e);
            b.p2.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            b.p1.keyReleased(e);
            b.p2.keyReleased(e);
            }
        }
}
   

