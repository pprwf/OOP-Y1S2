import java.util.*;

public class BuyingNewCom {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double price = 375.99, dvd, printer;
        int size;
        System.out.print("Please insert your monitor size 38 or 43 only : ");
        size = input.nextInt();
        System.out.print("Do you want DVD-ROM? 1 is Yes / 0 is No : ");
        dvd = input.nextInt();
        System.out.print("Do you want printer? 1 is Yes / 0 is No : ");
        printer = input.nextInt();
        System.out.println("======= Your Order =======");
        System.out.println("* computer >>> 375.99$");
        if (size == 38) {
            price += 75.99;
            System.out.println("* 38'Monitor >>> 75.99$");
        } else {
            price += 99.99;
            System.out.println("* 43'Monitor >>> 99.99$");
        } if (dvd == 1) {
            price += 65.99;
            System.out.println("* DVD-Rom >>> 65.99$");
        } if (printer == 1) {
            price += 125;
            System.out.println("* DVD-Rom >>> 65.99$");
        } System.out.println("======= Total price >>> " + price + " =======");
    }
}
