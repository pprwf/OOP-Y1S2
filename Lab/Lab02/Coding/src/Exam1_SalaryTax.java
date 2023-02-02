import java.util.*;

public class Exam1_SalaryTax {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salary, tax;
        salary = input.nextDouble();
        if (salary > 50000) 
            tax = salary * (10.0 / 100);
        else
            tax = salary * (5.0 / 100);
        System.out.println(tax);
}
}
