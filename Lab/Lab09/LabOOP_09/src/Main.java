public class Main {
    public static void main(String[] args) {
        try {
            CheckingAccount acct = new CheckingAccount(1000, "A0001", 500);
            Customer cust = new Customer("Sompong", "Sookjai", acct);
            
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        }
        catch (WithdrawException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you.");
        }
    }
}
