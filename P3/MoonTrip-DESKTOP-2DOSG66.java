import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
 /**
* Simple program to print CourseInfo.
*
* Project 1
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/9/2021
*/

public class MoonTrip {
   /**
    * Print the ticket information with an input data.
    * @param args Command line arguments-not used. 
    */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("0%");
      DecimalFormat fmt3 = new DecimalFormat("00000");
      Random generator = new Random();
   
      String input = "";
      String date = "";
      String year = "";
      String day = "";
      String month = "";
      String hour = "";
      String minutes = "";
      String time = "";
      String seat = "";
      String description = "";
      String ticket;
   
      double discount = 0.0;
      double price = 0.0;
      double cost = 0.0;
      int prize = 0;
      
      
      System.out.print("Enter ticket code: ");
      ticket = userInput.nextLine();
      ticket = ticket.trim();
      
      if (ticket.length() < 27) {
      
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
      else {
      
         description = ticket.substring(26);
      
         month = ticket.substring(0, 2);
         day = ticket.substring(2, 4);
         year = ticket.substring(4, 8);
         date = (month + "/" + day + "/" + year);
         
      
         hour = ticket.substring(8, 10);
         minutes = ticket.substring(10, 12);
         time = (hour + ":" + minutes);
      
         seat = ticket.substring(23, 26);
          
         price = Double.parseDouble(ticket.substring(12, 21)) / 100;
          
         discount = Double.parseDouble(ticket.substring(21, 23)) / 100;
          
         cost = price * (1 - discount);
          
         prize = (int) generator.nextInt(10000);
          
         System.out.print("\nTicket: " + description + "   Date: " + date
                + "   Time: " + time
                + "\nSeat: " + seat + "   Price: "
                + fmt1.format(price) + "   Discount: "
                + fmt2.format(discount)
                + "   Cost: " + fmt1.format(cost));
         System.out.print("\nPrize Number: " + fmt3.format(prize));
          
      }
       
   }
}