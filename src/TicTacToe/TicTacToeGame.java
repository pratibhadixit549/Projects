package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    static Scanner scanner = new Scanner(System.in);
    static String[] board = new String[9];
    static String turn = "X";
    String winner = null;
    Random generator = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++)
            scanner = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        populateEmptyBoard();

        System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
        printBoard();
        System.out.println("X's will play first. Enter a slot number to place X in:");


    }

    private static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");
    }

    private static void populateEmptyBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }
}
