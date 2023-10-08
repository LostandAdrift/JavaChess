package edu.sdccd.cisc191.models;

/*
 * Sean Standen - Peer Review
 * I added constructors that set row and col(inherited from Piece).
 * */

public class Queen extends Piece {

    //Constructor - no args
    //Sets row to 1 and col to 0 (default first pawn location on board).
    public Queen() {
        this.setRow(0);
        this.setCol(3);
    }

    //Constructor - args
    //Sets row and col equal to values passed in as arguments
    public Queen(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }

    @Override
    public String toString(){
        return "Q";
    }
}
