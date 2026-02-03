public class scope {
    private int count = 0;

    public void increaseCount() {
        count++;
    }

    public void displayCount() {
        System.out.println("Count: "+ count);
    }

    public static void main(String[] args) {
        scope demo = new scope();
        demo.increaseCount();
        demo.displayCount();
    }
}
