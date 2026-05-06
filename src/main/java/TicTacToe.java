import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);
    public static boolean checkWin(char[][] b, char s) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == s && b[i][1] == s && b[i][2] == s) return true;
            if (b[0][i] == s && b[1][i] == s && b[2][i] == s) return true;
        }
        if (b[0][0] == s && b[1][1] == s && b[2][2] == s) return true;
        if (b[0][2] == s && b[1][1] == s && b[2][0] == s) return true;

        return false;
    }
    public static boolean checkDraw(char[][] b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == '-') return false;
            }
        }
        return true;
    }
    public static void displayBoard(char[][] b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void playerMove(char[][] b, char symbol) {
        System.out.print("Enter row and col (0-2): ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if (b[r][c] == '-') {
            b[r][c] = symbol;
        } else {
            System.out.println("Invalid! Try again.");
            playerMove(b, symbol);
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        boolean gameOver = false;
        char currentPlayer = 'X';
        while (!gameOver) {
            displayBoard(board);
            System.out.println("Turn: " + currentPlayer);
            playerMove(board, currentPlayer);
            if (checkWin(board, currentPlayer)) {
                displayBoard(board);
                System.out.println(currentPlayer + " WINS!");
                gameOver = true;
                break;
            }
            if (checkDraw(board)) {
                displayBoard(board);
                System.out.println("It's a DRAW!");
                gameOver = true;
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}