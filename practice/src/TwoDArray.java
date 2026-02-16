public class TwoDArray {
    // Here the size (array.length) =  the number of rows
    public static void main(String[] args) {
        int[][] k = new int[6][2];
        System.out.println(k.length);

        double[][] shoeSizes = new double[3][4];
        shoeSizes[0][0] = 20;
        System.out.println("Shoe sizes: \n"+ shoeSizes[0][0]);

        String[][] foods = {
                {"orange", "mango", "apple"},
                {"banana", "paw paw", "guava"}
        };
        System.out.println(foods[0][1]); //  mango

        int[][] numbers = {
                {12, 23}, {13, 22}, {14, 21}, {15, 20}, {16, 19}, {17, 18}
        };
        System.out.println(numbers[2][1]); // 21

        int[][] x = { {2, 3}, {4, 5, 6} };

        int total = 0;
        for (int[] ints : x) {
            for (int anInt : ints) {
                System.out.println(anInt);
                total += anInt;
            }
        }
        System.out.println("Total: "+ total);
    }
}
