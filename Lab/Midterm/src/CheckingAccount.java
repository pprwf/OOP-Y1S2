public class CheckingAccount extends Account implements WithdrawAble {
    private static double RATE = 0.1;

    public CheckingAccount() {
        this(0.0, "");
    }
    public CheckingAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
        System.out.println(this.name + " has successfully opened a checking account with a balance of " + this.balance + " baht and its rate is " + this.RATE + " in the account.");
    }
    public void setRATE(double rate){
        this.RATE = rate;
    }
    public double getRATE() {
        return this.RATE;
    }
    public void showInterest() {
        double interest = balance * getRATE() * 1;
        System.out.println("I get interset " + interest + "baht.");
    }
    public void showInterest(int year) {
        double interest = balance * getRATE() * year;
        System.out.println("I get interset " + interest + "baht.");
    }
    public void getInfoAcct() {
        System.out.println(name + " checking account has " + balance + "Baht.");
    }
    public boolean deposit(double a) {
        if (a > 0) {
            this.balance = a;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean withdraw(double a) {
        if (a > 0) {
            this.setBalance(balance - a);
            System.out.println("[CA] Transaction success.");
            return true;
        }
        else if (a <= 0) {
            System.out.println("Not support zero or negative number.");
            return false;
        }
        else {
            System.out.println("[CA] Transaction fail");
            return false;
        }
    }
}
