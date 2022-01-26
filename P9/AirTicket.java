import java.text.DecimalFormat;
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public abstract class AirTicket {

   protected String flightNum;
   protected Itinerary tripdata;
   protected double baseFare;
   protected double fareAdjFact;
         /**
* constructor AirTicket.
* @param flightNumIn in
* @param tripdataIn in
* @param baseFareIn in
* @param fareAdjFactIn In
*/

   public AirTicket(String flightNumIn, Itinerary tripdataIn,
      double baseFareIn, double fareAdjFactIn) {
   
      flightNum = flightNumIn;
      tripdata = tripdataIn;
      baseFare = baseFareIn;
      fareAdjFact = fareAdjFactIn;
   
   }
              /**
* double toString.
* @return super to string.
*/
   public String getFlightNum() {
      return flightNum;
   }
              /**
* double getBaseFare.
* @return baseFare.
*/
   public double getBaseFare() {
   
      return baseFare;
      
   }
              /**
* double getFareAdjustmentFactor.
* @return fareAdjFact.
*/
   public double getFareAdjustmentFactor() {
   
      return fareAdjFact;
   
   }
        /**
* double toString.
* @return super to string.
*/
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      return "Flight: " + getFlightNum() + "\n" + tripdata.toString()
              + " (" + totalAwardMiles() + " award miles)"
              + "\nBase Fare: " + df.format(getBaseFare())
              + " Fare Adjustment Factor: " + getFareAdjustmentFactor()
              + "\nTotal Fare: " + df.format(totalFare()) 
               + " (" + getClass() + ")";
   
   }
     /**
* double totalFare.
* @return abstract d
*/
   public abstract double totalFare();
  
         /**
* int totalAwardMiles.
* @return abstract d
*/
   public abstract int totalAwardMiles();
   
   
   
}