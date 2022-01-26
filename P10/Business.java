import java.text.DecimalFormat;
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class Business extends AirTicket {
/**
* double award_miles = 2.0.
*/
   public static final double AWARDMILES = 2.0;

   protected double foodBeverage;
   protected double entertainment;
         /**
* constructor Business.
* @param foodBeverageIn in
* @param entertainmentIn in
* @param flightNumIn in
* @param tripdataIn in
* @param baseFareIn in
* @param fareAdjFactIn in
*/


   public Business(String flightNumIn, Itinerary tripdataIn,
      double baseFareIn, double fareAdjFactIn,
          double foodBeverageIn, double entertainmentIn) {
      super(flightNumIn, tripdataIn, baseFareIn, fareAdjFactIn);
      foodBeverage = foodBeverageIn;
      entertainment = entertainmentIn;
   
   }
   
     /**
* double getFoodBeverage.
* @return foodBeverage
*/
   
   public double getFoodBeverage() {
   
      return foodBeverage;
   
   }
           /**
* double getEntertainment.
* @return entertainment
*/
   
   public double getEntertainment() {
   
      return entertainment;
   
   }      
   
        /**
* double totalFare.
* @return multiply
*/
   
   public double totalFare() {
   
   
      return getBaseFare() * getFareAdjustmentFactor() 
         + getFoodBeverage() + getEntertainment();
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
* @return null
*/

   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
   
      return super.toString() 
         + "\n   Includes Food/Beverage: " + df.format(getFoodBeverage()) 
            + " Entertainment: " + df.format(getEntertainment());
   }


}