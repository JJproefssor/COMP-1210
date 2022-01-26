import java.text.DecimalFormat;
 /**
* Simple program to print DecagonalPrism.
*
* Project 4
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/17/2021
*/

public class DecagonalPrism {
/**
   * print DecagonalPrism information to std output.
   * @param args Command line arguments-not used.
   */ 
   private double edge;
   private double height;
   private String label;

   /**
    * print DecagonalPrism information to std output.
    * @param edgeIn Command line argument-not used.
    * @param labelIn Command line argument-not used.
    * @param heightIn Command line argument-not used.
   */
   

   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
   /**
   * print DecagonalPrism information to std output.
   
   * @param String LabelIn
      */
      setLabel(labelIn);
      setHeight(heightIn);
      setEdge(edgeIn);
   
   }
   /**
    * returning label.
    *@return label
    */
   public String getLabel() {
   /**
   * String getLabel information to std output.
   * @param args Command line arguments-not used.
   */
   
      return label;
   }
   /**
   * boolean setLabel.
   * @param labelIn Command line arguments-not used.
   * @return boolean result
   */
   
   public boolean setLabel(String labelIn) {
   /**
   * String labelIn information to std output.
   * @param args Command line arguments-not used.
   */      
      boolean result = false;
      if (labelIn == null) {
         result = false;
      }
      else {
         label = labelIn.trim();
         result = true;
      }
      return result;
   }
   /**
    * returning getEdge.
    *@return getEdge
    */

   public double getEdge() { 
   /**
   * double getEdge information to std output.
   * @param args Command line arguments-not used.
   */
   
      return edge;
   }
   /**
   * boolean setEdge.
   * @param edgeIn Command line arguments-not used.
   * @return boolean result
   */

   public boolean setEdge(double edgeIn) {
   /**
   * boolean setEdge information to std output.
   * @param args Command line arguments-not used.
   */
   
      boolean result = false;
      if (edgeIn >= 0) {
         result = true;
         edge = edgeIn;
      }
      else {
         result = false;
      }
      return result;
   }
/**
    * returning getHeight.
    *@return height
    */

   public double getHeight() {
   /**
   * double getHeight information to std output.
   * @param args Command line arguments-not used.
   */
   
      return height;
   }
   /**
   * boolean setHeight.
   * @param heightIn Command line arguments-not used.
   * @return boolean result
   */

   public boolean setHeight(double heightIn) {
   /**
   * boolean setHeight information to std output.
   * @param args Command line arguments-not used.
   */
   
      boolean result = false;
      if (heightIn >= 0) {
         result = true;
         height = heightIn;
      }
      else {
         result = false;
      }
      return result;
   }
/**
    * returning surfaceArea.
    *@return surfaceArea
    */


   public double surfaceArea() {
   /**
   * double surfaceArea information to std output.
   * @param args Command line arguments-not used.
   */
   
      double surfaceArea = ((10 * edge * height) 
         + ((5 * Math.pow(edge, 2) * Math.sqrt(5 + (2 * Math.sqrt(5))))));
      return surfaceArea;
   
   }
   /**
    * returning baseArea.
    *@return baseArea
    */

   public double baseArea() {
   /**
   * double baseArea information to std output.
   * @param args Command line arguments-not used.
   */
   
      double baseArea = ((5.0 / 2.0) * Math.pow(edge, 2)
          * Math.sqrt(5 + (2 * Math.sqrt(5))));
      return baseArea;
   
   }
   /**
    * returning lateralSurfaceArea.
    *@return lateralSurfaceArea
    */
   public double lateralSurfaceArea() {
   /**
   * double lateralSurfaceArea information to std output.
   * @param args Command line arguments-not used.
   */
   
      double lateralSurfaceArea = (10 * edge * height);
      return lateralSurfaceArea;
   
   }
   /**
    * returning volume.
    *@return volume
    */
   public double volume() {
   
   
      double volume = ((5.0 / 2.0) * Math.pow(edge, 2) 
         * Math.sqrt((5 + (2 * Math.sqrt(5))))) * height;
      return volume;
   
   }
   /**
    * String toString.
    *@return result
    */

   public String toString() {
   /**
   * double toString information to std output.
   * @param args Command line arguments-not used.
   */
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "A decagonal prism \"" + label + "\"" +  " with edge = "  
         + edge + " units and height = " + height + " units, has:\n"
         + "\tsurface area = " + df.format(surfaceArea()) + " square units\n"
         + "\tbase area = " + df.format(baseArea()) + " square units\n"
         + "\tlateral surface area = " + df.format(lateralSurfaceArea())
         + " square units\n" + "\tvolume = "
         + df.format(volume()) + " cubic units";
      return result;
   
   }


}