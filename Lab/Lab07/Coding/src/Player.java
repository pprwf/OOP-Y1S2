public abstract class Player {
      private double HP;
      private double MP;
      private double EXP;
      private double Money;
      private double ATK;
      public void setHP (double HP) {
            this.HP = HP;
            if (this.HP < 0) {
                  this.HP = 0;
            }
      }
      public double getHP () {
            return this.HP;
      }
      public void setMP (double MP) {
            this.MP = MP;
      }
      public double getMP () {
            return this.MP;
      }
      public void setEXP (double EXP) {
            this.EXP = EXP;
      }
      public double getEXP () {
            return this.EXP;
      }
      public void setMoney (double Money) {
            this.Money = Money;
      }
      public double getMoney () {
            return this.Money;
      }
      public void setATK (double ATK) {
            this.ATK = ATK;
      }
      public double getATK () {
            return this.ATK;
      }
      public String toString () {
            return "HP : " + this.HP + " MP : " + this.MP + " ATK : " + this.ATK;
      }
      public abstract void attack (Player p);
      public abstract void attacked (double n);
}
