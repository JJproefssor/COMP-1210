import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
 /**
* Simple program to print CourseInfo.
*
* Project 5
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/24/2021
*/
public class DecagonalPrismListApp {
   /**
 * Print the DecagonalPrismListApp.
 * @param args Command line arguments-not used. 
 */
   /** prints summary of.
   *
   * @param args - is not used.
         * @throws FileNotFoundException required by Scanner for File
         * @throws InputMismatchException required by Scanner for File
               */
   public static void main(String[] args) throws FileNotFoundException,
       InputMismatchException {
    
      Scanner input = new Scanner(System.in);
      ArrayList<DecagonalPrism> dPrism = new Arra yList<DecagonalPrism>();
      System.out.print("Enter file name: ");
      
      String fileName = input.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      
      String dPrismdata = scanFile.nextLine();
      System.out.println("\n" + dPrismdata + "\n");
      while (scanFile.hasNext()) {
         String label = scanFile.next();
         double edge = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         
         DecagonalPrism decagonal = new DecagonalPrism(label, edge, height);
         dPrism.add(decagonal);
         System.out.println(decagonal);
      }
      scanFile.close();
      DecagonalPrismList dPlist = new DecagonalPrismList(dPrismdata, dPrism);
      
      System.out.println("\n" + dPlist.summaryInfo());
   }
}