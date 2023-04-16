public class Exam3_Main {
    public static void main(String[] args) {
    Plane p1 = new Plane();
    p1.setPlaneInfo(500, "High");
    p1.showPlaneInfo();
    Car c1 = new Car();
    c1.setCarInfo(500, "High", "Diesel");
    c1.showCarInfo();
    
    System.out.println("");
    
    Plane p2 = new Plane();
    p2.setPlaneInfo(300, "High");
    p2.showPlaneInfo();
    p2.fly();
    p2.showPlaneInfo();
    p2.fly();
    p2.showPlaneInfo();
    
    System.out.println("");
    
    Car c2 = new Car();
    c2.setCarInfo(60, "High", "Diesel");
    c2.showCarInfo();
    c2.move();
    c2.showCarInfo();
    c2.move();
    c2.showCarInfo();
    }
}
