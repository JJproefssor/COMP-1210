import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
    /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class AirTicketProcessor {

   private AirTicket[] aT;
   private String[] invalidRecords;
    /**
* constructor AirTicketProcessor.
*/



   public AirTicketProcessor() {
      aT = new AirTicket[0];
      invalidRecords = new String[0];
   }
      /**
    * double getBaseFare.
    * @param fileName String
    * @throws FileNotFoundException if the file cannot be opened.
    */

   public void readAirTicketFile(String fileName) throws FileNotFoundException
   {
      Scanner s = new Scanner(new File(fileName));
      String line;
      String[] word = new String[0];
      Scanner scan;
   
      while (s.hasNextLine()) {
      
         word = new String[0];
         
         line = s.nextLine();
         
         scan = new Scanner(line);
         
         scan.useDelimiter(",");
      
         while (scan.hasNext()) {
         
            word = Arrays.copyOf(word, word.length + 1);
            
            word[word.length - 1] = scan.next();
         }
      
         Itinerary trip = new Itinerary(word[2], word[3], 
            word[4], word[5], Integer.parseInt(word[6]));
      
         switch(Character.toUpperCase(word[0].charAt(0))) {
         
            case 'N':
            
               NonRefundable n = new NonRefundable(word[1], trip, 
                  Double.valueOf(word[7]),
                  Double.valueOf(word[8]),  Double.valueOf(word[9]));
                  
               addAirTicket(n);
             
               break;
         
            case 'E':
            
               Economy e = new Economy(word[1], trip, Double.valueOf(word[7]),
                    Double.valueOf(word[8]));
                    
               addAirTicket(e);
               
               break;
         
            case 'B':
            
               Business b = new Business(word[1], trip,
                    Double.valueOf(word[7]),  Double.valueOf(word[8]),
                      Double.valueOf(word[9]),  Double.valueOf(word[10]));
                      
               addAirTicket(b);
               
               break;
         
            case 'F':
            
               Elite f = new Elite(word[1],
                   trip, Double.valueOf(word[7]), Double.valueOf(word[8]),
                      Double.valueOf(word[9]),
                         Double.valueOf(word[10]), Double.valueOf(word[11]));
                         
               addAirTicket(f);
               
               break;
         
            default:
            
               System.out.println("error");
               
         }
      }
   }
      /**
    * double getBaseFare.
    * @param at Airticket
    */
   public void addAirTicket(AirTicket at) {
   
      aT = Arrays.copyOf(aT, aT.length + 1);
      
      aT[aT.length - 1] = at;
      
   }
   
      /**
    * double addInvalidRecord.
    * @param aIrecord String
    */
    
   public void addInvalidRecord(String aIrecord) {
   
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      
      invalidRecords[invalidRecords.length - 1] = aIrecord;
      
   }
      /**
    * double generateReport.
    * @return output.
    */
   public String generateReport() {
   
   
      String output = "----------------------------\n"
         + "Air Ticket Report\n" + "----------------------------\n\n";
      
      for (int i = 0; i < aT.length; i++) {
      
         output += aT[i] + "\n\n";
         
      }
      
      return output;
      
   }
   
      /**
    * double generateReportByFlightNum.
    * @return generateReport.
    */
    
   public String generateReportByFlightNum() {
      String output = "--------------------------------------\n" 
         + "Air Ticket Report (by Flight Number)\n" 
         + "--------------------------------------\n\n";
   
         
      Arrays.sort(aT);
      
      for (int i = 0; i < aT.length; i++) {
      
         output += aT[i] + "\n\n";
         
      }
      
      return output;
      
   }
   
      /**
    * String generateReportByItinerary.
    * @return generateReport.
    */
    
   public String generateReportByItinerary() {
   
      String output = "--------------------------------------\n" 
         + "Air Ticket Report (by Itinerary)\n" 
         + "--------------------------------------\n\n";
   
      Arrays.sort(aT, new ItineraryComparator());
      for (int i = 0; i < aT.length; i++) {
      
         output += aT[i] + "\n\n";
         
      }
      return output;
      
   }
   
}