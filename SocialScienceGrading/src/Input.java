public class Input {

    String[] indexNumbers;
    double[] midsem;
    double[] exams;
    int size;

    public Input(int size) {
        this.size = size;
        indexNumbers = new String[size];
        midsem = new double[size];
        exams = new double[size];
    }

    public void loadSampleData() {
        // You can change or extend this
        indexNumbers[0] = "KNUST001"; midsem[0] = 75; exams[0] = 80;
        indexNumbers[1] = "KNUST002"; midsem[1] = 60; exams[1] = 65;
        indexNumbers[2] = "KNUST003"; midsem[2] = 50; exams[2] = 55;
        indexNumbers[3] = "KNUST004"; midsem[3] = 40; exams[3] = 45;
        indexNumbers[4] = "KNUST005"; midsem[4] = 30; exams[4] = 35;
    }
}