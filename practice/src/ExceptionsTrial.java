//import java.util.Exception;
import java.util.Scanner;
import java.util.Arrays;

public class ExceptionsTrial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] result = new int[5];

        try {
            for (int i = 0; i < result.length; i++) {
                result[i] = scanner.nextInt();
                System.out.println("Updated results: "+ Arrays.toString(result));
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+ e);
        } catch(Exception aex) {
            System.out.println("Error: ");
        } finally {
            System.out.println("Program is over");
        }
    }
}
