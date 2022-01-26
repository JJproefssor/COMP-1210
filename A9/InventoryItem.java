 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;

/**
* constructor inventoryitem.
* @param nameIn in
* @param priceIn in
*/
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   
   }


 /**
* string getname.
* @return name
*/
   public String getName() {
   
      return name;
   }

    /**
* double calculate cost.
* @return price
*/

   public double calculateCost() {
   
      return price * (1 + taxRate);
   
   }
       /**
* set tax rate.
* @param taxRateIn in
*/
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
  /**
* string tostring.
* @return name
   */
   public String toString() {
   
   
      return name + ": $" + calculateCost();
   }








}