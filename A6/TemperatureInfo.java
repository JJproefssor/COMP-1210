import java.util.Scanner;
import java.util.ArrayList;
 /**
* Simple program to print CourseInfo.
*
* Project 5
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/24/2021
*/
public class TemperatureInfo {
/** print TemperatureInfo to std output.
   *@param args command line arguments not used
   */
   public static void main(String[] args)  {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      String tempInput = "";
   
   
   
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = input.nextLine().trim();
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempList);
   
   
   
   
      char choice = 'E';
      do {
         System.out.print("Enter choice = [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = input.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L' :
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
         
            case 'H':
               System.out.println("\tHight is " + temps.getHighTemp());
               break;
         
            case 'P' :
               System.out.println(temps);
               break;
         
            case 'E' :
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid Choice!");
         }
      } while (choice != 'E');
   
   
   
   
   }
}



