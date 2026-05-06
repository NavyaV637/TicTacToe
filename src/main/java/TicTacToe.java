import java.util.Random;

public class TicTacToe {
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
    public static boolean isValidMove(char[][] board, int row, int col) {
        return board[row][col] == '-';
    }
    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();
        int slot, row, col;

        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9
            int[] pos = convertSlotToPosition(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(board, row, col)) {
                updateBoard(board, row, col, symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        computerMove(board, 'O');
        displayBoard(board);
    }
}