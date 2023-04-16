import java.util.*;

public class Practice2_AverageScore {
    public static void main(String[] args) {
        int firstScore, secondScore, thirdScore, average;
        Scanner Student = new Scanner (System.in);
        System.out.print("Please Enter First Score: ");
        firstScore = Student.nextInt();
        System.out.print("Please Enter Second Score: ");
        secondScore = Student.nextInt();
        System.out.print("Please Enter Third Score: ");
        thirdScore = Student.nextInt();
        average = (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Average Score = " + average);
    }
}
