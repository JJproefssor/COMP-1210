import java.util.Scanner;
       /**
     * print TwoVariableExpression information to std output.
     * @param args Command line arguments-not used.
     */
  /**
 * Simple program to print TwoVariableExpression.
 *
 * TwoVariableExpression
 * @author Jong Hyun Jung -COMP 1210 - D01
 * @version 9/3/2021
 */
public class TwoVariableExpression {
/**
   * print TwoVariableExpression information to std output.
   * @param args Command line arguments-not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x;
      double y;
      double result; 
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      if (x * y == 0) {
         System.out.println("result is \"undefined\"");
      }
      else {
         result = ((4.5 * x + 12.5) * (3 * y - 9.0)) / (x * y);
         System.out.println("result = " + result);
      }
   }
}