package edu.sdccd.cisc191.controllers;
import edu.sdccd.cisc191.models.*;

import java.util.Scanner;

public class GameBoard {
    Piece[][] boardState;

    // Constructor
    public GameBoard(){
        resetBoard();
    }

    // Generate a new GameBoard
    public void resetBoard(){
        this.boardState = new Piece [8][8];

        // Add pawns to the board
        for(int x=0; x<8; x++){
            this.boardState[x][1] = new Pawn();
            this.boardState[x][6] = new Pawn();
        }

        // Add rooks to the board
        this.boardState[0][0] = new Rook();
        this.boardState[7][0] = new Rook();
        this.boardState[0][7] = new Rook();
        this.boardState[7][7] = new Rook();

        // Add Knights to the board
        this.boardState[1][0] = new Knight();
        this.boardState[6][0] = new Knight();
        this.boardState[1][7] = new Knight();
        this.boardState[6][7] = new Knight();

        // Add Bishops to the board
        this.boardState[2][0] = new Bishop();
        this.boardState[5][0] = new Bishop();
        this.boardState[2][7] = new Bishop();
        this.boardState[5][7] = new Bishop();

        // Add Queens to the board
        this.boardState[3][0] = new Queen();
        this.boardState[3][7] = new Queen();

        // Add Kings to the board
        this.boardState[4][0] = new King();
        this.boardState[4][7] = new King();
    }

    // Print out the board to the terminal
    public void printGameBoard(){
        // Iterate across game Board printing out pieces
       for (int column=7; column>=0;column--){
           for (int row=0;row<8;row++){
               Piece currentPiece = boardState[row][column];

               if (currentPiece != null){
                   System.out.print(currentPiece.toString());
               }
               else
                   System.out.print("-");
           }
           // Used to skip the row
           System.out.println(" ");
       }
    }

    // Generate a start screen for the text game
    public void startScreen(){
        System.out.println("Start Game");
        System.out.println("1) New Game");
        System.out.println("0) Exit");
    }

    // Update Pieces on the board
    public void updateBoard(){
        // Prompt user for input on the movement of the pieces
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Start Position");
        System.out.print("Row: ");
        int row1 = scanObject.nextInt();
        System.out.print("Column: ");
        int column1 = scanObject.nextInt();
        System.out.println("End Position");
        System.out.print("Row: ");
        int row2 = scanObject.nextInt();
        System.out.print("Column: ");
        int column2 = scanObject.nextInt();

        // Move the Pieces
        Piece pieceToMove = boardState[column1][row1];
        boardState[column2 ][row2] = pieceToMove;
        boardState[column1][row1] = null;
    }

    // Play chess via terminal
    public void playGame(){
        Scanner scanObject = new Scanner(System.in);
        int answer = 9;
        startScreen();
        // Loop to re-run until user exits
        while (answer!=0){
            printGameBoard();
            System.out.println("1) Move Piece");
            System.out.println("0) Exit");
            answer = scanObject.nextInt();
            if (answer == 1)
                updateBoard();
            }
        }
    }