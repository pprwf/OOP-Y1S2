import java.util.*;

public class SquareArea {
    public static void main(String[] args) {
        double width, area;
        Scanner input = new Scanner (System.in);
        System.out.print("Please Insert your square size: ");
        width = input.nextDouble();
        area = width * width;
        System.out.println("Your Area = " + area);
    }
}
