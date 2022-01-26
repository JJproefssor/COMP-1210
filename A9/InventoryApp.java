/**
* Simple program to print BankLoanTest.
*
* Activity 9
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/


public class InventoryApp {



       /**
* print out inventory app.
* @param args Command
*/
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      InventoryItem book1 = new InventoryItem("oil change kit", 39.00);
      System.out.println("name: " + book1.name + "; " 
         + "price: " + "$" + book1.price);
      
      
      ElectronicsItem book2 = new ElectronicsItem("Cordless phone",
         80.00, 1.8);
      System.out.println("name: " + book2.name + "; " 
         + "price: " + "$" + book2.price + "; " + "weight: " 
         + book2.weight + " lbs");
      
      
      OnlineArticle book3 = new OnlineArticle("Java News", 8.50);
      System.out.println("name: " + book3.name + "; " 
         + "price: " + "$" + book3.price + ";" + " wordcoundt: " 
         + book3.setWordCount(700) + " words");
      
      
      OnlineBook book4 = new OnlineBook("Java for Noobs", 13.37);
      System.out.println("name: " + book4.name + "; " 
         + "price: " + "$" + book4.price + ";" 
         + " author: " + book4.author);
      
      
      
      
      
      
      
      
      
   }



}