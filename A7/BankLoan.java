    /**
* Simple program to print BankLoanTest.
*
* Activity 7
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 10/12/2021
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   // created by instructions
   private static int loansCreated = 0;
/**print bankloan.
* @param customerNameIn to std output.
* @param interestRateIn to std output.
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**print isamountvalid.
* @param amount the loan amount.
* @return amount.
*/
   
   public static boolean isAmountValid(double amount) {
   
      return amount >= 0;
   }
   
   /**print isamountvalid.
   *@param loan to std output.
* @return amount.
*/
   
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**print getloanscreated.
   
* @return loansCreated.
*/
   
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**print getloanscreated.
  
*/
   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
/**print getloanscreated.
*@param amount print
  *@return wasLoanMade
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**print paybank.
*@param amountPaid print
  *@return wasLoanMade
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**print getBalance.

  *@return balance
*/
   
   public double getBalance() {
      return balance;
   }
   /**print getBalance.
*@param interestRateIn print
  *@return balance
*/
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**print getBalance.
     *@return balance
*/
   
   public double getInterestRate() {
      return interestRate;
   }
   /**chargeInterest.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**string tostring.
   *@return output
   */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
