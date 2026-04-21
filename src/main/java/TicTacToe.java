public class TicTacToe {

    // 3x3 board
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();   // fill board with '-'
        printBoard();        // display board

    }
    // initialize board with '-'
    static void initializeBoard() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                board[row][col] = '-';

            }

        }

    }

    // print board clearly
    static void printBoard() {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print("| " + board[row][col] + " ");

            }

            System.out.println("|");
            System.out.println("-------------");

        }

    }

}