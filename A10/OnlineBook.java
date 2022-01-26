
 /**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class OnlineBook extends OnlineTextItem {


   protected String author;


      /**
* constructor ElectronicsItem.
* @param nameIn in
* @param priceIn in
*/

   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   
      author = "Author Not Listed";
   }
   
       /**
* string tostring.
* @return name
*/
   
   public String toString() {
   
   
   
      return name + " - " + author + ": $" + calculateCost();
   }
   
          /**
* double calculateCost.
* @param authorIn in
*/
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   
   }
}