import java.util.*;

public class Exam2_DepositInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double deposit, netWorth;
        char accountType;
        System.out.print("Input your money : ");
        deposit = input.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        accountType = input.next().charAt(0);
        if (accountType == 'A' | accountType == 'C')
            netWorth = deposit * (1.5 / 100);
        else if (accountType == 'B')
            netWorth = deposit * (2.0 / 100);
        else
            netWorth = deposit * (5.0 / 100);
        System.out.println("Your total money in one year = " + (deposit + netWorth));
}
}
