import java.util.Scanner;
import java.util.Arrays;

public class PersonsAges {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of persons");
        int size = scanner.nextInt();

        int[] ages = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the age for person "+ (i + 1) );
            ages[i] = scanner.nextInt();
            sum += ages[i];
        }

        int average = sum / size;
        System.out.println("\nAges stored: "+ Arrays.toString(ages));
        System.out.println("Total ages; "+ sum);
        System.out.println("Average Age: "+ average);

    }
}
