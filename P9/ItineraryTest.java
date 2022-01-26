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
public class ItineraryTest {


   /** 
   * test setUp.
   **/
   @Before public void setUp() {
   }

/** 
         * test getFromAirportTest.
         **/

   @Test public void getFromAirportTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("Error: ", "ATL", trip.getFromAirport());
   }

/** 
         * test getDepDateTimeTest.
         **/

   @Test public void getDepDateTimeTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("Error: ", "2021/11/21 1400", trip.getDepDateTime());
   }
   
   /** 
         * test getArrivalDateTimeTest.
         **/
   @Test public void getArrivalDateTimeTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("Error: ", 
         "2021/11/21 1640", trip.getArrivalDateTime());
   }
/** 
         * test getMilesTest.
         **/
   @Test public void getMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("Error: ", 800, trip.getMiles());
   }




  /** 
         * test ToStringTest.
         **/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      String toString = trip.toString();
      Assert.assertEquals(true,
            trip.toString().contains("LGA"));
   }
}
