import java.util.Scanner;
import java.text.DecimalFormat;

 /**
* Simple program to print CourseInfo.
*
* Project 1
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/9/2021
*/

public class UsingMathMethods {
        /**
    * print Messageconverter information to std output.
    * @param args Command line arguments-not used.
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double x;
      double result;
      System.out.print("Enter a value for x: ");
      x = input.nextDouble();
      result = (8 * Math.pow(x, 4) + Math.sqrt(Math.abs(4 * Math.pow(x, 3) 
         + 4 * Math.pow(x, 2) + 4 * x + 4))) / (4 + Math.abs(x));
      System.out.println("Result: " + result);
      String result1 = Double.toString(result);
      
      int midPoint = result1.indexOf(".");
      int length = result1.length();
      int right = (length - 1) - midPoint;
      int left = (length - 1) - right;
      System.out.println("# of characters to left of decimal point: " + left);
      System.out.println("# of characters to right of decimal point: " + right);
      
      String pattern = "#,##0.0##";
      DecimalFormat decimalFormat = new DecimalFormat(pattern);
      String resultFormat = decimalFormat.format(result);
      System.out.println("Formatted Result: " + resultFormat);
   
      
      
   }
}