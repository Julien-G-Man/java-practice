import java.util.Random;

public class DiceGame {
    static Random rand = new Random();

    static int rollDice() {
        return rand.nextInt(6) + 1;
    }

    static String determineWinner(int computer, int user) {
        String winner;
        if (computer > user) {
            winner = "computer";
        } else if (computer < user) {
            winner = "user";
        } else winner = "none";

        return winner;
    }

    static String getGrandWinner(int computerWins, int userWins) {
        return determineWinner(computerWins, userWins);
    }

    static void displayScores(int computerWins, int userWins) {
        System.out.println("   User     : "+ userWins);
        System.out.println("   Computer : "+ computerWins);
    }

    public static void main(String[] args) {

        int computerWinCount = 0;
        int userWinCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nRound "+ i +"\n");
            int computerPlay = rollDice();
            int userPlay = rollDice();

            System.out.println("   User rolled: "+ userPlay);
            System.out.println("   Computer rolled: "+ computerPlay);
            String winner = determineWinner(computerPlay, userPlay);

            if (winner.equals("none")) System.out.println("It's a draw!");
            else System.out.println(winner +" wins!");

            if (winner.equals("computer")) computerWinCount++;
            if (winner.equals("user")) userWinCount++;
            System.out.println("\nScores");
            displayScores(computerWinCount, userWinCount);
            System.out.println("----------------------------------");
        }

        String grandWinner = getGrandWinner(computerWinCount, userWinCount);

        System.out.println("\n==================================");
        System.out.println("SUMMARY");
        System.out.println("----------------------------------");
        System.out.println("Total computer wins     : "+ computerWinCount);
        System.out.println("Total user wins         : "+ userWinCount);
        System.out.println("\nGrand winner            : "+ grandWinner);
    }
}
