/**
 * Simple program to creat a UserInfo class.
 *
 * Activity 04
* @author Jong Hyun Jung 1210-D01
* @version 9/14/2021
*/
 
public class UserInfo {
   
   //instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
     
   /**
    * Print the UserInfo class.
    * @param firstNameIn Command line arguments-not used. 
    * @param lastNameIn Command line arguments-not used. 
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
          
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
      
   /**
    * Print the UserInfo class.
    * @return string
    */

   public String toString() {
   //methods
      String output = "Name: " + firstName + " "
                      + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
      
   /**
    * Print the UserInfo class.
    * @param locationIn Command line arguments-not used. 
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }

   /**
    * Print the UserInfo class.
    * @param ageIn Command line arguments-not used.
    * @return boolean age 
    */

   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;  
         isSet = true;
      }
      return isSet; }
   /**
    * Print the UserInfo class.
    * @return int age
    */

   public int getAge() {
      return age; }
      
   /**
    * Print the UserInfo class.
    * @return String Command line arguments-not used. 
    */

   public String getLocation() {
      return location; }
   /**
    * Print the UserInfo class.
    * 
    */

   public void logOff() {
      status = OFFLINE; }
    /**
    * Print the UserInfo class.
    * 
    */

   public void logOn() {
      status = ONLINE;
   }
}