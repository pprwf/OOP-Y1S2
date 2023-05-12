public class Merchant extends Person {
    public Merchant() {
        this(0, 0.0, "", '', false, null);
        System.out.println("My name is " + getName() + "in Merchant class.");
    }
    public Merchant(String name, CheckingAccount myAcct, Item myItem) {
        super(name, myAcct, myItem);
        System.out.println("My name is " + getName() + "in Merchant class.");
    }
    public Item sellItem(Person w) {
        if ()
    }
    public boolean collectMoney(Person w, double p) {
        System.out.println("[Merchant] - I got " + w.getName() + " money " + p);
        System.out.println("[Merchant] - " + w.getName() + " is not enough money.");
    }
    public String getInfo() {
        return "[Merchant] - My name is " + getName() + ". " + getMyAcct() + " " + getItem();
    }
}
