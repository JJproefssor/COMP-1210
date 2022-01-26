import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 /**
* Simple program to print CourseInfo.
*
* Project 6
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/24/2021
*/
public class DecagonalPrismList {
   private String data;
   private ArrayList<DecagonalPrism> dPrism;
   /**
    * print DecagonalPrism information to std output.
    * @param dataIn Command line argument-not used.
    * @param dPrismIn Command line argument-not used.
   */

 
   public DecagonalPrismList(String dataIn, 
      ArrayList<DecagonalPrism> dPrismIn) {
      data = dataIn;
      dPrism = dPrismIn;
   
   }
/**
    * returning getName.
    *@return data
    */
   public String getName() {
      return data;
   }

/**
    * returning numberOfDecagonalPrisms.
    *@return dPrism.size
    */
   public int numberOfDecagonalPrisms() {
      return dPrism.size();
   }
/**
    * returning totalSurfaceArea.
    *@return totalSF
    */

   public double totalSurfaceArea() {
      double totalSF = 0;
      int index = 0;
      if (dPrism.size() != 0) {
         while (index < dPrism.size()) {
            totalSF += dPrism.get(index).surfaceArea();
            index++;
         }
      }
      else {
         return 0;
      }
      
      return totalSF;
   
   }
/**
    * returning totalBaseArea.
    *@return totalBA
    */
   public double totalBaseArea() {
      double totalBA = 0;
      int index = 0;
      if (dPrism.size() != 0) {
         while (index < dPrism.size()) {
            totalBA += dPrism.get(index).baseArea();
            index++;
         }
      }
      else {
         return 0;
      }
      
      return totalBA;
   }
/**
    * returning totalLateralSurfaceArea.
    *@return totalLSF
    */

   public double totalLateralSurfaceArea() {
      double totalLSF = 0;
      int index = 0;
      if (dPrism.size() != 0) {
         while (index < dPrism.size()) {
            totalLSF += dPrism.get(index).lateralSurfaceArea();
            index++;
         }
      }
      else {
         return 0;
      }
      
      return totalLSF;
   }
/**
    * returning totalVolume.
    *@return totalV
    */
   public double totalVolume() {
      double totalV = 0;
      int index = 0;
      if (dPrism.size() != 0) {
         while (index < dPrism.size()) {
            totalV += dPrism.get(index).volume();
            index++;
         }
      }
      else {
         return 0;
      }
      
      return totalV;
   }
/**
    * returning averageSurfaceArea.
    *@return averageSF
    */

   public double averageSurfaceArea() {
      double averageSF = 0;
      if (dPrism.size() != 0) {
         averageSF = totalSurfaceArea() / numberOfDecagonalPrisms();
      }
      else {
         return 0;
      }
      return averageSF;
   }
/**
    * returning averageVolume.
    *@return averageV
    */
   public double averageVolume() {
      double averageV = 0;
      if (dPrism.size() != 0) {
         averageV = totalVolume() / numberOfDecagonalPrisms();
      }
      else {
         return 0;
      }
      return averageV;
   }
/**
    * returning toString.
    *@return resultS
    */
   public String toString() {
      // DecimalFormat df = new DecimalFormat("#,##0.0##");
      String resultS = data;
      int index = 0;
      String result = "";
      while (index < dPrism.size()) {
         resultS += "\n" + dPrism.get(index) + "\n";
         index++;
      }
      return resultS;
   }
   
/**
    * returning summaryInfo.
    *@return result
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Decagonal Prisms: " + numberOfDecagonalPrisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Base Area: " + df.format(totalBaseArea());
      result += "\nTotal Lateral Surface Area: " 
         + df.format(totalLateralSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
   
      return result;
   }

   //************************************************************
   //******************** Begin new methods *********************
   //************************************************************
   
   
   
   
/**
 * Returns dPrismlist.
 * @return list
 */

      
   public ArrayList<DecagonalPrism> getList() {
      return dPrism;
   }
   /**
   * read file.
   * @param fileNameIn commend not used
   * @return dp
   * @throws FileNotFoundException throws
   */
   public DecagonalPrismList readFile(String fileNameIn)
       throws FileNotFoundException {
    
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String listName = "";
      String label = "";
      double edge = 0, height = 0;
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label =  scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         DecagonalPrism p = new DecagonalPrism(label, edge, height);
         dPrism.add(p);
         
      }
      
      DecagonalPrismList dp = new DecagonalPrismList(listName, dPrism);
   
      return dp;
      
      
   }
   
   /**
   * add file.
   * @param label commend not used
   * @param edge commend not used
   * @param height commend not used
   */
   public void addDecagonalPrism(String label, double edge, double height) {
      DecagonalPrism dP = new DecagonalPrism(label, edge, height);
   
   
      dPrism.add(dP);
   }
   /**
   * find file.
   * @param label commend not used
   * @return null
   */
   public DecagonalPrism findDecagonalPrism(String label) {
   
      for (int i = 0; i < dPrism.size(); i++) {
         if (dPrism.get(i).getLabel().toLowerCase().equals(label.
            toLowerCase())) {
            return dPrism.get(i);
         }
      
      }
   
      return null;
   }
   
   
   /**
   * delete file.
   * @param label commend not used
   * @return null
   */
   
   public DecagonalPrism deleteDecagonalPrism(String label) {
      for (int i = 0; i < dPrism.size(); i++) {
      
         if (dPrism.get(i).getLabel().toLowerCase().equals(label.
            toLowerCase())) {
            return dPrism.remove(i);
         }
      }
           
      return null;
   
   }
   
   /**
   * dit file.
   * @param labelIn commend not used
   * @param edgeIn commend not used
   * @param heightIn commend not used
   * @return result
   */
   
   
   public boolean editDecagonalPrism(String labelIn,
       double edgeIn, double heightIn) {
      boolean result = false;
      for (DecagonalPrism dPrisms: dPrism) {
         if (dPrisms.getLabel().toLowerCase().equals(labelIn.toLowerCase())) {
            dPrisms.setEdge(edgeIn);
            dPrisms.setHeight(heightIn);
            result = true;
            break;
         }
      }
                  
      return result;
   }
      
}
   
   


