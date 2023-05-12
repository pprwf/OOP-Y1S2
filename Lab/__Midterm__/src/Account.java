public abstract class Account implements DepositAble {
    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        System.out.println( this.name + " has succesfully opened a deposit account with a balance of " + this.balance + " baht in the account.");
    }
    public String toString() {
        return "Account balance is equal to " + this.balance + " baht.";
    }
    public abstract void getInfoAcct();

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
