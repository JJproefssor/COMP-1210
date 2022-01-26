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
   * hashcodeTest.
    **/
   
   @Test public void hashCodeTest() {
      TriangularPrism tp = new TriangularPrism("small", 0.0, 0.0);
      
      Assert.assertEquals(0, tp.hashcode());
   }
 
   /** 
   * counttest.
    **/
   @Test public void resetcountTest() {
   
      TriangularPrism.resetCount();
   
   }
  
   /** 
   * counttest.
    **/
   @Test public void getcountTest() {
   
      TriangularPrism.getCount();
   
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
      TriangularPrism tp1 = new TriangularPrism(null, 1.0, 1.0);
      Assert.assertEquals(null, tp1.getLabel());
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
      TriangularPrism tp1 = new TriangularPrism("", -2.0, 1.0);
      tp.setEdge(-1.0);
      Assert.assertEquals(0.0, tp1.getEdge(), 0);
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
   
   /**
   * comparetoTest1.
   **/
   
   @Test public void compareToTest1() {
   
      TriangularPrism tp1 = new TriangularPrism("small", 1.8, 3.25);
      
      TriangularPrism tp2 = new TriangularPrism("medium", 10.7, 25.4);
      
   
      
      Assert.assertEquals(tp1.compareTo(tp2), -1, 0);
   
   }
   
/**
   * comparetoTest2.
   **/
   @Test public void compareToTest2() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      
      TriangularPrism tp2 = new TriangularPrism("medium", 10.7, 25.4);
      
   
      
      Assert.assertEquals(tp1.compareTo(tp2), 0, 0);
   
   }
/**
   * comparetoTest3.
   **/

   @Test public void compareToTest3() {
   
      
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("small", 1.8, 3.25);
   
      
      Assert.assertEquals(tp1.compareTo(tp2), 1, 0);
   
   }
   /**
   * Equalstest1.
   **/
   @Test public void equalsTest1() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("small", 1.8, 3.25);
      
      Assert.assertFalse(tp1.equals(tp2));
   
   }
   /**
   * Equalstest2.
   **/
   @Test public void equalsTest2() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("medium", 10.7, 25.4);
      
      Assert.assertTrue(tp1.equals(tp2));
   
      
   }
   /**
   * Equalstest3.
   **/
   
   @Test public void equalsTest3() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("medium", 10.7, 25.3);
      
      Assert.assertFalse(tp1.equals(tp2));
   
      
   }
   /**
   * Equalstest4.
   **/
   @Test public void equalsTest4() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("medium", 10.6, 25.3);
      
      Assert.assertFalse(tp1.equals(tp2));
   
      
   }
   /**
   * Equalstest5.
   **/
   @Test public void equalsTest5() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      TriangularPrism tp2 = new TriangularPrism("large", 10.6, 25.3);
      
      Assert.assertFalse(tp1.equals(tp2));
   
      
   }
   
   /**
   * Equalstest6.
   **/
   @Test public void equalsTest6() {
      TriangularPrism tp1 = new TriangularPrism("medium", 10.7, 25.4);
      int tp2 = 1;
      
      Assert.assertFalse(tp1.equals(tp2));
   
      
   }
}