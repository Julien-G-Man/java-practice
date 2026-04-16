// Trying to have everything in a single file
// Used different names so they don't clash

public class Integrate {

    public static void main(String[] args) {

        int size = 5;

        Intake input = new Intake(size);
        input.loadSampleData();

        Process process = new Process(size);
        process.compute(input);

        Result output = new Result();
        output.display(input, process);
    }
}

class Intake {

    String[] indexNumbers;
    double[] midsem;
    double[] exams;
    int size;

    public Intake(int size) {
        this.size = size;
        indexNumbers = new String[size];
        midsem = new double[size];
        exams = new double[size];
    }

    public void loadSampleData() {
        indexNumbers[0] = "10022307"; midsem[0] = 34; exams[0] = 90;
        indexNumbers[1] = "10022401"; midsem[1] = 81; exams[1] = 67;
        indexNumbers[2] = "10022402"; midsem[2] = 55; exams[2] = 70;
        indexNumbers[3] = "10022403"; midsem[3] = 40; exams[3] = 60;
        indexNumbers[4] = "10022404"; midsem[4] = 20; exams[4] = 50;
    }
}

class Process {

    double[] finalScores;
    char[] grades;

    int countA, countB, countC, countD, countF;

    double average, max, min;

    public Process(int size) {
        finalScores = new double[size];
        grades = new char[size];
    }

    public void compute(Intake input) {

        double total = 0;
        max = Double.MIN_VALUE;
        min = Double.MAX_VALUE;

        for (int i = 0; i < input.size; i++) {

            // Convert scores properly
            double mid = (input.midsem[i] / 100) * 30;
            double exam = (input.exams[i] / 100) * 70;

            double finalScore = mid + exam;
            finalScores[i] = finalScore;

            // KNUST grading
            if (finalScore >= 70) {
                grades[i] = 'A'; countA++;
            } else if (finalScore >= 60) {
                grades[i] = 'B'; countB++;
            } else if (finalScore >= 50) {
                grades[i] = 'C'; countC++;
            } else if (finalScore >= 40) {
                grades[i] = 'D'; countD++;
            } else {
                grades[i] = 'F'; countF++;
            }

            total += finalScore;

            if (finalScore > max) max = finalScore;
            if (finalScore < min) min = finalScore;
        }

        average = total / input.size;
    }
}


class Result {

    public void display(Intake input, Process p) {

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