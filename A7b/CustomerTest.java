import org.junit.Assert;
import org.junit.Test;

    /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class CustomerTest {



   /**
    *location test 2.
    */
   @Test public void setLocationTest1() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   
   }



   /**
    *location test 2.
    */
   @Test public void setLocationTest2() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      System.out.println(cstmr);
      Assert.assertEquals("Atlanta,GA", cstmr.getLocation());
   
   }

  /**
   * Tests the changeBalance.
   */
   @Test public void changeBalanceTest() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   
   }



  /**
   * ToString test.
   */
   @Test public void toStringTest() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", 
            cstmr.toString());
   
   }


  /**
   * Compare to the test 1.
   */
   @Test public void compareToTest1() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   
   }
  
  
  
  /**
   * Compare to the test 2.
   */
   @Test public void compareToTest2() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   } 
  
  
  
  /**
   * Compare to the test 3.
   */
   @Test public void compareToTest3() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}