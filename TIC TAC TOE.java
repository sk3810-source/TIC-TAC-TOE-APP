import java.util.Random;

public class TicTacToeUC2 {
    public static void main(String[] args) {

        Random random = new Random();

        // 0 → User starts, 1 → Computer starts
        int toss = random.nextInt(2);

        char userSymbol, computerSymbol;
        String currentPlayer;

        if (toss == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        // Display results
        System.out.println("🎲 Toss Result:");
        System.out.println(currentPlayer + " plays first!");

        System.out.println("\nSymbol Assignment:");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
