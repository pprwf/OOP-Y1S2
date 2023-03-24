import java.util.ArrayList;

public class Customer {
      private String firstName;
      private String lastName;
      private ArrayList acct;
      private int numOfAccount;
      public Account getAccount (int index) {
            return (Account) this.acct.get(index);
      }
      public void addAccount (Account acct) {
            this.acct.add(acct);
            this.numOfAccount++;
      }
      public int getNumOfAccount () {
            return this.acct.size();
      }
      public Customer () {
            this("", "");
      }
      public Customer (String firstName, String lastName) {
            this.acct = new ArrayList();
            this.firstName = firstName;
            this.lastName = lastName;
      }
//      public Customer (String firstName, String lastName, CheckingAccount acct) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.acct = acct;
//      }
//      public void setFirstName (String firstName) {
//            this.firstName = firstName;
//      }
//      public String getFirstName () {
//            return this.firstName;
//      }
//      public void setLastName (String lastName) {
//            this.lastName = lastName;
//      }
//      public String getLastName () {
//            return this.lastName;
//      }
//      public void setAcct (CheckingAccount acct) {
//            this.acct = acct;
//      }
//      public CheckingAccount getAcct () {
//            return this.acct;
//      }
      public String toString () {
            return this.firstName + " " + this.lastName + " has " + this.numOfAccount + " accounts.";
      }
//      public boolean equals (Customer c) {
//            return (this.getFirstName() + this.getLastName()).equals(c.getFirstName() + c.getLastName());
//      }
}
