package edu.sdccd.cisc191.models;

/*
* Sean Standen - Peer Review
* I added constructors that set row and col(inherited from Piece).
* */

public class Rook extends Piece {

    //Constructor - no args
    //Sets row and column both to 0 (default first rook location on board).
    public Rook() {
        this.setRow(0);
        this.setCol(0);
    }

    //Constructor - args
    //Sets row and col equal to values passed in as arguments
    public Rook(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }

    @Override
    public String toString(){
        return "R";
    }
}
