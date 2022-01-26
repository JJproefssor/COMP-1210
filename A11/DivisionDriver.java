import javax.swing.JOptionPane;
 /**
 * Simple program to print BankLoanTest.
 *
 * Activity 9
 * @author Jong Hyun Jung -COMP 1210 - D01
 * @version 10/12/2021
 **/
public class DivisionDriver {

    /**
     * This proctors the error and show the error message.
     * @param args Command line arguments-not used.
     **/
   public static void main(String[] args) {
      
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {  
         
         int num = Integer.parseInt(numInput);
         
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result,
            "result,", JOptionPane.PLAIN_MESSAGE);
      }
      
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numberical values only.", 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      
      catch (IllegalArgumentException e) {
      
         JOptionPane.showMessageDialog(null, 
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}