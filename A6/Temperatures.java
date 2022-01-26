import java.util.ArrayList;
 /**
* Simple program to print CourseInfo.
*
* Project 5
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/24/2021
*/
public class Temperatures {
 /** print Temperature to std output.
   *@param args command line arguments not used
   */
   private ArrayList<Integer> temperatures;
   
/**
    * print Temperatures information to std output.
    * @param temperaturesIn use for arraylist.
      **/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**
   * getlowTemp.
   * @return low
   **/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
   * gethighTemp.
   * @return hith
   **/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
/**
   * get lowerMinimum.
   * @param lowIn Command line arguments not used
   * @return lowerminimumTemp
   **/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
   * get higherMaximum.
   * @param highIn Command line arguments not used
   * @return higherMaximum
   **/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
   * get String to toString.
     * @return String
   **/
   public String toStirng() {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
      
   }


}