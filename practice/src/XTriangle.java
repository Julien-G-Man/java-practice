public class XTriangle {

    public static void main(String[] args) {
        int[] xs = {1, 4, 6, 9, 1};
        int maxWidth = 9;

        for (int i : xs) {
            int spaces = (maxWidth - i) / 2;

            if (i == 4) spaces = 3;
            if (i == 6) spaces = 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}


// when
// i = 1, j = 1
// i = 2, j = 4
// i = 3, j = 6
// i = 4, j = 9
// i = 5, j = 1