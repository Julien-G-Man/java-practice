import java.util.Random;

public class DiceGame {
    static Random rand = new Random();

    static int rollDice() {
        return rand.nextInt(6) + 1;
    }

    enum Winner {
        COMPUTER, USER, NONE
    }

    static Winner determineWinner(int computer, int user) {
        if (computer > user) return Winner.COMPUTER;
        else if (computer < user) return Winner.USER;
        else return Winner.NONE;
    }

    static Winner getGrandWinner(int computerWins, int userWins) {
        return determineWinner(computerWins, userWins);
    }

    static void displayScores(int computerWins, int userWins) {
        System.out.println(
                "   User     : "+ userWins+
                "\n   Computer : "+ computerWins);
    }

    public static void main(String[] args) {
        final int ROUNDS = 10;
        int computerWinCount = 0;
        int userWinCount = 0;

        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("\nRound "+ i +"\n");
            int computerPlay = rollDice();
            int userPlay = rollDice();

            System.out.println(
                    "   User rolled     : "+ userPlay +
                    "\n   Computer rolled : "+ computerPlay);

            Winner winner = determineWinner(computerPlay, userPlay);
            if (winner == Winner.NONE) System.out.println("It's a draw!");
            else System.out.println(winner +" wins!");

            if (winner == Winner.COMPUTER) computerWinCount++;
            if (winner == Winner.USER) userWinCount++;

            System.out.println("\nScores");
            displayScores(computerWinCount, userWinCount);

            System.out.println("----------------------------------");
        }

        Winner grandWinner = getGrandWinner(computerWinCount, userWinCount);

        System.out.println("\n==================================");
        System.out.println("SUMMARY");
        System.out.println("----------------------------------");
        System.out.println(
                "Total computer wins     : "+ computerWinCount +
                "\nTotal user wins         : "+ userWinCount +
                "\nGrand winner            : "+ grandWinner);
    }
}
