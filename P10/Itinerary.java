 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class Itinerary {

   private String fromAirport;
   private String toAirport;
   private String departureDateTime;
   private String arrivalDateTime;
   private int miles;


      /**
* constructor Itinerary.
* @param fromAirportIn in
* @param toAirportIn in
* @param departureDateTimeIn in
* @param arrivalDateTimeIn in
* @param milesIn in
*/

   public Itinerary(String fromAirportIn, String toAirportIn,
       String departureDateTimeIn, String arrivalDateTimeIn, int milesIn) {
      fromAirport = fromAirportIn;
      toAirport = toAirportIn;
      departureDateTime = departureDateTimeIn;
      arrivalDateTime = arrivalDateTimeIn;
      miles = milesIn;
   }
          /**
* String getFromAirport.
* @return fromAirport
*/
   
   public String getFromAirport() {
   
      return fromAirport; 
   }
   
    /**
* String getToAirport.
* @return toAirport
*/     
   
   
   public String getToAirport() {
   
      return toAirport;
   
   }
    /**
* String getDepDateTime.
* @return departureDateTime
*/           
   
   public String getDepDateTime() {
   
      return departureDateTime;
   
   }
   
   
 /**
* String getArrivalDateTime.
* @return arrivalDateTime
*/      
   
   public String getArrivalDateTime() {
   
      return arrivalDateTime;
      
   }
   
   /**
* String getMiles.
* @return miles
*/ 
   
   public int getMiles() {
   
      return miles;
   
   }
   /**
* String toString.
* @return toStrings
*/ 

   
   public String toString() {
   
      return getFromAirport() + "-" + getToAirport() + " (" 
         + getDepDateTime() + " - " 
         + getArrivalDateTime() + ") " + getMiles() + " miles";
   
   }

   
}
