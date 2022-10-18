/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Gian
 */
public class Cells extends JTextField {
    public static final Color bgGiven = new Color(240, 240, 240);
    public static final Color fgGiven = Color.BLUE;
    public static final Color fgNotGiven = Color.MAGENTA;
    public static final Color bgInput = new Color(250,250,250);
    public static final Color bgCorrect = new Color(0,200,0);
    public static final Color bgWrong = new Color (200, 0,0);
    public static final Font numbers = new Font("Copperplate Gothic Bold", Font.BOLD, 28);
    
    int row;
    int col;
    int number;
    
    GameStatus status;
    
    public Cells(int row, int col){
        super();
        this.row = row;
        this.col = col;
        super.setHorizontalAlignment(JTextField.CENTER);
        super.setFont(numbers);
    }
    
    public void newGame(int number, boolean isGiven){
        this.number = number;
        status = isGiven ? GameStatus.GIVEN : GameStatus.INPUT;
        paint();
    }
    
    public void paint(){
        if(status == GameStatus.GIVEN){
            super.setText(number + "");
            super.setEditable(false);
            super.setBackground(bgGiven);
            super.setForeground(fgGiven);
        }
        else if(status == GameStatus.INPUT){
            super.setText("");
            super.setEditable(true);
            super.setBackground(bgInput);
            super.setForeground(fgNotGiven);
        }
        else if(status == GameStatus.CORRECT){
            super.setBackground(bgCorrect);
        }
        else if(status == GameStatus.WRONG){
            super.setBackground(bgWrong);
        }
    }
}
