import java.util.*;

public class YearConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int BuddhistEra, AnnoDomini;
        System.out.print("Please Enter B.E. Value: ");
        BuddhistEra = input.nextInt();
        AnnoDomini = BuddhistEra - 543;
        System.out.println("This is " + AnnoDomini + " A.D.");
}
}
