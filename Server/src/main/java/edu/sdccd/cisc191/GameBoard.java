package edu.sdccd.cisc191;
import java.util.Scanner;

public class GameBoard {
    Piece [][] boardState;

    // Main method to test the class
    public static void main(String[] args) {
        GameBoard myBoard = new GameBoard();
        myBoard.printGameBoard();
    }

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
       for (int column=0; column<8;column++){
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
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Start Position:");
        System.out.println("Row: ");
        int row1 = scanObject.nextInt();
        int column1 = scanObject.nextInt();
        System.out.println("End Position: ");



    }

    // Move chess pieces
    public void startGame(){
        int answer=9;
        Scanner scanObject = new Scanner(System.in);
        while (answer!=0){
            printGameBoard();

        }
    }

    // Play chess via terminal
    public void playGame(){
        Scanner scanObject = new Scanner(System.in);
        int answer = 9;
        // Loop to re-run until user exits
        while (answer!=0){
            answer = scanObject.nextInt();
            startScreen();
            if (answer == 0){
                startGame();
            }
        }
    }
}
