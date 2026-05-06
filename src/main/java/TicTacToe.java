import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {

        Random rand = new Random();
        int toss = rand.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol, player2Symbol;
        String currentPlayer;
        char currentSymbol;

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentSymbol = player1Symbol;
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentSymbol = player2Symbol;
        }

        System.out.println("Toss Result: " + toss);
        System.out.println(currentPlayer + " will start first.");
        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer + " (" + currentSymbol + ")");
    }
}