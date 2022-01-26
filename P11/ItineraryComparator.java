import java.util.Comparator;
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class ItineraryComparator implements Comparator<AirTicket> {
     /**
* compare airticket.
* @param t1 AirTicket
* @param t2 AirTicket
* @return compare
 */   

   public int compare(AirTicket t1, AirTicket t2) {
   
   
   
      return 
         t1.getItinerary().toString().compareTo(t2.getItinerary().toString());
      
      
      
   }
   
   
   
}