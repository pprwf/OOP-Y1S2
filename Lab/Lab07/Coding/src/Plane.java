public class Plane extends Vehicle implements Flyable {
      private String airline;
      private String boeing;
      private static final int MAX_FLYER = 2;
      public Plane () {
            this(0, "", "");
      }
      public Plane (double fuel, String airline, String boeing) {
            this.fuel = fuel;
            this.airline = airline;
            this.boeing = boeing;
      }
      public void setAirline (String airline) {
            this.airline = airline;
      }
      public String getAirline () {
            return this.airline;
      }
      public void setBoeing (String boeing) {
            this.boeing = boeing;
      }
      public String getBoeing () {
            return this.boeing;
      }
      public void startEngine () {
            if (this.getFuel() >= 20) {
                  this.setFuel(this.getFuel() - 20);
                  System.out.println("Plane’s Engine starts");
            }
            else {
                  System.out.println("Fuel is not enough.");
            }
      }
      public void stopEngine () {
            System.out.println("Plane’s Engine stops");
      }
      public void honk () {
            System.out.println("Weeeeeee");
      }
      public void fly () {
            if (this.getFuel() >= 20) {
                  this.setFuel(this.getFuel() - 20);
                  System.out.println("Plane Fly");
            }
            else {
                  System.out.println("Fuel is nearly empty.");
            }
      }
      public void takeOff () {
            if (this.getFuel() >= 10) {
                  this.setFuel(this.getFuel() - 10);
                  System.out.println("Plane Already to Take Off");
            }
            else {
                  System.out.println("Fuel is nearly empty.");
            }
      }
      public void landing () {
            if (this.getFuel() >= 10) {
                  this.setFuel(this.getFuel() - 10);
                  System.out.println("Plane Already to Landing");
            }
            else {
                  System.out.println("Fuel is nearly empty.");
            }
      }
}
