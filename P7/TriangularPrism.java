import java.text.DecimalFormat;
 /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class TriangularPrism {
/** print bankLoanTest to std output.
   *@param args command line arguments not used
   */
   private String label;
   private double edge;
   private double height;
   private static int count = 0;
         /**
   * print DecagonalPrism information to std output.
   * @param labelIn print
   * @param edgeIn print
   * @param heightIn print
      */
   
   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
   
      setLabel(labelIn);
      setHeight(heightIn);
      setEdge(edgeIn);
      count++;
      
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
    * returning triangleArea.
    *@return triangleArea
    */
   public double triangleArea() {
   
      double triangleArea = 0.25 * Math.sqrt(3 * Math.pow(edge, 4)); 
   
      return triangleArea;
   }
   
         /**
    * returning rectangleArea.
    *@return rectangleArea
    */

   
   public double rectangleArea() {
   
      double rectangleArea = edge * height;
    
      return rectangleArea;
   }
   
   /**
    * returning surfaceArea.
    *@return surfaceArea
    */
   
   public double surfaceArea() {
   
      double surfaceArea = (2 * triangleArea()) + 3 * rectangleArea();
    
      return surfaceArea;
   }
   
   /**
    * returning volume.
    *@return volume
    */
   
   public double volume() {
   
      double volume = triangleArea() * height;
   
      return volume;
   
   }
         /**
    * returning hashcode.
    *@return 0
    */
   
   public int hashcode() {
      return 0;
   }
   
         /**
    * returning volume.
    *@return volume
    */
   
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      return "TriangularPrism \"" 
         + label + "\" with triangle edge of " + edge 
         + " units\nand prism height "
         + "of " + height + " units has:\n\t" + "triangle area = " 
         + df.format(triangleArea()) + " square units\n\t"
         + "rectangle area = " 
         + df.format(rectangleArea()) + "square units\n\t" 
         + "surface area = " 
         + df.format(surfaceArea())
         + " square units\n\t" + "volume = " 
         + df.format(volume()) + " cubic units";
   }
   
   
   
   
   //test method
   
    /**
    * returning getCount.
    *@return getCount
    */
   
   public static int getCount() {
   
   
      return count;
   }
   
          /**
    * returning resetCount.
    */
   
   public static void resetCount() {
   
   
      count = 0;
   }
   
          /**
    * returning equals.
    * @param obj input
    * @return true/false
    */
   
   public boolean equals(Object obj) {
   
      if (!(obj instanceof TriangularPrism)) {
         return false;
      }
      else {
         TriangularPrism d = (TriangularPrism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && (Math.abs(edge - d.getEdge()) < .000001)
            && (Math.abs(height - d.getHeight()) < .000001));
      }
   }
   
                /**
    * returning equals.
    * String
    * @return output
    */
   public int hashCode()
   {
      return 0;
   }
   
   
   
   
   // compare method

}