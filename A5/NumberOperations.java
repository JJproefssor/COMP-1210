 /**
* Simple program to print CourseInfo.
*
* Activity 5
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/23/2021
*/
public class NumberOperations {
   private int number; 
      /**
    * returning label.
    *@param numberIn Command line arguments
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
 /**
    * returning placeholder return.
    *@return 0
    */
   public int getValue()
   {
      return number;
   }
 /**
    * String oddsUnder information to std output.
    * @return String
    */

   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
         
      }
      return output;
   }
/**
     * returning numbers of power under two.
     * @return 
     * as String
     */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; 
         // concatenate to output
         powers = powers * 2; 
         // get next power of 2
      }
      return output;
   }
/**
     * Print the compareNumber. 
     * @param compareNumber Command line arguments
     * @return number
     */

   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
/**
    * String toString.
    * @return a String
           */
   public String toString() {
      return number + "";
   }
}
