import java.util.Scanner;
 /**
* Simple program to print CourseInfo.
*
* Project 4
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/17/2021
*/

public class DecagonalPrismApp {
   /**
 * Print the DecagonalPrismApp.
 * @param args Command line arguments-not used. 
 */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String label;
      double edge;
      double height;
      System.out.println("Enter label, edge, and " 
         + "height for a decagonal prism.");
      System.out.print("\tlabel: ");
      label = input.nextLine();
     
      System.out.print("\tedge: ");
      edge = Double.parseDouble(input.nextLine());
      if (edge < 0) {
         System.out.println("Error: edge must be non-negative.");
         
      }
      else {
         System.out.print("\theight: ");
         height = Double.parseDouble(input.nextLine());
         if (height < 0) {
         
            System.out.println("Error: height must be non-negative.");
         
         
         }
         else {
            DecagonalPrism prism = new DecagonalPrism(label, edge, height);
            System.out.println(prism);
         
         }
      }
   }
}