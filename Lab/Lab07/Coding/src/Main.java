public class Main {
      public static void main(String[] args) {
            
            System.out.println("------------------------------");
            System.out.println("Case Account #01\n");
            Account a1 = new Account(50000, "61070033");
            a1.showAccount();
            a1.deposit(500);
            a1.showAccount();
            a1.withdraw(40000);
            a1.showAccount();
            
            System.out.println("------------------------------");
            System.out.println("Case Checking Account #01\n");
            CheckingAccount ca1 = new CheckingAccount(50000, "61070033", 5000);
            ca1.showAccount();
            ca1.deposit(500);
            System.out.println(ca1);
            ca1.withdraw("40000.0");
            System.out.println(ca1.toString());
            
            System.out.println("------------------------------");
            System.out.println("Case Checking Account #02\n");
            CheckingAccount ca2 = new CheckingAccount();
            ca2.deposit(500);
            System.out.println(ca2);
            ca2.withdraw(40000.0);
            System.out.println(ca2.toString());
            
//            System.out.println("------------------------------");
//            System.out.println("Case Checking Account #03\n");
//            Account ca3 = new CheckingAccount();
//            ca3.setCredit(1000);
//            System.out.println(ca3);
            
            System.out.println("------------------------------");
            System.out.println("Case Checking Account #04\n");
            Account ca4 = new CheckingAccount();
            ca4.setName("Nook");
            System.out.println(ca4);
            ((CheckingAccount) ca4).setCredit(1000);
            System.out.println(ca4);
            
            System.out.println("------------------------------");
            System.out.println("Case Customer #01\n");
            CheckingAccount ca = new CheckingAccount(1000, "62070033", 500);
            Customer c1 = new Customer();
            Customer c2 = new Customer("Harry", "Potter");
            Customer c3 = new Customer("Harry", "Potter", ca);
            System.out.println(c2);
            System.out.println(c3);
            
            System.out.println("------------------------------");
            System.out.println("Case Customer #02\n");
            System.out.println(c1.equals(c2));
            System.out.println(c3.equals(c2));
      }
}
