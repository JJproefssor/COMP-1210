import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
    /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/



public class NonRefundableTest {


      /** 
         * test setUp.
         **/
         
   @Before public void setUp() {
   }


      /** 
         * test getDiscountFactorTest.
         **/
   
   @Test public void getDiscountFactorTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
   
      Assert.assertEquals(0.90, nr.getDiscountFactor(), 0.00001);
   }
   /** 
         * test totalFareTest.
         **/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
   
      Assert.assertEquals(182.25, nr.totalFare(), 0.0001);
   }
   
   /** 
         * test totalAwardMilesTest.
         **/
   
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
   
      Assert.assertEquals("Error: ", 800, nr.totalAwardMiles());
   }
   /** 
         * test toStringTest.
         **/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable non = new NonRefundable("ATL", trip, 1, 1, 1);
   
         
      String toString = non.toString();
      Assert.assertEquals(true,
            trip.toString().contains("LGA"));
   }      
   
   
}   





