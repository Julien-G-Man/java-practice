import java.util.Arrays;

public class StudentsJavaSkills {

    public static void main(String[] args) {
        int[] ratings = {2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 5};
        System.out.println("Number of students: "+ ratings.length);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i : ratings) {
            if (i == 1) count1++;
            else if (i == 2) count2++;
            else if (i == 3) count3++;
            else if (i == 4) count4++;
            else count5++;
        }


        System.out.println("\nFrequencies of ratings");
        int[] frequencies = {count1, count2, count3, count4, count5};

        Arrays.sort(frequencies);
        for (int i = frequencies.length - 1; i >= 0; i--) {
            System.out.println(i+1 +" Star rating: "+ frequencies[i]);
        }

    }
}
