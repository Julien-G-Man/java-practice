import java.util.Scanner;

public class Yards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length in feet: ");
        double lengthInFeet = scanner.nextDouble();

        System.out.print("Enter the width in feet: ");
        double widthInFeet = scanner.nextDouble();

        System.out.print("Enter the price per square yards: ");
        double pricePerSquareUnit = scanner.nextDouble();

        double feetArea = getAreaFeet(lengthInFeet, widthInFeet);
        double yardsArea = squareFeetToSquareYards(feetArea);
        double cost = getCost(yardsArea, pricePerSquareUnit);

        System.out.printf("Cost of carpeting the room: $%.2f%n", cost);
        scanner.close();
    }

    static double getAreaFeet(double length, double width) {
        return length * width;
    }
    static double squareFeetToSquareYards(double squareFeet) {
        return squareFeet / 9;
    }
    static double getCost(double area, double amountPerSquareUnit) {
        return area * amountPerSquareUnit;
    }
}

class Converter {
    public static void main(String[] args) {

    }
}
