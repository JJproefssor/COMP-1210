import java.text.DecimalFormat;
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class Elite extends Business {

   private double commService;
   
   
               /**
* constructor Elite.
* @param commServiceIn in
* @param flightNumIn in
* @param tripdataIn in
* @param baseFareIn in
* @param foodBeverageIn in
 * @param fareAdjFactIn in
 * @param entertainmentIn in
*/
   

   public Elite(String flightNumIn, Itinerary tripdataIn,
         double baseFareIn, double fareAdjFactIn, double foodBeverageIn,
          double entertainmentIn, double commServiceIn) {
      super(flightNumIn, tripdataIn, baseFareIn,
         fareAdjFactIn, foodBeverageIn, entertainmentIn);
      commService = commServiceIn;
   }

     /**
* double totalFare.
* @return multiply
*/
   public double totalFare() {
      double total = super.totalFare() + getCommService();
      return total;
   
   }
   
   /**
* double getCommService.
* @return commService
*/
   
   public double getCommService() {
      return commService;
   }

           /**
* String toString.
* @return 0
*/

   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() 
         + "\n   Includes: Comm Services: " + df.format(getCommService());
   }




   
   
}