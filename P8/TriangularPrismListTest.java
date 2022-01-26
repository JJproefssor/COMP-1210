import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


    /**
* Simple program to print BankLoanTest.
*
* Project 8
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class TriangularPrismListTest {


/**
*before setup.
**/

   @Before public void setUp() {
   }
    /**
  * Test getName.
  **/
   @Test public void getNameTest() {
     
      TriangularPrism[] tplTest = new TriangularPrism[3];
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      
      TriangularPrismList tpL = new TriangularPrismList("Test List", 
         tplTest, 3);
         
         
      Assert.assertEquals("Error: ", "Test List", tpL.getName());
      
   }
   
 /**
  * Test TriangularPrisms.
  **/
   @Test public void numberofTriangularPrismsTest() {
     
      TriangularPrism[] tplTest = new TriangularPrism[3];
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals("Error: ", 3, tpL.numberOfTriangularPrisms());
      
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
      
      TriangularPrismList tpL1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
         
      Assert.assertEquals("Error: ", 0, tpL1.numberOfTriangularPrisms());
   }
           
    /**
     * Test surface Area.
     **/
   @Test public void surfaceAreaTest() {
     
      TriangularPrism[] tplTest = new TriangularPrism[3];
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
         
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
      Assert.assertEquals("Error: ", 17048.423, 
         tpL.totalSurfaceArea(), 0.001);
   
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
         
      TriangularPrismList tpL1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
      Assert.assertEquals("Error: ", 0, 
         tpL1.totalSurfaceArea(), 0.001);
     
     
        
   }
    
    /**
     * Test total volume.
     **/
   @Test public void volumeTest() {
   
   
   
      TriangularPrism[] tplTest = new TriangularPrism[3];
      
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals("Error: ", 95266.376, tpL.totalVolume(), 0.001);
      
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
      
      
      TriangularPrismList tpL1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
         
      Assert.assertEquals("Error: ", 0, 
         tpL1.totalVolume(), 0.001);
     
   
               
   }
   
   /**
    * Test average surface area.
    **/
   @Test public void averageSurfaceAreaTest() {
   
      TriangularPrism[] tplTest = new TriangularPrism[3];
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      TriangularPrismList tpL =
          new TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals("Error: ", 5682.808, 
         tpL.averageSurfaceArea(), 0.001);
     
     
     
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
         
         
         
      TriangularPrismList tpL1 = 
         new TriangularPrismList("Test List", tplTest1, 0);
         
         
      Assert.assertEquals("Error: ", 0, tpL1.averageSurfaceArea(), 0.001);
      
      
      
   }
   
   /**
    * Test average volume.
   **/
   @Test public void averageVolumeTest() {
    
      TriangularPrism[] tplTest = new TriangularPrism[3];
      
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
         
      Assert.assertEquals("Error: ", 31755.459, 
         tpL.averageVolume(), 0.001);
      
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
      
      
      
      TriangularPrismList tpl1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
         
      Assert.assertEquals("Error: ", 0, tpl1.averageVolume(), 0.001);
   }
   
   /**
    * Test String.
    **/
   @Test public void toStringTest() {
   
   
   
    
      TriangularPrism[] tplTest = new TriangularPrism[3];
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals(true, 
         tpL.toString().contains("\nNumber of TriangularPrisms: " 
         + tpL.numberOfTriangularPrisms() + "\nTotal Surface Area: "));
   }
      
   /**
    * Test getlist.
    **/
   @Test public void getListTest() {
    
      TriangularPrism[] tplTest = new TriangularPrism[3];
      
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals("Error: ", tplTest, tpL.getList());
   
   }
    
   /**
    * Test adding triangularPrism.
    **/
   @Test public void addTriangularPrismTest() {
    
      TriangularPrism[] tplTest = new TriangularPrism[10];
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      TriangularPrism tp = new TriangularPrism("Small", 3.0, 4.0);
      
      tpL.addTriangularPrism("Small", 3.0, 4.0);  
      
      Assert.assertEquals("Error: ", tp, tplTest[3]);       
      
   }
   
  /**
   * Test finding triangularPrism.
   **/
   @Test public void findTriangularPrismTest() {
   
      TriangularPrism[] tplTest = new TriangularPrism[10];
      
      
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      TriangularPrism output = tpL.findTriangularPrism("Large");
      Assert.assertEquals("Error: ", tplTest[2], output);
      
      TriangularPrism result1 = tpL.findTriangularPrism("little");
      Assert.assertEquals("Error: ", null, result1);
         
   }
   
   /**
    * Test delete triangularPrism.
    **/
   @Test public void deleteTriangularPrismTest() {
     
      TriangularPrism[] tplTest = new TriangularPrism[10];
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      Assert.assertEquals("Error: ", tplTest[0], 
         tpL.deleteTriangularPrism("small"));
         
      TriangularPrism[] tplTest1 = new TriangularPrism[0];
      
      
      TriangularPrismList tpList1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
         
      Assert.assertEquals("Error: ", null, 
         tpList1.deleteTriangularPrism("small"));
         
         
      TriangularPrism[] tplTest2 = new TriangularPrism[2];
      tplTest2[0] = new TriangularPrism("Small", 1.8, 3.25);
    
      TriangularPrismList tpL2 = new 
         TriangularPrismList("Test List", tplTest2, 1);
         
         
      Assert.assertEquals("Error: ", tplTest2[0], 
         tpL2.deleteTriangularPrism("Small"));
         
       
   }

      
   
  /**
   * Test edit TriangularPrism.
   **/
   @Test public void editTriangularPrismTest() {
     
      TriangularPrism[] tpL = new TriangularPrism[10];
      
      
      tpL[0] = new TriangularPrism("Small", 1.8, 3.25);
      tpL[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tpL[2] = new TriangularPrism("Large", 45.47, 105.0);
      
      
      TriangularPrismList tpLa = new 
         TriangularPrismList("Test List", tpL, 3);
         
         
         
      Assert.assertEquals(true, 
         tpLa.editTriangularPrism("Large", 46.0, 105.0));
         
      TriangularPrism[] tpL1 = new TriangularPrism[0];
      TriangularPrismList dList1 = new 
         TriangularPrismList("Test List", tpL1, 0);
      Assert.assertEquals(false, 
         dList1.editTriangularPrism("Large", 46.0, 105.0));
     
     
   }
   
  /**
   * Test find largest volume.
   **/
   @Test public void findTriangularPrismWithLargestVolume() {
     
      TriangularPrism[] tplTest = new TriangularPrism[3];
      tplTest[0] = new TriangularPrism("Small", 1.8, 3.25);
      tplTest[1] = new TriangularPrism("Medium", 10.7, 25.4);
      tplTest[2] = new TriangularPrism("Large", 45.47, 105.0);
      TriangularPrismList tpL = new 
         TriangularPrismList("Test List", tplTest, 3);
         
         
      TriangularPrism result = tpL.
         findTriangularPrismWithLargestVolume();
      Assert.assertEquals("Error: ", tplTest[2], result);
      
      
      TriangularPrism[] tplTest1 = new TriangularPrism[1];
      tplTest1[0] = new TriangularPrism("Small", 1.8, 3.25);
      
      TriangularPrismList tpL1 = new 
         TriangularPrismList("Test List", tplTest1, 0);
         
      TriangularPrism result1 = tpL1.
         findTriangularPrismWithLargestVolume();
      Assert.assertEquals("Error: ", null, result1);
      
      
      
      TriangularPrism[] tplTest2 = new TriangularPrism[1];
      tplTest2[0] = new TriangularPrism("Small", 1.8, 3.25);
      
      TriangularPrismList tpL2 = new 
         TriangularPrismList("Test List", tplTest1, 1);
         
      TriangularPrism result2 = tpL2.
         findTriangularPrismWithLargestVolume();
      Assert.assertEquals("Error: ", tplTest2[0], result2);
      
      
   }
      
}
