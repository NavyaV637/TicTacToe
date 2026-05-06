class TicTacToe {

    // Method to check draw
    static boolean isDraw(char[][] board) {

        // Traverse board to find empty cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty cell found → not draw
                }
            }
        }

        return true; // No empty cells → draw (if no winner)
    }

    // Example main method
    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };

        if (isDraw(board)) {
            System.out.println("Match is a Draw!");
        } else {
            System.out.println("Game is still ongoing.");
        }
    }
}