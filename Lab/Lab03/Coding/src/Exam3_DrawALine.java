import java.util.*;

public class Exam3_DrawALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        for (int count = 1; count <= num; count++) {
            if (count % 5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
        System.out.println("");
    }
}
