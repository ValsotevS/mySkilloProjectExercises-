import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        revenueFromSale();
    }

    public static void revenueFromSale() {

        System.out.println("Enter unit price: ");

        Scanner scanInput = new Scanner(System.in);

        float unitPrice = scanInput.nextFloat();

        System.out.println("Enter the desired quantity: ");

        float unitQty = scanInput.nextFloat();

        float revenue = unitPrice * unitQty;

            if (unitQty < 100) {
                System.out.println("The revenue from sale: " + revenue + "$");
                System.out.println("Discount: 0.00$(0.0%)");
            } else if (unitQty > 120) {
                System.out.println("The revenue from sale: " + (revenue - (revenue * 0.20)) + "$");
                System.out.println("Discount: " + (revenue * 0.20) + "$(20.0%");
            } else {
                System.out.println("The revenue from sale: " + (revenue - (revenue * 0.15)) + "$");
                System.out.println("Discount: " + (revenue * 0.15) + "$(15.0%)");
            }

    }
}