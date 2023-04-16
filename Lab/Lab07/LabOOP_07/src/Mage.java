public class Mage extends Player {
      public Mage () {
            this.setHP(10);
            this.setMP(20);
            this.setATK(5);
      }
      public void addEquipment (Item i) {
            i.use(this);
      }
      public void attack (Player p) {
            p.attacked(this.getATK() * 2.5);
            this.setMP(this.getMP() - 5);
      }
      public void attacked (double n) {
            this.setHP(this.getHP() - n);
      }
}
