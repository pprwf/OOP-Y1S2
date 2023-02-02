import java.util.*;

public class Exam2_EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt(), even = 0, odd = 0;
        while (num != -1) {
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            num = sc.nextInt();
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
