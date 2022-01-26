import java.text.DecimalFormat;
 /**
* Simple program to print BankLoanTest.
*
* Project 8
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class TriangularPrismList {

   private String name;
   private TriangularPrism[] tpL;
   private int number;

      /**
    * Print TriangularPrismList.
    * @param tpLIn triangularprism
    * @param listnameIn string
    * @param numberIn int
    **/

   public TriangularPrismList(String listnameIn,
       TriangularPrism[] tpLIn, 
      int numberIn) {
      
      name = listnameIn;
      tpL = tpLIn;
      number = numberIn;
   }

 /**
    * returning getName.
    *@return data
    **/
   public String getName() {
      return name;
   }


      /**
    * number of triangular prisms. 
    * @return 0
    **/


   public int numberOfTriangularPrisms() {
   
      if (number > 0) {
      
      
         return number;
      }
   
      return 0;
   }

         /**
    * total surface area of triangular prism. 
    * @return 0
    **/


   public double totalSurfaceArea() {
      double totalSF = 0;
      int index = 0;
      double temV = 0.0;
      
      
      
      if (number > 0) {
      
         while (index < number) {
         
         
            temV = tpL[index].surfaceArea();
            totalSF += temV;
            index++;
            
            
         }
         
      }
      else {
         totalSF = 0.0;
      }
      
      return totalSF;
   }

   /**
    * toal volume of triangular prism. 
    * @return 0
    **/

   public double totalVolume() {
      double tV = 0;
      int index = 0;
      double temV = 0.0;
      if (number > 0) {
      
      
      
         while (index < number) {
            temV = tpL[index].volume();
            tV += temV;
            index++;
            
            
            
         }
      }
      else {
         tV = 0.0;
         
         
      }
      return tV;
   }

     /**
    * average surface area of triangular prism. 
    * @return 0
    **/



   public double averageSurfaceArea() {
      double averageSA = 0;
      if (number > 0) {
         averageSA = totalSurfaceArea() / numberOfTriangularPrisms();
      }
      else {
         return 0;
      }
   
      return averageSA;
   }

    /**
    * average volume of triangular prism. 
    * @return 0
    **/



   public double averageVolume() {
      double averageV = 0;
      if (number > 0) {
         averageV = totalVolume() / numberOfTriangularPrisms();
      }
      else {
         return 0;
      }
      return averageV;
   }
   
   
   
    /**
    * string tostring of triangular prism. 
    * @return 0
    **/

   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of TriangularPrisms: " + numberOfTriangularPrisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units";
      result += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      result += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      return result;
   }

    /**
    * get list of triangular prism. 
    * @return tpL
    **/
   public TriangularPrism[] getList() {
   
   
      return tpL;
   }

    /**
    * add triangular prism of triangular prism.
    * @param label string
    * @param edge double
    * @param height double
    **/
   public void addTriangularPrism(String label, double edge, double height) {
      TriangularPrism tPL = new TriangularPrism(label, edge, height);
   
      
      tpL[number] = tPL;
      number++;
   }
/**
    * find triangular prism. 
    * @param labelIn string
    * @return null.
    **/




   public TriangularPrism findTriangularPrism(String labelIn) {
      for (int index = 0; index < number; index++) {
         if (tpL[index].getLabel().equalsIgnoreCase(labelIn)) {
            return tpL[index];
         }
      
      }
   
      return null;
   }




/**
    * delete triangular prism. 
    * @param labelIn double
    * @return output
    **/
   public TriangularPrism deleteTriangularPrism(String labelIn) {
   
      int index = 0;
      TriangularPrism output = null;
      
      while (index < number) {
      
         if (tpL[index].getLabel().equalsIgnoreCase(labelIn)) {
         
            output = tpL[index];
            for (int t = index; t < number - 1; t++) {
               tpL[t] = tpL[t + 1];
            
            }
            tpL[number - 1] = null;
            number--;
            break;
         
         }
      
      
      }
      
      
      return output;
   }




    /**
    * edit triangular prism. 
    * @param labelIn double
    * @param edgeIn doulbe
    * @param heightIn double
    * @return result
    **/
   public boolean editTriangularPrism(String labelIn,
       double edgeIn, double heightIn) {
       
       
      boolean result = false;
      
      int index = 0;
      
      while (index < number) {
      
      
         if (tpL[index].getLabel().equalsIgnoreCase(labelIn)) {
         
            tpL[index].setEdge(edgeIn);
            
            tpL[index].setHeight(heightIn);
            
            result = true;
            
            break;
         }
         
         
         
         index++;
         
      }
      
      return result;
   }

   
   
   
   
    /**
    * find triangular prism with largest volume. 
    * @return tplV
    **/
   public TriangularPrism findTriangularPrismWithLargestVolume() {
      TriangularPrism tplV = tpL[0];
      double lV = tpL[0].volume();
   
      if (number > 0) {
         for (int index = 0; index < number; index++) {
            if (tpL[index].volume() >= lV) {
               
               lV = tpL[index].volume();
               tplV = tpL[index];
            }
         }
      }
      
      else {
         
         return null;
      }
      return tplV;
   }

}
