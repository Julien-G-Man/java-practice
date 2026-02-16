import java.util.Arrays;

public class ShopSalesAnalysis {
    public static void main(String[] args) {
        // High Street Branch sales: [Quarter][Month]
        int[][] highStreet = {
                {42000, 48000, 50000},  // Quarter 1
                {52000, 58000, 60000},  // Quarter 2
                {46000, 49000, 58000},  // Quarter 3
                {50000, 51000, 61000}   // Quarter 4
        };

        // Mall Branch sales: [Quarter][Month]
        int[][] mallBranch = {
                {57000, 63000, 60000},  // Quarter 1
                {70000, 67000, 73000},  // Quarter 2
                {67000, 65000, 62000},  // Quarter 3
                {72000, 69000, 75000}   // Quarter 4
        };

        System.out.println("=============================================");
        System.out.println("       SHOP SALES ANALYSIS REPORT");
        System.out.println("=============================================\n");

        // I. Calculate monthly combined sales for both shops
        System.out.println("I. MONTHLY COMBINED SALES (Both Shops)");
        System.out.println("---------------------------------------------");

        int[][] monthlyCombined = new int[4][3];  // 4 quarters, 3 months each
        int monthCounter = 1;

        for (int q = 0; q < 4; q++) {
            for (int m = 0; m < 3; m++) {
                monthlyCombined[q][m] = highStreet[q][m] + mallBranch[q][m];
                System.out.printf("Month %2d (Q%d-M%d): High Street GH₵ %,d + Mall Branch GH₵ %,d = GH₵ %,d\n",
                        monthCounter, (q + 1), (m + 1),
                        highStreet[q][m], mallBranch[q][m], monthlyCombined[q][m]);
                monthCounter++;
            }
        }
        System.out.println();

        // II. Calculate quarterly sales for each shop
        System.out.println("II. QUARTERLY SALES FOR EACH SHOP");
        System.out.println("---------------------------------------------");

        int[] highStreetQuarterly = new int[4];
        int[] mallBranchQuarterly = new int[4];

        for (int q = 0; q < 4; q++) {
            int highStreetSum = 0;
            int mallBranchSum = 0;

            // Sum all 3 months in the quarter
            for (int m = 0; m < 3; m++) {
                highStreetSum += highStreet[q][m];
                mallBranchSum += mallBranch[q][m];
            }

            highStreetQuarterly[q] = highStreetSum;
            mallBranchQuarterly[q] = mallBranchSum;

            System.out.printf("Quarter %d:\n", (q + 1));
            System.out.printf("  High Street Branch: GH₵ %,d\n", highStreetSum);
            System.out.printf("  Mall Branch:        GH₵ %,d\n", mallBranchSum);
            System.out.println();
        }

        // III. Calculate combined quarterly sales for both shops
        System.out.println("III. COMBINED QUARTERLY SALES (Both Shops)");
        System.out.println("---------------------------------------------");

        int[] combinedQuarterly = new int[4];

        for (int q = 0; q < 4; q++) {
            combinedQuarterly[q] = highStreetQuarterly[q] + mallBranchQuarterly[q];
            System.out.printf("Quarter %d: GH₵ %,d (High Street: GH₵ %,d + Mall: GH₵ %,d)\n",
                    (q + 1), combinedQuarterly[q], highStreetQuarterly[q], mallBranchQuarterly[q]);
        }
        System.out.println();

        // IV. Calculate annual sales for each shop
        System.out.println("IV. ANNUAL SALES FOR EACH SHOP");
        System.out.println("---------------------------------------------");

        int highStreetAnnual = 0;
        int mallBranchAnnual = 0;

        // Add up all quarters for each shop
        for (int q = 0; q < 4; q++) {
            highStreetAnnual += highStreetQuarterly[q];
            mallBranchAnnual += mallBranchQuarterly[q];
        }

        System.out.printf("High Street Branch Annual Sales: GH₵ %,d\n", highStreetAnnual);
        System.out.printf("Mall Branch Annual Sales:        GH₵ %,d\n", mallBranchAnnual);
        System.out.println();

        // V. Calculate grand annual combined total
        System.out.println("V. GRAND ANNUAL COMBINED TOTAL");
        System.out.println("---------------------------------------------");

        int grandTotal = highStreetAnnual + mallBranchAnnual;
        System.out.printf("Grand Total (Both Shops): GH₵ %,d\n", grandTotal);
        System.out.println();

        // VI. Sort monthly combined sales from highest to lowest
        System.out.println("VI. MONTHLY COMBINED SALES (Sorted: Highest to Lowest)");
        System.out.println("---------------------------------------------");

        // Flatten the 2D array into 1D array for sorting
        int[] allMonthsCombined = new int[12];
        int index = 0;

        for (int q = 0; q < 4; q++) {
            for (int m = 0; m < 3; m++) {
                allMonthsCombined[index] = monthlyCombined[q][m];
                index++;
            }
        }

        // Sort in ascending order
        Arrays.sort(allMonthsCombined);

        // Print in descending order (highest to lowest)
        for (int i = allMonthsCombined.length - 1; i >= 0; i--) {
            System.out.printf("%2d. GH₵ %,d\n", (12 - i), allMonthsCombined[i]);
        }

        System.out.println("\n=============================================");
        System.out.println("            END OF REPORT");
        System.out.println("=============================================");
    }
}