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

public class BusinessTest {

/** 
         * test setUp.
         **/
   @Before public void setUp() {
   }


  /** 
         * test getFoodBeverageTest.
         **/
   @Test public void getFoodBeverageTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      double fb =  b.getFoodBeverage();
      double ab = b.getEntertainment();
      Assert.assertEquals(50.0, fb, 0.00001);
   }
   
         /** 
         * test totalFareTest.
         **/
   @Test public void getEntertainmentTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      double fb =  b.getFoodBeverage();
      double ab = b.getEntertainment();
      Assert.assertEquals(50.00, ab, 0.00001);
   }
   
   
   /** 
         * test totalFareTest.
         **/
   
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      double tf = b.totalFare();
      Assert.assertEquals(1000.0, tf, 0.0001);
   }

/** 
         * test totalAwardMilesTest.
         **/

   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 1200);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(2400, b.totalAwardMiles(), 0.00001);
   }
      
      
      /** 
         * test toStringTest.
         **/
      
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
         
      Business business = new Business("10", trip, 1, 1, 1, 1);
   
      String toString = business.toString();
      Assert.assertEquals(true,
            toString.contains("1"));     
      
      
      
   }
}
