import java.util.*;

public class OilPrice {
    public static void main(String[] args) {
        int volume, cost;
        Scanner input = new Scanner (System.in);
        System.out.print("How much do you need: ");
        volume = input.nextInt();
        cost = volume * 30;
        System.out.println("You must spend " + cost + " Baht");
    }
}
