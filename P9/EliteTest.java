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



public class EliteTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1600);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals("Error", 1325.0, be.totalFare(), 0.0001);  
   }
         /** 
         * test totalawardmiles.
         **/      
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1600);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals("Error ", 3200, be.totalAwardMiles());  
   }
   /** 
         * test getCommServiceTest.
         **/
   
   @Test public void getCommServiceTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1600);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals(100, be.getCommService(), 0.0001); 
   
   }
    /** 
         * test toString.
         **/   
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Elite eli = new Elite("ATL", trip, 1, 1, 1, 1, 1);
         
      String toString = eli.toString();
      Assert.assertEquals(true,
            trip.toString().contains("LGA"));
   }

   
   

   
}
