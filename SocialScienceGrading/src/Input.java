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
        indexNumbers[0] = "10022307"; midsem[0] = 34; exams[0] = 90;
        indexNumbers[1] = "10022401"; midsem[1] = 81; exams[1] = 67;
        indexNumbers[2] = "10022402"; midsem[2] = 55; exams[2] = 70;
        indexNumbers[3] = "10022403"; midsem[3] = 40; exams[3] = 60;
        indexNumbers[4] = "10022404"; midsem[4] = 20; exams[4] = 50;
    }
}