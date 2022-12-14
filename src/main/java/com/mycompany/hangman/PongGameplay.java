/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Gian
 */
public class PongGameplay extends JPanel implements Runnable{
    
    static final int WIDTH = 1000;
    static final int HEIGHT = (int)(WIDTH * (0.5555));
    static final Dimension SCREEN = new Dimension(WIDTH, HEIGHT);
    static final int BALL = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    
    Thread thread;
    Image image;
    Graphics graphics;
    Random random;
    PongPaddles paddle1;
    PongPaddles paddle2;
    PongBall ball;
    PongScores scores;
    
    PongGameplay(){
        newPaddles();
        newBall();
        scores = new PongScores(WIDTH, HEIGHT);
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN);
        
        thread = new Thread(this);
        thread.start();
    }
    
    public void newBall(){
        random = new Random();
        ball = new PongBall((WIDTH / 2) - (BALL / 2), random.nextInt(HEIGHT - BALL), BALL, BALL);
    }
    
    public void newPaddles(){
        paddle1 = new PongPaddles(0, (HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
        paddle2 = new PongPaddles(WIDTH - PADDLE_WIDTH, (HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);
    }
    
    @Override
    public void paint(Graphics g){
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }
    
    public void draw(Graphics g){
        paddle1.draw(g);
        paddle2.draw(g);
        ball.draw(g);
        scores.draw(g);
        Toolkit.getDefaultToolkit().sync();
    }
    
    public void move(){
        paddle1.move();
        paddle2.move();
        ball.move();
    }
    
    public void checkCollision(){
        if(ball.y <= 0){
            ball.setYDirection(-ball.yVelocity);
        }
        if(ball.y >= HEIGHT - BALL){
            ball.setYDirection(-ball.yVelocity);
        }
        
        if(ball.intersects(paddle1)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++;
            if(ball.yVelocity > 0)
                ball.yVelocity++;
            else
                ball.yVelocity--;
            
            ball.setXDirection(ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }
        if(ball.intersects(paddle2)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++;
            if(ball.yVelocity > 0)
                ball.yVelocity++;
            else
                ball.yVelocity--;
            
            ball.setXDirection(-ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }
        
        if(paddle1.y <= 0)
            paddle1.y = 0;
        if(paddle1.y >= (HEIGHT - PADDLE_HEIGHT))
            paddle1.y = HEIGHT - PADDLE_HEIGHT;
        if(paddle2.y <= 0)
            paddle2.y = 0;
        if(paddle2.y >= (HEIGHT - PADDLE_HEIGHT))
            paddle2.y = HEIGHT - PADDLE_HEIGHT;
        
        if(ball.x <= 0){
            scores.player2= scores.player2 + 10;
            end();
            newPaddles();
            newBall();
            System.out.println("Player 2: " + scores.player2);
        }
        if(ball.x >= WIDTH - BALL){
            scores.player1= scores.player1 + 10;
            end();
            newPaddles();
            newBall();
            System.out.println("Player 1: " + scores.player1);
        }
    }
    public void end(){
        if (scores.player1 == 100 || scores.player2 == 100){
            setVisible(false);
            new Menu().setVisible(true);
        }
    }
    @Override
    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            if(delta >= 1){
                move();
                checkCollision();
                repaint();
                delta--;
            }
        }
    }
    
    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            paddle1.keyPressed(e);
            paddle2.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e){
            paddle1.keyReleased(e);
            paddle2.keyReleased(e);
        }
    }
}
