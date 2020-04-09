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

    }

    private static void populateEmptyBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }
}
