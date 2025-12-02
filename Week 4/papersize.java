import java.util.Scanner;
public class papersize{
    public static void main (String[]args){
      Scanner ps = new Scanner (System.in); //creating scanner
      System.out.println("Enter the papersize (A0 to A5)");
      String PS = ps.next(); //taking input
      System.out.println("Dimensions of "+PS+" are");
      switch(PS){
          case "A0":
              System.out.println(" 841 x 1189 mm (33.1 x 46.8 inches");
              break;
          case "A1":
              System.out.println(" 594 x 841 mm (23.4 x 33.1 inches");
              break;
          case "A2":
              System.out.println(" 420 x 594 mm (16.5 x 23.4 inches");
              break;
          case "A3":
              System.out.println(" 297 x 420 mm (11.7 x 16.5 inches");
              break;
          case "A4":
              System.out.println(" 210 x 297 mm (8.3 x 11.7 inches");
              break;
          case "A5":
              System.out.println(" 148 x 210 mm (5.8 x 8.3 inches");
              break;    
      }
      
    }
}