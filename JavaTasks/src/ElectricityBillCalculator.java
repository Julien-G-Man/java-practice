import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ElectricityBillCalculator {
    static final double COST_PER_KWH = 0.20;
    static double getCost(double consumption) {
        double cost = consumption * COST_PER_KWH;

        if (consumption > 100) {
            cost *= 1.15;
        }

        return cost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of appliances, n: ");
        int n = scanner.nextInt();

        List<Double> applianceConsumptions = new ArrayList<>();
        double totalConsumption = 0;
        double totalCost = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter consumption for appliance "+ i);
            double consumption = scanner.nextDouble();

            applianceConsumptions.add(consumption);
            System.out.println("Appliance added with "+ consumption +" KWH");
        }

        System.out.println("\nUpdated list of consumptions: "+ applianceConsumptions);
        System.out.println("Number of appliances: "+ applianceConsumptions.toArray().length +"\n");

        System.out.println("\n=====================================================");
        System.out.println("CALCULATING RESULTS");

        // for (double consumption : applianceConsumptions) {
        for (int i = 0; i < applianceConsumptions.size(); i++) {
            double consumption = applianceConsumptions.get(i);
            double appliance_cost = getCost(consumption);

            System.out.println("-----------------------------------------------------");
            System.out.printf(
                    "Appliance %d | Consumption: %.2f kWh | Cost: %.2f%s%n",
                    i + 1,
                    consumption,
                    appliance_cost,
                    consumption > 100 ? " (15% surcharge applied)": ""
            );

            totalConsumption += consumption;
            totalCost += appliance_cost;
        }

        System.out.println("\n=====================================================");
        System.out.printf("Total consumption : %.2f kWh%n", totalConsumption);
        System.out.printf("Total cost........: %.2f%n", totalCost);
        System.out.println("=====================================================");
    }
}
