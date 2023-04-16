import java.util.*;

public class Exam1_Building {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("กรุณาระบุความสูงตึก : ");
        int height = input.nextInt();
        for (int floor = 0; floor < height; floor++) {
            System.out.println("#-#-#-#-#");
        }
}
}
