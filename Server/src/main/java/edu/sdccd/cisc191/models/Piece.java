package edu.sdccd.cisc191.models;

/*
* Sean Standen - Peer Review
* I'm updating this abstract class to have integer variables for row and column
* along with getters and setters for each.  These can be used in your controller
* to place pieces on the board easily and to help clean up code in that class.
* */

public abstract class Piece {

    //Integer variables for placement on the chess board.

    //row location
    private int row;

    //column location
    private int col;

    //return this.row
    public int getRow() { return this.row; }

    //set row
    public void setRow(int row) {
        this.row = row;
    }

    //returns this.col
    public int getCol() { return this.col; }

    //set column
    public void setCol(int col) {
        this.col = col;
    }
}
