public class Practice_Main {
      public static void main(String[] args) {
            Mage m1 = new Mage();
            Novice n1 = new Novice();
            
            Rod r1 = new Rod();
            Sword s1 = new Sword();
            
            Potion p1 = new Potion();
            Potion p2 = new Potion();
            
            System.out.println("------------------------------");
            System.out.println("Mage \t" + m1);
            System.out.println("Novice \t" + n1);
            System.out.println("------------------------------");
            
            m1.addEquipment(r1);
            n1.addEquipment(s1);
            
            System.out.println("Mage \t" + m1);
            System.out.println("Novice \t" + n1);
            System.out.println("------------------------------");
            
            m1.attack(n1);
            
            System.out.println("Mage \t" + m1);
            System.out.println("Novice \t" + n1);
            System.out.println("------------------------------");
            
            m1.addEquipment(p1);
            n1.addEquipment(p2);
            
            System.out.println("Mage \t" + m1);
            System.out.println("Novice \t" + n1);
            System.out.println("------------------------------");
            
            m1.addEquipment(p1);
            
            System.out.println("Mage \t" + m1);
            System.out.println("Novice \t" + n1);
            System.out.println("------------------------------");
      }
}
