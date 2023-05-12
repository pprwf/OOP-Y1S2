public class Wizard extends Person {
    public Wizard() {
        this(0, 0.0, "", '', false, null);
        System.out.println("My name is " + getName() + "in Wizard class.");
    }
    public Wizard(String name, CheckingAccount myAcct, Item myItem) {
        super(name, myAcct, myItem);
        System.out.println("My name is " + getName() + "in Wizard class.");
    }
    public void buyItem(Person m) {
        if (m.sellItem(w)) {
            System.out.println("[Wizard] I got it.");
        }
    }
    public boolean pay(Person m, double p) {
        if (m.getMyAcct().withdraw(p) == true) {
            m.collectMoney(Person w, double p);
            System.out.println("[Wizard] - I have paid the item fees to " + m.getName());
        }
        else {
            System.out.println("[Wizard] - I do not have enough money.");
        }
    }
    public String getInfo() {
        return "[Wizard] - My name is " + getName() + ". " + getMyAcct() + " " + getItem();
    }
}
