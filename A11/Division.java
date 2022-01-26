/**
 * Simple program to print BankLoanTest.
 *
 * Activity 9
 * @author Jong Hyun Jung -COMP 1210 - D01
 * @version 10/12/2021
 */
public class Division {

  /**
   * This is a static intDivide information. 
   * @param denominator int
   * @param numerator int
   * @return number
   */
   public static int intDivide(int numerator, int denominator) {
      
      try {
         
         return numerator / denominator;
         
      }
         
      catch (ArithmeticException error) {
      
         return 0;
      }
   }
   
   
  /**
   * static double decimalDivide.
   * @param numerator int.
   * @param denominator int.
   * @throws IllegalArgumentException connnot be zero.
   * @return number
   **/
   public static double decimalDivide(int 
      numerator, int denominator) {
      
      if (denominator == 0) {
         
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
            
      }
      
      return ((double) numerator / denominator);
      
   }
}