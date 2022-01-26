 /**
* Simple program to print BankLoanTest.
*
* Activity 10
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/


public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
   /** 
   * ItemList constructor.
   */
   
   
   
   public ItemsList() {
      
      inventory = new InventoryItem[20];
      
      count = 0;
   }
   
   /**
   * Adding item.
   * @param itemIn as.
   **/  
   
   
   public void addItem(InventoryItem itemIn) {
     
      inventory[count] = itemIn;
      
      count++;
   }
   
         /**
   * double total.
   * @param electronicsSurcharge as.
   * @return total
      **/ 
      
      
   public double calculateTotal(double electronicsSurcharge) {
      
      double total = 0;
      
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
         
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
         
            total += inventory[i].calculateCost();
            
         }
         
      }
      
      return total;
      
   }

      /**
   * String to String information to print output information.
   * @return output
      **/ 
   public String toString() {
      
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
      
         output += inventory[i] + "\n";
         
      }
      
      return output;
      
   }
   
}