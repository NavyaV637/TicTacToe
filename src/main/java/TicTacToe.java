class TicTacToe {

    // Method to check if a player has won
    static boolean checkWin(char[][] board, char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) {
                return true;
            }
        }


        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                    board[1][j] == player &&
                    board[2][j] == player) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {
            return true;
        }

        // Check anti-diagonal
        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Main method for testing
    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'X'}
        };

        char player = 'X';

        if (checkWin(board, player)) {
            System.out.println("Player " + player + " wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}