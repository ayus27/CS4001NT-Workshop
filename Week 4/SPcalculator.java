import java.util.Scanner;
public class SPcalculator{
    
    static int dispercA = 60; // setting discount percent of categories as static variables
    static int dispercB = 40;
    static int dispercC = 20;
    static int dispercD = 10;
    public static void main (String[]args){
      Scanner sp = new Scanner (System.in); //creating scanner
      System.out.println("Enter the MP");
      int MP = sp.nextInt(); //taking input

      System.out.println("Enter the Category (A/B/C/D)"); //asking for categorty
       String c = sp.next();
      
      switch (c){
       case "A":
           double dis1 = MP - (0.6 * MP);
           double SP1 = (MP - dis1);
           System.out.println("--------A--------");
           System.out.println("Discount% : "+ dispercA);
           System.out.println("Discount Amount: "+ dis1);
           System.out.println("Selling Price: "+SP1);
           break;
           
       case "B":
           double dis2 = MP - (0.4 * MP);
           double SP2 = (MP - dis2);
           System.out.println("--------B--------");
           System.out.println("Discount% : "+ dispercB);
           System.out.println("Discount Amount: "+ dis2);
           System.out.println("Selling Price: "+SP2);
           break;    
           
       case "C":
           double dis3 = MP - (0.2 * MP);
           double SP3 = (MP - dis3);
           System.out.println("--------C--------");
           System.out.println("Discount% : "+ dispercC);
           System.out.println("Discount Amount: "+ dis3);
           System.out.println("Selling Price: "+SP3);
           break;    
           
       case "D":
           double dis4 = MP - (0.1 * MP);
           double SP4 = (MP - dis4);
           System.out.println("--------D--------");
           System.out.println("Discount% : "+ dispercD);
           System.out.println("Discount Amount: "+ dis4);
           System.out.println("Selling Price: "+SP4);
           break;        
      }    
    }
}