
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public abstract class OnlineTextItem extends InventoryItem {

      /**
* constructor ElectronicsItem.
* @param nameIn in
* @param priceIn in
*/

   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   }
       /**
* double calculateCost.
* @return price
*/
   public double calculateCost() {
   
      return price;
   
   }



}