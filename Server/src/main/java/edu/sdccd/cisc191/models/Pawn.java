package edu.sdccd.cisc191.models;

/*
 * Sean Standen - Peer Review
 * I added constructors that set row and col(inherited from Piece).
 * */

public class Pawn extends Piece {

    //Constructor - no args
    //Sets row to 1 and col to 0 (default first pawn location on board).
    public Pawn() {
        this.setRow(1);
        this.setCol(0);
    }

    //Constructor - args
    //Sets row and col equal to values passed in as arguments
    public Pawn(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }

    public String toString(){
        return "P";
    }

}
