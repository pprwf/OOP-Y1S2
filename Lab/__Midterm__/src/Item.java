public class Item {
    private String name;
    private double price;

    public Item() {
        this("", 0.0);
        System.out.println("Item name " + this.name + " is equal to " + this.price + " baht.");
    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Item name " + this.name + " is equal to " + this.price + " baht.");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public String toString() {
        return this.name + " price " + this.price + " baht.";
    }
}
