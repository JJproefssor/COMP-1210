/**
 * Simple program to print BankLoanTest.
 *
 * Activity 9
 * @author Jong Hyun Jung -COMP 1210 - D01
 * @version 10/12/2021
 */
 



public class InvalidCategoryException extends Exception {

/**
    * void generateReportForInvalidIn.
    * @param category sdf.
    */


   public InvalidCategoryException(String category) {
    
      super("For category: " + "\"" + category + "\"");
   
   }
}