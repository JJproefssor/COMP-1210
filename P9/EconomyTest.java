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
public class EconomyTest {

/** 
         * test setUp.
         **/
   @Before public void setUp() {
   }
/** 
         * test totalFareTest.
         **/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
   
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      Assert.assertEquals(450, e.totalFare(), 0.0001);
   }
   
   /** 
         * test totalAwardMilesTest.
         **/
   
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
   
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      Assert.assertEquals("Error ", 1800, e.totalAwardMiles());
   } 
        
        /** 
         * test toString.
         **/
        
        
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy eco = new Economy("ATL", trip, 1, 1);
   
      String toString = eco.toString();
      Assert.assertEquals(true,
            toString.contains("1"));
   }  
   
   
}
