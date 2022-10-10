/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hangman;

/**
 *
 * @author Gian
 */
public class Gameplay {
    int[][] num = new int[Board.GRID_SIZE][Board.GRID_SIZE];
    boolean[][] isGiven = new boolean[Board.GRID_SIZE][Board.GRID_SIZE];
    
    public Gameplay(){
        super();
    }
    
    public void newGame(int numberSheet){
        int[][] nums = {{8, 3, 5, 4, 1, 6, 9, 2, 7},
                        {2, 9, 6, 8, 5, 7, 4, 3, 1},
                        {4, 1, 7, 2, 9, 3, 6, 5, 8},
                        {5, 6, 9, 1, 3, 4, 7, 8, 2},
                        {1, 2, 3, 6, 7, 8, 5, 4, 9},
                        {7, 4, 8, 5, 2, 9, 1, 6, 3},
                        {6, 5, 2, 7, 8, 1, 3, 9, 4},
                        {9, 8, 1, 3, 4, 5, 2, 7, 6},
                        {3, 7, 4, 9, 6, 2, 8, 1, 5}};
        
        for(int row = 0; row < Board.GRID_SIZE; ++row)
            for(int col = 0; col < Board.GRID_SIZE; ++col)
                num[row][col] = nums[row][col];
        
        boolean[][] givenNums = {{false, true, true, false, true, false, true, true, false},
                                {true, true, true, true, true, true, false, true, true},
                                {true, false, true, true, true, true, false, false, true},
                                {false, true, false, true, false, true, false, false, true},
                                {true, true, true, true, false, true, true, true, true},
                                {true, false, false, true, false, true, false, true, false},
                                {true, false, false, true, true, true, true, false, true},
                                {true, true, false, true, true, true, true, true, true},
                                {false, true, true, false, true, false, true, true, false}};
        
        for(int row = 0; row < Board.GRID_SIZE; ++row)
            for(int col = 0; col < Board.GRID_SIZE; ++col)
                isGiven[row][col] = givenNums[row][col];
    }
}
