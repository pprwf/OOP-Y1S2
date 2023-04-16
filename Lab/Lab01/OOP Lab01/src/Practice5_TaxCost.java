import java.util.*;

public class Practice5_TaxCost {
    public static void main(String[] args) {
        double price, vat;
        Scanner input = new Scanner (System.in);
        System.out.print("How much money do you spend: ");
        price = input.nextDouble();
        vat = price * (7.0 / 100);
        System.out.println("You must spend: " + (price + vat) + " Baht");
    }
}
