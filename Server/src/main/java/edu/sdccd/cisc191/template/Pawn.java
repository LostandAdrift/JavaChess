package edu.sdccd.cisc191.template;

public class Pawn extends Piece{
    private int row;
    private boolean isBlack;

    public Pawn (int row, boolean color) {
        this.row = row;
        this.isBlack=color;
    }


}
