 /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class Customer implements Comparable<Customer> {
    
   private String name;
   private String location;
   private double balance;

   /**
    * customer.
    * @param nameIn Command line argument-not used.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
      
      
   }
   
   
   
  /**
   * get location.
   * @return location
   */ 
   public String getLocation() {
   
   
      return location;
   }



  
  /**
   * Set location.
   * @param locationIn Command line arguments-not used.
   */
   public void setLocation(String locationIn) {
   
      
      location = locationIn;
   }
   
   
  /**
   * Set location.
   * @param city Command line arguments-not used.
   * @param state Command line arguments-not used.
   */
   public void setLocation(String city, String state) {
          
      location = city + ", " + state;
   }
   
   
   
  /**
   * Gets balance.
   * @return balance
   */
   public double getBalance() {
      
      return balance;
   }   
  
  /**
   * Change baLance.
   * @param baLance Command line arguments-not used.
   */
   public void changeBalance(double baLance) {
   
      this.balance += baLance;
   
   }
  
  /**
   * Exhibits string customer object.
   * @return String
   */
   public String toString() {
   
   
      return name + "\n" + location + "\n" + "$" + balance;
    
   }
  
   /**
    * Compares two Customer.
    * @param obj Customer.
    * @return 0
       */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}