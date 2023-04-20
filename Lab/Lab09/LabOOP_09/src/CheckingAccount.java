public class CheckingAccount extends Account{
      private double credit;
      public CheckingAccount () {
            super(0, "");
            this.credit = 0;
      }
      public CheckingAccount (double balance, String name, double credit) {
            super(balance, name);
            this.credit = credit;
      }
      public void setCredit (double credit) {
            if (credit > 0) {
                  this.credit = credit;
            }
            else {
                  System.out.println("Input number must be a positive integer.");
            }
      }
      public double getCredit () {
            return this.credit;
      }
      public void withdraw (double amount) throws WithdrawException {
            if (this.getBalance() + this.getCredit() - amount < 0) {
//                  throw new WithdrawException("Account " + this.name + " has not enough money.");
            }
            else {
                  if (this.getBalance() - amount >= 0) {
                        this.setBalance(this.getBalance() - amount);
                  }
                  else {
                        this.setCredit(this.getCredit() - (amount - this.getBalance()));
                        this.setBalance(0);
                  }
                  System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
            }
      }
      public void withdraw (String amount) throws WithdrawException {
            withdraw (Double.parseDouble(amount));
      }
      public String toString () {
            return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";
      }
}
