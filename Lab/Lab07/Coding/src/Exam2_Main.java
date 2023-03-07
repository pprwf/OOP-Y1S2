public class Exam2_Main {
      public static void main(String[] args) {
//            System.out.println("------------------------------");
//            System.out.println("Case Interface #01\n");

//            Flyable f1 = new Flyable();
//            Floatable f2 = new Floatable();
//            Dieselable d = new Dieselable();
            
            System.out.println("------------------------------");
            System.out.println("Case Pigeon #01\n");
            
            Pigeon p1 = new Pigeon(10, 15, 20);
            System.out.println(p1);
            p1.takeOff();
            System.out.println(p1);
            p1.fly();
            System.out.println(p1);
            p1.landing();
            System.out.println(p1);
            p1.eat("seed");
            System.out.println(p1);
            Pigeon p3 = new Pigeon();
            System.out.println(p3);
            
            System.out.println("------------------------------");
            System.out.println("Case Vehicle #01\n");
            
            Plane pl1 = new Plane(200, "IT Airline", "FX-747");
            Ship s1 = new Ship(200);
            System.out.println("=== plane ===");
            pl1.startEngine();
            pl1.takeOff();
            pl1.fly();
            pl1.fly();
            pl1.honk();
            pl1.landing();
            pl1.stopEngine();
            System.out.println("=== ship ===");
            s1.startEngine();
            s1.move(2);
            s1.honk();
            s1.stopEngine();
      }
}
