import java.util.ArrayList;
import java.util.List;

public class EvenNumbers_Continue {

    public static double calculateStandardDev(List list, double mean) {
        double standardDev;
        double deviation;
        double sumOfDeviations = 0;

        for (int i = 0; i <= list.size(); i++) {
            deviation = Math.pow(i - mean, 2);
            sumOfDeviations += deviation;
        }
        standardDev = sumOfDeviations / list.size();

        return standardDev;
    }

    static int findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<> ();

        double average;
        double sum = 0;
        double standardDev;
        int factorial;

        for (int i = 0; i < 80; i++){
            if (i % 2 == 1) {
                if (i == 1 || i == 3) continue;
                if (i == 21) break;
                else {
                    System.out.println(i);
                    list.add(i);
                    sum += i;
                }
            }
        }
        System.out.println("Filled list: "+ list);

        average = sum / list.size();
        System.out.println("Average: "+  average);

        standardDev = calculateStandardDev(list, average);
        System.out.println("Standard deviation: "+ standardDev);

        int StDevInt = (int) standardDev;
        factorial = findFactorial(StDevInt);
        System.out.println("Factorial of the Standard Deviation: "+ factorial);
    }
}
