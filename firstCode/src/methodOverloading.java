public class methodOverloading {
    static void printValue(int value) {
        System.out.println("Int Value: "+ value);
    }

    static void printValue(double value) {
        System.out.println("Double Value: "+ value);
    }

    public static void main(String[] args) {
        printValue(8);
        printValue(10.);
    }
}
