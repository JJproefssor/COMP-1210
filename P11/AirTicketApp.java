import java.io.FileNotFoundException;

 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/



public class AirTicketApp {

           /**
    * print Messageconverter information to std output.
    * @param args Command line arguments-not used.
    * @throws FileNotFoundException if the file cannot be opened.
    */

   public static void main(String[] args) throws FileNotFoundException {
   
      AirTicketProcessor atp = new AirTicketProcessor();
      boolean fileOpened =  false;
   
      if (args.length == 0) {
      
         System.out.println("File name expected as "
            + "command line argument.\nProgram ending.");
                                  
      }
      
      else {
      
         String fileName = args[0];
         
         try {
         
            atp.readAirTicketFile(fileName);
         
         }
         
         catch (FileNotFoundException e) {
         
            System.out.print("Please try again");
         
         }
         
         System.out.print(atp.generateReport());
         
         System.out.print(atp.generateReportByFlightNum());
         
         System.out.print(atp.generateReportByItinerary());
         
         System.out.print(atp.generateReportForInvalidInput());
      
         
      }
   }

}