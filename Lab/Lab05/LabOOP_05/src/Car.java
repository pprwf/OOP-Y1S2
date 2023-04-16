public class Car extends Vehicle {
    private String typeEngine;
    public void setTypeEngine (String t) {
        typeEngine = t;
    }
    public String getTypeEngine () {
        return typeEngine;
    }
    public void showCarInfo () {
        System.out.println("Car engine is " + typeEngine + ".");
        this.showInfo();
    }
    public void setCarInfo (int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        typeEngine = y;
    }
    public void move () {
        if (this.getFuel() < 50) {
            System.out.println("Please add fuel.");
        }
        else {
            System.out.println("Move.");
            this.setFuel(this.getFuel() - 50);
        }
    }
}
