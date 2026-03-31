import java.util.Random;
import java.util.Scanner;

class GameResult {
    int score;
    int amountWon;

    GameResult(int score, int amountWon) {
        this.score = score;
        this.amountWon = amountWon;
    }
}

public class SlotMachineSimulator {

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static String getRandomWord(String[] words) {
        return words[rand.nextInt(words.length)];
    }

    static GameResult playRound(String[] words, int amount) {
        String[] spin = new String[3];

        for (int i = 0; i < 3; i++) {
            spin[i] = getRandomWord(words);
            System.out.println("Image " + (i + 1) + ": " + spin[i]);
        }

        int score;
        if (spin[0].equals(spin[1]) && spin[1].equals(spin[2])) {
            score = 3;
        } else if (spin[0].equals(spin[1]) ||
                spin[1].equals(spin[2]) ||
                spin[0].equals(spin[2])) {
            score = 2;
        } else {
            score = 0;
        }

        int amountWon = score * amount;

        if (score == 0) {
            System.out.println("You won GHS 0");
        } else if (score == 2) {
            System.out.println("You won GHS " + amountWon);
        } else {
            System.out.println("You won GHS " + amountWon);
        }

        return new GameResult(score, amountWon);
    }

    public static void main(String[] args) {

        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

        int totalEntered = 0;
        int totalWon = 0;

        boolean playing = true;

        while (playing) {

            System.out.print("Enter amount to play: ");
            int amount = scanner.nextInt();

            if (amount <= 0) {
                System.out.println("Invalid amount.");
                continue;
            }

            totalEntered += amount;

            GameResult result = playRound(words, amount);
            totalWon += result.amountWon;

            System.out.print("Play again? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playing = false;
            }
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Total amount entered: GHS " + totalEntered);
        System.out.println("Total amount won: GHS " + totalWon);
    }
}