public class FuelConsumption {
    public static void main(String[] args) {
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};

        int i = 0;
        int peakConsumptionDay = 1;
        double totalFuelConsumption = 0;
        double peakFuelUsage = fuelConsumption[0];
        int highCount = 0, normalCount = 0, lowCount = 0;

        while (i < fuelConsumption.length) {
            int day = i + 1;
            double dailyConsumption = fuelConsumption[i];
            String category;

            if (dailyConsumption > 20) {
                category = "High";
                highCount++;
            } else if (dailyConsumption > 10) {
                category = "Normal";
                normalCount++;
            } else {
                category = "Low";
                lowCount++;
            }

            System.out.println("Day "+ day +" | Fuel usage: "+ dailyConsumption +" | Category: "+ category);

            if (dailyConsumption > peakFuelUsage) {
                peakFuelUsage = dailyConsumption;
                peakConsumptionDay = day;
            }

            totalFuelConsumption += dailyConsumption;
            i++;
        }

        double averageConsumption = totalFuelConsumption / fuelConsumption.length;

        System.out.println("\n=================================");
        System.out.println("SUMMARY");
        System.out.println("---------------------------------");
        System.out.println("Peak Consumption Day: "+ peakConsumptionDay);
        System.out.printf("Peak Usage: %.2f"+ peakFuelUsage);
        System.out.println("Total Fuel Consumption: "+ totalFuelConsumption);
        System.out.println("Average fuel usage: "+ averageConsumption);
        System.out.println("Number of high consumptions: "+ highCount);
        System.out.println("Number of normal consumptions: "+ normalCount);
        System.out.println("Number of low consumptions: "+ lowCount);
    }
}
