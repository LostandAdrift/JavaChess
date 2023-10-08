package edu.sdccd.cisc191.models;

/*
 * Sean Standen - Peer Review
 * I added constructors that set row and col(inherited from Piece).
 * */

public class Knight extends Piece {

    public Knight() {
        this.setRow(0);
        this.setCol(1);
    }

    //Constructor - args
    //Sets row and col equal to values passed in as arguments
    public Knight(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }

    @Override
    public String toString(){
        return "N";
    }
}
