import java.util.Objects;

public class WarehouseAnalysis {
    static String classify(double weight) {
        String classification;
        if (weight > 50) {
            classification = "heavy";
        } else if (weight < 20) {
            classification = "light";
        } else {
            classification = "medium";
        }
        return classification;
    }

    public static void main(String[] args) {

        double[] boxWeights = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};

        double totalWeight = 0;
        int numberOfBoxes = boxWeights.length;
        int numHeavy = 0;
        int numMedium = 0;
        int numLight = 0;
        double heaviestBox = 0;
        int heaviestBoxPosition = 0;

        for (int i = 0; i < numberOfBoxes; i++) {
            double weight = boxWeights[i];

            String classification = classify(weight);
            System.out.println("Box " + (i + 1) + " | Weight: "+ weight +" | Category: " + classification);
            totalWeight += weight;

            if (Objects.equals(classification, "heavy")) {
                numHeavy += 1;
            } else if (Objects.equals(classification, "medium")) {
                numMedium += 1;
            } else {
                numLight += 1;
            }

            if (weight > heaviestBox) {
                heaviestBox = weight;
                heaviestBoxPosition = i;
            }
        }

        double averageWeight = totalWeight / numberOfBoxes;

        System.out.println("\n===================================");
        System.out.println("SUMMARY");
        System.out.println("-------------------------------------");
        System.out.println("Total Weight: "+ totalWeight);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("Number of boxes in each category: ");
        System.out.println("Heavy: " + numHeavy + " | Medium: " + numMedium + " | Light: " + numLight);
        System.out.println("Heaviest box: " + heaviestBox + " | Position: " + heaviestBoxPosition);

    }
}
