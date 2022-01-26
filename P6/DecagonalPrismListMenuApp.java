import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
 /**
* Simple program to print CourseInfo.
*
* Project 6
* @author Jong Hyun Jung -COMP 1210 - D01
* @version 9/24/2021
*/
public class DecagonalPrismListMenuApp {
/**
 * print DecagonalPrismListMenuApp.
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      String tListName = "no list name";
      ArrayList<DecagonalPrism> dPrismIn = new ArrayList<DecagonalPrism>();
      DecagonalPrismList dPList = new DecagonalPrismList(tListName, dPrismIn);
      String fileName = "no file name";
      String label;
      double edge;
      double height;
      
      String number = "";
      Scanner input = new Scanner(System.in);
      System.out.println("DecagonalPrism List System Menu\n"
                           + "R - Read File and Create DecagonalPrism List\n"
                           + "P - Print DecagonalPrism List\n"
                           + "S - Print Summary\n"
                           + "A - Add DecagonalPrism\n"
                           + "D - Delete DecagonalPrism\n"
                           + "F - Find DecagonalPrism\n"
                           + "E - Edit DecagonalPrism\n"
                           + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         number = input.nextLine();
         if (number.length() == 0) {
            continue;
         }
         number = number.toUpperCase();
         char cNumber = number.charAt(0);
         switch (cNumber) {
            case 'R' :
               System.out.print("\tFile name: ");
               fileName = input.nextLine();
               dPList = dPList.readFile(fileName);
               System.out.print("\tFile read in and DecagonalPrism" 
                  + " List created\n\n");
               break;
         
            case 'P' :
               System.out.print("\n" + dPList + "\n");
            
               break;
         
            case 'S' :
               System.out.print("\n"  + dPList.summaryInfo() + "\n\n");
            
            
               break;
         
            case 'A' :
               System.out.print("\tLabel: ");
               label = input.nextLine();
               System.out.print("\tEdge: ");
               edge = Integer.parseInt(input.nextLine());
               System.out.print("\tHeight: ");
               height = Integer.parseInt(input.nextLine());
            
               dPList.addDecagonalPrism(label, edge, height);
               System.out.print("\t*** DecagonalPrism added ***\n\n");
            
               break;
         
            case 'D' :
               System.out.print("\tLabel: ");
               label = input.nextLine();
               DecagonalPrism removed = dPList.deleteDecagonalPrism(label);
               if (removed != null) {
                  System.out.println("\t\"" + removed.getLabel() 
                     + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label 
                           + "\" not found\n");
               }
            
            
            
               break;
         
            case 'F' :
               System.out.print("\tLabel: ");
               label = input.nextLine();
               if (dPList.findDecagonalPrism(label) != null) {
                  System.out.println(dPList.findDecagonalPrism(label).
                     toString());
               }
               
               else {
                  System.out.println("\t" + label + "\" not found\n");
               }
            
            
            
               break;
         
            case 'E' :
               System.out.print("\tLabel: ");
               label = input.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(input.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(input.nextLine());
               
               if (dPList.findDecagonalPrism(label) != null) {
                  dPList.editDecagonalPrism(label, edge, height);
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else { 
                  System.out.println("\t\"" + label + "\" not found\n");
               }
            
            
               break;
         
            case 'Q' :
               break;
         
          
            default: 
               System.out.println("\t*** invalid code ***\n");
         }
      
      
      }
      while (!number.equalsIgnoreCase("Q"));
      
      
   }
}