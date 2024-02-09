package org.example;

public class ChessBoard {

    public void displayBoard (){
        char [][] chessBoard = new char[8][8];
        chessBoard[0][0] = 'L';
        chessBoard[0][7] = 'R';
        chessBoard[7][0] = 'L';
        chessBoard[7][7] = 'R';

        for(int i=0; i<chessBoard.length; i++){
            for(int j=1; j<chessBoard.length-1; j++){
                chessBoard[i][j] = '-';
            }
        }

        for(int i=0; i<chessBoard.length; i++){
            for(int j=1; j<chessBoard.length-1; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.displayBoard();
    }
}

