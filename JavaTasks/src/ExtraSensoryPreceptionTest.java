import java.util.Random;
import java.util.Scanner;

public class ExtraSensoryPreceptionTest {
    static Scanner scanner = new Scanner(System.in);

    static String generateRandomColour(String[] colours) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(colours.length);

        return colours[randomIndex];
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("GUESS THE RANDOM COLOUR GAME");
        System.out.println("-----------------------------------------");

        String[] colours = {"Red", "Green", "Blue", "Orange", "Yellow"};
        String randomColour = generateRandomColour(colours);

        int correctCount = 0;
        int totalAttempts = 0;
        int sessionAttempts = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nAttempt "+ (i + 1) );
            System.out.println("Guess the colour. Capitalize the first letter: ");
            String input = scanner.next();

            sessionAttempts++;
            totalAttempts++;

            if (input.equals(randomColour)) {
                System.out.println("\nClock it! You got it right... :)");
                System.out.println("You got the correct colour ("+ randomColour +") after "+ sessionAttempts +" guesses.");
                randomColour = generateRandomColour(colours);
                correctCount++;
            } else {
                System.out.println("Wrong guess, try again...");
            }
        }

        System.out.println("\n=========================================");
        System.out.println("SUMMARY");
        System.out.println("-----------------------------------------");
        System.out.println("Number of total attempts........: "+ totalAttempts);
        System.out.println("Number of correct attempts.....: "+ correctCount);
    }
}
