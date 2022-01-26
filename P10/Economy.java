 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class Economy extends AirTicket {

  /**
* double calculateCost.
 */   
   public static final double AWARDMILES  = 1.5;

                  /**
* constructor Economy.
* @param flightNumIn in
* @param tripdataIn in
* @param baseFareIn in
 * @param fareAdjFactIn in
*/


   public Economy(String flightNumIn, Itinerary tripdataIn,
      double baseFareIn, double fareAdjFactIn) {
   
      super(flightNumIn, tripdataIn, baseFareIn, fareAdjFactIn);
   
   }
 /**
* double totalFare.
* @return multiply
*/
   public double totalFare() {
   
      return getBaseFare() * getFareAdjustmentFactor();
   
   }
 /**
* double totalAwardMiles.
* @return output
*/
   public int totalAwardMiles() {
   
   
      double output = tripdata.getMiles() * AWARDMILES;
      return (int) output;
   }
 /**
* String toString.
* @return string
*/
   public String toString() {
   
      return super.toString() 
         + "\n   Includes Award Miles Factor: " + AWARDMILES;
   }

}