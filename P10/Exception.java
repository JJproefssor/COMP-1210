import java.lang.ArrayIndexOutOfBoundsException;
/**
 * Simple program to check exception
 */
public class Exception { 
 
   public static void main(String[] args) {
   
      Object list[] = new Object[3];
   
      try
      {
         list[0] = (int) (40/4);
      }
      
      catch(NullPointerException e) {
      
         System.out.print("NullPointerException, ");
      }
      
      catch(ArrayIndexOutofBoundsException e) {
      
         System.out.print("ArrayIndexOutOfBoundsException, ");
      }
      
      catch(Exception e) {
      
         System.out.print("Exception, ");
      
      }
      finally {
      
         System.out.print("Finally, ");
      
      }
   
      System.out.print("End");
   }
}