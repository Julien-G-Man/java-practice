import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);

    static int generateRandomNumber(){
        Random rand = new Random();

        return rand.nextInt(100) + 1;
    }


    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();

        int count = 0;
        while(true) {
            System.out.println("\nEnter your guess: ");
            int guess = scanner.nextInt();

            if (guess < 0) {
                System.out.println("Number can't be less than 0, try again.");
                continue;
            }

            count++;
            if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("You got it correct.!");
                break;
            }
        }

        System.out.println("You got the correct answer ("+ randomNumber +") after "+ count +" guesses.");

    }
}
