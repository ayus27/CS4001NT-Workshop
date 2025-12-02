import java.util.Scanner;

public class XFXcinema{
    public static void main (String[]args){
        double finalprice = 0;
        Scanner fx = new Scanner(System.in); //creating scanner
        System.out.print("Enter your Age Group (Child/Adult/Senior): ");
        String age = fx.next();
        
        switch (age){ //price set per age group
            case "Child":
                finalprice += 50;
                break;
            case "Adult":  
                finalprice += 250;
                break;
            case "Senior":
                finalprice += 200;
                break; 
                
        }
        
        System.out.print("Enter Language(Nepali/Hindi/English): "); //base fare for language
        String language = fx.next();
        double langprice = 0;
        switch (language){
            case "Hindi":
                langprice = 50;
                break;
            case "English":
                langprice = 100;
                break;
        }
        double Initialprice = finalprice + langprice; //age group + language
        System.out.println("Initialprice: " +  finalprice );
        
        System.out.println("Are you a student(Yes / No)?"); //condition for discount
        String id = fx.next();
        if (id.equals("Yes")){ 
            double discount =0.2 * Initialprice;
            Initialprice = Initialprice-discount; 
            System.out.println("Student Discount(20%): " + discount);
        }
        
        System.out.println("--Happy Dashain-- "); //festival discount
            double festivaldiscount = Initialprice *0.15;
            Initialprice = Initialprice - festivaldiscount;
            System.out.println("Dashain Discount(15%):"+festivaldiscount);
            
        System.out.print("Final Ticket Price: "+ Initialprice);   
    }
    
}