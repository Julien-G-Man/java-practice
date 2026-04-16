public class Output {

    public void display(Input input, Processing p) {

        System.out.println("Index \tFinal Score \tGrade");

        for (int i = 0; i < input.size; i++) {
            System.out.printf("%s\t%.2f\t\t%c%n",
                    input.indexNumbers[i],
                    p.finalScores[i],
                    p.grades[i]);
        }

        System.out.println("\nGRADE DISTRIBUTION");
        System.out.println("A: " + p.countA);
        System.out.println("B: " + p.countB);
        System.out.println("C: " + p.countC);
        System.out.println("D: " + p.countD);
        System.out.println("F: " + p.countF);

        System.out.println("\nSTATISTICS");
        System.out.printf("Average: %.2f%n", p.average);
        System.out.printf("Maximum: %.2f%n", p.max);
        System.out.printf("Minimum: %.2f%n", p.min);
    }
}