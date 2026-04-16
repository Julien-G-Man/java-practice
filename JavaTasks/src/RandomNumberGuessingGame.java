import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static int generateRandomNumber() {
        return rand.nextInt(100) + 1; // 1–100
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        int count = 0;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input. Enter a number between 1 and 100.");
                continue;
            }

            count++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            }
        }

        System.out.println("You got it correct!");
        System.out.println("The number was " + randomNumber);
        System.out.println("Total guesses: " + count);
    }
}