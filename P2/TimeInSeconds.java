import java.util.Scanner;
       /**
     * print TimeInSeconds information to std output.
     * @param args Command line arguments-not used.
     */
  /**
 * Simple program to print TimeInSeconds.
 *
 * TimeInSeconds
 * @author Jong Hyun Jung -COMP 1210 - D01
 * @version 9/3/2021
 */
public class TimeInSeconds {
/**
   * print TimeInSeconds information to std output.
   * @param args Command line arguments-not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int days, hours, minutes, seconds, allTime = 0;
      System.out.print("Enter the raw time in seconds: ");
      allTime = userInput.nextInt();
      if (allTime < 0) {
         System.out.println("*** Time must be non-negative. ***");
      }
      else {
         System.out.println();
         System.out.println("Time by combined days, hours, minutes, seconds: ");
      // 60*60*24=86400, 86400/2
         days = allTime / 86400;
         hours = (allTime - 86400 * days) / 3600;
         minutes = (allTime - 86400 * days - 3600 * hours) / 60;
         seconds = (allTime - 86400 * days - 3600 * hours - 60 * minutes);
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println();
         //add all the times and date
         System.out.println(allTime + " seconds = " + days + " days, "
            + hours + " hours, " + minutes + " minutes, " + seconds 
            + " seconds");
      }
   }
}