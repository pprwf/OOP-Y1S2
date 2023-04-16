public class Bank {
      private Account acct [];
      private int numAcct;
      public Bank () {
            this.acct = new Account [10];
      }
      public void addAccount (Account ac) {
            this.acct [numAcct] = ac;
            this.numAcct++;
      }
      public Account getAccount (int index) {
            return this.acct [index];
      }
      public int getNumAccount () {
            return this.numAcct;
      }
}
