public class Bank {
      private Account acct [];
      private int numAcct;
      public Bank () {
            //im too lazy wa
      }
      public void addAccount (Account ac) {
            this.acct = new Account [10];
      }
      public Account[] getAccount (int index) {
            return this.acct;
      }
      public int getNumAccount () {
            return this.numAcct;
      }
}
