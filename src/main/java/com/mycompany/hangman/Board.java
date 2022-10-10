/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Gian
 */
public class Board extends JPanel {
    public static final int GRID_SIZE = 9;
    public static final int INNER_GRID_SIZE = 3;
    public static final int CELLS = 60;
    public static final int BOARD_WIDTH = CELLS * GRID_SIZE;
    public static final int BOARD_HEIGHT = CELLS * GRID_SIZE;
    
    private Cells[][] cells  = new Cells[GRID_SIZE][GRID_SIZE];
    private Gameplay game = new Gameplay();
    
    public Board(){
        super.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        
        for(int row = 0; row < GRID_SIZE; ++row){
            for(int col = 0; col < GRID_SIZE; ++col){
                cells[row][col] = new Cells(row, col);
                super.add(cells[row][col]);
            }
        }
    }
    
    public void GameBoard(){
        game.newGame(2);
        
        for(int row = 0; row < GRID_SIZE; ++row)
            for(int col = 0; col < GRID_SIZE; ++col)
                cells[row][col].newGame(game.num[row][col], game.isGiven[row][col]);
    }
    
    public boolean isGuessed(){
        for(int row = 0; row < GRID_SIZE; ++row){
            for(int col = 0; col < GRID_SIZE; ++col){
                if(cells[row][col].status == GameStatus.INPUT || cells[row][col].status == GameStatus.WRONG)
                    return false;
            }
        }
        return true;
    }
    
    private class CellInputListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Cells source = (Cells)e.getSource();
            
            int numInput = Integer.parseInt(source.getText());
            System.out.println("Input: " + numInput);
            
            if(numInput == source.number)
                source.status = GameStatus.CORRECT;
            else
                source.status = GameStatus.WRONG;
            
            source.paint();
        }
    }
}
