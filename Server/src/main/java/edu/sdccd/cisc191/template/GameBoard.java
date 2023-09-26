package edu.sdccd.cisc191.template;

public class GameBoard {
    Piece [][] boardState;

    // Main method to test the classes
    public static void main(String[] args) {
        GameBoard myBoard = new GameBoard();
        myBoard.printGameBoard();;
    }

    // Constructor
    public GameBoard(){
        newGame();
    }

    // Generate the gamePiece Board
    public void newGame(){
        this.boardState = new Piece [8][8] ;

        // Add pawns to the row
        for(int x=0;x<8;x++){
           this.boardState[x][1] = new Pawn(x,false);
           this.boardState[x][6] = new Pawn(x, true);
        }
    }

    // Print out the gameboard as a series of characters
    public void printGameBoard(){
       // Iterate down the column then across the row
       for (int column=0; column<8;column++){
           for (int row=0;row<8;row++){
               //
               if(boardState[row][column] instanceof Pawn){
                   System.out.print("P");
               }
               else
                   System.out.print("-");
           }
           System.out.println(" ");
       }
    }
}
