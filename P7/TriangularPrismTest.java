import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
    /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class TriangularPrismTest {


   /** 
   * setUp.
    **/
   @Before public void setUp() {
   
   }
   
         /** 
   * getLabelTest.
    **/
   
   @Test public void getLabelTest() {
   
      TriangularPrism tp = new TriangularPrism("small Example", 1.0, 1.0);
      Assert.assertEquals("small Example", tp.getLabel());
   }
   
   /** 
   * setLabelTest.
    **/
   
   @Test public void setLabelTest() {
   
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      tp.setLabel("Small Example");
      Assert.assertEquals("Small Example", tp.getLabel());
      tp.setLabel("Medium Example");
      Assert.assertEquals("Medium Example", tp.getLabel());
      tp.setLabel("Large Example");
      Assert.assertEquals("Large Example", tp.getLabel());
   }
   
    /** 
   * getEdgeTest.
    **/
   
   @Test public void getEdgeTest() {
   
      TriangularPrism tp = new TriangularPrism("large Example", 1.0, 1.0);
      Assert.assertEquals(1.0, tp.getEdge(), 0);
   }
          /** 
   * setEdgeTest.
    **/
   
   @Test public void setEdgeTest() {
   
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      tp.setEdge(2.0);
      Assert.assertEquals(2.0, tp.getEdge(), 0);
   }
                  /** 
   * getHeightTest.
    **/ 

   @Test public void getHeightTest() {
   
      TriangularPrism tp = new TriangularPrism("large Example", 1.0, 1.0);
      Assert.assertEquals(1.0, tp.getHeight(), 0);
   }
   
   /** 
   * setHeightTest.
    **/ 
   
   @Test public void setHeightTest() {
   
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      tp.setHeight(2.0);
      Assert.assertEquals(2.0, tp.getHeight(), 0);
      Assert.assertFalse(tp.setHeight(-1.0));
   }
   
         /** 
   * triangleArea.
    **/ 
   
   @Test public void triangleArea() {
   
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      Assert.assertEquals("Triangle area is incorrect", 
         0.4330127018922193, tp.triangleArea(), 0);
   }
       /** 
   * rectangleArea.
    **/ 
   
   @Test public void rectangleArea() {
    
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      Assert.assertEquals("Rectangle Area is incorrect", 
         1.0, tp.rectangleArea(), 0);
   }
   
   /** 
   * surfaceArea.
    **/ 

   
   @Test public void surfaceArea() {
    
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      Assert.assertEquals("Surface Area is incorrect", 
         3.8660254037844384, tp.surfaceArea(), 0);
   }
   
   /** 
   * volume.
    **/ 
   
   @Test public void volume() {
    
      TriangularPrism tp = new TriangularPrism("", 1.0, 1.0);
      Assert.assertEquals("volume is incorrect", 
         0.4330127018922193, tp.volume(), 0);
   }

    /** 
   * toStingTest.
    **/ 
   @Test public void toStingTest() {
   
      TriangularPrism tp = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertTrue(tp.toString().contains("\"Small Example\""));
   }
   

}