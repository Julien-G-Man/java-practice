import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] m = new int[10];

        for (int i = 0; i < m.length; i++) {
            System.out.println(i+1 + ") Enter a number: ");
            int element = scanner.nextInt();
            m[i] = element;
            System.out.println(element);
        }
        System.out.println(Arrays.toString(m));
    }
}
