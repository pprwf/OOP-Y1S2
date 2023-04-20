public class Customer {
      private String firstName;
      private String lastName;
      private CheckingAccount acct;
      public Customer (String firstName, String lastName, CheckingAccount acct) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.acct = acct;
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
      public boolean equals (Customer c) {
            return (this.getFirstName() + this.getLastName()).equals(c.getFirstName() + c.getLastName());
      }
}
