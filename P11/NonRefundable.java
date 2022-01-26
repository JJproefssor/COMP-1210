 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class NonRefundable extends AirTicket {

   private double discountFact;

            /**
* constructor NonRefundable.
* @param discountFactIn in
* @param tripdataIn in
* @param baseFareIn in
* @param fareAdjFactIn In
* @param flightNumIn in
*/



   public NonRefundable(String flightNumIn,
       Itinerary tripdataIn,
      double baseFareIn, double fareAdjFactIn, double discountFactIn)  {
   
      super(flightNumIn, tripdataIn, baseFareIn, fareAdjFactIn);
      
      discountFact = discountFactIn;
   
   }
      /**
* double getDiscountFactor.
* @return discountFact
*/ 


   public double getDiscountFactor() {
   
      return discountFact;
   
   }
         /**
* double totalFare.
* @return multiply
*/ 
   public double totalFare() {
   
      return getBaseFare() * getFareAdjustmentFactor() * getDiscountFactor();
   
   }
/**
* double totalAwardMiles.
* @return getmiles
*/ 

   public int totalAwardMiles() {
   
      return tripdata.getMiles();
   
   }
   /**
* String toString.
* @return toString
*/ 
   public String toString() {
   
      return super.toString() 
         + "\n   Includes DiscountFactor: " + getDiscountFactor();
   
   }






}