public class Plane extends Vehicle {
    public void showPlaneInfo () {
        System.out.print("Plane detail is, ");
        this.showInfo();
    }
    public void setPlaneInfo (int s, String t) {
        this.setFuel(s);
        this.setTopSpeed(t);
    }
    public void fly () {
        if (this.getFuel() < 200) {
            System.out.println("Please add fuel.");
        }
        else {
            System.out.println("Fly.");
            this.setFuel(this.getFuel() - 200);
        }
    }
}
