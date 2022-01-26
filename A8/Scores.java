

 /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class Scores {

   private int[] numbers;

 /**
   * set Scores field.
   * @param numbersIn add field numbersIn
      **/

   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   
   }
       /**
   * int findeven.
   * @return even result
      **/
   
   public int[] findEvens() {
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      
      }
      return evens;
   }
       /**
   * set Scores field.
   * @return odds results
      **/
   
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         
         }
      }
      return odds;
   }
   
       /**
   * double calculateaverage.
   * @return sum / numbers length
      **/
   public double calculateAverage() {
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
   
      return sum / numbers.length;
   }
   
       /**
   * String toString.
   * @return result
      **/
   
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
       /**
   * String reverse.
   * @return result
      **/
   
   public String toStringInReverse() {
      String result = "";
   
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   
   }



}