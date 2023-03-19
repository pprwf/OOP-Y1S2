public class Customer {
      private String firstName;
      private String lastName;
      private CheckingAccount acct;
      public Customer () {
            
      }
      public Customer (String firstName, String lastName) {
            
      }
      public Customer (String firstName, String lastName, CheckingAccount acct) {
            
      }
      public void setFirstName (String firstName) {
            this.firstName = firstName;
      }
      public String getFirstName () {
            return this.firstName;
      }
      public void setLastName (String lastName) {
            this.lastName = lastName;
      }
      public String getLastName () {
            return this.lastName;
      }
      public void setAcct (CheckingAccount acct) {
            this.acct = acct;
      }
      public CheckingAccount getAcct () {
            return this.acct;
      }
      public String toString () {
            return "";
      }
      public boolean equals (Customer c) {
            return c.equals(c);
      }
}
