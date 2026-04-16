public class Processing {

    double[] finalScores;
    char[] grades;

    int countA, countB, countC, countD, countF;

    double average, max, min;

    public Processing(int size) {
        finalScores = new double[size];
        grades = new char[size];
    }

    public void compute(Input input) {

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