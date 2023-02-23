public class Programmer extends Employee {
      private int happiness;
      public void coding (String str) {
            if (this.getEnergy() >= 30) {
                  System.out.println("Your code is " + str);
            }
            else {
                  System.out.println("Error Error Error");
            }
            this.setEnergy(this.getEnergy() - 30);
            this.happiness -= 30;
      }
      public void coding (char str) {
            if (this.getEnergy() >= 30) {
                  System.out.println("Your code is " + str);
            }
            else {
                  System.out.println("Error Error Error");
            }
            this.setEnergy(this.getEnergy() - 30);
            this.happiness -= 30;
      }
      public int getHappiness () {
            return happiness;
      }
      public void setHappiness (int happiness) {
            this.happiness = happiness;
      }
}
