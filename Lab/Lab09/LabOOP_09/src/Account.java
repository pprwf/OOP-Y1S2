public class Account {
      protected double balance;
      protected String name;
      public Account (double balance, String name) {
            this.balance = balance;
            this.name = name;
      }
      public void deposit (double a) {
            if (a > 0) {
                  System.out.println(a + " baht is deposited to " + this.getName() + ".");
                  this.setBalance(this.getBalance() + a);
            }
            else {
                  System.out.println("Input number must be a positive integer.");
            }
      }
      public void withdraw (double a) throws WithdrawException {
            if (a < 0) {
                  System.out.println("Input number must be a positive integer.");
            }
            else if (this.getBalance() - a < 0) {
//                  throw new WithdrawException("Account " + this.name + " has not enough money.");
            }
            else {
                  System.out.println(a + " baht is withdrawn from " + this.getName() + ".");
                  this.setBalance(this.getBalance() - a);
            }
      }
      public void setName (String name) {
            this.name = name;
      }
      public String getName () {
            return this.name;
      }
      public void setBalance (double balance) {
            this.balance = balance;
      }
      public double getBalance () {
            return this.balance;
      }
      public void showAccount () {
            System.out.println(this.getName() + " account has " + this.getBalance() + " baht.");
      }
}
