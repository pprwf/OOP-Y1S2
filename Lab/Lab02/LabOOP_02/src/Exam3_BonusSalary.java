import java.util.*;

public class Exam3_BonusSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name;
        double age, work, absent, weight, salary = 0;
        System.out.print("Please insert your name : ");
        name = input.nextLine();
        System.out.print("Please insert your age : ");
        age = input.nextDouble();
        System.out.print("Please insert number of working day : ");
        work = input.nextDouble();
        System.out.print("Please insert number of absent day : ");
        absent = input.nextDouble();
        System.out.print("Please insert your body weight : ");
        weight = input.nextDouble();
        if (age >= 21 & age <= 30)
            salary = (work * 300) - (absent * 50);
        else if (age >= 31 & age <= 40)
            salary = (work * 500) - (absent * 50);
        else if (age >= 41 & age <= 50)
            salary = (work * 1000) - (absent * 25);
        else if (age >= 51 & age <= 60)
            salary = work * 3000;
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        if (weight >= 10 & weight <= 60)
            salary += 5000;
        else if (weight >= 61 & weight <= 90)
            salary += (5000 - ((weight - 60) * 10.0));
        System.out.println("Your salary and bonus is " + salary + " Baht");
}
}
