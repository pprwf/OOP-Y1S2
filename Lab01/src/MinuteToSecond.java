import java.util.*;

public class MinuteToSecond {
    public static void main(String[] args) {
        int hour, minute, second;
        Scanner input = new Scanner (System.in);
        System.out.print("Please Enter Hour: ");
        hour = input.nextInt();
        System.out.print("Please Enter Minute: ");
        minute = input.nextInt();
        second = ((hour * 60) + minute) * 60;
        System.out.println("This is your Time in Second Unit: " + second);
    }
}
