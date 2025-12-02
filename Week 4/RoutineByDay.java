import java.util.Scanner;
public class RoutineByDay{
    public static void main (String[]args){
        Scanner rbd = new Scanner(System.in);
        System.out.println("-------------Routine-------------");
        System.out.println ("Which day is it?: ");
        String day = rbd.next(); //asking for day
        System.out.println("Routine for " + day+ "\n");

        
        switch (day){ //using switch casee
            case "sunday":
                System.out.println("Lecure: Programming & Computer Hardware Software Architecture");
                break;
            
                case "monday": 
                System.out.println("Lecure: Introduction to Information Systems & Logic");
                break;
                
                case "tuesday":
                    System.out.println("Tutorial: Programming & Computer Hardware Software Architecture");
                break;
                
                case "wednesday":
                    System.out.println("Tutorial & workshop: Logic & Computer Hardware Software Architecture");
                break;
                
                case "thursday":
                    System.out.println("Tutorial & workshop: Intrpduction to Information Systems & Programming");
                break;
                
                case "friday":
                    System.out.println("Workshop: Introduction to information systems & Logic");
                break;
                
                case "saturday":
                    System.out.println("Holiday");
                break;
                
                
        }
    }
}
