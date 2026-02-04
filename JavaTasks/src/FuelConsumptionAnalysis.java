public class FuelConsumptionAnalysis {

    static String categorize(double fuelUsage) {
        if (fuelUsage > 20) return "High";
        else if (fuelUsage < 10) return "Low";
        else return "Normal";
    }

    public static void main(String[] args) {
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};

        double totalFuelConsumption = 0;
        int peakConsumptionDay = 1;
        double peakFuelUsage = fuelConsumption[0];

        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;

        int i = 0;
        while (i < fuelConsumption.length) {
            int day = i + 1;
            double fuelUsage = fuelConsumption[i];
            String category = categorize(fuelUsage);
            System.out.printf(
                    "Day %d | Fuel Usage: %.2f | Category: %s%n",
                    day,
                    fuelUsage,
                    category
            );

            if (fuelUsage > peakFuelUsage){
                peakFuelUsage = fuelUsage;
                peakConsumptionDay = day;
            }

            if(category.equals("High")) highCount++;
            else if (category.equals("Normal")) normalCount++;
            else lowCount++;

            totalFuelConsumption += fuelUsage;
            i++;
        }
        double averageFuelConsumption = totalFuelConsumption / fuelConsumption.length;

        System.out.println("\n==========================================");
        System.out.println("SUMMARY");
        System.out.println("------------------------------------------");
        System.out.printf("Total Fuel Consumption: %.2f", totalFuelConsumption);
        System.out.printf("\nAverage Fuel Consumption: %.2f", averageFuelConsumption);
        System.out.println("\nPeak consumption Day: "+ peakConsumptionDay);
        System.out.printf("Peak fuel consumption: %.2f", peakFuelUsage);
        System.out.println("\nHigh days: "+ highCount);
        System.out.println("Normal days: "+ normalCount);
        System.out.println("Low days: "+ lowCount);
        System.out.println("------------------------------------------");

    }
}
