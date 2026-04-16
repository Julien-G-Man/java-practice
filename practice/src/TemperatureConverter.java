import java.util.Scanner;

public class TemperatureConverter {
    static double fanToCelsius(double fan) {
        return (5.0 / 9) * (fan * 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = fanToCelsius(fahrenheit);

        System.out.println();
        System.out.printf("Fahrenheit (F): %.2f%n", fahrenheit);
        System.out.printf("Celsius    (C): %.2f%n", celsius);

        int name = scanner.nextInt();
        switch(name) {
            case 0:
                System.out.println(fahrenheit);
                break;
            case 1:
                System.out.println(celsius);
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
