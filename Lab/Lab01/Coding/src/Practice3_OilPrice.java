import java.util.*;

public class Practice3_OilPrice {
    public static void main(String[] args) {
        int volume, cost;
        Scanner input = new Scanner (System.in);
        System.out.print("How much do you need: ");
        volume = input.nextInt();
        cost = volume * 30;
        System.out.println("You must spend " + cost + " Baht");
    }
}
