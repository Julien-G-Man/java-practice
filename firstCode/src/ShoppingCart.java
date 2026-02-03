public class ShoppingCart {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println(" SHOPPING CART CHECKOUT ");
        System.out.println("===============================\n");

        double[] cartItem = {34.5, 56.7, 120.4, 234.5, 100.0};
        double totalCountAmount = 0;

        // enhanced for loop
        //for (double currentPrice : cartItem) {
        for (int i = 0; i < cartItem.length; i++) {
            double price = cartItem[i];
            System.out.println(i+1 +") Item price: "+ price +" GHS");

            double currentPrice = price;
            double discountedPrice = 0;

            if (currentPrice > 100) {
                discountedPrice = currentPrice * 0.9;
                price = discountedPrice;
                System.out.println("A 10% percent discount was applied on this item.");
            }

            System.out.println("Amount to be paid: " + price + " GHS\n");
            totalCountAmount += price;
        }

        System.out.println("============================================== ");
        System.out.println("The total amount to be paid: "+ totalCountAmount);
        System.out.println("===============================================");
    }
}
