public class JavaTask {
    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    public static void main(String[] args){
        int sum = 0;

        for (int i  =1; i <= 10; i++) {
            sum += 1;
        }

        double average = sum / 10.0;

        double variance = 0;
        for (int i = 1; i <= 10; i++) {
            variance += Math.pow(i - average, 2);
        }
        variance /= 10;
        double standardDeviation = Math.sqrt(variance);

        int sdInt = (int) standardDeviation;
        long fact = factorial(sdInt);

        System.out.println("====== RESULTS ======");
        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + standardDeviation);
        System.out.println("Factorial of SD (integer part): " + fact);
    }
}
