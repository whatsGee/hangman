/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
/**
 *
 * @author amelieando
 */ 

public class Ball implements Runnable {
    
    int x, y, xDirection, yDirection;
    
    int p1score, p2score;
    
    Paddle p1 = new Paddle(10, 25, 1);
    Paddle p2 = new Paddle(485, 25, 2);
    
    Ellipse2D ball;
    
    public Ball(int x, int y){
        p1score = p2score = 0;
        this.x = x;
        this.y = y;
        
        Random r = new Random();
        int rXDir = r.nextInt(1);
        if (rXDir == 0)
                rXDir--;
        setXDirection(rXDir);
        
        int rYDir = r.nextInt(1);
        if (rYDir == 0)
                rYDir--;
        setYDirection(rYDir);
        
        ball = new Ellipse2D.Double(this.x,this.y,25,25);
    }
    
    public void setXDirection(int xDir) {
            xDirection = xDir;
    }
    
    public void setYDirection(int yDir) {
            yDirection = yDir;
    }
    
    public void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            g.setColor(Color.WHITE);
            g2d.fill(ball);
    }
    
    public void collision(){
        if(ball.intersects(p1.paddle))
            setXDirection(+1);
        if(ball.intersects(p2.paddle))
            setXDirection(-1);
    }
    
    public void move() {
        collision();
        ball.x += xDirection;
        ball.y += yDirection;
        
        if (ball.x <= 0) {
                setXDirection(+1);
                p2score++;
        }
        
        if (ball.x >= 485) {
                setXDirection(-1);
                p1score++;
        }
        
        if (ball.y <= 15) {
                setYDirection(+1);
        }
        
        if (ball.y >= 385) {
            setYDirection(-1);
        }
    }
    
    @Override
    public void run() {
            try {
                    while (true) {
                            move();
                            Thread.sleep(8);
                    }
            }catch(Exception e) { System.err.println(e.getMessage()); }
    }
}

