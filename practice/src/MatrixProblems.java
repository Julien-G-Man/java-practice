import java.util.Arrays;

public class MatrixProblems {

    static int leadingDiagonalProduct(int[][] m) {
        int product = 1;
        for (int i = 0; i < m.length; i++)
            product *= m[i][i];

        return product;
    }

    static int trailingDiagonalProduct(int[][] m) {
        int n = m.length, product = 1;
        for (int i = 0; i < n; i++)
            product *= m[i][n - 1 - i];

        return product;
    }

    static double average(int[][] m) {
        int sum = 0;
        for (int[] row : m)
            for (int val : row)
                sum += val;
        return (double) sum / (m.length * m[0].length);
    }

    public static void main(String[] args) {
        int[][] tableK = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 1}
        };

        int[][] tableJ = {
                {3, 4, 5},
                {7, 8, 9},
                {2, 1, 3}
        };

        System.out.println("TableJ: "+ Arrays.deepToString(tableJ));
        System.out.println("Table K:"+ Arrays.deepToString(tableK));

        System.out.println("\nQuestion 1");
        int productOfLeadingDiagonalK = leadingDiagonalProduct(tableK);
        int productOfLeadingDiagonalJ = leadingDiagonalProduct(tableJ);

        int productsOfBothLeadingDiagonals = productOfLeadingDiagonalK * productOfLeadingDiagonalJ;
        System.out.println("Multiplying the products of the leading diagonals of both J and K: \n"+ productsOfBothLeadingDiagonals);

        System.out.println("\nQuestion 2");
        int productOfTrailingDiagonalK = trailingDiagonalProduct(tableK);
        int productOfTrailingDiagonalJ = trailingDiagonalProduct(tableJ);

        int productOfBothTrailingDiagonals = productOfTrailingDiagonalK * productOfTrailingDiagonalJ;
        System.out.println("Multiplying the products of the trailing diagonals of both J and K: \n"+ productOfBothTrailingDiagonals);

        System.out.println("\nQuestion 3");
        System.out.println("Swapping the contents of J and K...");

        int[][] temp = tableJ;
        tableJ = tableK;
        tableK = temp;

        System.out.println("\nNew Table J: \n"+ Arrays.deepToString(tableJ));
        System.out.println("\nNew Table K: \n"+ Arrays.deepToString(tableK));

        System.out.println("\nCalculating differences...");
        int differenceK = productOfLeadingDiagonalK - productOfTrailingDiagonalK;
        System.out.println("Difference between the product of the leading and trailing diagonals of table K: "+ differenceK);

        System.out.println("\nCalculating averages...");
        double averageOfTableK = average(tableK);
        double averageOfTableJ = average(tableJ);

        System.out.println("Average of table J: "+ averageOfTableJ);
        System.out.println("Average of table K: "+ averageOfTableK);

        double meanOfTableAverages = (averageOfTableK + averageOfTableJ) / 2;
        System.out.println("Mean of averages of tables K and J: "+ meanOfTableAverages);
    }
}