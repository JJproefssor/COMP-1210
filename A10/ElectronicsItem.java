 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/

public class ElectronicsItem extends InventoryItem {


   protected double weight;
          /**
* double calculateCost.
*/
   public static final double SHIPPING_COST = 1.5;

   /**
* constructor ElectronicsItem.
* @param nameIn in
* @param priceIn in
* @param weightIn in
*/


   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   
   
      super(nameIn, priceIn);
      weight = weightIn;
   
   }


    /**
* double calculateCost.
* @return total cost
*/


   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   
   }




}