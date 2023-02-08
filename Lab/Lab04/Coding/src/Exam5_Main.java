public class Exam5_Main {
    public static void main(String[] args) {
        Exam5_Customer c = new Exam5_Customer();
        c.name = "Taravichet";
        
        Exam5_MyDate dob = new Exam5_MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;
        
        Exam5_Account acct = new Exam5_Account();
        acct.name = c.name;
        acct.balance = 500;
        
        c.DOB = dob;
        c.acct = acct;
        
        System.out.println("My name is " + c.name + ".");
        
        c.acct.showInfo();
        c.DOB.showDate();
        
        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
}
}
