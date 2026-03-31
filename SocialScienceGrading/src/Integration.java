public class Integration {

    public static void main(String[] args) {

        int size = 5;

        Input input = new Input(size);
        input.loadSampleData();

        Processing processing = new Processing(size);
        processing.compute(input);

        Output output = new Output();
        output.display(input, processing);
    }
}